package net.sf.scuba.tlv;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.util.Hex;
import s3.b;

/* loaded from: classes2.dex */
class TLVOutputState {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba.tlv");
    private boolean isAtStartOfLength;
    private boolean isAtStartOfTag;
    private boolean isReadingValue;
    private Deque<TLVStruct> state;

    public class TLVStruct {
        private boolean isLengthSet;
        private int length;
        private int tag;
        private ByteArrayOutputStream value;

        public TLVStruct(TLVOutputState tLVOutputState, TLVStruct tLVStruct) {
            this(tLVStruct.tag, tLVStruct.length, tLVStruct.isLengthSet, tLVStruct.getValue());
        }

        public int getLength() {
            return this.length;
        }

        public int getTag() {
            return this.tag;
        }

        public byte[] getValue() {
            return this.value.toByteArray();
        }

        public int getValueBytesProcessed() {
            return this.value.size();
        }

        public boolean isLengthSet() {
            return this.isLengthSet;
        }

        public void setLength(int i) {
            this.length = i;
            this.isLengthSet = true;
        }

        public String toString() {
            byte[] byteArray = this.value.toByteArray();
            StringBuilder sb2 = new StringBuilder("[TLVStruct ");
            sb2.append(Integer.toHexString(this.tag));
            sb2.append(", ");
            sb2.append(this.isLengthSet ? Integer.valueOf(this.length) : "UNDEFINED");
            sb2.append(", ");
            sb2.append(Hex.bytesToHexString(byteArray));
            sb2.append("(");
            return b.m(sb2, byteArray.length, ") ]");
        }

        public void write(byte[] bArr, int i, int i9) {
            this.value.write(bArr, i, i9);
        }

        public TLVStruct(TLVOutputState tLVOutputState, int i) {
            this(i, Integer.MAX_VALUE, false, null);
        }

        public TLVStruct(int i, int i9, boolean z10, byte[] bArr) {
            this.tag = i;
            this.length = i9;
            this.isLengthSet = z10;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.value = byteArrayOutputStream;
            if (bArr != null) {
                try {
                    byteArrayOutputStream.write(bArr);
                } catch (IOException e10) {
                    TLVOutputState.LOGGER.log(Level.FINE, "Exception writing bytes in memory", (Throwable) e10);
                }
            }
        }
    }

    public TLVOutputState() {
        this(new ArrayDeque(), true, false, false);
    }

    private Deque<TLVStruct> getDeepCopyOfState() {
        ArrayDeque arrayDeque = new ArrayDeque(this.state.size());
        Iterator<TLVStruct> it = this.state.iterator();
        while (it.hasNext()) {
            arrayDeque.add(new TLVStruct(this, it.next()));
        }
        return arrayDeque;
    }

    public boolean canBeWritten() {
        Iterator<TLVStruct> it = this.state.iterator();
        while (it.hasNext()) {
            if (!it.next().isLengthSet()) {
                return false;
            }
        }
        return true;
    }

    public int getLength() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        int length = this.state.peek().getLength();
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Length not yet knwon.");
    }

    public int getTag() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Tag not yet read.");
        }
        return this.state.peek().getTag();
    }

    public byte[] getValue() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Cannot get value yet.");
        }
        return this.state.peek().getValue();
    }

    public int getValueBytesLeft() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length of value is unknown.");
        }
        TLVStruct peek = this.state.peek();
        return peek.getLength() - peek.getValueBytesProcessed();
    }

    public int getValueBytesProcessed() {
        return this.state.peek().getValueBytesProcessed();
    }

    public boolean isAtStartOfLength() {
        return this.isAtStartOfLength;
    }

    public boolean isAtStartOfTag() {
        return this.isAtStartOfTag;
    }

    public boolean isDummyLengthSet() {
        if (this.state.isEmpty()) {
            return false;
        }
        return !this.state.peek().isLengthSet();
    }

    public boolean isProcessingValue() {
        return this.isReadingValue;
    }

    public void setDummyLengthProcessed() {
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setLengthProcessed(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(b.i("Cannot set negative length (length = ", i, ")."));
        }
        TLVStruct pop = this.state.pop();
        if (!this.state.isEmpty()) {
            TLVStruct peek = this.state.peek();
            byte[] lengthAsBytes = TLVUtil.getLengthAsBytes(i);
            peek.write(lengthAsBytes, 0, lengthAsBytes.length);
        }
        pop.setLength(i);
        this.state.push(pop);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setTagProcessed(int i) {
        TLVStruct tLVStruct = new TLVStruct(this, i);
        if (!this.state.isEmpty()) {
            TLVStruct peek = this.state.peek();
            byte[] tagAsBytes = TLVUtil.getTagAsBytes(i);
            peek.write(tagAsBytes, 0, tagAsBytes.length);
        }
        this.state.push(tLVStruct);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = true;
        this.isReadingValue = false;
    }

    public String toString() {
        return this.state.toString();
    }

    public void updatePreviousLength(int i) {
        if (this.state.isEmpty()) {
            return;
        }
        TLVStruct peek = this.state.peek();
        if (peek.isLengthSet && peek.getLength() == i) {
            return;
        }
        peek.setLength(i);
        if (peek.getValueBytesProcessed() == peek.getLength()) {
            this.state.pop();
            byte[] lengthAsBytes = TLVUtil.getLengthAsBytes(i);
            byte[] value = peek.getValue();
            updateValueBytesProcessed(lengthAsBytes, 0, lengthAsBytes.length);
            updateValueBytesProcessed(value, 0, value.length);
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public void updateValueBytesProcessed(byte[] bArr, int i, int i9) {
        if (this.state.isEmpty()) {
            return;
        }
        TLVStruct peek = this.state.peek();
        int length = peek.getLength() - peek.getValueBytesProcessed();
        if (i9 > length) {
            StringBuilder q10 = a.q(i9, length, "Cannot process ", " bytes! Only ", " bytes left in this TLV object ");
            q10.append(peek);
            throw new IllegalArgumentException(q10.toString());
        }
        peek.write(bArr, i, i9);
        if (peek.getValueBytesProcessed() != peek.getLength()) {
            this.isAtStartOfTag = false;
            this.isAtStartOfLength = false;
            this.isReadingValue = true;
        } else {
            this.state.pop();
            updateValueBytesProcessed(peek.getValue(), 0, peek.getLength());
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public TLVOutputState(TLVOutputState tLVOutputState) {
        this(tLVOutputState.getDeepCopyOfState(), tLVOutputState.isAtStartOfTag, tLVOutputState.isAtStartOfLength, tLVOutputState.isReadingValue);
    }

    private TLVOutputState(Deque<TLVStruct> deque, boolean z10, boolean z11, boolean z12) {
        this.state = deque;
        this.isAtStartOfTag = z10;
        this.isAtStartOfLength = z11;
        this.isReadingValue = z12;
    }
}

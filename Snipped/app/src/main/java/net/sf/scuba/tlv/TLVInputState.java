package net.sf.scuba.tlv;

import com.google.android.gms.measurement.internal.a;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import s3.b;

/* loaded from: classes2.dex */
class TLVInputState {
    private boolean isAtStartOfLength;
    private boolean isAtStartOfTag;
    private boolean isReadingValue;
    private Deque<TLStruct> state;

    public class TLStruct {
        private int length;
        private int tag;
        private int valueBytesRead;

        public TLStruct(TLVInputState tLVInputState, int i) {
            this(i, Integer.MAX_VALUE, 0);
        }

        public int getLength() {
            return this.length;
        }

        public int getTag() {
            return this.tag;
        }

        public int getValueBytesProcessed() {
            return this.valueBytesRead;
        }

        public void setLength(int i) {
            this.length = i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[TLStruct ");
            sb2.append(Integer.toHexString(this.tag));
            sb2.append(", ");
            sb2.append(this.length);
            sb2.append(", ");
            return b.m(sb2, this.valueBytesRead, "]");
        }

        public void updateValueBytesProcessed(int i) {
            this.valueBytesRead += i;
        }

        public TLStruct(TLVInputState tLVInputState, TLStruct tLStruct) {
            this(tLStruct.tag, tLStruct.length, tLStruct.valueBytesRead);
        }

        public TLStruct(int i, int i9, int i10) {
            this.tag = i;
            this.length = i9;
            this.valueBytesRead = i10;
        }
    }

    public TLVInputState() {
        this(new ArrayDeque(), true, false, false);
    }

    private Deque<TLStruct> getDeepCopyOfState() {
        ArrayDeque arrayDeque = new ArrayDeque(this.state.size());
        Iterator<TLStruct> it = this.state.iterator();
        while (it.hasNext()) {
            arrayDeque.addLast(new TLStruct(this, it.next()));
        }
        return arrayDeque;
    }

    public int getLength() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        return this.state.peek().getLength();
    }

    public int getTag() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Tag not yet read.");
        }
        return this.state.peek().getTag();
    }

    public int getValueBytesLeft() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length of value is unknown.");
        }
        TLStruct peek = this.state.peek();
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

    public boolean isProcessingValue() {
        return this.isReadingValue;
    }

    public void setDummyLengthProcessed() {
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setLengthProcessed(int i, int i9) {
        if (i < 0) {
            StringBuilder l10 = a.l("Cannot set negative length (length = ", i, ", 0x");
            l10.append(Integer.toHexString(i));
            l10.append(" for tag ");
            l10.append(Integer.toHexString(getTag()));
            l10.append(").");
            throw new IllegalArgumentException(l10.toString());
        }
        TLStruct pop = this.state.pop();
        if (!this.state.isEmpty()) {
            this.state.peek().updateValueBytesProcessed(i9);
        }
        pop.setLength(i);
        this.state.push(pop);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setTagProcessed(int i, int i9) {
        TLStruct tLStruct = new TLStruct(this, i);
        if (!this.state.isEmpty()) {
            this.state.peek().updateValueBytesProcessed(i9);
        }
        this.state.push(tLStruct);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = true;
        this.isReadingValue = false;
    }

    public String toString() {
        return this.state.toString();
    }

    public void updateValueBytesProcessed(int i) {
        if (this.state.isEmpty()) {
            return;
        }
        TLStruct peek = this.state.peek();
        int length = peek.getLength() - peek.getValueBytesProcessed();
        if (i > length) {
            StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, length, "Cannot process ", " bytes! Only ", " bytes left in this TLV object ");
            q10.append(peek);
            throw new IllegalArgumentException(q10.toString());
        }
        peek.updateValueBytesProcessed(i);
        int length2 = peek.getLength();
        if (peek.getValueBytesProcessed() != length2) {
            this.isAtStartOfTag = false;
            this.isAtStartOfLength = false;
            this.isReadingValue = true;
        } else {
            this.state.pop();
            updateValueBytesProcessed(length2);
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public TLVInputState(TLVInputState tLVInputState) {
        this(tLVInputState.getDeepCopyOfState(), tLVInputState.isAtStartOfTag, tLVInputState.isAtStartOfLength, tLVInputState.isReadingValue);
    }

    private TLVInputState(Deque<TLStruct> deque, boolean z10, boolean z11, boolean z12) {
        this.state = deque;
        this.isAtStartOfTag = z10;
        this.isAtStartOfLength = z11;
        this.isReadingValue = z12;
    }
}

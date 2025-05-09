package org.ejbca.cvc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class CVCObject implements Serializable {
    public static final int CVC_VERSION = 0;
    private static final int INT_LENGTH = 4;
    private static final int LONG_LENGTH = 8;
    public static final String NEWLINE = System.getProperty("line.separator");
    private static final long serialVersionUID = 1;
    private AbstractSequence parent;
    private final CVCTagEnum tag;

    public CVCObject(CVCTagEnum cVCTagEnum) {
        this.tag = cVCTagEnum;
    }

    public static int decodeLength(DataInputStream dataInputStream) {
        int read = dataInputStream.read();
        return read > 127 ? (read & 15) == 1 ? dataInputStream.readUnsignedByte() : dataInputStream.readShort() : read;
    }

    public static byte[] encodeLength(int i) {
        int i9 = i > 127 ? i > 255 ? 2 : 1 : 0;
        ByteBuffer allocate = ByteBuffer.allocate(i9 + 1);
        if (i9 == 0) {
            allocate.put(0, (byte) i);
        } else {
            allocate.put(0, (byte) (i9 + 128));
            if (i9 == 1) {
                allocate.put(1, (byte) i);
            } else {
                allocate.putShort(1, (short) i);
            }
        }
        return allocate.array();
    }

    public static byte[] toByteArray(Integer num) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(num.intValue());
        return trimByteArray(allocate.array());
    }

    public static byte[] trimByteArray(byte[] bArr) {
        int i = 0;
        boolean z10 = false;
        while (i < bArr.length) {
            z10 = bArr[i] != 0;
            if (z10) {
                break;
            }
            i++;
        }
        if (!z10) {
            return new byte[]{0};
        }
        byte[] bArr2 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
        return bArr2;
    }

    public abstract int encode(DataOutputStream dataOutputStream);

    public String getAsText() {
        return getAsText("", true);
    }

    public AbstractSequence getParent() {
        return this.parent;
    }

    public CVCTagEnum getTag() {
        return this.tag;
    }

    public void setParent(AbstractSequence abstractSequence) {
        this.parent = abstractSequence;
    }

    public String getAsText(boolean z10) {
        return getAsText("", z10);
    }

    public String getAsText(String str) {
        return getAsText(str, true);
    }

    public static byte[] toByteArray(Long l10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(l10.longValue());
        return trimByteArray(allocate.array());
    }

    public String getAsText(String str, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (z10) {
            stringBuffer.append(Integer.toHexString(getTag().getValue()));
            stringBuffer.append(' ');
        }
        stringBuffer.append(getTag().name());
        stringBuffer.append("  ");
        return stringBuffer.toString();
    }
}

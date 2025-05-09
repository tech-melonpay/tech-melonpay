package net.sf.scuba.smartcards;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CommandAPDU implements Serializable {
    private static final int MAX_APDU_SIZE = 65544;
    private static final long serialVersionUID = 398698301286670877L;
    private byte[] apdu;
    private transient int dataOffset;
    private transient int nc;
    private transient int ne;

    public CommandAPDU(byte[] bArr) {
        this.apdu = (byte[]) bArr.clone();
        parse();
    }

    private static int arrayLength(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    private void checkArrayBounds(byte[] bArr, int i, int i9) {
        if (i < 0 || i9 < 0) {
            throw new IllegalArgumentException("Offset and length must not be negative");
        }
        if (bArr != null) {
            if (i > bArr.length - i9) {
                throw new IllegalArgumentException("Offset plus length exceed array size");
            }
        } else if (i != 0 && i9 != 0) {
            throw new IllegalArgumentException("offset and length must be 0 if array is null");
        }
    }

    private void parse() {
        byte[] bArr = this.apdu;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("apdu must be at least 4 bytes long");
        }
        if (bArr.length == 4) {
            return;
        }
        int i = bArr[4] & 255;
        if (bArr.length == 5) {
            if (i == 0) {
                i = 256;
            }
            this.ne = i;
            return;
        }
        if (i != 0) {
            if (bArr.length == i + 5) {
                this.nc = i;
                this.dataOffset = 5;
                return;
            } else {
                if (bArr.length == i + 6) {
                    this.nc = i;
                    this.dataOffset = 5;
                    int i9 = bArr[bArr.length - 1] & 255;
                    this.ne = i9 != 0 ? i9 : 256;
                    return;
                }
                throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i);
            }
        }
        if (bArr.length < 7) {
            throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i);
        }
        int i10 = ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        if (bArr.length == 7) {
            if (i10 == 0) {
                i10 = 65536;
            }
            this.ne = i10;
            return;
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i + ", b2||b3=" + i10);
        }
        if (bArr.length == i10 + 7) {
            this.nc = i10;
            this.dataOffset = 7;
            return;
        }
        if (bArr.length == i10 + 9) {
            this.nc = i10;
            this.dataOffset = 7;
            int length = bArr.length;
            int i11 = (bArr[length - 1] & 255) | ((bArr[length - 2] & 255) << 8);
            this.ne = i11 != 0 ? i11 : 65536;
            return;
        }
        throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i + ", b2||b3=" + i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.apdu = (byte[]) objectInputStream.readUnshared();
        parse();
    }

    private void setHeader(int i, int i9, int i10, int i11) {
        byte[] bArr = this.apdu;
        bArr[0] = (byte) i;
        bArr[1] = (byte) i9;
        bArr[2] = (byte) i10;
        bArr[3] = (byte) i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandAPDU) {
            return Arrays.equals(this.apdu, ((CommandAPDU) obj).apdu);
        }
        return false;
    }

    public byte[] getBytes() {
        return (byte[]) this.apdu.clone();
    }

    public int getCLA() {
        return this.apdu[0] & 255;
    }

    public byte[] getData() {
        int i = this.nc;
        byte[] bArr = new byte[i];
        System.arraycopy(this.apdu, this.dataOffset, bArr, 0, i);
        return bArr;
    }

    public int getINS() {
        return this.apdu[1] & 255;
    }

    public int getNc() {
        return this.nc;
    }

    public int getNe() {
        return this.ne;
    }

    public int getP1() {
        return this.apdu[2] & 255;
    }

    public int getP2() {
        return this.apdu[3] & 255;
    }

    public int hashCode() {
        return Arrays.hashCode(this.apdu);
    }

    public String toString() {
        return "CommmandAPDU: " + this.apdu.length + " bytes, nc=" + this.nc + ", ne=" + this.ne;
    }

    public CommandAPDU(byte[] bArr, int i, int i9) {
        checkArrayBounds(bArr, i, i9);
        byte[] bArr2 = new byte[i9];
        this.apdu = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i9);
        parse();
    }

    public CommandAPDU(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.apdu = bArr;
        byteBuffer.get(bArr);
        parse();
    }

    public CommandAPDU(int i, int i9, int i10, int i11) {
        this(i, i9, i10, i11, null, 0, 0, 0);
    }

    public CommandAPDU(int i, int i9, int i10, int i11, int i12) {
        this(i, i9, i10, i11, null, 0, 0, i12);
    }

    public CommandAPDU(int i, int i9, int i10, int i11, byte[] bArr) {
        this(i, i9, i10, i11, bArr, 0, arrayLength(bArr), 0);
    }

    public CommandAPDU(int i, int i9, int i10, int i11, byte[] bArr, int i12, int i13) {
        this(i, i9, i10, i11, bArr, i12, i13, 0);
    }

    public CommandAPDU(int i, int i9, int i10, int i11, byte[] bArr, int i12) {
        this(i, i9, i10, i11, bArr, 0, arrayLength(bArr), i12);
    }

    public CommandAPDU(int i, int i9, int i10, int i11, byte[] bArr, int i12, int i13, int i14) {
        byte b9;
        checkArrayBounds(bArr, i12, i13);
        if (i13 > 65535) {
            throw new IllegalArgumentException("dataLength is too large");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("ne must not be negative");
        }
        if (i14 <= 65536) {
            this.ne = i14;
            this.nc = i13;
            if (i13 == 0) {
                if (i14 == 0) {
                    this.apdu = new byte[4];
                    setHeader(i, i9, i10, i11);
                    return;
                }
                if (i14 <= 256) {
                    r9 = i14 != 256 ? (byte) i14 : (byte) 0;
                    this.apdu = new byte[5];
                    setHeader(i, i9, i10, i11);
                    this.apdu[4] = r9;
                    return;
                }
                if (i14 == 65536) {
                    b9 = 0;
                } else {
                    r9 = (byte) (i14 >> 8);
                    b9 = (byte) i14;
                }
                this.apdu = new byte[7];
                setHeader(i, i9, i10, i11);
                byte[] bArr2 = this.apdu;
                bArr2[5] = r9;
                bArr2[6] = b9;
                return;
            }
            if (i14 == 0) {
                if (i13 <= 255) {
                    this.apdu = new byte[i13 + 5];
                    setHeader(i, i9, i10, i11);
                    byte[] bArr3 = this.apdu;
                    bArr3[4] = (byte) i13;
                    this.dataOffset = 5;
                    System.arraycopy(bArr, i12, bArr3, 5, i13);
                    return;
                }
                this.apdu = new byte[i13 + 7];
                setHeader(i, i9, i10, i11);
                byte[] bArr4 = this.apdu;
                bArr4[4] = 0;
                bArr4[5] = (byte) (i13 >> 8);
                bArr4[6] = (byte) i13;
                this.dataOffset = 7;
                System.arraycopy(bArr, i12, bArr4, 7, i13);
                return;
            }
            if (i13 <= 255 && i14 <= 256) {
                this.apdu = new byte[i13 + 6];
                setHeader(i, i9, i10, i11);
                byte[] bArr5 = this.apdu;
                bArr5[4] = (byte) i13;
                this.dataOffset = 5;
                System.arraycopy(bArr, i12, bArr5, 5, i13);
                this.apdu[r1.length - 1] = i14 != 256 ? (byte) i14 : (byte) 0;
                return;
            }
            this.apdu = new byte[i13 + 9];
            setHeader(i, i9, i10, i11);
            byte[] bArr6 = this.apdu;
            bArr6[4] = 0;
            bArr6[5] = (byte) (i13 >> 8);
            bArr6[6] = (byte) i13;
            this.dataOffset = 7;
            System.arraycopy(bArr, i12, bArr6, 7, i13);
            if (i14 != 65536) {
                byte[] bArr7 = this.apdu;
                int length = bArr7.length;
                bArr7[length - 2] = (byte) (i14 >> 8);
                bArr7[length - 1] = (byte) i14;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ne is too large");
    }
}

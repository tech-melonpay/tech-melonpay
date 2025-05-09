package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int readU32 = readU32();
        int i = this.pos;
        int i9 = i + readU32;
        byte[] bArr = this.buffer;
        if (i9 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i10 = readU32 + i;
        this.pos = i10;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i, i10));
    }

    public byte[] readBlock() {
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i = this.pos;
        byte[] bArr = this.buffer;
        if (i > bArr.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i9 = readU32 + i;
        this.pos = i9;
        return Arrays.copyOfRange(bArr, i, i9);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        if (i > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.pos = i + 4;
        return (bArr[i9] & 255) | i10;
    }

    public void skipBlock() {
        int readU32 = readU32();
        int i = this.pos;
        if (i > this.buffer.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i + readU32;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i) {
        int i9;
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i10 = this.pos;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (readU32 % i != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i11 = i10 + readU32;
        this.pos = i11;
        if (readU32 > 0 && (i9 = bArr[i11 - 1] & 255) > 0 && i9 < i) {
            i11 -= i9;
            int i12 = 1;
            int i13 = i11;
            while (i12 <= i9) {
                if (i12 != (this.buffer[i13] & 255)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i12++;
                i13++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i10, i11);
    }
}

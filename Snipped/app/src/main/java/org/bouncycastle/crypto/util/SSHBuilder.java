package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
class SSHBuilder {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    public byte[] getBytes() {
        return this.bos.toByteArray();
    }

    public byte[] getPaddedBytes() {
        return getPaddedBytes(8);
    }

    public void u32(int i) {
        this.bos.write((i >>> 24) & 255);
        this.bos.write((i >>> 16) & 255);
        this.bos.write((i >>> 8) & 255);
        this.bos.write(i & 255);
    }

    public void writeBigNum(BigInteger bigInteger) {
        writeBlock(bigInteger.toByteArray());
    }

    public void writeBlock(byte[] bArr) {
        u32(bArr.length);
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeBytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeString(String str) {
        writeBlock(Strings.toByteArray(str));
    }

    public byte[] getPaddedBytes(int i) {
        int size = this.bos.size() % i;
        if (size != 0) {
            int i9 = i - size;
            for (int i10 = 1; i10 <= i9; i10++) {
                this.bos.write(i10);
            }
        }
        return this.bos.toByteArray();
    }
}

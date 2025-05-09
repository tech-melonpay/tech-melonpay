package org.bouncycastle.oer;

import java.io.OutputStream;
import java.math.BigInteger;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class BitBuilder {
    private static final byte[] bits = {ISOFileInfo.DATA_BYTES1, 64, ISO7816.INS_VERIFY, 16, 8, 4, 2, 1};
    byte[] buf = new byte[1];
    int pos = 0;

    public void finalize() {
        zero();
        super.finalize();
    }

    public void pad() {
        int i = this.pos;
        this.pos = (i % 8) + i;
    }

    public int write(OutputStream outputStream) {
        int i = this.pos;
        int i9 = ((i % 8) + i) / 8;
        outputStream.write(this.buf, 0, i9);
        outputStream.flush();
        return i9;
    }

    public void write7BitBytes(int i) {
        boolean z10 = false;
        for (int i9 = 4; i9 >= 0; i9--) {
            if (!z10 && ((-33554432) & i) != 0) {
                z10 = true;
            }
            if (z10) {
                writeBit(i9).writeBits(i, 32, 7);
            }
            i <<= 7;
        }
    }

    public int writeAndClear(OutputStream outputStream) {
        int i = this.pos;
        int i9 = ((i % 8) + i) / 8;
        outputStream.write(this.buf, 0, i9);
        outputStream.flush();
        zero();
        return i9;
    }

    public BitBuilder writeBit(int i) {
        int i9 = this.pos;
        int i10 = i9 / 8;
        byte[] bArr = this.buf;
        if (i10 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i9 / 8);
            Arrays.clear(this.buf);
            this.buf = bArr2;
        }
        if (i == 0) {
            byte[] bArr3 = this.buf;
            int i11 = this.pos;
            int i12 = i11 / 8;
            bArr3[i12] = (byte) ((~bits[i11 % 8]) & bArr3[i12]);
        } else {
            byte[] bArr4 = this.buf;
            int i13 = this.pos;
            int i14 = i13 / 8;
            bArr4[i14] = (byte) (bits[i13 % 8] | bArr4[i14]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j10, int i) {
        for (int i9 = i - 1; i9 >= 0; i9--) {
            writeBit(((1 << i9) & j10) > 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.buf);
        this.pos = 0;
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() % 8) + bigInteger.bitLength()) / 8;
        BigInteger shiftLeft = BigInteger.valueOf(254L).shiftLeft(bitLength * 8);
        boolean z10 = false;
        while (bitLength >= 0) {
            if (!z10 && bigInteger.and(shiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z10 = true;
            }
            if (z10) {
                writeBit(bitLength).writeBits(bigInteger.and(shiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            bitLength--;
        }
    }

    public BitBuilder writeBits(long j10, int i, int i9) {
        for (int i10 = i - 1; i10 >= i - i9; i10--) {
            writeBit(((1 << i10) & j10) != 0 ? 1 : 0);
        }
        return this;
    }
}

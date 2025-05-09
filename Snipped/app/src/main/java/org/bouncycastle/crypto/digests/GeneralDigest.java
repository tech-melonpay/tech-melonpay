package org.bouncycastle.crypto.digests;

import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    public GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    public void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    public void finish() {
        long j10 = this.byteCount << 3;
        byte b9 = ISOFileInfo.DATA_BYTES1;
        while (true) {
            update(b9);
            if (this.xBufOff == 0) {
                processLength(j10);
                processBlock();
                return;
            }
            b9 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }

    public abstract void processBlock();

    public abstract void processLength(long j10);

    public abstract void processWord(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i9 = i + 1;
        this.xBufOff = i9;
        bArr[i] = b9;
        if (i9 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        copyIn(generalDigest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        int i10 = 0;
        int max = Math.max(0, i9);
        if (this.xBufOff != 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= max) {
                    i10 = i11;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i12 = this.xBufOff;
                int i13 = i12 + 1;
                this.xBufOff = i13;
                int i14 = i11 + 1;
                bArr2[i12] = bArr[i11 + i];
                if (i13 == 4) {
                    processWord(bArr2, 0);
                    this.xBufOff = 0;
                    i10 = i14;
                    break;
                }
                i11 = i14;
            }
        }
        int i15 = ((max - i10) & (-4)) + i10;
        while (i10 < i15) {
            processWord(bArr, i + i10);
            i10 += 4;
        }
        while (i10 < max) {
            byte[] bArr3 = this.xBuf;
            int i16 = this.xBufOff;
            this.xBufOff = i16 + 1;
            bArr3[i16] = bArr[i10 + i];
            i10++;
        }
        this.byteCount += max;
    }

    public GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.xBuf = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }
}

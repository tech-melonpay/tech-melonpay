package org.bouncycastle.crypto.engines;

import com.google.android.gms.measurement.internal.a;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.util.Memoable;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public class Zuc256CoreEngine extends Zuc128CoreEngine {
    private byte[] theD;
    private static final byte[] EK_d = {ISO7816.INS_MSE, 47, ISO7816.INS_CHANGE_CHV, ISO7816.INS_PSO, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, ISO7816.INS_DECREASE};
    private static final byte[] EK_d32 = {ISO7816.INS_MSE, 47, 37, ISO7816.INS_PSO, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, ISO7816.INS_DECREASE};
    private static final byte[] EK_d64 = {35, 47, ISO7816.INS_CHANGE_CHV, ISO7816.INS_PSO, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, ISO7816.INS_DECREASE};
    private static final byte[] EK_d128 = {35, 47, 37, ISO7816.INS_PSO, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, ISO7816.INS_DECREASE};

    public Zuc256CoreEngine() {
        this.theD = EK_d;
    }

    private static int MAKEU31(byte b9, byte b10, byte b11, byte b12) {
        return ((b9 & 255) << 23) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc256CoreEngine(this);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    public int getMaxIterations() {
        return 625;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.reset(memoable);
        this.theD = ((Zuc256CoreEngine) memoable).theD;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    public void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = MAKEU31(bArr[0], this.theD[0], bArr[21], bArr[16]);
        iArr[1] = MAKEU31(bArr[1], this.theD[1], bArr[22], bArr[17]);
        iArr[2] = MAKEU31(bArr[2], this.theD[2], bArr[23], bArr[18]);
        iArr[3] = MAKEU31(bArr[3], this.theD[3], bArr[24], bArr[19]);
        iArr[4] = MAKEU31(bArr[4], this.theD[4], bArr[25], bArr[20]);
        iArr[5] = MAKEU31(bArr2[0], (byte) (this.theD[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = MAKEU31(bArr2[1], (byte) (this.theD[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = MAKEU31(bArr2[10], (byte) (this.theD[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = MAKEU31(bArr[8], (byte) (this.theD[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = MAKEU31(bArr[9], (byte) ((bArr2[21] & 63) | this.theD[9]), bArr2[12], bArr2[4]);
        iArr[10] = MAKEU31(bArr2[5], (byte) (this.theD[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = MAKEU31(bArr[11], (byte) (this.theD[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = MAKEU31(bArr[12], (byte) (this.theD[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = MAKEU31(bArr[13], this.theD[13], bArr2[15], bArr2[8]);
        iArr[14] = MAKEU31(bArr[14], (byte) (this.theD[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = MAKEU31(bArr[15], (byte) (this.theD[15] | (bArr[31] & PassportService.SFI_DG15)), bArr[30], bArr[29]);
    }

    public Zuc256CoreEngine(int i) {
        if (i == 32) {
            this.theD = EK_d32;
        } else if (i == 64) {
            this.theD = EK_d64;
        } else {
            if (i != 128) {
                throw new IllegalArgumentException(a.g(i, "Unsupported length: "));
            }
            this.theD = EK_d128;
        }
    }

    public Zuc256CoreEngine(Zuc256CoreEngine zuc256CoreEngine) {
        super(zuc256CoreEngine);
    }
}

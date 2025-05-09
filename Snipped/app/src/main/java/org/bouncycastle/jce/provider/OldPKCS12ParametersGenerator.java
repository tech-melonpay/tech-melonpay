package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* renamed from: u, reason: collision with root package name */
    private int f25162u;

    /* renamed from: v, reason: collision with root package name */
    private int f25163v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.f25162u = 16;
        } else {
            if (!(digest instanceof SHA1Digest) && !(digest instanceof RIPEMD160Digest)) {
                throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
            }
            this.f25162u = 20;
        }
        this.f25163v = 64;
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i9 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i9;
        int i10 = i9 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i11 = i + length;
            int i12 = (bArr2[length] & 255) + (bArr[i11] & 255) + i10;
            bArr[i11] = (byte) i12;
            i10 = i12 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i9) {
        byte[] bArr;
        byte[] bArr2;
        int i10;
        int i11 = this.f25163v;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i9];
        int i12 = 0;
        for (int i13 = 0; i13 != i11; i13++) {
            bArr3[i13] = (byte) i;
        }
        byte[] bArr5 = this.salt;
        int i14 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i15 = this.f25163v;
            int length = (((bArr5.length + i15) - 1) / i15) * i15;
            bArr = new byte[length];
            for (int i16 = 0; i16 != length; i16++) {
                byte[] bArr6 = this.salt;
                bArr[i16] = bArr6[i16 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i17 = this.f25163v;
            int length2 = (((bArr7.length + i17) - 1) / i17) * i17;
            bArr2 = new byte[length2];
            for (int i18 = 0; i18 != length2; i18++) {
                byte[] bArr8 = this.password;
                bArr2[i18] = bArr8[i18 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i19 = this.f25163v;
        byte[] bArr10 = new byte[i19];
        int i20 = this.f25162u;
        int i21 = ((i9 + i20) - 1) / i20;
        int i22 = 1;
        while (i22 <= i21) {
            int i23 = this.f25162u;
            byte[] bArr11 = new byte[i23];
            this.digest.update(bArr3, i12, i11);
            this.digest.update(bArr9, i12, length3);
            this.digest.doFinal(bArr11, i12);
            for (int i24 = i14; i24 != this.iterationCount; i24++) {
                this.digest.update(bArr11, i12, i23);
                this.digest.doFinal(bArr11, i12);
            }
            for (int i25 = i12; i25 != i19; i25++) {
                bArr10[i22] = bArr11[i25 % i23];
            }
            int i26 = i12;
            while (true) {
                int i27 = this.f25163v;
                if (i26 == length3 / i27) {
                    break;
                }
                adjust(bArr9, i27 * i26, bArr10);
                i26++;
            }
            if (i22 == i21) {
                int i28 = i22 - 1;
                int i29 = this.f25162u;
                int i30 = i28 * i29;
                int i31 = i9 - (i28 * i29);
                i10 = 0;
                System.arraycopy(bArr11, 0, bArr4, i30, i31);
            } else {
                i10 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i22 - 1) * this.f25162u, i23);
            }
            i22++;
            i12 = i10;
            i14 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        int i9 = i / 8;
        return new KeyParameter(generateDerivedKey(3, i9), 0, i9);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i9 = i / 8;
        return new KeyParameter(generateDerivedKey(1, i9), 0, i9);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i9) {
        int i10 = i / 8;
        int i11 = i9 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i10);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i10), generateDerivedKey(2, i11), 0, i11);
    }
}

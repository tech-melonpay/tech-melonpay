package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class SIG {

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f25455r;
    private final SIG_FORS[] sig_fors;
    private final SIG_XMSS[] sig_ht;

    public SIG(int i, int i9, int i10, int i11, int i12, int i13, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f25455r = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.sig_fors = new SIG_FORS[i9];
        int i14 = i;
        for (int i15 = 0; i15 != i9; i15++) {
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArr, i14, bArr3, 0, i);
            i14 += i;
            byte[][] bArr4 = new byte[i10][];
            for (int i16 = 0; i16 != i10; i16++) {
                byte[] bArr5 = new byte[i];
                bArr4[i16] = bArr5;
                System.arraycopy(bArr, i14, bArr5, 0, i);
                i14 += i;
            }
            this.sig_fors[i15] = new SIG_FORS(bArr3, bArr4);
        }
        this.sig_ht = new SIG_XMSS[i11];
        for (int i17 = 0; i17 != i11; i17++) {
            int i18 = i13 * i;
            byte[] bArr6 = new byte[i18];
            System.arraycopy(bArr, i14, bArr6, 0, i18);
            i14 += i18;
            byte[][] bArr7 = new byte[i12][];
            for (int i19 = 0; i19 != i12; i19++) {
                byte[] bArr8 = new byte[i];
                bArr7[i19] = bArr8;
                System.arraycopy(bArr, i14, bArr8, 0, i);
                i14 += i;
            }
            this.sig_ht[i17] = new SIG_XMSS(bArr6, bArr7);
        }
        if (i14 != bArr.length) {
            throw new IllegalArgumentException("signature wrong length");
        }
    }

    public byte[] getR() {
        return this.f25455r;
    }

    public SIG_FORS[] getSIG_FORS() {
        return this.sig_fors;
    }

    public SIG_XMSS[] getSIG_HT() {
        return this.sig_ht;
    }
}

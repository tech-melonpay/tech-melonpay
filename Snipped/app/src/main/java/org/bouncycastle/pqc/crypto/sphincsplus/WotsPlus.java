package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* renamed from: w, reason: collision with root package name */
    private final int f25461w;

    public WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f25461w = sPHINCSPlusEngine.WOTS_W;
    }

    public int[] base_w(byte[] bArr, int i, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            if (i10 == 0) {
                i13 = bArr[i11];
                i11++;
                i10 += 8;
            }
            i10 -= this.engine.WOTS_LOGW;
            iArr[i12] = (i13 >>> i10) & (i - 1);
            i12++;
        }
        return iArr;
    }

    public byte[] chain(byte[] bArr, int i, int i9, byte[] bArr2, ADRS adrs) {
        if (i9 == 0) {
            return Arrays.clone(bArr);
        }
        int i10 = i + i9;
        if (i10 > this.f25461w - 1) {
            return null;
        }
        byte[] chain = chain(bArr, i, i9 - 1, bArr2, adrs);
        adrs.setHashAddress(i10 - 1);
        return this.engine.F(bArr2, adrs, chain);
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        int[] base_w = base_w(bArr2, this.f25461w, this.engine.WOTS_LEN1);
        int i = 0;
        int i9 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i9 += (this.f25461w - 1) - base_w[i];
            i++;
        }
        int i10 = sPHINCSPlusEngine.WOTS_LEN2;
        int i11 = sPHINCSPlusEngine.WOTS_LOGW;
        int[] concatenate = Arrays.concatenate(base_w, base_w(Arrays.copyOfRange(Pack.intToBigEndian(i9 << (8 - ((i10 * i11) % 8))), 4 - (((i10 * i11) + 7) / 8), 4), this.f25461w, this.engine.WOTS_LEN2));
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine2.f25460N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine2.WOTS_LEN][];
        for (int i12 = 0; i12 < this.engine.WOTS_LEN; i12++) {
            adrs.setChainAddress(i12);
            int i13 = this.engine.f25460N;
            System.arraycopy(bArr, i12 * i13, bArr4, 0, i13);
            int i14 = concatenate[i12];
            bArr5[i12] = chain(bArr4, i14, (this.f25461w - 1) - i14, bArr3, adrs);
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs2, Arrays.concatenate(bArr5));
    }

    public byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        for (int i = 0; i < this.engine.WOTS_LEN; i++) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setChainAddress(i);
            adrs3.setHashAddress(0);
            bArr3[i] = chain(this.engine.PRF(bArr2, bArr, adrs3), 0, this.f25461w - 1, bArr2, adrs3);
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        int[] base_w = base_w(bArr, this.f25461w, this.engine.WOTS_LEN1);
        int i = 0;
        int i9 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i9 += (this.f25461w - 1) - base_w[i];
            i++;
        }
        int i10 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i10 % 8 != 0) {
            i9 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i10) % 8);
        }
        int i11 = ((sPHINCSPlusEngine.WOTS_LEN2 * i10) + 7) / 8;
        byte[] intToBigEndian = Pack.intToBigEndian(i9);
        int[] concatenate = Arrays.concatenate(base_w, base_w(Arrays.copyOfRange(intToBigEndian, i11, intToBigEndian.length), this.f25461w, this.engine.WOTS_LEN2));
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i12 = 0; i12 < this.engine.WOTS_LEN; i12++) {
            adrs2.setChainAddress(i12);
            adrs2.setHashAddress(0);
            bArr4[i12] = chain(this.engine.PRF(bArr3, bArr2, adrs2), 0, concatenate[i12], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}

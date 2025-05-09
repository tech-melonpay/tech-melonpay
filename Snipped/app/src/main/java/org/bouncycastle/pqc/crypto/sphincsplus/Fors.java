package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    public static int[] message_to_idxs(byte[] bArr, int i, int i9) {
        int[] iArr = new int[i];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            iArr[i11] = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                iArr[i11] = iArr[i11] ^ (((bArr[i10 >> 3] >> (i10 & 7)) & 1) << i12);
                i10++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i9 = sPHINCSPlusEngine.f25459K;
        byte[][] bArr4 = new byte[i9][];
        int i10 = sPHINCSPlusEngine.T;
        int[] message_to_idxs = message_to_idxs(bArr, i9, sPHINCSPlusEngine.f25456A);
        int i11 = 0;
        while (i11 < this.engine.f25459K) {
            int i12 = message_to_idxs[i11];
            byte[] sk = sig_forsArr[i11].getSK();
            adrs.setTreeHeight(0);
            int i13 = (i11 * i10) + i12;
            adrs.setTreeIndex(i13);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i11].getAuthPath();
            adrs.setTreeIndex(i13);
            int i14 = 0;
            while (i14 < this.engine.f25456A) {
                int i15 = i14 + 1;
                adrs.setTreeHeight(i15);
                if ((i12 / (1 << i14)) % i == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i14]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i14], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i14 = i15;
                i = 2;
            }
            bArr4[i11] = bArr3[0];
            i11++;
            i = 2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] message_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.f25459K, sPHINCSPlusEngine.f25456A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.f25459K];
        int i = sPHINCSPlusEngine2.T;
        int i9 = 0;
        int i10 = 0;
        while (i10 < fors.engine.f25459K) {
            int i11 = message_to_idxs[i10];
            adrs.setTreeHeight(i9);
            int i12 = i10 * i;
            adrs.setTreeIndex(i12 + i11);
            byte[] PRF = fors.engine.PRF(bArr3, bArr2, adrs);
            byte[][] bArr4 = new byte[fors.engine.f25456A][];
            int i13 = i9;
            while (i13 < fors.engine.f25456A) {
                int i14 = 1 << i13;
                int i15 = i13;
                byte[][] bArr5 = bArr4;
                bArr5[i15] = treehash(bArr2, (((i11 / i14) ^ 1) * i14) + i12, i15, bArr3, adrs);
                i13 = i15 + 1;
                PRF = PRF;
                bArr4 = bArr5;
                fors = this;
            }
            sig_forsArr[i10] = new SIG_FORS(PRF, bArr4);
            i10++;
            i9 = 0;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i, int i9, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i10 = 1 << i9;
        if (i % i10 != 0) {
            return null;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            adrs2.setTreeHeight(0);
            int i12 = i + i11;
            adrs2.setTreeIndex(i12);
            byte[] F10 = this.engine.F(bArr2, adrs2, this.engine.PRF(bArr2, bArr, adrs2));
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i12);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                F10 = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, F10);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(F10, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}

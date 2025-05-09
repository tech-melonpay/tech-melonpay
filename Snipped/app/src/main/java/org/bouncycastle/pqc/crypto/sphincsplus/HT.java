package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class HT {
    SPHINCSPlusEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sPHINCSPlusEngine.f25457D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    public byte[] sign(byte[] bArr, long j10, int i) {
        long j11 = j10;
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        SIG_XMSS xmss_sign = xmss_sign(bArr, this.skSeed, i, this.pkSeed, adrs);
        int i9 = this.engine.f25457D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i9];
        sig_xmssArr[0] = xmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        byte[] xmss_pkFromSig = xmss_pkFromSig(i, xmss_sign, bArr, this.pkSeed, adrs);
        int i10 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
            if (i10 >= sPHINCSPlusEngine.f25457D) {
                break;
            }
            int i11 = (int) (((1 << r0) - 1) & j11);
            j11 >>>= sPHINCSPlusEngine.H_PRIME;
            adrs.setLayerAddress(i10);
            adrs.setTreeAddress(j11);
            SIG_XMSS xmss_sign2 = xmss_sign(xmss_pkFromSig, this.skSeed, i11, this.pkSeed, adrs);
            sig_xmssArr[i10] = xmss_sign2;
            if (i10 < this.engine.f25457D - 1) {
                xmss_pkFromSig = xmss_pkFromSig(i11, xmss_sign2, xmss_pkFromSig, this.pkSeed, adrs);
            }
            i10++;
        }
        byte[][] bArr2 = new byte[i9][];
        for (int i12 = 0; i12 != i9; i12++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i12];
            bArr2[i12] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    public byte[] treehash(byte[] bArr, int i, int i9, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i10 = 1 << i9;
        if (i % i10 != 0) {
            return null;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            adrs2.setType(0);
            int i12 = i + i11;
            adrs2.setKeyPairAddress(i12);
            byte[] pkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setType(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i12);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                pkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, pkGen);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(pkGen, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j10, int i, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        byte[] xmss_pkFromSig = xmss_pkFromSig(i, sig_xmss, bArr, bArr2, adrs);
        int i9 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
            if (i9 >= sPHINCSPlusEngine.f25457D) {
                return Arrays.areEqual(bArr3, xmss_pkFromSig);
            }
            int i10 = (int) (((1 << r0) - 1) & j10);
            j10 >>>= sPHINCSPlusEngine.H_PRIME;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i9];
            adrs.setLayerAddress(i9);
            adrs.setTreeAddress(j10);
            xmss_pkFromSig = xmss_pkFromSig(i10, sig_xmss2, xmss_pkFromSig, bArr2, adrs);
            i9++;
        }
    }

    public byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    public byte[] xmss_pkFromSig(int i, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i9 = 0;
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] pkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setType(2);
        adrs2.setTreeIndex(i);
        while (i9 < this.engine.H_PRIME) {
            int i10 = i9 + 1;
            adrs2.setTreeHeight(i10);
            if ((i / (1 << i9)) % 2 == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                pkFromSig = this.engine.H(bArr2, adrs2, pkFromSig, xmssauth[i9]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                pkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i9], pkFromSig);
            }
            i9 = i10;
        }
        return pkFromSig;
    }

    public SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        for (int i9 = 0; i9 < this.engine.H_PRIME; i9++) {
            int i10 = 1 << i9;
            bArr4[i9] = treehash(bArr2, (1 ^ (i / i10)) * i10, i9, bArr3, adrs);
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i);
        return new SIG_XMSS(this.wots.sign(bArr, bArr2, bArr3, adrs2), bArr4);
    }
}

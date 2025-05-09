package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {

    /* renamed from: K, reason: collision with root package name */
    private int[] f25372K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.f25372K = gMSSPrivateKeyParameters.f25372K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    private void computeAuthPaths(int i) {
        int i9;
        byte[] bArr;
        int i10 = this.index[i];
        int i11 = this.heightOfTrees[i];
        int i12 = this.f25372K[i];
        int i13 = 0;
        while (true) {
            i9 = i11 - i12;
            if (i13 >= i9) {
                break;
            }
            this.currentTreehash[i][i13].updateNextSeed(this.gmssRandom);
            i13++;
        }
        int heightOfPhi = heightOfPhi(i10);
        byte[] bArr2 = new byte[this.mdLength];
        byte[] nextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i]);
        int i14 = (i10 >>> (heightOfPhi + 1)) & 1;
        int i15 = this.mdLength;
        byte[] bArr3 = new byte[i15];
        int i16 = i11 - 1;
        if (heightOfPhi < i16 && i14 == 0) {
            System.arraycopy(this.currentAuthPaths[i][heightOfPhi], 0, bArr3, 0, i15);
        }
        int i17 = this.mdLength;
        byte[] bArr4 = new byte[i17];
        if (heightOfPhi == 0) {
            if (i == this.numLayer - 1) {
                bArr = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
            } else {
                byte[] bArr5 = new byte[i17];
                System.arraycopy(this.currentSeeds[i], 0, bArr5, 0, i17);
                this.gmssRandom.nextSeed(bArr5);
                byte[] leaf = this.upperLeaf[i].getLeaf();
                this.upperLeaf[i].initLeafCalc(bArr5);
                bArr = leaf;
            }
            System.arraycopy(bArr, 0, this.currentAuthPaths[i][0], 0, this.mdLength);
        } else {
            int i18 = i17 << 1;
            byte[] bArr6 = new byte[i18];
            System.arraycopy(this.currentAuthPaths[i][heightOfPhi - 1], 0, bArr6, 0, i17);
            byte[] bArr7 = this.keep[i][(int) Math.floor(r12 / 2)];
            int i19 = this.mdLength;
            System.arraycopy(bArr7, 0, bArr6, i19, i19);
            this.messDigestTrees.update(bArr6, 0, i18);
            this.currentAuthPaths[i][heightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i][heightOfPhi], 0);
            for (int i20 = 0; i20 < heightOfPhi; i20++) {
                if (i20 < i9) {
                    if (this.currentTreehash[i][i20].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i][i20].getFirstNode(), 0, this.currentAuthPaths[i][i20], 0, this.mdLength);
                        this.currentTreehash[i][i20].destroy();
                    } else {
                        System.err.println("Treehash (" + i + "," + i20 + ") not finished when needed in AuthPathComputation");
                    }
                }
                if (i20 < i16 && i20 >= i9) {
                    int i21 = i20 - i9;
                    if (this.currentRetain[i][i21].size() > 0) {
                        System.arraycopy(this.currentRetain[i][i21].lastElement(), 0, this.currentAuthPaths[i][i20], 0, this.mdLength);
                        Vector vector = this.currentRetain[i][i21];
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                if (i20 < i9 && ((1 << i20) * 3) + i10 < this.numLeafs[i]) {
                    this.currentTreehash[i][i20].initialize();
                }
            }
        }
        if (heightOfPhi < i16 && i14 == 0) {
            System.arraycopy(bArr3, 0, this.keep[i][(int) Math.floor(heightOfPhi / 2)], 0, this.mdLength);
        }
        if (i != this.numLayer - 1) {
            this.minTreehash[i] = getMinTreehashIndex(i);
            return;
        }
        for (int i22 = 1; i22 <= i9 / 2; i22++) {
            int minTreehashIndex = getMinTreehashIndex(i);
            if (minTreehashIndex >= 0) {
                try {
                    byte[] bArr8 = new byte[this.mdLength];
                    System.arraycopy(this.currentTreehash[i][minTreehashIndex].getSeedActive(), 0, bArr8, 0, this.mdLength);
                    this.currentTreehash[i][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr8), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
        }
    }

    private int getMinTreehashIndex(int i) {
        int i9 = -1;
        for (int i10 = 0; i10 < this.heightOfTrees[i] - this.f25372K[i]; i10++) {
            if (this.currentTreehash[i][i10].wasInitialized() && !this.currentTreehash[i][i10].wasFinished() && (i9 == -1 || this.currentTreehash[i][i10].getLowestNodeHeight() < this.currentTreehash[i][i9].getLowestNodeHeight())) {
                i9 = i10;
            }
        }
        return i9;
    }

    private int heightOfPhi(int i) {
        if (i == 0) {
            return -1;
        }
        int i9 = 0;
        int i10 = 1;
        while (i % i10 == 0) {
            i10 *= 2;
            i9++;
        }
        return i9 - 1;
    }

    private void nextTree(int i) {
        if (i > 0) {
            int[] iArr = this.index;
            int i9 = i - 1;
            iArr[i9] = iArr[i9] + 1;
            int i10 = i;
            boolean z10 = true;
            do {
                i10--;
                if (this.index[i10] < this.numLeafs[i10]) {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
            } while (i10 > 0);
            if (z10) {
                return;
            }
            this.gmssRandom.nextSeed(this.currentSeeds[i]);
            this.nextRootSig[i9].updateSign();
            if (i > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i11 = i - 2;
                gMSSLeafArr[i11] = gMSSLeafArr[i11].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            gMSSLeafArr2[i9] = gMSSLeafArr2[i9].nextLeaf();
            if (this.minTreehash[i9] >= 0) {
                GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                gMSSLeafArr3[i9] = gMSSLeafArr3[i9].nextLeaf();
                try {
                    this.currentTreehash[i9][this.minTreehash[i9]].update(this.gmssRandom, this.upperTreehashLeaf[i9].getLeaf());
                    this.currentTreehash[i9][this.minTreehash[i9]].wasFinished();
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
            updateNextNextAuthRoot(i);
            this.currentRootSig[i9] = this.nextRootSig[i9].getSig();
            for (int i12 = 0; i12 < this.heightOfTrees[i] - this.f25372K[i]; i12++) {
                Treehash[] treehashArr = this.currentTreehash[i];
                Treehash[][] treehashArr2 = this.nextTreehash;
                treehashArr[i12] = treehashArr2[i9][i12];
                treehashArr2[i9][i12] = this.nextNextRoot[i9].getTreehash()[i12];
            }
            for (int i13 = 0; i13 < this.heightOfTrees[i]; i13++) {
                System.arraycopy(this.nextAuthPaths[i9][i13], 0, this.currentAuthPaths[i][i13], 0, this.mdLength);
                System.arraycopy(this.nextNextRoot[i9].getAuthPath()[i13], 0, this.nextAuthPaths[i9][i13], 0, this.mdLength);
            }
            for (int i14 = 0; i14 < this.f25372K[i] - 1; i14++) {
                Vector[] vectorArr = this.currentRetain[i];
                Vector[][] vectorArr2 = this.nextRetain;
                vectorArr[i14] = vectorArr2[i9][i14];
                vectorArr2[i9][i14] = this.nextNextRoot[i9].getRetain()[i14];
            }
            Vector[] vectorArr3 = this.currentStack;
            Vector[] vectorArr4 = this.nextStack;
            vectorArr3[i] = vectorArr4[i9];
            vectorArr4[i9] = this.nextNextRoot[i9].getStack();
            this.nextRoot[i9] = this.nextNextRoot[i9].getRoot();
            int i15 = this.mdLength;
            byte[] bArr = new byte[i15];
            byte[] bArr2 = new byte[i15];
            System.arraycopy(this.currentSeeds[i9], 0, bArr2, 0, i15);
            this.gmssRandom.nextSeed(bArr2);
            this.gmssRandom.nextSeed(bArr2);
            this.nextRootSig[i9].initSign(this.gmssRandom.nextSeed(bArr2), this.nextRoot[i9]);
            nextKey(i9);
        }
    }

    private void updateKey(int i) {
        computeAuthPaths(i);
        if (i > 0) {
            if (i > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i9 = i - 2;
                gMSSLeafArr[i9] = gMSSLeafArr[i9].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            int i10 = i - 1;
            gMSSLeafArr2[i10] = gMSSLeafArr2[i10].nextLeaf();
            int floor = (int) Math.floor((getNumLeafs(i) * 2) / (this.heightOfTrees[i10] - this.f25372K[i10]));
            int i11 = this.index[i];
            if (i11 % floor == 1) {
                if (i11 > 1 && this.minTreehash[i10] >= 0) {
                    try {
                        this.currentTreehash[i10][this.minTreehash[i10]].update(this.gmssRandom, this.upperTreehashLeaf[i10].getLeaf());
                        this.currentTreehash[i10][this.minTreehash[i10]].wasFinished();
                    } catch (Exception e10) {
                        System.out.println(e10);
                    }
                }
                this.minTreehash[i10] = getMinTreehashIndex(i10);
                int i12 = this.minTreehash[i10];
                if (i12 >= 0) {
                    this.upperTreehashLeaf[i10] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i10], floor, this.currentTreehash[i10][i12].getSeedActive());
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i10] = gMSSLeafArr3[i10].nextLeaf();
                }
            } else if (this.minTreehash[i10] >= 0) {
                GMSSLeaf[] gMSSLeafArr4 = this.upperTreehashLeaf;
                gMSSLeafArr4[i10] = gMSSLeafArr4[i10].nextLeaf();
            }
            this.nextRootSig[i10].updateSign();
            if (this.index[i] == 1) {
                this.nextNextRoot[i10].initialize(new Vector());
            }
            updateNextNextAuthRoot(i);
        }
    }

    private void updateNextNextAuthRoot(int i) {
        byte[] bArr = new byte[this.mdLength];
        int i9 = i - 1;
        byte[] nextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i9]);
        if (i == this.numLayer - 1) {
            this.nextNextRoot[i9].update(this.nextNextSeeds[i9], new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
        } else {
            this.nextNextRoot[i9].update(this.nextNextSeeds[i9], this.nextNextLeaf[i9].getLeaf());
            this.nextNextLeaf[i9].initLeafCalc(this.nextNextSeeds[i9]);
        }
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public int getIndex(int i) {
        return this.index[i];
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i) {
        return this.numLeafs[i];
    }

    public byte[] getSubtreeRootSig(int i) {
        return this.currentRootSig[i];
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        super(true, gMSSParameters);
        this.used = false;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssPS = gMSSParameters;
        this.otsIndex = gMSSParameters.getWinternitzParameter();
        this.f25372K = gMSSParameters.getK();
        this.heightOfTrees = gMSSParameters.getHeightOfTrees();
        int numOfLayers = this.gmssPS.getNumOfLayers();
        this.numLayer = numOfLayers;
        if (iArr == null) {
            this.index = new int[numOfLayers];
            for (int i = 0; i < this.numLayer; i++) {
                this.index[i] = 0;
            }
        } else {
            this.index = iArr;
        }
        this.currentSeeds = bArr;
        this.nextNextSeeds = bArr2;
        this.currentAuthPaths = Arrays.clone(bArr3);
        this.nextAuthPaths = bArr4;
        int i9 = 2;
        if (bArr5 == null) {
            this.keep = new byte[this.numLayer][][];
            int i10 = 0;
            while (i10 < this.numLayer) {
                this.keep[i10] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, (int) Math.floor(this.heightOfTrees[i10] / i9), this.mdLength);
                i10++;
                i9 = 2;
            }
        } else {
            this.keep = bArr5;
        }
        if (vectorArr == null) {
            this.currentStack = new Vector[this.numLayer];
            for (int i11 = 0; i11 < this.numLayer; i11++) {
                this.currentStack[i11] = new Vector();
            }
        } else {
            this.currentStack = vectorArr;
        }
        if (vectorArr2 == null) {
            this.nextStack = new Vector[this.numLayer - 1];
            int i12 = 0;
            for (int i13 = 1; i12 < this.numLayer - i13; i13 = 1) {
                this.nextStack[i12] = new Vector();
                i12++;
            }
        } else {
            this.nextStack = vectorArr2;
        }
        this.currentTreehash = treehashArr;
        this.nextTreehash = treehashArr2;
        this.currentRetain = vectorArr3;
        this.nextRetain = vectorArr4;
        this.nextRoot = bArr6;
        this.digestProvider = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.nextNextRoot = new GMSSRootCalc[this.numLayer - 1];
            int i14 = 0;
            for (int i15 = 1; i14 < this.numLayer - i15; i15 = 1) {
                int i16 = i14 + 1;
                this.nextNextRoot[i14] = new GMSSRootCalc(this.heightOfTrees[i16], this.f25372K[i16], this.digestProvider);
                i14 = i16;
            }
        } else {
            this.nextNextRoot = gMSSRootCalcArr;
        }
        this.currentRootSig = bArr7;
        this.numLeafs = new int[this.numLayer];
        for (int i17 = 0; i17 < this.numLayer; i17++) {
            this.numLeafs[i17] = 1 << this.heightOfTrees[i17];
        }
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
        int i18 = this.numLayer;
        if (i18 <= 1) {
            this.nextNextLeaf = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.nextNextLeaf = new GMSSLeaf[i18 - 2];
            int i19 = 0;
            while (i19 < this.numLayer - 2) {
                int i20 = i19 + 1;
                this.nextNextLeaf[i19] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i20], this.numLeafs[i19 + 2], this.nextNextSeeds[i19]);
                i19 = i20;
            }
        } else {
            this.nextNextLeaf = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.upperLeaf = new GMSSLeaf[this.numLayer - 1];
            int i21 = 0;
            for (int i22 = 1; i21 < this.numLayer - i22; i22 = 1) {
                int i23 = i21 + 1;
                this.upperLeaf[i21] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i21], this.numLeafs[i23], this.currentSeeds[i21]);
                i21 = i23;
            }
        } else {
            this.upperLeaf = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.upperTreehashLeaf = new GMSSLeaf[this.numLayer - 1];
            int i24 = 0;
            for (int i25 = 1; i24 < this.numLayer - i25; i25 = 1) {
                int i26 = i24 + 1;
                this.upperTreehashLeaf[i24] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i24], this.numLeafs[i26]);
                i24 = i26;
            }
        } else {
            this.upperTreehashLeaf = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.minTreehash = new int[this.numLayer - 1];
            int i27 = 0;
            for (int i28 = 1; i27 < this.numLayer - i28; i28 = 1) {
                this.minTreehash[i27] = -1;
                i27++;
            }
        } else {
            this.minTreehash = iArr2;
        }
        int i29 = this.mdLength;
        byte[] bArr8 = new byte[i29];
        byte[] bArr9 = new byte[i29];
        if (gMSSRootSigArr != null) {
            this.nextRootSig = gMSSRootSigArr;
            return;
        }
        this.nextRootSig = new GMSSRootSig[this.numLayer - 1];
        int i30 = 0;
        while (i30 < this.numLayer - 1) {
            System.arraycopy(bArr[i30], 0, bArr8, 0, this.mdLength);
            this.gmssRandom.nextSeed(bArr8);
            byte[] nextSeed = this.gmssRandom.nextSeed(bArr8);
            int i31 = i30 + 1;
            this.nextRootSig[i30] = new GMSSRootSig(gMSSDigestProvider.get(), this.otsIndex[i30], this.heightOfTrees[i31]);
            this.nextRootSig[i30].initSign(nextSeed, bArr6[i30]);
            i30 = i31;
        }
    }

    private void nextKey(int i) {
        int i9 = this.numLayer;
        if (i == i9 - 1) {
            int[] iArr = this.index;
            iArr[i] = iArr[i] + 1;
        }
        if (this.index[i] != this.numLeafs[i]) {
            updateKey(i);
        } else if (i9 != 1) {
            nextTree(i);
            this.index[i] = 0;
        }
    }

    public int[] getIndex() {
        return this.index;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }
}

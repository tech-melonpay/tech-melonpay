package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

/* loaded from: classes3.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";

    /* renamed from: K, reason: collision with root package name */
    private int[] f25368K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i;
        int i9;
        if (!this.initialized) {
            initializeDefault();
        }
        int i10 = this.numLayer;
        byte[][][] bArr = new byte[i10][][];
        byte[][][] bArr2 = new byte[i10 - 1][][];
        Treehash[][] treehashArr = new Treehash[i10][];
        Treehash[][] treehashArr2 = new Treehash[i10 - 1][];
        Vector[] vectorArr = new Vector[i10];
        Vector[] vectorArr2 = new Vector[i10 - 1];
        Vector[][] vectorArr3 = new Vector[i10][];
        int i11 = 1;
        Vector[][] vectorArr4 = new Vector[i10 - 1][];
        char c2 = 0;
        int i12 = 0;
        while (true) {
            i = this.numLayer;
            if (i12 >= i) {
                break;
            }
            int i13 = this.heightOfTrees[i12];
            int[] iArr = new int[2];
            iArr[1] = this.mdLength;
            iArr[c2] = i13;
            Class cls = Byte.TYPE;
            bArr[i12] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i14 = this.heightOfTrees[i12];
            treehashArr[i12] = new Treehash[i14 - this.f25368K[i12]];
            if (i12 > 0) {
                int i15 = i12 - 1;
                bArr2[i15] = (byte[][]) Array.newInstance((Class<?>) cls, i14, this.mdLength);
                treehashArr2[i15] = new Treehash[this.heightOfTrees[i12] - this.f25368K[i12]];
            }
            vectorArr[i12] = new Vector();
            if (i12 > 0) {
                vectorArr2[i12 - 1] = new Vector();
            }
            i12++;
            c2 = 0;
        }
        int[] iArr2 = {i, this.mdLength};
        Class cls2 = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls2, iArr2);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls2, this.numLayer - 1, this.mdLength);
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls2, this.numLayer, this.mdLength);
        int i16 = 0;
        while (true) {
            i9 = this.numLayer;
            if (i16 >= i9) {
                break;
            }
            System.arraycopy(this.currentSeeds[i16], 0, bArr5[i16], 0, this.mdLength);
            i16++;
        }
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i9 - 1, this.mdLength);
        int i17 = this.numLayer - 1;
        while (i17 >= 0) {
            GMSSRootCalc generateCurrentAuthpathAndRoot = i17 == this.numLayer - i11 ? generateCurrentAuthpathAndRoot(null, vectorArr[i17], bArr5[i17], i17) : generateCurrentAuthpathAndRoot(bArr3[i17 + 1], vectorArr[i17], bArr5[i17], i17);
            int i18 = 0;
            while (i18 < this.heightOfTrees[i17]) {
                System.arraycopy(generateCurrentAuthpathAndRoot.getAuthPath()[i18], 0, bArr[i17][i18], 0, this.mdLength);
                i18++;
                vectorArr = vectorArr;
            }
            vectorArr3[i17] = generateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i17] = generateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(generateCurrentAuthpathAndRoot.getRoot(), 0, bArr3[i17], 0, this.mdLength);
            i17--;
            vectorArr = vectorArr;
            i11 = 1;
        }
        Vector[] vectorArr5 = vectorArr;
        int i19 = this.numLayer - 2;
        while (i19 >= 0) {
            int i20 = i19 + 1;
            GMSSRootCalc generateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i19], bArr5[i20], i20);
            int i21 = 0;
            while (i21 < this.heightOfTrees[i20]) {
                System.arraycopy(generateNextAuthpathAndRoot.getAuthPath()[i21], 0, bArr2[i19][i21], 0, this.mdLength);
                i21++;
                vectorArr3 = vectorArr3;
            }
            vectorArr4[i19] = generateNextAuthpathAndRoot.getRetain();
            treehashArr2[i19] = generateNextAuthpathAndRoot.getTreehash();
            System.arraycopy(generateNextAuthpathAndRoot.getRoot(), 0, bArr4[i19], 0, this.mdLength);
            System.arraycopy(bArr5[i20], 0, this.nextNextSeeds[i19], 0, this.mdLength);
            i19--;
            vectorArr3 = vectorArr3;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr3[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr5, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i) {
        byte[] Verify;
        int i9 = this.mdLength;
        byte[] bArr3 = new byte[i9];
        byte[] bArr4 = new byte[i9];
        byte[] nextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.f25368K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i == this.numLayer - 1) {
            Verify = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
        } else {
            this.currentRootSigs[i] = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getSignature(bArr);
            Verify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i]).Verify(bArr, this.currentRootSigs[i]);
        }
        gMSSRootCalc.update(Verify);
        int i10 = 3;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int i13 = this.heightOfTrees[i];
            if (i12 >= (1 << i13)) {
                break;
            }
            if (i12 == i10 && i11 < i13 - this.f25368K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i11);
                i10 *= 2;
                i11++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i12++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.f25368K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i9 = 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.heightOfTrees[i];
            if (i10 >= (1 << i12)) {
                break;
            }
            if (i10 == i9 && i11 < i12 - this.f25368K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i11);
                i9 *= 2;
                i11++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i10++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i, SecureRandom secureRandom) {
        initialize(i <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.f25368K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i = 0; i < this.numLayer; i++) {
            random.nextBytes(this.currentSeeds[i]);
            this.gmssRandom.nextSeed(this.currentSeeds[i]);
        }
        this.initialized = true;
    }
}

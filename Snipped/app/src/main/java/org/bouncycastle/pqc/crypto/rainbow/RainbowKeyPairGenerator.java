package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: classes3.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* renamed from: A1, reason: collision with root package name */
    private short[][] f25442A1;
    private short[][] A1inv;

    /* renamed from: A2, reason: collision with root package name */
    private short[][] f25443A2;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f25444b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f25445b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int[] vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i = 0; i < length; i++) {
            int i9 = 0;
            for (int i10 = 0; i10 < length2; i10++) {
                for (int i11 = i10; i11 < length2; i11++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i11 == i10) {
                        sArr2[i][i9] = sArr[i][i10][i11];
                    } else {
                        short[] sArr3 = sArr2[i];
                        short[][] sArr4 = sArr[i];
                        sArr3[i9] = GF2Field.addElem(sArr4[i10][i11], sArr4[i11][i10]);
                    }
                    i9++;
                }
            }
        }
    }

    private void computePublicKey() {
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.vi;
        int i = 0;
        int i9 = iArr[iArr.length - 1] - iArr[0];
        int i10 = iArr[iArr.length - 1];
        int i11 = 3;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i9, i10, i10);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i9, i10);
        this.pub_scalar = new short[i9];
        short[] sArr2 = new short[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i12 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i12].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i12].getCoeffBeta();
            short[][] coeffGamma = this.layers[i12].getCoeffGamma();
            short[] coeffEta = this.layers[i12].getCoeffEta();
            int length = coeffAlpha[i].length;
            int length2 = coeffBeta[i].length;
            while (i < length) {
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = i9;
                        int i17 = i10;
                        int i18 = i14 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i][i14][i15], this.f25443A2[i18]);
                        int i19 = i13 + i;
                        int i20 = i12;
                        sArr[i19] = computeInField.addSquareMatrix(sArr[i19], computeInField.multVects(multVect, this.f25443A2[i15]));
                        short[] multVect2 = computeInField.multVect(this.f25445b2[i15], multVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i19] = computeInField.addVect(multVect2, sArr3[i19]);
                        short[] multVect3 = computeInField.multVect(this.f25445b2[i18], computeInField.multVect(coeffAlpha[i][i14][i15], this.f25443A2[i15]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i19] = computeInField.addVect(multVect3, sArr4[i19]);
                        short multElem = GF2Field.multElem(coeffAlpha[i][i14][i15], this.f25445b2[i18]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i19] = GF2Field.addElem(sArr5[i19], GF2Field.multElem(multElem, this.f25445b2[i15]));
                        i15++;
                        i10 = i17;
                        i9 = i16;
                        coeffAlpha = coeffAlpha;
                        i12 = i20;
                        coeffEta = coeffEta;
                    }
                }
                int i21 = i10;
                int i22 = i9;
                int i23 = i12;
                short[][][] sArr6 = coeffAlpha;
                short[] sArr7 = coeffEta;
                for (int i24 = 0; i24 < length2; i24++) {
                    for (int i25 = 0; i25 < length2; i25++) {
                        short[] multVect4 = computeInField.multVect(coeffBeta[i][i24][i25], this.f25443A2[i24]);
                        int i26 = i13 + i;
                        sArr[i26] = computeInField.addSquareMatrix(sArr[i26], computeInField.multVects(multVect4, this.f25443A2[i25]));
                        short[] multVect5 = computeInField.multVect(this.f25445b2[i25], multVect4);
                        short[][] sArr8 = this.pub_singular;
                        sArr8[i26] = computeInField.addVect(multVect5, sArr8[i26]);
                        short[] multVect6 = computeInField.multVect(this.f25445b2[i24], computeInField.multVect(coeffBeta[i][i24][i25], this.f25443A2[i25]));
                        short[][] sArr9 = this.pub_singular;
                        sArr9[i26] = computeInField.addVect(multVect6, sArr9[i26]);
                        short multElem2 = GF2Field.multElem(coeffBeta[i][i24][i25], this.f25445b2[i24]);
                        short[] sArr10 = this.pub_scalar;
                        sArr10[i26] = GF2Field.addElem(sArr10[i26], GF2Field.multElem(multElem2, this.f25445b2[i25]));
                    }
                }
                for (int i27 = 0; i27 < length2 + length; i27++) {
                    short[] multVect7 = computeInField.multVect(coeffGamma[i][i27], this.f25443A2[i27]);
                    short[][] sArr11 = this.pub_singular;
                    int i28 = i13 + i;
                    sArr11[i28] = computeInField.addVect(multVect7, sArr11[i28]);
                    short[] sArr12 = this.pub_scalar;
                    sArr12[i28] = GF2Field.addElem(sArr12[i28], GF2Field.multElem(coeffGamma[i][i27], this.f25445b2[i27]));
                }
                short[] sArr13 = this.pub_scalar;
                int i29 = i13 + i;
                sArr13[i29] = GF2Field.addElem(sArr13[i29], sArr7[i]);
                i++;
                i10 = i21;
                i9 = i22;
                coeffAlpha = sArr6;
                i12 = i23;
                coeffEta = sArr7;
            }
            i13 += length;
            i12++;
            i = 0;
            i11 = 3;
        }
        int i30 = i10;
        int i31 = i9;
        int[] iArr2 = new int[i11];
        iArr2[2] = i30;
        iArr2[1] = i30;
        iArr2[0] = i31;
        Class cls2 = Short.TYPE;
        short[][][] sArr14 = (short[][][]) Array.newInstance((Class<?>) cls2, iArr2);
        short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls2, i31, i30);
        short[] sArr16 = new short[i31];
        for (int i32 = 0; i32 < i31; i32++) {
            int i33 = 0;
            while (true) {
                short[][] sArr17 = this.f25442A1;
                if (i33 < sArr17.length) {
                    sArr14[i32] = computeInField.addSquareMatrix(sArr14[i32], computeInField.multMatrix(sArr17[i32][i33], sArr[i33]));
                    sArr15[i32] = computeInField.addVect(sArr15[i32], computeInField.multVect(this.f25442A1[i32][i33], this.pub_singular[i33]));
                    sArr16[i32] = GF2Field.addElem(sArr16[i32], GF2Field.multElem(this.f25442A1[i32][i33], this.pub_scalar[i33]));
                    i33++;
                }
            }
            sArr16[i32] = GF2Field.addElem(sArr16[i32], this.f25444b1[i32]);
        }
        this.pub_singular = sArr15;
        this.pub_scalar = sArr16;
        compactPublicKey(sArr14);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i = 0;
        while (i < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.vi;
            int i9 = i + 1;
            layerArr[i] = new Layer(iArr[i], iArr[i9], this.sr);
            i = i9;
        }
    }

    private void generateL1() {
        int[] iArr = this.vi;
        int i = iArr[iArr.length - 1] - iArr[0];
        this.f25442A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i9 = 0; i9 < i; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    this.f25442A1[i9][i10] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.f25442A1);
        }
        this.f25444b1 = new short[i];
        for (int i11 = 0; i11 < i; i11++) {
            this.f25444b1[i11] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.vi;
        int i = iArr[iArr.length - 1];
        this.f25443A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i9 = 0; i9 < i; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    this.f25443A2[i9][i10] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.f25443A2);
        }
        this.f25445b2 = new short[i];
        for (int i11 = 0; i11 < i; i11++) {
            this.f25445b2[i11] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f25444b1, this.A2inv, this.f25445b2, this.vi, this.layers);
        int[] iArr = this.vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.rainbowParams = rainbowKeyGenerationParameters;
        this.sr = rainbowKeyGenerationParameters.getRandom();
        this.vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}

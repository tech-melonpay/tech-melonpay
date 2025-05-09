package org.bouncycastle.pqc.crypto.lms;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* loaded from: classes3.dex */
class HSS {

    public static class PlaceholderLMSPrivateKey extends LMSPrivateKeyParameters {
        public PlaceholderLMSPrivateKey(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i, byte[] bArr, int i9, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, i, bArr, i9, bArr2);
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMOtsPrivateKey getNextOtsPrivateKey() {
            throw new RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMSPublicKeyParameters getPublicKey() {
            throw new RuntimeException("placeholder only");
        }
    }

    public static HSSPrivateKeyParameters generateHSSKeyPair(HSSKeyGenerationParameters hSSKeyGenerationParameters) {
        int i;
        byte[] bArr;
        int depth = hSSKeyGenerationParameters.getDepth();
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new LMSPrivateKeyParameters[depth];
        LMSSignature[] lMSSignatureArr = new LMSSignature[hSSKeyGenerationParameters.getDepth() - 1];
        byte[] bArr2 = new byte[32];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr3);
        byte[] bArr4 = new byte[0];
        int i9 = 0;
        long j10 = 1;
        while (i9 < depth) {
            if (i9 == 0) {
                lMSPrivateKeyParametersArr[i9] = new LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i9].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i9].getLMOTSParam(), 0, bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i9].getLMSigParam().getH(), bArr2);
                i = i9;
                bArr = bArr4;
            } else {
                i = i9;
                bArr = bArr4;
                lMSPrivateKeyParametersArr[i] = new PlaceholderLMSPrivateKey(hSSKeyGenerationParameters.getLmsParameters()[i9].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i9].getLMOTSParam(), -1, bArr, 1 << hSSKeyGenerationParameters.getLmsParameters()[i9].getLMSigParam().getH(), bArr);
            }
            j10 *= 1 << hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam().getH();
            i9 = i + 1;
            bArr4 = bArr;
        }
        if (j10 == 0) {
            j10 = Long.MAX_VALUE;
        }
        return new HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), Arrays.asList(lMSPrivateKeyParametersArr), Arrays.asList(lMSSignatureArr), 0L, j10);
    }

    public static HSSSignature generateSignature(int i, LMSContext lMSContext) {
        return new HSSSignature(i - 1, lMSContext.getSignedPubKeys(), LMS.generateSign(lMSContext));
    }

    public static void incrementIndex(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            rangeTestKeys(hSSPrivateKeyParameters);
            hSSPrivateKeyParameters.incIndex();
            hSSPrivateKeyParameters.getKeys().get(hSSPrivateKeyParameters.getL() - 1).incIndex();
        }
    }

    public static void rangeTestKeys(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            try {
                if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.getIndexLimit()) {
                    StringBuilder sb2 = new StringBuilder("hss private key");
                    sb2.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                    sb2.append(" is exhausted");
                    throw new ExhaustedPrivateKeyException(sb2.toString());
                }
                int l10 = hSSPrivateKeyParameters.getL();
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                int i = l10;
                while (true) {
                    int i9 = i - 1;
                    if (keys.get(i9).getIndex() != (1 << keys.get(i9).getSigParameters().getH())) {
                        while (i < l10) {
                            hSSPrivateKeyParameters.replaceConsumedKey(i);
                            i++;
                        }
                    } else {
                        if (i9 == 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("hss private key");
                            sb3.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                            sb3.append(" is exhausted the maximum limit for this HSS private key");
                            throw new ExhaustedPrivateKeyException(sb3.toString());
                        }
                        i = i9;
                    }
                }
            } finally {
            }
        }
    }

    public static boolean verifySignature(HSSPublicKeyParameters hSSPublicKeyParameters, HSSSignature hSSSignature, byte[] bArr) {
        int i = hSSSignature.getlMinus1();
        int i9 = i + 1;
        if (i9 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        LMSSignature[] lMSSignatureArr = new LMSSignature[i9];
        LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new LMSPublicKeyParameters[i];
        for (int i10 = 0; i10 < i; i10++) {
            lMSSignatureArr[i10] = hSSSignature.getSignedPubKey()[i10].getSignature();
            lMSPublicKeyParametersArr[i10] = hSSSignature.getSignedPubKey()[i10].getPublicKey();
        }
        lMSSignatureArr[i] = hSSSignature.getSignature();
        LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i11 = 0; i11 < i; i11++) {
            if (!LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i11], lMSPublicKeyParametersArr[i11].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i11];
            } catch (Exception e10) {
                throw new IllegalStateException(e10.getMessage(), e10);
            }
        }
        return LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i], bArr);
    }

    public static HSSSignature generateSignature(HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l10 = hSSPrivateKeyParameters.getL();
        synchronized (hSSPrivateKeyParameters) {
            try {
                rangeTestKeys(hSSPrivateKeyParameters);
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                List<LMSSignature> sig = hSSPrivateKeyParameters.getSig();
                int i = l10 - 1;
                lMSPrivateKeyParameters = hSSPrivateKeyParameters.getKeys().get(i);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i];
                int i9 = 0;
                while (i9 < i) {
                    int i10 = i9 + 1;
                    lMSSignedPubKeyArr[i9] = new LMSSignedPubKey(sig.get(i9), keys.get(i10).getPublicKey());
                    i9 = i10;
                }
                hSSPrivateKeyParameters.incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        LMSContext withSignedPublicKeys = lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
        withSignedPublicKeys.update(bArr, 0, bArr.length);
        return generateSignature(l10, withSignedPublicKeys);
    }
}

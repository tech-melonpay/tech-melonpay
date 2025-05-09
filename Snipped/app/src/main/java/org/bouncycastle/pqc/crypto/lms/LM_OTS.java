package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_LEN = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    public static int cksm(byte[] bArr, int i, LMOtsParameters lMOtsParameters) {
        int w2 = (1 << lMOtsParameters.getW()) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < (i * 8) / lMOtsParameters.getW(); i10++) {
            i9 = (i9 + w2) - coef(bArr, i10, lMOtsParameters.getW());
        }
        return i9 << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i, int i9) {
        int i10 = (i * i9) / 8;
        return (bArr[i10] >>> (((~i) & ((8 / i9) - 1)) * i9)) & ((1 << i9) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n10 = parameter.getN();
        int p10 = parameter.getP();
        int w2 = parameter.getW();
        byte[] bArr3 = new byte[p10 * n10];
        Digest digest = DigestUtil.getDigest(parameter.getDigestOID());
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int cksm = cksm(bArr, n10, parameter);
        bArr[n10] = (byte) ((cksm >>> 8) & 255);
        bArr[n10 + 1] = (byte) cksm;
        int i = n10 + 23;
        byte[] build = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i).build();
        derivationFunction.setJ(0);
        int i9 = 0;
        while (i9 < p10) {
            Pack.shortToBigEndian((short) i9, build, 20);
            int i10 = 23;
            derivationFunction.deriveSeed(build, i9 < p10 + (-1), 23);
            int coef = coef(bArr, i9, w2);
            for (int i11 = 0; i11 < coef; i11++) {
                build[22] = (byte) i11;
                digest.update(build, 0, i);
                i10 = 23;
                digest.doFinal(build, 23);
            }
            System.arraycopy(build, i10, bArr3, n10 * i9, n10);
            i9++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z10) {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext createOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, createOtsContext);
        return lm_ots_validate_signature_calculate(createOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z10) {
        byte[] bArr3;
        byte[] bArr4 = new byte[34];
        if (z10) {
            bArr3 = new byte[32];
            System.arraycopy(bArr2, 0, bArr4, 0, lMOtsPrivateKey.getParameter().getN());
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            bArr3 = signatureContext.getC();
            bArr4 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, bArr4, bArr3);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n10 = parameter.getN();
        int w2 = parameter.getW();
        int p10 = parameter.getP();
        byte[] q10 = lMSContext.getQ();
        int cksm = cksm(q10, n10, parameter);
        q10[n10] = (byte) ((cksm >>> 8) & 255);
        q10[n10 + 1] = (byte) cksm;
        byte[] i = publicKey.getI();
        int q11 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter.getDigestOID());
        LmsUtils.byteArray(i, digest);
        LmsUtils.u32str(q11, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer u32str = Composer.compose().bytes(i).u32str(q11);
        int i9 = n10 + 23;
        byte[] build = u32str.padUntil(0, i9).build();
        int i10 = (1 << w2) - 1;
        byte[] y10 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter.getDigestOID());
        for (int i11 = 0; i11 < p10; i11++) {
            Pack.shortToBigEndian((short) i11, build, 20);
            System.arraycopy(y10, i11 * n10, build, 23, n10);
            for (int coef = coef(q10, i11, w2); coef < i10; coef++) {
                build[22] = (byte) coef;
                digest2.update(build, 0, i9);
                digest2.doFinal(build, 23);
            }
            digest.update(build, 23, n10);
        }
        byte[] bArr = new byte[n10];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters.getDigestOID());
        byte[] build = Composer.compose().bytes(bArr).u32str(i).u16str(-32640).padUntil(0, 22).build();
        digest.update(build, 0, build.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters.getDigestOID());
        byte[] build2 = Composer.compose().bytes(bArr).u32str(i).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters.getDigestOID()));
        seedDerive.setQ(i);
        seedDerive.setJ(0);
        int p10 = lMOtsParameters.getP();
        int n10 = lMOtsParameters.getN();
        int w2 = (1 << lMOtsParameters.getW()) - 1;
        int i9 = 0;
        while (i9 < p10) {
            seedDerive.deriveSeed(build2, i9 < p10 + (-1), 23);
            Pack.shortToBigEndian((short) i9, build2, 20);
            for (int i10 = 0; i10 < w2; i10++) {
                build2[22] = (byte) i10;
                digest2.update(build2, 0, build2.length);
                digest2.doFinal(build2, 23);
            }
            digest.update(build2, 23, n10);
            i9++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}

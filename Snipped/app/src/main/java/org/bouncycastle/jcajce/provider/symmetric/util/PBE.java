package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: classes2.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        private static byte[] convertPassword(int i, PBEKeySpec pBEKeySpec) {
            return i == 2 ? PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword()) : (i == 5 || i == 4) ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static PBEParametersGenerator makePBEGenerator(int i, int i9) {
            if (i == 0 || i == 4) {
                if (i9 == 0) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
                }
                if (i9 == 1) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                if (i9 == 5) {
                    return new PKCS5S1ParametersGenerator(new MD2Digest());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            if (i != 1 && i != 5) {
                if (i != 2) {
                    return new OpenSSLPBEParametersGenerator();
                }
                switch (i9) {
                    case 0:
                        return new PKCS12ParametersGenerator(DigestFactory.createMD5());
                    case 1:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA1());
                    case 2:
                        return new PKCS12ParametersGenerator(new RIPEMD160Digest());
                    case 3:
                        return new PKCS12ParametersGenerator(new TigerDigest());
                    case 4:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA256());
                    case 5:
                        return new PKCS12ParametersGenerator(new MD2Digest());
                    case 6:
                        return new PKCS12ParametersGenerator(new GOST3411Digest());
                    case 7:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA224());
                    case 8:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA384());
                    case 9:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA512());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
            switch (i9) {
                case 0:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createMD5());
                case 1:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1());
                case 2:
                    return new PKCS5S2ParametersGenerator(new RIPEMD160Digest());
                case 3:
                    return new PKCS5S2ParametersGenerator(new TigerDigest());
                case 4:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256());
                case 5:
                    return new PKCS5S2ParametersGenerator(new MD2Digest());
                case 6:
                    return new PKCS5S2ParametersGenerator(new GOST3411Digest());
                case 7:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224());
                case 8:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384());
                case 9:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512());
                case 10:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_224());
                case 11:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_256());
                case 12:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_384());
                case 13:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_512());
                case 14:
                    return new PKCS5S2ParametersGenerator(new SM3Digest());
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i, int i9, int i10, PBEParameterSpec pBEParameterSpec) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i9);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i10);
            for (int i11 = 0; i11 != encoded.length; i11++) {
                encoded[i11] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i, int i9, int i10, int i11) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i9);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedParameters = i11 != 0 ? makePBEGenerator.generateDerivedParameters(i10, i11) : makePBEGenerator.generateDerivedParameters(i10);
            for (int i12 = 0; i12 != convertPassword.length; i12++) {
                convertPassword[i12] = 0;
            }
            return generateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i9, int i10) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i9);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i10);
            for (int i11 = 0; i11 != convertPassword.length; i11++) {
                convertPassword[i11] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                } else {
                    DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                }
            }
            return generateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            makePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static CipherParameters makePBEParameters(byte[] bArr, int i, int i9, int i10, int i11, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i, i9);
            makePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = i11 != 0 ? makePBEGenerator.generateDerivedParameters(i10, i11) : makePBEGenerator.generateDerivedParameters(i10);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                } else {
                    DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                }
            }
            return generateDerivedParameters;
        }
    }
}

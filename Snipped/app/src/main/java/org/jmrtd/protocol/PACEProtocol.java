package org.jmrtd.protocol;

import C.v;
import androidx.camera.core.n;
import com.google.android.gms.measurement.internal.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.APDULevelPACECapable;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.CardServiceProtocolException;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PACESecretKeySpec;
import org.jmrtd.Util;
import org.jmrtd.lds.CVCAFile;
import org.jmrtd.lds.PACEInfo;
import s3.b;

/* loaded from: classes3.dex */
public class PACEProtocol {
    private int maxTranceiveLengthForProtocol;
    private int maxTranceiveLengthForSecureMessaging;
    private Random random;
    private APDULevelPACECapable service;
    private boolean shouldCheckMAC;
    private SecureMessagingWrapper wrapper;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final Provider BC_PROVIDER = Util.getBouncyCastleProvider();
    private static final byte[] IV_FOR_PACE_CAM_DECRYPTION = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final byte[] C0_LENGTH_128 = {-90, 104, -119, ISO7816.INS_PSO, 124, 65, -29, ISO7816.INS_GET_DATA, 115, -97, 64, ISO7816.INS_READ_BINARY, 87, ISO7816.INS_LOAD_KEY_FILE, 89, 4};
    private static final byte[] C1_LENGTH_128 = {-92, -31, 54, -84, 114, 95, 115, ISOFileInfo.SECURITY_ATTR_EXP, 1, -63, -10, 2, 23, -63, -120, -83};
    private static final byte[] C0_LENGTH_256 = {-44, 99, ISO7816.INS_UPDATE_BINARY, 82, ISO7816.INS_DECREASE_STAMPED, 18, 78, -9, -119, ISO7816.INS_MANAGE_CHANNEL, 84, -104, 109, ISO7816.INS_GET_DATA, 10, 23, 78, 40, -33, 117, ISOFileInfo.SECURITY_ATTR_COMPACT, -70, ISOFileInfo.f24316A0, 63, ISO7816.INS_CHANGE_CHV, 6, 22, 65, 77, 90, 22, 118};
    private static final byte[] C1_LENGTH_256 = {84, -67, 114, 85, -16, -86, -8, 49, -66, -61, CVCAFile.CAR_TAG, 63, -49, 57, ISO7816.INS_UPDATE_BINARY, -101, 108, -65, 6, 102, 119, ISO7816.INS_WRITE_BINARY, -6, -82, 90, -83, -39, -99, -8, -27, 53, 23};

    /* renamed from: org.jmrtd.protocol.PACEProtocol$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType;

        static {
            int[] iArr = new int[PACEInfo.MappingType.values().length];
            $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType = iArr;
            try {
                iArr[PACEInfo.MappingType.CAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[PACEInfo.MappingType.GM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[PACEInfo.MappingType.IM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    public PACEProtocol(APDULevelPACECapable aPDULevelPACECapable, SecureMessagingWrapper secureMessagingWrapper, int i, boolean z10) {
        this(aPDULevelPACECapable, secureMessagingWrapper, 256, i, z10);
    }

    private void checkConsistency(String str, String str2, String str3, int i, AlgorithmParameterSpec algorithmParameterSpec) {
        if (str == null) {
            throw new IllegalArgumentException("Unknown agreement algorithm");
        }
        if (!"ECDH".equalsIgnoreCase(str) && !"DH".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(n.a("Unsupported agreement algorithm, expected \"ECDH\" or \"DH\", found \"", str, "\""));
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Unknown cipher algorithm");
        }
        if (!"DESede".equalsIgnoreCase(str2) && !"AES".equalsIgnoreCase(str2)) {
            throw new IllegalArgumentException(n.a("Unsupported cipher algorithm, expected \"DESede\" or \"AES\", found \"", str2, "\""));
        }
        if (!McElieceCCA2KeyGenParameterSpec.SHA1.equalsIgnoreCase(str3) && !"SHA1".equalsIgnoreCase(str3) && !"SHA-256".equalsIgnoreCase(str3) && !"SHA256".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(n.a("Unsupported cipher algorithm, expected \"SHA-1\" or \"SHA-256\", found \"", str3, "\""));
        }
        if (i != 128 && i != 192 && i != 256) {
            throw new IllegalArgumentException(a.g(i, "Unsupported key length, expected 128, 192, or 256, found "));
        }
        if ("ECDH".equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof ECParameterSpec)) {
            StringBuilder m2 = a.m("Expected ECParameterSpec for agreement algorithm \"", str, "\", found ");
            m2.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(m2.toString());
        }
        if (!"DH".equalsIgnoreCase(str) || (algorithmParameterSpec instanceof DHParameterSpec)) {
            return;
        }
        StringBuilder m9 = a.m("Expected DHParameterSpec for agreement algorithm \"", str, "\", found ");
        m9.append(algorithmParameterSpec.getClass().getCanonicalName());
        throw new IllegalArgumentException(m9.toString());
    }

    public static byte[] computeKeySeedForPACE(AccessKeySpec accessKeySpec) {
        if (accessKeySpec == null) {
            throw new IllegalArgumentException("Access key cannot be null");
        }
        if (!(accessKeySpec instanceof BACKeySpec)) {
            if (accessKeySpec instanceof PACEKeySpec) {
                return ((PACEKeySpec) accessKeySpec).getKey();
            }
            LOGGER.warning("JMRTD doesn't recognize this type of access key, best effort key derivation!");
            return accessKeySpec.getKey();
        }
        BACKeySpec bACKeySpec = (BACKeySpec) accessKeySpec;
        String documentNumber = bACKeySpec.getDocumentNumber();
        String dateOfBirth = bACKeySpec.getDateOfBirth();
        String dateOfExpiry = bACKeySpec.getDateOfExpiry();
        if (dateOfBirth == null || dateOfBirth.length() != 6) {
            throw new IllegalArgumentException(b.j("Wrong date format used for date of birth. Expected yyMMdd, found ", dateOfBirth));
        }
        if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
            throw new IllegalArgumentException(b.j("Wrong date format used for date of expiry. Expected yyMMdd, found ", dateOfExpiry));
        }
        if (documentNumber != null) {
            return computeKeySeedForPACE(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
        }
        throw new IllegalArgumentException(b.j("Wrong document number. Found ", documentNumber));
    }

    public static PublicKey decodePublicKeyFromSmartCard(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Params cannot be null");
        }
        try {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                return Util.getPublicKey("EC", new ECPublicKeySpec(Util.os2ECPoint(bArr), (ECParameterSpec) algorithmParameterSpec));
            }
            if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                return Util.getPublicKey("DH", new DHPublicKeySpec(Util.os2i(bArr), dHParameterSpec.getP(), dHParameterSpec.getG()));
            }
            throw new IllegalArgumentException("Expected ECParameterSpec or DHParameterSpec, found " + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            throw new IllegalArgumentException(e10);
        }
    }

    public static SecretKey deriveStaticPACEKey(AccessKeySpec accessKeySpec, String str) {
        return Util.deriveKey(computeKeySeedForPACE(accessKeySpec), PACEInfo.toCipherAlgorithm(str), PACEInfo.toKeyLength(str), null, 3, accessKeySpec instanceof PACEKeySpec ? ((PACEKeySpec) accessKeySpec).getKeyReference() : (byte) 0);
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey) {
        return encodePublicKeyDataObject(str, publicKey, true);
    }

    public static byte[] encodePublicKeyForSmartCard(PublicKey publicKey) {
        if (publicKey == null) {
            throw new IllegalArgumentException("Cannot encode null public key");
        }
        if (!(publicKey instanceof ECPublicKey)) {
            if (publicKey instanceof DHPublicKey) {
                return Util.i2os(((DHPublicKey) publicKey).getY());
            }
            throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
        }
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(Util.ecPoint2OS(eCPublicKey.getW(), eCPublicKey.getParams().getCurve().getField().getFieldSize()));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            throw new IllegalStateException("Internal error writing to memory", e10);
        }
    }

    private static String fixDocumentNumber(String str) {
        StringBuilder sb2 = new StringBuilder(str.replace('<', ' ').trim().replace(' ', '<'));
        while (sb2.length() < 9) {
            sb2.append('<');
        }
        return sb2.toString();
    }

    public static byte[] generateAuthenticationToken(String str, SecretKey secretKey, PublicKey publicKey) {
        return generateAuthenticationToken(str, Util.getMac(inferMACAlgorithmFromCipherAlgorithm(PACEInfo.toCipherAlgorithm(str)), secretKey), publicKey);
    }

    public static ECPoint icartPointEncode(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        BigInteger prime = Util.getPrime(eCParameterSpec);
        if (!BigInteger.valueOf(3L).equals(prime.mod(BigInteger.valueOf(4L)))) {
            throw new InvalidParameterException("Cannot encode point because p != 3 (mod 4)");
        }
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger b9 = eCParameterSpec.getCurve().getB();
        BigInteger mod = bigInteger.modPow(BigInteger.valueOf(2L), prime).negate().mod(prime);
        BigInteger mod2 = mod.add(mod.modPow(BigInteger.valueOf(2L), prime)).mod(prime);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger mod3 = b9.negate().multiply(bigInteger2.add(mod2)).multiply(a10.multiply(mod2).modPow(prime.subtract(bigInteger2).subtract(bigInteger2), prime)).mod(prime);
        BigInteger mod4 = mod.multiply(mod3).mod(prime);
        BigInteger mod5 = mod3.modPow(BigInteger.valueOf(3L), prime).add(a10.multiply(mod3)).add(b9).mod(prime);
        BigInteger mod6 = bigInteger.modPow(BigInteger.valueOf(3L), prime).multiply(mod5).mod(prime);
        BigInteger modPow = mod5.modPow(prime.subtract(bigInteger2).subtract(prime.add(bigInteger2).multiply(BigInteger.valueOf(4L).modInverse(prime)).mod(prime)), prime);
        ECPoint eCPoint = modPow.modPow(BigInteger.valueOf(2L), prime).multiply(mod5).mod(prime).equals(bigInteger2) ? new ECPoint(mod3, modPow.multiply(mod5).mod(prime)) : new ECPoint(mod4, modPow.multiply(mod6).mod(prime));
        if (cofactor == 1) {
            return Util.normalize(eCPoint, eCParameterSpec);
        }
        org.bouncycastle.math.ec.ECPoint bouncyCastleECPoint = Util.toBouncyCastleECPoint(eCPoint, eCParameterSpec);
        bouncyCastleECPoint.multiply(BigInteger.valueOf(cofactor));
        return Util.fromBouncyCastleECPoint(bouncyCastleECPoint);
    }

    private static String inferMACAlgorithmFromCipherAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot infer MAC algorithm from cipher algorithm null");
        }
        if (str.startsWith("DESede")) {
            return "ISO9797ALG3WITHISO7816-4PADDING";
        }
        if (str.startsWith("AES")) {
            return "AESCMAC";
        }
        throw new InvalidAlgorithmParameterException(n.a("Cannot infer MAC algorithm from cipher algorithm \"", str, "\""));
    }

    public static DHParameterSpec mapNonceGMWithDH(byte[] bArr, BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        BigInteger p10 = dHParameterSpec.getP();
        return new DHParameterSpec(p10, dHParameterSpec.getG().modPow(Util.os2i(bArr), p10).multiply(bigInteger).mod(p10), dHParameterSpec.getL());
    }

    public static ECParameterSpec mapNonceGMWithECDH(byte[] bArr, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        ECPoint generator = eCParameterSpec.getGenerator();
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a10 = curve.getA();
        BigInteger b9 = curve.getB();
        BigInteger p10 = ((ECFieldFp) curve.getField()).getP();
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        ECPoint add = Util.add(Util.multiply(Util.os2i(bArr), generator, eCParameterSpec), eCPoint, eCParameterSpec);
        if (!Util.toBouncyCastleECPoint(add, eCParameterSpec).isValid()) {
            LOGGER.info("ephemeralGenerator is not a valid point");
        }
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(p10), a10, b9), add, order, cofactor);
    }

    public static AlgorithmParameterSpec mapNonceIMWithDH(byte[] bArr, byte[] bArr2, String str, DHParameterSpec dHParameterSpec) {
        BigInteger g10 = dHParameterSpec.getG();
        if (g10 != null) {
            BigInteger bigInteger = BigInteger.ONE;
            if (!g10.equals(bigInteger)) {
                BigInteger p10 = dHParameterSpec.getP();
                return new DHParameterSpec(p10, Util.os2i(pseudoRandomFunction(bArr, bArr2, p10, str)).modPow(p10.subtract(bigInteger).divide(dHParameterSpec instanceof PACEInfo.DHCParameterSpec ? ((PACEInfo.DHCParameterSpec) dHParameterSpec).getQ() : bigInteger), p10), dHParameterSpec.getL());
            }
        }
        throw new IllegalArgumentException("Invalid generator: " + g10);
    }

    public static AlgorithmParameterSpec mapNonceIMWithECDH(byte[] bArr, byte[] bArr2, String str, ECParameterSpec eCParameterSpec) {
        BigInteger prime = Util.getPrime(eCParameterSpec);
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger b9 = eCParameterSpec.getCurve().getB();
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(prime), a10, b9), icartPointEncode(Util.os2i(pseudoRandomFunction(bArr, bArr2, prime, str)), eCParameterSpec), order, cofactor);
    }

    public static byte[] pseudoRandomFunction(byte[] bArr, byte[] bArr2, BigInteger bigInteger, String str) {
        byte[] bArr3;
        byte[] bArr4;
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Null nonce");
        }
        int length = bArr.length * 8;
        int length2 = bArr2.length * 8;
        if (length == 128) {
            bArr3 = C0_LENGTH_128;
            bArr4 = C1_LENGTH_128;
        } else {
            if (length != 192 && length != 256) {
                throw new IllegalArgumentException(b.i("Unknown length ", length, ", was expecting 128, 192, or 256"));
            }
            bArr3 = C0_LENGTH_256;
            bArr4 = C1_LENGTH_256;
        }
        StringBuilder s10 = v.s(str);
        s10.append(str.endsWith("/CBC/NoPadding") ? "" : "/CBC/NoPadding");
        Cipher cipher = Cipher.getInstance(s10.toString());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[cipher.getBlockSize()]);
        cipher.init(1, new SecretKeySpec(bArr2, str), ivParameterSpec);
        byte[] doFinal = cipher.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i * length < bigInteger.bitLength() + 64; i++) {
            try {
                try {
                    cipher.init(1, new SecretKeySpec(doFinal, 0, length2 / 8, str), ivParameterSpec);
                    doFinal = cipher.doFinal(bArr3);
                    byteArrayOutputStream.write(cipher.doFinal(bArr4));
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e10);
                    }
                    throw th;
                }
            } catch (Exception e11) {
                LOGGER.log(Level.WARNING, "Could not write to stream", (Throwable) e11);
                byte[] i2os = Util.i2os(Util.os2i(byteArrayOutputStream.toByteArray()).mod(bigInteger));
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e12) {
                    LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e12);
                }
                return i2os;
            }
        }
        byte[] i2os2 = Util.i2os(Util.os2i(byteArrayOutputStream.toByteArray()).mod(bigInteger));
        try {
            byteArrayOutputStream.close();
        } catch (IOException e13) {
            LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e13);
        }
        return i2os2;
    }

    public static PublicKey updateParameterSpec(PublicKey publicKey, PrivateKey privateKey) {
        String algorithm = publicKey.getAlgorithm();
        String algorithm2 = privateKey.getAlgorithm();
        if ("EC".equals(algorithm) || "ECDH".equals(algorithm)) {
            if ("EC".equals(algorithm2) || "ECDH".equals(algorithm2)) {
                return KeyFactory.getInstance("EC", BC_PROVIDER).generatePublic(new ECPublicKeySpec(((ECPublicKey) publicKey).getW(), ((ECPrivateKey) privateKey).getParams()));
            }
            throw new NoSuchAlgorithmException(b.k("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        if (!"DH".equals(algorithm)) {
            throw new NoSuchAlgorithmException(b.k("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        if (!"DH".equals(algorithm2)) {
            throw new NoSuchAlgorithmException(b.k("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        KeyFactory keyFactory = KeyFactory.getInstance("DH");
        DHParameterSpec params = ((DHPrivateKey) privateKey).getParams();
        return keyFactory.generatePublic(new DHPublicKeySpec(((DHPublicKey) publicKey).getY(), params.getP(), params.getG()));
    }

    public PACEResult doPACE(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        try {
            return doPACE(accessKeySpec, deriveStaticPACEKey(accessKeySpec, str), str, algorithmParameterSpec, bigInteger);
        } catch (GeneralSecurityException e10) {
            throw new CardServiceProtocolException("PCD side error in key derivation step", 0, e10);
        }
    }

    public byte[] doPACEStep1(SecretKey secretKey, Cipher cipher) {
        try {
            byte[] unwrapDO = TLVUtil.unwrapDO(128, this.service.sendGeneralAuthenticate(this.wrapper, new byte[0], 256, false));
            cipher.init(2, secretKey, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher.doFinal(unwrapDO);
        } catch (GeneralSecurityException e10) {
            throw new CardServiceProtocolException("PCD side exception in tranceiving nonce step", 1, e10);
        } catch (CardServiceException e11) {
            throw new CardServiceProtocolException("PICC side exception in tranceiving nonce step", 1, e11);
        }
    }

    public PACEMappingResult doPACEStep2(PACEInfo.MappingType mappingType, String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[mappingType.ordinal()];
        if (i == 1 || i == 2) {
            return doPACEStep2GM(str, algorithmParameterSpec, bArr);
        }
        if (i == 3) {
            return doPACEStep2IM(str, algorithmParameterSpec, bArr, cipher);
        }
        throw new CardServiceProtocolException("Unsupported mapping type " + mappingType, 2);
    }

    public PACEGMMappingResult doPACEStep2GM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            keyPairGenerator.initialize(algorithmParameterSpec);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            PublicKey decodePublicKeyFromSmartCard = decodePublicKeyFromSmartCard(TLVUtil.unwrapDO(130, this.service.sendGeneralAuthenticate(this.wrapper, TLVUtil.wrapDO(129, encodePublicKeyForSmartCard(publicKey)), this.maxTranceiveLengthForProtocol, false)), algorithmParameterSpec);
            if ("ECDH".equals(str)) {
                PACEGMWithECDHAgreement pACEGMWithECDHAgreement = new PACEGMWithECDHAgreement();
                pACEGMWithECDHAgreement.init(privateKey);
                ECPoint doPhase = pACEGMWithECDHAgreement.doPhase(decodePublicKeyFromSmartCard);
                return new PACEGMWithECDHMappingResult(algorithmParameterSpec, bArr, decodePublicKeyFromSmartCard, generateKeyPair, doPhase, mapNonceGMWithECDH(bArr, doPhase, (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                KeyAgreement keyAgreement = KeyAgreement.getInstance(str);
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(decodePublicKeyFromSmartCard, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                return new PACEGMWithDHMappingResult(algorithmParameterSpec, bArr, decodePublicKeyFromSmartCard, generateKeyPair, generateSecret, mapNonceGMWithDH(bArr, Util.os2i(generateSecret), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (CardServiceException e10) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e10);
        } catch (Exception e11) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e11);
        }
    }

    public PACEIMMappingResult doPACEStep2IM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) {
        try {
            byte[] bArr2 = new byte[bArr.length];
            this.random.nextBytes(bArr2);
            this.service.sendGeneralAuthenticate(this.wrapper, TLVUtil.wrapDO(129, bArr2), this.maxTranceiveLengthForProtocol, false);
            if ("ECDH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, mapNonceIMWithECDH(bArr, bArr2, cipher.getAlgorithm(), (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, mapNonceIMWithDH(bArr, bArr2, cipher.getAlgorithm(), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e10) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e10);
        } catch (CardServiceException e11) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e11);
        }
    }

    public PublicKey doPACEStep3ExchangePublicKeys(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            PublicKey decodePublicKeyFromSmartCard = decodePublicKeyFromSmartCard(TLVUtil.unwrapDO(132, this.service.sendGeneralAuthenticate(this.wrapper, TLVUtil.wrapDO(131, encodePublicKeyForSmartCard(publicKey)), this.maxTranceiveLengthForProtocol, false)), algorithmParameterSpec);
            if (publicKey.equals(decodePublicKeyFromSmartCard)) {
                throw new CardServiceProtocolException("PCD's public key and PICC's public key are the same in key agreement step!", 3);
            }
            return decodePublicKeyFromSmartCard;
        } catch (CardServiceException e10) {
            throw new CardServiceProtocolException("PICC side exception in key agreement step", 3, e10);
        } catch (Exception e11) {
            throw new CardServiceProtocolException("PCD side exception in key agreement step", 3, e11);
        }
    }

    public KeyPair doPACEStep3GenerateKeyPair(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            keyPairGenerator.initialize(algorithmParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e10) {
            throw new CardServiceProtocolException("PCD side error during generation of PCD key pair", 3, e10);
        }
    }

    public byte[] doPACEStep3KeyAgreement(String str, PrivateKey privateKey, PublicKey publicKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str, BC_PROVIDER);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(updateParameterSpec(publicKey, privateKey), true);
            return keyAgreement.generateSecret();
        } catch (Exception e10) {
            throw new CardServiceProtocolException("PCD side error during key agreement", 3, e10);
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00db: INVOKE (r4 I:net.sf.scuba.tlv.TLVInputStream) VIRTUAL call: net.sf.scuba.tlv.TLVInputStream.close():void A[Catch: Exception -> 0x008c, IOException -> 0x00df, MD:():void (m), TRY_ENTER, TRY_LEAVE] (LINE:220), block:B:48:0x00db */
    public byte[] doPACEStep4(String str, PACEInfo.MappingType mappingType, KeyPair keyPair, PublicKey publicKey, SecretKey secretKey) {
        TLVInputStream tLVInputStream;
        Logger logger;
        Level level;
        byte[] readValue;
        byte[] generateAuthenticationToken;
        try {
            try {
                tLVInputStream = new TLVInputStream(new ByteArrayInputStream(this.service.sendGeneralAuthenticate(this.wrapper, TLVUtil.wrapDO(133, generateAuthenticationToken(str, secretKey, publicKey)), 256, true)));
                try {
                    int readTag = tLVInputStream.readTag();
                    if (readTag != 134) {
                        LOGGER.warning("Was expecting tag 0x86, found: " + Integer.toHexString(readTag));
                    }
                    tLVInputStream.readLength();
                    readValue = tLVInputStream.readValue();
                    generateAuthenticationToken = generateAuthenticationToken(str, secretKey, keyPair.getPublic());
                } catch (IOException e10) {
                    LOGGER.log(Level.WARNING, "Could not parse step 4 response", (Throwable) e10);
                    try {
                        tLVInputStream.close();
                        return null;
                    } catch (IOException e11) {
                        e = e11;
                        logger = LOGGER;
                        level = Level.FINE;
                        logger.log(level, "Exception closing stream", (Throwable) e);
                        return null;
                    }
                }
            } finally {
            }
        } catch (Exception e12) {
            throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e12);
        }
        if (!Arrays.equals(generateAuthenticationToken, readValue)) {
            throw new GeneralSecurityException("PICC authentication token mismatch, expectedPICCToken = " + Hex.bytesToHexString(generateAuthenticationToken) + ", piccToken = " + Hex.bytesToHexString(readValue));
        }
        if (mappingType != PACEInfo.MappingType.CAM) {
            try {
                tLVInputStream.close();
                return null;
            } catch (IOException e13) {
                e = e13;
                logger = LOGGER;
                level = Level.FINE;
                logger.log(level, "Exception closing stream", (Throwable) e);
                return null;
            }
        }
        int readTag2 = tLVInputStream.readTag();
        if (readTag2 != 138) {
            LOGGER.warning("Was expecting tag 0x8A, found: " + Integer.toHexString(readTag2));
        }
        tLVInputStream.readLength();
        byte[] readValue2 = tLVInputStream.readValue();
        try {
            tLVInputStream.close();
        } catch (IOException e14) {
            LOGGER.log(Level.FINE, "Exception closing stream", (Throwable) e14);
        }
        return readValue2;
        throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e12);
    }

    public PACEProtocol(APDULevelPACECapable aPDULevelPACECapable, SecureMessagingWrapper secureMessagingWrapper, int i, int i9, boolean z10) {
        this.service = aPDULevelPACECapable;
        this.wrapper = secureMessagingWrapper;
        this.maxTranceiveLengthForProtocol = i;
        this.maxTranceiveLengthForSecureMessaging = i9;
        this.shouldCheckMAC = z10;
        this.random = new SecureRandom();
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
        try {
            try {
                tLVOutputStream.writeTag(32585);
                if (publicKey instanceof DHPublicKey) {
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    BigInteger p10 = params.getP();
                    int l10 = params.getL();
                    BigInteger g10 = params.getG();
                    BigInteger y10 = dHPublicKey.getY();
                    tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z10) {
                        tLVOutputStream.writeTag(129);
                        tLVOutputStream.writeValue(Util.i2os(p10));
                        tLVOutputStream.writeTag(130);
                        tLVOutputStream.writeValue(Util.i2os(BigInteger.valueOf(l10)));
                        tLVOutputStream.writeTag(131);
                        tLVOutputStream.writeValue(Util.i2os(g10));
                    }
                    tLVOutputStream.writeTag(132);
                    tLVOutputStream.writeValue(Util.i2os(y10));
                } else {
                    if (!(publicKey instanceof ECPublicKey)) {
                        throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
                    }
                    ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
                    ECParameterSpec params2 = eCPublicKey.getParams();
                    BigInteger prime = Util.getPrime(params2);
                    EllipticCurve curve = params2.getCurve();
                    BigInteger a10 = curve.getA();
                    BigInteger b9 = curve.getB();
                    ECPoint generator = params2.getGenerator();
                    BigInteger order = params2.getOrder();
                    int cofactor = params2.getCofactor();
                    ECPoint w2 = eCPublicKey.getW();
                    tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z10) {
                        tLVOutputStream.writeTag(129);
                        tLVOutputStream.writeValue(Util.i2os(prime));
                        tLVOutputStream.writeTag(130);
                        tLVOutputStream.writeValue(Util.i2os(a10));
                        tLVOutputStream.writeTag(131);
                        tLVOutputStream.writeValue(Util.i2os(b9));
                        BigInteger affineX = generator.getAffineX();
                        BigInteger affineY = generator.getAffineY();
                        tLVOutputStream.writeTag(132);
                        tLVOutputStream.write(Util.i2os(affineX));
                        tLVOutputStream.write(Util.i2os(affineY));
                        tLVOutputStream.writeValueEnd();
                        tLVOutputStream.writeTag(133);
                        tLVOutputStream.writeValue(Util.i2os(order));
                    }
                    tLVOutputStream.writeTag(134);
                    tLVOutputStream.writeValue(Util.ecPoint2OS(w2, params2.getCurve().getField().getFieldSize()));
                    if (!z10) {
                        tLVOutputStream.writeTag(135);
                        tLVOutputStream.writeValue(Util.i2os(BigInteger.valueOf(cofactor)));
                    }
                }
                tLVOutputStream.writeValueEnd();
                tLVOutputStream.flush();
                try {
                    tLVOutputStream.close();
                } catch (IOException e10) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e11) {
                LOGGER.log(Level.WARNING, "Exception", (Throwable) e11);
                throw new IllegalStateException("Error in encoding public key");
            }
        } finally {
        }
    }

    private PACEResult doPACE(AccessKeySpec accessKeySpec, SecretKey secretKey, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        byte[] bArr;
        PACEInfo.MappingType mappingType = PACEInfo.toMappingType(str);
        String keyAgreementAlgorithm = PACEInfo.toKeyAgreementAlgorithm(str);
        String cipherAlgorithm = PACEInfo.toCipherAlgorithm(str);
        String digestAlgorithm = PACEInfo.toDigestAlgorithm(str);
        int keyLength = PACEInfo.toKeyLength(str);
        checkConsistency(keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, algorithmParameterSpec);
        try {
            Cipher cipher = Cipher.getInstance(cipherAlgorithm + "/CBC/NoPadding");
            try {
                this.service.sendMSESetATMutualAuth(this.wrapper, str, secretKey instanceof PACESecretKeySpec ? ((PACESecretKeySpec) secretKey).getKeyReference() : (byte) 1, bigInteger == null ? null : Util.i2os(bigInteger));
                PACEMappingResult doPACEStep2 = doPACEStep2(mappingType, keyAgreementAlgorithm, algorithmParameterSpec, doPACEStep1(secretKey, cipher), cipher);
                AlgorithmParameterSpec ephemeralParameters = doPACEStep2.getEphemeralParameters();
                KeyPair doPACEStep3GenerateKeyPair = doPACEStep3GenerateKeyPair(keyAgreementAlgorithm, ephemeralParameters);
                PublicKey doPACEStep3ExchangePublicKeys = doPACEStep3ExchangePublicKeys(doPACEStep3GenerateKeyPair.getPublic(), ephemeralParameters);
                byte[] doPACEStep3KeyAgreement = doPACEStep3KeyAgreement(keyAgreementAlgorithm, doPACEStep3GenerateKeyPair.getPrivate(), doPACEStep3ExchangePublicKeys);
                try {
                    SecretKey deriveKey = Util.deriveKey(doPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 1);
                    SecretKey deriveKey2 = Util.deriveKey(doPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 2);
                    byte[] doPACEStep4 = doPACEStep4(str, mappingType, doPACEStep3GenerateKeyPair, doPACEStep3ExchangePublicKeys, deriveKey2);
                    try {
                        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
                        long sendSequenceCounter = secureMessagingWrapper == null ? 0L : secureMessagingWrapper.getSendSequenceCounter();
                        if (cipherAlgorithm.startsWith("DESede")) {
                            this.wrapper = new DESedeSecureMessagingWrapper(deriveKey, deriveKey2, this.maxTranceiveLengthForSecureMessaging, this.shouldCheckMAC, 0L);
                        } else if (!cipherAlgorithm.startsWith("AES")) {
                            LOGGER.warning("Unsupported cipher algorithm ".concat(cipherAlgorithm));
                        } else {
                            this.wrapper = new AESSecureMessagingWrapper(deriveKey, deriveKey2, this.maxTranceiveLengthForSecureMessaging, this.shouldCheckMAC, sendSequenceCounter);
                        }
                        if (PACEInfo.MappingType.CAM.equals(mappingType)) {
                            if (doPACEStep4 == null) {
                                LOGGER.warning("Encrypted Chip Authentication data is null");
                            }
                            try {
                                Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
                                cipher2.init(2, deriveKey, new IvParameterSpec(IV_FOR_PACE_CAM_DECRYPTION));
                                bArr = Util.unpad(cipher2.doFinal(doPACEStep4));
                            } catch (GeneralSecurityException e10) {
                                LOGGER.log(Level.WARNING, "Could not decrypt Chip Authentication data", (Throwable) e10);
                                bArr = null;
                            }
                            return new PACECAMResult(accessKeySpec, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, doPACEStep2, doPACEStep3GenerateKeyPair, doPACEStep3ExchangePublicKeys, doPACEStep4, bArr, this.wrapper);
                        }
                        return new PACEResult(accessKeySpec, mappingType, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, doPACEStep2, doPACEStep3GenerateKeyPair, doPACEStep3ExchangePublicKeys, this.wrapper);
                    } catch (GeneralSecurityException e11) {
                        throw new CardServiceProtocolException("Security exception in secure messaging establishment", 4, e11);
                    }
                } catch (GeneralSecurityException e12) {
                    throw new CardServiceProtocolException("Security exception during secure messaging key derivation", 3, e12);
                }
            } catch (CardServiceException e13) {
                throw new CardServiceProtocolException("PICC side error in static PACE key derivation step", 0, e13);
            } catch (Exception e14) {
                throw new CardServiceProtocolException("PCD side error in static PACE key derivation step", 0, e14);
            }
        } catch (GeneralSecurityException e15) {
            throw new CardServiceProtocolException("PCD side error in static cipher construction during key derivation step", 0, e15);
        }
    }

    private static byte[] generateAuthenticationToken(String str, Mac mac, PublicKey publicKey) {
        byte[] doFinal = mac.doFinal(encodePublicKeyDataObject(str, publicKey));
        byte[] bArr = new byte[8];
        System.arraycopy(doFinal, 0, bArr, 0, 8);
        return bArr;
    }

    public static byte[] computeKeySeedForPACE(String str) {
        return Util.computeKeySeed(str, McElieceCCA2KeyGenParameterSpec.SHA1, false);
    }

    private static byte[] computeKeySeedForPACE(String str, String str2, String str3) {
        return Util.computeKeySeed(str, str2, str3, McElieceCCA2KeyGenParameterSpec.SHA1, false);
    }
}

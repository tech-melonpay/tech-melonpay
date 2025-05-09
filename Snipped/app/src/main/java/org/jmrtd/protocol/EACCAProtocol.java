package org.jmrtd.protocol;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.tlv.TLVUtil;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.APDULevelEACCACapable;
import org.jmrtd.CardServiceProtocolException;
import org.jmrtd.Util;
import org.jmrtd.lds.ChipAuthenticationInfo;
import org.jmrtd.lds.SecurityInfo;
import s3.b;

/* loaded from: classes3.dex */
public class EACCAProtocol {
    private static final int COMMAND_CHAINING_CHUNK_SIZE = 223;
    private int maxTranceiveLength;
    private APDULevelEACCACapable service;
    private boolean shouldCheckMAC;
    private SecureMessagingWrapper wrapper;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final Provider BC_PROVIDER = Util.getBouncyCastleProvider();

    public EACCAProtocol(APDULevelEACCACapable aPDULevelEACCACapable, SecureMessagingWrapper secureMessagingWrapper, int i, boolean z10) {
        this.service = aPDULevelEACCACapable;
        this.wrapper = secureMessagingWrapper;
        this.maxTranceiveLength = i;
        this.shouldCheckMAC = z10;
    }

    public static byte[] computeSharedSecret(String str, PublicKey publicKey, PrivateKey privateKey) {
        KeyAgreement keyAgreement = KeyAgreement.getInstance(str, BC_PROVIDER);
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        return keyAgreement.generateSecret();
    }

    private static byte[] getKeyData(String str, PublicKey publicKey) {
        if ("DH".equals(str)) {
            return Util.i2os(((DHPublicKey) publicKey).getY());
        }
        if ("ECDH".equals(str)) {
            return ((ECPublicKey) publicKey).getQ().getEncoded(false);
        }
        throw new IllegalArgumentException(b.j("Unsupported agreement algorithm ", str));
    }

    public static byte[] getKeyHash(String str, PublicKey publicKey) {
        if ("DH".equals(str) || (publicKey instanceof DHPublicKey)) {
            return MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(getKeyData(str, publicKey));
        }
        if (!"ECDH".equals(str) && !(publicKey instanceof java.security.interfaces.ECPublicKey)) {
            throw new IllegalArgumentException(b.j("Unsupported agreement algorithm ", str));
        }
        return Util.alignKeyDataToSize(Util.i2os(((ECPublicKey) publicKey).getQ().getAffineXCoord().toBigInteger()), (int) Math.ceil(r5.getParameters().getCurve().getFieldSize() / 8.0d));
    }

    private static String inferChipAuthenticationOIDfromPublicKeyOID(String str) {
        if (SecurityInfo.ID_PK_ECDH.equals(str)) {
            LOGGER.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-ECDH-3DES-CBC-CBC");
            return SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC;
        }
        if (SecurityInfo.ID_PK_DH.equals(str)) {
            LOGGER.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-DH-3DES-CBC-CBC");
            return SecurityInfo.ID_CA_DH_3DES_CBC_CBC;
        }
        LOGGER.warning("No ChipAuthenticationInfo and unsupported ChipAuthenticationPublicKeyInfo public key OID " + str);
        return null;
    }

    public static SecureMessagingWrapper restartSecureMessaging(String str, byte[] bArr, int i, boolean z10) {
        String cipherAlgorithm = ChipAuthenticationInfo.toCipherAlgorithm(str);
        int keyLength = ChipAuthenticationInfo.toKeyLength(str);
        SecretKey deriveKey = Util.deriveKey(bArr, cipherAlgorithm, keyLength, 1);
        SecretKey deriveKey2 = Util.deriveKey(bArr, cipherAlgorithm, keyLength, 2);
        if (cipherAlgorithm.startsWith("DESede")) {
            return new DESedeSecureMessagingWrapper(deriveKey, deriveKey2, i, z10, 0L);
        }
        if (cipherAlgorithm.startsWith("AES")) {
            return new AESSecureMessagingWrapper(deriveKey, deriveKey2, i, z10, 0L);
        }
        throw new IllegalStateException("Unsupported cipher algorithm ".concat(cipherAlgorithm));
    }

    private static void sendGeneralAuthenticate(APDULevelEACCACapable aPDULevelEACCACapable, SecureMessagingWrapper secureMessagingWrapper, byte[] bArr) {
        try {
            aPDULevelEACCACapable.sendGeneralAuthenticate(secureMessagingWrapper, bArr, true);
        } catch (CardServiceException e10) {
            LOGGER.log(Level.WARNING, "Failed to send GENERAL AUTHENTICATE, falling back to command chaining", (Throwable) e10);
            List<byte[]> partition = Util.partition(223, bArr);
            Iterator<byte[]> it = partition.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                aPDULevelEACCACapable.sendGeneralAuthenticate(secureMessagingWrapper, it.next(), i >= partition.size());
            }
        }
    }

    public static void sendPublicKey(APDULevelEACCACapable aPDULevelEACCACapable, SecureMessagingWrapper secureMessagingWrapper, String str, BigInteger bigInteger, PublicKey publicKey) {
        String keyAgreementAlgorithm = ChipAuthenticationInfo.toKeyAgreementAlgorithm(str);
        String cipherAlgorithm = ChipAuthenticationInfo.toCipherAlgorithm(str);
        byte[] keyData = getKeyData(keyAgreementAlgorithm, publicKey);
        if (cipherAlgorithm.startsWith("DESede")) {
            try {
                aPDULevelEACCACapable.sendMSEKAT(secureMessagingWrapper, TLVUtil.wrapDO(145, keyData), bigInteger != null ? TLVUtil.wrapDO(132, Util.i2os(bigInteger)) : null);
            } catch (Exception e10) {
                throw new CardServiceProtocolException("Exception during MSE KAT", 1, e10);
            }
        } else {
            if (!cipherAlgorithm.startsWith("AES")) {
                throw new IllegalStateException("Cannot set up secure channel with cipher ".concat(cipherAlgorithm));
            }
            try {
                aPDULevelEACCACapable.sendMSESetATIntAuth(secureMessagingWrapper, str, bigInteger);
                try {
                    sendGeneralAuthenticate(aPDULevelEACCACapable, secureMessagingWrapper, TLVUtil.wrapDO(128, keyData));
                } catch (Exception e11) {
                    throw new CardServiceProtocolException("Exception during General Authenticate", 2, e11);
                }
            } catch (Exception e12) {
                throw new CardServiceProtocolException("Exception during MSE Set AT Int Auth", 1, e12);
            }
        }
    }

    public EACCAResult doCA(BigInteger bigInteger, String str, String str2, PublicKey publicKey) {
        if (publicKey == null) {
            throw new IllegalArgumentException("PICC public key is null");
        }
        String keyAgreementAlgorithm = ChipAuthenticationInfo.toKeyAgreementAlgorithm(str);
        if (keyAgreementAlgorithm == null) {
            throw new IllegalArgumentException("Unknown agreement algorithm");
        }
        if (!"ECDH".equals(keyAgreementAlgorithm) && !"DH".equals(keyAgreementAlgorithm)) {
            throw new IllegalArgumentException("Unsupported agreement algorithm, expected ECDH or DH, found ".concat(keyAgreementAlgorithm));
        }
        if (str == null) {
            str = inferChipAuthenticationOIDfromPublicKeyOID(str2);
        }
        try {
            AlgorithmParameterSpec params = "DH".equals(keyAgreementAlgorithm) ? ((DHPublicKey) publicKey).getParams() : "ECDH".equals(keyAgreementAlgorithm) ? ((java.security.interfaces.ECPublicKey) publicKey).getParams() : null;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(keyAgreementAlgorithm, BC_PROVIDER);
            keyPairGenerator.initialize(params);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey2 = generateKeyPair.getPublic();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            sendPublicKey(this.service, this.wrapper, str, bigInteger, publicKey2);
            byte[] keyHash = getKeyHash(keyAgreementAlgorithm, publicKey2);
            SecureMessagingWrapper restartSecureMessaging = restartSecureMessaging(str, computeSharedSecret(keyAgreementAlgorithm, publicKey, privateKey), this.maxTranceiveLength, this.shouldCheckMAC);
            this.wrapper = restartSecureMessaging;
            return new EACCAResult(bigInteger, publicKey, keyHash, publicKey2, privateKey, restartSecureMessaging);
        } catch (GeneralSecurityException e10) {
            throw new CardServiceException("Security exception during Chip Authentication", e10);
        }
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }
}

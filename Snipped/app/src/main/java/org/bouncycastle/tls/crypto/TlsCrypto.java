package org.bouncycastle.tls.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

/* loaded from: classes3.dex */
public interface TlsCrypto {
    TlsSecret adoptSecret(TlsSecret tlsSecret);

    TlsCertificate createCertificate(byte[] bArr);

    TlsDHDomain createDHDomain(TlsDHConfig tlsDHConfig);

    TlsECDomain createECDomain(TlsECConfig tlsECConfig);

    TlsHMAC createHMAC(int i);

    TlsHMAC createHMAC(short s10);

    TlsHash createHash(short s10);

    TlsNonceGenerator createNonceGenerator(byte[] bArr);

    TlsSRP6Client createSRP6Client(TlsSRPConfig tlsSRPConfig);

    TlsSRP6Server createSRP6Server(TlsSRPConfig tlsSRPConfig, BigInteger bigInteger);

    TlsSRP6VerifierGenerator createSRP6VerifierGenerator(TlsSRPConfig tlsSRPConfig);

    TlsSecret createSecret(byte[] bArr);

    TlsSecret generateRSAPreMasterSecret(ProtocolVersion protocolVersion);

    SecureRandom getSecureRandom();

    boolean hasAllRawSignatureAlgorithms();

    boolean hasDHAgreement();

    boolean hasECDHAgreement();

    boolean hasEncryptionAlgorithm(int i);

    boolean hasHashAlgorithm(short s10);

    boolean hasMacAlgorithm(int i);

    boolean hasNamedGroup(int i);

    boolean hasRSAEncryption();

    boolean hasSRPAuthentication();

    boolean hasSignatureAlgorithm(short s10);

    boolean hasSignatureAndHashAlgorithm(SignatureAndHashAlgorithm signatureAndHashAlgorithm);

    TlsSecret hkdfInit(short s10);
}

package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class JceDefaultTlsCredentialedDecryptor implements TlsCredentialedDecryptor {
    protected Certificate certificate;
    protected JcaTlsCrypto crypto;
    protected PrivateKey privateKey;

    public JceDefaultTlsCredentialedDecryptor(JcaTlsCrypto jcaTlsCrypto, Certificate certificate, PrivateKey privateKey) {
        if (jcaTlsCrypto == null) {
            throw new IllegalArgumentException("'crypto' cannot be null");
        }
        if (certificate == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        }
        if (certificate.isEmpty()) {
            throw new IllegalArgumentException("'certificate' cannot be empty");
        }
        if (privateKey == null) {
            throw new IllegalArgumentException("'privateKey' cannot be null");
        }
        if (!(privateKey instanceof RSAPrivateKey) && !"RSA".equals(privateKey.getAlgorithm())) {
            throw new IllegalArgumentException("'privateKey' type not supported: ".concat(privateKey.getClass().getName()));
        }
        this.crypto = jcaTlsCrypto;
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    @Override // org.bouncycastle.tls.TlsCredentialedDecryptor
    public TlsSecret decrypt(TlsCryptoParameters tlsCryptoParameters, byte[] bArr) {
        return safeDecryptPreMasterSecret(tlsCryptoParameters, this.privateKey, bArr);
    }

    @Override // org.bouncycastle.tls.TlsCredentials
    public Certificate getCertificate() {
        return this.certificate;
    }

    public TlsSecret safeDecryptPreMasterSecret(TlsCryptoParameters tlsCryptoParameters, PrivateKey privateKey, byte[] bArr) {
        SecureRandom secureRandom = this.crypto.getSecureRandom();
        ProtocolVersion clientVersion = tlsCryptoParameters.getClientVersion();
        byte[] bArr2 = new byte[48];
        secureRandom.nextBytes(bArr2);
        byte[] clone = Arrays.clone(bArr2);
        try {
            Cipher createRSAEncryptionCipher = this.crypto.createRSAEncryptionCipher();
            createRSAEncryptionCipher.init(2, privateKey);
            byte[] doFinal = createRSAEncryptionCipher.doFinal(bArr);
            if (doFinal != null) {
                if (doFinal.length == 48) {
                    clone = doFinal;
                }
            }
        } catch (Exception unused) {
        }
        int minorVersion = (clientVersion.getMinorVersion() ^ (clone[1] & 255)) | (clientVersion.getMajorVersion() ^ (clone[0] & 255));
        int i = minorVersion | (minorVersion >> 1);
        int i9 = i | (i >> 2);
        int i10 = ~(((i9 | (i9 >> 4)) & 1) - 1);
        for (int i11 = 0; i11 < 48; i11++) {
            clone[i11] = (byte) ((clone[i11] & (~i10)) | (bArr2[i11] & i10));
        }
        return this.crypto.createSecret(clone);
    }
}

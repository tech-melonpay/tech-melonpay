package org.bouncycastle.pkcs.bc;

import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.io.CipherOutputStream;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OutputEncryptor;

/* loaded from: classes3.dex */
public class BcPKCS12PBEOutputEncryptorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private ExtendedDigest digest;
    private BufferedBlockCipher engine;
    private int iterationCount;
    private SecureRandom random;

    public BcPKCS12PBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, BlockCipher blockCipher) {
        this(aSN1ObjectIdentifier, blockCipher, new SHA1Digest());
    }

    public OutputEncryptor build(final char[] cArr) {
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        byte[] bArr = new byte[20];
        this.random.nextBytes(bArr);
        final PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, this.iterationCount);
        this.engine.init(true, PKCS12PBEUtils.createCipherParameters(this.algorithm, this.digest, this.engine.getBlockSize(), pKCS12PBEParams, cArr));
        return new OutputEncryptor() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.1
            @Override // org.bouncycastle.operator.OutputEncryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams);
            }

            @Override // org.bouncycastle.operator.OutputEncryptor
            public GenericKey getKey() {
                return new GenericKey(new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams), PBEParametersGenerator.PKCS12PasswordToBytes(cArr));
            }

            @Override // org.bouncycastle.operator.OutputEncryptor
            public OutputStream getOutputStream(OutputStream outputStream) {
                return new CipherOutputStream(outputStream, BcPKCS12PBEOutputEncryptorBuilder.this.engine);
            }
        };
    }

    public BcPKCS12PBEOutputEncryptorBuilder setIterationCount(int i) {
        this.iterationCount = i;
        return this;
    }

    public BcPKCS12PBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, BlockCipher blockCipher, ExtendedDigest extendedDigest) {
        this.iterationCount = 1024;
        this.algorithm = aSN1ObjectIdentifier;
        this.engine = new PaddedBufferedBlockCipher(blockCipher, new PKCS7Padding());
        this.digest = extendedDigest;
    }
}

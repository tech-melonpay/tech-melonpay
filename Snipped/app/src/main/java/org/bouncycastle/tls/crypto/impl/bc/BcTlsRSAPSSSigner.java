package org.bouncycastle.tls.crypto.impl.bc;

import java.io.OutputStream;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public class BcTlsRSAPSSSigner extends BcTlsSigner {
    private final short signatureAlgorithm;

    public BcTlsRSAPSSSigner(BcTlsCrypto bcTlsCrypto, RSAKeyParameters rSAKeyParameters, short s10) {
        super(bcTlsCrypto, rSAKeyParameters);
        if (!SignatureAlgorithm.isRSAPSS(s10)) {
            throw new IllegalArgumentException("signatureAlgorithm");
        }
        this.signatureAlgorithm = s10;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsSigner, org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != this.signatureAlgorithm || signatureAndHashAlgorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        short rSAPSSHashAlgorithm = SignatureAlgorithm.getRSAPSSHashAlgorithm(this.signatureAlgorithm);
        PSSSigner pSSSigner = new PSSSigner(new RSABlindedEngine(), this.crypto.createDigest(rSAPSSHashAlgorithm), HashAlgorithm.getOutputSize(rSAPSSHashAlgorithm));
        pSSSigner.init(true, new ParametersWithRandom(this.privateKey, this.crypto.getSecureRandom()));
        final SignerOutputStream signerOutputStream = new SignerOutputStream(pSSSigner);
        return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsRSAPSSSigner.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public OutputStream getOutputStream() {
                return signerOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public byte[] getSignature() {
                try {
                    return signerOutputStream.getSigner().generateSignature();
                } catch (CryptoException e10) {
                    throw new TlsFatalAlert((short) 80, e10);
                }
            }
        };
    }
}

package org.bouncycastle.tls.crypto.impl.bc;

import java.io.OutputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

/* loaded from: classes3.dex */
public class BcTlsRSAPSSVerifier extends BcTlsVerifier {
    private final short signatureAlgorithm;

    public BcTlsRSAPSSVerifier(BcTlsCrypto bcTlsCrypto, RSAKeyParameters rSAKeyParameters, short s10) {
        super(bcTlsCrypto, rSAKeyParameters);
        if (!SignatureAlgorithm.isRSAPSS(s10)) {
            throw new IllegalArgumentException("signatureAlgorithm");
        }
        this.signatureAlgorithm = s10;
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsVerifier, org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != this.signatureAlgorithm || algorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        Digest createDigest = this.crypto.createDigest(SignatureAlgorithm.getRSAPSSHashAlgorithm(this.signatureAlgorithm));
        PSSSigner pSSSigner = new PSSSigner(new RSAEngine(), createDigest, createDigest.getDigestSize());
        pSSSigner.init(false, this.publicKey);
        final byte[] signature = digitallySigned.getSignature();
        final SignerOutputStream signerOutputStream = new SignerOutputStream(pSSSigner);
        return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsRSAPSSVerifier.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public OutputStream getOutputStream() {
                return signerOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public boolean isVerified() {
                return signerOutputStream.getSigner().verifySignature(signature);
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}

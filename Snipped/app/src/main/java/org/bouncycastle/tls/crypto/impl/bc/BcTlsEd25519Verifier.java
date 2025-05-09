package org.bouncycastle.tls.crypto.impl.bc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

/* loaded from: classes3.dex */
public class BcTlsEd25519Verifier extends BcTlsVerifier {
    public BcTlsEd25519Verifier(BcTlsCrypto bcTlsCrypto, Ed25519PublicKeyParameters ed25519PublicKeyParameters) {
        super(bcTlsCrypto, ed25519PublicKeyParameters);
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsVerifier, org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != 7 || algorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final byte[] signature = digitallySigned.getSignature();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsEd25519Verifier.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public OutputStream getOutputStream() {
                return byteArrayOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public boolean isVerified() {
                byte[] bArr = new byte[32];
                ((Ed25519PublicKeyParameters) BcTlsEd25519Verifier.this.publicKey).encode(bArr, 0);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return Ed25519.verify(signature, 0, bArr, 0, byteArray, 0, byteArray.length);
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}

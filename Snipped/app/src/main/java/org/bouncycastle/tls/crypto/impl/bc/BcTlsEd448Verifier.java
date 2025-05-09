package org.bouncycastle.tls.crypto.impl.bc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

/* loaded from: classes3.dex */
public class BcTlsEd448Verifier extends BcTlsVerifier {
    public BcTlsEd448Verifier(BcTlsCrypto bcTlsCrypto, Ed448PublicKeyParameters ed448PublicKeyParameters) {
        super(bcTlsCrypto, ed448PublicKeyParameters);
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsVerifier, org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != 8 || algorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final byte[] signature = digitallySigned.getSignature();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsEd448Verifier.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public OutputStream getOutputStream() {
                return byteArrayOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
            public boolean isVerified() {
                byte[] bArr = new byte[57];
                ((Ed448PublicKeyParameters) BcTlsEd448Verifier.this.publicKey).encode(bArr, 0);
                byte[] bArr2 = TlsUtils.EMPTY_BYTES;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return Ed448.verify(signature, 0, bArr, 0, bArr2, byteArray, 0, byteArray.length);
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}

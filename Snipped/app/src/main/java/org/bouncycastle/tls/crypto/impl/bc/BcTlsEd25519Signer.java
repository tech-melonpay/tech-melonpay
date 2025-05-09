package org.bouncycastle.tls.crypto.impl.bc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public class BcTlsEd25519Signer extends BcTlsSigner {
    protected final Ed25519PublicKeyParameters publicKey;

    public BcTlsEd25519Signer(BcTlsCrypto bcTlsCrypto, Ed25519PrivateKeyParameters ed25519PrivateKeyParameters, Ed25519PublicKeyParameters ed25519PublicKeyParameters) {
        super(bcTlsCrypto, ed25519PrivateKeyParameters);
        this.publicKey = ed25519PublicKeyParameters == null ? ed25519PrivateKeyParameters.generatePublicKey() : ed25519PublicKeyParameters;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsSigner, org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != 7 || signatureAndHashAlgorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsEd25519Signer.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public OutputStream getOutputStream() {
                return byteArrayOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public byte[] getSignature() {
                byte[] bArr = new byte[32];
                ((Ed25519PrivateKeyParameters) BcTlsEd25519Signer.this.privateKey).encode(bArr, 0);
                byte[] encoded = BcTlsEd25519Signer.this.publicKey.getEncoded();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byte[] bArr2 = new byte[64];
                Ed25519.sign(bArr, 0, encoded, 0, byteArray, 0, byteArray.length, bArr2, 0);
                Arrays.fill(bArr, (byte) 0);
                return bArr2;
            }
        };
    }
}

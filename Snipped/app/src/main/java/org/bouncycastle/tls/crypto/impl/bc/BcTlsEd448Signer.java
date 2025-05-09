package org.bouncycastle.tls.crypto.impl.bc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public class BcTlsEd448Signer extends BcTlsSigner {
    protected final Ed448PublicKeyParameters publicKey;

    public BcTlsEd448Signer(BcTlsCrypto bcTlsCrypto, Ed448PrivateKeyParameters ed448PrivateKeyParameters, Ed448PublicKeyParameters ed448PublicKeyParameters) {
        super(bcTlsCrypto, ed448PrivateKeyParameters);
        this.publicKey = ed448PublicKeyParameters == null ? ed448PrivateKeyParameters.generatePublicKey() : ed448PublicKeyParameters;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsSigner, org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != 8 || signatureAndHashAlgorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.bc.BcTlsEd448Signer.1
            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public OutputStream getOutputStream() {
                return byteArrayOutputStream;
            }

            @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
            public byte[] getSignature() {
                byte[] bArr = new byte[57];
                ((Ed448PrivateKeyParameters) BcTlsEd448Signer.this.privateKey).encode(bArr, 0);
                byte[] encoded = BcTlsEd448Signer.this.publicKey.getEncoded();
                byte[] bArr2 = TlsUtils.EMPTY_BYTES;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byte[] bArr3 = new byte[114];
                Ed448.sign(bArr, 0, encoded, 0, bArr2, byteArray, 0, byteArray.length, bArr3, 0);
                Arrays.fill(bArr, (byte) 0);
                return bArr3;
            }
        };
    }
}

package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

/* loaded from: classes3.dex */
public abstract class JcaTlsDSSVerifier implements TlsVerifier {
    protected final String algorithmName;
    protected final short algorithmType;
    protected final JcaTlsCrypto crypto;
    protected final PublicKey publicKey;

    public JcaTlsDSSVerifier(JcaTlsCrypto jcaTlsCrypto, PublicKey publicKey, short s10, String str) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (publicKey == null) {
            throw new NullPointerException("publicKey");
        }
        this.crypto = jcaTlsCrypto;
        this.publicKey = publicKey;
        this.algorithmType = s10;
        this.algorithmName = str;
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        return null;
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm != null && algorithm.getSignature() != this.algorithmType) {
            throw new IllegalStateException();
        }
        try {
            Signature createSignature = this.crypto.getHelper().createSignature(this.algorithmName);
            createSignature.initVerify(this.publicKey);
            if (algorithm == null) {
                createSignature.update(bArr, 16, 20);
            } else {
                createSignature.update(bArr, 0, bArr.length);
            }
            return createSignature.verify(digitallySigned.getSignature());
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to process signature: ")), e10);
        }
    }
}

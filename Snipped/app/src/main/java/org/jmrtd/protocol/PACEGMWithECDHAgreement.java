package org.jmrtd.protocol;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import org.jmrtd.Util;

/* loaded from: classes3.dex */
public class PACEGMWithECDHAgreement {
    private ECPrivateKey privateKey;

    public ECPoint doPhase(PublicKey publicKey) {
        if (this.privateKey == null) {
            throw new IllegalStateException("Not initialized!");
        }
        if (!(publicKey instanceof ECPublicKey)) {
            throw new InvalidKeyException("Not an ECPublicKey");
        }
        org.bouncycastle.math.ec.ECPoint normalize = Util.toBouncyECPublicKeyParameters((ECPublicKey) publicKey).getQ().multiply(Util.toBouncyECPrivateKeyParameters(this.privateKey).getD()).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalStateException("Infinity");
        }
        return Util.fromBouncyCastleECPoint(normalize);
    }

    public void init(PrivateKey privateKey) {
        if (!(privateKey instanceof ECPrivateKey)) {
            throw new InvalidKeyException("Not an ECPrivateKey");
        }
        this.privateKey = (ECPrivateKey) privateKey;
    }
}

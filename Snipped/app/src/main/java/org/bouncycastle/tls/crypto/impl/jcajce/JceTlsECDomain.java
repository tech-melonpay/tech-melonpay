package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;

/* loaded from: classes3.dex */
public class JceTlsECDomain implements TlsECDomain {
    protected final JcaTlsCrypto crypto;
    protected final TlsECConfig ecConfig;
    protected ECCurve ecCurve;
    protected ECGenParameterSpec ecGenSpec;
    protected ECParameterSpec ecParameterSpec;

    public JceTlsECDomain(JcaTlsCrypto jcaTlsCrypto, TlsECConfig tlsECConfig) {
        this.crypto = jcaTlsCrypto;
        this.ecConfig = tlsECConfig;
        init(tlsECConfig.getNamedGroup());
    }

    private static ECCurve convertCurve(EllipticCurve ellipticCurve, BigInteger bigInteger, int i) {
        ECField field = ellipticCurve.getField();
        BigInteger a10 = ellipticCurve.getA();
        BigInteger b9 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            return new ECCurve.Fp(((ECFieldFp) field).getP(), a10, b9, bigInteger, BigInteger.valueOf(i));
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m2 = eCFieldF2m.getM();
        int[] convertMidTerms = convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new ECCurve.F2m(m2, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a10, b9, bigInteger, BigInteger.valueOf(i));
    }

    private static int[] convertMidTerms(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else {
            if (iArr.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            int i9 = iArr[0];
            int i10 = iArr[1];
            if (i9 >= i10 || i9 >= (i = iArr[2])) {
                int i11 = iArr[2];
                if (i10 < i11) {
                    iArr2[0] = i10;
                    int i12 = iArr[0];
                    if (i12 < i11) {
                        iArr2[1] = i12;
                        iArr2[2] = i11;
                    } else {
                        iArr2[1] = i11;
                        iArr2[2] = i12;
                    }
                } else {
                    iArr2[0] = i11;
                    int i13 = iArr[0];
                    if (i13 < i10) {
                        iArr2[1] = i13;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i10;
                        iArr2[2] = i13;
                    }
                }
            } else {
                iArr2[0] = i9;
                if (i10 < i) {
                    iArr2[1] = i10;
                    iArr2[2] = i;
                } else {
                    iArr2[1] = i;
                    iArr2[2] = iArr[1];
                }
            }
        }
        return iArr2;
    }

    private void init(int i) {
        String name;
        this.ecCurve = null;
        this.ecGenSpec = null;
        this.ecParameterSpec = null;
        if (NamedGroup.refersToASpecificCurve(i) && (name = NamedGroup.getName(i)) != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.crypto.getHelper().createAlgorithmParameters("EC");
                ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec(name);
                this.ecGenSpec = eCGenParameterSpec;
                try {
                    createAlgorithmParameters.init(eCGenParameterSpec);
                    ECParameterSpec eCParameterSpec = (ECParameterSpec) createAlgorithmParameters.getParameterSpec(ECParameterSpec.class);
                    this.ecCurve = convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
                    this.ecParameterSpec = eCParameterSpec;
                } catch (Exception unused) {
                    KeyPairGenerator createKeyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("EC");
                    createKeyPairGenerator.initialize(this.ecGenSpec, this.crypto.getSecureRandom());
                    ECParameterSpec params = ((ECPrivateKey) createKeyPairGenerator.generateKeyPair().getPrivate()).getParams();
                    this.ecCurve = convertCurve(params.getCurve(), params.getOrder(), params.getCofactor());
                    this.ecParameterSpec = params;
                }
            } catch (GeneralSecurityException e10) {
                throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to create key pair: ")), e10);
            }
        }
    }

    public JceTlsSecret calculateECDHAgreement(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            return this.crypto.adoptLocalSecret(this.crypto.calculateKeyAgreement("ECDH", eCPrivateKey, eCPublicKey, "TlsPremasterSecret"));
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException("cannot calculate secret", e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsECDomain
    public TlsAgreement createECDH() {
        return new JceTlsECDH(this);
    }

    public ECPoint decodePoint(byte[] bArr) {
        return this.ecCurve.decodePoint(bArr);
    }

    public ECPublicKey decodePublicKey(byte[] bArr) {
        try {
            KeyFactory createKeyFactory = this.crypto.getHelper().createKeyFactory("EC");
            ECPoint decodePoint = decodePoint(bArr);
            return (ECPublicKey) createKeyFactory.generatePublic(new ECPublicKeySpec(new java.security.spec.ECPoint(decodePoint.getAffineXCoord().toBigInteger(), decodePoint.getAffineYCoord().toBigInteger()), this.ecParameterSpec));
        } catch (Exception e10) {
            throw new TlsFatalAlert((short) 47, e10);
        }
    }

    public byte[] encodePoint(ECPoint eCPoint) {
        return eCPoint.getEncoded(false);
    }

    public byte[] encodePublicKey(ECPublicKey eCPublicKey) {
        java.security.spec.ECPoint w2 = eCPublicKey.getW();
        return encodePoint(this.ecCurve.createPoint(w2.getAffineX(), w2.getAffineY()));
    }

    public KeyPair generateKeyPair() {
        try {
            KeyPairGenerator createKeyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("EC");
            createKeyPairGenerator.initialize(this.ecGenSpec, this.crypto.getSecureRandom());
            return createKeyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to create key pair: ")), e10);
        }
    }
}

package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Arrays;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class JceTlsDHDomain implements TlsDHDomain {
    protected final JcaTlsCrypto crypto;
    protected final TlsDHConfig dhConfig;
    protected final DHParameterSpec dhParameterSpec;

    public JceTlsDHDomain(JcaTlsCrypto jcaTlsCrypto, TlsDHConfig tlsDHConfig) {
        this.crypto = jcaTlsCrypto;
        this.dhConfig = tlsDHConfig;
        this.dhParameterSpec = getParameters(tlsDHConfig);
    }

    private static byte[] encodeValue(DHParameterSpec dHParameterSpec, boolean z10, BigInteger bigInteger) {
        return z10 ? BigIntegers.asUnsignedByteArray(getValueLength(dHParameterSpec), bigInteger) : BigIntegers.asUnsignedByteArray(bigInteger);
    }

    public static DHParameterSpec getParameters(TlsDHConfig tlsDHConfig) {
        DHGroup dHGroup = TlsDHUtils.getDHGroup(tlsDHConfig);
        if (dHGroup != null) {
            return new DHParameterSpec(dHGroup.getP(), dHGroup.getG(), dHGroup.getL());
        }
        throw new IllegalArgumentException("No DH configuration provided");
    }

    private static int getValueLength(DHParameterSpec dHParameterSpec) {
        return (dHParameterSpec.getP().bitLength() + 7) / 8;
    }

    public JceTlsSecret calculateDHAgreement(DHPrivateKey dHPrivateKey, DHPublicKey dHPublicKey) {
        return calculateDHAgreement(this.crypto, dHPrivateKey, dHPublicKey, this.dhConfig.isPadded());
    }

    @Override // org.bouncycastle.tls.crypto.TlsDHDomain
    public TlsAgreement createDH() {
        return new JceTlsDH(this);
    }

    public BigInteger decodeParameter(byte[] bArr) {
        if (!this.dhConfig.isPadded() || getValueLength(this.dhParameterSpec) == bArr.length) {
            return new BigInteger(1, bArr);
        }
        throw new TlsFatalAlert((short) 47);
    }

    public DHPublicKey decodePublicKey(byte[] bArr) {
        try {
            return (DHPublicKey) this.crypto.getHelper().createKeyFactory("DH").generatePublic(new DHPublicKeySpec(decodeParameter(bArr), this.dhParameterSpec.getP(), this.dhParameterSpec.getG()));
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 40, e11);
        }
    }

    public byte[] encodeParameter(BigInteger bigInteger) {
        return encodeValue(this.dhParameterSpec, this.dhConfig.isPadded(), bigInteger);
    }

    public byte[] encodePublicKey(DHPublicKey dHPublicKey) {
        return encodeValue(this.dhParameterSpec, true, dHPublicKey.getY());
    }

    public KeyPair generateKeyPair() {
        try {
            KeyPairGenerator createKeyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("DH");
            createKeyPairGenerator.initialize(this.dhParameterSpec, this.crypto.getSecureRandom());
            return createKeyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException("unable to create key pair", e10);
        }
    }

    public static JceTlsSecret calculateDHAgreement(JcaTlsCrypto jcaTlsCrypto, DHPrivateKey dHPrivateKey, DHPublicKey dHPublicKey, boolean z10) {
        try {
            byte[] calculateKeyAgreement = jcaTlsCrypto.calculateKeyAgreement("DH", dHPrivateKey, dHPublicKey, "TlsPremasterSecret");
            if (z10) {
                int valueLength = getValueLength(dHPrivateKey.getParams());
                byte[] bArr = new byte[valueLength];
                System.arraycopy(calculateKeyAgreement, 0, bArr, valueLength - calculateKeyAgreement.length, calculateKeyAgreement.length);
                Arrays.fill(calculateKeyAgreement, (byte) 0);
                calculateKeyAgreement = bArr;
            }
            return jcaTlsCrypto.adoptLocalSecret(calculateKeyAgreement);
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException("cannot calculate secret", e10);
        }
    }
}

package org.bouncycastle.pqc.jcajce.provider.sphincsplus;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusKey;
import org.bouncycastle.pqc.jcajce.spec.SPHINCSPlusParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BCSPHINCSPlusPrivateKey implements PrivateKey, SPHINCSPlusKey {
    private static final long serialVersionUID = 1;
    private transient ASN1Set attributes;
    private transient SPHINCSPlusPrivateKeyParameters params;

    public BCSPHINCSPlusPrivateKey(PrivateKeyInfo privateKeyInfo) {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) {
        this.attributes = privateKeyInfo.getAttributes();
        this.params = (SPHINCSPlusPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCSPHINCSPlusPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCSPHINCSPlusPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public CipherParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusKey
    public SPHINCSPlusParameterSpec getParameterSpec() {
        return SPHINCSPlusParameterSpec.fromName(this.params.getParameters().getName());
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public BCSPHINCSPlusPrivateKey(SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters) {
        this.params = sPHINCSPlusPrivateKeyParameters;
    }
}

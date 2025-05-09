package org.ejbca.cvc;

import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes3.dex */
public class PublicKeyRSA extends CVCPublicKey implements RSAPublicKey {
    private static CVCTagEnum[] allowedFields = {CVCTagEnum.OID, CVCTagEnum.MODULUS, CVCTagEnum.EXPONENT};
    private static final long serialVersionUID = 1;

    public PublicKeyRSA(GenericPublicKeyField genericPublicKeyField) {
        ByteField byteField = (ByteField) genericPublicKeyField.getSubfield(CVCTagEnum.MODULUS);
        byteField.setShowBitLength(true);
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.OID));
        addSubfield(byteField);
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.EXPONENT));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public CVCTagEnum[] getAllowedFields() {
        return allowedFields;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "CVC";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        try {
            return new BigInteger(1, ((ByteField) getSubfield(CVCTagEnum.MODULUS)).getData());
        } catch (NoSuchFieldException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        try {
            return new BigInteger(1, ((ByteField) getSubfield(CVCTagEnum.EXPONENT)).getData());
        } catch (NoSuchFieldException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public PublicKeyRSA(OIDField oIDField, RSAPublicKey rSAPublicKey) {
        addSubfield(oIDField);
        addSubfield(new ByteField(CVCTagEnum.MODULUS, CVCObject.trimByteArray(rSAPublicKey.getModulus().toByteArray()), true));
        addSubfield(new ByteField(CVCTagEnum.EXPONENT, CVCObject.trimByteArray(rSAPublicKey.getPublicExponent().toByteArray())));
    }
}

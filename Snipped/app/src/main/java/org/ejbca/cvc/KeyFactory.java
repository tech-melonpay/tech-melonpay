package org.ejbca.cvc;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: classes3.dex */
public class KeyFactory {
    private static void copyField(CVCTagEnum cVCTagEnum, CVCTagEnum cVCTagEnum2, GenericPublicKeyField genericPublicKeyField) {
        ByteField byteField;
        if (cVCTagEnum.getValue() != cVCTagEnum2.getValue()) {
            throw new IllegalArgumentException("Tag values are not equal");
        }
        if (((ByteField) genericPublicKeyField.getOptionalSubfield(cVCTagEnum2)) != null || (byteField = (ByteField) genericPublicKeyField.getOptionalSubfield(cVCTagEnum)) == null) {
            return;
        }
        genericPublicKeyField.addSubfield(new ByteField(cVCTagEnum2, byteField.getData()));
    }

    public static CVCPublicKey createInstance(PublicKey publicKey, String str, AuthorizationRole authorizationRole) {
        if (publicKey instanceof CVCPublicKey) {
            return (CVCPublicKey) publicKey;
        }
        OIDField oIDField = AlgorithmUtil.getOIDField(str);
        if (oIDField.getValue().startsWith(CVCObjectIdentifiers.id_TA_RSA)) {
            return new PublicKeyRSA(oIDField, (RSAPublicKey) publicKey);
        }
        if (oIDField.getValue().startsWith(CVCObjectIdentifiers.id_TA_ECDSA)) {
            return new PublicKeyEC(oIDField, (ECPublicKey) publicKey, authorizationRole);
        }
        throw new IllegalArgumentException("Unknown key type: " + oIDField);
    }

    public static CVCPublicKey createInstance(PublicKey publicKey, String str, AuthorizationRoleEnum authorizationRoleEnum) {
        return createInstance(publicKey, str, (AuthorizationRole) authorizationRoleEnum);
    }

    public static CVCPublicKey createInstance(GenericPublicKeyField genericPublicKeyField) {
        try {
            OIDField oIDField = (OIDField) genericPublicKeyField.getOptionalSubfield(CVCTagEnum.OID);
            if (oIDField.getValue().startsWith(CVCObjectIdentifiers.id_TA_RSA)) {
                copyField(CVCTagEnum.COEFFICIENT_A, CVCTagEnum.EXPONENT, genericPublicKeyField);
                return new PublicKeyRSA(genericPublicKeyField);
            }
            if (!oIDField.getValue().startsWith(CVCObjectIdentifiers.id_TA_ECDSA)) {
                throw new IllegalArgumentException("Unknown public key OID: " + oIDField.getValue());
            }
            copyField(CVCTagEnum.EXPONENT, CVCTagEnum.COEFFICIENT_A, genericPublicKeyField);
            return new PublicKeyEC(genericPublicKeyField);
        } catch (NoSuchFieldException e10) {
            throw new ConstructionException(e10);
        }
    }
}

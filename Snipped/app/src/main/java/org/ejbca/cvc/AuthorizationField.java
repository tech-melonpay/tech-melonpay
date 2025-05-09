package org.ejbca.cvc;

import net.sf.scuba.smartcards.ISO7816;
import org.ejbca.cvc.util.StringConverter;

/* loaded from: classes3.dex */
public class AuthorizationField extends AbstractDataField {
    private static final long serialVersionUID = -5478250843535697147L;
    private AccessRights rights;
    private AuthorizationRole role;

    public AuthorizationField() {
        super(CVCTagEnum.ROLE_AND_ACCESS_RIGHTS);
    }

    private static AccessRights getRightsFromBytes(OIDField oIDField, byte[] bArr) {
        int i = 0;
        if (CVCObjectIdentifiers.id_EAC_ePassport.equals(oIDField)) {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("byte array length must be 1, was " + bArr.length);
            }
            byte b9 = (byte) (bArr[0] & 3);
            AccessRightEnum[] values = AccessRightEnum.values();
            int length = values.length;
            while (i < length) {
                AccessRightEnum accessRightEnum = values[i];
                if (b9 == accessRightEnum.getValue()) {
                    return accessRightEnum;
                }
                i++;
            }
            return null;
        }
        if (!CVCObjectIdentifiers.id_EAC_roles_ST.equals(oIDField)) {
            if (!CVCObjectIdentifiers.id_EAC_roles_AT.equals(oIDField)) {
                return new AccessRightsRawValue(bArr);
            }
            if (bArr.length == 5) {
                return new AccessRightAuthTerm(bArr);
            }
            throw new IllegalArgumentException("byte array length must be 5, was " + bArr.length);
        }
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte array length must be 1, was " + bArr.length);
        }
        byte b10 = (byte) (bArr[0] & 3);
        AccessRightSignTermEnum[] values2 = AccessRightSignTermEnum.values();
        int length2 = values2.length;
        while (i < length2) {
            AccessRightSignTermEnum accessRightSignTermEnum = values2[i];
            if (b10 == accessRightSignTermEnum.getValue()) {
                return accessRightSignTermEnum;
            }
            i++;
        }
        return null;
    }

    private static AuthorizationRole getRoleFromByte(OIDField oIDField, byte b9) {
        AuthorizationRole[] values;
        byte b10 = (byte) (b9 & ISO7816.INS_GET_RESPONSE);
        if (CVCObjectIdentifiers.id_EAC_ePassport.equals(oIDField)) {
            values = AuthorizationRoleEnum.values();
        } else if (CVCObjectIdentifiers.id_EAC_roles_ST.equals(oIDField)) {
            values = AuthorizationRoleSignTermEnum.values();
        } else {
            if (!CVCObjectIdentifiers.id_EAC_roles_AT.equals(oIDField)) {
                return new AuthorizationRoleRawValue(b9);
            }
            values = AuthorizationRoleAuthTermEnum.values();
        }
        for (AuthorizationRole authorizationRole : values) {
            if (b10 == authorizationRole.getValue()) {
                return authorizationRole;
            }
        }
        return null;
    }

    public void fixEnumTypes(OIDField oIDField) {
        this.role = getRoleFromByte(oIDField, this.role.getValue());
        this.rights = getRightsFromBytes(oIDField, this.rights.getEncoded());
    }

    @Deprecated
    public AccessRightEnum getAccessRight() {
        AccessRights accessRights = this.rights;
        if (accessRights instanceof AccessRightEnum) {
            return (AccessRightEnum) accessRights;
        }
        throw new UnsupportedOperationException("Attempted to use deprecated getAccessRight method with an AT or ST certificate chain. It handles IS only.");
    }

    public AccessRights getAccessRights() {
        return this.rights;
    }

    public AuthorizationRole getAuthRole() {
        return this.role;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        byte[] encoded = this.rights.getEncoded();
        encoded[0] = (byte) (encoded[0] | this.role.getValue());
        return encoded;
    }

    @Deprecated
    public AuthorizationRoleEnum getRole() {
        AuthorizationRole authorizationRole = this.role;
        if (authorizationRole instanceof AuthorizationRoleEnum) {
            return (AuthorizationRoleEnum) authorizationRole;
        }
        throw new UnsupportedOperationException("Attempted to use deprecated getRole method with in an AT or ST certificate chain. It handles IS only.");
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        return StringConverter.byteToHex(getEncoded()) + ": " + this.role + "/" + this.rights;
    }

    public AuthorizationField(AuthorizationRole authorizationRole, AccessRights accessRights) {
        this();
        this.role = authorizationRole;
        this.rights = accessRights;
    }

    public AuthorizationField(AuthorizationRoleEnum authorizationRoleEnum, AccessRightEnum accessRightEnum) {
        this((AuthorizationRole) authorizationRoleEnum, (AccessRights) accessRightEnum);
    }

    public AuthorizationField(byte[] bArr) {
        this();
        if (bArr.length >= 1) {
            this.role = new AuthorizationRoleRawValue(bArr[0]);
            this.rights = new AccessRightsRawValue(bArr);
            return;
        }
        throw new IllegalArgumentException("byte array length must be at least 1");
    }
}

package org.ejbca.cvc;

import java.util.Collection;
import java.util.Date;

/* loaded from: classes3.dex */
public class CVCertificateBody extends AbstractSequence {
    private static CVCTagEnum[] allowedFields = {CVCTagEnum.PROFILE_IDENTIFIER, CVCTagEnum.CA_REFERENCE, CVCTagEnum.PUBLIC_KEY, CVCTagEnum.HOLDER_REFERENCE, CVCTagEnum.HOLDER_AUTH_TEMPLATE, CVCTagEnum.EFFECTIVE_DATE, CVCTagEnum.EXPIRATION_DATE, CVCTagEnum.CERTIFICATE_EXTENSIONS};
    private static final long serialVersionUID = 1;

    public CVCertificateBody() {
        super(CVCTagEnum.CERTIFICATE_BODY);
    }

    private static CVCAuthorizationTemplate chat(AuthorizationRole authorizationRole, AccessRights accessRights) {
        if (authorizationRole == null) {
            throw new IllegalArgumentException("authRole is null");
        }
        if (accessRights != null) {
            return new CVCAuthorizationTemplate(authorizationRole, accessRights);
        }
        throw new IllegalArgumentException("accessRight is null");
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public CVCTagEnum[] getAllowedFields() {
        return allowedFields;
    }

    public CAReferenceField getAuthorityReference() {
        return (CAReferenceField) getOptionalSubfield(CVCTagEnum.CA_REFERENCE);
    }

    public CVCAuthorizationTemplate getAuthorizationTemplate() {
        return (CVCAuthorizationTemplate) getSubfield(CVCTagEnum.HOLDER_AUTH_TEMPLATE);
    }

    public CVCertificateExtensions getCertificateExtensions() {
        return (CVCertificateExtensions) getSubfield(CVCTagEnum.CERTIFICATE_EXTENSIONS);
    }

    public HolderReferenceField getHolderReference() {
        return (HolderReferenceField) getSubfield(CVCTagEnum.HOLDER_REFERENCE);
    }

    public CVCPublicKey getPublicKey() {
        return (CVCPublicKey) getSubfield(CVCTagEnum.PUBLIC_KEY);
    }

    public Date getValidFrom() {
        return ((DateField) getSubfield(CVCTagEnum.EFFECTIVE_DATE)).getDate();
    }

    public Date getValidTo() {
        return ((DateField) getSubfield(CVCTagEnum.EXPIRATION_DATE)).getDate();
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField) {
        this(cAReferenceField, cVCPublicKey, holderReferenceField, null);
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField, Collection<CVCDiscretionaryDataTemplate> collection) {
        this();
        if (cVCPublicKey == null) {
            throw new IllegalArgumentException("publicKey is null");
        }
        if (holderReferenceField != null) {
            addSubfield(new IntegerField(CVCTagEnum.PROFILE_IDENTIFIER, 0));
            addSubfield(cAReferenceField);
            addSubfield(cVCPublicKey);
            addSubfield(holderReferenceField);
            if (collection != null) {
                addSubfield(new CVCertificateExtensions(collection));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("holderReference is null");
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField, CVCAuthorizationTemplate cVCAuthorizationTemplate, Date date, Date date2) {
        this(cAReferenceField, cVCPublicKey, holderReferenceField);
        if (cVCAuthorizationTemplate == null) {
            throw new IllegalArgumentException("holderAuthorizationTemplate is null");
        }
        if (date == null) {
            throw new IllegalArgumentException("validFrom is null");
        }
        if (date2 != null) {
            addSubfield(cVCAuthorizationTemplate);
            addSubfield(new DateField(CVCTagEnum.EFFECTIVE_DATE, date));
            addSubfield(new DateField(CVCTagEnum.EXPIRATION_DATE, date2));
            return;
        }
        throw new IllegalArgumentException("validTo is null");
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField, AuthorizationRole authorizationRole, AccessRights accessRights, Date date, Date date2) {
        this(cAReferenceField, cVCPublicKey, holderReferenceField, chat(authorizationRole, accessRights), date, date2);
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField, AuthorizationRoleEnum authorizationRoleEnum, AccessRightEnum accessRightEnum, Date date, Date date2) {
        this(cAReferenceField, cVCPublicKey, holderReferenceField, (AuthorizationRole) authorizationRoleEnum, (AccessRights) accessRightEnum, date, date2);
    }

    public CVCertificateBody(CAReferenceField cAReferenceField, CVCPublicKey cVCPublicKey, HolderReferenceField holderReferenceField, AuthorizationRole authorizationRole, AccessRights accessRights, Date date, Date date2, Collection<CVCDiscretionaryDataTemplate> collection) {
        this(cAReferenceField, cVCPublicKey, holderReferenceField, authorizationRole, accessRights, date, date2);
        if (collection != null) {
            addSubfield(new CVCertificateExtensions(collection));
        }
    }
}

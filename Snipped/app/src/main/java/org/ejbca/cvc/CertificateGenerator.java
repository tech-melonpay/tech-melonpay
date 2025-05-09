package org.ejbca.cvc;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.ejbca.cvc.util.BCECUtil;

/* loaded from: classes3.dex */
public final class CertificateGenerator {
    private CertificateGenerator() {
    }

    public static CVCAuthenticatedRequest createAuthenticatedRequest(CVCertificate cVCertificate, KeyPair keyPair, String str, CAReferenceField cAReferenceField) {
        return createAuthenticatedRequest(cVCertificate, keyPair, str, cAReferenceField, BouncyCastleProvider.PROVIDER_NAME);
    }

    public static CVCertificate createCertificate(PrivateKey privateKey, String str, CVCertificateBody cVCertificateBody, String str2) {
        CVCertificate cVCertificate = new CVCertificate(cVCertificateBody);
        Signature signature = Signature.getInstance(AlgorithmUtil.convertAlgorithmNameToCVC(str), str2);
        signature.initSign(privateKey);
        signature.update(cVCertificate.getTBS());
        cVCertificate.setSignature(BCECUtil.convertX962SigToCVC(str, signature.sign()));
        return cVCertificate;
    }

    public static CVCertificate createRequest(KeyPair keyPair, String str, HolderReferenceField holderReferenceField) {
        return createRequest(keyPair, str, holderReferenceField, BouncyCastleProvider.PROVIDER_NAME);
    }

    public static CVCertificate createTestCertificate(PublicKey publicKey, PrivateKey privateKey, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, String str, AuthorizationRoleEnum authorizationRoleEnum) {
        Date time = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, 3);
        return createCertificate(publicKey, privateKey, str, cAReferenceField, holderReferenceField, authorizationRoleEnum, AccessRightEnum.READ_ACCESS_DG3_AND_DG4, time, calendar.getTime(), BouncyCastleProvider.PROVIDER_NAME);
    }

    public static CVCAuthenticatedRequest createAuthenticatedRequest(CVCertificate cVCertificate, KeyPair keyPair, String str, CAReferenceField cAReferenceField, String str2) {
        CVCAuthenticatedRequest cVCAuthenticatedRequest = new CVCAuthenticatedRequest(cVCertificate, cAReferenceField);
        Signature signature = Signature.getInstance(AlgorithmUtil.convertAlgorithmNameToCVC(str), str2);
        signature.initSign(keyPair.getPrivate());
        signature.update(cVCAuthenticatedRequest.getTBS());
        cVCAuthenticatedRequest.setSignature(BCECUtil.convertX962SigToCVC(str, signature.sign()));
        return cVCAuthenticatedRequest;
    }

    public static CVCertificate createRequest(KeyPair keyPair, String str, HolderReferenceField holderReferenceField, String str2) {
        return createRequest(keyPair, str, null, holderReferenceField, str2);
    }

    public static CVCertificate createRequest(KeyPair keyPair, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField) {
        return createRequest(keyPair, str, cAReferenceField, holderReferenceField, null, BouncyCastleProvider.PROVIDER_NAME);
    }

    public static CVCertificate createRequest(KeyPair keyPair, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, String str2) {
        return createRequest(keyPair, str, cAReferenceField, holderReferenceField, null, str2);
    }

    public static CVCertificate createRequest(KeyPair keyPair, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, Collection<CVCDiscretionaryDataTemplate> collection, String str2) {
        CVCertificate cVCertificate = new CVCertificate(new CVCertificateBody(cAReferenceField, KeyFactory.createInstance(keyPair.getPublic(), str, (AuthorizationRoleEnum) null), holderReferenceField, collection));
        Signature signature = Signature.getInstance(AlgorithmUtil.convertAlgorithmNameToCVC(str), str2);
        signature.initSign(keyPair.getPrivate());
        signature.update(cVCertificate.getTBS());
        cVCertificate.setSignature(BCECUtil.convertX962SigToCVC(str, signature.sign()));
        return cVCertificate;
    }

    public static CVCertificate createCertificate(PublicKey publicKey, PrivateKey privateKey, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, AuthorizationRole authorizationRole, AccessRights accessRights, Date date, Date date2, Collection<CVCDiscretionaryDataTemplate> collection, String str2) {
        return createCertificate(privateKey, str, new CVCertificateBody(cAReferenceField, KeyFactory.createInstance(publicKey, str, authorizationRole), holderReferenceField, authorizationRole, accessRights, date, date2, collection), str2);
    }

    public static CVCertificate createCertificate(PublicKey publicKey, PrivateKey privateKey, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, AuthorizationRole authorizationRole, AccessRights accessRights, Date date, Date date2, String str2) {
        return createCertificate(publicKey, privateKey, str, cAReferenceField, holderReferenceField, authorizationRole, accessRights, date, date2, null, str2);
    }

    public static CVCertificate createCertificate(PublicKey publicKey, PrivateKey privateKey, String str, CAReferenceField cAReferenceField, HolderReferenceField holderReferenceField, AuthorizationRoleEnum authorizationRoleEnum, AccessRightEnum accessRightEnum, Date date, Date date2, String str2) {
        return createCertificate(publicKey, privateKey, str, cAReferenceField, holderReferenceField, (AuthorizationRole) authorizationRoleEnum, (AccessRights) accessRightEnum, date, date2, str2);
    }
}

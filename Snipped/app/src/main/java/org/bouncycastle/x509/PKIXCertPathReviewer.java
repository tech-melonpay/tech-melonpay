package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n, reason: collision with root package name */
    protected int f25511n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e10) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e10.getMessage(), e10, e10.getClass().getName()}), e10);
                }
            } catch (CertPathReviewerException e11) {
                addError(e11.getErrorMessage(), e11.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e12) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e12.getMessage(), e12, e12.getClass().getName()}), e12.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e10) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e10, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e11, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e12) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e13) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                        }
                    } catch (IOException e14) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e14, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i9 = 0; i9 != excludedSubtrees.length; i9++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i9]);
                            }
                        }
                    }
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e15, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int intValue;
        int i = this.f25511n;
        int i9 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i9++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (intValue = pathLenConstraint.intValue()) < i) {
                i = intValue;
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i9)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0140 A[Catch: CertPathReviewerException -> 0x00e0, TRY_LEAVE, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:15:0x006f, B:19:0x007f, B:22:0x008c, B:26:0x009c, B:27:0x00a7, B:29:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:41:0x00e4, B:42:0x00f0, B:48:0x00fc, B:51:0x0103, B:52:0x010c, B:54:0x0112, B:57:0x011c, B:63:0x0123, B:65:0x0127, B:69:0x0213, B:71:0x0219, B:72:0x021c, B:74:0x0222, B:76:0x022e, B:83:0x0236, B:81:0x0239, B:87:0x023c, B:89:0x0242, B:90:0x024b, B:92:0x0251, B:101:0x0274, B:102:0x0280, B:103:0x0281, B:109:0x0285, B:111:0x028d, B:112:0x0291, B:114:0x0297, B:117:0x02b9, B:119:0x02c3, B:121:0x02c8, B:122:0x02d4, B:124:0x02d5, B:125:0x02e1, B:128:0x02e4, B:129:0x02f1, B:131:0x02f7, B:133:0x031d, B:135:0x0335, B:136:0x032c, B:139:0x033c, B:140:0x0342, B:142:0x0348, B:151:0x0350, B:146:0x037a, B:157:0x0358, B:158:0x0364, B:160:0x0366, B:161:0x0375, B:164:0x0388, B:173:0x03a5, B:175:0x03af, B:176:0x03b3, B:178:0x03b9, B:192:0x03c9, B:181:0x03d6, B:202:0x03e3, B:204:0x03ed, B:107:0x042b, B:211:0x03f5, B:212:0x0403, B:214:0x0404, B:215:0x0412, B:222:0x0414, B:223:0x0422, B:224:0x0136, B:225:0x013a, B:227:0x0140, B:230:0x0156, B:232:0x0160, B:233:0x0165, B:235:0x016b, B:236:0x0179, B:238:0x017f, B:264:0x018b, B:248:0x0198, B:249:0x019e, B:251:0x01a4, B:259:0x01bd, B:240:0x018e, B:247:0x0192, B:266:0x01f6, B:271:0x0206, B:272:0x0212, B:279:0x043a, B:280:0x0447, B:282:0x0448, B:287:0x0459, B:289:0x0463, B:290:0x0468, B:292:0x046e, B:295:0x047c, B:309:0x0491, B:316:0x05e1, B:317:0x05ed, B:319:0x049c, B:320:0x04a8, B:321:0x04a9, B:323:0x04af, B:325:0x04b7, B:327:0x04bd, B:329:0x04c7, B:330:0x04ca, B:332:0x04d0, B:334:0x04e0, B:335:0x04e4, B:337:0x04ea, B:339:0x04f2, B:342:0x04f5, B:344:0x04f8, B:345:0x04fc, B:347:0x0502, B:349:0x0510, B:351:0x0518, B:352:0x051b, B:354:0x0521, B:356:0x052d, B:358:0x0531, B:361:0x0534, B:363:0x0537, B:364:0x0543, B:366:0x0548, B:368:0x0552, B:369:0x0555, B:371:0x055b, B:373:0x056b, B:374:0x056f, B:376:0x0575, B:379:0x0585, B:384:0x0589, B:387:0x058c, B:389:0x058f, B:390:0x0595, B:392:0x059b, B:394:0x05ad, B:400:0x05b7, B:402:0x05bd, B:403:0x05c0, B:405:0x05c6, B:407:0x05d2, B:409:0x05d6, B:412:0x05d9, B:416:0x05ee, B:417:0x05fa), top: B:14:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:15:0x006f, B:19:0x007f, B:22:0x008c, B:26:0x009c, B:27:0x00a7, B:29:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:41:0x00e4, B:42:0x00f0, B:48:0x00fc, B:51:0x0103, B:52:0x010c, B:54:0x0112, B:57:0x011c, B:63:0x0123, B:65:0x0127, B:69:0x0213, B:71:0x0219, B:72:0x021c, B:74:0x0222, B:76:0x022e, B:83:0x0236, B:81:0x0239, B:87:0x023c, B:89:0x0242, B:90:0x024b, B:92:0x0251, B:101:0x0274, B:102:0x0280, B:103:0x0281, B:109:0x0285, B:111:0x028d, B:112:0x0291, B:114:0x0297, B:117:0x02b9, B:119:0x02c3, B:121:0x02c8, B:122:0x02d4, B:124:0x02d5, B:125:0x02e1, B:128:0x02e4, B:129:0x02f1, B:131:0x02f7, B:133:0x031d, B:135:0x0335, B:136:0x032c, B:139:0x033c, B:140:0x0342, B:142:0x0348, B:151:0x0350, B:146:0x037a, B:157:0x0358, B:158:0x0364, B:160:0x0366, B:161:0x0375, B:164:0x0388, B:173:0x03a5, B:175:0x03af, B:176:0x03b3, B:178:0x03b9, B:192:0x03c9, B:181:0x03d6, B:202:0x03e3, B:204:0x03ed, B:107:0x042b, B:211:0x03f5, B:212:0x0403, B:214:0x0404, B:215:0x0412, B:222:0x0414, B:223:0x0422, B:224:0x0136, B:225:0x013a, B:227:0x0140, B:230:0x0156, B:232:0x0160, B:233:0x0165, B:235:0x016b, B:236:0x0179, B:238:0x017f, B:264:0x018b, B:248:0x0198, B:249:0x019e, B:251:0x01a4, B:259:0x01bd, B:240:0x018e, B:247:0x0192, B:266:0x01f6, B:271:0x0206, B:272:0x0212, B:279:0x043a, B:280:0x0447, B:282:0x0448, B:287:0x0459, B:289:0x0463, B:290:0x0468, B:292:0x046e, B:295:0x047c, B:309:0x0491, B:316:0x05e1, B:317:0x05ed, B:319:0x049c, B:320:0x04a8, B:321:0x04a9, B:323:0x04af, B:325:0x04b7, B:327:0x04bd, B:329:0x04c7, B:330:0x04ca, B:332:0x04d0, B:334:0x04e0, B:335:0x04e4, B:337:0x04ea, B:339:0x04f2, B:342:0x04f5, B:344:0x04f8, B:345:0x04fc, B:347:0x0502, B:349:0x0510, B:351:0x0518, B:352:0x051b, B:354:0x0521, B:356:0x052d, B:358:0x0531, B:361:0x0534, B:363:0x0537, B:364:0x0543, B:366:0x0548, B:368:0x0552, B:369:0x0555, B:371:0x055b, B:373:0x056b, B:374:0x056f, B:376:0x0575, B:379:0x0585, B:384:0x0589, B:387:0x058c, B:389:0x058f, B:390:0x0595, B:392:0x059b, B:394:0x05ad, B:400:0x05b7, B:402:0x05bd, B:403:0x05c0, B:405:0x05c6, B:407:0x05d2, B:409:0x05d6, B:412:0x05d9, B:416:0x05ee, B:417:0x05fa), top: B:14:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:15:0x006f, B:19:0x007f, B:22:0x008c, B:26:0x009c, B:27:0x00a7, B:29:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:41:0x00e4, B:42:0x00f0, B:48:0x00fc, B:51:0x0103, B:52:0x010c, B:54:0x0112, B:57:0x011c, B:63:0x0123, B:65:0x0127, B:69:0x0213, B:71:0x0219, B:72:0x021c, B:74:0x0222, B:76:0x022e, B:83:0x0236, B:81:0x0239, B:87:0x023c, B:89:0x0242, B:90:0x024b, B:92:0x0251, B:101:0x0274, B:102:0x0280, B:103:0x0281, B:109:0x0285, B:111:0x028d, B:112:0x0291, B:114:0x0297, B:117:0x02b9, B:119:0x02c3, B:121:0x02c8, B:122:0x02d4, B:124:0x02d5, B:125:0x02e1, B:128:0x02e4, B:129:0x02f1, B:131:0x02f7, B:133:0x031d, B:135:0x0335, B:136:0x032c, B:139:0x033c, B:140:0x0342, B:142:0x0348, B:151:0x0350, B:146:0x037a, B:157:0x0358, B:158:0x0364, B:160:0x0366, B:161:0x0375, B:164:0x0388, B:173:0x03a5, B:175:0x03af, B:176:0x03b3, B:178:0x03b9, B:192:0x03c9, B:181:0x03d6, B:202:0x03e3, B:204:0x03ed, B:107:0x042b, B:211:0x03f5, B:212:0x0403, B:214:0x0404, B:215:0x0412, B:222:0x0414, B:223:0x0422, B:224:0x0136, B:225:0x013a, B:227:0x0140, B:230:0x0156, B:232:0x0160, B:233:0x0165, B:235:0x016b, B:236:0x0179, B:238:0x017f, B:264:0x018b, B:248:0x0198, B:249:0x019e, B:251:0x01a4, B:259:0x01bd, B:240:0x018e, B:247:0x0192, B:266:0x01f6, B:271:0x0206, B:272:0x0212, B:279:0x043a, B:280:0x0447, B:282:0x0448, B:287:0x0459, B:289:0x0463, B:290:0x0468, B:292:0x046e, B:295:0x047c, B:309:0x0491, B:316:0x05e1, B:317:0x05ed, B:319:0x049c, B:320:0x04a8, B:321:0x04a9, B:323:0x04af, B:325:0x04b7, B:327:0x04bd, B:329:0x04c7, B:330:0x04ca, B:332:0x04d0, B:334:0x04e0, B:335:0x04e4, B:337:0x04ea, B:339:0x04f2, B:342:0x04f5, B:344:0x04f8, B:345:0x04fc, B:347:0x0502, B:349:0x0510, B:351:0x0518, B:352:0x051b, B:354:0x0521, B:356:0x052d, B:358:0x0531, B:361:0x0534, B:363:0x0537, B:364:0x0543, B:366:0x0548, B:368:0x0552, B:369:0x0555, B:371:0x055b, B:373:0x056b, B:374:0x056f, B:376:0x0575, B:379:0x0585, B:384:0x0589, B:387:0x058c, B:389:0x058f, B:390:0x0595, B:392:0x059b, B:394:0x05ad, B:400:0x05b7, B:402:0x05bd, B:403:0x05c0, B:405:0x05c6, B:407:0x05d2, B:409:0x05d6, B:412:0x05d9, B:416:0x05ee, B:417:0x05fa), top: B:14:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0242 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:15:0x006f, B:19:0x007f, B:22:0x008c, B:26:0x009c, B:27:0x00a7, B:29:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:41:0x00e4, B:42:0x00f0, B:48:0x00fc, B:51:0x0103, B:52:0x010c, B:54:0x0112, B:57:0x011c, B:63:0x0123, B:65:0x0127, B:69:0x0213, B:71:0x0219, B:72:0x021c, B:74:0x0222, B:76:0x022e, B:83:0x0236, B:81:0x0239, B:87:0x023c, B:89:0x0242, B:90:0x024b, B:92:0x0251, B:101:0x0274, B:102:0x0280, B:103:0x0281, B:109:0x0285, B:111:0x028d, B:112:0x0291, B:114:0x0297, B:117:0x02b9, B:119:0x02c3, B:121:0x02c8, B:122:0x02d4, B:124:0x02d5, B:125:0x02e1, B:128:0x02e4, B:129:0x02f1, B:131:0x02f7, B:133:0x031d, B:135:0x0335, B:136:0x032c, B:139:0x033c, B:140:0x0342, B:142:0x0348, B:151:0x0350, B:146:0x037a, B:157:0x0358, B:158:0x0364, B:160:0x0366, B:161:0x0375, B:164:0x0388, B:173:0x03a5, B:175:0x03af, B:176:0x03b3, B:178:0x03b9, B:192:0x03c9, B:181:0x03d6, B:202:0x03e3, B:204:0x03ed, B:107:0x042b, B:211:0x03f5, B:212:0x0403, B:214:0x0404, B:215:0x0412, B:222:0x0414, B:223:0x0422, B:224:0x0136, B:225:0x013a, B:227:0x0140, B:230:0x0156, B:232:0x0160, B:233:0x0165, B:235:0x016b, B:236:0x0179, B:238:0x017f, B:264:0x018b, B:248:0x0198, B:249:0x019e, B:251:0x01a4, B:259:0x01bd, B:240:0x018e, B:247:0x0192, B:266:0x01f6, B:271:0x0206, B:272:0x0212, B:279:0x043a, B:280:0x0447, B:282:0x0448, B:287:0x0459, B:289:0x0463, B:290:0x0468, B:292:0x046e, B:295:0x047c, B:309:0x0491, B:316:0x05e1, B:317:0x05ed, B:319:0x049c, B:320:0x04a8, B:321:0x04a9, B:323:0x04af, B:325:0x04b7, B:327:0x04bd, B:329:0x04c7, B:330:0x04ca, B:332:0x04d0, B:334:0x04e0, B:335:0x04e4, B:337:0x04ea, B:339:0x04f2, B:342:0x04f5, B:344:0x04f8, B:345:0x04fc, B:347:0x0502, B:349:0x0510, B:351:0x0518, B:352:0x051b, B:354:0x0521, B:356:0x052d, B:358:0x0531, B:361:0x0534, B:363:0x0537, B:364:0x0543, B:366:0x0548, B:368:0x0552, B:369:0x0555, B:371:0x055b, B:373:0x056b, B:374:0x056f, B:376:0x0575, B:379:0x0585, B:384:0x0589, B:387:0x058c, B:389:0x058f, B:390:0x0595, B:392:0x059b, B:394:0x05ad, B:400:0x05b7, B:402:0x05bd, B:403:0x05c0, B:405:0x05c6, B:407:0x05d2, B:409:0x05d6, B:412:0x05d9, B:416:0x05ee, B:417:0x05fa), top: B:14:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkPolicy() {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:31|(2:135|136)(2:33|(2:129|130)(3:35|(2:39|(1:41))|42))|43|44|45|(19:90|91|(16:93|94|95|(12:97|98|(2:101|99)|102|103|(2:106|104)|107|108|109|110|111|112)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)|122|94|95|(0)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)(1:47)|(1:51)|52|(7:54|(1:58)|59|60|(2:62|(1:64))(1:86)|65|(9:67|(1:84)|71|72|73|75|76|78|79))(1:89)|85|71|72|73|75|76|78|79) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:90|91|(16:93|94|95|(12:97|98|(2:101|99)|102|103|(2:106|104)|107|108|109|110|111|112)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)|122|94|95|(0)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028f, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03c1, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03bf, code lost:
    
        r8 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ac A[LOOP:1: B:99:0x02a6->B:101:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cf A[LOOP:2: B:104:0x02c9->B:106:0x02cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028a A[Catch: AnnotatedException -> 0x028f, TRY_LEAVE, TryCatch #3 {AnnotatedException -> 0x028f, blocks: (B:95:0x0282, B:97:0x028a), top: B:94:0x0282 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkSignatures() {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e10) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e10.getMessage(), e10, e10.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z10 = false;
            for (int i9 = 0; i9 < aSN1Sequence.size(); i9++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i9));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue}), i);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z10 = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z10;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void checkCRLs(java.security.cert.PKIXParameters r22, java.security.cert.X509Certificate r23, java.util.Date r24, java.security.cert.X509Certificate r25, java.security.PublicKey r26, java.util.Vector r27, int r28) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.f25511n;
        this.notifications = new List[i + 1];
        this.errors = new List[i + 1];
        int i9 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i9 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i9] = new ArrayList();
            this.errors[i9] = new ArrayList();
            i9++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f25511n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.f25511n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.f25511n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.f25511n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}

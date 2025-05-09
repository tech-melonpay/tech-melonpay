package org.bouncycastle.jsse.provider;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.AlertLevel;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerName;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCertificate;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

/* loaded from: classes.dex */
abstract class JsseUtils {
    static final Set<BCCryptoPrimitive> TLS_CRYPTO_PRIMITIVES_BC = Collections.unmodifiableSet(EnumSet.of(BCCryptoPrimitive.KEY_AGREEMENT));
    protected static X509Certificate[] EMPTY_CHAIN = new X509Certificate[0];

    public static class BCUnknownServerName extends BCSNIServerName {
        public BCUnknownServerName(int i, byte[] bArr) {
            super(i, bArr);
        }
    }

    public static boolean contains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static BCSNIServerName convertSNIServerName(ServerName serverName) {
        short nameType = serverName.getNameType();
        byte[] nameData = serverName.getNameData();
        return nameType != 0 ? new BCUnknownServerName(nameType, nameData) : new BCSNIHostName(nameData);
    }

    public static List<BCSNIServerName> convertSNIServerNames(Vector vector) {
        if (vector == null || vector.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            arrayList.add(convertSNIServerName((ServerName) elements.nextElement()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.jsse.BCSNIServerName findMatchingSNIServerName(java.util.Vector r5, java.util.Collection<org.bouncycastle.jsse.BCSNIMatcher> r6) {
        /*
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L40
            java.util.List r5 = convertSNIServerNames(r5)
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r6.next()
            org.bouncycastle.jsse.BCSNIMatcher r0 = (org.bouncycastle.jsse.BCSNIMatcher) r0
            if (r0 == 0) goto Le
            int r1 = r0.getType()
            java.util.Iterator r2 = r5.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()
            org.bouncycastle.jsse.BCSNIServerName r3 = (org.bouncycastle.jsse.BCSNIServerName) r3
            if (r3 == 0) goto L24
            int r4 = r3.getType()
            if (r4 == r1) goto L39
            goto L24
        L39:
            boolean r0 = r0.matches(r3)
            if (r0 == 0) goto Le
            return r3
        L40:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.JsseUtils.findMatchingSNIServerName(java.util.Vector, java.util.Collection):org.bouncycastle.jsse.BCSNIServerName");
    }

    public static String getAlertLogMessage(String str, short s10, short s11) {
        StringBuilder r8 = a.r(str, " ");
        r8.append(AlertLevel.getText(s10));
        r8.append(" ");
        r8.append(AlertDescription.getText(s11));
        r8.append(" alert");
        return r8.toString();
    }

    public static String getApplicationProtocol(SecurityParameters securityParameters) {
        if (securityParameters == null || !securityParameters.isApplicationProtocolSet()) {
            return null;
        }
        ProtocolName applicationProtocol = securityParameters.getApplicationProtocol();
        return applicationProtocol == null ? "" : applicationProtocol.getUtf8Decoding();
    }

    public static String getAuthStringClient(short s10) {
        if (s10 == 1) {
            return "RSA";
        }
        if (s10 == 2) {
            return "DSA";
        }
        if (s10 == 3) {
            return "EC";
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static String getAuthTypeClient(short s10) {
        if (s10 == 1) {
            return "RSA";
        }
        if (s10 == 2) {
            return "DSA";
        }
        if (s10 == 64) {
            return "EC";
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static String getAuthTypeServer(int i) {
        if (i == 1) {
            return "RSA";
        }
        if (i == 3) {
            return "DHE_DSS";
        }
        if (i == 5) {
            return "DHE_RSA";
        }
        if (i == 11) {
            return "DH_anon";
        }
        if (i == 17) {
            return "ECDHE_ECDSA";
        }
        if (i == 14) {
            return "DHE_PSK";
        }
        if (i == 15) {
            return "RSA_PSK";
        }
        switch (i) {
            case 19:
                return "ECDHE_RSA";
            case 20:
                return "ECDH_anon";
            case 21:
                return "SRP";
            case 22:
                return "SRP_DSS";
            case 23:
                return "SRP_RSA";
            case 24:
                return "ECDHE_PSK";
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static Certificate getCertificateMessage(TlsCrypto tlsCrypto, X509Certificate[] x509CertificateArr) {
        if (x509CertificateArr == null || x509CertificateArr.length < 1) {
            return Certificate.EMPTY_CHAIN;
        }
        TlsCertificate[] tlsCertificateArr = new TlsCertificate[x509CertificateArr.length];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            try {
                tlsCertificateArr[i] = tlsCrypto.createCertificate(x509CertificateArr[i].getEncoded());
            } catch (CertificateEncodingException e10) {
                throw new TlsFatalAlert((short) 80, e10);
            }
        }
        return new Certificate(tlsCertificateArr);
    }

    public static String getHashAlgorithmName(short s10) {
        switch (s10) {
            case 1:
                return "MD5";
            case 2:
                return "SHA1";
            case 3:
                return "SHA224";
            case 4:
                return "SHA256";
            case 5:
                return "SHA384";
            case 6:
                return "SHA512";
            default:
                return null;
        }
    }

    public static List<String> getProtocolNames(Vector vector) {
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(vector.size());
        for (int i = 0; i < vector.size(); i++) {
            arrayList.add(((ProtocolName) vector.elementAt(i)).getUtf8Decoding());
        }
        return arrayList;
    }

    public static String getSignatureAlgorithmName(short s10) {
        if (s10 == 1) {
            return "RSA";
        }
        if (s10 == 2) {
            return "DSA";
        }
        if (s10 != 3) {
            return null;
        }
        return "ECDSA";
    }

    public static String getSignatureSchemeName(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        String signatureAlgorithmName;
        short hash = signatureAndHashAlgorithm.getHash();
        short signature = signatureAndHashAlgorithm.getSignature();
        int i = ((hash & 255) << 8) | (signature & 255);
        if (i == 513) {
            return "SHA1withRSA";
        }
        if (i == 515) {
            return "SHA1withECDSA";
        }
        if (i == 1025) {
            return "SHA256withRSA";
        }
        if (i == 1027) {
            return "SHA256withECDSA";
        }
        if (i == 1281) {
            return "SHA384withRSA";
        }
        if (i == 1283) {
            return "SHA384withECDSA";
        }
        if (i == 1537) {
            return "SHA512withRSA";
        }
        if (i == 1539) {
            return "SHA512withECDSA";
        }
        switch (i) {
            case SignatureScheme.rsa_pss_rsae_sha256 /* 2052 */:
            case SignatureScheme.rsa_pss_rsae_sha384 /* 2053 */:
            case SignatureScheme.rsa_pss_rsae_sha512 /* 2054 */:
            case SignatureScheme.rsa_pss_pss_sha256 /* 2057 */:
            case SignatureScheme.rsa_pss_pss_sha384 /* 2058 */:
            case SignatureScheme.rsa_pss_pss_sha512 /* 2059 */:
                return "RSASSA-PSS";
            case SignatureScheme.ed25519 /* 2055 */:
                return "ed25519";
            case SignatureScheme.ed448 /* 2056 */:
                return "ed448";
            default:
                String hashAlgorithmName = getHashAlgorithmName(hash);
                if (hashAlgorithmName == null || (signatureAlgorithmName = getSignatureAlgorithmName(signature)) == null) {
                    return null;
                }
                return v.p(hashAlgorithmName, "with", signatureAlgorithmName);
        }
    }

    public static String[] getSignatureSchemeNames(Vector vector) {
        if (vector == null) {
            return new String[0];
        }
        int size = vector.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String signatureSchemeName = getSignatureSchemeName((SignatureAndHashAlgorithm) vector.elementAt(i));
            if (signatureSchemeName != null) {
                arrayList.add(signatureSchemeName);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static X500Principal getSubject(TlsCrypto tlsCrypto, Certificate certificate) {
        if (certificate == null || certificate.isEmpty()) {
            return null;
        }
        try {
            return JcaTlsCertificate.convert((JcaTlsCrypto) tlsCrypto, certificate.getCertificateAt(0)).getX509Certificate().getSubjectX500Principal();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Vector getSupportedSignatureAlgorithms(TlsCrypto tlsCrypto) {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 3};
        Vector vector = new Vector();
        for (int i = 0; i < 2; i++) {
            for (int i9 = 0; i9 < 5; i9++) {
                TlsUtils.addIfSupported(vector, tlsCrypto, new SignatureAndHashAlgorithm(sArr[i9], sArr2[i]));
            }
        }
        TlsUtils.addIfSupported(vector, tlsCrypto, new SignatureAndHashAlgorithm((short) 2, (short) 2));
        return vector;
    }

    public static X509Certificate[] getX509CertificateChain(TlsCrypto tlsCrypto, Certificate certificate) {
        if (certificate == null || certificate.isEmpty()) {
            return EMPTY_CHAIN;
        }
        try {
            int length = certificate.getLength();
            X509Certificate[] x509CertificateArr = new X509Certificate[length];
            for (int i = 0; i < length; i++) {
                x509CertificateArr[i] = JcaTlsCertificate.convert((JcaTlsCrypto) tlsCrypto, certificate.getCertificateAt(i)).getX509Certificate();
            }
            return x509CertificateArr;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean isUsableKeyForServer(int i, PrivateKey privateKey) {
        if (privateKey == null) {
            return false;
        }
        String algorithm = privateKey.getAlgorithm();
        if (i != 1) {
            if (i != 3) {
                if (i != 5 && i != 15) {
                    if (i == 17) {
                        return (privateKey instanceof ECPrivateKey) || "EC".equals(algorithm);
                    }
                    if (i != 19) {
                        if (i != 22) {
                            if (i != 23) {
                                return false;
                            }
                        }
                    }
                }
            }
            return (privateKey instanceof DSAPrivateKey) || "DSA".equals(algorithm);
        }
        return (privateKey instanceof RSAPrivateKey) || "RSA".equals(algorithm);
    }

    public static String[] resize(String[] strArr, int i) {
        return i < strArr.length ? copyOf(strArr, i) : strArr;
    }

    public static String stripDoubleQuotes(String str) {
        return stripOuterChars(str, '\"', '\"');
    }

    private static String stripOuterChars(String str, char c2, char c10) {
        int length;
        return (str == null || (length = str.length() - 1) <= 0 || str.charAt(0) != c2 || str.charAt(length) != c10) ? str : str.substring(1, length);
    }

    public static String stripSquareBrackets(String str) {
        return stripOuterChars(str, '[', ']');
    }

    public static X500Name toX500Name(Principal principal) {
        if (principal == null) {
            return null;
        }
        return principal instanceof X500Principal ? X500Name.getInstance(((X500Principal) principal).getEncoded()) : new X500Name(principal.getName());
    }

    public static Set<X500Name> toX500Names(Principal[] principalArr) {
        if (principalArr == null || principalArr.length == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(principalArr.length);
        for (int i = 0; i != principalArr.length; i++) {
            X500Name x500Name = toX500Name(principalArr[i]);
            if (x500Name != null) {
                hashSet.add(x500Name);
            }
        }
        return hashSet;
    }

    public static Set<X500Principal> toX500Principals(X500Name[] x500NameArr) {
        if (x500NameArr == null || x500NameArr.length == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(x500NameArr.length);
        for (X500Name x500Name : x500NameArr) {
            if (x500Name != null) {
                hashSet.add(new X500Principal(x500Name.getEncoded(ASN1Encoding.DER)));
            }
        }
        return hashSet;
    }

    public static Vector getProtocolNames(String[] strArr) {
        if (strArr == null || strArr.length < 1) {
            return null;
        }
        Vector vector = new Vector(strArr.length);
        for (String str : strArr) {
            vector.addElement(ProtocolName.asUtf8Encoding(str));
        }
        return vector;
    }

    public static X509Certificate[] getX509CertificateChain(java.security.cert.Certificate[] certificateArr) {
        if (certificateArr == null) {
            return null;
        }
        if (certificateArr instanceof X509Certificate[]) {
            return (X509Certificate[]) certificateArr;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[certificateArr.length];
        for (int i = 0; i < certificateArr.length; i++) {
            java.security.cert.Certificate certificate = certificateArr[i];
            if (!(certificate instanceof X509Certificate)) {
                return null;
            }
            x509CertificateArr[i] = (X509Certificate) certificate;
        }
        return x509CertificateArr;
    }
}

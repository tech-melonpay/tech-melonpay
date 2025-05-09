package org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import org.bouncycastle.asn1.x500.X500Name;

/* loaded from: classes.dex */
class ProvX509KeyManagerSimple extends X509ExtendedKeyManager {
    private final Map<String, Credential> credentials = new HashMap();

    public static class Credential {
        private final X509Certificate[] certificateChain;
        private final PrivateKey privateKey;

        public Credential(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificateChain = x509CertificateArr;
        }

        public X509Certificate[] getCertificateChain() {
            return this.certificateChain;
        }

        public PrivateKey getPrivateKey() {
            return this.privateKey;
        }
    }

    public ProvX509KeyManagerSimple(KeyStore keyStore, char[] cArr) {
        if (keyStore == null) {
            return;
        }
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            if (keyStore.entryInstanceOf(nextElement, KeyStore.PrivateKeyEntry.class)) {
                PrivateKey privateKey = (PrivateKey) keyStore.getKey(nextElement, cArr);
                X509Certificate[] x509CertificateChain = JsseUtils.getX509CertificateChain(keyStore.getCertificateChain(nextElement));
                if (x509CertificateChain != null && x509CertificateChain.length > 0) {
                    this.credentials.put(nextElement, new Credential(privateKey, x509CertificateChain));
                }
            }
        }
    }

    private String chooseAlias(boolean z10, String[] strArr, Principal[] principalArr) {
        Set<X500Name> x500Names = JsseUtils.toX500Names(principalArr);
        for (String str : strArr) {
            for (Map.Entry<String, Credential> entry : this.credentials.entrySet()) {
                if (isSuitableCredential(z10, str, x500Names, entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    private String[] getAliases(boolean z10, String str, Principal[] principalArr) {
        Set<X500Name> x500Names = JsseUtils.toX500Names(principalArr);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Credential> entry : this.credentials.entrySet()) {
            if (isSuitableCredential(z10, str, x500Names, entry.getValue())) {
                arrayList.add(entry.getKey());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private Credential getCredential(String str) {
        if (str == null) {
            return null;
        }
        return this.credentials.get(str);
    }

    private boolean hasSuitableIssuer(Set<X500Name> set, X509Certificate x509Certificate) {
        return set.contains(JsseUtils.toX500Name(x509Certificate.getIssuerX500Principal()));
    }

    private boolean isSuitableCertificate(boolean z10, String str, X509Certificate x509Certificate) {
        if (str == null || x509Certificate == null) {
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (str.equalsIgnoreCase("DHE_RSA") || str.equalsIgnoreCase("ECDHE_RSA") || str.equalsIgnoreCase("SRP_RSA")) {
            return (publicKey instanceof RSAPublicKey) && isSuitableKeyUsage(128, x509Certificate);
        }
        if (str.equalsIgnoreCase("DHE_DSS") || str.equalsIgnoreCase("SRP_DSS")) {
            return (publicKey instanceof DSAPublicKey) && isSuitableKeyUsage(128, x509Certificate);
        }
        if (str.equalsIgnoreCase("ECDHE_ECDSA")) {
            return (publicKey instanceof ECPublicKey) && isSuitableKeyUsage(128, x509Certificate);
        }
        if (str.equalsIgnoreCase("RSA")) {
            return (publicKey instanceof RSAPublicKey) && isSuitableKeyUsage(z10 ? 32 : 128, x509Certificate);
        }
        return str.equalsIgnoreCase("DSA") ? !z10 && (publicKey instanceof DSAPublicKey) && isSuitableKeyUsage(128, x509Certificate) : str.equalsIgnoreCase("EC") && (publicKey instanceof ECPublicKey) && isSuitableKeyUsage(128, x509Certificate);
    }

    private boolean isSuitableCredential(boolean z10, String str, Set<X500Name> set, Credential credential) {
        X509Certificate[] certificateChain = credential.getCertificateChain();
        if (!isSuitableCertificate(z10, str, certificateChain[0])) {
            return false;
        }
        if (set == null || set.isEmpty()) {
            return true;
        }
        int length = certificateChain.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!hasSuitableIssuer(set, certificateChain[length]));
        return true;
    }

    public static boolean isSuitableKeyUsage(int i, X509Certificate x509Certificate) {
        try {
            boolean[] keyUsage = x509Certificate.getKeyUsage();
            if (keyUsage == null) {
                return true;
            }
            int min = Math.min(32, keyUsage.length);
            int i9 = 0;
            for (int i10 = 0; i10 < min; i10++) {
                if (keyUsage[i10]) {
                    int i11 = i10 & 7;
                    i9 |= (128 >>> i11) << (i10 - i11);
                }
            }
            return (i9 & i) == i;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return chooseAlias(false, strArr, principalArr);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseAlias(false, strArr, principalArr);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseAlias(true, new String[]{str}, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return chooseAlias(true, new String[]{str}, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        Credential credential = getCredential(str);
        if (credential == null) {
            return null;
        }
        return (X509Certificate[]) credential.getCertificateChain().clone();
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return getAliases(false, str, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        Credential credential = getCredential(str);
        if (credential == null) {
            return null;
        }
        return credential.getPrivateKey();
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return getAliases(true, str, principalArr);
    }
}

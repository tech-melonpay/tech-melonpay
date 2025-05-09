package org.bouncycastle.jsse.provider;

import androidx.camera.core.impl.utils.a;
import java.net.Socket;
import java.security.GeneralSecurityException;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import org.bouncycastle.asn1.x500.X500Name;

/* loaded from: classes.dex */
class ProvX509KeyManager extends X509ExtendedKeyManager {
    private final List<KeyStore.Builder> builders;
    private final Map<String, KeyStore.PrivateKeyEntry> keys = new HashMap();
    private final AtomicLong version = new AtomicLong();

    public ProvX509KeyManager(List<KeyStore.Builder> list) {
        this.builders = list;
    }

    private String chooseAlias(boolean z10, String[] strArr, Principal[] principalArr) {
        try {
            Set<X500Name> x500Names = JsseUtils.toX500Names(principalArr);
            for (int i = 0; i != strArr.length; i++) {
                List<String> findAliases = findAliases(z10, strArr[i], x500Names);
                if (!findAliases.isEmpty()) {
                    return findAliases.get(0);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private List<String> findAliases(boolean z10, int i, KeyStore keyStore, KeyStore.Builder builder, String str, Set<X500Name> set) {
        X509Certificate[] x509CertificateChain;
        ArrayList arrayList = new ArrayList();
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            if (keyStore.isKeyEntry(nextElement) && (x509CertificateChain = JsseUtils.getX509CertificateChain(keyStore.getCertificateChain(nextElement))) != null && x509CertificateChain.length != 0 && isSuitableCredential(z10, str, set, x509CertificateChain)) {
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(nextElement, builder.getProtectionParameter(nextElement));
                String str2 = i + "." + nextElement + "." + this.version.getAndIncrement();
                this.keys.put(str2, privateKeyEntry);
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private String[] getAliases(boolean z10, String str, Principal[] principalArr) {
        List<String> findAliases = findAliases(z10, str, JsseUtils.toX500Names(principalArr));
        return (String[]) findAliases.toArray(new String[findAliases.size()]);
    }

    private KeyStore.PrivateKeyEntry getPrivateKeyEntry(String str) {
        if (str == null) {
            return null;
        }
        return this.keys.get(str);
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

    private boolean isSuitableCredential(boolean z10, String str, Set<X500Name> set, X509Certificate[] x509CertificateArr) {
        if (!isSuitableCertificate(z10, str, x509CertificateArr[0])) {
            return false;
        }
        if (set == null || set.isEmpty()) {
            return true;
        }
        int length = x509CertificateArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!hasSuitableIssuer(set, x509CertificateArr[length]));
        return true;
    }

    private static boolean isSuitableKeyUsage(int i, X509Certificate x509Certificate) {
        return ProvX509KeyManagerSimple.isSuitableKeyUsage(i, x509Certificate);
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
        KeyStore.PrivateKeyEntry privateKeyEntry = getPrivateKeyEntry(str);
        if (privateKeyEntry == null) {
            return null;
        }
        return (X509Certificate[]) privateKeyEntry.getCertificateChain();
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return getAliases(false, str, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        KeyStore.PrivateKeyEntry privateKeyEntry = getPrivateKeyEntry(str);
        if (privateKeyEntry == null) {
            return null;
        }
        return privateKeyEntry.getPrivateKey();
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return getAliases(true, str, principalArr);
    }

    private List<String> findAliases(boolean z10, String str, Set<X500Name> set) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != this.builders.size(); i++) {
            KeyStore.Builder builder = this.builders.get(i);
            try {
                arrayList.addAll(findAliases(z10, i, builder.getKeyStore(), builder, str, set));
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(a.p(e10, new StringBuilder("unable to build key store: ")), e10);
            }
        }
        return arrayList;
    }
}

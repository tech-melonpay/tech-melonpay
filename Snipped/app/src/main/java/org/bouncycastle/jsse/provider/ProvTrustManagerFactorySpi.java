package org.bouncycastle.jsse.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: classes.dex */
class ProvTrustManagerFactorySpi extends TrustManagerFactorySpi {
    private static final Logger LOG = Logger.getLogger(ProvTrustManagerFactorySpi.class.getName());
    protected final JcaJceHelper helper;
    protected ProvX509TrustManager x509TrustManager;

    public ProvTrustManagerFactorySpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private static KeyStore createTrustStore(String str) {
        String trustStoreType = getTrustStoreType(str);
        String systemProperty = PropertyUtils.getSystemProperty("javax.net.ssl.trustStoreProvider");
        return (systemProperty == null || systemProperty.length() < 1) ? KeyStore.getInstance(trustStoreType) : KeyStore.getInstance(trustStoreType, systemProperty);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (new java.io.File(r2).exists() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (new java.io.File(r2).exists() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0083, B:12:0x00a9, B:18:0x008d), top: B:9:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:11:0x0083, B:12:0x00a9, B:18:0x008d), top: B:9:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.KeyStore getDefaultTrustStore() {
        /*
            java.lang.String r0 = "Initializing with trust store at path: "
            java.lang.String r1 = java.security.KeyStore.getDefaultType()
            java.lang.String r2 = "javax.net.ssl.trustStore"
            java.lang.String r2 = org.bouncycastle.jsse.provider.PropertyUtils.getSystemProperty(r2)
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            r4 = 0
            if (r3 == 0) goto L16
            goto L6e
        L16:
            if (r2 == 0) goto L24
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L6e
            goto L6f
        L24:
            java.lang.String r2 = "java.home"
            java.lang.String r2 = org.bouncycastle.jsse.provider.PropertyUtils.getSystemProperty(r2)
            if (r2 == 0) goto L6e
            java.lang.StringBuilder r3 = C.v.s(r2)
            java.lang.String r5 = java.io.File.separator
            java.lang.String r6 = "/lib/security/jssecacerts"
            java.lang.String r7 = "/"
            java.lang.String r6 = r6.replace(r7, r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            boolean r6 = r6.exists()
            java.lang.String r8 = "jks"
            if (r6 == 0) goto L51
            r2 = r3
        L4f:
            r1 = r8
            goto L6f
        L51:
            java.lang.StringBuilder r2 = C.v.s(r2)
            java.lang.String r3 = "/lib/security/cacerts"
            java.lang.String r3 = r3.replace(r7, r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L6e
            goto L4f
        L6e:
            r2 = r4
        L6f:
            java.security.KeyStore r1 = createTrustStore(r1)
            java.lang.String r3 = "javax.net.ssl.trustStorePassword"
            java.lang.String r3 = org.bouncycastle.jsse.provider.PropertyUtils.getSystemProperty(r3)
            if (r3 == 0) goto L80
            char[] r3 = r3.toCharArray()
            goto L81
        L80:
            r3 = r4
        L81:
            if (r2 != 0) goto L8d
            java.util.logging.Logger r0 = org.bouncycastle.jsse.provider.ProvTrustManagerFactorySpi.LOG     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "Initializing empty trust store"
            r0.info(r2)     // Catch: java.lang.Throwable -> L8b
            goto La9
        L8b:
            r0 = move-exception
            goto Lb2
        L8d:
            java.util.logging.Logger r5 = org.bouncycastle.jsse.provider.ProvTrustManagerFactorySpi.LOG     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            r6.append(r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L8b
            r5.info(r0)     // Catch: java.lang.Throwable -> L8b
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8b
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            r4 = r0
        La9:
            r1.load(r4, r3)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto Lb1
            r4.close()
        Lb1:
            return r1
        Lb2:
            if (r4 == 0) goto Lb7
            r4.close()
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvTrustManagerFactorySpi.getDefaultTrustStore():java.security.KeyStore");
    }

    private static Set<TrustAnchor> getTrustAnchors(KeyStore keyStore) {
        if (keyStore == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(keyStore.size());
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            if (keyStore.isCertificateEntry(nextElement)) {
                Certificate certificate = keyStore.getCertificate(nextElement);
                if (certificate instanceof X509Certificate) {
                    hashSet.add(new TrustAnchor((X509Certificate) certificate, null));
                }
            }
        }
        return hashSet;
    }

    private static String getTrustStoreType(String str) {
        String systemProperty = PropertyUtils.getSystemProperty("javax.net.ssl.trustStoreType");
        return systemProperty == null ? str : systemProperty;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public TrustManager[] engineGetTrustManagers() {
        ProvX509TrustManager provX509TrustManager = this.x509TrustManager;
        if (provX509TrustManager != null) {
            return new TrustManager[]{provX509TrustManager.getExportX509TrustManager()};
        }
        throw new IllegalStateException("TrustManagerFactory not initialized");
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public void engineInit(KeyStore keyStore) {
        if (keyStore == null) {
            try {
                keyStore = getDefaultTrustStore();
            } catch (Error e10) {
                LOG.log(Level.WARNING, "Skipped default trust store", (Throwable) e10);
                throw e10;
            } catch (SecurityException e11) {
                LOG.log(Level.WARNING, "Skipped default trust store", (Throwable) e11);
            } catch (RuntimeException e12) {
                LOG.log(Level.WARNING, "Skipped default trust store", (Throwable) e12);
                throw e12;
            } catch (Exception e13) {
                LOG.log(Level.WARNING, "Skipped default trust store", (Throwable) e13);
                throw new KeyStoreException("Failed to load default trust store", e13);
            }
        }
        try {
            this.x509TrustManager = new ProvX509TrustManager(this.helper, getTrustAnchors(keyStore));
        } catch (InvalidAlgorithmParameterException e14) {
            throw new KeyStoreException("Failed to create trust manager", e14);
        }
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        if (!(managerFactoryParameters instanceof CertPathTrustManagerParameters)) {
            if (managerFactoryParameters != null) {
                throw new InvalidAlgorithmParameterException("unknown spec: ".concat(managerFactoryParameters.getClass().getName()));
            }
            throw new InvalidAlgorithmParameterException("spec cannot be null");
        }
        CertPathParameters parameters = ((CertPathTrustManagerParameters) managerFactoryParameters).getParameters();
        if (!(parameters instanceof PKIXParameters)) {
            throw new InvalidAlgorithmParameterException("parameters must inherit from PKIXParameters");
        }
        this.x509TrustManager = new ProvX509TrustManager(this.helper, (PKIXParameters) parameters);
    }
}

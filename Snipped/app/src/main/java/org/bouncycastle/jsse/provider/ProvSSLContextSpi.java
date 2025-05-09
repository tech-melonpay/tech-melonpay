package org.bouncycastle.jsse.provider;

import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.asn1.a;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoProvider;

/* loaded from: classes.dex */
class ProvSSLContextSpi extends SSLContextSpi {
    private static final List<String> DEFAULT_CIPHERSUITE_LIST;
    private static final List<String> DEFAULT_CIPHERSUITE_LIST_FIPS;
    private static final String[] DEFAULT_ENABLED_PROTOCOLS;
    private static final Logger LOG = Logger.getLogger(ProvSSLContextSpi.class.getName());
    private static final String PROPERTY_CLIENT_PROTOCOLS = "jdk.tls.client.protocols";
    private static final String PROPERTY_SERVER_PROTOCOLS = "jdk.tls.server.protocols";
    private static final Map<String, CipherSuiteInfo> SUPPORTED_CIPHERSUITE_MAP;
    private static final Map<String, CipherSuiteInfo> SUPPORTED_CIPHERSUITE_MAP_FIPS;
    private static final Map<String, ProtocolVersion> SUPPORTED_PROTOCOL_MAP;
    private static final Map<String, ProtocolVersion> SUPPORTED_PROTOCOL_MAP_FIPS;
    private ProvSSLSessionContext clientSessionContext;
    private TlsCrypto crypto;
    protected final TlsCryptoProvider cryptoProvider;
    protected final String[] defaultCipherSuites;
    protected final String[] defaultProtocolsClient;
    protected final String[] defaultProtocolsServer;
    protected boolean initialized = false;
    protected final boolean isInFipsMode;
    private ProvSSLSessionContext serverSessionContext;
    protected final Map<String, CipherSuiteInfo> supportedCipherSuites;
    protected final Map<String, ProtocolVersion> supportedProtocols;
    private X509ExtendedKeyManager x509KeyManager;
    private BCX509ExtendedTrustManager x509TrustManager;

    static {
        Map<String, CipherSuiteInfo> createSupportedCipherSuiteMap = createSupportedCipherSuiteMap();
        SUPPORTED_CIPHERSUITE_MAP = createSupportedCipherSuiteMap;
        SUPPORTED_CIPHERSUITE_MAP_FIPS = createSupportedCipherSuiteMapFips(createSupportedCipherSuiteMap);
        Map<String, ProtocolVersion> createSupportedProtocolMap = createSupportedProtocolMap();
        SUPPORTED_PROTOCOL_MAP = createSupportedProtocolMap;
        SUPPORTED_PROTOCOL_MAP_FIPS = createSupportedProtocolMapFips(createSupportedProtocolMap);
        List<String> createDefaultCipherSuiteList = createDefaultCipherSuiteList(createSupportedCipherSuiteMap.keySet());
        DEFAULT_CIPHERSUITE_LIST = createDefaultCipherSuiteList;
        DEFAULT_CIPHERSUITE_LIST_FIPS = createDefaultCipherSuiteListFips(createDefaultCipherSuiteList);
        DEFAULT_ENABLED_PROTOCOLS = new String[]{"TLSv1.2", "TLSv1.1", "TLSv1"};
    }

    public ProvSSLContextSpi(boolean z10, TlsCryptoProvider tlsCryptoProvider, String[] strArr) {
        this.isInFipsMode = z10;
        this.cryptoProvider = tlsCryptoProvider;
        this.supportedCipherSuites = z10 ? SUPPORTED_CIPHERSUITE_MAP_FIPS : SUPPORTED_CIPHERSUITE_MAP;
        Map<String, ProtocolVersion> map = z10 ? SUPPORTED_PROTOCOL_MAP_FIPS : SUPPORTED_PROTOCOL_MAP;
        this.supportedProtocols = map;
        this.defaultCipherSuites = getDefaultCipherSuites(z10);
        this.defaultProtocolsClient = getDefaultEnabledProtocolsClient(map, strArr);
        this.defaultProtocolsServer = getDefaultEnabledProtocolsServer(map);
    }

    private static void addCipherSuite(Map<String, CipherSuiteInfo> map, String str, int i) {
        if (map.put(str, CipherSuiteInfo.forCipherSuite(i, str)) != null) {
            throw new IllegalStateException("Duplicate names in supported-cipher-suites");
        }
    }

    private static List<String> createDefaultCipherSuiteList(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        a.y(arrayList, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        a.y(arrayList, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        a.y(arrayList, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA256");
        arrayList.add("TLS_RSA_WITH_AES_128_CBC_SHA256");
        arrayList.add("TLS_RSA_WITH_AES_256_CBC_SHA");
        arrayList.add("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.retainAll(set);
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    private static List<String> createDefaultCipherSuiteListFips(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        FipsUtils.removeNonFipsCipherSuites(arrayList);
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    private static Map<String, CipherSuiteInfo> createSupportedCipherSuiteMap() {
        TreeMap treeMap = new TreeMap();
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        addCipherSuite(treeMap, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_128_CCM", CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_128_CCM_8", CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_256_CCM", CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_256_CCM_8", CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        addCipherSuite(treeMap, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        addCipherSuite(treeMap, "TLS_ECDHE_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);
        addCipherSuite(treeMap, "TLS_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_128_CCM", CipherSuite.TLS_RSA_WITH_AES_128_CCM);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_128_CCM_8", CipherSuite.TLS_RSA_WITH_AES_128_CCM_8);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_256_CCM", CipherSuite.TLS_RSA_WITH_AES_256_CCM);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_256_CCM_8", CipherSuite.TLS_RSA_WITH_AES_256_CCM_8);
        addCipherSuite(treeMap, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        addCipherSuite(treeMap, "TLS_RSA_WITH_NULL_SHA", 2);
        addCipherSuite(treeMap, "TLS_RSA_WITH_NULL_SHA256", 59);
        return Collections.unmodifiableMap(treeMap);
    }

    private static Map<String, CipherSuiteInfo> createSupportedCipherSuiteMapFips(Map<String, CipherSuiteInfo> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        FipsUtils.removeNonFipsCipherSuites(linkedHashMap.keySet());
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Map<String, ProtocolVersion> createSupportedProtocolMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("TLSv1.2", ProtocolVersion.TLSv12);
        linkedHashMap.put("TLSv1.1", ProtocolVersion.TLSv11);
        linkedHashMap.put("TLSv1", ProtocolVersion.TLSv10);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Map<String, ProtocolVersion> createSupportedProtocolMapFips(Map<String, ProtocolVersion> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        FipsUtils.removeNonFipsCipherSuites(linkedHashMap.keySet());
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static String[] getArray(Collection<String> collection) {
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public static CipherSuiteInfo getCipherSuiteInfo(String str) {
        return SUPPORTED_CIPHERSUITE_MAP.get(str);
    }

    public static String getCipherSuiteName(int i) {
        if (i == 0) {
            return "SSL_NULL_WITH_NULL_NULL";
        }
        if (!TlsUtils.isValidUint16(i)) {
            return null;
        }
        for (CipherSuiteInfo cipherSuiteInfo : SUPPORTED_CIPHERSUITE_MAP.values()) {
            if (cipherSuiteInfo.getCipherSuite() == i) {
                return cipherSuiteInfo.getName();
            }
        }
        return null;
    }

    private static String[] getDefaultEnabledProtocolCandidates(String[] strArr, String str) {
        if (strArr != null) {
            return strArr;
        }
        String[] jdkTlsProtocols = getJdkTlsProtocols(str);
        return jdkTlsProtocols != null ? jdkTlsProtocols : DEFAULT_ENABLED_PROTOCOLS;
    }

    private static String[] getDefaultEnabledProtocols(Map<String, ProtocolVersion> map, String[] strArr, String str) {
        String[] defaultEnabledProtocolCandidates = getDefaultEnabledProtocolCandidates(strArr, str);
        String[] strArr2 = new String[defaultEnabledProtocolCandidates.length];
        int i = 0;
        for (String str2 : defaultEnabledProtocolCandidates) {
            if (map.containsKey(str2) && ProvAlgorithmConstraints.DEFAULT_TLS_ONLY.permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, str2, null)) {
                strArr2[i] = str2;
                i++;
            }
        }
        return JsseUtils.resize(strArr2, i);
    }

    private static String[] getDefaultEnabledProtocolsClient(Map<String, ProtocolVersion> map, String[] strArr) {
        return getDefaultEnabledProtocols(map, strArr, PROPERTY_CLIENT_PROTOCOLS);
    }

    private static String[] getDefaultEnabledProtocolsServer(Map<String, ProtocolVersion> map) {
        return getDefaultEnabledProtocols(map, null, PROPERTY_SERVER_PROTOCOLS);
    }

    public static KeyManager[] getDefaultKeyManagers() {
        KeyStoreConfig defaultKeyStore = ProvKeyManagerFactorySpi.getDefaultKeyStore();
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(defaultKeyStore.keyStore, defaultKeyStore.password);
        return keyManagerFactory.getKeyManagers();
    }

    public static TrustManager[] getDefaultTrustManagers() {
        KeyStore defaultTrustStore = ProvTrustManagerFactorySpi.getDefaultTrustStore();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(defaultTrustStore);
        return trustManagerFactory.getTrustManagers();
    }

    private static String[] getJdkTlsProtocols(String str) {
        String[] stringArraySystemProperty = PropertyUtils.getStringArraySystemProperty(str);
        if (stringArraySystemProperty == null) {
            return null;
        }
        String[] strArr = new String[stringArraySystemProperty.length];
        int i = 0;
        for (String str2 : stringArraySystemProperty) {
            if (!SUPPORTED_PROTOCOL_MAP.containsKey(str2)) {
                LOG.warning("'" + str + "' contains unsupported protocol: " + str2);
            } else if (!JsseUtils.contains(strArr, str2)) {
                strArr[i] = str2;
                i++;
            }
        }
        if (i >= 1) {
            return JsseUtils.resize(strArr, i);
        }
        LOG.severe("'" + str + "' contained no supported protocol values (ignoring)");
        return null;
    }

    private static String[] getKeysArray(Map<String, ?> map) {
        return getArray(map.keySet());
    }

    public static String getProtocolVersionName(ProtocolVersion protocolVersion) {
        if (protocolVersion == null) {
            return "NONE";
        }
        for (Map.Entry<String, ProtocolVersion> entry : SUPPORTED_PROTOCOL_MAP.entrySet()) {
            if (entry.getValue().equals(protocolVersion)) {
                return entry.getKey();
            }
        }
        return "NONE";
    }

    public void checkInitialized() {
        if (!this.initialized) {
            throw new IllegalStateException("SSLContext has not been initialized.");
        }
    }

    public ContextData createContextData() {
        return new ContextData(this.crypto, this.x509KeyManager, this.x509TrustManager, this.clientSessionContext, this.serverSessionContext);
    }

    public ProvSSLSessionContext createSSLSessionContext() {
        return new ProvSSLSessionContext(this, this.crypto);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public synchronized SSLEngine engineCreateSSLEngine() {
        checkInitialized();
        return SSLEngineUtil.create(this, createContextData());
    }

    @Override // javax.net.ssl.SSLContextSpi
    public synchronized SSLSessionContext engineGetClientSessionContext() {
        return this.clientSessionContext;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public synchronized SSLSessionContext engineGetServerSessionContext() {
        return this.serverSessionContext;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public SSLServerSocketFactory engineGetServerSocketFactory() {
        checkInitialized();
        return new ProvSSLServerSocketFactory(this);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public SSLSocketFactory engineGetSocketFactory() {
        checkInitialized();
        return new ProvSSLSocketFactory(this);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public synchronized void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.initialized = false;
        this.crypto = this.cryptoProvider.create(secureRandom);
        this.x509KeyManager = selectX509KeyManager(keyManagerArr);
        this.x509TrustManager = selectX509TrustManager(trustManagerArr);
        this.clientSessionContext = createSSLSessionContext();
        this.serverSessionContext = createSSLSessionContext();
        this.crypto.getSecureRandom().nextInt();
        this.initialized = true;
    }

    public int[] getActiveCipherSuites(TlsCrypto tlsCrypto, ProvSSLParameters provSSLParameters, ProtocolVersion[] protocolVersionArr) {
        String[] cipherSuitesArray = provSSLParameters.getCipherSuitesArray();
        BCAlgorithmConstraints algorithmConstraints = provSSLParameters.getAlgorithmConstraints();
        int[] iArr = new int[cipherSuitesArray.length];
        int i = 0;
        for (String str : cipherSuitesArray) {
            CipherSuiteInfo cipherSuiteInfo = this.supportedCipherSuites.get(str);
            if (cipherSuiteInfo != null && algorithmConstraints.permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, str, null)) {
                iArr[i] = cipherSuiteInfo.getCipherSuite();
                i++;
            }
        }
        return TlsUtils.getSupportedCipherSuites(tlsCrypto, iArr, i);
    }

    public ProtocolVersion[] getActiveProtocolVersions(ProvSSLParameters provSSLParameters) {
        String[] protocolsArray = provSSLParameters.getProtocolsArray();
        BCAlgorithmConstraints algorithmConstraints = provSSLParameters.getAlgorithmConstraints();
        TreeSet treeSet = new TreeSet(new Comparator<ProtocolVersion>() { // from class: org.bouncycastle.jsse.provider.ProvSSLContextSpi.1
            @Override // java.util.Comparator
            public int compare(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
                if (protocolVersion.isLaterVersionOf(protocolVersion2)) {
                    return -1;
                }
                return protocolVersion2.isLaterVersionOf(protocolVersion) ? 1 : 0;
            }
        });
        for (String str : protocolsArray) {
            ProtocolVersion protocolVersion = this.supportedProtocols.get(str);
            if (protocolVersion != null && algorithmConstraints.permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, str, null)) {
                treeSet.add(protocolVersion);
            }
        }
        return (ProtocolVersion[]) treeSet.toArray(new ProtocolVersion[treeSet.size()]);
    }

    public String[] getDefaultCipherSuites() {
        return (String[]) this.defaultCipherSuites.clone();
    }

    public ProvSSLParameters getDefaultParameters(boolean z10) {
        return new ProvSSLParameters(this, this.defaultCipherSuites, getDefaultProtocols(z10));
    }

    public String[] getDefaultProtocols(boolean z10) {
        return z10 ? getDefaultProtocolsServer() : getDefaultProtocolsClient();
    }

    public String[] getDefaultProtocolsClient() {
        return this.defaultProtocolsClient;
    }

    public String[] getDefaultProtocolsServer() {
        return this.defaultProtocolsServer;
    }

    public String[] getSupportedCipherSuites() {
        return getKeysArray(this.supportedCipherSuites);
    }

    public String[] getSupportedProtocols() {
        return getKeysArray(this.supportedProtocols);
    }

    public boolean isDefaultProtocols(String[] strArr) {
        return strArr == getDefaultProtocolsClient() || strArr == getDefaultProtocolsServer();
    }

    public boolean isFips() {
        return this.isInFipsMode;
    }

    public boolean isSupportedProtocols(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (str == null || !this.supportedProtocols.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    public X509ExtendedKeyManager selectX509KeyManager(KeyManager[] keyManagerArr) {
        if (keyManagerArr != null) {
            for (KeyManager keyManager : keyManagerArr) {
                if (keyManager instanceof X509KeyManager) {
                    return X509KeyManagerUtil.importX509KeyManager((X509KeyManager) keyManager);
                }
            }
        }
        return DummyX509KeyManager.INSTANCE;
    }

    public BCX509ExtendedTrustManager selectX509TrustManager(TrustManager[] trustManagerArr) {
        if (trustManagerArr == null) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                trustManagerArr = trustManagerFactory.getTrustManagers();
            } catch (Exception e10) {
                LOG.log(Level.WARNING, "Failed to load default trust managers", (Throwable) e10);
            }
        }
        if (trustManagerArr != null) {
            for (TrustManager trustManager : trustManagerArr) {
                if (trustManager instanceof X509TrustManager) {
                    return X509TrustManagerUtil.importX509TrustManager((X509TrustManager) trustManager);
                }
            }
        }
        return DummyX509TrustManager.INSTANCE;
    }

    public void updateDefaultProtocols(ProvSSLParameters provSSLParameters, boolean z10) {
        if (isDefaultProtocols(provSSLParameters.getProtocolsArray())) {
            provSSLParameters.setProtocolsArray(getDefaultProtocols(z10));
        }
    }

    public void validateNegotiatedCipherSuite(ProvSSLParameters provSSLParameters, int i) {
        String cipherSuiteName = getCipherSuiteName(i);
        if (cipherSuiteName == null || !JsseUtils.contains(provSSLParameters.getCipherSuitesArray(), cipherSuiteName) || !provSSLParameters.getAlgorithmConstraints().permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, cipherSuiteName, null) || !this.supportedCipherSuites.containsKey(cipherSuiteName) || (this.isInFipsMode && !FipsUtils.isFipsCipherSuite(cipherSuiteName))) {
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "SSL connection negotiated unsupported ciphersuite: "));
        }
    }

    public void validateNegotiatedProtocol(ProvSSLParameters provSSLParameters, ProtocolVersion protocolVersion) {
        String protocolVersionName = getProtocolVersionName(protocolVersion);
        if (protocolVersionName != null && JsseUtils.contains(provSSLParameters.getProtocolsArray(), protocolVersionName) && provSSLParameters.getAlgorithmConstraints().permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, protocolVersionName, null) && this.supportedProtocols.containsKey(protocolVersionName) && (!this.isInFipsMode || FipsUtils.isFipsProtocol(protocolVersionName))) {
            return;
        }
        throw new IllegalStateException("SSL connection negotiated unsupported protocol: " + protocolVersion);
    }

    private static String[] getDefaultCipherSuites(boolean z10) {
        List<String> list = z10 ? DEFAULT_CIPHERSUITE_LIST_FIPS : DEFAULT_CIPHERSUITE_LIST;
        String[] strArr = new String[list.size()];
        int i = 0;
        for (String str : list) {
            if (ProvAlgorithmConstraints.DEFAULT.permits(JsseUtils.TLS_CRYPTO_PRIMITIVES_BC, str, null)) {
                strArr[i] = str;
                i++;
            }
        }
        return JsseUtils.resize(strArr, i);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public synchronized SSLEngine engineCreateSSLEngine(String str, int i) {
        checkInitialized();
        return SSLEngineUtil.create(this, createContextData(), str, i);
    }

    public String[] getSupportedCipherSuites(String[] strArr) {
        if (strArr == null) {
            throw new NullPointerException("'cipherSuites' cannot be null");
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str == null || str.length() < 1) {
                throw new IllegalArgumentException("'cipherSuites' cannot contain null or empty string elements");
            }
            if (this.supportedCipherSuites.containsKey(str)) {
                arrayList.add(str);
            }
        }
        return getArray(arrayList);
    }
}

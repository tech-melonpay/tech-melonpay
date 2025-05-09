package io.sentry;

import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public class SentryOptions {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private a beforeBreadcrumb;
    private b beforeSend;
    private String cacheDirPath;
    C9.e clientReportRecorder;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private boolean debug;
    private final List<String> defaultTracePropagationTargets;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableUncaughtExceptionHandler;
    private B9.e envelopeDiskCache;
    private InterfaceC0856n envelopeReader;
    private String environment;
    private final List<InterfaceC0850h> eventProcessors;
    private InterfaceC0861t executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final List<InterfaceC0867z> integrations;
    private InterfaceC0859q logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private F9.a modulesLoader;
    private final List<r> observers;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private c profilesSampler;
    private String proguardUuid;
    private d proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private H9.e sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private InterfaceC0862u serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private e tracesSampler;
    private InterfaceC0865x transactionProfiler;
    private InterfaceC0866y transportFactory;
    private I9.g transportGate;

    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f21867a;

        /* renamed from: b, reason: collision with root package name */
        public String f21868b;

        /* renamed from: c, reason: collision with root package name */
        public String f21869c;

        /* renamed from: d, reason: collision with root package name */
        public String f21870d;
    }

    public interface e {
    }

    public SentryOptions() {
        this(false);
    }

    private H9.e createSdkVersion() {
        H9.e eVar = new H9.e("sentry.java", "6.8.0");
        eVar.f1593b = "6.8.0";
        eVar.a("maven:io.sentry:sentry");
        return eVar;
    }

    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC0850h interfaceC0850h) {
        this.eventProcessors.add(interfaceC0850h);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC0867z interfaceC0867z) {
        this.integrations.add(interfaceC0867z);
    }

    public void addScopeObserver(r rVar) {
        this.observers.add(rVar);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public a getBeforeBreadcrumb() {
        return null;
    }

    public b getBeforeSend() {
        return this.beforeSend;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public C9.e getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public B9.e getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC0856n getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<InterfaceC0850h> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC0861t getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public List<InterfaceC0867z> getIntegrations() {
        return this.integrations;
    }

    public InterfaceC0859q getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public F9.a getModulesLoader() {
        return this.modulesLoader;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public c getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public d getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<r> getScopeObservers() {
        return this.observers;
    }

    public H9.e getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC0862u getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public e getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public InterfaceC0865x getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC0866y getTransportFactory() {
        return this.transportFactory;
    }

    public I9.g getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void merge(C0851i c0851i) {
        String str = c0851i.f22016a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c0851i.f22017b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c0851i.f22018c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c0851i.f22019d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c0851i.f22020e;
        if (str5 != null) {
            setServerName(str5);
        }
        d dVar = c0851i.f22026l;
        if (dVar != null) {
            setProxy(dVar);
        }
        Boolean bool = c0851i.f22021f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c0851i.f22034t;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d10 = c0851i.i;
        if (d10 != null) {
            setTracesSampleRate(d10);
        }
        Double d11 = c0851i.f22024j;
        if (d11 != null) {
            setProfilesSampleRate(d11);
        }
        Boolean bool3 = c0851i.f22022g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = c0851i.f22023h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = c0851i.f22035u;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c0851i.f22025k).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c0851i.f22028n).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c0851i.f22027m).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c0851i.f22033s).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c0851i.f22029o != null) {
            setTracePropagationTargets(new ArrayList(c0851i.f22029o));
        }
        Iterator it4 = new ArrayList(c0851i.f22030p).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c0851i.f22031q;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l10 = c0851i.f22032r;
        if (l10 != null) {
            setIdleTimeout(l10);
        }
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    public void setBeforeSend(b bVar) {
        this.beforeSend = bVar;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        InterfaceC0859q interfaceC0859q = this.logger;
        Charset charset = J9.e.f2209a;
        String str2 = null;
        if (str != null && !str.isEmpty()) {
            try {
                str2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(str.getBytes(J9.e.f2209a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                interfaceC0859q.f(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th) {
                interfaceC0859q.h(SentryLevel.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        this.dsnHash = str2;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnableNdk(boolean z10) {
        this.enableNdk = z10;
    }

    public void setEnableScopeSync(boolean z10) {
        this.enableScopeSync = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnvelopeDiskCache(B9.e eVar) {
        if (eVar == null) {
            eVar = I9.h.f1936a;
        }
        this.envelopeDiskCache = eVar;
    }

    public void setEnvelopeReader(InterfaceC0856n interfaceC0856n) {
        if (interfaceC0856n == null) {
            interfaceC0856n = I.f21824a;
        }
        this.envelopeReader = interfaceC0856n;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC0861t interfaceC0861t) {
        if (interfaceC0861t != null) {
            this.executorService = interfaceC0861t;
        }
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setLogger(InterfaceC0859q interfaceC0859q) {
        this.logger = interfaceC0859q == null ? K.f21829a : new B1.f(this, interfaceC0859q);
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setModulesLoader(F9.a aVar) {
        if (aVar == null) {
            aVar = F9.b.f1280a;
        }
        this.modulesLoader = aVar;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfilesSampleRate(Double d10) {
        if (D9.b.l0(true, d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    @Deprecated
    public void setProfilingEnabled(boolean z10) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z10 ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(d dVar) {
        this.proxy = dVar;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d10) {
        if (d10 == null || (!d10.isNaN() && d10.doubleValue() <= 1.0d && d10.doubleValue() > 0.0d)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
    }

    public void setSdkVersion(H9.e eVar) {
        this.sdkVersion = eVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new B1.f(this);
        } else {
            this.clientReportRecorder = new D9.b();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC0862u interfaceC0862u) {
        if (interfaceC0862u == null) {
            interfaceC0862u = I.f21825b;
        }
        this.serializer = interfaceC0862u;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    @Deprecated
    public void setShutdownTimeout(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(Double d10) {
        if (D9.b.l0(true, d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionProfiler(InterfaceC0865x interfaceC0865x) {
        if (interfaceC0865x == null) {
            interfaceC0865x = I.f21826c;
        }
        this.transactionProfiler = interfaceC0865x;
    }

    public void setTransportFactory(InterfaceC0866y interfaceC0866y) {
        if (interfaceC0866y == null) {
            interfaceC0866y = O.f21833a;
        }
        this.transportFactory = interfaceC0866y;
    }

    public void setTransportGate(I9.g gVar) {
        if (gVar == null) {
            gVar = I9.c.f1930b;
        }
        this.transportGate = gVar;
    }

    private SentryOptions(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = K.f21829a;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C0848f(new G(this));
        this.serializer = new G(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = O.f21833a;
        this.transportGate = I9.c.f1930b;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = L.f21830a;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = I9.h.f1936a;
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = I.f21826c;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(".*");
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new B1.f(this);
        this.modulesLoader = F9.b.f1280a;
        if (z10) {
            return;
        }
        this.executorService = new C.N(17, (byte) 0);
        w0 w0Var = new w0();
        w0Var.f22219d = false;
        copyOnWriteArrayList2.add(w0Var);
        copyOnWriteArrayList2.add(new n0());
        copyOnWriteArrayList.add(new H(this));
        copyOnWriteArrayList.add(new C0847e(this));
        if (!J9.d.f2208a) {
            copyOnWriteArrayList.add(new j0());
        }
        setSentryClientName("sentry.java/6.8.0");
        setSdkVersion(createSdkVersion());
    }

    public void setBeforeBreadcrumb(a aVar) {
    }

    public void setProfilesSampler(c cVar) {
    }

    public void setTracesSampler(e eVar) {
    }
}

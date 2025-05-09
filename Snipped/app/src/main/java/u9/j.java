package u9;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.view.Window;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0862u;
import io.sentry.InterfaceC0864w;
import io.sentry.InterfaceC0865x;
import io.sentry.S;
import io.sentry.SentryLevel;
import io.sentry.T;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.g0;
import io.sentry.m0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Future;
import y9.f;

/* compiled from: AndroidTransactionProfiler.java */
/* loaded from: classes2.dex */
public final class j implements InterfaceC0865x {

    /* renamed from: a, reason: collision with root package name */
    public int f30418a;

    /* renamed from: b, reason: collision with root package name */
    public File f30419b;

    /* renamed from: c, reason: collision with root package name */
    public File f30420c;

    /* renamed from: d, reason: collision with root package name */
    public Future<?> f30421d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f30422e;

    /* renamed from: f, reason: collision with root package name */
    public final SentryAndroidOptions f30423f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0858p f30424g;

    /* renamed from: h, reason: collision with root package name */
    public final o f30425h;
    public final PackageInfo i;

    /* renamed from: j, reason: collision with root package name */
    public long f30426j;

    /* renamed from: k, reason: collision with root package name */
    public long f30427k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30428l;

    /* renamed from: m, reason: collision with root package name */
    public int f30429m;

    /* renamed from: n, reason: collision with root package name */
    public String f30430n;

    /* renamed from: o, reason: collision with root package name */
    public final y9.f f30431o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f30432p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayDeque<G9.b> f30433q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayDeque<G9.b> f30434r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayDeque<G9.b> f30435s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f30436t;

    public j(Context context, SentryAndroidOptions sentryAndroidOptions, o oVar, y9.f fVar) {
        C0855m c0855m = C0855m.f22069a;
        this.f30419b = null;
        this.f30420c = null;
        this.f30421d = null;
        this.f30426j = 0L;
        this.f30427k = 0L;
        this.f30428l = false;
        this.f30429m = 0;
        this.f30432p = new HashMap();
        this.f30433q = new ArrayDeque<>();
        this.f30434r = new ArrayDeque<>();
        this.f30435s = new ArrayDeque<>();
        this.f30436t = new HashMap();
        this.f30422e = context;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30423f = sentryAndroidOptions;
        this.f30424g = c0855m;
        this.f30431o = fVar;
        this.f30425h = oVar;
        this.i = p.a(context, 0, sentryAndroidOptions.getLogger(), oVar);
    }

    @SuppressLint({"NewApi"})
    public final void a(InterfaceC0864w interfaceC0864w, boolean z10) {
        String str;
        String str2;
        o oVar = this.f30425h;
        oVar.getClass();
        HashMap hashMap = this.f30432p;
        boolean containsKey = hashMap.containsKey(interfaceC0864w.g().toString());
        SentryAndroidOptions sentryAndroidOptions = this.f30423f;
        if (!containsKey) {
            sentryAndroidOptions.getLogger().h(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", interfaceC0864w.getName(), interfaceC0864w.j().f22102a.toString());
            return;
        }
        int i = this.f30429m;
        if (i > 0) {
            this.f30429m = i - 1;
        }
        sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Transaction %s (%s) finished. Transactions to be profiled: %d", interfaceC0864w.getName(), interfaceC0864w.j().f22102a.toString(), Integer.valueOf(this.f30429m));
        if (this.f30429m != 0 && !z10) {
            T t3 = (T) hashMap.get(interfaceC0864w.g().toString());
            if (t3 != null) {
                t3.a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f30426j), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f30427k));
                return;
            }
            return;
        }
        Debug.stopMethodTracing();
        String str3 = this.f30430n;
        y9.f fVar = this.f30431o;
        ActivityManager.MemoryInfo memoryInfo = null;
        if (fVar.f31177g) {
            HashMap<String, f.b> hashMap2 = fVar.f31176f;
            if (str3 != null) {
                hashMap2.remove(str3);
            }
            WeakReference<Window> weakReference = fVar.f31175e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window != null && hashMap2.isEmpty()) {
                fVar.a(window);
            }
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        long j10 = elapsedRealtimeNanos - this.f30426j;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        this.f30429m = 0;
        Future<?> future = this.f30421d;
        if (future != null) {
            future.cancel(true);
            this.f30421d = null;
        }
        if (this.f30419b == null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
            return;
        }
        try {
            ActivityManager activityManager = (ActivityManager) this.f30422e.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo2);
                memoryInfo = memoryInfo2;
            } else {
                sentryAndroidOptions.getLogger().h(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
        }
        String str4 = "";
        PackageInfo packageInfo = this.i;
        if (packageInfo != null) {
            String str5 = packageInfo.versionName;
            str2 = p.b(packageInfo, oVar);
            str = str5;
        } else {
            str = "";
            str2 = str;
        }
        String l10 = memoryInfo != null ? Long.toString(memoryInfo.totalMem) : "0";
        String[] strArr = Build.SUPPORTED_ABIS;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((T) it.next()).a(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(this.f30426j), Long.valueOf(elapsedCpuTime), Long.valueOf(this.f30427k));
            elapsedRealtimeNanos = elapsedRealtimeNanos;
            sentryAndroidOptions = sentryAndroidOptions;
        }
        SentryAndroidOptions sentryAndroidOptions2 = sentryAndroidOptions;
        ArrayDeque<G9.b> arrayDeque = this.f30434r;
        boolean isEmpty = arrayDeque.isEmpty();
        HashMap hashMap3 = this.f30436t;
        if (!isEmpty) {
            hashMap3.put("slow_frame_renders", new G9.a("nanosecond", arrayDeque));
        }
        ArrayDeque<G9.b> arrayDeque2 = this.f30435s;
        if (!arrayDeque2.isEmpty()) {
            hashMap3.put("frozen_frame_renders", new G9.a("nanosecond", arrayDeque2));
        }
        ArrayDeque<G9.b> arrayDeque3 = this.f30433q;
        if (!arrayDeque3.isEmpty()) {
            hashMap3.put("screen_frame_rates", new G9.a("hz", arrayDeque3));
        }
        File file = this.f30419b;
        String l11 = Long.toString(j10);
        int i9 = Build.VERSION.SDK_INT;
        if (strArr != null && strArr.length > 0) {
            str4 = strArr[0];
        }
        S s10 = new S(file, arrayList, interfaceC0864w, l11, i9, str4, new com.sumsub.sentry.h(4), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, oVar.a(), l10, sentryAndroidOptions2.getProguardUuid(), str, str2, sentryAndroidOptions2.getEnvironment(), z10 ? "timeout" : "normal", hashMap3);
        try {
            InterfaceC0862u serializer = sentryAndroidOptions2.getSerializer();
            long maxTraceFileSize = sentryAndroidOptions2.getMaxTraceFileSize();
            H9.e sdkVersion = sentryAndroidOptions2.getSdkVersion();
            D9.b.t0(serializer, "Serializer is required.");
            this.f30424g.k(new B1.f(new H9.g(s10.f21863w), sdkVersion, g0.b(s10, maxTraceFileSize, serializer)));
        } catch (SentryEnvelopeException e10) {
            sentryAndroidOptions2.getLogger().f(SentryLevel.ERROR, "Failed to capture profile.", e10);
        }
    }

    @Override // io.sentry.InterfaceC0865x
    public final synchronized void g(m0 m0Var) {
        this.f30423f.getExecutorService().submit(new RunnableC1537h(this, m0Var, 0));
    }

    @Override // io.sentry.InterfaceC0865x
    public final synchronized void i(InterfaceC0864w interfaceC0864w) {
        this.f30423f.getExecutorService().submit(new RunnableC1537h(this, interfaceC0864w, 2));
    }
}

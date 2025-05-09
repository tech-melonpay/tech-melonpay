package u9;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.InterfaceC0864w;
import io.sentry.SentryLevel;
import io.sentry.T;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1537h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f30412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0864w f30413c;

    public /* synthetic */ RunnableC1537h(j jVar, InterfaceC0864w interfaceC0864w, int i) {
        this.f30411a = i;
        this.f30412b = jVar;
        this.f30413c = interfaceC0864w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f30411a) {
            case 0:
                j jVar = this.f30412b;
                jVar.f30425h.getClass();
                boolean z10 = jVar.f30428l;
                SentryAndroidOptions sentryAndroidOptions = jVar.f30423f;
                if (!z10) {
                    jVar.f30428l = true;
                    String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
                    if (!sentryAndroidOptions.isProfilingEnabled()) {
                        sentryAndroidOptions.getLogger().h(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
                    } else if (profilingTracesDirPath == null) {
                        sentryAndroidOptions.getLogger().h(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                    } else {
                        int profilingTracesHz = sentryAndroidOptions.getProfilingTracesHz();
                        if (profilingTracesHz <= 0) {
                            sentryAndroidOptions.getLogger().h(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
                        } else {
                            jVar.f30418a = ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz;
                            jVar.f30420c = new File(profilingTracesDirPath);
                        }
                    }
                }
                File file = jVar.f30420c;
                if (file != null && jVar.f30418a != 0 && file.canWrite()) {
                    int i = jVar.f30429m + 1;
                    jVar.f30429m = i;
                    HashMap hashMap = jVar.f30432p;
                    InterfaceC0864w interfaceC0864w = this.f30413c;
                    if (i == 1) {
                        jVar.f30419b = new File(jVar.f30420c, UUID.randomUUID() + ".trace");
                        jVar.f30436t.clear();
                        jVar.f30433q.clear();
                        jVar.f30434r.clear();
                        jVar.f30435s.clear();
                        i iVar = new i(jVar);
                        y9.f fVar = jVar.f30431o;
                        if (fVar.f31177g) {
                            String uuid = UUID.randomUUID().toString();
                            fVar.f31176f.put(uuid, iVar);
                            fVar.b();
                            str = uuid;
                        } else {
                            str = null;
                        }
                        jVar.f30430n = str;
                        jVar.f30421d = sentryAndroidOptions.getExecutorService().d(new RunnableC1537h(jVar, interfaceC0864w, 1));
                        jVar.f30426j = SystemClock.elapsedRealtimeNanos();
                        jVar.f30427k = Process.getElapsedCpuTime();
                        hashMap.put(interfaceC0864w.g().toString(), new T(interfaceC0864w, Long.valueOf(jVar.f30426j), Long.valueOf(jVar.f30427k)));
                        Debug.startMethodTracingSampling(jVar.f30419b.getPath(), 3000000, jVar.f30418a);
                    } else {
                        hashMap.put(interfaceC0864w.g().toString(), new T(interfaceC0864w, Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(Process.getElapsedCpuTime())));
                    }
                    sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Transaction %s (%s) started. Transactions being profiled: %d", interfaceC0864w.getName(), interfaceC0864w.j().f22102a.toString(), Integer.valueOf(jVar.f30429m));
                    break;
                }
                break;
            case 1:
                this.f30412b.a(this.f30413c, true);
                break;
            default:
                this.f30412b.a(this.f30413c, false);
                break;
        }
    }
}

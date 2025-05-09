package androidx.work.impl.background.systemjob;

import C.v;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import s1.AbstractC1197g;
import t1.InterfaceC1277b;
import t1.k;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1277b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f8192c = AbstractC1197g.e("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8194b = new HashMap();

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        JobParameters jobParameters;
        AbstractC1197g.c().a(f8192c, v.n(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f8194b) {
            jobParameters = (JobParameters) this.f8194b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k b9 = k.b(getApplicationContext());
            this.f8193a = b9;
            b9.f27443f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC1197g.c().f(f8192c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f8193a;
        if (kVar != null) {
            kVar.f27443f.e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            t1.k r2 = r8.f8193a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            s1.g r0 = s1.AbstractC1197g.c()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f8192c
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r2, r5)
            r8.jobFinished(r9, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2e
            if (r5 == 0) goto L2e
            boolean r6 = r5.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2e
            if (r6 == 0) goto L2e
            java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.NullPointerException -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L43
            s1.g r9 = s1.AbstractC1197g.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f8192c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r9.b(r0, r1, r2)
            return r4
        L43:
            java.util.HashMap r5 = r8.f8194b
            monitor-enter(r5)
            java.util.HashMap r6 = r8.f8194b     // Catch: java.lang.Throwable -> L67
            boolean r6 = r6.containsKey(r2)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            s1.g r9 = s1.AbstractC1197g.c()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f8192c     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r3.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r9.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            return r4
        L67:
            r9 = move-exception
            goto Lc6
        L69:
            s1.g r1 = s1.AbstractC1197g.c()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = androidx.work.impl.background.systemjob.SystemJobService.f8192c     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L67
            r7.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r1.a(r6, r0, r4)     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = r8.f8194b     // Catch: java.lang.Throwable -> L67
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r1 = new androidx.work.WorkerParameters$a
            r1.<init>()
            java.util.List r4 = java.util.Collections.emptyList()
            r1.f8116a = r4
            java.util.List r4 = java.util.Collections.emptyList()
            r1.f8117b = r4
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto La9
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r1.f8117b = r4
        La9:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto Lb9
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r1.f8116a = r4
        Lb9:
            r4 = 28
            if (r0 < r4) goto Lc0
            v0.b.k(r9)
        Lc0:
            t1.k r9 = r8.f8193a
            r9.f(r2, r1)
            return r3
        Lc6:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            t1.k r0 = r5.f8193a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            s1.g r6 = s1.AbstractC1197g.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f8192c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            s1.g r6 = s1.AbstractC1197g.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f8192c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.b(r0, r1, r3)
            return r2
        L3c:
            s1.g r0 = s1.AbstractC1197g.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f8192c
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = s3.b.j(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r5.f8194b
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f8194b     // Catch: java.lang.Throwable -> L6e
            r2.remove(r6)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            t1.k r0 = r5.f8193a
            r0.g(r6)
            t1.k r0 = r5.f8193a
            t1.d r0 = r0.f27443f
            java.lang.Object r2 = r0.f27419k
            monitor-enter(r2)
            java.util.HashSet r0 = r0.i     // Catch: java.lang.Throwable -> L6b
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            r6 = r6 ^ r1
            return r6
        L6b:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            throw r6
        L6e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}

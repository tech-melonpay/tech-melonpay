package w1;

import B1.d;
import B1.g;
import B1.i;
import B1.p;
import B1.r;
import C1.f;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import s1.AbstractC1197g;
import s1.C1192b;
import s1.C1193c;
import t0.C1274a;
import t1.e;
import t1.k;

/* compiled from: SystemJobScheduler.java */
/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1565b implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f30812e = AbstractC1197g.e("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f30813a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f30814b;

    /* renamed from: c, reason: collision with root package name */
    public final k f30815c;

    /* renamed from: d, reason: collision with root package name */
    public final C1564a f30816d;

    public C1565b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1564a c1564a = new C1564a(context);
        this.f30813a = context;
        this.f30815c = kVar;
        this.f30814b = jobScheduler;
        this.f30816d = c1564a;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC1197g.c().b(f30812e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC1197g.c().b(f30812e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // t1.e
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // t1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f30813a
            android.app.job.JobScheduler r1 = r8.f30814b
            java.util.ArrayList r0 = d(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L76
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L76
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            b(r1, r2)
            goto L55
        L69:
            t1.k r0 = r8.f30815c
            androidx.work.impl.WorkDatabase r0 = r0.f27440c
            B1.h r0 = r0.c()
            B1.i r0 = (B1.i) r0
            r0.c(r9)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C1565b.c(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(p pVar, int i) {
        int i9;
        JobScheduler jobScheduler = this.f30814b;
        C1564a c1564a = this.f30816d;
        c1564a.getClass();
        C1192b c1192b = pVar.f251j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f243a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, c1564a.f30811a).setRequiresCharging(c1192b.f26498b).setRequiresDeviceIdle(c1192b.f26499c).setExtras(persistableBundle);
        NetworkType networkType = c1192b.f26497a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || networkType != NetworkType.f8097f) {
            int ordinal = networkType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i9 = 2;
                    if (ordinal != 2) {
                        i9 = 3;
                        if (ordinal != 3) {
                            i9 = 4;
                            if (ordinal != 4) {
                                AbstractC1197g.c().a(C1564a.f30810b, "API version too low. Cannot convert network type value " + networkType, new Throwable[0]);
                            }
                        }
                    }
                }
                i9 = 1;
            } else {
                i9 = 0;
            }
            extras.setRequiredNetworkType(i9);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!c1192b.f26499c) {
            extras.setBackoffCriteria(pVar.f254m, pVar.f253l == BackoffPolicy.f8068b ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i10 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f258q) {
            extras.setImportantWhileForeground(true);
        }
        if (c1192b.f26504h.f26505a.size() > 0) {
            Iterator it = c1192b.f26504h.f26505a.iterator();
            while (it.hasNext()) {
                C1193c.a aVar = (C1193c.a) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f26506a, aVar.f26507b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c1192b.f26502f);
            extras.setTriggerContentMaxDelay(c1192b.f26503g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(c1192b.f26500d);
        extras.setRequiresStorageNotLow(c1192b.f26501e);
        byte b9 = pVar.f252k > 0;
        boolean z10 = max > 0;
        if (C1274a.b() && pVar.f258q && b9 == false && !z10) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        AbstractC1197g c2 = AbstractC1197g.c();
        String str = pVar.f243a;
        String str2 = f30812e;
        c2.a(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                AbstractC1197g.c().f(str2, "Unable to schedule work ID " + pVar.f243a, new Throwable[0]);
                if (pVar.f258q && pVar.f259r == OutOfQuotaPolicy.f8099a) {
                    pVar.f258q = false;
                    AbstractC1197g.c().a(str2, "Scheduling a non-expedited job (work ID " + pVar.f243a + ")", new Throwable[0]);
                    e(pVar, i);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList d10 = d(this.f30813a, jobScheduler);
            int size = d10 != null ? d10.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            k kVar = this.f30815c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(((r) kVar.f27440c.f()).e().size()), Integer.valueOf(kVar.f27439b.f8125h));
            AbstractC1197g.c().b(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            AbstractC1197g.c().b(str2, "Unable to schedule " + pVar, th);
        }
    }

    @Override // t1.e
    public final void f(p... pVarArr) {
        int i;
        k kVar = this.f30815c;
        WorkDatabase workDatabase = kVar.f27440c;
        f fVar = new f(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.beginTransaction();
            try {
                p h9 = ((r) workDatabase.f()).h(pVar.f243a);
                String str = f30812e;
                if (h9 == null) {
                    AbstractC1197g.c().f(str, "Skipping scheduling " + pVar.f243a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (h9.f244b != WorkInfo$State.f8102a) {
                    AbstractC1197g.c().f(str, "Skipping scheduling " + pVar.f243a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    g a10 = ((i) workDatabase.c()).a(pVar.f243a);
                    if (a10 != null) {
                        i = a10.f232b;
                    } else {
                        kVar.f27439b.getClass();
                        int i9 = kVar.f27439b.f8124g;
                        synchronized (f.class) {
                            int a11 = fVar.a("next_job_scheduler_id");
                            i = (a11 >= 0 && a11 <= i9) ? a11 : 0;
                            fVar.f613a.b().q(new d("next_job_scheduler_id", 1));
                        }
                    }
                    if (a10 == null) {
                        ((i) kVar.f27440c.c()).b(new g(pVar.f243a, i));
                    }
                    e(pVar, i);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }
}

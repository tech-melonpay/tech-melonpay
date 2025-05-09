package t1;

import B1.r;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s1.AbstractC1197g;
import s1.AbstractC1200j;
import u1.C1511b;
import w1.C1565b;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class k extends AbstractC1200j {

    /* renamed from: j, reason: collision with root package name */
    public static k f27435j;

    /* renamed from: k, reason: collision with root package name */
    public static k f27436k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f27437l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27438a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.a f27439b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f27440c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.a f27441d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f27442e;

    /* renamed from: f, reason: collision with root package name */
    public final d f27443f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.h f27444g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27445h;
    public BroadcastReceiver.PendingResult i;

    static {
        AbstractC1197g.e("WorkManagerImpl");
        f27435j = null;
        f27436k = null;
        f27437l = new Object();
    }

    public k(Context context, androidx.work.a aVar, D1.b bVar) {
        RoomDatabase.Builder databaseBuilder;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        C1.k kVar = bVar.f858a;
        int i = WorkDatabase.f8134b;
        if (z10) {
            databaseBuilder = Room.inMemoryDatabaseBuilder(applicationContext, WorkDatabase.class).allowMainThreadQueries();
        } else {
            String str = j.f27433a;
            databaseBuilder = Room.databaseBuilder(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            databaseBuilder.openHelperFactory(new h(applicationContext));
        }
        WorkDatabase workDatabase = (WorkDatabase) databaseBuilder.setQueryExecutor(kVar).addCallback(new i()).addMigrations(androidx.work.impl.a.f8142a).addMigrations(new a.h(applicationContext, 2, 3)).addMigrations(androidx.work.impl.a.f8143b).addMigrations(androidx.work.impl.a.f8144c).addMigrations(new a.h(applicationContext, 5, 6)).addMigrations(androidx.work.impl.a.f8145d).addMigrations(androidx.work.impl.a.f8146e).addMigrations(androidx.work.impl.a.f8147f).addMigrations(new a.i(applicationContext)).addMigrations(new a.h(applicationContext, 10, 11)).addMigrations(androidx.work.impl.a.f8148g).fallbackToDestructiveMigration().build();
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1197g.a aVar2 = new AbstractC1197g.a(aVar.f8123f);
        synchronized (AbstractC1197g.class) {
            AbstractC1197g.f26512a = aVar2;
        }
        String str2 = f.f27423a;
        C1565b c1565b = new C1565b(applicationContext2, this);
        C1.g.a(applicationContext2, SystemJobService.class, true);
        AbstractC1197g.c().a(f.f27423a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<e> asList = Arrays.asList(c1565b, new C1511b(applicationContext2, aVar, bVar, this));
        d dVar = new d(context, aVar, bVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f27438a = applicationContext3;
        this.f27439b = aVar;
        this.f27441d = bVar;
        this.f27440c = workDatabase;
        this.f27442e = asList;
        this.f27443f = dVar;
        this.f27444g = new C1.h(workDatabase);
        this.f27445h = false;
        if (applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((D1.b) this.f27441d).a(new ForceStopRunnable(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k b(Context context) {
        k kVar;
        Object obj = f27437l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f27435j;
                    if (kVar == null) {
                        kVar = f27436k;
                    }
                }
                return kVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((a.b) applicationContext).a());
            kVar = b(applicationContext);
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (t1.k.f27436k != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        t1.k.f27436k = new t1.k(r4, r5, new D1.b(r5.f8119b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        t1.k.f27435j = t1.k.f27436k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = t1.k.f27437l
            monitor-enter(r0)
            t1.k r1 = t1.k.f27435j     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            t1.k r2 = t1.k.f27436k     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L34
        L16:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            t1.k r1 = t1.k.f27436k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2e
            t1.k r1 = new t1.k     // Catch: java.lang.Throwable -> L14
            D1.b r2 = new D1.b     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r3 = r5.f8119b     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            t1.k.f27436k = r1     // Catch: java.lang.Throwable -> L14
        L2e:
            t1.k r4 = t1.k.f27436k     // Catch: java.lang.Throwable -> L14
            t1.k.f27435j = r4     // Catch: java.lang.Throwable -> L14
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.c(android.content.Context, androidx.work.a):void");
    }

    public final void d() {
        synchronized (f27437l) {
            try {
                this.f27445h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList d10;
        WorkDatabase workDatabase = this.f27440c;
        Context context = this.f27438a;
        String str = C1565b.f30812e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d10 = C1565b.d(context, jobScheduler)) != null && !d10.isEmpty()) {
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                C1565b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        r rVar = (r) workDatabase.f();
        RoomDatabase roomDatabase = rVar.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        r.h hVar = rVar.i;
        d1.g acquire = hVar.acquire();
        roomDatabase.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            roomDatabase.endTransaction();
            hVar.release(acquire);
            f.a(this.f27439b, workDatabase, this.f27442e);
        } catch (Throwable th) {
            roomDatabase.endTransaction();
            hVar.release(acquire);
            throw th;
        }
    }

    public final void f(String str, WorkerParameters.a aVar) {
        D1.a aVar2 = this.f27441d;
        C1.l lVar = new C1.l();
        lVar.f623a = this;
        lVar.f624b = str;
        lVar.f625c = aVar;
        ((D1.b) aVar2).a(lVar);
    }

    public final void g(String str) {
        ((D1.b) this.f27441d).a(new C1.m(this, str, false));
    }
}

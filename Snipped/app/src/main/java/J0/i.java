package j0;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.HashMap;

/* compiled from: JobIntentService.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class i extends Service {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22263c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<ComponentName, d> f22264d = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public b f22265a;

    /* renamed from: b, reason: collision with root package name */
    public a f22266b;

    /* compiled from: JobIntentService.java */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r5) {
            /*
                r4 = this;
                java.lang.Void[] r5 = (java.lang.Void[]) r5
            L2:
                j0.i r5 = j0.i.this
                j0.i$b r0 = r5.f22265a
                r0.getClass()
                j0.i$b r5 = r5.f22265a
                java.lang.Object r0 = r5.f22269b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.f22270c     // Catch: java.lang.Throwable -> L16
                r2 = 0
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            L14:
                r0 = r2
                goto L31
            L16:
                r5 = move-exception
                goto L55
            L18:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                if (r1 == 0) goto L14
                android.content.Intent r0 = r1.getIntent()
                j0.i r3 = r5.f22268a
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r0.setExtrasClassLoader(r3)
                j0.i$b$a r0 = new j0.i$b$a
                r0.<init>(r1)
            L31:
                if (r0 == 0) goto L54
                j0.i r5 = j0.i.this
                android.app.job.JobWorkItem r1 = r0.f22271a
                r1.getIntent()
                r5.a()
                j0.i$b r5 = j0.i.b.this
                java.lang.Object r5 = r5.f22269b
                monitor-enter(r5)
                j0.i$b r1 = j0.i.b.this     // Catch: java.lang.Throwable -> L4e
                android.app.job.JobParameters r1 = r1.f22270c     // Catch: java.lang.Throwable -> L4e
                if (r1 == 0) goto L50
                android.app.job.JobWorkItem r0 = r0.f22271a     // Catch: java.lang.Throwable -> L4e
                r1.completeWork(r0)     // Catch: java.lang.Throwable -> L4e
                goto L50
            L4e:
                r0 = move-exception
                goto L52
            L50:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                goto L2
            L52:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                throw r0
            L54:
                return r2
            L55:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.i.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r12) {
            i.this.getClass();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r12) {
            i.this.getClass();
        }
    }

    /* compiled from: JobIntentService.java */
    public static final class b extends JobServiceEngine {

        /* renamed from: a, reason: collision with root package name */
        public final i f22268a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22269b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f22270c;

        /* compiled from: JobIntentService.java */
        public final class a {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f22271a;

            public a(JobWorkItem jobWorkItem) {
                this.f22271a = jobWorkItem;
            }
        }

        public b(i iVar) {
            super(iVar);
            this.f22269b = new Object();
            this.f22268a = iVar;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f22270c = jobParameters;
            i iVar = this.f22268a;
            if (iVar.f22266b != null) {
                return true;
            }
            a aVar = iVar.new a();
            iVar.f22266b = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f22268a.f22266b;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f22269b) {
                this.f22270c = null;
            }
            return true;
        }
    }

    /* compiled from: JobIntentService.java */
    public static final class c extends d {

        /* renamed from: c, reason: collision with root package name */
        public final JobInfo f22273c;

        /* renamed from: d, reason: collision with root package name */
        public final JobScheduler f22274d;

        public c(Context context, ComponentName componentName) {
            b();
            this.f22273c = new JobInfo.Builder(123321, componentName).setOverrideDeadline(0L).build();
            this.f22274d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // j0.i.d
        public final void a(Intent intent) {
            this.f22274d.enqueue(this.f22273c, new JobWorkItem(intent));
        }
    }

    /* compiled from: JobIntentService.java */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22275a;

        /* renamed from: b, reason: collision with root package name */
        public int f22276b;

        public abstract void a(Intent intent);

        public final void b() {
            if (!this.f22275a) {
                this.f22275a = true;
                this.f22276b = 123321;
            } else {
                if (this.f22276b == 123321) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID 123321 is different than previous " + this.f22276b);
            }
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        b bVar = this.f22265a;
        if (bVar != null) {
            return bVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f22265a = new b(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i9) {
        return 2;
    }
}

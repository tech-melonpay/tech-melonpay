package t1;

import B1.o;
import B1.p;
import B1.q;
import B1.r;
import B1.t;
import a3.InterfaceFutureC0509a;
import android.content.Context;
import androidx.camera.core.n;
import androidx.room.RoomDatabase;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import s1.AbstractC1197g;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f27449s = AbstractC1197g.e("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f27450a;

    /* renamed from: b, reason: collision with root package name */
    public String f27451b;

    /* renamed from: c, reason: collision with root package name */
    public List<e> f27452c;

    /* renamed from: d, reason: collision with root package name */
    public p f27453d;

    /* renamed from: e, reason: collision with root package name */
    public ListenableWorker f27454e;

    /* renamed from: f, reason: collision with root package name */
    public D1.a f27455f;

    /* renamed from: g, reason: collision with root package name */
    public ListenableWorker.a f27456g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.work.a f27457h;
    public A1.a i;

    /* renamed from: j, reason: collision with root package name */
    public WorkDatabase f27458j;

    /* renamed from: k, reason: collision with root package name */
    public q f27459k;

    /* renamed from: l, reason: collision with root package name */
    public B1.b f27460l;

    /* renamed from: m, reason: collision with root package name */
    public t f27461m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f27462n;

    /* renamed from: o, reason: collision with root package name */
    public String f27463o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.work.impl.utils.futures.a<Boolean> f27464p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceFutureC0509a<ListenableWorker.a> f27465q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f27466r;

    public final void a(ListenableWorker.a aVar) {
        boolean z10 = aVar instanceof ListenableWorker.a.c;
        String str = f27449s;
        if (!z10) {
            if (aVar instanceof ListenableWorker.a.b) {
                AbstractC1197g.c().d(str, s3.b.j("Worker result RETRY for ", this.f27463o), new Throwable[0]);
                d();
                return;
            }
            AbstractC1197g.c().d(str, s3.b.j("Worker result FAILURE for ", this.f27463o), new Throwable[0]);
            if (this.f27453d.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        AbstractC1197g.c().d(str, s3.b.j("Worker result SUCCESS for ", this.f27463o), new Throwable[0]);
        if (this.f27453d.c()) {
            e();
            return;
        }
        B1.b bVar = this.f27460l;
        String str2 = this.f27451b;
        q qVar = this.f27459k;
        WorkDatabase workDatabase = this.f27458j;
        workDatabase.beginTransaction();
        try {
            ((r) qVar).m(WorkInfo$State.f8104c, str2);
            ((r) qVar).k(str2, ((ListenableWorker.a.c) this.f27456g).f8091a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = ((B1.c) bVar).a(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (((r) qVar).f(str3) == WorkInfo$State.f8106e && ((B1.c) bVar).b(str3)) {
                    AbstractC1197g.c().d(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                    ((r) qVar).m(WorkInfo$State.f8102a, str3);
                    ((r) qVar).l(str3, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            f(false);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            f(false);
            throw th;
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            r rVar = (r) this.f27459k;
            if (rVar.f(str2) != WorkInfo$State.f8107f) {
                rVar.m(WorkInfo$State.f8105d, str2);
            }
            linkedList.addAll(((B1.c) this.f27460l).a(str2));
        }
    }

    public final void c() {
        boolean i = i();
        String str = this.f27451b;
        WorkDatabase workDatabase = this.f27458j;
        if (!i) {
            workDatabase.beginTransaction();
            try {
                WorkInfo$State f10 = ((r) this.f27459k).f(str);
                o oVar = (o) workDatabase.e();
                RoomDatabase roomDatabase = oVar.f240a;
                roomDatabase.assertNotSuspendingTransaction();
                o.b bVar = oVar.f241b;
                d1.g acquire = bVar.acquire();
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                roomDatabase.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    roomDatabase.setTransactionSuccessful();
                    if (f10 == null) {
                        f(false);
                    } else if (f10 == WorkInfo$State.f8103b) {
                        a(this.f27456g);
                    } else if (!f10.a()) {
                        d();
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                } finally {
                    roomDatabase.endTransaction();
                    bVar.release(acquire);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        List<e> list = this.f27452c;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(str);
            }
            f.a(this.f27457h, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f27451b;
        q qVar = this.f27459k;
        WorkDatabase workDatabase = this.f27458j;
        workDatabase.beginTransaction();
        try {
            ((r) qVar).m(WorkInfo$State.f8102a, str);
            ((r) qVar).l(str, System.currentTimeMillis());
            ((r) qVar).j(str, -1L);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(true);
        }
    }

    public final void e() {
        String str = this.f27451b;
        q qVar = this.f27459k;
        WorkDatabase workDatabase = this.f27458j;
        workDatabase.beginTransaction();
        try {
            ((r) qVar).l(str, System.currentTimeMillis());
            ((r) qVar).m(WorkInfo$State.f8102a, str);
            r rVar = (r) qVar;
            RoomDatabase roomDatabase = rVar.f262a;
            roomDatabase.assertNotSuspendingTransaction();
            r.f fVar = rVar.f268g;
            d1.g acquire = fVar.acquire();
            if (str == null) {
                acquire.bindNull(1);
            } else {
                acquire.bindString(1, str);
            }
            roomDatabase.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                roomDatabase.setTransactionSuccessful();
                roomDatabase.endTransaction();
                fVar.release(acquire);
                ((r) qVar).j(str, -1L);
                workDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                roomDatabase.endTransaction();
                fVar.release(acquire);
                throw th;
            }
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0060, B:17:0x0064, B:19:0x0068, B:21:0x006e, B:22:0x0076, B:30:0x0083, B:32:0x0084, B:38:0x0098, B:39:0x009e, B:24:0x0077, B:25:0x007f, B:5:0x0021, B:7:0x0027), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0060, B:17:0x0064, B:19:0x0068, B:21:0x006e, B:22:0x0076, B:30:0x0083, B:32:0x0084, B:38:0x0098, B:39:0x009e, B:24:0x0077, B:25:0x007f, B:5:0x0021, B:7:0x0027), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r5) {
        /*
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.f27458j
            r0.beginTransaction()
            androidx.work.impl.WorkDatabase r0 = r4.f27458j     // Catch: java.lang.Throwable -> L42
            B1.q r0 = r0.f()     // Catch: java.lang.Throwable -> L42
            B1.r r0 = (B1.r) r0     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            androidx.room.RoomSQLiteQuery r1 = androidx.room.RoomSQLiteQuery.acquire(r1, r2)     // Catch: java.lang.Throwable -> L42
            androidx.room.RoomDatabase r0 = r0.f262a     // Catch: java.lang.Throwable -> L42
            r0.assertNotSuspendingTransaction()     // Catch: java.lang.Throwable -> L42
            r3 = 0
            android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L2f:
            r5 = move-exception
            goto L98
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r4.f27450a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            C1.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r5 = move-exception
            goto L9f
        L44:
            if (r5 == 0) goto L60
            B1.q r0 = r4.f27459k     // Catch: java.lang.Throwable -> L42
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.f8102a     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r4.f27451b     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L42
            B1.r r0 = (B1.r) r0     // Catch: java.lang.Throwable -> L42
            r0.m(r1, r2)     // Catch: java.lang.Throwable -> L42
            B1.q r0 = r4.f27459k     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.f27451b     // Catch: java.lang.Throwable -> L42
            B1.r r0 = (B1.r) r0     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L42
        L60:
            B1.p r0 = r4.f27453d     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L84
            androidx.work.ListenableWorker r0 = r4.f27454e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L84
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L84
            A1.a r0 = r4.i     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.f27451b     // Catch: java.lang.Throwable -> L42
            t1.d r0 = (t1.d) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f27419k     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f27415f     // Catch: java.lang.Throwable -> L81
            r3.remove(r1)     // Catch: java.lang.Throwable -> L81
            r0.h()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            goto L84
        L81:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            throw r5     // Catch: java.lang.Throwable -> L42
        L84:
            androidx.work.impl.WorkDatabase r0 = r4.f27458j     // Catch: java.lang.Throwable -> L42
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r4.f27458j
            r0.endTransaction()
            androidx.work.impl.utils.futures.a<java.lang.Boolean> r0 = r4.f27464p
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.i(r5)
            return
        L98:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        L9f:
            androidx.work.impl.WorkDatabase r0 = r4.f27458j
            r0.endTransaction()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.m.f(boolean):void");
    }

    public final void g() {
        r rVar = (r) this.f27459k;
        String str = this.f27451b;
        WorkInfo$State f10 = rVar.f(str);
        WorkInfo$State workInfo$State = WorkInfo$State.f8103b;
        String str2 = f27449s;
        if (f10 == workInfo$State) {
            AbstractC1197g.c().a(str2, n.a("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        AbstractC1197g.c().a(str2, "Status for " + str + " is " + f10 + "; not doing any work", new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f27451b;
        WorkDatabase workDatabase = this.f27458j;
        workDatabase.beginTransaction();
        try {
            b(str);
            ((r) this.f27459k).k(str, ((ListenableWorker.a.C0085a) this.f27456g).f8090a);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f27466r) {
            return false;
        }
        AbstractC1197g.c().a(f27449s, s3.b.j("Work interrupted for ", this.f27463o), new Throwable[0]);
        if (((r) this.f27459k).f(this.f27451b) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r6.f252k > 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.m.run():void");
    }
}

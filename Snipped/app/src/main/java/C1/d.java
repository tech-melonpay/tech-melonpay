package C1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import s1.AbstractC1197g;
import s1.InterfaceC1199i;
import t1.C1278c;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f610c = AbstractC1197g.e("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final t1.g f611a;

    /* renamed from: b, reason: collision with root package name */
    public final C1278c f612b = new C1278c();

    public d(t1.g gVar) {
        this.f611a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021d  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(t1.g r26) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.d.a(t1.g):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1278c c1278c = this.f612b;
        t1.g gVar = this.f611a;
        try {
            gVar.getClass();
            t1.k kVar = gVar.f27425b;
            if (t1.g.f(gVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + gVar + ")");
            }
            WorkDatabase workDatabase = kVar.f27440c;
            workDatabase.beginTransaction();
            try {
                boolean a10 = a(gVar);
                workDatabase.setTransactionSuccessful();
                if (a10) {
                    g.a(kVar.f27438a, RescheduleReceiver.class, true);
                    t1.f.a(kVar.f27439b, kVar.f27440c, kVar.f27442e);
                }
                c1278c.a(InterfaceC1199i.f26514a);
            } finally {
                workDatabase.endTransaction();
            }
        } catch (Throwable th) {
            c1278c.a(new InterfaceC1199i.a.C0470a(th));
        }
    }
}

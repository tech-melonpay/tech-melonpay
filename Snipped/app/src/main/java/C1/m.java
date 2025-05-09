package C1;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import s1.AbstractC1197g;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f626d = AbstractC1197g.e("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final t1.k f627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f629c;

    public m(t1.k kVar, String str, boolean z10) {
        this.f627a = kVar;
        this.f628b = str;
        this.f629c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j10;
        t1.k kVar = this.f627a;
        WorkDatabase workDatabase = kVar.f27440c;
        t1.d dVar = kVar.f27443f;
        B1.q f10 = workDatabase.f();
        workDatabase.beginTransaction();
        try {
            String str = this.f628b;
            synchronized (dVar.f27419k) {
                containsKey = dVar.f27415f.containsKey(str);
            }
            if (this.f629c) {
                j10 = this.f627a.f27443f.i(this.f628b);
            } else {
                if (!containsKey) {
                    B1.r rVar = (B1.r) f10;
                    if (rVar.f(this.f628b) == WorkInfo$State.f8103b) {
                        rVar.m(WorkInfo$State.f8102a, this.f628b);
                    }
                }
                j10 = this.f627a.f27443f.j(this.f628b);
            }
            AbstractC1197g.c().a(f626d, "StopWorkRunnable for " + this.f628b + "; Processor.stopWork = " + j10, new Throwable[0]);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}

package C1;

import androidx.work.impl.WorkDatabase;
import s1.AbstractC1197g;
import s1.InterfaceC1195e;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class q implements InterfaceC1195e {

    /* renamed from: a, reason: collision with root package name */
    public final D1.a f648a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.a f649b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.q f650c;

    static {
        AbstractC1197g.e("WMFgUpdater");
    }

    public q(WorkDatabase workDatabase, A1.a aVar, D1.a aVar2) {
        this.f649b = aVar;
        this.f648a = aVar2;
        this.f650c = workDatabase.f();
    }
}

package n2;

import C.N;
import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.concurrent.Executor;
import k2.h;
import l2.InterfaceC0982b;
import o2.C1087a;
import o2.e;
import o2.f;
import p2.AbstractC1103d;
import p2.InterfaceC1102c;
import p2.g;
import p2.j;
import p2.l;
import q2.InterfaceC1129a;
import r2.b;
import r2.c;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062c implements InterfaceC0982b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24093a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final N9.a f24094b;

    /* renamed from: c, reason: collision with root package name */
    public final N9.a f24095c;

    /* renamed from: d, reason: collision with root package name */
    public final N9.a f24096d;

    /* renamed from: e, reason: collision with root package name */
    public final N9.a f24097e;

    public C1062c(h hVar) {
        r2.b bVar = b.a.f26146a;
        r2.c cVar = c.a.f26147a;
        g gVar = g.a.f25598a;
        this.f24094b = bVar;
        this.f24095c = cVar;
        this.f24096d = gVar;
        this.f24097e = hVar;
    }

    @Override // N9.a
    public final Object get() {
        switch (this.f24093a) {
            case 0:
                Context context = (Context) this.f24094b.get();
                InterfaceC1102c interfaceC1102c = (InterfaceC1102c) this.f24095c.get();
                SchedulerConfig schedulerConfig = (SchedulerConfig) this.f24096d.get();
                return new C1087a(context, interfaceC1102c, schedulerConfig);
            case 1:
                return new e((Executor) this.f24094b.get(), (InterfaceC1102c) this.f24095c.get(), (f) this.f24096d.get(), (InterfaceC1129a) this.f24097e.get());
            default:
                return new j((r2.a) this.f24094b.get(), (r2.a) this.f24095c.get(), (AbstractC1103d) this.f24096d.get(), (l) this.f24097e.get());
        }
    }

    public C1062c(N9.a aVar, N9.a aVar2, C1062c c1062c, N9.a aVar3) {
        this.f24094b = aVar;
        this.f24095c = aVar2;
        this.f24096d = c1062c;
        this.f24097e = aVar3;
    }

    public C1062c(N9.a aVar, N9.a aVar2, N n10) {
        r2.c cVar = c.a.f26147a;
        this.f24094b = aVar;
        this.f24095c = aVar2;
        this.f24096d = n10;
        this.f24097e = cVar;
    }
}

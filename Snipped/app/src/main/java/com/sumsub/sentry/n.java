package com.sumsub.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class n implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13720d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final l0 f13721a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f13722b;

    /* renamed from: c, reason: collision with root package name */
    public final k f13723c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public n(l0 l0Var, b0 b0Var, k kVar) {
        this.f13721a = l0Var;
        this.f13722b = b0Var;
        this.f13723c = kVar;
    }

    public z a(z zVar) {
        c((u) zVar);
        b(zVar);
        b((u) zVar);
        c(zVar);
        t.f13782a.a(zVar);
        return zVar;
    }

    public final void b(u uVar) {
        d(uVar);
        g(uVar);
        f(uVar);
        a(uVar);
    }

    public final void c(u uVar) {
        e(uVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k kVar = this.f13723c;
        if (kVar != null) {
            kVar.c();
        }
    }

    public final void d(u uVar) {
        if (uVar.getEnvironment() == null) {
            uVar.c("production");
        }
    }

    public final void e(u uVar) {
        if (uVar.getPlatform() == null) {
            uVar.e(u.f13785m);
        }
    }

    public final void f(u uVar) {
        if (uVar.getSdk() == null) {
            uVar.a(new s("SumSub", "1.32.0", (List) null, (List) null, 12, (DefaultConstructorMarker) null));
        }
    }

    public final void g(u uVar) {
        if (this.f13723c == null || uVar.getServerName() != null) {
            return;
        }
        uVar.g(this.f13723c.d());
    }

    public final void c(z zVar) {
        List<a0> a10;
        if (zVar.Q() == null) {
            m0<a0> E8 = zVar.E();
            ArrayList arrayList = null;
            if (E8 != null && (a10 = E8.a()) != null) {
                for (a0 a0Var : a10) {
                    if (a0Var.getMechanism() != null && a0Var.getThreadId() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a0Var.getThreadId());
                    }
                }
            }
            List<k0> a11 = this.f13721a.a(arrayList);
            if (a11 != null) {
                zVar.b(new m0<>(a11));
            }
        }
    }

    public /* synthetic */ n(l0 l0Var, b0 b0Var, k kVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new l0(new j0((List) null, (List) null, 3, (DefaultConstructorMarker) null)) : l0Var, (i & 2) != 0 ? new b0(new j0((List) null, (List) null, 3, (DefaultConstructorMarker) null)) : b0Var, kVar);
    }

    public final void b(z zVar) {
        Throwable throwableMechanism = zVar.getThrowableMechanism();
        if (throwableMechanism != null) {
            zVar.a(new m0<>(P9.s.c0(P9.s.H(this.f13722b.b(throwableMechanism)))));
        }
    }

    public final void a(u uVar) {
        if (uVar.getUser() == null) {
            uVar.a(new q0((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
        }
    }
}

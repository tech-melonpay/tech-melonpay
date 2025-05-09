package io.sentry;

import io.sentry.protocol.Contexts;

/* compiled from: SentryRuntimeEventProcessor.java */
/* loaded from: classes2.dex */
public final class j0 implements InterfaceC0850h {

    /* renamed from: a, reason: collision with root package name */
    public final String f22050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22051b;

    public j0() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f22050a = property;
        this.f22051b = property2;
    }

    public final void a(Z z10) {
        io.sentry.protocol.h hVar = (io.sentry.protocol.h) z10.f21918b.d(io.sentry.protocol.h.class, com.sumsub.sentry.f0.f13630d);
        Contexts contexts = z10.f21918b;
        if (hVar == null) {
            contexts.put(com.sumsub.sentry.f0.f13630d, new io.sentry.protocol.h());
        }
        io.sentry.protocol.h hVar2 = (io.sentry.protocol.h) contexts.d(io.sentry.protocol.h.class, com.sumsub.sentry.f0.f13630d);
        if (hVar2 != null && hVar2.f22181a == null && hVar2.f22182b == null) {
            hVar2.f22181a = this.f22051b;
            hVar2.f22182b = this.f22050a;
        }
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        a(i0Var);
        return i0Var;
    }

    @Override // io.sentry.InterfaceC0850h
    public final H9.m i(H9.m mVar, C0852j c0852j) {
        a(mVar);
        return mVar;
    }
}

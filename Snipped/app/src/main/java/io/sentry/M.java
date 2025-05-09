package io.sentry;

/* compiled from: NoOpSpan.java */
/* loaded from: classes2.dex */
public final class M implements InterfaceC0863v {

    /* renamed from: a, reason: collision with root package name */
    public static final M f21831a = new M();

    @Override // io.sentry.InterfaceC0863v
    public final boolean b() {
        return false;
    }

    @Override // io.sentry.InterfaceC0863v
    public final SpanStatus getStatus() {
        return null;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v h(String str) {
        return f21831a;
    }

    @Override // io.sentry.InterfaceC0863v
    public final p0 j() {
        return new p0(H9.g.f1604b, q0.f22185b, "op", null, null);
    }

    @Override // io.sentry.InterfaceC0863v
    public final void d() {
    }

    @Override // io.sentry.InterfaceC0863v
    public final void c(SpanStatus spanStatus) {
    }

    @Override // io.sentry.InterfaceC0863v
    public final void f(String str) {
    }
}

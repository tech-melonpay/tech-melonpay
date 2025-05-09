package io.sentry;

/* compiled from: HubAdapter.java */
/* renamed from: io.sentry.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0855m implements InterfaceC0858p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0855m f22069a = new C0855m();

    @Override // io.sentry.InterfaceC0858p
    public final void a(long j10) {
        Y.b().a(j10);
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g c(B1.f fVar, C0852j c0852j) {
        return Y.b().c(fVar, c0852j);
    }

    @Override // io.sentry.InterfaceC0858p
    public final void close() {
        Y.a();
    }

    @Override // io.sentry.InterfaceC0858p
    public final InterfaceC0864w d(u0 u0Var, v0 v0Var) {
        return Y.b().d(u0Var, v0Var);
    }

    @Override // io.sentry.InterfaceC0858p
    public final void e(C0844b c0844b, C0852j c0852j) {
        Y.b().e(c0844b, c0852j);
    }

    @Override // io.sentry.InterfaceC0858p
    public final void f(V v10) {
        Y.b().f(v10);
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g g(H9.m mVar, s0 s0Var, C0852j c0852j) {
        return Y.b().g(mVar, s0Var, c0852j);
    }

    @Override // io.sentry.InterfaceC0858p
    public final SentryOptions h() {
        return Y.b().h();
    }

    @Override // io.sentry.InterfaceC0858p
    public final boolean isEnabled() {
        return Y.e();
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g j(Throwable th, C0852j c0852j) {
        return Y.b().j(th, c0852j);
    }

    @Override // io.sentry.InterfaceC0858p
    public final void l() {
        Y.b().l();
    }

    @Override // io.sentry.InterfaceC0858p
    public final void m() {
        Y.b().m();
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g n(i0 i0Var, C0852j c0852j) {
        return Y.b().n(i0Var, c0852j);
    }

    @Override // io.sentry.InterfaceC0858p
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0858p m94clone() {
        return Y.b().m93clone();
    }
}

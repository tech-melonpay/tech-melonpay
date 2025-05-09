package io.sentry;

/* compiled from: IHub.java */
/* renamed from: io.sentry.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0858p {
    void a(long j10);

    default void b(C0844b c0844b) {
        e(c0844b, new C0852j());
    }

    H9.g c(B1.f fVar, C0852j c0852j);

    InterfaceC0858p clone();

    void close();

    InterfaceC0864w d(u0 u0Var, v0 v0Var);

    void e(C0844b c0844b, C0852j c0852j);

    void f(V v10);

    H9.g g(H9.m mVar, s0 s0Var, C0852j c0852j);

    SentryOptions h();

    default H9.g i(Throwable th) {
        return j(th, new C0852j());
    }

    boolean isEnabled();

    H9.g j(Throwable th, C0852j c0852j);

    default void k(B1.f fVar) {
        c(fVar, new C0852j());
    }

    void l();

    void m();

    H9.g n(i0 i0Var, C0852j c0852j);
}

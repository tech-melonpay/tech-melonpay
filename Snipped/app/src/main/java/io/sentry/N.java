package io.sentry;

import io.sentry.protocol.TransactionNameSource;
import java.util.Date;

/* compiled from: NoOpTransaction.java */
/* loaded from: classes2.dex */
public final class N implements InterfaceC0864w {

    /* renamed from: a, reason: collision with root package name */
    public static final N f21832a = new N();

    @Override // io.sentry.InterfaceC0863v
    public final s0 a() {
        return new s0(H9.g.f1604b, "", null, null, null, null, null, null);
    }

    @Override // io.sentry.InterfaceC0863v
    public final boolean b() {
        return true;
    }

    @Override // io.sentry.InterfaceC0864w
    public final o0 e() {
        return null;
    }

    @Override // io.sentry.InterfaceC0864w
    public final H9.g g() {
        return H9.g.f1604b;
    }

    @Override // io.sentry.InterfaceC0864w
    public final String getName() {
        return "";
    }

    @Override // io.sentry.InterfaceC0863v
    public final SpanStatus getStatus() {
        return null;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v h(String str) {
        return M.f21831a;
    }

    @Override // io.sentry.InterfaceC0863v
    public final p0 j() {
        return new p0(H9.g.f1604b, q0.f22185b, "op", null, null);
    }

    @Override // io.sentry.InterfaceC0864w
    public final TransactionNameSource k() {
        return TransactionNameSource.CUSTOM;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v l(Date date, String str, String str2) {
        return M.f21831a;
    }

    @Override // io.sentry.InterfaceC0863v
    public final void d() {
    }

    @Override // io.sentry.InterfaceC0864w
    public final void i() {
    }

    @Override // io.sentry.InterfaceC0863v
    public final void c(SpanStatus spanStatus) {
    }

    @Override // io.sentry.InterfaceC0863v
    public final void f(String str) {
    }
}

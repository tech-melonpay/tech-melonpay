package io.sentry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f22068a;

    public /* synthetic */ l0(m0 m0Var) {
        this.f22068a = m0Var;
    }

    @Override // io.sentry.V
    public void c(U u6) {
        m0 m0Var = this.f22068a;
        m0Var.getClass();
        synchronized (u6.f21907n) {
            if (u6.f21896b == m0Var) {
                u6.a();
            }
        }
    }
}

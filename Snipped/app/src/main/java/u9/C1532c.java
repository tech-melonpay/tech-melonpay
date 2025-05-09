package u9;

import io.sentry.InterfaceC0864w;
import io.sentry.SentryLevel;
import io.sentry.U;
import io.sentry.V;
import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1532c implements V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1533d f30397b;
    public final /* synthetic */ InterfaceC0864w i;

    public /* synthetic */ C1532c(C1533d c1533d, InterfaceC0864w interfaceC0864w, int i) {
        this.f30396a = i;
        this.f30397b = c1533d;
        this.i = interfaceC0864w;
    }

    @Override // io.sentry.V
    public final void c(U u6) {
        switch (this.f30396a) {
            case 0:
                C1533d c1533d = this.f30397b;
                InterfaceC0864w interfaceC0864w = this.i;
                c1533d.getClass();
                synchronized (u6.f21907n) {
                    if (u6.f21896b == null) {
                        u6.b(interfaceC0864w);
                    } else {
                        SentryAndroidOptions sentryAndroidOptions = c1533d.f30400c;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC0864w.getName());
                        }
                    }
                }
                return;
            default:
                C1533d c1533d2 = this.f30397b;
                InterfaceC0864w interfaceC0864w2 = this.i;
                c1533d2.getClass();
                synchronized (u6.f21907n) {
                    if (u6.f21896b == interfaceC0864w2) {
                        u6.a();
                    }
                }
                return;
        }
    }
}

package io.sentry;

import io.sentry.g0;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0.a f21989b;

    public /* synthetic */ e0(g0.a aVar, int i) {
        this.f21988a = i;
        this.f21989b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21988a) {
            case 0:
                return Integer.valueOf(this.f21989b.a().length);
            case 1:
                return this.f21989b.a();
            case 2:
                return Integer.valueOf(this.f21989b.a().length);
            case 3:
                return this.f21989b.a();
            case 4:
                return Integer.valueOf(this.f21989b.a().length);
            case 5:
                return this.f21989b.a();
            case 6:
                return Integer.valueOf(this.f21989b.a().length);
            case 7:
                return this.f21989b.a();
            case 8:
                return Integer.valueOf(this.f21989b.a().length);
            default:
                return this.f21989b.a();
        }
    }
}

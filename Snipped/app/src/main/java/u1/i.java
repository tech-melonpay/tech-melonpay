package U1;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;

/* compiled from: TransactionViewModel.kt */
/* loaded from: classes.dex */
public final class i extends U {

    /* renamed from: b, reason: collision with root package name */
    public final long f3659b;

    public /* synthetic */ i() {
        this(0L);
    }

    @Override // androidx.lifecycle.U, androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls) {
        if (kotlin.jvm.internal.f.b(cls, h.class)) {
            return new h(this.f3659b);
        }
        throw new IllegalArgumentException(("Cannot create " + cls).toString());
    }

    public i(long j10) {
        this.f3659b = j10;
    }
}

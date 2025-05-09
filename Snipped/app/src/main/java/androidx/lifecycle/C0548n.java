package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548n extends AbstractC0547m implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f7092a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.d f7093b;

    public C0548n(Lifecycle lifecycle, kotlin.coroutines.d dVar) {
        this.f7092a = lifecycle;
        this.f7093b = dVar;
        if (lifecycle.b() == Lifecycle.State.f6975a) {
            JobKt__JobKt.cancel$default(dVar, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.AbstractC0547m
    public final Lifecycle a() {
        return this.f7092a;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f7092a;
        if (lifecycle.b().compareTo(Lifecycle.State.f6975a) <= 0) {
            lifecycle.c(this);
            JobKt__JobKt.cancel$default(this.f7093b, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.f7093b;
    }
}

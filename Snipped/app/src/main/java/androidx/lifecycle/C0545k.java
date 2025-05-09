package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.C0582b;

/* compiled from: LegacySavedStateHandleController.kt */
/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545k implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f7086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0582b f7087b;

    public C0545k(Lifecycle lifecycle, C0582b c0582b) {
        this.f7086a = lifecycle;
        this.f7087b = c0582b;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f7086a.c(this);
            this.f7087b.d();
        }
    }
}

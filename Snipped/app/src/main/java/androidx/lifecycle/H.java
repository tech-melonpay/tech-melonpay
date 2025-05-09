package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class H implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateHandlesProvider f6961a;

    public H(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f6961a = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            rVar.getLifecycle().c(this);
            this.f6961a.c();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}

package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.C0582b;
import java.io.Closeable;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class I implements InterfaceC0550p, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f6962a;

    /* renamed from: b, reason: collision with root package name */
    public final G f6963b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6964c;

    public I(G g10, String str) {
        this.f6962a = str;
        this.f6963b = g10;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f6964c = false;
            rVar.getLifecycle().c(this);
        }
    }

    public final void i(Lifecycle lifecycle, C0582b c0582b) {
        if (!(!this.f6964c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f6964c = true;
        lifecycle.a(this);
        c0582b.c(this.f6962a, this.f6963b.f6960e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

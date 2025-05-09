package b1;

import U0.h;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import b1.C0582b;
import java.util.Map;
import o.b;

/* compiled from: SavedStateRegistryController.kt */
/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0584d f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final C0582b f8286b = new C0582b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8287c;

    public C0583c(InterfaceC0584d interfaceC0584d) {
        this.f8285a = interfaceC0584d;
    }

    public final void a() {
        InterfaceC0584d interfaceC0584d = this.f8285a;
        Lifecycle lifecycle = interfaceC0584d.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.f6976b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new C0581a(interfaceC0584d));
        C0582b c0582b = this.f8286b;
        if (!(!c0582b.f8280b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new h(c0582b, 2));
        c0582b.f8280b = true;
        this.f8287c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f8287c) {
            a();
        }
        Lifecycle lifecycle = this.f8285a.getLifecycle();
        if (!(!lifecycle.b().a(Lifecycle.State.f6978d))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        C0582b c0582b = this.f8286b;
        if (!c0582b.f8280b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c0582b.f8282d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c0582b.f8281c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0582b.f8282d = true;
    }

    public final void c(Bundle bundle) {
        C0582b c0582b = this.f8286b;
        c0582b.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c0582b.f8281c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.b<String, C0582b.InterfaceC0093b> bVar = c0582b.f8279a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f24328c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C0582b.InterfaceC0093b) entry.getValue()).b());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

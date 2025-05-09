package androidx.lifecycle;

import android.os.Bundle;
import b1.C0582b;
import ca.InterfaceC0635a;
import java.util.Map;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements C0582b.InterfaceC0093b {

    /* renamed from: a, reason: collision with root package name */
    public final C0582b f7048a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7049b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f7050c;

    /* renamed from: d, reason: collision with root package name */
    public final O9.f f7051d;

    public SavedStateHandlesProvider(C0582b c0582b, final X x9) {
        this.f7048a = c0582b;
        this.f7051d = kotlin.a.a(new InterfaceC0635a<K>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final K invoke() {
                return J.c(X.this);
            }
        });
    }

    public final K a() {
        return (K) this.f7051d.getValue();
    }

    @Override // b1.C0582b.InterfaceC0093b
    public final Bundle b() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7050c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : a().f6968k.entrySet()) {
            String str = (String) entry.getKey();
            Bundle b9 = ((G) entry.getValue()).f6960e.b();
            if (!kotlin.jvm.internal.f.b(b9, Bundle.EMPTY)) {
                bundle.putBundle(str, b9);
            }
        }
        this.f7049b = false;
        return bundle;
    }

    public final void c() {
        if (this.f7049b) {
            return;
        }
        Bundle a10 = this.f7048a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7050c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a10 != null) {
            bundle.putAll(a10);
        }
        this.f7050c = bundle;
        this.f7049b = true;
        a();
    }
}

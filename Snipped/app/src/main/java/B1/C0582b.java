package b1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0544j;
import b1.C0581a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.f;
import o.b;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8280b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8281c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8282d;

    /* renamed from: e, reason: collision with root package name */
    public C0581a.C0092a f8283e;

    /* renamed from: a, reason: collision with root package name */
    public final o.b<String, InterfaceC0093b> f8279a = new o.b<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8284f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: b1.b$a */
    public interface a {
        void a(InterfaceC0584d interfaceC0584d);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: b1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0093b {
        Bundle b();
    }

    public final Bundle a(String str) {
        if (!this.f8282d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f8281c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f8281c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f8281c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f8281c = null;
        }
        return bundle2;
    }

    public final InterfaceC0093b b() {
        String str;
        InterfaceC0093b interfaceC0093b;
        Iterator<Map.Entry<String, InterfaceC0093b>> it = this.f8279a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            str = (String) entry.getKey();
            interfaceC0093b = (InterfaceC0093b) entry.getValue();
        } while (!f.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0093b;
    }

    public final void c(String str, InterfaceC0093b interfaceC0093b) {
        if (this.f8279a.b(str, interfaceC0093b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f8284f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0581a.C0092a c0092a = this.f8283e;
        if (c0092a == null) {
            c0092a = new C0581a.C0092a(this);
        }
        this.f8283e = c0092a;
        try {
            C0544j.a.class.getDeclaredConstructor(null);
            C0581a.C0092a c0092a2 = this.f8283e;
            if (c0092a2 != null) {
                c0092a2.f8278a.add(C0544j.a.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C0544j.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}

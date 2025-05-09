package b1;

import android.os.Bundle;
import androidx.camera.core.n;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import b1.C0582b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: Recreator.kt */
/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581a implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0584d f8277a;

    /* compiled from: Recreator.kt */
    /* renamed from: b1.a$a, reason: collision with other inner class name */
    public static final class C0092a implements C0582b.InterfaceC0093b {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f8278a = new LinkedHashSet();

        public C0092a(C0582b c0582b) {
            c0582b.c("androidx.savedstate.Restarter", this);
        }

        @Override // b1.C0582b.InterfaceC0093b
        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f8278a));
            return bundle;
        }
    }

    public C0581a(InterfaceC0584d interfaceC0584d) {
        this.f8277a = interfaceC0584d;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.getLifecycle().c(this);
        InterfaceC0584d interfaceC0584d = this.f8277a;
        Bundle a10 = interfaceC0584d.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a10 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, C0581a.class.getClassLoader()).asSubclass(C0582b.a.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((C0582b.a) declaredConstructor.newInstance(null)).a(interfaceC0584d);
                    } catch (Exception e10) {
                        throw new RuntimeException(s3.b.j("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(n.a("Class ", str, " wasn't found"), e12);
            }
        }
    }
}

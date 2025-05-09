package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.camera.core.n;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;

/* compiled from: NavigatorProvider.kt */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7330b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7331a = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = j.f7330b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                Navigator.b bVar = (Navigator.b) cls.getAnnotation(Navigator.b.class);
                str = bVar != null ? bVar.value() : null;
                if (str == null || str.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, str);
            }
            return str;
        }
    }

    public final void a(Navigator navigator) {
        String a10 = a.a(navigator.getClass());
        if (a10.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f7331a;
        Navigator navigator2 = (Navigator) linkedHashMap.get(a10);
        if (kotlin.jvm.internal.f.b(navigator2, navigator)) {
            return;
        }
        boolean z10 = false;
        if (navigator2 != null && navigator2.f7252b) {
            z10 = true;
        }
        if (!(!z10)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f7252b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final <T extends Navigator<?>> T b(String str) {
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        T t3 = (T) this.f7331a.get(str);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException(n.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}

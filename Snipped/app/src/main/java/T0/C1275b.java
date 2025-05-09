package t0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: BundleCompat.java */
/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275b {

    /* compiled from: BundleCompat.java */
    /* renamed from: t0.b$a */
    public static class a {
        public static Object a(Bundle bundle, Class cls, String str) {
            return bundle.getParcelable(str, cls);
        }
    }

    public static Object a(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}

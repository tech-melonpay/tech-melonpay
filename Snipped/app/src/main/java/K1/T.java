package k1;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class T extends S {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f22787g = true;

    /* compiled from: ViewUtilsApi22.java */
    public static class a {
        public static void a(View view, int i, int i9, int i10, int i11) {
            view.setLeftTopRightBottom(i, i9, i10, i11);
        }
    }

    @SuppressLint({"NewApi"})
    public void g(View view, int i, int i9, int i10, int i11) {
        if (f22787g) {
            try {
                a.a(view, i, i9, i10, i11);
            } catch (NoSuchMethodError unused) {
                f22787g = false;
            }
        }
    }
}

package k1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class U extends T {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22788h = true;

    /* compiled from: ViewUtilsApi23.java */
    public static class a {
        public static void a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // k1.Q
    @SuppressLint({"NewApi"})
    public void c(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i);
        } else if (f22788h) {
            try {
                a.a(view, i);
            } catch (NoSuchMethodError unused) {
                f22788h = false;
            }
        }
    }
}

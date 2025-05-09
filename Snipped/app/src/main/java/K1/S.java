package k1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class S extends Q {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f22784d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f22785e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22786f = true;

    /* compiled from: ViewUtilsApi21.java */
    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @SuppressLint({"NewApi"})
    public void d(View view, Matrix matrix) {
        if (f22784d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22784d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (f22785e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22785e = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(View view, Matrix matrix) {
        if (f22786f) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22786f = false;
            }
        }
    }
}

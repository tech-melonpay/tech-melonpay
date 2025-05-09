package k1;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f22781a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f22782b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22783c;

    /* compiled from: ViewUtilsApi19.java */
    public static class a {
        public static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    @SuppressLint({"NewApi"})
    public float a(View view) {
        if (f22781a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f22781a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(View view, float f10) {
        if (f22781a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f22781a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void c(View view, int i) {
        if (!f22783c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f22782b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f22783c = true;
        }
        Field field = f22782b;
        if (field != null) {
            try {
                f22782b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}

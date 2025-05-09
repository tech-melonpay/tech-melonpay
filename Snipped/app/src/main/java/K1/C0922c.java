package k1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.java */
/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922c {

    /* renamed from: a, reason: collision with root package name */
    public static Method f22813a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f22814b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22815c;

    /* compiled from: CanvasUtils.java */
    /* renamed from: k1.c$a */
    public static class a {
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z10) {
                a.b(canvas);
                return;
            } else {
                a.a(canvas);
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f22815c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f22813a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f22814b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f22815c = true;
        }
        if (z10) {
            try {
                Method method2 = f22813a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        if (z10 || (method = f22814b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}

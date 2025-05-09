package n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m0.e;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f24076a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f24077b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f24078c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f24079d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f24080e = false;

    public static boolean g(Object obj, String str, int i, boolean z10) {
        h();
        try {
            return ((Boolean) f24078c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f24080e) {
            return;
        }
        f24080e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f24077b = constructor;
        f24076a = cls;
        f24078c = method2;
        f24079d = method;
    }

    @Override // n0.j
    public Typeface a(Context context, e.b bVar, Resources resources, int i) {
        h();
        try {
            Object newInstance = f24077b.newInstance(null);
            for (e.c cVar : bVar.f23846a) {
                File d10 = k.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!k.b(d10, resources, cVar.f23852f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), cVar.f23848b, cVar.f23849c)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f24076a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f24079d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}

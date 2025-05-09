package n0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m0.e;
import u0.C1507k;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f24081f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f24082g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f24083h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f24084j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f24085k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f24086l;

    public g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = o(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f24081f = cls;
        this.f24082g = constructor;
        this.f24083h = method2;
        this.i = method3;
        this.f24084j = method4;
        this.f24085k = method5;
        this.f24086l = method;
    }

    public static Method o(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // n0.f, n0.j
    public final Typeface a(Context context, e.b bVar, Resources resources, int i) {
        if (!m()) {
            return super.a(context, bVar, resources, i);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        for (e.c cVar : bVar.f23846a) {
            if (!j(context, n10, cVar.f23847a, cVar.f23851e, cVar.f23848b, cVar.f23849c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f23850d))) {
                i(n10);
                return null;
            }
        }
        if (l(n10)) {
            return k(n10);
        }
        return null;
    }

    @Override // n0.j
    public final Typeface b(Context context, C1507k[] c1507kArr, int i) {
        Typeface k3;
        if (c1507kArr.length < 1) {
            return null;
        }
        if (!m()) {
            C1507k f10 = f(c1507kArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f30116a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f30118c).setItalic(f10.f30119d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        int i9 = 0;
        for (C1507k c1507k : c1507kArr) {
            if (c1507k.f30120e == 0) {
                Uri uri = c1507k.f30116a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, k.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        int length = c1507kArr.length;
        boolean z10 = false;
        while (i9 < length) {
            C1507k c1507k2 = c1507kArr[i9];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c1507k2.f30116a);
            if (byteBuffer != null) {
                if (!((Boolean) this.i.invoke(n10, byteBuffer, Integer.valueOf(c1507k2.f30117b), null, Integer.valueOf(c1507k2.f30118c), Integer.valueOf(c1507k2.f30119d ? 1 : 0))).booleanValue()) {
                    i(n10);
                    return null;
                }
                z10 = true;
            }
            i9++;
            z10 = z10;
        }
        if (!z10) {
            i(n10);
            return null;
        }
        if (l(n10) && (k3 = k(n10)) != null) {
            return Typeface.create(k3, i);
        }
        return null;
    }

    @Override // n0.j
    public final Typeface d(Context context, Resources resources, int i, String str, int i9) {
        if (!m()) {
            return super.d(context, resources, i, str, i9);
        }
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        if (!j(context, n10, str, 0, -1, -1, null)) {
            i(n10);
            return null;
        }
        if (l(n10)) {
            return k(n10);
        }
        return null;
    }

    public final void i(Object obj) {
        try {
            this.f24085k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean j(Context context, Object obj, String str, int i, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f24083h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f24081f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f24086l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.f24084j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m() {
        Method method = this.f24083h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object n() {
        try {
            return this.f24082g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method p(Class<?> cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

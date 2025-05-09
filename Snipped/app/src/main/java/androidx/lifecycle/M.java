package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f6992a = P9.m.q(Application.class, G.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f6993b = Collections.singletonList(G.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            List u6 = P9.l.u(constructor.getParameterTypes());
            if (kotlin.jvm.internal.f.b(list, u6)) {
                return constructor;
            }
            if (list.size() == u6.size() && u6.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends Q> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(androidx.camera.core.impl.utils.a.l("A ", cls, " cannot be instantiated."), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}

package kotlin.jvm.internal;

import ia.InterfaceC0835c;
import ia.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i f23186a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0835c[] f23187b;

    static {
        i iVar = null;
        try {
            iVar = (i) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (iVar == null) {
            iVar = new i();
        }
        f23186a = iVar;
        f23187b = new InterfaceC0835c[0];
    }

    public static b a(Class cls) {
        f23186a.getClass();
        return new b(cls);
    }

    public static k b(Class cls) {
        b a10 = a(cls);
        List emptyList = Collections.emptyList();
        f23186a.getClass();
        return new k(a10, emptyList, null, 1);
    }

    public static k c(l lVar, l lVar2) {
        b a10 = a(Map.class);
        List asList = Arrays.asList(lVar, lVar2);
        f23186a.getClass();
        return new k(a10, asList, null, 0);
    }

    public static k d(Class cls) {
        b a10 = a(cls);
        List emptyList = Collections.emptyList();
        f23186a.getClass();
        return new k(a10, emptyList, null, 0);
    }
}

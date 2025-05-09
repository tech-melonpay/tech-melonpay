package m3;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23918c;

    public k(Object obj, Method method) {
        this.f23917b = method;
        this.f23918c = obj;
    }

    @Override // m3.o
    public final <T> T a(Class<T> cls) {
        String a10 = C1026a.a(cls);
        if (a10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
        }
        return (T) this.f23917b.invoke(this.f23918c, cls);
    }
}

package m3;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23921b;

    public m(Method method) {
        this.f23921b = method;
    }

    @Override // m3.o
    public final <T> T a(Class<T> cls) {
        String a10 = C1026a.a(cls);
        if (a10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
        }
        return (T) this.f23921b.invoke(null, cls, Object.class);
    }
}

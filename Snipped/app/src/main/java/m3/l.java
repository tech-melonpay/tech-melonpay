package m3;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23920c;

    public l(int i, Method method) {
        this.f23919b = method;
        this.f23920c = i;
    }

    @Override // m3.o
    public final <T> T a(Class<T> cls) {
        String a10 = C1026a.a(cls);
        if (a10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
        }
        return (T) this.f23919b.invoke(null, cls, Integer.valueOf(this.f23920c));
    }
}

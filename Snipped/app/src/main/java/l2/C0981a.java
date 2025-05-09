package l2;

/* compiled from: DoubleCheck.java */
/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981a<T> implements N9.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23540c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile N9.a<T> f23541a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f23542b;

    public static N9.a a(InterfaceC0982b interfaceC0982b) {
        if (interfaceC0982b instanceof C0981a) {
            return interfaceC0982b;
        }
        C0981a c0981a = new C0981a();
        c0981a.f23542b = f23540c;
        c0981a.f23541a = interfaceC0982b;
        return c0981a;
    }

    @Override // N9.a
    public final T get() {
        T t3 = (T) this.f23542b;
        Object obj = f23540c;
        if (t3 == obj) {
            synchronized (this) {
                try {
                    t3 = (T) this.f23542b;
                    if (t3 == obj) {
                        t3 = this.f23541a.get();
                        Object obj2 = this.f23542b;
                        if (obj2 != obj && obj2 != t3) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                        }
                        this.f23542b = t3;
                        this.f23541a = null;
                    }
                } finally {
                }
            }
        }
        return t3;
    }
}

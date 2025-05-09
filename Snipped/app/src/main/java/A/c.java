package A;

import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* compiled from: ExtensionVersion.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f8a;

    /* compiled from: ExtensionVersion.java */
    public static class a extends c {
        @Override // A.c
        public final d a() {
            return null;
        }
    }

    /* compiled from: ExtensionVersion.java */
    public static class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public static ExtensionVersionImpl f9c;

        /* renamed from: b, reason: collision with root package name */
        public final A.a f10b;

        public b() {
            if (f9c == null) {
                f9c = new ExtensionVersionImpl();
            }
            A.a g10 = d.g(f9c.checkApiVersion(A.b.a().d()));
            if (g10 != null && A.b.a().b().d() == g10.d()) {
                this.f10b = g10;
            }
            Logger.d("ExtenderVersion", "Selected vendor runtime: " + this.f10b);
        }

        @Override // A.c
        public final d a() {
            return this.f10b;
        }
    }

    public static boolean b(A.a aVar) {
        c cVar;
        if (f8a != null) {
            cVar = f8a;
        } else {
            synchronized (c.class) {
                if (f8a == null) {
                    try {
                        f8a = new b();
                    } catch (NoClassDefFoundError unused) {
                        Logger.d("ExtenderVersion", "No versioning extender found. Falling back to default.");
                        f8a = new a();
                    }
                }
            }
            cVar = f8a;
        }
        d a10 = cVar.a();
        int i = aVar.f2c;
        return (a10.d() == i ? Integer.compare(a10.e(), aVar.f3d) : Integer.compare(a10.d(), i)) >= 0;
    }

    public abstract d a();
}

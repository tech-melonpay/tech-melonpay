package J9;

import io.sentry.C0852j;

/* compiled from: HintUtils.java */
/* loaded from: classes2.dex */
public final class b {
    public static C0852j a(Object obj) {
        C0852j c0852j = new C0852j();
        c0852j.a(obj, "sentry:typeCheckHint");
        return c0852j;
    }

    public static Object b(C0852j c0852j) {
        return c0852j.f22047a.get("sentry:typeCheckHint");
    }

    public static boolean c(C0852j c0852j, Class<?> cls) {
        return cls.isInstance(b(c0852j));
    }

    public static boolean d(C0852j c0852j) {
        return !E9.b.class.isInstance(b(c0852j)) || E9.a.class.isInstance(c0852j.f22047a.get("sentry:typeCheckHint"));
    }
}

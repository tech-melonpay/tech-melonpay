package A;

/* compiled from: ClientVersion.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final a f7a = d.g("1.3.0");

    public static b a() {
        return f6b;
    }

    public static boolean c(a aVar) {
        a aVar2 = f6b.f7a;
        int i = aVar.f2c;
        return (aVar2.d() == i ? Integer.compare(aVar2.e(), aVar.f3d) : Integer.compare(aVar2.d(), i)) >= 0;
    }

    public final a b() {
        return this.f7a;
    }

    public final String d() {
        return this.f7a.toString();
    }
}

package qb;

/* compiled from: Response.java */
/* loaded from: classes3.dex */
public final class q<T> {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.p f26065a;

    /* renamed from: b, reason: collision with root package name */
    public final T f26066b;

    /* renamed from: c, reason: collision with root package name */
    public final va.i f26067c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(okhttp3.p pVar, Object obj, va.j jVar) {
        this.f26065a = pVar;
        this.f26066b = obj;
        this.f26067c = jVar;
    }

    public static <T> q<T> a(T t3, okhttp3.p pVar) {
        if (pVar.j()) {
            return new q<>(pVar, t3, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f26065a.toString();
    }
}

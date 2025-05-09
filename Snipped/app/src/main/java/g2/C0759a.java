package g2;

import com.google.android.datatransport.Priority;

/* compiled from: AutoValue_Event.java */
/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759a<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f20761a = null;

    /* renamed from: b, reason: collision with root package name */
    public final T f20762b;

    /* renamed from: c, reason: collision with root package name */
    public final Priority f20763c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0759a(Object obj, Priority priority) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f20762b = obj;
        this.f20763c = priority;
    }

    @Override // g2.c
    public final Integer a() {
        return this.f20761a;
    }

    @Override // g2.c
    public final T b() {
        return this.f20762b;
    }

    @Override // g2.c
    public final Priority c() {
        return this.f20763c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f20761a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f20762b.equals(cVar.b()) && this.f20763c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f20761a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f20762b.hashCode()) * 1000003) ^ this.f20763c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f20761a + ", payload=" + this.f20762b + ", priority=" + this.f20763c + "}";
    }
}

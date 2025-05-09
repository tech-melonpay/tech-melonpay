package s5;

/* compiled from: CreateNewAccountRequestDomain.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f26631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26632b;

    public g(String str, String str2) {
        this.f26631a = str;
        this.f26632b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f26631a, gVar.f26631a) && kotlin.jvm.internal.f.b(this.f26632b, gVar.f26632b);
    }

    public final int hashCode() {
        return this.f26632b.hashCode() + (this.f26631a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateNewAccountRequestDomain(currency=");
        sb2.append(this.f26631a);
        sb2.append(", prettyName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26632b, ")");
    }
}

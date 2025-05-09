package s5;

/* compiled from: BalanceDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f26613a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26614b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26615c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26616d;

    public d(String str, String str2, String str3, String str4) {
        this.f26613a = str;
        this.f26614b = str2;
        this.f26615c = str3;
        this.f26616d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f26613a, dVar.f26613a) && kotlin.jvm.internal.f.b(this.f26614b, dVar.f26614b) && kotlin.jvm.internal.f.b(this.f26615c, dVar.f26615c) && kotlin.jvm.internal.f.b(this.f26616d, dVar.f26616d);
    }

    public final int hashCode() {
        String str = this.f26613a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26614b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26615c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26616d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BalanceDomain(currency=");
        sb2.append(this.f26613a);
        sb2.append(", current=");
        sb2.append(this.f26614b);
        sb2.append(", reserved=");
        sb2.append(this.f26615c);
        sb2.append(", available=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26616d, ")");
    }
}

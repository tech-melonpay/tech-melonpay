package I5;

/* compiled from: VersionDomain.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f1878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1879b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1880c;

    public s(String str, String str2, String str3) {
        this.f1878a = str;
        this.f1879b = str2;
        this.f1880c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.f.b(this.f1878a, sVar.f1878a) && kotlin.jvm.internal.f.b(this.f1879b, sVar.f1879b) && kotlin.jvm.internal.f.b(this.f1880c, sVar.f1880c);
    }

    public final int hashCode() {
        String str = this.f1878a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1879b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1880c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VersionDomain(min=");
        sb2.append(this.f1878a);
        sb2.append(", current=");
        sb2.append(this.f1879b);
        sb2.append(", url=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1880c, ")");
    }
}

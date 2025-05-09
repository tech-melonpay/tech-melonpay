package h4;

/* compiled from: CvvPanDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21081b;

    public e(String str, String str2) {
        this.f21080a = str;
        this.f21081b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f21080a, eVar.f21080a) && kotlin.jvm.internal.f.b(this.f21081b, eVar.f21081b);
    }

    public final int hashCode() {
        String str = this.f21080a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21081b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvvPanDomain(pan=");
        sb2.append(this.f21080a);
        sb2.append(", cvv=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f21081b, ")");
    }
}

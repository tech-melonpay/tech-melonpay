package I5;

/* compiled from: PhoneDomain.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1753b;

    public h(String str, String str2) {
        this.f1752a = str;
        this.f1753b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f1752a, hVar.f1752a) && kotlin.jvm.internal.f.b(this.f1753b, hVar.f1753b);
    }

    public final int hashCode() {
        return this.f1753b.hashCode() + (this.f1752a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneDomain(phoneCode=");
        sb2.append(this.f1752a);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1753b, ")");
    }
}

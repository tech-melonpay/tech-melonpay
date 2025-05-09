package I5;

/* compiled from: ChangePasswordRequestDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1734b;

    public b(String str, String str2) {
        this.f1733a = str;
        this.f1734b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f1733a, bVar.f1733a) && kotlin.jvm.internal.f.b(this.f1734b, bVar.f1734b);
    }

    public final int hashCode() {
        return this.f1734b.hashCode() + (this.f1733a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangePasswordRequestDomain(oldPassword=");
        sb2.append(this.f1733a);
        sb2.append(", newPassword=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1734b, ")");
    }
}

package E5;

import kotlin.jvm.internal.f;

/* compiled from: SignerDomain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1052c;

    public a(String str, String str2, String str3) {
        this.f1050a = str;
        this.f1051b = str2;
        this.f1052c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f1050a, aVar.f1050a) && f.b(this.f1051b, aVar.f1051b) && f.b(this.f1052c, aVar.f1052c);
    }

    public final int hashCode() {
        String str = this.f1050a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1051b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1052c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignerDomain(id=");
        sb2.append(this.f1050a);
        sb2.append(", status=");
        sb2.append(this.f1051b);
        sb2.append(", devicelink=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1052c, ")");
    }
}

package s5;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f26610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26612c;

    public c(String str, String str2, String str3) {
        this.f26610a = str;
        this.f26611b = str2;
        this.f26612c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f26610a, cVar.f26610a) && kotlin.jvm.internal.f.b(this.f26611b, cVar.f26611b) && kotlin.jvm.internal.f.b(this.f26612c, cVar.f26612c);
    }

    public final int hashCode() {
        String str = this.f26610a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26611b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26612c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalPropDomain(additionalProp1=");
        sb2.append(this.f26610a);
        sb2.append(", additionalProp2=");
        sb2.append(this.f26611b);
        sb2.append(", additionalProp3=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26612c, ")");
    }
}

package s5;

/* compiled from: CreateNewAccountDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f26624a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f26625b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26626c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26627d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26628e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f26629f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26630g;

    public f(Integer num, Integer num2, String str, String str2, String str3, Integer num3, String str4) {
        this.f26624a = num;
        this.f26625b = num2;
        this.f26626c = str;
        this.f26627d = str2;
        this.f26628e = str3;
        this.f26629f = num3;
        this.f26630g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f26624a, fVar.f26624a) && kotlin.jvm.internal.f.b(this.f26625b, fVar.f26625b) && kotlin.jvm.internal.f.b(this.f26626c, fVar.f26626c) && kotlin.jvm.internal.f.b(this.f26627d, fVar.f26627d) && kotlin.jvm.internal.f.b(this.f26628e, fVar.f26628e) && kotlin.jvm.internal.f.b(this.f26629f, fVar.f26629f) && kotlin.jvm.internal.f.b(this.f26630g, fVar.f26630g);
    }

    public final int hashCode() {
        Integer num = this.f26624a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f26625b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f26626c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26627d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26628e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f26629f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f26630g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateNewAccountDomain(id=");
        sb2.append(this.f26624a);
        sb2.append(", clientId=");
        sb2.append(this.f26625b);
        sb2.append(", number=");
        sb2.append(this.f26626c);
        sb2.append(", currency=");
        sb2.append(this.f26627d);
        sb2.append(", prettyName=");
        sb2.append(this.f26628e);
        sb2.append(", status=");
        sb2.append(this.f26629f);
        sb2.append(", createdAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26630g, ")");
    }
}

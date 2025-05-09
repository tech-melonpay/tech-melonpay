package s5;

/* compiled from: BankIdInfoDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f26617a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f26618b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26619c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26620d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26621e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f26622f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26623g;

    public e(Integer num, Integer num2, String str, String str2, String str3, Integer num3, String str4) {
        this.f26617a = num;
        this.f26618b = num2;
        this.f26619c = str;
        this.f26620d = str2;
        this.f26621e = str3;
        this.f26622f = num3;
        this.f26623g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f26617a, eVar.f26617a) && kotlin.jvm.internal.f.b(this.f26618b, eVar.f26618b) && kotlin.jvm.internal.f.b(this.f26619c, eVar.f26619c) && kotlin.jvm.internal.f.b(this.f26620d, eVar.f26620d) && kotlin.jvm.internal.f.b(this.f26621e, eVar.f26621e) && kotlin.jvm.internal.f.b(this.f26622f, eVar.f26622f) && kotlin.jvm.internal.f.b(this.f26623g, eVar.f26623g);
    }

    public final int hashCode() {
        Integer num = this.f26617a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f26618b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f26619c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26620d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26621e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f26622f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f26623g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankIdInfoDomain(id=");
        sb2.append(this.f26617a);
        sb2.append(", clientId=");
        sb2.append(this.f26618b);
        sb2.append(", number=");
        sb2.append(this.f26619c);
        sb2.append(", currency=");
        sb2.append(this.f26620d);
        sb2.append(", prettyName=");
        sb2.append(this.f26621e);
        sb2.append(", status=");
        sb2.append(this.f26622f);
        sb2.append(", createdAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26623g, ")");
    }
}

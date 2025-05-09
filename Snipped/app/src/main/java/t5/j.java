package t5;

/* compiled from: VirtualCardDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f27554a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f27555b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f27556c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27557d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27558e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27559f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f27560g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27561h;
    public final Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f27562j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27563k;

    /* renamed from: l, reason: collision with root package name */
    public final String f27564l;

    public j(Integer num, Integer num2, Integer num3, String str, String str2, String str3, Integer num4, String str4, Boolean bool, String str5, String str6, String str7) {
        this.f27554a = num;
        this.f27555b = num2;
        this.f27556c = num3;
        this.f27557d = str;
        this.f27558e = str2;
        this.f27559f = str3;
        this.f27560g = num4;
        this.f27561h = str4;
        this.i = bool;
        this.f27562j = str5;
        this.f27563k = str6;
        this.f27564l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f27554a, jVar.f27554a) && kotlin.jvm.internal.f.b(this.f27555b, jVar.f27555b) && kotlin.jvm.internal.f.b(this.f27556c, jVar.f27556c) && kotlin.jvm.internal.f.b(this.f27557d, jVar.f27557d) && kotlin.jvm.internal.f.b(this.f27558e, jVar.f27558e) && kotlin.jvm.internal.f.b(this.f27559f, jVar.f27559f) && kotlin.jvm.internal.f.b(this.f27560g, jVar.f27560g) && kotlin.jvm.internal.f.b(this.f27561h, jVar.f27561h) && kotlin.jvm.internal.f.b(this.i, jVar.i) && kotlin.jvm.internal.f.b(this.f27562j, jVar.f27562j) && kotlin.jvm.internal.f.b(this.f27563k, jVar.f27563k) && kotlin.jvm.internal.f.b(this.f27564l, jVar.f27564l);
    }

    public final int hashCode() {
        Integer num = this.f27554a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f27555b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f27556c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f27557d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27558e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27559f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.f27560g;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.f27561h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f27562j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f27563k;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f27564l;
        return hashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VirtualCardDomain(id=");
        sb2.append(this.f27554a);
        sb2.append(", clientId=");
        sb2.append(this.f27555b);
        sb2.append(", vaultId=");
        sb2.append(this.f27556c);
        sb2.append(", prettyName=");
        sb2.append(this.f27557d);
        sb2.append(", cardNumber=");
        sb2.append(this.f27558e);
        sb2.append(", expirationDate=");
        sb2.append(this.f27559f);
        sb2.append(", balance=");
        sb2.append(this.f27560g);
        sb2.append(", currency=");
        sb2.append(this.f27561h);
        sb2.append(", isVirtual=");
        sb2.append(this.i);
        sb2.append(", status=");
        sb2.append(this.f27562j);
        sb2.append(", createdAt=");
        sb2.append(this.f27563k);
        sb2.append(", cvv=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27564l, ")");
    }
}

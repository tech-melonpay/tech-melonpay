package h4;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("id")
    private final Integer f21068a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f21069b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("vault_id")
    private final Integer f21070c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f21071d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f21072e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("is_virtual")
    private final Boolean f21073f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("card_number")
    private final String f21074g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("expiration_date")
    private final String f21075h;

    @l3.b("status")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("created_at")
    private final String f21076j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("cvv")
    private final String f21077k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("pin")
    private final String f21078l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("security_info")
    private s4.c f21079m;

    public final String a() {
        return this.f21074g;
    }

    public final Integer b() {
        return this.f21069b;
    }

    public final String c() {
        return this.f21076j;
    }

    public final String d() {
        return this.f21072e;
    }

    public final String e() {
        return this.f21077k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f21068a, dVar.f21068a) && kotlin.jvm.internal.f.b(this.f21069b, dVar.f21069b) && kotlin.jvm.internal.f.b(this.f21070c, dVar.f21070c) && kotlin.jvm.internal.f.b(this.f21071d, dVar.f21071d) && kotlin.jvm.internal.f.b(this.f21072e, dVar.f21072e) && kotlin.jvm.internal.f.b(this.f21073f, dVar.f21073f) && kotlin.jvm.internal.f.b(this.f21074g, dVar.f21074g) && kotlin.jvm.internal.f.b(this.f21075h, dVar.f21075h) && kotlin.jvm.internal.f.b(this.i, dVar.i) && kotlin.jvm.internal.f.b(this.f21076j, dVar.f21076j) && kotlin.jvm.internal.f.b(this.f21077k, dVar.f21077k) && kotlin.jvm.internal.f.b(this.f21078l, dVar.f21078l) && kotlin.jvm.internal.f.b(this.f21079m, dVar.f21079m);
    }

    public final String f() {
        return this.f21075h;
    }

    public final Integer g() {
        return this.f21068a;
    }

    public final String h() {
        return this.f21078l;
    }

    public final int hashCode() {
        Integer num = this.f21068a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21069b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21070c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f21071d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21072e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f21073f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f21074g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21075h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21076j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21077k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f21078l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        s4.c cVar = this.f21079m;
        return hashCode12 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String i() {
        return this.f21071d;
    }

    public final s4.c j() {
        return this.f21079m;
    }

    public final String k() {
        return this.i;
    }

    public final Integer l() {
        return this.f21070c;
    }

    public final Boolean m() {
        return this.f21073f;
    }

    public final String toString() {
        Integer num = this.f21068a;
        Integer num2 = this.f21069b;
        Integer num3 = this.f21070c;
        String str = this.f21071d;
        String str2 = this.f21072e;
        Boolean bool = this.f21073f;
        String str3 = this.f21074g;
        String str4 = this.f21075h;
        String str5 = this.i;
        String str6 = this.f21076j;
        String str7 = this.f21077k;
        String str8 = this.f21078l;
        s4.c cVar = this.f21079m;
        StringBuilder sb2 = new StringBuilder("CardsRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", vaultId=");
        sb2.append(num3);
        sb2.append(", prettyName=");
        sb2.append(str);
        sb2.append(", currency=");
        sb2.append(str2);
        sb2.append(", isVirtual=");
        sb2.append(bool);
        sb2.append(", cardNumber=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", expirationDate=", str4, ", status=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", createdAt=", str6, ", cvv=");
        androidx.camera.core.impl.utils.a.u(sb2, str7, ", pin=", str8, ", securityInfo=");
        sb2.append(cVar);
        sb2.append(")");
        return sb2.toString();
    }
}

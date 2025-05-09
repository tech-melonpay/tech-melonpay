package g4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import kotlin.jvm.internal.f;

/* compiled from: VirtualCardRaw.kt */
/* loaded from: classes.dex */
public final class d extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f20796b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f20797c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("vault_id")
    private final Integer f20798d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f20799e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("card_number")
    private final String f20800f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("expiration_date")
    private final String f20801g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("balance")
    private final Integer f20802h;

    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("is_virtual")
    private final Boolean f20803j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("status")
    private final String f20804k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("created_at")
    private final String f20805l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("cvv")
    private final String f20806m;

    public final Integer b() {
        return this.f20802h;
    }

    public final String c() {
        return this.f20800f;
    }

    public final Integer d() {
        return this.f20797c;
    }

    public final String e() {
        return this.f20805l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f20796b, dVar.f20796b) && f.b(this.f20797c, dVar.f20797c) && f.b(this.f20798d, dVar.f20798d) && f.b(this.f20799e, dVar.f20799e) && f.b(this.f20800f, dVar.f20800f) && f.b(this.f20801g, dVar.f20801g) && f.b(this.f20802h, dVar.f20802h) && f.b(this.i, dVar.i) && f.b(this.f20803j, dVar.f20803j) && f.b(this.f20804k, dVar.f20804k) && f.b(this.f20805l, dVar.f20805l) && f.b(this.f20806m, dVar.f20806m);
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.f20806m;
    }

    public final String h() {
        return this.f20801g;
    }

    public final int hashCode() {
        Integer num = this.f20796b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20797c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20798d;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f20799e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20800f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20801g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.f20802h;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.i;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f20803j;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f20804k;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20805l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20806m;
        return hashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final Integer i() {
        return this.f20796b;
    }

    public final String j() {
        return this.f20799e;
    }

    public final String k() {
        return this.f20804k;
    }

    public final Integer l() {
        return this.f20798d;
    }

    public final Boolean m() {
        return this.f20803j;
    }

    public final String toString() {
        Integer num = this.f20796b;
        Integer num2 = this.f20797c;
        Integer num3 = this.f20798d;
        String str = this.f20799e;
        String str2 = this.f20800f;
        String str3 = this.f20801g;
        Integer num4 = this.f20802h;
        String str4 = this.i;
        Boolean bool = this.f20803j;
        String str5 = this.f20804k;
        String str6 = this.f20805l;
        String str7 = this.f20806m;
        StringBuilder sb2 = new StringBuilder("VirtualCardRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", vaultId=");
        sb2.append(num3);
        sb2.append(", prettyName=");
        sb2.append(str);
        sb2.append(", cardNumber=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", expirationDate=", str3, ", balance=");
        sb2.append(num4);
        sb2.append(", currency=");
        sb2.append(str4);
        sb2.append(", isVirtual=");
        sb2.append(bool);
        sb2.append(", status=");
        sb2.append(str5);
        sb2.append(", createdAt=");
        return s3.b.o(sb2, str6, ", cvv=", str7, ")");
    }
}

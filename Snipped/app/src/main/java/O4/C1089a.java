package o4;

import e4.C0715a;
import kotlin.jvm.internal.f;
import l3.b;

/* compiled from: LoanRaw.kt */
/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @b("id")
    private final Integer f24366b;

    /* renamed from: c, reason: collision with root package name */
    @b("client_id")
    private final Integer f24367c;

    /* renamed from: d, reason: collision with root package name */
    @b("customer_id")
    private final String f24368d;

    /* renamed from: e, reason: collision with root package name */
    @b("application_id")
    private final String f24369e;

    /* renamed from: f, reason: collision with root package name */
    @b("offer_id")
    private final String f24370f;

    /* renamed from: g, reason: collision with root package name */
    @b("amount")
    private final Integer f24371g;

    /* renamed from: h, reason: collision with root package name */
    @b("duration")
    private final String f24372h;

    @b("status")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @b("login_link")
    private final String f24373j;

    /* renamed from: k, reason: collision with root package name */
    @b("created_at")
    private final String f24374k;

    /* renamed from: l, reason: collision with root package name */
    @b("updated_at")
    private final String f24375l;

    /* renamed from: m, reason: collision with root package name */
    @b("is_closed")
    private final Boolean f24376m;

    public final Integer b() {
        return this.f24371g;
    }

    public final String c() {
        return this.f24369e;
    }

    public final Integer d() {
        return this.f24367c;
    }

    public final String e() {
        return this.f24374k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1089a)) {
            return false;
        }
        C1089a c1089a = (C1089a) obj;
        return f.b(this.f24366b, c1089a.f24366b) && f.b(this.f24367c, c1089a.f24367c) && f.b(this.f24368d, c1089a.f24368d) && f.b(this.f24369e, c1089a.f24369e) && f.b(this.f24370f, c1089a.f24370f) && f.b(this.f24371g, c1089a.f24371g) && f.b(this.f24372h, c1089a.f24372h) && f.b(this.i, c1089a.i) && f.b(this.f24373j, c1089a.f24373j) && f.b(this.f24374k, c1089a.f24374k) && f.b(this.f24375l, c1089a.f24375l) && f.b(this.f24376m, c1089a.f24376m);
    }

    public final String f() {
        return this.f24368d;
    }

    public final String g() {
        return this.f24372h;
    }

    public final Integer h() {
        return this.f24366b;
    }

    public final int hashCode() {
        Integer num = this.f24366b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f24367c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f24368d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24369e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24370f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f24371g;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f24372h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24373j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24374k;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f24375l;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.f24376m;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.f24373j;
    }

    public final String j() {
        return this.f24370f;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.f24375l;
    }

    public final Boolean m() {
        return this.f24376m;
    }

    public final String toString() {
        Integer num = this.f24366b;
        Integer num2 = this.f24367c;
        String str = this.f24368d;
        String str2 = this.f24369e;
        String str3 = this.f24370f;
        Integer num3 = this.f24371g;
        String str4 = this.f24372h;
        String str5 = this.i;
        String str6 = this.f24373j;
        String str7 = this.f24374k;
        String str8 = this.f24375l;
        Boolean bool = this.f24376m;
        StringBuilder sb2 = new StringBuilder("LoanRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", customerId=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", applicationId=", str2, ", offerId=");
        sb2.append(str3);
        sb2.append(", amount=");
        sb2.append(num3);
        sb2.append(", duration=");
        androidx.camera.core.impl.utils.a.u(sb2, str4, ", status=", str5, ", loginLink=");
        androidx.camera.core.impl.utils.a.u(sb2, str6, ", createdAt=", str7, ", updatedAt=");
        sb2.append(str8);
        sb2.append(", isClosed=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }
}

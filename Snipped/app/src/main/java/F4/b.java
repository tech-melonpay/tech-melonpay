package f4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;

/* compiled from: BankIdInfoRaw.kt */
/* loaded from: classes.dex */
public final class b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f20665b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f20666c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("number")
    private final String f20667d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f20668e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("bank_id")
    private final String f20669f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("status")
    private final Integer f20670g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("created_at")
    private final String f20671h;

    public final Integer b() {
        return this.f20666c;
    }

    public final String c() {
        return this.f20671h;
    }

    public final String d() {
        return this.f20668e;
    }

    public final Integer e() {
        return this.f20665b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f20665b, bVar.f20665b) && kotlin.jvm.internal.f.b(this.f20666c, bVar.f20666c) && kotlin.jvm.internal.f.b(this.f20667d, bVar.f20667d) && kotlin.jvm.internal.f.b(this.f20668e, bVar.f20668e) && kotlin.jvm.internal.f.b(this.f20669f, bVar.f20669f) && kotlin.jvm.internal.f.b(this.f20670g, bVar.f20670g) && kotlin.jvm.internal.f.b(this.f20671h, bVar.f20671h);
    }

    public final String f() {
        return this.f20667d;
    }

    public final String g() {
        return this.f20669f;
    }

    public final Integer h() {
        return this.f20670g;
    }

    public final int hashCode() {
        Integer num = this.f20665b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20666c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f20667d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20668e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20669f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f20670g;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f20671h;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f20665b;
        Integer num2 = this.f20666c;
        String str = this.f20667d;
        String str2 = this.f20668e;
        String str3 = this.f20669f;
        Integer num3 = this.f20670g;
        String str4 = this.f20671h;
        StringBuilder sb2 = new StringBuilder("BankIdInfoRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", number=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", currency=", str2, ", prettyName=");
        sb2.append(str3);
        sb2.append(", status=");
        sb2.append(num3);
        sb2.append(", createdAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, str4, ")");
    }
}

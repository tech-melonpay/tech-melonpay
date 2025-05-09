package f4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;

/* compiled from: CreateNewAccountRaw.kt */
/* loaded from: classes.dex */
public final class c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f20672b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f20673c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("number")
    private final String f20674d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f20675e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f20676f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("status")
    private final Integer f20677g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("created_at")
    private final String f20678h;

    public final Integer b() {
        return this.f20673c;
    }

    public final String c() {
        return this.f20678h;
    }

    public final String d() {
        return this.f20675e;
    }

    public final Integer e() {
        return this.f20672b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f20672b, cVar.f20672b) && kotlin.jvm.internal.f.b(this.f20673c, cVar.f20673c) && kotlin.jvm.internal.f.b(this.f20674d, cVar.f20674d) && kotlin.jvm.internal.f.b(this.f20675e, cVar.f20675e) && kotlin.jvm.internal.f.b(this.f20676f, cVar.f20676f) && kotlin.jvm.internal.f.b(this.f20677g, cVar.f20677g) && kotlin.jvm.internal.f.b(this.f20678h, cVar.f20678h);
    }

    public final String f() {
        return this.f20674d;
    }

    public final String g() {
        return this.f20676f;
    }

    public final Integer h() {
        return this.f20677g;
    }

    public final int hashCode() {
        Integer num = this.f20672b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20673c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f20674d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20675e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20676f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f20677g;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f20678h;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f20672b;
        Integer num2 = this.f20673c;
        String str = this.f20674d;
        String str2 = this.f20675e;
        String str3 = this.f20676f;
        Integer num3 = this.f20677g;
        String str4 = this.f20678h;
        StringBuilder sb2 = new StringBuilder("CreateNewAccountRaw(id=");
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

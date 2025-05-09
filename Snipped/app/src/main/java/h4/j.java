package h4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e4.C0715a;
import f4.C0744a;
import java.util.List;

/* compiled from: ProgramRaw.kt */
/* loaded from: classes.dex */
public final class j extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("program_id")
    private final int f21124b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f21125c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("type")
    private final String f21126d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("description")
    private final String f21127e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("type_description")
    private final String f21128f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("bank_accounts")
    private final List<C0744a> f21129g;

    public final List<C0744a> b() {
        return this.f21129g;
    }

    public final String c() {
        return this.f21127e;
    }

    public final int d() {
        return this.f21124b;
    }

    public final String e() {
        return this.f21125c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f21124b == jVar.f21124b && kotlin.jvm.internal.f.b(this.f21125c, jVar.f21125c) && kotlin.jvm.internal.f.b(this.f21126d, jVar.f21126d) && kotlin.jvm.internal.f.b(this.f21127e, jVar.f21127e) && kotlin.jvm.internal.f.b(this.f21128f, jVar.f21128f) && kotlin.jvm.internal.f.b(this.f21129g, jVar.f21129g);
    }

    public final String f() {
        return this.f21126d;
    }

    public final String g() {
        return this.f21128f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f21124b) * 31;
        String str = this.f21125c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21126d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21127e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21128f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<C0744a> list = this.f21129g;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f21124b;
        String str = this.f21125c;
        String str2 = this.f21126d;
        String str3 = this.f21127e;
        String str4 = this.f21128f;
        List<C0744a> list = this.f21129g;
        StringBuilder sb2 = new StringBuilder("ProgramRaw(id=");
        sb2.append(i);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", type=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", description=", str3, ", typeDescription=");
        sb2.append(str4);
        sb2.append(", bankAccounts=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }
}

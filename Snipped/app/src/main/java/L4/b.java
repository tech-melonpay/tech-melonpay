package l4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: CurrencyRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("id")
    private Integer f23545a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String f23546b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("type")
    private String f23547c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("networks")
    private ArrayList<String> f23548d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pretty_name")
    private String f23549e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("case")
    private String f23550f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("decimal_places")
    private Integer f23551g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("risk_level")
    private String f23552h;

    @l3.b("enabled")
    private Boolean i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("subtype")
    private String f23553j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("created_at")
    private String f23554k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("updated_at")
    private String f23555l;

    public b() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f23545a = null;
        this.f23546b = null;
        this.f23547c = null;
        this.f23548d = arrayList;
        this.f23549e = null;
        this.f23550f = null;
        this.f23551g = null;
        this.f23552h = null;
        this.i = null;
        this.f23553j = null;
        this.f23554k = null;
        this.f23555l = null;
    }

    public final String a() {
        return this.f23550f;
    }

    public final String b() {
        return this.f23554k;
    }

    public final Integer c() {
        return this.f23551g;
    }

    public final Boolean d() {
        return this.i;
    }

    public final Integer e() {
        return this.f23545a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f23545a, bVar.f23545a) && f.b(this.f23546b, bVar.f23546b) && f.b(this.f23547c, bVar.f23547c) && f.b(this.f23548d, bVar.f23548d) && f.b(this.f23549e, bVar.f23549e) && f.b(this.f23550f, bVar.f23550f) && f.b(this.f23551g, bVar.f23551g) && f.b(this.f23552h, bVar.f23552h) && f.b(this.i, bVar.i) && f.b(this.f23553j, bVar.f23553j) && f.b(this.f23554k, bVar.f23554k) && f.b(this.f23555l, bVar.f23555l);
    }

    public final String f() {
        return this.f23546b;
    }

    public final ArrayList<String> g() {
        return this.f23548d;
    }

    public final String h() {
        return this.f23549e;
    }

    public final int hashCode() {
        Integer num = this.f23545a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f23546b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23547c;
        int hashCode3 = (this.f23548d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f23549e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23550f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f23551g;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f23552h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f23553j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23554k;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f23555l;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String i() {
        return this.f23552h;
    }

    public final String j() {
        return this.f23553j;
    }

    public final String k() {
        return this.f23547c;
    }

    public final String l() {
        return this.f23555l;
    }

    public final String toString() {
        Integer num = this.f23545a;
        String str = this.f23546b;
        String str2 = this.f23547c;
        ArrayList<String> arrayList = this.f23548d;
        String str3 = this.f23549e;
        String str4 = this.f23550f;
        Integer num2 = this.f23551g;
        String str5 = this.f23552h;
        Boolean bool = this.i;
        String str6 = this.f23553j;
        String str7 = this.f23554k;
        String str8 = this.f23555l;
        StringBuilder sb2 = new StringBuilder("CurrencyRaw(id=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(str2);
        sb2.append(", networks=");
        sb2.append(arrayList);
        sb2.append(", prettyName=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", case=", str4, ", decimalPlaces=");
        sb2.append(num2);
        sb2.append(", riskLevel=");
        sb2.append(str5);
        sb2.append(", enabled=");
        sb2.append(bool);
        sb2.append(", subtype=");
        sb2.append(str6);
        sb2.append(", createdAt=");
        return s3.b.o(sb2, str7, ", updatedAt=", str8, ")");
    }
}

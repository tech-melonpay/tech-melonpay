package q4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: PlanRaw.kt */
/* loaded from: classes.dex */
public final class a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f25867b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("is_default")
    private final Boolean f25868c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("pretty_name")
    private final b f25869d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("description")
    private final b f25870e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CONTENT)
    private final List<b> f25871f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("partner_id")
    private final String f25872g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("created_at")
    private final String f25873h;

    @l3.b("updated_at")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("your_active")
    private final Boolean f25874j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("can_be_activated_at")
    private final String f25875k;

    public final String b() {
        return this.f25875k;
    }

    public final List<b> c() {
        return this.f25871f;
    }

    public final String d() {
        return this.f25873h;
    }

    public final b e() {
        return this.f25870e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f25867b, aVar.f25867b) && f.b(this.f25868c, aVar.f25868c) && f.b(this.f25869d, aVar.f25869d) && f.b(this.f25870e, aVar.f25870e) && f.b(this.f25871f, aVar.f25871f) && f.b(this.f25872g, aVar.f25872g) && f.b(this.f25873h, aVar.f25873h) && f.b(this.i, aVar.i) && f.b(this.f25874j, aVar.f25874j) && f.b(this.f25875k, aVar.f25875k);
    }

    public final Integer f() {
        return this.f25867b;
    }

    public final String g() {
        return this.f25872g;
    }

    public final b h() {
        return this.f25869d;
    }

    public final int hashCode() {
        Integer num = this.f25867b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f25868c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.f25869d;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f25870e;
        int hashCode4 = (hashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List<b> list = this.f25871f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f25872g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25873h;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f25874j;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f25875k;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final Boolean j() {
        return this.f25874j;
    }

    public final Boolean k() {
        return this.f25868c;
    }

    public final String toString() {
        Integer num = this.f25867b;
        Boolean bool = this.f25868c;
        b bVar = this.f25869d;
        b bVar2 = this.f25870e;
        List<b> list = this.f25871f;
        String str = this.f25872g;
        String str2 = this.f25873h;
        String str3 = this.i;
        Boolean bool2 = this.f25874j;
        String str4 = this.f25875k;
        StringBuilder sb2 = new StringBuilder("PlanRaw(id=");
        sb2.append(num);
        sb2.append(", isDefault=");
        sb2.append(bool);
        sb2.append(", prettyName=");
        sb2.append(bVar);
        sb2.append(", description=");
        sb2.append(bVar2);
        sb2.append(", content=");
        sb2.append(list);
        sb2.append(", partnerId=");
        sb2.append(str);
        sb2.append(", createdAt=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", updatedAt=", str3, ", yourActive=");
        sb2.append(bool2);
        sb2.append(", canBeActivatedAt=");
        sb2.append(str4);
        sb2.append(")");
        return sb2.toString();
    }
}

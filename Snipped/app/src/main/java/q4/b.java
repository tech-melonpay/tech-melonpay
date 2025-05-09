package q4;

import e4.C0715a;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: PlanTextFormatRaw.kt */
/* loaded from: classes.dex */
public final class b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(MessageBundle.TITLE_ENTRY)
    private final String f25876b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("description")
    private final String f25877c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("background_color")
    private final String f25878d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("title_color")
    private final String f25879e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("title_color_alpha")
    private final String f25880f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("description_color")
    private final String f25881g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("description_color_alpha")
    private final String f25882h;

    public final String b() {
        return this.f25878d;
    }

    public final String c() {
        return this.f25877c;
    }

    public final String d() {
        return this.f25881g;
    }

    public final String e() {
        return this.f25882h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f25876b, bVar.f25876b) && f.b(this.f25877c, bVar.f25877c) && f.b(this.f25878d, bVar.f25878d) && f.b(this.f25879e, bVar.f25879e) && f.b(this.f25880f, bVar.f25880f) && f.b(this.f25881g, bVar.f25881g) && f.b(this.f25882h, bVar.f25882h);
    }

    public final String f() {
        return this.f25876b;
    }

    public final String g() {
        return this.f25879e;
    }

    public final String h() {
        return this.f25880f;
    }

    public final int hashCode() {
        String str = this.f25876b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25877c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25878d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25879e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25880f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25881g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25882h;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f25876b;
        String str2 = this.f25877c;
        String str3 = this.f25878d;
        String str4 = this.f25879e;
        String str5 = this.f25880f;
        String str6 = this.f25881g;
        String str7 = this.f25882h;
        StringBuilder p10 = s3.b.p("PlanTextFormatRaw(title=", str, ", description=", str2, ", backgroundColor=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", titleColor=", str4, ", titleColorAlpha=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", descriptionColor=", str6, ", descriptionColorAlpha=");
        return androidx.camera.core.impl.utils.a.n(p10, str7, ")");
    }
}

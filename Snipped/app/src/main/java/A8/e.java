package A8;

import C.v;
import ca.InterfaceC0635a;
import kotlin.jvm.internal.f;

/* compiled from: ToolbarButton.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f137c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f139e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f140f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f141g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0635a<Object> f142h;

    public e() {
        throw null;
    }

    public e(Integer num, String str, Boolean bool, boolean z10, Integer num2, Integer num3, Integer num4, InterfaceC0635a interfaceC0635a, int i) {
        bool = (i & 4) != 0 ? Boolean.FALSE : bool;
        z10 = (i & 8) != 0 ? true : z10;
        num2 = (i & 16) != 0 ? null : num2;
        num3 = (i & 32) != 0 ? null : num3;
        num4 = (i & 64) != 0 ? null : num4;
        this.f135a = num;
        this.f136b = str;
        this.f137c = bool;
        this.f138d = z10;
        this.f139e = num2;
        this.f140f = num3;
        this.f141g = num4;
        this.f142h = interfaceC0635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.f135a, eVar.f135a) && f.b(this.f136b, eVar.f136b) && f.b(this.f137c, eVar.f137c) && this.f138d == eVar.f138d && f.b(this.f139e, eVar.f139e) && f.b(this.f140f, eVar.f140f) && f.b(this.f141g, eVar.f141g) && f.b(this.f142h, eVar.f142h);
    }

    public final int hashCode() {
        Integer num = this.f135a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f136b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f137c;
        int d10 = v.d((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f138d);
        Integer num2 = this.f139e;
        int hashCode3 = (d10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f140f;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f141g;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        InterfaceC0635a<Object> interfaceC0635a = this.f142h;
        return hashCode5 + (interfaceC0635a != null ? interfaceC0635a.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarButton(icon=" + this.f135a + ", name=" + this.f136b + ", isActive=" + this.f137c + ", isEnabled=" + this.f138d + ", background=" + this.f139e + ", textColor=" + this.f140f + ", imageStartMargin=" + this.f141g + ", callback=" + this.f142h + ")";
    }
}

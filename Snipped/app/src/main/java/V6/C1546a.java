package v6;

import C.v;
import kotlin.jvm.internal.f;

/* compiled from: SettingsUI.kt */
/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1546a {

    /* renamed from: a, reason: collision with root package name */
    public final String f30653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30654b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30655c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30656d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f30657e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30658f;

    public /* synthetic */ C1546a(String str, String str2) {
        this(str, str2, false, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1546a)) {
            return false;
        }
        C1546a c1546a = (C1546a) obj;
        return f.b(this.f30653a, c1546a.f30653a) && f.b(this.f30654b, c1546a.f30654b) && this.f30655c == c1546a.f30655c && this.f30656d == c1546a.f30656d && f.b(this.f30657e, c1546a.f30657e) && this.f30658f == c1546a.f30658f;
    }

    public final int hashCode() {
        int hashCode = this.f30653a.hashCode() * 31;
        String str = this.f30654b;
        int d10 = v.d(v.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f30655c), 31, this.f30656d);
        Boolean bool = this.f30657e;
        return Boolean.hashCode(this.f30658f) + ((d10 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Boolean bool = this.f30657e;
        StringBuilder sb2 = new StringBuilder("SettingsUI(title=");
        sb2.append(this.f30653a);
        sb2.append(", description=");
        sb2.append(this.f30654b);
        sb2.append(", hasArrowDown=");
        sb2.append(this.f30655c);
        sb2.append(", hasSwitcher=");
        sb2.append(this.f30656d);
        sb2.append(", isActive=");
        sb2.append(bool);
        sb2.append(", isEnabled=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f30658f, ")");
    }

    public C1546a(String str, String str2, boolean z10, Boolean bool, boolean z11) {
        this.f30653a = str;
        this.f30654b = str2;
        this.f30655c = false;
        this.f30656d = z10;
        this.f30657e = bool;
        this.f30658f = z11;
    }
}

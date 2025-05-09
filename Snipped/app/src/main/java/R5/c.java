package r5;

import kotlin.jvm.internal.f;

/* compiled from: ErrorBodyResponse.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("asset_id")
    private final Integer f26290a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("info")
    private final String f26291b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("status")
    private final String f26292c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("sent_via")
    private final String f26293d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("sent_to")
    private final String f26294e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("code_control_digits")
    private final String f26295f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("code")
    private final String f26296g;

    public final String a() {
        return this.f26294e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f26290a, cVar.f26290a) && f.b(this.f26291b, cVar.f26291b) && f.b(this.f26292c, cVar.f26292c) && f.b(this.f26293d, cVar.f26293d) && f.b(this.f26294e, cVar.f26294e) && f.b(this.f26295f, cVar.f26295f) && f.b(this.f26296g, cVar.f26296g);
    }

    public final int hashCode() {
        Integer num = this.f26290a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f26291b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26292c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26293d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26294e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26295f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26296g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f26290a;
        String str = this.f26291b;
        String str2 = this.f26292c;
        String str3 = this.f26293d;
        String str4 = this.f26294e;
        String str5 = this.f26295f;
        String str6 = this.f26296g;
        StringBuilder sb2 = new StringBuilder("TfaBodyResponse(assetId=");
        sb2.append(num);
        sb2.append(", info=");
        sb2.append(str);
        sb2.append(", status=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", sentVia=", str3, ", sentTo=");
        androidx.camera.core.impl.utils.a.u(sb2, str4, ", codeControlDigits=", str5, ", code=");
        return androidx.camera.core.impl.utils.a.n(sb2, str6, ")");
    }
}

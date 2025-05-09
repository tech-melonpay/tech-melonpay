package r4;

import C.v;

/* compiled from: ProxyTokenRequestRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("app_id")
    private final String f26186a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("application_version")
    private final String f26187b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("application_info")
    private final String f26188c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("application_type")
    private final String f26189d = "BANK_BUSINESS_MOBILE";

    public c(String str, String str2, String str3) {
        this.f26186a = str;
        this.f26187b = str2;
        this.f26188c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f26186a, cVar.f26186a) && kotlin.jvm.internal.f.b(this.f26187b, cVar.f26187b) && kotlin.jvm.internal.f.b(this.f26188c, cVar.f26188c) && kotlin.jvm.internal.f.b(this.f26189d, cVar.f26189d);
    }

    public final int hashCode() {
        return this.f26189d.hashCode() + v.c(v.c(this.f26186a.hashCode() * 31, 31, this.f26187b), 31, this.f26188c);
    }

    public final String toString() {
        String str = this.f26186a;
        String str2 = this.f26187b;
        return s3.b.o(s3.b.p("ProxyTokenRequestRaw(appId=", str, ", version=", str2, ", info="), this.f26188c, ", type=", this.f26189d, ")");
    }
}

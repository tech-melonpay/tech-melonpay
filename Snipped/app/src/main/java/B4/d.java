package b4;

import C.v;

/* compiled from: CardVirtualRequest.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("phone")
    private final String f8327a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("email")
    private final String f8328b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f8329c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("password")
    private final String f8330d;

    public d(String str, String str2, String str3, String str4) {
        this.f8327a = str;
        this.f8328b = str2;
        this.f8329c = str3;
        this.f8330d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f8327a, dVar.f8327a) && kotlin.jvm.internal.f.b(this.f8328b, dVar.f8328b) && kotlin.jvm.internal.f.b(this.f8329c, dVar.f8329c) && kotlin.jvm.internal.f.b(this.f8330d, dVar.f8330d);
    }

    public final int hashCode() {
        return this.f8330d.hashCode() + v.c(v.c(this.f8327a.hashCode() * 31, 31, this.f8328b), 31, this.f8329c);
    }

    public final String toString() {
        String str = this.f8327a;
        String str2 = this.f8328b;
        return s3.b.o(s3.b.p("CardVirtualRequest(phone=", str, ", email=", str2, ", cardPrettyName="), this.f8329c, ", password=", this.f8330d, ")");
    }
}

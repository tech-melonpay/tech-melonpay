package b4;

import C.v;

/* compiled from: Update3dSecureRequestRaw.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("phone")
    private final String f8333a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("email")
    private final String f8334b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("password")
    private final String f8335c;

    public g(String str, String str2, String str3) {
        this.f8333a = str;
        this.f8334b = str2;
        this.f8335c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f8333a, gVar.f8333a) && kotlin.jvm.internal.f.b(this.f8334b, gVar.f8334b) && kotlin.jvm.internal.f.b(this.f8335c, gVar.f8335c);
    }

    public final int hashCode() {
        return this.f8335c.hashCode() + v.c(this.f8333a.hashCode() * 31, 31, this.f8334b);
    }

    public final String toString() {
        String str = this.f8333a;
        String str2 = this.f8334b;
        return androidx.camera.core.impl.utils.a.n(s3.b.p("Update3dSecureRequestRaw(phone=", str, ", email=", str2, ", password="), this.f8335c, ")");
    }
}

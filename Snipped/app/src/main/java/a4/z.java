package a4;

/* compiled from: UploadProxyRequestRaw.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("tx_id")
    private final String f4445a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("body")
    private final String f4446b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("filename")
    private final String f4447c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("description")
    private final String f4448d = "";

    public z(String str, String str2, String str3) {
        this.f4445a = str;
        this.f4446b = str2;
        this.f4447c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.f.b(this.f4445a, zVar.f4445a) && kotlin.jvm.internal.f.b(this.f4446b, zVar.f4446b) && kotlin.jvm.internal.f.b(this.f4447c, zVar.f4447c) && kotlin.jvm.internal.f.b(this.f4448d, zVar.f4448d);
    }

    public final int hashCode() {
        return this.f4448d.hashCode() + C.v.c(C.v.c(this.f4445a.hashCode() * 31, 31, this.f4446b), 31, this.f4447c);
    }

    public final String toString() {
        String str = this.f4445a;
        String str2 = this.f4446b;
        return s3.b.o(s3.b.p("UploadProxyRequestRaw(txPartnerId=", str, ", body=", str2, ", filename="), this.f4447c, ", description=", this.f4448d, ")");
    }
}

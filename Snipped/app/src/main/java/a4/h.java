package a4;

/* compiled from: CompanySubmitRaw.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("kyc_status_to")
    private final String f4305a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.f.b(this.f4305a, ((h) obj).f4305a);
    }

    public final int hashCode() {
        return this.f4305a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.n.a("CompanySubmitRaw(kycStatusTo=", this.f4305a, ")");
    }

    public h(int i) {
        this.f4305a = "REQUESTED";
    }
}

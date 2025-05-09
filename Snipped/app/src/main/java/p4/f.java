package p4;

/* compiled from: PaymentRaw.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("displayPin")
    private final String f25684a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("reference")
    private final Long f25685b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("expiresIn")
    private final Integer f25686c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("qrCode")
    private final String f25687d;

    public final String a() {
        return this.f25684a;
    }

    public final Integer b() {
        return this.f25686c;
    }

    public final Long c() {
        return this.f25685b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f25684a, fVar.f25684a) && kotlin.jvm.internal.f.b(this.f25685b, fVar.f25685b) && kotlin.jvm.internal.f.b(this.f25686c, fVar.f25686c) && kotlin.jvm.internal.f.b(this.f25687d, fVar.f25687d);
    }

    public final int hashCode() {
        String str = this.f25684a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f25685b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.f25686c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f25687d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "QrcodeRaw(displayPin=" + this.f25684a + ", reference=" + this.f25685b + ", expiresIn=" + this.f25686c + ", qrCode=" + this.f25687d + ")";
    }
}

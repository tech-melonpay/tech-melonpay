package u5;

import C.v;

/* compiled from: AdditionalInformationRequestDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f30231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30232b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30233c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30235e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f30236f;

    public c(long j10, String str, long j11, String str2, boolean z10, Boolean bool) {
        this.f30231a = j10;
        this.f30232b = str;
        this.f30233c = j11;
        this.f30234d = str2;
        this.f30235e = z10;
        this.f30236f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30231a == cVar.f30231a && kotlin.jvm.internal.f.b(this.f30232b, cVar.f30232b) && this.f30233c == cVar.f30233c && kotlin.jvm.internal.f.b(this.f30234d, cVar.f30234d) && this.f30235e == cVar.f30235e && kotlin.jvm.internal.f.b(this.f30236f, cVar.f30236f);
    }

    public final int hashCode() {
        int e10 = v.e(this.f30233c, v.c(Long.hashCode(this.f30231a) * 31, 31, this.f30232b), 31);
        String str = this.f30234d;
        int d10 = v.d((e10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f30235e);
        Boolean bool = this.f30236f;
        return d10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInformationRequestDomain(turnover=" + this.f30231a + ", countryOperation=" + this.f30232b + ", registrationDate=" + this.f30233c + ", vat_number=" + this.f30234d + ", vatRegistered=" + this.f30235e + ", vatRegisteredOver3Months=" + this.f30236f + ")";
    }
}

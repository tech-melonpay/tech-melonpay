package A5;

import java.util.Date;
import kotlin.jvm.internal.f;

/* compiled from: LoanDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f81a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f82b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f86f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f89j;

    /* renamed from: k, reason: collision with root package name */
    public final Date f90k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f91l;

    public b(Integer num, Integer num2, String str, String str2, String str3, Integer num3, String str4, String str5, String str6, Date date, Date date2, Boolean bool) {
        this.f81a = num;
        this.f82b = num2;
        this.f83c = str;
        this.f84d = str2;
        this.f85e = str3;
        this.f86f = num3;
        this.f87g = str4;
        this.f88h = str5;
        this.i = str6;
        this.f89j = date;
        this.f90k = date2;
        this.f91l = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f81a, bVar.f81a) && f.b(this.f82b, bVar.f82b) && f.b(this.f83c, bVar.f83c) && f.b(this.f84d, bVar.f84d) && f.b(this.f85e, bVar.f85e) && f.b(this.f86f, bVar.f86f) && f.b(this.f87g, bVar.f87g) && f.b(this.f88h, bVar.f88h) && f.b(this.i, bVar.i) && f.b(this.f89j, bVar.f89j) && f.b(this.f90k, bVar.f90k) && f.b(this.f91l, bVar.f91l);
    }

    public final int hashCode() {
        Integer num = this.f81a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f82b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f83c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f86f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f87g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f88h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.f89j;
        int hashCode10 = (hashCode9 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f90k;
        int hashCode11 = (hashCode10 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.f91l;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "LoanDomain(id=" + this.f81a + ", clientId=" + this.f82b + ", customerId=" + this.f83c + ", applicationId=" + this.f84d + ", offerId=" + this.f85e + ", amount=" + this.f86f + ", duration=" + this.f87g + ", status=" + this.f88h + ", loginLink=" + this.i + ", createdAt=" + this.f89j + ", updatedAt=" + this.f90k + ", isClosed=" + this.f91l + ")";
    }
}

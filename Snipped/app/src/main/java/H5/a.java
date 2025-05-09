package H5;

import C.v;
import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: TransactionsRequestDomain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1487c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f1488d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1489e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1490f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1491g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1492h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<String> f1493j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f1494k;

    public a() {
        throw null;
    }

    public a(String str, String str2, int i, Boolean bool, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, Integer num, int i9) {
        bool = (i9 & 8) != 0 ? null : bool;
        str3 = (i9 & 16) != 0 ? null : str3;
        str4 = (i9 & 32) != 0 ? null : str4;
        str5 = (i9 & 64) != 0 ? null : str5;
        str6 = (i9 & 128) != 0 ? null : str6;
        str7 = (i9 & 256) != 0 ? null : str7;
        arrayList = (i9 & 512) != 0 ? null : arrayList;
        num = (i9 & 1024) != 0 ? null : num;
        this.f1485a = str;
        this.f1486b = str2;
        this.f1487c = i;
        this.f1488d = bool;
        this.f1489e = str3;
        this.f1490f = str4;
        this.f1491g = str5;
        this.f1492h = str6;
        this.i = str7;
        this.f1493j = arrayList;
        this.f1494k = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f1485a, aVar.f1485a) && f.b(this.f1486b, aVar.f1486b) && this.f1487c == aVar.f1487c && f.b(this.f1488d, aVar.f1488d) && f.b(this.f1489e, aVar.f1489e) && f.b(this.f1490f, aVar.f1490f) && f.b(this.f1491g, aVar.f1491g) && f.b(this.f1492h, aVar.f1492h) && f.b(this.i, aVar.i) && f.b(this.f1493j, aVar.f1493j) && f.b(this.f1494k, aVar.f1494k);
    }

    public final int hashCode() {
        int hashCode = this.f1485a.hashCode() * 31;
        String str = this.f1486b;
        int b9 = v.b(this.f1487c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f1488d;
        int hashCode2 = (b9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f1489e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1490f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1491g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1492h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<String> arrayList = this.f1493j;
        int hashCode8 = (hashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.f1494k;
        return hashCode8 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TransactionsRequestDomain(clientId=" + this.f1485a + ", accountId=" + this.f1486b + ", page=" + this.f1487c + ", invoicedOnly=" + this.f1488d + ", createdFromDate=" + this.f1489e + ", createdToDate=" + this.f1490f + ", direction=" + this.f1491g + ", sortByCreatedTime=" + this.f1492h + ", sortByAmount=" + this.i + ", excludePaymentMethod=" + this.f1493j + ", perPage=" + this.f1494k + ")";
    }
}

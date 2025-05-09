package H5;

import com.luminary.business.domain.entity.transaction.PaymentType;
import java.util.Date;
import kotlin.jvm.internal.f;

/* compiled from: TransferTemplateDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public final String f1495A;

    /* renamed from: a, reason: collision with root package name */
    public final Long f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f1497b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1499d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1500e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1501f;

    /* renamed from: g, reason: collision with root package name */
    public final PaymentType f1502g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1503h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1504j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1505k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1506l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1507m;

    /* renamed from: n, reason: collision with root package name */
    public final Date f1508n;

    /* renamed from: o, reason: collision with root package name */
    public final Date f1509o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1510p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1511q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1512r;

    /* renamed from: s, reason: collision with root package name */
    public final String f1513s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1514t;

    /* renamed from: u, reason: collision with root package name */
    public final String f1515u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1516v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f1517w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1518x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1519y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1520z;

    public b(Long l10, Long l11, String str, String str2, String str3, String str4, PaymentType paymentType, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20, String str21) {
        this.f1496a = l10;
        this.f1497b = l11;
        this.f1498c = str;
        this.f1499d = str2;
        this.f1500e = str3;
        this.f1501f = str4;
        this.f1502g = paymentType;
        this.f1503h = str5;
        this.i = str6;
        this.f1504j = str7;
        this.f1505k = str8;
        this.f1506l = str9;
        this.f1507m = str10;
        this.f1508n = date;
        this.f1509o = date2;
        this.f1510p = str11;
        this.f1511q = str12;
        this.f1512r = str13;
        this.f1513s = str14;
        this.f1514t = str15;
        this.f1515u = str16;
        this.f1516v = str17;
        this.f1517w = bool;
        this.f1518x = str18;
        this.f1519y = str19;
        this.f1520z = str20;
        this.f1495A = str21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f1496a, bVar.f1496a) && f.b(this.f1497b, bVar.f1497b) && f.b(this.f1498c, bVar.f1498c) && f.b(this.f1499d, bVar.f1499d) && f.b(this.f1500e, bVar.f1500e) && f.b(this.f1501f, bVar.f1501f) && this.f1502g == bVar.f1502g && f.b(this.f1503h, bVar.f1503h) && f.b(this.i, bVar.i) && f.b(this.f1504j, bVar.f1504j) && f.b(this.f1505k, bVar.f1505k) && f.b(this.f1506l, bVar.f1506l) && f.b(this.f1507m, bVar.f1507m) && f.b(this.f1508n, bVar.f1508n) && f.b(this.f1509o, bVar.f1509o) && f.b(this.f1510p, bVar.f1510p) && f.b(this.f1511q, bVar.f1511q) && f.b(this.f1512r, bVar.f1512r) && f.b(this.f1513s, bVar.f1513s) && f.b(this.f1514t, bVar.f1514t) && f.b(this.f1515u, bVar.f1515u) && f.b(this.f1516v, bVar.f1516v) && f.b(this.f1517w, bVar.f1517w) && f.b(this.f1518x, bVar.f1518x) && f.b(this.f1519y, bVar.f1519y) && f.b(this.f1520z, bVar.f1520z) && f.b(this.f1495A, bVar.f1495A);
    }

    public final int hashCode() {
        Long l10 = this.f1496a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f1497b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f1498c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1499d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1500e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1501f;
        int hashCode6 = (this.f1502g.hashCode() + ((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.f1503h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f1504j;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1505k;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f1506l;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f1507m;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.f1508n;
        int hashCode13 = (hashCode12 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f1509o;
        int hashCode14 = (hashCode13 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str11 = this.f1510p;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f1511q;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f1512r;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f1513s;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f1514t;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f1515u;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f1516v;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool = this.f1517w;
        int hashCode22 = (hashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str18 = this.f1518x;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f1519y;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f1520z;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f1495A;
        return hashCode25 + (str21 != null ? str21.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransferTemplateDomain(id=");
        sb2.append(this.f1496a);
        sb2.append(", clientId=");
        sb2.append(this.f1497b);
        sb2.append(", uuid=");
        sb2.append(this.f1498c);
        sb2.append(", prettyName=");
        sb2.append(this.f1499d);
        sb2.append(", name=");
        sb2.append(this.f1500e);
        sb2.append(", legalType=");
        sb2.append(this.f1501f);
        sb2.append(", paymentMethod=");
        sb2.append(this.f1502g);
        sb2.append(", currency=");
        sb2.append(this.f1503h);
        sb2.append(", iban=");
        sb2.append(this.i);
        sb2.append(", bicSwift=");
        sb2.append(this.f1504j);
        sb2.append(", gbAccount=");
        sb2.append(this.f1505k);
        sb2.append(", gbSortCode=");
        sb2.append(this.f1506l);
        sb2.append(", status=");
        sb2.append(this.f1507m);
        sb2.append(", createdAt=");
        sb2.append(this.f1508n);
        sb2.append(", updatedAt=");
        sb2.append(this.f1509o);
        sb2.append(", bankCountry=");
        sb2.append(this.f1510p);
        sb2.append(", country=");
        sb2.append(this.f1511q);
        sb2.append(", beneficiaryAddressLine1=");
        sb2.append(this.f1512r);
        sb2.append(", beneficiaryAddressLine2=");
        sb2.append(this.f1513s);
        sb2.append(", beneficiaryPostalCode=");
        sb2.append(this.f1514t);
        sb2.append(", beneficiaryCity=");
        sb2.append(this.f1515u);
        sb2.append(", beneficiaryCountry=");
        sb2.append(this.f1516v);
        sb2.append(", beneficiaryIntermediaryBank=");
        sb2.append(this.f1517w);
        sb2.append(", bankName=");
        sb2.append(this.f1518x);
        sb2.append(", bankSwift=");
        sb2.append(this.f1519y);
        sb2.append(", toAccount=");
        sb2.append(this.f1520z);
        sb2.append(", email=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1495A, ")");
    }
}

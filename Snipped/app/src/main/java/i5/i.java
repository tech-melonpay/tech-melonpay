package I5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ProfileDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1754a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1756c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1757d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1758e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1759f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1760g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1761h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1762j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f1763k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1764l;

    /* renamed from: m, reason: collision with root package name */
    public final a f1765m;

    /* renamed from: n, reason: collision with root package name */
    public final List<b> f1766n;

    /* renamed from: o, reason: collision with root package name */
    public final List<c> f1767o;

    /* compiled from: ProfileDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1768a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1769b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1770c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1771d;

        /* renamed from: e, reason: collision with root package name */
        public final String f1772e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f1768a = str;
            this.f1769b = str2;
            this.f1770c = str3;
            this.f1771d = str4;
            this.f1772e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f1768a, aVar.f1768a) && kotlin.jvm.internal.f.b(this.f1769b, aVar.f1769b) && kotlin.jvm.internal.f.b(this.f1770c, aVar.f1770c) && kotlin.jvm.internal.f.b(this.f1771d, aVar.f1771d) && kotlin.jvm.internal.f.b(this.f1772e, aVar.f1772e);
        }

        public final int hashCode() {
            String str = this.f1768a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f1769b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f1770c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f1771d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f1772e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressDomain(countryCode=");
            sb2.append(this.f1768a);
            sb2.append(", addressLine1=");
            sb2.append(this.f1769b);
            sb2.append(", addressLine2=");
            sb2.append(this.f1770c);
            sb2.append(", city=");
            sb2.append(this.f1771d);
            sb2.append(", postalCode=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f1772e, ")");
        }
    }

    /* compiled from: ProfileDomain.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1773a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f1774b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f1775c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1776d;

        /* renamed from: e, reason: collision with root package name */
        public final String f1777e;

        public b(String str, Boolean bool, Integer num, String str2, String str3) {
            this.f1773a = str;
            this.f1774b = bool;
            this.f1775c = num;
            this.f1776d = str2;
            this.f1777e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f1773a, bVar.f1773a) && kotlin.jvm.internal.f.b(this.f1774b, bVar.f1774b) && kotlin.jvm.internal.f.b(this.f1775c, bVar.f1775c) && kotlin.jvm.internal.f.b(this.f1776d, bVar.f1776d) && kotlin.jvm.internal.f.b(this.f1777e, bVar.f1777e);
        }

        public final int hashCode() {
            String str = this.f1773a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f1774b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f1775c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f1776d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f1777e;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmailDomain(id=");
            sb2.append(this.f1773a);
            sb2.append(", primary=");
            sb2.append(this.f1774b);
            sb2.append(", status=");
            sb2.append(this.f1775c);
            sb2.append(", addedAt=");
            sb2.append(this.f1776d);
            sb2.append(", email=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f1777e, ")");
        }
    }

    /* compiled from: ProfileDomain.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f1778a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f1779b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f1780c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1781d;

        /* renamed from: e, reason: collision with root package name */
        public final a f1782e;

        /* compiled from: ProfileDomain.kt */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f1783a;

            /* renamed from: b, reason: collision with root package name */
            public final String f1784b;

            /* renamed from: c, reason: collision with root package name */
            public final String f1785c;

            public a(String str, String str2, String str3) {
                this.f1783a = str;
                this.f1784b = str2;
                this.f1785c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f1783a, aVar.f1783a) && kotlin.jvm.internal.f.b(this.f1784b, aVar.f1784b) && kotlin.jvm.internal.f.b(this.f1785c, aVar.f1785c);
            }

            public final int hashCode() {
                String str = this.f1783a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f1784b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f1785c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NumberDomain(internationalNumber=");
                sb2.append(this.f1783a);
                sb2.append(", number=");
                sb2.append(this.f1784b);
                sb2.append(", countryCode=");
                return androidx.camera.core.impl.utils.a.n(sb2, this.f1785c, ")");
            }
        }

        public c(String str, Boolean bool, Integer num, String str2, a aVar) {
            this.f1778a = str;
            this.f1779b = bool;
            this.f1780c = num;
            this.f1781d = str2;
            this.f1782e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f1778a, cVar.f1778a) && kotlin.jvm.internal.f.b(this.f1779b, cVar.f1779b) && kotlin.jvm.internal.f.b(this.f1780c, cVar.f1780c) && kotlin.jvm.internal.f.b(this.f1781d, cVar.f1781d) && kotlin.jvm.internal.f.b(this.f1782e, cVar.f1782e);
        }

        public final int hashCode() {
            String str = this.f1778a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f1779b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f1780c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f1781d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.f1782e;
            return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "PhoneDomain(id=" + this.f1778a + ", primary=" + this.f1779b + ", status=" + this.f1780c + ", addedAt=" + this.f1781d + ", phone=" + this.f1782e + ")";
        }
    }

    public i(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, String str6, Integer num3, String str7, Integer num4, String str8, a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f1754a = str;
        this.f1755b = num;
        this.f1756c = str2;
        this.f1757d = num2;
        this.f1758e = str3;
        this.f1759f = str4;
        this.f1760g = str5;
        this.f1761h = str6;
        this.i = num3;
        this.f1762j = str7;
        this.f1763k = num4;
        this.f1764l = str8;
        this.f1765m = aVar;
        this.f1766n = arrayList;
        this.f1767o = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f1754a, iVar.f1754a) && kotlin.jvm.internal.f.b(this.f1755b, iVar.f1755b) && kotlin.jvm.internal.f.b(this.f1756c, iVar.f1756c) && kotlin.jvm.internal.f.b(this.f1757d, iVar.f1757d) && kotlin.jvm.internal.f.b(this.f1758e, iVar.f1758e) && kotlin.jvm.internal.f.b(this.f1759f, iVar.f1759f) && kotlin.jvm.internal.f.b(this.f1760g, iVar.f1760g) && kotlin.jvm.internal.f.b(this.f1761h, iVar.f1761h) && kotlin.jvm.internal.f.b(this.i, iVar.i) && kotlin.jvm.internal.f.b(this.f1762j, iVar.f1762j) && kotlin.jvm.internal.f.b(this.f1763k, iVar.f1763k) && kotlin.jvm.internal.f.b(this.f1764l, iVar.f1764l) && kotlin.jvm.internal.f.b(this.f1765m, iVar.f1765m) && kotlin.jvm.internal.f.b(this.f1766n, iVar.f1766n) && kotlin.jvm.internal.f.b(this.f1767o, iVar.f1767o);
    }

    public final int hashCode() {
        String str = this.f1754a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f1755b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f1756c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f1757d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f1758e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1759f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1760g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f1761h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.i;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f1762j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.f1763k;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.f1764l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        a aVar = this.f1765m;
        int hashCode13 = (hashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<b> list = this.f1766n;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.f1767o;
        return hashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileDomain(id=" + this.f1754a + ", state=" + this.f1755b + ", photo=" + this.f1756c + ", verificationLevel=" + this.f1757d + ", name=" + this.f1758e + ", firstName=" + this.f1759f + ", lastName=" + this.f1760g + ", language=" + this.f1761h + ", gender=" + this.i + ", birthdate=" + this.f1762j + ", verificationStatus=" + this.f1763k + ", username=" + this.f1764l + ", legalAddress=" + this.f1765m + ", emails=" + this.f1766n + ", phones=" + this.f1767o + ")";
    }
}

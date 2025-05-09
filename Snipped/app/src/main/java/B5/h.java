package B5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PriceListDomain.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f332a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f333b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Object> f334c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Object> f335d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f336e;

    /* renamed from: f, reason: collision with root package name */
    public final String f337f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f338g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f339h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f340j;

    /* renamed from: k, reason: collision with root package name */
    public final String f341k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f342l;

    /* compiled from: PriceListDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f343a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f344b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f345c;

        /* renamed from: d, reason: collision with root package name */
        public final String f346d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f347e;

        /* renamed from: f, reason: collision with root package name */
        public final Float f348f;

        /* renamed from: g, reason: collision with root package name */
        public final Float f349g;

        /* renamed from: h, reason: collision with root package name */
        public final Float f350h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final String f351j;

        /* renamed from: k, reason: collision with root package name */
        public final List<Object> f352k;

        /* renamed from: l, reason: collision with root package name */
        public final String f353l;

        /* renamed from: m, reason: collision with root package name */
        public final String f354m;

        /* renamed from: n, reason: collision with root package name */
        public final Integer f355n;

        /* renamed from: o, reason: collision with root package name */
        public final Integer f356o;

        public a(String str, Integer num, Integer num2, String str2, Integer num3, Float f10, Float f11, Float f12, String str3, String str4, List<? extends Object> list, String str5, String str6, Integer num4, Integer num5) {
            this.f343a = str;
            this.f344b = num;
            this.f345c = num2;
            this.f346d = str2;
            this.f347e = num3;
            this.f348f = f10;
            this.f349g = f11;
            this.f350h = f12;
            this.i = str3;
            this.f351j = str4;
            this.f352k = list;
            this.f353l = str5;
            this.f354m = str6;
            this.f355n = num4;
            this.f356o = num5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f343a, aVar.f343a) && kotlin.jvm.internal.f.b(this.f344b, aVar.f344b) && kotlin.jvm.internal.f.b(this.f345c, aVar.f345c) && kotlin.jvm.internal.f.b(this.f346d, aVar.f346d) && kotlin.jvm.internal.f.b(this.f347e, aVar.f347e) && kotlin.jvm.internal.f.b(this.f348f, aVar.f348f) && kotlin.jvm.internal.f.b(this.f349g, aVar.f349g) && kotlin.jvm.internal.f.b(this.f350h, aVar.f350h) && kotlin.jvm.internal.f.b(this.i, aVar.i) && kotlin.jvm.internal.f.b(this.f351j, aVar.f351j) && kotlin.jvm.internal.f.b(this.f352k, aVar.f352k) && kotlin.jvm.internal.f.b(this.f353l, aVar.f353l) && kotlin.jvm.internal.f.b(this.f354m, aVar.f354m) && kotlin.jvm.internal.f.b(this.f355n, aVar.f355n) && kotlin.jvm.internal.f.b(this.f356o, aVar.f356o);
        }

        public final int hashCode() {
            String str = this.f343a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f344b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f345c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f346d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.f347e;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Float f10 = this.f348f;
            int hashCode6 = (hashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
            Float f11 = this.f349g;
            int hashCode7 = (hashCode6 + (f11 == null ? 0 : f11.hashCode())) * 31;
            Float f12 = this.f350h;
            int hashCode8 = (hashCode7 + (f12 == null ? 0 : f12.hashCode())) * 31;
            String str3 = this.i;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f351j;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<Object> list = this.f352k;
            int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.f353l;
            int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f354m;
            int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num4 = this.f355n;
            int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f356o;
            return hashCode14 + (num5 != null ? num5.hashCode() : 0);
        }

        public final String toString() {
            return "FeeDomain(id=" + this.f343a + ", status=" + this.f344b + ", type=" + this.f345c + ", name=" + this.f346d + ", percent=" + this.f347e + ", fixedAmount=" + this.f348f + ", amountMin=" + this.f349g + ", amountMax=" + this.f350h + ", currency=" + this.i + ", createdAt=" + this.f351j + ", outOfHours=" + this.f352k + ", accountProvider=" + this.f353l + ", transferProvider=" + this.f354m + ", paymentMethod=" + this.f355n + ", discriminator=" + this.f356o + ")";
        }
    }

    public h(String str, ArrayList arrayList, List list, List list2, Integer num, String str2, Boolean bool, Integer num2, String str3, String str4, String str5, Boolean bool2) {
        this.f332a = str;
        this.f333b = arrayList;
        this.f334c = list;
        this.f335d = list2;
        this.f336e = num;
        this.f337f = str2;
        this.f338g = bool;
        this.f339h = num2;
        this.i = str3;
        this.f340j = str4;
        this.f341k = str5;
        this.f342l = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f332a, hVar.f332a) && kotlin.jvm.internal.f.b(this.f333b, hVar.f333b) && kotlin.jvm.internal.f.b(this.f334c, hVar.f334c) && kotlin.jvm.internal.f.b(this.f335d, hVar.f335d) && kotlin.jvm.internal.f.b(this.f336e, hVar.f336e) && kotlin.jvm.internal.f.b(this.f337f, hVar.f337f) && kotlin.jvm.internal.f.b(this.f338g, hVar.f338g) && kotlin.jvm.internal.f.b(this.f339h, hVar.f339h) && kotlin.jvm.internal.f.b(this.i, hVar.i) && kotlin.jvm.internal.f.b(this.f340j, hVar.f340j) && kotlin.jvm.internal.f.b(this.f341k, hVar.f341k) && kotlin.jvm.internal.f.b(this.f342l, hVar.f342l);
    }

    public final int hashCode() {
        String str = this.f332a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<a> list = this.f333b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.f334c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Object> list3 = this.f335d;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.f336e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f337f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f338g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f339h;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f340j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f341k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f342l;
        return hashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "PriceListDomain(id=" + this.f332a + ", fees=" + this.f333b + ", cashbacks=" + this.f334c + ", vaultRates=" + this.f335d + ", status=" + this.f336e + ", name=" + this.f337f + ", standard=" + this.f338g + ", clientType=" + this.f339h + ", createdAt=" + this.i + ", updatedAt=" + this.f340j + ", publishedAt=" + this.f341k + ", externalFeeEnabled=" + this.f342l + ")";
    }
}

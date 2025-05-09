package p4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.List;

/* compiled from: PriceListRaw.kt */
/* loaded from: classes.dex */
public final class e extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final String f25659b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("fees")
    private final List<a> f25660c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("cashbacks")
    private final List<Object> f25661d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("vault_rates")
    private final List<Object> f25662e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("status")
    private final Integer f25663f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f25664g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("standard")
    private final Boolean f25665h;

    @l3.b("clientType")
    private final Integer i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("createdAt")
    private final String f25666j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("updatedAt")
    private final String f25667k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("publishedAt")
    private final String f25668l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("external_fee_enabled")
    private final Boolean f25669m;

    /* compiled from: PriceListRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("id")
        private final String f25670a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("status")
        private final Integer f25671b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("type")
        private final Integer f25672c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String f25673d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("percent")
        private final Integer f25674e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("fixedAmount")
        private final Float f25675f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("amountMin")
        private final Float f25676g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("amountMax")
        private final Float f25677h;

        @l3.b(FirebaseAnalytics.Param.CURRENCY)
        private final String i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("createdAt")
        private final String f25678j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("out_of_hours")
        private final List<Object> f25679k;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("accountProvider")
        private final String f25680l;

        /* renamed from: m, reason: collision with root package name */
        @l3.b("transferProvider")
        private final String f25681m;

        /* renamed from: n, reason: collision with root package name */
        @l3.b("paymentMethod")
        private final Integer f25682n;

        /* renamed from: o, reason: collision with root package name */
        @l3.b("discriminator")
        private final Integer f25683o;

        public final String a() {
            return this.f25680l;
        }

        public final Float b() {
            return this.f25677h;
        }

        public final Float c() {
            return this.f25676g;
        }

        public final String d() {
            return this.f25678j;
        }

        public final String e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f25670a, aVar.f25670a) && kotlin.jvm.internal.f.b(this.f25671b, aVar.f25671b) && kotlin.jvm.internal.f.b(this.f25672c, aVar.f25672c) && kotlin.jvm.internal.f.b(this.f25673d, aVar.f25673d) && kotlin.jvm.internal.f.b(this.f25674e, aVar.f25674e) && kotlin.jvm.internal.f.b(this.f25675f, aVar.f25675f) && kotlin.jvm.internal.f.b(this.f25676g, aVar.f25676g) && kotlin.jvm.internal.f.b(this.f25677h, aVar.f25677h) && kotlin.jvm.internal.f.b(this.i, aVar.i) && kotlin.jvm.internal.f.b(this.f25678j, aVar.f25678j) && kotlin.jvm.internal.f.b(this.f25679k, aVar.f25679k) && kotlin.jvm.internal.f.b(this.f25680l, aVar.f25680l) && kotlin.jvm.internal.f.b(this.f25681m, aVar.f25681m) && kotlin.jvm.internal.f.b(this.f25682n, aVar.f25682n) && kotlin.jvm.internal.f.b(this.f25683o, aVar.f25683o);
        }

        public final Integer f() {
            return this.f25683o;
        }

        public final Float g() {
            return this.f25675f;
        }

        public final String h() {
            return this.f25670a;
        }

        public final int hashCode() {
            String str = this.f25670a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f25671b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25672c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f25673d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.f25674e;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Float f10 = this.f25675f;
            int hashCode6 = (hashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
            Float f11 = this.f25676g;
            int hashCode7 = (hashCode6 + (f11 == null ? 0 : f11.hashCode())) * 31;
            Float f12 = this.f25677h;
            int hashCode8 = (hashCode7 + (f12 == null ? 0 : f12.hashCode())) * 31;
            String str3 = this.i;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25678j;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<Object> list = this.f25679k;
            int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.f25680l;
            int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25681m;
            int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num4 = this.f25682n;
            int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f25683o;
            return hashCode14 + (num5 != null ? num5.hashCode() : 0);
        }

        public final String i() {
            return this.f25673d;
        }

        public final List<Object> j() {
            return this.f25679k;
        }

        public final Integer k() {
            return this.f25682n;
        }

        public final Integer l() {
            return this.f25674e;
        }

        public final Integer m() {
            return this.f25671b;
        }

        public final String n() {
            return this.f25681m;
        }

        public final Integer o() {
            return this.f25672c;
        }

        public final String toString() {
            String str = this.f25670a;
            Integer num = this.f25671b;
            Integer num2 = this.f25672c;
            String str2 = this.f25673d;
            Integer num3 = this.f25674e;
            Float f10 = this.f25675f;
            Float f11 = this.f25676g;
            Float f12 = this.f25677h;
            String str3 = this.i;
            String str4 = this.f25678j;
            List<Object> list = this.f25679k;
            String str5 = this.f25680l;
            String str6 = this.f25681m;
            Integer num4 = this.f25682n;
            Integer num5 = this.f25683o;
            StringBuilder sb2 = new StringBuilder("FeeRaw(id=");
            sb2.append(str);
            sb2.append(", status=");
            sb2.append(num);
            sb2.append(", type=");
            sb2.append(num2);
            sb2.append(", name=");
            sb2.append(str2);
            sb2.append(", percent=");
            sb2.append(num3);
            sb2.append(", fixedAmount=");
            sb2.append(f10);
            sb2.append(", amountMin=");
            sb2.append(f11);
            sb2.append(", amountMax=");
            sb2.append(f12);
            sb2.append(", currency=");
            androidx.camera.core.impl.utils.a.u(sb2, str3, ", createdAt=", str4, ", outOfHours=");
            sb2.append(list);
            sb2.append(", accountProvider=");
            sb2.append(str5);
            sb2.append(", transferProvider=");
            sb2.append(str6);
            sb2.append(", paymentMethod=");
            sb2.append(num4);
            sb2.append(", discriminator=");
            sb2.append(num5);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public final List<Object> b() {
        return this.f25661d;
    }

    public final Integer c() {
        return this.i;
    }

    public final String d() {
        return this.f25666j;
    }

    public final Boolean e() {
        return this.f25669m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f25659b, eVar.f25659b) && kotlin.jvm.internal.f.b(this.f25660c, eVar.f25660c) && kotlin.jvm.internal.f.b(this.f25661d, eVar.f25661d) && kotlin.jvm.internal.f.b(this.f25662e, eVar.f25662e) && kotlin.jvm.internal.f.b(this.f25663f, eVar.f25663f) && kotlin.jvm.internal.f.b(this.f25664g, eVar.f25664g) && kotlin.jvm.internal.f.b(this.f25665h, eVar.f25665h) && kotlin.jvm.internal.f.b(this.i, eVar.i) && kotlin.jvm.internal.f.b(this.f25666j, eVar.f25666j) && kotlin.jvm.internal.f.b(this.f25667k, eVar.f25667k) && kotlin.jvm.internal.f.b(this.f25668l, eVar.f25668l) && kotlin.jvm.internal.f.b(this.f25669m, eVar.f25669m);
    }

    public final List<a> f() {
        return this.f25660c;
    }

    public final String g() {
        return this.f25659b;
    }

    public final String h() {
        return this.f25664g;
    }

    public final int hashCode() {
        String str = this.f25659b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<a> list = this.f25660c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.f25661d;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Object> list3 = this.f25662e;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.f25663f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f25664g;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f25665h;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f25666j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25667k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25668l;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f25669m;
        return hashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.f25668l;
    }

    public final Boolean j() {
        return this.f25665h;
    }

    public final Integer k() {
        return this.f25663f;
    }

    public final String l() {
        return this.f25667k;
    }

    public final List<Object> m() {
        return this.f25662e;
    }

    public final String toString() {
        String str = this.f25659b;
        List<a> list = this.f25660c;
        List<Object> list2 = this.f25661d;
        List<Object> list3 = this.f25662e;
        Integer num = this.f25663f;
        String str2 = this.f25664g;
        Boolean bool = this.f25665h;
        Integer num2 = this.i;
        String str3 = this.f25666j;
        String str4 = this.f25667k;
        String str5 = this.f25668l;
        Boolean bool2 = this.f25669m;
        StringBuilder sb2 = new StringBuilder("PriceListRaw(id=");
        sb2.append(str);
        sb2.append(", fees=");
        sb2.append(list);
        sb2.append(", cashbacks=");
        sb2.append(list2);
        sb2.append(", vaultRates=");
        sb2.append(list3);
        sb2.append(", status=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str2);
        sb2.append(", standard=");
        sb2.append(bool);
        sb2.append(", clientType=");
        sb2.append(num2);
        sb2.append(", createdAt=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", updatedAt=", str4, ", publishedAt=");
        sb2.append(str5);
        sb2.append(", externalFeeEnabled=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }
}

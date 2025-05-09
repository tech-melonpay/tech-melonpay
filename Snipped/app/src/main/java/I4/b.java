package i4;

import C.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e4.C0715a;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: CorporateDetailsRaw.kt */
/* loaded from: classes.dex */
public final class b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("company")
    private final C0409b f21337b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("team_members")
    private final List<d> f21338c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("my_positions")
    private final List<String> f21339d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("my_beneficiary_type")
    private final String f21340e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("my_role")
    private final String f21341f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("is_creator")
    private final Boolean f21342g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("my_shares_amount")
    private final Float f21343h;

    @l3.b("enrolled_at")
    private final String i;

    /* compiled from: CorporateDetailsRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String f21344a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("country")
        private final String f21345b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("info")
        private final String f21346c;

        public final String a() {
            return this.f21345b;
        }

        public final String b() {
            return this.f21346c;
        }

        public final String c() {
            return this.f21344a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f21344a, aVar.f21344a) && kotlin.jvm.internal.f.b(this.f21345b, aVar.f21345b) && kotlin.jvm.internal.f.b(this.f21346c, aVar.f21346c);
        }

        public final int hashCode() {
            String str = this.f21344a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f21345b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21346c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f21344a;
            String str2 = this.f21345b;
            return androidx.camera.core.impl.utils.a.n(s3.b.p("BankDomainRaw(name=", str, ", country=", str2, ", info="), this.f21346c, ")");
        }
    }

    /* compiled from: CorporateDetailsRaw.kt */
    /* renamed from: i4.b$b, reason: collision with other inner class name */
    public static final class C0409b {

        /* renamed from: A, reason: collision with root package name */
        @l3.b("company_number")
        private final String f21347A;

        /* renamed from: A0, reason: collision with root package name */
        @l3.b("work_experience_description")
        private final String f21348A0;

        /* renamed from: B, reason: collision with root package name */
        @l3.b("company_type")
        private final String f21349B;

        /* renamed from: B0, reason: collision with root package name */
        @l3.b("link_to_cv_linkedin")
        private final String f21350B0;

        /* renamed from: C, reason: collision with root package name */
        @l3.b("other_company_type")
        private final String f21351C;

        /* renamed from: C0, reason: collision with root package name */
        @l3.b("contractors_outgoing")
        private final List<c> f21352C0;

        /* renamed from: D, reason: collision with root package name */
        @l3.b("tax_id_number")
        private final String f21353D;

        /* renamed from: D0, reason: collision with root package name */
        @l3.b("contractors_incoming")
        private final List<c> f21354D0;

        /* renamed from: E, reason: collision with root package name */
        @l3.b("website")
        private final String f21355E;

        /* renamed from: E0, reason: collision with root package name */
        @l3.b("company_source_of_funds")
        private final String f21356E0;

        /* renamed from: F, reason: collision with root package name */
        @l3.b("turnover")
        private final Integer f21357F;

        /* renamed from: F0, reason: collision with root package name */
        @l3.b("company_other_source_of_funds")
        private final String f21358F0;

        /* renamed from: G, reason: collision with root package name */
        @l3.b("country_operation")
        private final String f21359G;

        /* renamed from: G0, reason: collision with root package name */
        @l3.b("company_source_of_wealth")
        private final String f21360G0;

        /* renamed from: H, reason: collision with root package name */
        @l3.b("business_sector_type")
        private final String f21361H;

        /* renamed from: H0, reason: collision with root package name */
        @l3.b("company_other_source_of_wealth")
        private final String f21362H0;

        /* renamed from: I, reason: collision with root package name */
        @l3.b("business_sector")
        private final String f21363I;

        /* renamed from: I0, reason: collision with root package name */
        @l3.b("company_amount_of_wealth")
        private final Double f21364I0;

        /* renamed from: J, reason: collision with root package name */
        @l3.b("company_house")
        private final String f21365J;

        /* renamed from: J0, reason: collision with root package name */
        @l3.b("company_domiciliary")
        private final Boolean f21366J0;

        /* renamed from: K, reason: collision with root package name */
        @l3.b("company_street")
        private final String f21367K;

        /* renamed from: L, reason: collision with root package name */
        @l3.b("company_city")
        private final String f21368L;

        /* renamed from: M, reason: collision with root package name */
        @l3.b("company_region")
        private final String f21369M;

        /* renamed from: N, reason: collision with root package name */
        @l3.b("country_registration")
        private final String f21370N;

        /* renamed from: O, reason: collision with root package name */
        @l3.b("company_postcode")
        private final String f21371O;

        /* renamed from: P, reason: collision with root package name */
        @l3.b("registration_date")
        private final Long f21372P;

        /* renamed from: Q, reason: collision with root package name */
        @l3.b("vat_registered")
        private final Boolean f21373Q;

        @l3.b("vat_registered_over_3_months")
        private final Boolean R;

        @l3.b("vat_number")
        private final String S;

        @l3.b("role")
        private final String T;

        @l3.b("state")
        private final String U;

        @l3.b("kyc_state")
        private final String V;

        @l3.b("avatar_uri")
        private final String W;

        @l3.b("app_id")
        private final String X;

        @l3.b("trust_level")
        private final String Y;

        /* renamed from: Z, reason: collision with root package name */
        @l3.b("application_type")
        private final String f21374Z;

        /* renamed from: a, reason: collision with root package name */
        @l3.b("id")
        private final Integer f21375a;

        /* renamed from: a0, reason: collision with root package name */
        @l3.b("application_version")
        private final String f21376a0;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("uuid")
        private final String f21377b;

        /* renamed from: b0, reason: collision with root package name */
        @l3.b("application_info")
        private final String f21378b0;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("email")
        private final String f21379c;

        /* renamed from: c0, reason: collision with root package name */
        @l3.b("privacy_policy")
        private final Object f21380c0;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("email_validated")
        private final Boolean f21381d;

        /* renamed from: d0, reason: collision with root package name */
        @l3.b("status_identification")
        private final String f21382d0;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("phone_area_code")
        private final String f21383e;

        /* renamed from: e0, reason: collision with root package name */
        @l3.b("tx_single_value")
        private float f21384e0;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("phone")
        private final String f21385f;

        /* renamed from: f0, reason: collision with root package name */
        @l3.b("is_vat_registered")
        private final Boolean f21386f0;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("phone_validated")
        private final Boolean f21387g;

        /* renamed from: g0, reason: collision with root package name */
        @l3.b("needs_license")
        private boolean f21388g0;

        /* renamed from: h, reason: collision with root package name */
        @l3.b(MessageBundle.TITLE_ENTRY)
        private final String f21389h;

        /* renamed from: h0, reason: collision with root package name */
        @l3.b("txs_in_monthly_count")
        private int f21390h0;

        @l3.b("first_name")
        private final String i;

        /* renamed from: i0, reason: collision with root package name */
        @l3.b("txs_out_monthly_count")
        private int f21391i0;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("last_name")
        private final String f21392j;

        /* renamed from: j0, reason: collision with root package name */
        @l3.b("bank_accounts_outside")
        private final List<a> f21393j0;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("apartment")
        private final String f21394k;

        /* renamed from: k0, reason: collision with root package name */
        @l3.b("payments_in_countries")
        private final List<String> f21395k0;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("house")
        private final String f21396l;

        /* renamed from: l0, reason: collision with root package name */
        @l3.b("payments_out_countries")
        private final List<String> f21397l0;

        /* renamed from: m, reason: collision with root package name */
        @l3.b("street")
        private final String f21398m;

        /* renamed from: m0, reason: collision with root package name */
        @l3.b("use_of_currencies")
        private final List<String> f21399m0;

        /* renamed from: n, reason: collision with root package name */
        @l3.b("city")
        private final String f21400n;

        /* renamed from: n0, reason: collision with root package name */
        @l3.b("needs_crypto_operations")
        private final Boolean f21401n0;

        /* renamed from: o, reason: collision with root package name */
        @l3.b("region")
        private final String f21402o;

        /* renamed from: o0, reason: collision with root package name */
        @l3.b("crypto_tx_single_value")
        private final Float f21403o0;

        /* renamed from: p, reason: collision with root package name */
        @l3.b("country")
        private final String f21404p;

        /* renamed from: p0, reason: collision with root package name */
        @l3.b("crypto_turnover_monthly")
        private final Float f21405p0;

        /* renamed from: q, reason: collision with root package name */
        @l3.b("postcode")
        private final String f21406q;

        /* renamed from: q0, reason: collision with root package name */
        @l3.b("crypto_txs_in_monthly_count")
        private final Integer f21407q0;

        /* renamed from: r, reason: collision with root package name */
        @l3.b("birthday")
        private final String f21408r;

        /* renamed from: r0, reason: collision with root package name */
        @l3.b("crypto_txs_out_monthly_count")
        private final Integer f21409r0;

        /* renamed from: s, reason: collision with root package name */
        @l3.b("income")
        private final String f21410s;

        @l3.b("crypto_payments_in_countries")
        private final List<String> s0;

        /* renamed from: t, reason: collision with root package name */
        @l3.b("income_currency")
        private final String f21411t;

        /* renamed from: t0, reason: collision with root package name */
        @l3.b("crypto_payments_out_countries")
        private final List<String> f21412t0;

        /* renamed from: u, reason: collision with root package name */
        @l3.b("income_frequency")
        private final String f21413u;

        /* renamed from: u0, reason: collision with root package name */
        @l3.b("crypto_use_of_currencies")
        private final List<String> f21414u0;

        /* renamed from: v, reason: collision with root package name */
        @l3.b("residential_status")
        private final String f21415v;

        /* renamed from: v0, reason: collision with root package name */
        @l3.b("country_citizenship")
        private final String f21416v0;

        /* renamed from: w, reason: collision with root package name */
        @l3.b("number_of_dependants")
        private final String f21417w;

        /* renamed from: w0, reason: collision with root package name */
        @l3.b("is_pep")
        private final Boolean f21418w0;

        /* renamed from: x, reason: collision with root package name */
        @l3.b("monthly_other_household_income")
        private final String f21419x;

        /* renamed from: x0, reason: collision with root package name */
        @l3.b("is_us")
        private final Boolean f21420x0;

        /* renamed from: y, reason: collision with root package name */
        @l3.b("monthly_housing_expenses")
        private final String f21421y;

        /* renamed from: y0, reason: collision with root package name */
        @l3.b("employees_count")
        private final String f21422y0;

        /* renamed from: z, reason: collision with root package name */
        @l3.b("company_name")
        private final String f21423z;

        /* renamed from: z0, reason: collision with root package name */
        @l3.b("individual_source_of_wealth")
        private final String f21424z0;

        public final String A() {
            return this.f21416v0;
        }

        public final Integer A0() {
            return this.f21357F;
        }

        public final String B() {
            return this.f21359G;
        }

        public final List<String> B0() {
            return this.f21399m0;
        }

        public final String C() {
            return this.f21370N;
        }

        public final String C0() {
            return this.f21377b;
        }

        public final List<String> D() {
            return this.s0;
        }

        public final String D0() {
            return this.S;
        }

        public final List<String> E() {
            return this.f21412t0;
        }

        public final Boolean E0() {
            return this.R;
        }

        public final Float F() {
            return this.f21405p0;
        }

        public final String F0() {
            return this.f21355E;
        }

        public final Float G() {
            return this.f21403o0;
        }

        public final Boolean G0() {
            return this.f21418w0;
        }

        public final Integer H() {
            return this.f21407q0;
        }

        public final Boolean H0() {
            return this.f21420x0;
        }

        public final Integer I() {
            return this.f21409r0;
        }

        public final Boolean I0() {
            return this.f21386f0;
        }

        public final List<String> J() {
            return this.f21414u0;
        }

        public final String K() {
            return this.f21379c;
        }

        public final Boolean L() {
            return this.f21381d;
        }

        public final String M() {
            return this.f21422y0;
        }

        public final String N() {
            return this.i;
        }

        public final String O() {
            return this.f21396l;
        }

        public final Integer P() {
            return this.f21375a;
        }

        public final String Q() {
            return this.f21410s;
        }

        public final String R() {
            return this.f21411t;
        }

        public final String S() {
            return this.f21413u;
        }

        public final String T() {
            return this.V;
        }

        public final String U() {
            return this.f21392j;
        }

        public final String V() {
            return this.f21350B0;
        }

        public final int W() {
            return this.f21390h0;
        }

        public final int X() {
            return this.f21391i0;
        }

        public final String Y() {
            return this.f21421y;
        }

        public final String Z() {
            return this.f21419x;
        }

        public final Double a() {
            return this.f21364I0;
        }

        public final boolean a0() {
            return this.f21388g0;
        }

        public final String b() {
            return this.f21394k;
        }

        public final Boolean b0() {
            return this.f21401n0;
        }

        public final String c() {
            return this.X;
        }

        public final String c0() {
            return this.f21417w;
        }

        public final String d() {
            return this.f21378b0;
        }

        public final String d0() {
            return this.f21351C;
        }

        public final String e() {
            return this.f21374Z;
        }

        public final String e0() {
            return this.f21358F0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0409b)) {
                return false;
            }
            C0409b c0409b = (C0409b) obj;
            return kotlin.jvm.internal.f.b(this.f21375a, c0409b.f21375a) && kotlin.jvm.internal.f.b(this.f21377b, c0409b.f21377b) && kotlin.jvm.internal.f.b(this.f21379c, c0409b.f21379c) && kotlin.jvm.internal.f.b(this.f21381d, c0409b.f21381d) && kotlin.jvm.internal.f.b(this.f21383e, c0409b.f21383e) && kotlin.jvm.internal.f.b(this.f21385f, c0409b.f21385f) && kotlin.jvm.internal.f.b(this.f21387g, c0409b.f21387g) && kotlin.jvm.internal.f.b(this.f21389h, c0409b.f21389h) && kotlin.jvm.internal.f.b(this.i, c0409b.i) && kotlin.jvm.internal.f.b(this.f21392j, c0409b.f21392j) && kotlin.jvm.internal.f.b(this.f21394k, c0409b.f21394k) && kotlin.jvm.internal.f.b(this.f21396l, c0409b.f21396l) && kotlin.jvm.internal.f.b(this.f21398m, c0409b.f21398m) && kotlin.jvm.internal.f.b(this.f21400n, c0409b.f21400n) && kotlin.jvm.internal.f.b(this.f21402o, c0409b.f21402o) && kotlin.jvm.internal.f.b(this.f21404p, c0409b.f21404p) && kotlin.jvm.internal.f.b(this.f21406q, c0409b.f21406q) && kotlin.jvm.internal.f.b(this.f21408r, c0409b.f21408r) && kotlin.jvm.internal.f.b(this.f21410s, c0409b.f21410s) && kotlin.jvm.internal.f.b(this.f21411t, c0409b.f21411t) && kotlin.jvm.internal.f.b(this.f21413u, c0409b.f21413u) && kotlin.jvm.internal.f.b(this.f21415v, c0409b.f21415v) && kotlin.jvm.internal.f.b(this.f21417w, c0409b.f21417w) && kotlin.jvm.internal.f.b(this.f21419x, c0409b.f21419x) && kotlin.jvm.internal.f.b(this.f21421y, c0409b.f21421y) && kotlin.jvm.internal.f.b(this.f21423z, c0409b.f21423z) && kotlin.jvm.internal.f.b(this.f21347A, c0409b.f21347A) && kotlin.jvm.internal.f.b(this.f21349B, c0409b.f21349B) && kotlin.jvm.internal.f.b(this.f21351C, c0409b.f21351C) && kotlin.jvm.internal.f.b(this.f21353D, c0409b.f21353D) && kotlin.jvm.internal.f.b(this.f21355E, c0409b.f21355E) && kotlin.jvm.internal.f.b(this.f21357F, c0409b.f21357F) && kotlin.jvm.internal.f.b(this.f21359G, c0409b.f21359G) && kotlin.jvm.internal.f.b(this.f21361H, c0409b.f21361H) && kotlin.jvm.internal.f.b(this.f21363I, c0409b.f21363I) && kotlin.jvm.internal.f.b(this.f21365J, c0409b.f21365J) && kotlin.jvm.internal.f.b(this.f21367K, c0409b.f21367K) && kotlin.jvm.internal.f.b(this.f21368L, c0409b.f21368L) && kotlin.jvm.internal.f.b(this.f21369M, c0409b.f21369M) && kotlin.jvm.internal.f.b(this.f21370N, c0409b.f21370N) && kotlin.jvm.internal.f.b(this.f21371O, c0409b.f21371O) && kotlin.jvm.internal.f.b(this.f21372P, c0409b.f21372P) && kotlin.jvm.internal.f.b(this.f21373Q, c0409b.f21373Q) && kotlin.jvm.internal.f.b(this.R, c0409b.R) && kotlin.jvm.internal.f.b(this.S, c0409b.S) && kotlin.jvm.internal.f.b(this.T, c0409b.T) && kotlin.jvm.internal.f.b(this.U, c0409b.U) && kotlin.jvm.internal.f.b(this.V, c0409b.V) && kotlin.jvm.internal.f.b(this.W, c0409b.W) && kotlin.jvm.internal.f.b(this.X, c0409b.X) && kotlin.jvm.internal.f.b(this.Y, c0409b.Y) && kotlin.jvm.internal.f.b(this.f21374Z, c0409b.f21374Z) && kotlin.jvm.internal.f.b(this.f21376a0, c0409b.f21376a0) && kotlin.jvm.internal.f.b(this.f21378b0, c0409b.f21378b0) && kotlin.jvm.internal.f.b(this.f21380c0, c0409b.f21380c0) && kotlin.jvm.internal.f.b(this.f21382d0, c0409b.f21382d0) && Float.compare(this.f21384e0, c0409b.f21384e0) == 0 && kotlin.jvm.internal.f.b(this.f21386f0, c0409b.f21386f0) && this.f21388g0 == c0409b.f21388g0 && this.f21390h0 == c0409b.f21390h0 && this.f21391i0 == c0409b.f21391i0 && kotlin.jvm.internal.f.b(this.f21393j0, c0409b.f21393j0) && kotlin.jvm.internal.f.b(this.f21395k0, c0409b.f21395k0) && kotlin.jvm.internal.f.b(this.f21397l0, c0409b.f21397l0) && kotlin.jvm.internal.f.b(this.f21399m0, c0409b.f21399m0) && kotlin.jvm.internal.f.b(this.f21401n0, c0409b.f21401n0) && kotlin.jvm.internal.f.b(this.f21403o0, c0409b.f21403o0) && kotlin.jvm.internal.f.b(this.f21405p0, c0409b.f21405p0) && kotlin.jvm.internal.f.b(this.f21407q0, c0409b.f21407q0) && kotlin.jvm.internal.f.b(this.f21409r0, c0409b.f21409r0) && kotlin.jvm.internal.f.b(this.s0, c0409b.s0) && kotlin.jvm.internal.f.b(this.f21412t0, c0409b.f21412t0) && kotlin.jvm.internal.f.b(this.f21414u0, c0409b.f21414u0) && kotlin.jvm.internal.f.b(this.f21416v0, c0409b.f21416v0) && kotlin.jvm.internal.f.b(this.f21418w0, c0409b.f21418w0) && kotlin.jvm.internal.f.b(this.f21420x0, c0409b.f21420x0) && kotlin.jvm.internal.f.b(this.f21422y0, c0409b.f21422y0) && kotlin.jvm.internal.f.b(this.f21424z0, c0409b.f21424z0) && kotlin.jvm.internal.f.b(this.f21348A0, c0409b.f21348A0) && kotlin.jvm.internal.f.b(this.f21350B0, c0409b.f21350B0) && kotlin.jvm.internal.f.b(this.f21352C0, c0409b.f21352C0) && kotlin.jvm.internal.f.b(this.f21354D0, c0409b.f21354D0) && kotlin.jvm.internal.f.b(this.f21356E0, c0409b.f21356E0) && kotlin.jvm.internal.f.b(this.f21358F0, c0409b.f21358F0) && kotlin.jvm.internal.f.b(this.f21360G0, c0409b.f21360G0) && kotlin.jvm.internal.f.b(this.f21362H0, c0409b.f21362H0) && kotlin.jvm.internal.f.b(this.f21364I0, c0409b.f21364I0) && kotlin.jvm.internal.f.b(this.f21366J0, c0409b.f21366J0);
        }

        public final String f() {
            return this.f21376a0;
        }

        public final List<String> f0() {
            return this.f21395k0;
        }

        public final String g() {
            return this.W;
        }

        public final List<String> g0() {
            return this.f21397l0;
        }

        public final List<a> h() {
            return this.f21393j0;
        }

        public final String h0() {
            return this.f21385f;
        }

        public final int hashCode() {
            Integer num = this.f21375a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f21377b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f21379c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f21381d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.f21383e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f21385f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool2 = this.f21387g;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.f21389h;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f21392j;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f21394k;
            int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f21396l;
            int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f21398m;
            int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f21400n;
            int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f21402o;
            int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f21404p;
            int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f21406q;
            int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f21408r;
            int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f21410s;
            int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.f21411t;
            int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.f21413u;
            int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.f21415v;
            int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.f21417w;
            int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.f21419x;
            int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.f21421y;
            int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.f21423z;
            int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.f21347A;
            int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.f21349B;
            int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.f21351C;
            int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.f21353D;
            int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.f21355E;
            int hashCode31 = (hashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
            Integer num2 = this.f21357F;
            int hashCode32 = (hashCode31 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str29 = this.f21359G;
            int hashCode33 = (hashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
            String str30 = this.f21361H;
            int hashCode34 = (hashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.f21363I;
            int hashCode35 = (hashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.f21365J;
            int hashCode36 = (hashCode35 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.f21367K;
            int hashCode37 = (hashCode36 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.f21368L;
            int hashCode38 = (hashCode37 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.f21369M;
            int hashCode39 = (hashCode38 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.f21370N;
            int hashCode40 = (hashCode39 + (str36 == null ? 0 : str36.hashCode())) * 31;
            String str37 = this.f21371O;
            int hashCode41 = (hashCode40 + (str37 == null ? 0 : str37.hashCode())) * 31;
            Long l10 = this.f21372P;
            int hashCode42 = (hashCode41 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Boolean bool3 = this.f21373Q;
            int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.R;
            int hashCode44 = (hashCode43 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str38 = this.S;
            int hashCode45 = (hashCode44 + (str38 == null ? 0 : str38.hashCode())) * 31;
            String str39 = this.T;
            int hashCode46 = (hashCode45 + (str39 == null ? 0 : str39.hashCode())) * 31;
            String str40 = this.U;
            int hashCode47 = (hashCode46 + (str40 == null ? 0 : str40.hashCode())) * 31;
            String str41 = this.V;
            int hashCode48 = (hashCode47 + (str41 == null ? 0 : str41.hashCode())) * 31;
            String str42 = this.W;
            int hashCode49 = (hashCode48 + (str42 == null ? 0 : str42.hashCode())) * 31;
            String str43 = this.X;
            int hashCode50 = (hashCode49 + (str43 == null ? 0 : str43.hashCode())) * 31;
            String str44 = this.Y;
            int hashCode51 = (hashCode50 + (str44 == null ? 0 : str44.hashCode())) * 31;
            String str45 = this.f21374Z;
            int hashCode52 = (hashCode51 + (str45 == null ? 0 : str45.hashCode())) * 31;
            String str46 = this.f21376a0;
            int hashCode53 = (hashCode52 + (str46 == null ? 0 : str46.hashCode())) * 31;
            String str47 = this.f21378b0;
            int hashCode54 = (hashCode53 + (str47 == null ? 0 : str47.hashCode())) * 31;
            Object obj = this.f21380c0;
            int hashCode55 = (hashCode54 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str48 = this.f21382d0;
            int a10 = v.a((hashCode55 + (str48 == null ? 0 : str48.hashCode())) * 31, this.f21384e0, 31);
            Boolean bool5 = this.f21386f0;
            int b9 = v.b(this.f21391i0, v.b(this.f21390h0, v.d((a10 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31, this.f21388g0), 31), 31);
            List<a> list = this.f21393j0;
            int hashCode56 = (b9 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f21395k0;
            int hashCode57 = (hashCode56 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.f21397l0;
            int hashCode58 = (hashCode57 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.f21399m0;
            int hashCode59 = (hashCode58 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool6 = this.f21401n0;
            int hashCode60 = (hashCode59 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Float f10 = this.f21403o0;
            int hashCode61 = (hashCode60 + (f10 == null ? 0 : f10.hashCode())) * 31;
            Float f11 = this.f21405p0;
            int hashCode62 = (hashCode61 + (f11 == null ? 0 : f11.hashCode())) * 31;
            Integer num3 = this.f21407q0;
            int hashCode63 = (hashCode62 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f21409r0;
            int hashCode64 = (hashCode63 + (num4 == null ? 0 : num4.hashCode())) * 31;
            List<String> list5 = this.s0;
            int hashCode65 = (hashCode64 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<String> list6 = this.f21412t0;
            int hashCode66 = (hashCode65 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List<String> list7 = this.f21414u0;
            int hashCode67 = (hashCode66 + (list7 == null ? 0 : list7.hashCode())) * 31;
            String str49 = this.f21416v0;
            int hashCode68 = (hashCode67 + (str49 == null ? 0 : str49.hashCode())) * 31;
            Boolean bool7 = this.f21418w0;
            int hashCode69 = (hashCode68 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.f21420x0;
            int hashCode70 = (hashCode69 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            String str50 = this.f21422y0;
            int hashCode71 = (hashCode70 + (str50 == null ? 0 : str50.hashCode())) * 31;
            String str51 = this.f21424z0;
            int hashCode72 = (hashCode71 + (str51 == null ? 0 : str51.hashCode())) * 31;
            String str52 = this.f21348A0;
            int hashCode73 = (hashCode72 + (str52 == null ? 0 : str52.hashCode())) * 31;
            String str53 = this.f21350B0;
            int hashCode74 = (hashCode73 + (str53 == null ? 0 : str53.hashCode())) * 31;
            List<c> list8 = this.f21352C0;
            int hashCode75 = (hashCode74 + (list8 == null ? 0 : list8.hashCode())) * 31;
            List<c> list9 = this.f21354D0;
            int hashCode76 = (hashCode75 + (list9 == null ? 0 : list9.hashCode())) * 31;
            String str54 = this.f21356E0;
            int hashCode77 = (hashCode76 + (str54 == null ? 0 : str54.hashCode())) * 31;
            String str55 = this.f21358F0;
            int hashCode78 = (hashCode77 + (str55 == null ? 0 : str55.hashCode())) * 31;
            String str56 = this.f21360G0;
            int hashCode79 = (hashCode78 + (str56 == null ? 0 : str56.hashCode())) * 31;
            String str57 = this.f21362H0;
            int hashCode80 = (hashCode79 + (str57 == null ? 0 : str57.hashCode())) * 31;
            Double d10 = this.f21364I0;
            int hashCode81 = (hashCode80 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Boolean bool9 = this.f21366J0;
            return hashCode81 + (bool9 != null ? bool9.hashCode() : 0);
        }

        public final String i() {
            return this.f21408r;
        }

        public final Boolean i0() {
            return this.f21387g;
        }

        public final String j() {
            return this.f21363I;
        }

        public final String j0() {
            return this.f21383e;
        }

        public final String k() {
            return this.f21361H;
        }

        public final String k0() {
            return this.f21406q;
        }

        public final String l() {
            return this.f21400n;
        }

        public final Object l0() {
            return this.f21380c0;
        }

        public final String m() {
            return this.f21368L;
        }

        public final String m0() {
            return this.f21402o;
        }

        public final Boolean n() {
            return this.f21366J0;
        }

        public final Long n0() {
            return this.f21372P;
        }

        public final String o() {
            return this.f21365J;
        }

        public final String o0() {
            return this.f21415v;
        }

        public final String p() {
            return this.f21423z;
        }

        public final String p0() {
            return this.T;
        }

        public final String q() {
            return this.f21347A;
        }

        public final String q0() {
            return this.f21348A0;
        }

        public final String r() {
            return this.f21362H0;
        }

        public final float r0() {
            return this.f21384e0;
        }

        public final String s() {
            return this.f21371O;
        }

        public final String s0() {
            return this.f21356E0;
        }

        public final String t() {
            return this.f21369M;
        }

        public final String t0() {
            return this.f21424z0;
        }

        public final String toString() {
            Integer num = this.f21375a;
            String str = this.f21377b;
            String str2 = this.f21379c;
            Boolean bool = this.f21381d;
            String str3 = this.f21383e;
            String str4 = this.f21385f;
            Boolean bool2 = this.f21387g;
            String str5 = this.f21389h;
            String str6 = this.i;
            String str7 = this.f21392j;
            String str8 = this.f21394k;
            String str9 = this.f21396l;
            String str10 = this.f21398m;
            String str11 = this.f21400n;
            String str12 = this.f21402o;
            String str13 = this.f21404p;
            String str14 = this.f21406q;
            String str15 = this.f21408r;
            String str16 = this.f21410s;
            String str17 = this.f21411t;
            String str18 = this.f21413u;
            String str19 = this.f21415v;
            String str20 = this.f21417w;
            String str21 = this.f21419x;
            String str22 = this.f21421y;
            String str23 = this.f21423z;
            String str24 = this.f21347A;
            String str25 = this.f21349B;
            String str26 = this.f21351C;
            String str27 = this.f21353D;
            String str28 = this.f21355E;
            Integer num2 = this.f21357F;
            String str29 = this.f21359G;
            String str30 = this.f21361H;
            String str31 = this.f21363I;
            String str32 = this.f21365J;
            String str33 = this.f21367K;
            String str34 = this.f21368L;
            String str35 = this.f21369M;
            String str36 = this.f21370N;
            String str37 = this.f21371O;
            Long l10 = this.f21372P;
            Boolean bool3 = this.f21373Q;
            Boolean bool4 = this.R;
            String str38 = this.S;
            String str39 = this.T;
            String str40 = this.U;
            String str41 = this.V;
            String str42 = this.W;
            String str43 = this.X;
            String str44 = this.Y;
            String str45 = this.f21374Z;
            String str46 = this.f21376a0;
            String str47 = this.f21378b0;
            Object obj = this.f21380c0;
            String str48 = this.f21382d0;
            float f10 = this.f21384e0;
            Boolean bool5 = this.f21386f0;
            boolean z10 = this.f21388g0;
            int i = this.f21390h0;
            int i9 = this.f21391i0;
            List<a> list = this.f21393j0;
            List<String> list2 = this.f21395k0;
            List<String> list3 = this.f21397l0;
            List<String> list4 = this.f21399m0;
            Boolean bool6 = this.f21401n0;
            Float f11 = this.f21403o0;
            Float f12 = this.f21405p0;
            Integer num3 = this.f21407q0;
            Integer num4 = this.f21409r0;
            List<String> list5 = this.s0;
            List<String> list6 = this.f21412t0;
            List<String> list7 = this.f21414u0;
            String str49 = this.f21416v0;
            Boolean bool7 = this.f21418w0;
            Boolean bool8 = this.f21420x0;
            String str50 = this.f21422y0;
            String str51 = this.f21424z0;
            String str52 = this.f21348A0;
            String str53 = this.f21350B0;
            List<c> list8 = this.f21352C0;
            List<c> list9 = this.f21354D0;
            String str54 = this.f21356E0;
            String str55 = this.f21358F0;
            String str56 = this.f21360G0;
            String str57 = this.f21362H0;
            Double d10 = this.f21364I0;
            Boolean bool9 = this.f21366J0;
            StringBuilder sb2 = new StringBuilder("CompanyRaw(id=");
            sb2.append(num);
            sb2.append(", uuid=");
            sb2.append(str);
            sb2.append(", email=");
            sb2.append(str2);
            sb2.append(", emailValidated=");
            sb2.append(bool);
            sb2.append(", phone_area_code=");
            androidx.camera.core.impl.utils.a.u(sb2, str3, ", phone=", str4, ", phoneValidated=");
            sb2.append(bool2);
            sb2.append(", title=");
            sb2.append(str5);
            sb2.append(", firstName=");
            androidx.camera.core.impl.utils.a.u(sb2, str6, ", lastName=", str7, ", apartment=");
            androidx.camera.core.impl.utils.a.u(sb2, str8, ", house=", str9, ", street=");
            androidx.camera.core.impl.utils.a.u(sb2, str10, ", city=", str11, ", region=");
            androidx.camera.core.impl.utils.a.u(sb2, str12, ", country=", str13, ", postcode=");
            androidx.camera.core.impl.utils.a.u(sb2, str14, ", birthday=", str15, ", income=");
            androidx.camera.core.impl.utils.a.u(sb2, str16, ", incomeCurrency=", str17, ", incomeFrequency=");
            androidx.camera.core.impl.utils.a.u(sb2, str18, ", residentialStatus=", str19, ", numberOfDependants=");
            androidx.camera.core.impl.utils.a.u(sb2, str20, ", monthlyOtherHouseholdIncome=", str21, ", monthlyHousingExpenses=");
            androidx.camera.core.impl.utils.a.u(sb2, str22, ", companyName=", str23, ", companyNumber=");
            androidx.camera.core.impl.utils.a.u(sb2, str24, ", companyType=", str25, ", otherCompanyType=");
            androidx.camera.core.impl.utils.a.u(sb2, str26, ", taxIdNumber=", str27, ", website=");
            sb2.append(str28);
            sb2.append(", turnover=");
            sb2.append(num2);
            sb2.append(", countryOperation=");
            androidx.camera.core.impl.utils.a.u(sb2, str29, ", businessSectorType=", str30, ", businessSector=");
            androidx.camera.core.impl.utils.a.u(sb2, str31, ", companyHouse=", str32, ", companyStreet=");
            androidx.camera.core.impl.utils.a.u(sb2, str33, ", companyCity=", str34, ", companyRegion=");
            androidx.camera.core.impl.utils.a.u(sb2, str35, ", countryRegistration=", str36, ", companyPostcode=");
            sb2.append(str37);
            sb2.append(", registrationDate=");
            sb2.append(l10);
            sb2.append(", vatRegistered=");
            sb2.append(bool3);
            sb2.append(", vatRegisteredOver3months=");
            sb2.append(bool4);
            sb2.append(", vatNumber=");
            androidx.camera.core.impl.utils.a.u(sb2, str38, ", role=", str39, ", state=");
            androidx.camera.core.impl.utils.a.u(sb2, str40, ", kycState=", str41, ", avatarUri=");
            androidx.camera.core.impl.utils.a.u(sb2, str42, ", appId=", str43, ", trustLevel=");
            androidx.camera.core.impl.utils.a.u(sb2, str44, ", applicationType=", str45, ", applicationVersion=");
            androidx.camera.core.impl.utils.a.u(sb2, str46, ", applicationInfo=", str47, ", privacyPolicy=");
            sb2.append(obj);
            sb2.append(", statusIdentification=");
            sb2.append(str48);
            sb2.append(", singleValue=");
            sb2.append(f10);
            sb2.append(", isVatRegistered=");
            sb2.append(bool5);
            sb2.append(", needLicense=");
            sb2.append(z10);
            sb2.append(", monthIncoming=");
            sb2.append(i);
            sb2.append(", monthOutgoing=");
            sb2.append(i9);
            sb2.append(", bankAccountsOutside=");
            sb2.append(list);
            sb2.append(", paymentsInCountries=");
            sb2.append(list2);
            sb2.append(", paymentsOutCountries=");
            sb2.append(list3);
            sb2.append(", useOfCurrencies=");
            sb2.append(list4);
            sb2.append(", needsCryptoOperations=");
            sb2.append(bool6);
            sb2.append(", cryptoTxSingleValue=");
            sb2.append(f11);
            sb2.append(", cryptoTurnoverMonthly=");
            sb2.append(f12);
            sb2.append(", cryptoTxsInMonthlyCount=");
            sb2.append(num3);
            sb2.append(", cryptoTxsOutMonthlyCount=");
            sb2.append(num4);
            sb2.append(", cryptoPaymentsInCountries=");
            sb2.append(list5);
            sb2.append(", cryptoPaymentsOutCountries=");
            sb2.append(list6);
            sb2.append(", cryptoUseOfCurrencies=");
            sb2.append(list7);
            sb2.append(", countryCitizenship=");
            sb2.append(str49);
            sb2.append(", isPep=");
            sb2.append(bool7);
            sb2.append(", isUs=");
            sb2.append(bool8);
            sb2.append(", employeesCount=");
            androidx.camera.core.impl.utils.a.u(sb2, str50, ", sourceOfWealth=", str51, ", shortDescription=");
            androidx.camera.core.impl.utils.a.u(sb2, str52, ", linkToCV=", str53, ", contactorsOutgoing=");
            sb2.append(list8);
            sb2.append(", contactorsIncoming=");
            sb2.append(list9);
            sb2.append(", sourceOfFunds=");
            androidx.camera.core.impl.utils.a.u(sb2, str54, ", otherSourceOfFunds=", str55, ", companySourceOfWealth=");
            androidx.camera.core.impl.utils.a.u(sb2, str56, ", companyOtherSourceOfWealth=", str57, ", amount=");
            sb2.append(d10);
            sb2.append(", companyDomiciliary=");
            sb2.append(bool9);
            sb2.append(")");
            return sb2.toString();
        }

        public final String u() {
            return this.f21360G0;
        }

        public final String u0() {
            return this.U;
        }

        public final String v() {
            return this.f21367K;
        }

        public final String v0() {
            return this.f21382d0;
        }

        public final String w() {
            return this.f21349B;
        }

        public final String w0() {
            return this.f21398m;
        }

        public final List<c> x() {
            return this.f21354D0;
        }

        public final String x0() {
            return this.f21353D;
        }

        public final List<c> y() {
            return this.f21352C0;
        }

        public final String y0() {
            return this.f21389h;
        }

        public final String z() {
            return this.f21404p;
        }

        public final String z0() {
            return this.Y;
        }
    }

    /* compiled from: CorporateDetailsRaw.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String f21425a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("country_incorporation")
        private final String f21426b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("business_description")
        private final String f21427c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("info")
        private final String f21428d;

        public final String a() {
            return this.f21427c;
        }

        public final String b() {
            return this.f21426b;
        }

        public final String c() {
            return this.f21428d;
        }

        public final String d() {
            return this.f21425a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f21425a, cVar.f21425a) && kotlin.jvm.internal.f.b(this.f21426b, cVar.f21426b) && kotlin.jvm.internal.f.b(this.f21427c, cVar.f21427c) && kotlin.jvm.internal.f.b(this.f21428d, cVar.f21428d);
        }

        public final int hashCode() {
            String str = this.f21425a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f21426b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21427c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f21428d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f21425a;
            String str2 = this.f21426b;
            return s3.b.o(s3.b.p("ContractorRaw(name=", str, ", countryIncorporation=", str2, ", businessDescription="), this.f21427c, ", info=", this.f21428d, ")");
        }
    }

    /* compiled from: CorporateDetailsRaw.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("positions")
        private final List<String> f21429a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("beneficiary_type")
        private final String f21430b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("shares_amount")
        private final Float f21431c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("member_role")
        private final String f21432d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("member")
        private final C0409b f21433e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("is_creator")
        private final Boolean f21434f;

        public final String a() {
            return this.f21430b;
        }

        public final C0409b b() {
            return this.f21433e;
        }

        public final String c() {
            return this.f21432d;
        }

        public final List<String> d() {
            return this.f21429a;
        }

        public final Float e() {
            return this.f21431c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f21429a, dVar.f21429a) && kotlin.jvm.internal.f.b(this.f21430b, dVar.f21430b) && kotlin.jvm.internal.f.b(this.f21431c, dVar.f21431c) && kotlin.jvm.internal.f.b(this.f21432d, dVar.f21432d) && kotlin.jvm.internal.f.b(this.f21433e, dVar.f21433e) && kotlin.jvm.internal.f.b(this.f21434f, dVar.f21434f);
        }

        public final Boolean f() {
            return this.f21434f;
        }

        public final int hashCode() {
            List<String> list = this.f21429a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f21430b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f10 = this.f21431c;
            int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str2 = this.f21432d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C0409b c0409b = this.f21433e;
            int hashCode5 = (hashCode4 + (c0409b == null ? 0 : c0409b.hashCode())) * 31;
            Boolean bool = this.f21434f;
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "TeamMemberRaw(positions=" + this.f21429a + ", beneficiaryType=" + this.f21430b + ", sharesAmount=" + this.f21431c + ", memberRole=" + this.f21432d + ", member=" + this.f21433e + ", isCreator=" + this.f21434f + ")";
        }
    }

    public final C0409b b() {
        return this.f21337b;
    }

    public final String c() {
        return this.i;
    }

    public final String d() {
        return this.f21340e;
    }

    public final List<String> e() {
        return this.f21339d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f21337b, bVar.f21337b) && kotlin.jvm.internal.f.b(this.f21338c, bVar.f21338c) && kotlin.jvm.internal.f.b(this.f21339d, bVar.f21339d) && kotlin.jvm.internal.f.b(this.f21340e, bVar.f21340e) && kotlin.jvm.internal.f.b(this.f21341f, bVar.f21341f) && kotlin.jvm.internal.f.b(this.f21342g, bVar.f21342g) && kotlin.jvm.internal.f.b(this.f21343h, bVar.f21343h) && kotlin.jvm.internal.f.b(this.i, bVar.i);
    }

    public final String f() {
        return this.f21341f;
    }

    public final Float g() {
        return this.f21343h;
    }

    public final List<d> h() {
        return this.f21338c;
    }

    public final int hashCode() {
        C0409b c0409b = this.f21337b;
        int hashCode = (c0409b == null ? 0 : c0409b.hashCode()) * 31;
        List<d> list = this.f21338c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f21339d;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f21340e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21341f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f21342g;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f10 = this.f21343h;
        int hashCode7 = (hashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str3 = this.i;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f21342g;
    }

    public final String toString() {
        return "CorporateDetailsRaw(company=" + this.f21337b + ", teamMembers=" + this.f21338c + ", myPositions=" + this.f21339d + ", myBeneficiaryType=" + this.f21340e + ", myRole=" + this.f21341f + ", isCreator=" + this.f21342g + ", mySharesAmount=" + this.f21343h + ", enrolledAt=" + this.i + ")";
    }
}

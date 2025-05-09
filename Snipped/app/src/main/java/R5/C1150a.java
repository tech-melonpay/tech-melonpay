package r5;

import C.v;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: ErrorBodyResponse.kt */
/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150a {

    /* renamed from: d, reason: collision with root package name */
    @l3.b(ProductAction.ACTION_DETAIL)
    private final C0465a f26266d;

    /* renamed from: a, reason: collision with root package name */
    @l3.b(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final boolean f26263a = true;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("error_code")
    private final int f26264b = -1;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("error_key")
    private final String f26265c = "";

    /* renamed from: e, reason: collision with root package name */
    @l3.b("errors")
    private final List<b> f26267e = null;

    /* compiled from: ErrorBodyResponse.kt */
    /* renamed from: r5.a$a, reason: collision with other inner class name */
    public static final class C0465a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("result")
        private final String f26268a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("message")
        private final String f26269b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("response_content")
        private final c f26270c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("source_currency")
        private final String f26271d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("destination_currency")
        private final String f26272e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("direction")
        private final String f26273f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("source_amount")
        private final Double f26274g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("destination_amount")
        private final Double f26275h;

        @l3.b("comission_amount")
        private final Double i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("comission_currency")
        private final String f26276j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("commision_type")
        private final String f26277k;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("commission_display_amount")
        private final Double f26278l;

        /* renamed from: m, reason: collision with root package name */
        @l3.b("rate")
        private final Double f26279m;

        /* renamed from: n, reason: collision with root package name */
        @l3.b("min_source_amount")
        private final Double f26280n;

        public C0465a() {
            this(null, null, 16383);
        }

        public final String a() {
            return this.f26276j;
        }

        public final Double b() {
            return this.f26278l;
        }

        public final String c() {
            return this.f26277k;
        }

        public final Double d() {
            return this.f26275h;
        }

        public final String e() {
            return this.f26269b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0465a)) {
                return false;
            }
            C0465a c0465a = (C0465a) obj;
            return f.b(this.f26268a, c0465a.f26268a) && f.b(this.f26269b, c0465a.f26269b) && f.b(this.f26270c, c0465a.f26270c) && f.b(this.f26271d, c0465a.f26271d) && f.b(this.f26272e, c0465a.f26272e) && f.b(this.f26273f, c0465a.f26273f) && f.b(this.f26274g, c0465a.f26274g) && f.b(this.f26275h, c0465a.f26275h) && f.b(this.i, c0465a.i) && f.b(this.f26276j, c0465a.f26276j) && f.b(this.f26277k, c0465a.f26277k) && f.b(this.f26278l, c0465a.f26278l) && f.b(this.f26279m, c0465a.f26279m) && f.b(this.f26280n, c0465a.f26280n);
        }

        public final c f() {
            return this.f26270c;
        }

        public final int hashCode() {
            String str = this.f26268a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26269b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            c cVar = this.f26270c;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str3 = this.f26271d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26272e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f26273f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Double d10 = this.f26274g;
            int hashCode7 = (hashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f26275h;
            int hashCode8 = (hashCode7 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.i;
            int hashCode9 = (hashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
            String str6 = this.f26276j;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f26277k;
            int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Double d13 = this.f26278l;
            int hashCode12 = (hashCode11 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f26279m;
            int hashCode13 = (hashCode12 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f26280n;
            return hashCode13 + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f26268a;
            String str2 = this.f26269b;
            c cVar = this.f26270c;
            String str3 = this.f26271d;
            String str4 = this.f26272e;
            String str5 = this.f26273f;
            Double d10 = this.f26274g;
            Double d11 = this.f26275h;
            Double d12 = this.i;
            String str6 = this.f26276j;
            String str7 = this.f26277k;
            Double d13 = this.f26278l;
            Double d14 = this.f26279m;
            Double d15 = this.f26280n;
            StringBuilder p10 = s3.b.p("ErrorDetailsResponse(result=", str, ", message=", str2, ", responseContent=");
            p10.append(cVar);
            p10.append(", sourceCurrency=");
            p10.append(str3);
            p10.append(", destinationCurrency=");
            androidx.camera.core.impl.utils.a.u(p10, str4, ", direction=", str5, ", sourceAmount=");
            com.google.android.gms.measurement.internal.a.r(p10, d10, ", destinationAmount=", d11, ", comissionAmount=");
            p10.append(d12);
            p10.append(", comissionCurrency=");
            p10.append(str6);
            p10.append(", comissionType=");
            p10.append(str7);
            p10.append(", comissionDisplayAmount=");
            p10.append(d13);
            p10.append(", rate=");
            p10.append(d14);
            p10.append(", minSourceAmount=");
            p10.append(d15);
            p10.append(")");
            return p10.toString();
        }

        public C0465a(String str, c cVar, int i) {
            str = (i & 2) != 0 ? null : str;
            cVar = (i & 4) != 0 ? null : cVar;
            this.f26268a = null;
            this.f26269b = str;
            this.f26270c = cVar;
            this.f26271d = null;
            this.f26272e = null;
            this.f26273f = null;
            this.f26274g = null;
            this.f26275h = null;
            this.i = null;
            this.f26276j = null;
            this.f26277k = null;
            this.f26278l = null;
            this.f26279m = null;
            this.f26280n = null;
        }
    }

    /* compiled from: ErrorBodyResponse.kt */
    /* renamed from: r5.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("propertyPath")
        private final String f26281a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("message")
        private final String f26282b;

        public final String a() {
            return this.f26282b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f.b(this.f26281a, bVar.f26281a) && f.b(this.f26282b, bVar.f26282b);
        }

        public final int hashCode() {
            String str = this.f26281a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26282b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return s3.b.l("ErrorResponseCrasula(propertyPath=", this.f26281a, ", message=", this.f26282b, ")");
        }
    }

    /* compiled from: ErrorBodyResponse.kt */
    /* renamed from: r5.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("message")
        private final String f26283a = null;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("error_text")
        private final String f26284b = null;

        public final String a() {
            return this.f26284b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f.b(this.f26283a, cVar.f26283a) && f.b(this.f26284b, cVar.f26284b);
        }

        public final int hashCode() {
            String str = this.f26283a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26284b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return s3.b.l("ResponseContent(message=", this.f26283a, ", errorText=", this.f26284b, ")");
        }
    }

    public C1150a(C0465a c0465a) {
        this.f26266d = c0465a;
    }

    public final C0465a a() {
        return this.f26266d;
    }

    public final List<b> b() {
        return this.f26267e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150a)) {
            return false;
        }
        C1150a c1150a = (C1150a) obj;
        return this.f26263a == c1150a.f26263a && this.f26264b == c1150a.f26264b && f.b(this.f26265c, c1150a.f26265c) && f.b(this.f26266d, c1150a.f26266d) && f.b(this.f26267e, c1150a.f26267e);
    }

    public final int hashCode() {
        int c2 = v.c(v.b(this.f26264b, Boolean.hashCode(this.f26263a) * 31, 31), 31, this.f26265c);
        C0465a c0465a = this.f26266d;
        int hashCode = (c2 + (c0465a == null ? 0 : c0465a.hashCode())) * 31;
        List<b> list = this.f26267e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorBodyResponse(error=" + this.f26263a + ", errorNumber=" + this.f26264b + ", errorKey=" + this.f26265c + ", details=" + this.f26266d + ", errors=" + this.f26267e + ")";
    }
}

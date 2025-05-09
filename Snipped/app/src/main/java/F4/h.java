package f4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.List;

/* compiled from: ListFeeRaw.kt */
/* loaded from: classes.dex */
public final class h extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("periodic")
    private final List<a> f20688b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("once")
    private final List<a> f20689c;

    /* compiled from: ListFeeRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b(FirebaseAnalytics.Param.METHOD)
        private final String f20690a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b(FirebaseAnalytics.Param.CURRENCY)
        private final String f20691b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("amount")
        private final Double f20692c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("remmitance")
        private final String f20693d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("frequency")
        private final String f20694e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("each")
        private final String f20695f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("next_payment")
        private final String f20696g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("createdate")
        private final String f20697h;

        public final Double a() {
            return this.f20692c;
        }

        public final String b() {
            return this.f20697h;
        }

        public final String c() {
            return this.f20691b;
        }

        public final String d() {
            return this.f20695f;
        }

        public final String e() {
            return this.f20694e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f20690a, aVar.f20690a) && kotlin.jvm.internal.f.b(this.f20691b, aVar.f20691b) && kotlin.jvm.internal.f.b(this.f20692c, aVar.f20692c) && kotlin.jvm.internal.f.b(this.f20693d, aVar.f20693d) && kotlin.jvm.internal.f.b(this.f20694e, aVar.f20694e) && kotlin.jvm.internal.f.b(this.f20695f, aVar.f20695f) && kotlin.jvm.internal.f.b(this.f20696g, aVar.f20696g) && kotlin.jvm.internal.f.b(this.f20697h, aVar.f20697h);
        }

        public final String f() {
            return this.f20690a;
        }

        public final String g() {
            return this.f20696g;
        }

        public final String h() {
            return this.f20693d;
        }

        public final int hashCode() {
            String str = this.f20690a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f20691b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f20692c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f20693d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f20694e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f20695f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f20696g;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f20697h;
            return hashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f20690a;
            String str2 = this.f20691b;
            Double d10 = this.f20692c;
            String str3 = this.f20693d;
            String str4 = this.f20694e;
            String str5 = this.f20695f;
            String str6 = this.f20696g;
            String str7 = this.f20697h;
            StringBuilder p10 = s3.b.p("FeeRaw(method=", str, ", currency=", str2, ", amount=");
            p10.append(d10);
            p10.append(", remmitance=");
            p10.append(str3);
            p10.append(", frequency=");
            androidx.camera.core.impl.utils.a.u(p10, str4, ", each=", str5, ", nextPayment=");
            return s3.b.o(p10, str6, ", createDate=", str7, ")");
        }
    }

    public final List<a> b() {
        return this.f20689c;
    }

    public final List<a> c() {
        return this.f20688b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f20688b, hVar.f20688b) && kotlin.jvm.internal.f.b(this.f20689c, hVar.f20689c);
    }

    public final int hashCode() {
        return this.f20689c.hashCode() + (this.f20688b.hashCode() * 31);
    }

    public final String toString() {
        return "ListFeeRaw(periodic=" + this.f20688b + ", once=" + this.f20689c + ")";
    }
}

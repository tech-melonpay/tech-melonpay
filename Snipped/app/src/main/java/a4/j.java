package a4;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: CreateNewCardRequestRaw.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f4308a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4309b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("is_virtual")
    private final Boolean f4310c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("delivery_address")
    private final a f4311d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("express_delivery")
    private final Boolean f4312e;

    /* compiled from: CreateNewCardRequestRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("country")
        private final String f4313a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("city")
        private final String f4314b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("zip")
        private final String f4315c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("address_line_1")
        private final String f4316d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("address_line_2")
        private final String f4317e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f4313a = str;
            this.f4314b = str2;
            this.f4315c = str3;
            this.f4316d = str4;
            this.f4317e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f4313a, aVar.f4313a) && kotlin.jvm.internal.f.b(this.f4314b, aVar.f4314b) && kotlin.jvm.internal.f.b(this.f4315c, aVar.f4315c) && kotlin.jvm.internal.f.b(this.f4316d, aVar.f4316d) && kotlin.jvm.internal.f.b(this.f4317e, aVar.f4317e);
        }

        public final int hashCode() {
            String str = this.f4313a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f4314b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f4315c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f4316d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f4317e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f4313a;
            String str2 = this.f4314b;
            String str3 = this.f4315c;
            String str4 = this.f4316d;
            String str5 = this.f4317e;
            StringBuilder p10 = s3.b.p("ShippingDetailsRaw(country=", str, ", city=", str2, ", zip=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", addressLine1=", str4, ", addressLine2=");
            return androidx.camera.core.impl.utils.a.n(p10, str5, ")");
        }
    }

    public j(String str, String str2, Boolean bool, a aVar, Boolean bool2) {
        this.f4308a = str;
        this.f4309b = str2;
        this.f4310c = bool;
        this.f4311d = aVar;
        this.f4312e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f4308a, jVar.f4308a) && kotlin.jvm.internal.f.b(this.f4309b, jVar.f4309b) && kotlin.jvm.internal.f.b(this.f4310c, jVar.f4310c) && kotlin.jvm.internal.f.b(this.f4311d, jVar.f4311d) && kotlin.jvm.internal.f.b(this.f4312e, jVar.f4312e);
    }

    public final int hashCode() {
        String str = this.f4308a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4309b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f4310c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f4311d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool2 = this.f4312e;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4308a;
        String str2 = this.f4309b;
        Boolean bool = this.f4310c;
        a aVar = this.f4311d;
        Boolean bool2 = this.f4312e;
        StringBuilder p10 = s3.b.p("CreateNewCardRequestRaw(prettyName=", str, ", currency=", str2, ", isVirtual=");
        p10.append(bool);
        p10.append(", deliveryAddress=");
        p10.append(aVar);
        p10.append(", expressDelivery=");
        p10.append(bool2);
        p10.append(")");
        return p10.toString();
    }
}

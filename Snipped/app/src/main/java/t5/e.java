package t5;

/* compiled from: CreateNewCardRequestDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f27533a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27534b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f27535c;

    /* renamed from: d, reason: collision with root package name */
    public final a f27536d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f27537e;

    /* compiled from: CreateNewCardRequestDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f27538a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27539b;

        /* renamed from: c, reason: collision with root package name */
        public final String f27540c;

        /* renamed from: d, reason: collision with root package name */
        public final String f27541d;

        /* renamed from: e, reason: collision with root package name */
        public final String f27542e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f27538a = str;
            this.f27539b = str2;
            this.f27540c = str3;
            this.f27541d = str4;
            this.f27542e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f27538a, aVar.f27538a) && kotlin.jvm.internal.f.b(this.f27539b, aVar.f27539b) && kotlin.jvm.internal.f.b(this.f27540c, aVar.f27540c) && kotlin.jvm.internal.f.b(this.f27541d, aVar.f27541d) && kotlin.jvm.internal.f.b(this.f27542e, aVar.f27542e);
        }

        public final int hashCode() {
            String str = this.f27538a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f27539b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27540c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f27541d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f27542e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShippingDetailsDomain(countryCode=");
            sb2.append(this.f27538a);
            sb2.append(", city=");
            sb2.append(this.f27539b);
            sb2.append(", zip=");
            sb2.append(this.f27540c);
            sb2.append(", addressLine1=");
            sb2.append(this.f27541d);
            sb2.append(", addressLine2=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f27542e, ")");
        }
    }

    public e(String str, String str2, Boolean bool, a aVar) {
        Boolean bool2 = Boolean.FALSE;
        this.f27533a = str;
        this.f27534b = str2;
        this.f27535c = bool;
        this.f27536d = aVar;
        this.f27537e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f27533a, eVar.f27533a) && kotlin.jvm.internal.f.b(this.f27534b, eVar.f27534b) && kotlin.jvm.internal.f.b(this.f27535c, eVar.f27535c) && kotlin.jvm.internal.f.b(this.f27536d, eVar.f27536d) && kotlin.jvm.internal.f.b(this.f27537e, eVar.f27537e);
    }

    public final int hashCode() {
        String str = this.f27533a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27534b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f27535c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f27536d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool2 = this.f27537e;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "CreateNewCardRequestDomain(prettyName=" + this.f27533a + ", currency=" + this.f27534b + ", isVirtual=" + this.f27535c + ", deliveryAddress=" + this.f27536d + ", expressDelivery=" + this.f27537e + ")";
    }
}

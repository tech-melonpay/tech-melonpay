package i4;

import com.google.android.gms.analytics.ecommerce.ProductAction;

/* compiled from: EmailValidationRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(ProductAction.ACTION_DETAIL)
    private final a f21468a;

    /* compiled from: EmailValidationRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("result")
        private final String f21469a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("message")
        private final String f21470b;

        public final String a() {
            return this.f21469a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f21469a, aVar.f21469a) && kotlin.jvm.internal.f.b(this.f21470b, aVar.f21470b);
        }

        public final int hashCode() {
            String str = this.f21469a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f21470b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return s3.b.l("EmailValidationDetailsRaw(result=", this.f21469a, ", message=", this.f21470b, ")");
        }
    }

    public final a a() {
        return this.f21468a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f21468a, ((e) obj).f21468a);
    }

    public final int hashCode() {
        a aVar = this.f21468a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "EmailValidationRaw(detail=" + this.f21468a + ")";
    }
}

package h4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;

/* compiled from: BalanceRaw.kt */
/* loaded from: classes.dex */
public final class c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f21064b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("current")
    private final String f21065c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("reserved")
    private final String f21066d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("available")
    private final String f21067e;

    public final String b() {
        return this.f21067e;
    }

    public final String c() {
        return this.f21064b;
    }

    public final String d() {
        return this.f21065c;
    }

    public final String e() {
        return this.f21066d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f21064b, cVar.f21064b) && kotlin.jvm.internal.f.b(this.f21065c, cVar.f21065c) && kotlin.jvm.internal.f.b(this.f21066d, cVar.f21066d) && kotlin.jvm.internal.f.b(this.f21067e, cVar.f21067e);
    }

    public final int hashCode() {
        String str = this.f21064b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21065c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21066d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21067e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f21064b;
        String str2 = this.f21065c;
        return s3.b.o(s3.b.p("BalanceRaw(currency=", str, ", current=", str2, ", reserved="), this.f21066d, ", available=", this.f21067e, ")");
    }
}

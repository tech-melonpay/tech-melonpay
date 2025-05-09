package D5;

import kotlin.jvm.internal.f;

/* compiled from: SecurityLimitsInfo.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f918a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f919b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f920c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f921d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f922e;

    public b() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f918a, bVar.f918a) && f.b(this.f919b, bVar.f919b) && f.b(this.f920c, bVar.f920c) && f.b(this.f921d, bVar.f921d) && f.b(this.f922e, bVar.f922e);
    }

    public final int hashCode() {
        Boolean bool = this.f918a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f919b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f920c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f921d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f922e;
        return hashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        return "SecurityLimitsInfo(contactlessEnabled=" + this.f918a + ", withdrawalEnabled=" + this.f919b + ", internetPurchaseEnabled=" + this.f920c + ", overallLimitsEnabled=" + this.f921d + ", allTimeLimitsEnabled=" + this.f922e + ")";
    }

    public b(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.f918a = bool;
        this.f919b = bool2;
        this.f920c = bool3;
        this.f921d = bool4;
        this.f922e = bool5;
    }
}

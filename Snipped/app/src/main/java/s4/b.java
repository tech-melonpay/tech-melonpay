package s4;

import kotlin.jvm.internal.f;

/* compiled from: SecurityInfoResponseRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("contactless_enabled")
    private Boolean f26529a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("withdrawal_enabled")
    private Boolean f26530b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("internet_purchase_enabled")
    private Boolean f26531c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("overall_limits_enabled")
    private Boolean f26532d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("all_time_limits_enabled")
    private Boolean f26533e;

    public b() {
        this(0);
    }

    public final Boolean a() {
        return this.f26533e;
    }

    public final Boolean b() {
        return this.f26529a;
    }

    public final Boolean c() {
        return this.f26531c;
    }

    public final Boolean d() {
        return this.f26532d;
    }

    public final Boolean e() {
        return this.f26530b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f26529a, bVar.f26529a) && f.b(this.f26530b, bVar.f26530b) && f.b(this.f26531c, bVar.f26531c) && f.b(this.f26532d, bVar.f26532d) && f.b(this.f26533e, bVar.f26533e);
    }

    public final int hashCode() {
        Boolean bool = this.f26529a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f26530b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f26531c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f26532d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f26533e;
        return hashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        return "Security(contactlessEnabled=" + this.f26529a + ", withdrawalEnabled=" + this.f26530b + ", internetPurchaseEnabled=" + this.f26531c + ", overallLimitsEnabled=" + this.f26532d + ", allTimeLimitsEnabled=" + this.f26533e + ")";
    }

    public b(int i) {
        this.f26529a = null;
        this.f26530b = null;
        this.f26531c = null;
        this.f26532d = null;
        this.f26533e = null;
    }
}

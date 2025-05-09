package z5;

import kotlin.jvm.internal.f;

/* compiled from: LimitRestrictionRequestDomain.kt */
/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f31279a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f31280b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f31281c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f31282d;

    public C1645a() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1645a)) {
            return false;
        }
        C1645a c1645a = (C1645a) obj;
        return f.b(this.f31279a, c1645a.f31279a) && f.b(this.f31280b, c1645a.f31280b) && f.b(this.f31281c, c1645a.f31281c) && f.b(this.f31282d, c1645a.f31282d);
    }

    public final int hashCode() {
        Boolean bool = this.f31279a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f31280b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f31281c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f31282d;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "LimitRestrictionRequestDomain(allTimeLimitsEnabled=" + this.f31279a + ", contactlessEnabled=" + this.f31280b + ", internetPurchaseEnabled=" + this.f31281c + ", withdrawalEnabled=" + this.f31282d + ")";
    }

    public C1645a(Boolean bool, Boolean bool2, int i) {
        bool = (i & 2) != 0 ? null : bool;
        bool2 = (i & 4) != 0 ? null : bool2;
        this.f31279a = null;
        this.f31280b = bool;
        this.f31281c = bool2;
        this.f31282d = null;
    }
}

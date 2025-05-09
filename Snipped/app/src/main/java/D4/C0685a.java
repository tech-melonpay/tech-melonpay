package d4;

import kotlin.jvm.internal.f;

/* compiled from: LimitRestrictionRequestRaw.kt */
/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("all_time_limits_enabled")
    private Boolean f20417a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("contactless_enabled")
    private Boolean f20418b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("internet_purchase_enabled")
    private Boolean f20419c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("withdrawal_enabled")
    private Boolean f20420d;

    public C0685a() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0685a)) {
            return false;
        }
        C0685a c0685a = (C0685a) obj;
        return f.b(this.f20417a, c0685a.f20417a) && f.b(this.f20418b, c0685a.f20418b) && f.b(this.f20419c, c0685a.f20419c) && f.b(this.f20420d, c0685a.f20420d);
    }

    public final int hashCode() {
        Boolean bool = this.f20417a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f20418b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f20419c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f20420d;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "LimitRestrictionRequestRaw(allTimeLimitsEnabled=" + this.f20417a + ", contactlessEnabled=" + this.f20418b + ", internetPurchaseEnabled=" + this.f20419c + ", withdrawalEnabled=" + this.f20420d + ")";
    }

    public C0685a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f20417a = bool;
        this.f20418b = bool2;
        this.f20419c = bool3;
        this.f20420d = bool4;
    }
}

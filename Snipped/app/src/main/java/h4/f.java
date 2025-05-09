package h4;

import e4.C0715a;

/* compiled from: DailyLimitRaw.kt */
/* loaded from: classes.dex */
public final class f extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("limit_remaining")
    private final double f21082b;

    public final double b() {
        return this.f21082b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Double.compare(this.f21082b, ((f) obj).f21082b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21082b);
    }

    public final String toString() {
        return "DailyLimitRaw(limitRemaining=" + this.f21082b + ")";
    }
}

package com.luminary.business.domain.entity.cards;

import java.io.Serializable;

/* compiled from: DailyLimitDomain.kt */
/* loaded from: classes.dex */
public final class DailyLimitDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final double f10774a;

    public DailyLimitDomain(double d10) {
        this.f10774a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DailyLimitDomain) && Double.compare(this.f10774a, ((DailyLimitDomain) obj).f10774a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10774a);
    }

    public final String toString() {
        return "DailyLimitDomain(limitRemaining=" + this.f10774a + ")";
    }
}

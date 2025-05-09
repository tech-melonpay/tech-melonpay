package com.luminary.business.domain.entity.cards;

import C.v;
import java.io.Serializable;

/* compiled from: BankTopUpRequestDomain.kt */
/* loaded from: classes.dex */
public final class BankTopUpRequestDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f10745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10747c;

    /* renamed from: d, reason: collision with root package name */
    public final double f10748d;

    public BankTopUpRequestDomain(int i, int i9, int i10, double d10) {
        this.f10745a = i;
        this.f10746b = i9;
        this.f10747c = i10;
        this.f10748d = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankTopUpRequestDomain)) {
            return false;
        }
        BankTopUpRequestDomain bankTopUpRequestDomain = (BankTopUpRequestDomain) obj;
        return this.f10745a == bankTopUpRequestDomain.f10745a && this.f10746b == bankTopUpRequestDomain.f10746b && this.f10747c == bankTopUpRequestDomain.f10747c && Double.compare(this.f10748d, bankTopUpRequestDomain.f10748d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10748d) + v.b(this.f10747c, v.b(this.f10746b, Integer.hashCode(this.f10745a) * 31, 31), 31);
    }

    public final String toString() {
        return "BankTopUpRequestDomain(clientId=" + this.f10745a + ", fromBankAccountId=" + this.f10746b + ", toCardAccountId=" + this.f10747c + ", amount=" + this.f10748d + ")";
    }
}

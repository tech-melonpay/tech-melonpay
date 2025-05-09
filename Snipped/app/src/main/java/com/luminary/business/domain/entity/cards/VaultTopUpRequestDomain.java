package com.luminary.business.domain.entity.cards;

import C.v;
import java.io.Serializable;

/* compiled from: VaultTopUpRequestDomain.kt */
/* loaded from: classes.dex */
public final class VaultTopUpRequestDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f10800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10802c;

    /* renamed from: d, reason: collision with root package name */
    public final double f10803d;

    public VaultTopUpRequestDomain(int i, int i9, int i10, double d10) {
        this.f10800a = i;
        this.f10801b = i9;
        this.f10802c = i10;
        this.f10803d = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultTopUpRequestDomain)) {
            return false;
        }
        VaultTopUpRequestDomain vaultTopUpRequestDomain = (VaultTopUpRequestDomain) obj;
        return this.f10800a == vaultTopUpRequestDomain.f10800a && this.f10801b == vaultTopUpRequestDomain.f10801b && this.f10802c == vaultTopUpRequestDomain.f10802c && Double.compare(this.f10803d, vaultTopUpRequestDomain.f10803d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10803d) + v.b(this.f10802c, v.b(this.f10801b, Integer.hashCode(this.f10800a) * 31, 31), 31);
    }

    public final String toString() {
        return "VaultTopUpRequestDomain(clientId=" + this.f10800a + ", fromCardAccountId=" + this.f10801b + ", toCardAccountId=" + this.f10802c + ", amount=" + this.f10803d + ")";
    }
}

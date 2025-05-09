package com.luminary.business.domain.entity.cards;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: TopUpCommissionDomain.kt */
/* loaded from: classes.dex */
public final class TopUpCommissionDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final double f10775a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10776b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10777c;

    public TopUpCommissionDomain(double d10, String str, String str2) {
        this.f10775a = d10;
        this.f10776b = str;
        this.f10777c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopUpCommissionDomain)) {
            return false;
        }
        TopUpCommissionDomain topUpCommissionDomain = (TopUpCommissionDomain) obj;
        return Double.compare(this.f10775a, topUpCommissionDomain.f10775a) == 0 && f.b(this.f10776b, topUpCommissionDomain.f10776b) && f.b(this.f10777c, topUpCommissionDomain.f10777c);
    }

    public final int hashCode() {
        int c2 = v.c(Double.hashCode(this.f10775a) * 31, 31, this.f10776b);
        String str = this.f10777c;
        return c2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TopUpCommissionDomain(commissionAmount=");
        sb2.append(this.f10775a);
        sb2.append(", commisionCurrency=");
        sb2.append(this.f10776b);
        sb2.append(", type=");
        return a.n(sb2, this.f10777c, ")");
    }
}

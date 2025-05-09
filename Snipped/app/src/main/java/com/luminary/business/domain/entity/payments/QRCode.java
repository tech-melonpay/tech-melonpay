package com.luminary.business.domain.entity.payments;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: PaymentDomain.kt */
/* loaded from: classes.dex */
public final class QRCode implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11131c;

    public QRCode(String str, Long l10, Integer num) {
        this.f11129a = str;
        this.f11130b = l10;
        this.f11131c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCode)) {
            return false;
        }
        QRCode qRCode = (QRCode) obj;
        return f.b(this.f11129a, qRCode.f11129a) && f.b(this.f11130b, qRCode.f11130b) && f.b(this.f11131c, qRCode.f11131c);
    }

    public final int hashCode() {
        String str = this.f11129a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f11130b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.f11131c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "QRCode(displayPin=" + this.f11129a + ", reference=" + this.f11130b + ", expiresIn=" + this.f11131c + ")";
    }
}

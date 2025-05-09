package com.luminary.business.domain.entity.payments;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: PaymentDomain.kt */
/* loaded from: classes.dex */
public final class Confirmation implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11094a;

    /* renamed from: b, reason: collision with root package name */
    public final QRCode f11095b;

    public Confirmation(String str, QRCode qRCode) {
        this.f11094a = str;
        this.f11095b = qRCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Confirmation)) {
            return false;
        }
        Confirmation confirmation = (Confirmation) obj;
        return f.b(this.f11094a, confirmation.f11094a) && f.b(this.f11095b, confirmation.f11095b);
    }

    public final int hashCode() {
        String str = this.f11094a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        QRCode qRCode = this.f11095b;
        return hashCode + (qRCode != null ? qRCode.hashCode() : 0);
    }

    public final String toString() {
        return "Confirmation(method=" + this.f11094a + ", qrcode=" + this.f11095b + ")";
    }
}

package com.luminary.business.domain.entity.templates;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: GetTemplatesDomain.kt */
/* loaded from: classes.dex */
public final class GetTemplatesDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Long f11142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11143b;

    /* renamed from: c, reason: collision with root package name */
    public final PaymentMethod f11144c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetTemplatesDomain.kt */
    public static final class PaymentMethod {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethod f11145a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PaymentMethod[] f11146b;

        /* JADX INFO: Fake field, exist only in values array */
        PaymentMethod EF0;

        static {
            PaymentMethod paymentMethod = new PaymentMethod("INTERNAL", 0);
            PaymentMethod paymentMethod2 = new PaymentMethod("SEPA", 1);
            PaymentMethod paymentMethod3 = new PaymentMethod("FASTERPAYMENT", 2);
            PaymentMethod paymentMethod4 = new PaymentMethod("SWIFT", 3);
            PaymentMethod paymentMethod5 = new PaymentMethod("FX_ORDER", 4);
            f11145a = paymentMethod5;
            f11146b = new PaymentMethod[]{paymentMethod, paymentMethod2, paymentMethod3, paymentMethod4, paymentMethod5, new PaymentMethod("FX_EXECUTION", 5), new PaymentMethod("COMISSION", 6), new PaymentMethod("FEE", 7)};
        }

        public PaymentMethod() {
            throw null;
        }

        public static PaymentMethod valueOf(String str) {
            return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
        }

        public static PaymentMethod[] values() {
            return (PaymentMethod[]) f11146b.clone();
        }
    }

    public GetTemplatesDomain(Long l10, String str, PaymentMethod paymentMethod) {
        this.f11142a = l10;
        this.f11143b = str;
        this.f11144c = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTemplatesDomain)) {
            return false;
        }
        GetTemplatesDomain getTemplatesDomain = (GetTemplatesDomain) obj;
        return f.b(this.f11142a, getTemplatesDomain.f11142a) && f.b(this.f11143b, getTemplatesDomain.f11143b) && this.f11144c == getTemplatesDomain.f11144c;
    }

    public final int hashCode() {
        Long l10 = this.f11142a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f11143b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethod paymentMethod = this.f11144c;
        return hashCode2 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
    }

    public final String toString() {
        return "GetTemplatesDomain(clientId=" + this.f11142a + ", currency=" + this.f11143b + ", paymentMethod=" + this.f11144c + ")";
    }
}

package com.luminary.business.domain.entity.transaction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentType.kt */
/* loaded from: classes.dex */
public final class PaymentType {

    /* renamed from: a, reason: collision with root package name */
    public static final PaymentType f11147a;

    /* renamed from: b, reason: collision with root package name */
    public static final PaymentType f11148b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentType f11149c;

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentType f11150d;

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentType f11151e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PaymentType[] f11152f;

    static {
        PaymentType paymentType = new PaymentType("INTERNAL", 0);
        f11147a = paymentType;
        PaymentType paymentType2 = new PaymentType("FASTERPAYMENT", 1);
        f11148b = paymentType2;
        PaymentType paymentType3 = new PaymentType("SEPA", 2);
        f11149c = paymentType3;
        PaymentType paymentType4 = new PaymentType("SWIFT", 3);
        f11150d = paymentType4;
        PaymentType paymentType5 = new PaymentType("FX_ORDER", 4);
        PaymentType paymentType6 = new PaymentType("FX_EXECUTION", 5);
        PaymentType paymentType7 = new PaymentType("COMISSION", 6);
        PaymentType paymentType8 = new PaymentType("FEE", 7);
        PaymentType paymentType9 = new PaymentType("TO_BANK_ACCOUNT", 8);
        f11151e = paymentType9;
        f11152f = new PaymentType[]{paymentType, paymentType2, paymentType3, paymentType4, paymentType5, paymentType6, paymentType7, paymentType8, paymentType9};
    }

    public PaymentType() {
        throw null;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) f11152f.clone();
    }
}

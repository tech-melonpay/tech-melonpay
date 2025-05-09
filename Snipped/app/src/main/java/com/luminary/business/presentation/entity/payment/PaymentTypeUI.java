package com.luminary.business.presentation.entity.payment;

import C.v;

/* compiled from: PaymentTypeUI.kt */
/* loaded from: classes2.dex */
public final class PaymentTypeUI {

    /* renamed from: a, reason: collision with root package name */
    public final int f11322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11324c;

    /* renamed from: d, reason: collision with root package name */
    public final Type f11325d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentTypeUI.kt */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f11326a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f11327b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f11328c;

        static {
            Type type = new Type("BANK", 0);
            f11326a = type;
            Type type2 = new Type("LUMINARY", 1);
            f11327b = type2;
            f11328c = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f11328c.clone();
        }
    }

    public PaymentTypeUI(int i, int i9, int i10, Type type) {
        this.f11322a = i;
        this.f11323b = i9;
        this.f11324c = i10;
        this.f11325d = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTypeUI)) {
            return false;
        }
        PaymentTypeUI paymentTypeUI = (PaymentTypeUI) obj;
        return this.f11322a == paymentTypeUI.f11322a && this.f11323b == paymentTypeUI.f11323b && this.f11324c == paymentTypeUI.f11324c && this.f11325d == paymentTypeUI.f11325d;
    }

    public final int hashCode() {
        return this.f11325d.hashCode() + v.b(this.f11324c, v.b(this.f11323b, Integer.hashCode(this.f11322a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaymentTypeUI(name=" + this.f11322a + ", description=" + this.f11323b + ", iconRes=" + this.f11324c + ", type=" + this.f11325d + ")";
    }
}

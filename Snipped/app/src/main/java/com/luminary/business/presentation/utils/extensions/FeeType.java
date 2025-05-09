package com.luminary.business.presentation.utils.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PriceListDomainExt.kt */
/* loaded from: classes2.dex */
public final class FeeType {

    /* renamed from: a, reason: collision with root package name */
    public static final FeeType f13316a;

    /* renamed from: b, reason: collision with root package name */
    public static final FeeType f13317b;

    /* renamed from: c, reason: collision with root package name */
    public static final FeeType f13318c;

    /* renamed from: d, reason: collision with root package name */
    public static final FeeType f13319d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FeeType[] f13320e;

    static {
        FeeType feeType = new FeeType("GBP", 0);
        f13316a = feeType;
        FeeType feeType2 = new FeeType("EUR", 1);
        f13317b = feeType2;
        FeeType feeType3 = new FeeType("BANK", 2);
        f13318c = feeType3;
        FeeType feeType4 = new FeeType("TRANSFER", 3);
        f13319d = feeType4;
        f13320e = new FeeType[]{feeType, feeType2, feeType3, feeType4};
    }

    public FeeType() {
        throw null;
    }

    public static FeeType valueOf(String str) {
        return (FeeType) Enum.valueOf(FeeType.class, str);
    }

    public static FeeType[] values() {
        return (FeeType[]) f13320e.clone();
    }
}

package com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoExchangeFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoExchangeFragment$Companion$DirectionType {

    /* renamed from: a, reason: collision with root package name */
    public static final CryptoExchangeFragment$Companion$DirectionType f12050a;

    /* renamed from: b, reason: collision with root package name */
    public static final CryptoExchangeFragment$Companion$DirectionType f12051b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CryptoExchangeFragment$Companion$DirectionType[] f12052c;

    static {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = new CryptoExchangeFragment$Companion$DirectionType("SELL", 0);
        f12050a = cryptoExchangeFragment$Companion$DirectionType;
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = new CryptoExchangeFragment$Companion$DirectionType("BUY", 1);
        f12051b = cryptoExchangeFragment$Companion$DirectionType2;
        f12052c = new CryptoExchangeFragment$Companion$DirectionType[]{cryptoExchangeFragment$Companion$DirectionType, cryptoExchangeFragment$Companion$DirectionType2};
    }

    public CryptoExchangeFragment$Companion$DirectionType() {
        throw null;
    }

    public static CryptoExchangeFragment$Companion$DirectionType valueOf(String str) {
        return (CryptoExchangeFragment$Companion$DirectionType) Enum.valueOf(CryptoExchangeFragment$Companion$DirectionType.class, str);
    }

    public static CryptoExchangeFragment$Companion$DirectionType[] values() {
        return (CryptoExchangeFragment$Companion$DirectionType[]) f12052c.clone();
    }
}

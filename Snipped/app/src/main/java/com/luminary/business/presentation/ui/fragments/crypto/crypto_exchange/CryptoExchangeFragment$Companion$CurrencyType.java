package com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoExchangeFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoExchangeFragment$Companion$CurrencyType {

    /* renamed from: a, reason: collision with root package name */
    public static final CryptoExchangeFragment$Companion$CurrencyType f12047a;

    /* renamed from: b, reason: collision with root package name */
    public static final CryptoExchangeFragment$Companion$CurrencyType f12048b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CryptoExchangeFragment$Companion$CurrencyType[] f12049c;

    static {
        CryptoExchangeFragment$Companion$CurrencyType cryptoExchangeFragment$Companion$CurrencyType = new CryptoExchangeFragment$Companion$CurrencyType("FIAT", 0);
        f12047a = cryptoExchangeFragment$Companion$CurrencyType;
        CryptoExchangeFragment$Companion$CurrencyType cryptoExchangeFragment$Companion$CurrencyType2 = new CryptoExchangeFragment$Companion$CurrencyType("CRYPTO", 1);
        f12048b = cryptoExchangeFragment$Companion$CurrencyType2;
        f12049c = new CryptoExchangeFragment$Companion$CurrencyType[]{cryptoExchangeFragment$Companion$CurrencyType, cryptoExchangeFragment$Companion$CurrencyType2};
    }

    public CryptoExchangeFragment$Companion$CurrencyType() {
        throw null;
    }

    public static CryptoExchangeFragment$Companion$CurrencyType valueOf(String str) {
        return (CryptoExchangeFragment$Companion$CurrencyType) Enum.valueOf(CryptoExchangeFragment$Companion$CurrencyType.class, str);
    }

    public static CryptoExchangeFragment$Companion$CurrencyType[] values() {
        return (CryptoExchangeFragment$Companion$CurrencyType[]) f12049c.clone();
    }
}

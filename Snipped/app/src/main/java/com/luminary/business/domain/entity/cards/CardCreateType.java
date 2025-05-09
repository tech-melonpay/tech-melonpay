package com.luminary.business.domain.entity.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardCreateType.kt */
/* loaded from: classes.dex */
public final class CardCreateType {

    /* renamed from: a, reason: collision with root package name */
    public static final CardCreateType f10749a;

    /* renamed from: b, reason: collision with root package name */
    public static final CardCreateType f10750b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CardCreateType[] f10751c;

    static {
        CardCreateType cardCreateType = new CardCreateType("VIRTUAL_CARD_AND_VAULT", 0);
        f10749a = cardCreateType;
        CardCreateType cardCreateType2 = new CardCreateType("VIRTUAL_CARD_WITHOUT_VAULT", 1);
        f10750b = cardCreateType2;
        f10751c = new CardCreateType[]{cardCreateType, cardCreateType2, new CardCreateType("VIRTUAL_CARD_FROM_DETAIL_VAULT", 2)};
    }

    public CardCreateType() {
        throw null;
    }

    public static CardCreateType valueOf(String str) {
        return (CardCreateType) Enum.valueOf(CardCreateType.class, str);
    }

    public static CardCreateType[] values() {
        return (CardCreateType[]) f10751c.clone();
    }
}

package com.luminary.business.presentation.ui.fragments.statements.domain;

import W9.a;
import com.luminary.mobile.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatementsType.kt */
/* loaded from: classes2.dex */
public final class StatementsType {

    /* renamed from: b, reason: collision with root package name */
    public static final StatementsType f13086b;

    /* renamed from: c, reason: collision with root package name */
    public static final StatementsType f13087c;

    /* renamed from: d, reason: collision with root package name */
    public static final StatementsType f13088d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StatementsType[] f13089e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f13090f;

    /* renamed from: a, reason: collision with root package name */
    public final int f13091a;

    static {
        StatementsType statementsType = new StatementsType("ACCOUNTS", 0, R.string.account);
        f13086b = statementsType;
        StatementsType statementsType2 = new StatementsType("CARD_VAULTS", 1, R.string.card_vault);
        f13087c = statementsType2;
        StatementsType statementsType3 = new StatementsType("CARDS", 2, R.string.card);
        f13088d = statementsType3;
        StatementsType[] statementsTypeArr = {statementsType, statementsType2, statementsType3};
        f13089e = statementsTypeArr;
        f13090f = kotlin.enums.a.a(statementsTypeArr);
    }

    public StatementsType(String str, int i, int i9) {
        this.f13091a = i9;
    }

    public static StatementsType valueOf(String str) {
        return (StatementsType) Enum.valueOf(StatementsType.class, str);
    }

    public static StatementsType[] values() {
        return (StatementsType[]) f13089e.clone();
    }
}

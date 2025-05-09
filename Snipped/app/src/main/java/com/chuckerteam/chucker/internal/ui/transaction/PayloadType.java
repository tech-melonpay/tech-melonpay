package com.chuckerteam.chucker.internal.ui.transaction;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PayloadType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;", "", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class PayloadType {

    /* renamed from: a, reason: collision with root package name */
    public static final PayloadType f8711a;

    /* renamed from: b, reason: collision with root package name */
    public static final PayloadType f8712b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ PayloadType[] f8713c;

    static {
        PayloadType payloadType = new PayloadType("REQUEST", 0);
        f8711a = payloadType;
        PayloadType payloadType2 = new PayloadType("RESPONSE", 1);
        f8712b = payloadType2;
        f8713c = new PayloadType[]{payloadType, payloadType2};
    }

    public PayloadType() {
        throw null;
    }

    public static PayloadType valueOf(String str) {
        return (PayloadType) Enum.valueOf(PayloadType.class, str);
    }

    public static PayloadType[] values() {
        return (PayloadType[]) f8713c.clone();
    }
}

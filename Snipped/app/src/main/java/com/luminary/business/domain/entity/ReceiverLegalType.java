package com.luminary.business.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReceiverLegalType.kt */
/* loaded from: classes.dex */
public final class ReceiverLegalType {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ReceiverLegalType[] f10693a = {new ReceiverLegalType("CORPORATE", 0), new ReceiverLegalType("INDIVIDUAL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ReceiverLegalType EF5;

    public ReceiverLegalType() {
        throw null;
    }

    public static ReceiverLegalType valueOf(String str) {
        return (ReceiverLegalType) Enum.valueOf(ReceiverLegalType.class, str);
    }

    public static ReceiverLegalType[] values() {
        return (ReceiverLegalType[]) f10693a.clone();
    }
}

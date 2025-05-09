package com.luminary.business.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseDomain.kt */
/* loaded from: classes.dex */
public final class REQUESTS {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ REQUESTS[] f10692a = {new REQUESTS("NONE", 0), new REQUESTS("FIRST", 1), new REQUESTS("SECOND", 2), new REQUESTS("THIRD", 3), new REQUESTS("FOURTH", 4), new REQUESTS("FIFTH", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    REQUESTS EF5;

    public REQUESTS() {
        throw null;
    }

    public static REQUESTS valueOf(String str) {
        return (REQUESTS) Enum.valueOf(REQUESTS.class, str);
    }

    public static REQUESTS[] values() {
        return (REQUESTS[]) f10692a.clone();
    }
}

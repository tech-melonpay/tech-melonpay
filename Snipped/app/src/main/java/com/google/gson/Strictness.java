package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Strictness {

    /* renamed from: a, reason: collision with root package name */
    public static final Strictness f10313a;

    /* renamed from: b, reason: collision with root package name */
    public static final Strictness f10314b;

    /* renamed from: c, reason: collision with root package name */
    public static final Strictness f10315c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Strictness[] f10316d;

    static {
        Strictness strictness = new Strictness("LENIENT", 0);
        f10313a = strictness;
        Strictness strictness2 = new Strictness("LEGACY_STRICT", 1);
        f10314b = strictness2;
        Strictness strictness3 = new Strictness("STRICT", 2);
        f10315c = strictness3;
        f10316d = new Strictness[]{strictness, strictness2, strictness3};
    }

    public Strictness() {
        throw null;
    }

    public static Strictness valueOf(String str) {
        return (Strictness) Enum.valueOf(Strictness.class, str);
    }

    public static Strictness[] values() {
        return (Strictness[]) f10316d.clone();
    }
}

package com.github.barteksc.pdfviewer.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FitPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final FitPolicy f8876a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FitPolicy[] f8877b;

    static {
        FitPolicy fitPolicy = new FitPolicy("WIDTH", 0);
        f8876a = fitPolicy;
        f8877b = new FitPolicy[]{fitPolicy, new FitPolicy("HEIGHT", 1), new FitPolicy("BOTH", 2)};
    }

    public FitPolicy() {
        throw null;
    }

    public static FitPolicy valueOf(String str) {
        return (FitPolicy) Enum.valueOf(FitPolicy.class, str);
    }

    public static FitPolicy[] values() {
        return (FitPolicy[]) f8877b.clone();
    }
}

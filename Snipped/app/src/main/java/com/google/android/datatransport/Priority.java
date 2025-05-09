package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Priority {

    /* renamed from: a, reason: collision with root package name */
    public static final Priority f8901a;

    /* renamed from: b, reason: collision with root package name */
    public static final Priority f8902b;

    /* renamed from: c, reason: collision with root package name */
    public static final Priority f8903c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f8904d;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        f8901a = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        f8902b = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        f8903c = priority3;
        f8904d = new Priority[]{priority, priority2, priority3};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f8904d.clone();
    }
}

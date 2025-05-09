package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
/* loaded from: classes2.dex */
public final class LazyThreadSafetyMode {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyThreadSafetyMode f23085a;

    /* renamed from: b, reason: collision with root package name */
    public static final LazyThreadSafetyMode f23086b;

    /* renamed from: c, reason: collision with root package name */
    public static final LazyThreadSafetyMode f23087c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LazyThreadSafetyMode[] f23088d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        f23085a = lazyThreadSafetyMode;
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        f23086b = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        f23087c = lazyThreadSafetyMode3;
        f23088d = new LazyThreadSafetyMode[]{lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
    }

    public LazyThreadSafetyMode() {
        throw null;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f23088d.clone();
    }
}

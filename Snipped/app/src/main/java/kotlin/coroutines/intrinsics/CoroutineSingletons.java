package kotlin.coroutines.intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
/* loaded from: classes2.dex */
public final class CoroutineSingletons {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineSingletons f23158a;

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineSingletons f23159b;

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineSingletons f23160c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CoroutineSingletons[] f23161d;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        f23158a = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        f23159b = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        f23160c = coroutineSingletons3;
        f23161d = new CoroutineSingletons[]{coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
    }

    public CoroutineSingletons() {
        throw null;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f23161d.clone();
    }
}

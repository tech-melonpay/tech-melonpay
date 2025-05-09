package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
/* loaded from: classes2.dex */
public final class KVariance {

    /* renamed from: a, reason: collision with root package name */
    public static final KVariance f23196a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KVariance[] f23197b;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        f23196a = kVariance;
        f23197b = new KVariance[]{kVariance, new KVariance("IN", 1), new KVariance("OUT", 2)};
    }

    public KVariance() {
        throw null;
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f23197b.clone();
    }
}

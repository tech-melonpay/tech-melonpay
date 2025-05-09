package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final BackoffPolicy f8067a;

    /* renamed from: b, reason: collision with root package name */
    public static final BackoffPolicy f8068b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BackoffPolicy[] f8069c;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        f8067a = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        f8068b = backoffPolicy2;
        f8069c = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public BackoffPolicy() {
        throw null;
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f8069c.clone();
    }
}

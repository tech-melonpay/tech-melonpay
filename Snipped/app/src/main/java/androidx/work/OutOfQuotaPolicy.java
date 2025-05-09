package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OutOfQuotaPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final OutOfQuotaPolicy f8099a;

    /* renamed from: b, reason: collision with root package name */
    public static final OutOfQuotaPolicy f8100b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OutOfQuotaPolicy[] f8101c;

    static {
        OutOfQuotaPolicy outOfQuotaPolicy = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f8099a = outOfQuotaPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        f8100b = outOfQuotaPolicy2;
        f8101c = new OutOfQuotaPolicy[]{outOfQuotaPolicy, outOfQuotaPolicy2};
    }

    public OutOfQuotaPolicy() {
        throw null;
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f8101c.clone();
    }
}

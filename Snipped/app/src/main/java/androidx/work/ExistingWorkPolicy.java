package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ExistingWorkPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ExistingWorkPolicy f8080a;

    /* renamed from: b, reason: collision with root package name */
    public static final ExistingWorkPolicy f8081b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExistingWorkPolicy f8082c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ExistingWorkPolicy[] f8083d;

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF0;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        f8080a = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        f8081b = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        f8082c = existingWorkPolicy4;
        f8083d = new ExistingWorkPolicy[]{existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
    }

    public ExistingWorkPolicy() {
        throw null;
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) f8083d.clone();
    }
}

package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class DirectExecutor implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final DirectExecutor f8243a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f8244b;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        f8243a = directExecutor;
        f8244b = new DirectExecutor[]{directExecutor};
    }

    public DirectExecutor() {
        throw null;
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f8244b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

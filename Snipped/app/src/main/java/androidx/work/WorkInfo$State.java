package androidx.work;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WorkInfo$State {

    /* renamed from: a, reason: collision with root package name */
    public static final WorkInfo$State f8102a;

    /* renamed from: b, reason: collision with root package name */
    public static final WorkInfo$State f8103b;

    /* renamed from: c, reason: collision with root package name */
    public static final WorkInfo$State f8104c;

    /* renamed from: d, reason: collision with root package name */
    public static final WorkInfo$State f8105d;

    /* renamed from: e, reason: collision with root package name */
    public static final WorkInfo$State f8106e;

    /* renamed from: f, reason: collision with root package name */
    public static final WorkInfo$State f8107f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ WorkInfo$State[] f8108g;

    static {
        WorkInfo$State workInfo$State = new WorkInfo$State("ENQUEUED", 0);
        f8102a = workInfo$State;
        WorkInfo$State workInfo$State2 = new WorkInfo$State(DebugCoroutineInfoImplKt.RUNNING, 1);
        f8103b = workInfo$State2;
        WorkInfo$State workInfo$State3 = new WorkInfo$State("SUCCEEDED", 2);
        f8104c = workInfo$State3;
        WorkInfo$State workInfo$State4 = new WorkInfo$State("FAILED", 3);
        f8105d = workInfo$State4;
        WorkInfo$State workInfo$State5 = new WorkInfo$State("BLOCKED", 4);
        f8106e = workInfo$State5;
        WorkInfo$State workInfo$State6 = new WorkInfo$State("CANCELLED", 5);
        f8107f = workInfo$State6;
        f8108g = new WorkInfo$State[]{workInfo$State, workInfo$State2, workInfo$State3, workInfo$State4, workInfo$State5, workInfo$State6};
    }

    public WorkInfo$State() {
        throw null;
    }

    public static WorkInfo$State valueOf(String str) {
        return (WorkInfo$State) Enum.valueOf(WorkInfo$State.class, str);
    }

    public static WorkInfo$State[] values() {
        return (WorkInfo$State[]) f8108g.clone();
    }

    public final boolean a() {
        return this == f8104c || this == f8105d || this == f8107f;
    }
}

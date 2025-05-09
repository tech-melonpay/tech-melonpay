package V9;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class b implements T9.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3768a = new b();

    @Override // T9.a
    public final kotlin.coroutines.d getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // T9.a
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

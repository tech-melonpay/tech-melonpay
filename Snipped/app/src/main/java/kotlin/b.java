package kotlin;

import kotlin.Result;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final Result.Failure a(Throwable th) {
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f23092a;
        }
    }
}

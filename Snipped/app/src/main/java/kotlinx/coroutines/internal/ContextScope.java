package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "<init>", "(Lkotlin/coroutines/d;)V", "", "toString", "()Ljava/lang/String;", "coroutineContext", "Lkotlin/coroutines/d;", "getCoroutineContext", "()Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ContextScope implements CoroutineScope {
    private final d coroutineContext;

    public ContextScope(d dVar) {
        this.coroutineContext = dVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public d getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}

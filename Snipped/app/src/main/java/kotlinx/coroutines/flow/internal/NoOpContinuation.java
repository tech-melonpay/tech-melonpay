package kotlinx.coroutines.flow.internal;

import T9.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/flow/internal/NoOpContinuation;", "LT9/a;", "", "<init>", "()V", "Lkotlin/Result;", "result", "LO9/p;", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/d;", "context", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NoOpContinuation implements a<Object> {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final d context = EmptyCoroutineContext.f23155a;

    private NoOpContinuation() {
    }

    @Override // T9.a
    public d getContext() {
        return context;
    }

    @Override // T9.a
    public void resumeWith(Object result) {
    }
}

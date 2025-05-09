package kotlinx.coroutines.flow.internal;

import T9.a;
import V9.c;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/internal/StackFrameContinuation;", "T", "LT9/a;", "LV9/c;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lkotlin/coroutines/d;", "context", "<init>", "(LT9/a;Lkotlin/coroutines/d;)V", "Lkotlin/Result;", "result", "LO9/p;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "LT9/a;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "getCallerFrame", "()LV9/c;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class StackFrameContinuation<T> implements a<T>, c {
    private final d context;
    private final a<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(a<? super T> aVar, d dVar) {
        this.uCont = aVar;
        this.context = dVar;
    }

    @Override // V9.c
    public c getCallerFrame() {
        a<T> aVar = this.uCont;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    @Override // T9.a
    public d getContext() {
        return this.context;
    }

    @Override // V9.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // T9.a
    public void resumeWith(Object result) {
        this.uCont.resumeWith(result);
    }
}

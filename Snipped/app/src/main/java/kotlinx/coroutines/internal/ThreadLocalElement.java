package kotlinx.coroutines.internal;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lkotlinx/coroutines/ThreadContextElement;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lkotlin/coroutines/d;", "context", "updateThreadContext", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "oldState", "LO9/p;", "restoreThreadContext", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "Lkotlin/coroutines/d$c;", "key", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "Lkotlin/coroutines/d$b;", "E", "get", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final d.c<?> key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t3, ThreadLocal<T> threadLocal) {
        this.value = t3;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    public <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r8, interfaceC0650p);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> key) {
        if (f.b(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    public d minusKey(d.c<?> key) {
        return f.b(getKey(), key) ? EmptyCoroutineContext.f23155a : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    public d plus(d dVar) {
        return ThreadContextElement.DefaultImpls.plus(this, dVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(d context, T oldState) {
        this.threadLocal.set(oldState);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(d context) {
        T t3 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t3;
    }
}

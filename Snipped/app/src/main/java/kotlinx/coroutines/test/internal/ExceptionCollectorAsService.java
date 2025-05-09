package kotlinx.coroutines.test.internal;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: ExceptionCollector.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u000f\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0005¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/test/internal/ExceptionCollectorAsService;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "Lkotlin/coroutines/d;", "context", "", "exception", "LO9/p;", "handleException", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/d$c;", "key", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "plus", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ExceptionCollectorAsService implements CoroutineExceptionHandler {
    private final /* synthetic */ ExceptionCollector $$delegate_0 = ExceptionCollector.INSTANCE;

    public boolean equals(Object other) {
        return (other instanceof ExceptionCollectorAsService) || (other instanceof ExceptionCollector);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    public <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return (R) this.$$delegate_0.fold(r8, interfaceC0650p);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) this.$$delegate_0.get(cVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(d context, Throwable exception) {
        this.$$delegate_0.handleException(context, exception);
    }

    public int hashCode() {
        return ExceptionCollector.INSTANCE.hashCode();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    public d minusKey(d.c<?> key) {
        return this.$$delegate_0.minusKey(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    public d plus(d context) {
        return this.$$delegate_0.plus(context);
    }
}

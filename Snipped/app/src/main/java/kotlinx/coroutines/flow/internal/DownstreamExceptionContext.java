package kotlinx.coroutines.flow.internal;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/d;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)V", "Lkotlin/coroutines/d$c;", "key", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "context", "plus", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DownstreamExceptionContext implements d {
    private final /* synthetic */ d $$delegate_0;
    public final Throwable e;

    public DownstreamExceptionContext(Throwable th, d dVar) {
        this.$$delegate_0 = dVar;
        this.e = th;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return (R) this.$$delegate_0.fold(r8, interfaceC0650p);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) this.$$delegate_0.get(cVar);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> key) {
        return this.$$delegate_0.minusKey(key);
    }

    @Override // kotlin.coroutines.d
    public d plus(d context) {
        return this.$$delegate_0.plus(context);
    }
}

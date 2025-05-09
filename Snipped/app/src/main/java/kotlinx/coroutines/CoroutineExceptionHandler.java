package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/d$b;", "Lkotlin/coroutines/d;", "context", "", "exception", "LO9/p;", "handleException", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends d.b {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return interfaceC0650p.invoke(r8, coroutineExceptionHandler);
        }

        public static <E extends d.b> E get(CoroutineExceptionHandler coroutineExceptionHandler, d.c<E> cVar) {
            return (E) d.b.a.a(coroutineExceptionHandler, cVar);
        }

        public static d minusKey(CoroutineExceptionHandler coroutineExceptionHandler, d.c<?> cVar) {
            return d.b.a.b(coroutineExceptionHandler, cVar);
        }

        public static d plus(CoroutineExceptionHandler coroutineExceptionHandler, d dVar) {
            return d.a.a(coroutineExceptionHandler, dVar);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/d$c;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$Key, reason: from kotlin metadata */
    public static final class Companion implements d.c<CoroutineExceptionHandler> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    void handleException(d context, Throwable exception);

    @Override // kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}

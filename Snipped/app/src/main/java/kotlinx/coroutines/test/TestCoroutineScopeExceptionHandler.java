package kotlinx.coroutines.test;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: TestCoroutineScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScopeExceptionHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
interface TestCoroutineScopeExceptionHandler extends CoroutineExceptionHandler {

    /* compiled from: TestCoroutineScope.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) CoroutineExceptionHandler.DefaultImpls.fold(testCoroutineScopeExceptionHandler, r8, interfaceC0650p);
        }

        public static <E extends d.b> E get(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, d.c<E> cVar) {
            return (E) CoroutineExceptionHandler.DefaultImpls.get(testCoroutineScopeExceptionHandler, cVar);
        }

        public static kotlin.coroutines.d minusKey(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, d.c<?> cVar) {
            return CoroutineExceptionHandler.DefaultImpls.minusKey(testCoroutineScopeExceptionHandler, cVar);
        }

        public static kotlin.coroutines.d plus(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, kotlin.coroutines.d dVar) {
            return CoroutineExceptionHandler.DefaultImpls.plus(testCoroutineScopeExceptionHandler, dVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    /* synthetic */ kotlin.coroutines.d minusKey(d.c cVar);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.d
    /* synthetic */ kotlin.coroutines.d plus(kotlin.coroutines.d dVar);
}

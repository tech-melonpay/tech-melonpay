package kotlinx.coroutines;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, d dVar, CoroutineStart coroutineStart, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super T>, ? extends Object> interfaceC0650p) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, dVar, coroutineStart, interfaceC0650p);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super T>, ? extends Object> interfaceC0650p, T9.a<? super T> aVar) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, interfaceC0650p, aVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, d dVar, CoroutineStart coroutineStart, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, dVar, coroutineStart, interfaceC0650p);
    }

    public static final <T> T runBlocking(d dVar, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super T>, ? extends Object> interfaceC0650p) {
        return (T) BuildersKt__BuildersKt.runBlocking(dVar, interfaceC0650p);
    }

    public static final <T> Object withContext(d dVar, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super T>, ? extends Object> interfaceC0650p, T9.a<? super T> aVar) {
        return BuildersKt__Builders_commonKt.withContext(dVar, interfaceC0650p, aVar);
    }
}

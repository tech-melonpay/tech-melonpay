package kotlin.coroutines;

import ca.InterfaceC0646l;
import kotlin.coroutines.d;
import kotlin.coroutines.d.b;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {
    private final InterfaceC0646l<d.b, E> safeCast;
    private final d.c<?> topmostKey;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.d$c<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.l<? super kotlin.coroutines.d$b, ? extends E extends B>, ca.l<kotlin.coroutines.d$b, E extends B>] */
    public b(d.c<B> cVar, InterfaceC0646l<? super d.b, ? extends E> interfaceC0646l) {
        this.safeCast = interfaceC0646l;
        this.topmostKey = cVar instanceof b ? (d.c<B>) ((b) cVar).topmostKey : cVar;
    }

    public final boolean isSubKey$kotlin_stdlib(d.c<?> cVar) {
        return cVar == this || this.topmostKey == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/d$b;)TE; */
    public final d.b tryCast$kotlin_stdlib(d.b bVar) {
        return (d.b) this.safeCast.invoke(bVar);
    }
}

package kotlin.coroutines;

import ca.InterfaceC0650p;
import kotlin.jvm.internal.f;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: CoroutineContext.kt */
    public static final class a {
        public static d a(d dVar, d dVar2) {
            return dVar2 == EmptyCoroutineContext.f23155a ? dVar : (d) dVar2.fold(dVar, new K8.c(5));
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends d {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                if (f.b(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static d b(b bVar, c<?> cVar) {
                return f.b(bVar.getKey(), cVar) ? EmptyCoroutineContext.f23155a : bVar;
            }
        }

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r8, InterfaceC0650p<? super R, ? super b, ? extends R> interfaceC0650p);

    <E extends b> E get(c<E> cVar);

    d minusKey(c<?> cVar);

    d plus(d dVar);
}

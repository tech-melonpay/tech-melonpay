package kotlin.coroutines;

import ca.InterfaceC0650p;
import java.io.Serializable;
import kotlin.coroutines.d;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class EmptyCoroutineContext implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyCoroutineContext f23155a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f23155a;
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.d
    public final d minusKey(d.c<?> cVar) {
        return this;
    }

    @Override // kotlin.coroutines.d
    public final d plus(d dVar) {
        return dVar;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return r8;
    }
}

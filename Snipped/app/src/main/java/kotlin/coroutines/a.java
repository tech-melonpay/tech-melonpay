package kotlin.coroutines;

import ca.InterfaceC0650p;
import kotlin.coroutines.d;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class a implements d.b {
    private final d.c<?> key;

    public a(d.c<?> cVar) {
        this.key = cVar;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return interfaceC0650p.invoke(r8, this);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.a(this, dVar);
    }
}

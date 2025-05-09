package kotlin.coroutines;

import C.v;
import O9.p;
import R7.e;
import ca.InterfaceC0650p;
import java.io.Serializable;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.f;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class CombinedContext implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final d f23152a;

    /* renamed from: b, reason: collision with root package name */
    public final d.b f23153b;

    /* compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final d[] f23154a;

        public Serialized(d[] dVarArr) {
            this.f23154a = dVarArr;
        }

        private final Object readResolve() {
            d dVar = EmptyCoroutineContext.f23155a;
            for (d dVar2 : this.f23154a) {
                dVar = dVar.plus(dVar2);
            }
            return dVar;
        }
    }

    public CombinedContext(d dVar, d.b bVar) {
        this.f23152a = dVar;
        this.f23153b = bVar;
    }

    private final Object writeReplace() {
        int a10 = a();
        d[] dVarArr = new d[a10];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(p.f3034a, new e(2, dVarArr, ref$IntRef));
        if (ref$IntRef.f23177a == a10) {
            return new Serialized(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.f23152a;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.a() == a()) {
                    CombinedContext combinedContext2 = this;
                    while (true) {
                        d.b bVar = combinedContext2.f23153b;
                        if (!f.b(combinedContext.get(bVar.getKey()), bVar)) {
                            break;
                        }
                        d dVar = combinedContext2.f23152a;
                        if (dVar instanceof CombinedContext) {
                            combinedContext2 = (CombinedContext) dVar;
                        } else {
                            d.b bVar2 = (d.b) dVar;
                            if (f.b(combinedContext.get(bVar2.getKey()), bVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return interfaceC0650p.invoke((Object) this.f23152a.fold(r8, interfaceC0650p), this.f23153b);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.f23153b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            d dVar = combinedContext.f23152a;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(cVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public final int hashCode() {
        return this.f23153b.hashCode() + this.f23152a.hashCode();
    }

    @Override // kotlin.coroutines.d
    public final d minusKey(d.c<?> cVar) {
        d.b bVar = this.f23153b;
        d.b bVar2 = bVar.get(cVar);
        d dVar = this.f23152a;
        if (bVar2 != null) {
            return dVar;
        }
        d minusKey = dVar.minusKey(cVar);
        return minusKey == dVar ? this : minusKey == EmptyCoroutineContext.f23155a ? bVar : new CombinedContext(minusKey, bVar);
    }

    @Override // kotlin.coroutines.d
    public final d plus(d dVar) {
        return d.a.a(this, dVar);
    }

    public final String toString() {
        return v.q(new StringBuilder("["), (String) fold("", new K8.c(4)), ']');
    }
}

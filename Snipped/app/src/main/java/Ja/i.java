package ja;

import O9.p;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SequenceBuilder.kt */
/* loaded from: classes2.dex */
public final class i<T> extends j<T> implements Iterator<T>, T9.a<p>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public int f22581a;

    /* renamed from: b, reason: collision with root package name */
    public T f22582b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator<? extends T> f22583c;

    /* renamed from: d, reason: collision with root package name */
    public T9.a<? super p> f22584d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ja.j
    public final void a(Object obj, T9.a aVar) {
        this.f22582b = obj;
        this.f22581a = 3;
        this.f22584d = aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
    }

    @Override // ja.j
    public final Object c(Iterator<? extends T> it, T9.a<? super p> aVar) {
        if (!it.hasNext()) {
            return p.f3034a;
        }
        this.f22583c = it;
        this.f22581a = 2;
        this.f22584d = aVar;
        return CoroutineSingletons.f23158a;
    }

    public final RuntimeException d() {
        int i = this.f22581a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22581a);
    }

    @Override // T9.a
    public final kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.f23155a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f22581a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                if (this.f22583c.hasNext()) {
                    this.f22581a = 2;
                    return true;
                }
                this.f22583c = null;
            }
            this.f22581a = 5;
            T9.a<? super p> aVar = this.f22584d;
            this.f22584d = null;
            aVar.resumeWith(p.f3034a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f22581a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f22581a = 1;
            return this.f22583c.next();
        }
        if (i != 3) {
            throw d();
        }
        this.f22581a = 0;
        T t3 = this.f22582b;
        this.f22582b = null;
        return t3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // T9.a
    public final void resumeWith(Object obj) {
        kotlin.b.b(obj);
        this.f22581a = 4;
    }
}

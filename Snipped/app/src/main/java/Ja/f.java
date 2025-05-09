package ja;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f22569a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<T, R> f22570b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0646l<R, Iterator<E>> f22571c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f22572a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends E> f22573b;

        /* renamed from: c, reason: collision with root package name */
        public int f22574c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f<T, R, E> f22575d;

        public a(f<T, R, E> fVar) {
            this.f22575d = fVar;
            this.f22572a = fVar.f22569a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.f22573b;
            if (it2 != null && it2.hasNext()) {
                this.f22574c = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.f22572a;
                if (!it3.hasNext()) {
                    this.f22574c = 2;
                    this.f22573b = null;
                    return false;
                }
                T next = it3.next();
                f<T, R, E> fVar = this.f22575d;
                it = (Iterator) fVar.f22571c.invoke(fVar.f22570b.invoke(next));
            } while (!it.hasNext());
            this.f22573b = it;
            this.f22574c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f22574c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.f22574c;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f22574c = 0;
            return this.f22573b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> hVar, InterfaceC0646l<? super T, ? extends R> interfaceC0646l, InterfaceC0646l<? super R, ? extends Iterator<? extends E>> interfaceC0646l2) {
        this.f22569a = hVar;
        this.f22570b = interfaceC0646l;
        this.f22571c = interfaceC0646l2;
    }

    @Override // ja.h
    public final Iterator<E> iterator() {
        return new a(this);
    }
}

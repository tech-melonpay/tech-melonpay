package ja;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class n<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f22588a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<T, Boolean> f22589b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f22590a;

        /* renamed from: b, reason: collision with root package name */
        public int f22591b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f22592c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n<T> f22593d;

        public a(n<T> nVar) {
            this.f22593d = nVar;
            this.f22590a = nVar.f22588a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f22590a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f22593d.f22589b.invoke(next).booleanValue()) {
                    this.f22591b = 1;
                    this.f22592c = next;
                    return;
                }
            }
            this.f22591b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22591b == -1) {
                a();
            }
            return this.f22591b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22591b == -1) {
                a();
            }
            if (this.f22591b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f22592c;
            this.f22592c = null;
            this.f22591b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(h<? extends T> hVar, InterfaceC0646l<? super T, Boolean> interfaceC0646l) {
        this.f22588a = hVar;
        this.f22589b = interfaceC0646l;
    }

    @Override // ja.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

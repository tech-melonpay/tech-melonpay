package ja;

import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class g<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0635a<T> f22576a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<T, T> f22577b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public T f22578a;

        /* renamed from: b, reason: collision with root package name */
        public int f22579b = -2;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g<T> f22580c;

        public a(g<T> gVar) {
            this.f22580c = gVar;
        }

        public final void a() {
            int i = this.f22579b;
            g<T> gVar = this.f22580c;
            T invoke = i == -2 ? gVar.f22576a.invoke() : gVar.f22577b.invoke(this.f22578a);
            this.f22578a = invoke;
            this.f22579b = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22579b < 0) {
                a();
            }
            return this.f22579b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22579b < 0) {
                a();
            }
            if (this.f22579b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f22578a;
            this.f22579b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(InterfaceC0635a<? extends T> interfaceC0635a, InterfaceC0646l<? super T, ? extends T> interfaceC0646l) {
        this.f22576a = interfaceC0635a;
        this.f22577b = interfaceC0646l;
    }

    @Override // ja.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

package ja;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class e<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f22562a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22563b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0646l<T, Boolean> f22564c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f22565a;

        /* renamed from: b, reason: collision with root package name */
        public int f22566b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f22567c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T> f22568d;

        public a(e<T> eVar) {
            this.f22568d = eVar;
            this.f22565a = eVar.f22562a.iterator();
        }

        public final void a() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.f22565a;
                if (!it.hasNext()) {
                    this.f22566b = 0;
                    return;
                } else {
                    next = it.next();
                    eVar = this.f22568d;
                }
            } while (eVar.f22564c.invoke(next).booleanValue() != eVar.f22563b);
            this.f22567c = next;
            this.f22566b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22566b == -1) {
                a();
            }
            return this.f22566b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22566b == -1) {
                a();
            }
            if (this.f22566b == 0) {
                throw new NoSuchElementException();
            }
            T t3 = this.f22567c;
            this.f22567c = null;
            this.f22566b = -1;
            return t3;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends T> hVar, boolean z10, InterfaceC0646l<? super T, Boolean> interfaceC0646l) {
        this.f22562a = hVar;
        this.f22563b = z10;
        this.f22564c = interfaceC0646l;
    }

    @Override // ja.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

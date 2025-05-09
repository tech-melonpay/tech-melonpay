package ja;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class o<T, R> implements h<R> {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f22594a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<T, R> f22595b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f22596a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o<T, R> f22597b;

        public a(o<T, R> oVar) {
            this.f22597b = oVar;
            this.f22596a = oVar.f22594a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f22596a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f22597b.f22595b.invoke(this.f22596a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(h<? extends T> hVar, InterfaceC0646l<? super T, ? extends R> interfaceC0646l) {
        this.f22594a = hVar;
        this.f22595b = interfaceC0646l;
    }

    @Override // ja.h
    public final Iterator<R> iterator() {
        return new a(this);
    }
}

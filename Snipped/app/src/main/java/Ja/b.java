package ja;

import da.InterfaceC0701a;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h<T> f22557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22558b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f22559a;

        /* renamed from: b, reason: collision with root package name */
        public int f22560b;

        public a(b<T> bVar) {
            this.f22559a = bVar.f22557a.iterator();
            this.f22560b = bVar.f22558b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.f22560b;
                it = this.f22559a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f22560b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.f22560b;
                it = this.f22559a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f22560b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> hVar, int i) {
        this.f22557a = hVar;
        this.f22558b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // ja.c
    public final h<T> a(int i) {
        int i9 = this.f22558b + i;
        return i9 < 0 ? new b(this, i) : new b(this.f22557a, i9);
    }

    @Override // ja.h
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

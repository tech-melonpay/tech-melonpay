package P9;

import da.InterfaceC0701a;
import ha.C0806e;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: ReversedViews.kt */
/* loaded from: classes2.dex */
public final class C<T> extends AbstractC0500b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final List<T> f3143a;

    /* compiled from: ReversedViews.kt */
    public static final class a implements ListIterator<T>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f3144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C<T> f3145b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C<? extends T> c2, int i) {
            this.f3145b = c2;
            List<T> list = c2.f3143a;
            if (i >= 0 && i <= c2.size()) {
                this.f3144a = list.listIterator(c2.size() - i);
                return;
            }
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Position index ", i, " must be in range [");
            l10.append(new C0806e(0, c2.size(), 1));
            l10.append("].");
            throw new IndexOutOfBoundsException(l10.toString());
        }

        @Override // java.util.ListIterator
        public final void add(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f3144a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3144a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f3144a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return m.p(this.f3145b) - this.f3144a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f3144a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return m.p(this.f3145b) - this.f3144a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(List<? extends T> list) {
        this.f3143a = list;
    }

    @Override // P9.AbstractC0499a
    public final int a() {
        return this.f3143a.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        if (i >= 0 && i <= m.p(this)) {
            return this.f3143a.get(m.p(this) - i);
        }
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Element index ", i, " must be in range [");
        l10.append(new C0806e(0, m.p(this), 1));
        l10.append("].");
        throw new IndexOutOfBoundsException(l10.toString());
    }

    @Override // P9.AbstractC0500b, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // P9.AbstractC0500b, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // P9.AbstractC0500b, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}

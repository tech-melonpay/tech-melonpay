package P9;

import da.InterfaceC0701a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* renamed from: P9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0500b<E> extends AbstractC0499a<E> implements List<E> {

    /* compiled from: AbstractList.kt */
    /* renamed from: P9.b$a */
    public static final class a {
        public static void a(int i, int i9, int i10) {
            if (i < 0 || i9 > i10) {
                StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "fromIndex: ", ", toIndex: ", ", size: ");
                q10.append(i10);
                throw new IndexOutOfBoundsException(q10.toString());
            }
            if (i > i9) {
                throw new IllegalArgumentException(C.v.k(i, i9, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: P9.b$b, reason: collision with other inner class name */
    public class C0038b implements Iterator<E>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public int f3146a;

        public C0038b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3146a < AbstractC0500b.this.a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f3146a;
            this.f3146a = i + 1;
            return AbstractC0500b.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: P9.b$c */
    public class c extends AbstractC0500b<E>.C0038b implements ListIterator<E> {
        public c(int i) {
            super();
            int a10 = AbstractC0500b.this.a();
            if (i < 0 || i > a10) {
                throw new IndexOutOfBoundsException(C.v.k(i, a10, "index: ", ", size: "));
            }
            this.f3146a = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3146a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3146a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.f3146a - 1;
            this.f3146a = i;
            return AbstractC0500b.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3146a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: P9.b$d */
    public static final class d<E> extends AbstractC0500b<E> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0500b<E> f3149a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3150b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3151c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC0500b<? extends E> abstractC0500b, int i, int i9) {
            this.f3149a = abstractC0500b;
            this.f3150b = i;
            a.a(i, i9, abstractC0500b.a());
            this.f3151c = i9 - i;
        }

        @Override // P9.AbstractC0499a
        public final int a() {
            return this.f3151c;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i9 = this.f3151c;
            if (i < 0 || i >= i9) {
                throw new IndexOutOfBoundsException(C.v.k(i, i9, "index: ", ", size: "));
            }
            return this.f3149a.get(this.f3150b + i);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.f.b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            E next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f.b(it.next(), e10)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0038b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.f.b(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i9) {
        return new d(this, i, i9);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}

package kotlin.collections.builders;

import C.v;
import P9.AbstractC0500b;
import P9.AbstractC0502d;
import P9.i;
import da.InterfaceC0701a;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.f;

/* compiled from: ListBuilder.kt */
/* loaded from: classes2.dex */
public final class ListBuilder<E> extends AbstractC0502d<E> implements List<E>, RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final ListBuilder f23107d;

    /* renamed from: a, reason: collision with root package name */
    public E[] f23108a;

    /* renamed from: b, reason: collision with root package name */
    public int f23109b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23110c;

    /* compiled from: ListBuilder.kt */
    public static final class BuilderSubList<E> extends AbstractC0502d<E> implements List<E>, RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public E[] f23111a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23112b;

        /* renamed from: c, reason: collision with root package name */
        public int f23113c;

        /* renamed from: d, reason: collision with root package name */
        public final BuilderSubList<E> f23114d;

        /* renamed from: e, reason: collision with root package name */
        public final ListBuilder<E> f23115e;

        /* compiled from: ListBuilder.kt */
        public static final class a<E> implements ListIterator<E>, InterfaceC0701a {

            /* renamed from: a, reason: collision with root package name */
            public final BuilderSubList<E> f23116a;

            /* renamed from: b, reason: collision with root package name */
            public int f23117b;

            /* renamed from: c, reason: collision with root package name */
            public int f23118c = -1;

            /* renamed from: d, reason: collision with root package name */
            public int f23119d;

            public a(BuilderSubList<E> builderSubList, int i) {
                this.f23116a = builderSubList;
                this.f23117b = i;
                this.f23119d = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f23116a.f23115e).modCount != this.f23119d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e10) {
                a();
                int i = this.f23117b;
                this.f23117b = i + 1;
                BuilderSubList<E> builderSubList = this.f23116a;
                builderSubList.add(i, e10);
                this.f23118c = -1;
                this.f23119d = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f23117b < this.f23116a.f23113c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f23117b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i = this.f23117b;
                BuilderSubList<E> builderSubList = this.f23116a;
                if (i >= builderSubList.f23113c) {
                    throw new NoSuchElementException();
                }
                this.f23117b = i + 1;
                this.f23118c = i;
                return builderSubList.f23111a[builderSubList.f23112b + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f23117b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i = this.f23117b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i - 1;
                this.f23117b = i9;
                this.f23118c = i9;
                BuilderSubList<E> builderSubList = this.f23116a;
                return builderSubList.f23111a[builderSubList.f23112b + i9];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f23117b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.f23118c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                BuilderSubList<E> builderSubList = this.f23116a;
                builderSubList.c(i);
                this.f23117b = this.f23118c;
                this.f23118c = -1;
                this.f23119d = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e10) {
                a();
                int i = this.f23118c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f23116a.set(i, e10);
            }
        }

        public BuilderSubList(E[] eArr, int i, int i9, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            this.f23111a = eArr;
            this.f23112b = i;
            this.f23113c = i9;
            this.f23114d = builderSubList;
            this.f23115e = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final Object writeReplace() {
            if (this.f23115e.f23110c) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // P9.AbstractC0502d
        public final int a() {
            h();
            return this.f23113c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e10) {
            i();
            h();
            g(this.f23112b + this.f23113c, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            i();
            h();
            int size = collection.size();
            f(this.f23112b + this.f23113c, collection, size);
            return size > 0;
        }

        @Override // P9.AbstractC0502d
        public final E c(int i) {
            i();
            h();
            int i9 = this.f23113c;
            if (i < 0 || i >= i9) {
                throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
            }
            return k(this.f23112b + i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            i();
            h();
            m(this.f23112b, this.f23113c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            h();
            if (obj != this) {
                if (obj instanceof List) {
                    if (Ja.a.a(this.f23111a, this.f23112b, this.f23113c, (List) obj)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final void f(int i, Collection<? extends E> collection, int i9) {
            ((AbstractList) this).modCount++;
            ListBuilder<E> listBuilder = this.f23115e;
            BuilderSubList<E> builderSubList = this.f23114d;
            if (builderSubList != null) {
                builderSubList.f(i, collection, i9);
            } else {
                ListBuilder listBuilder2 = ListBuilder.f23107d;
                listBuilder.f(i, collection, i9);
            }
            this.f23111a = listBuilder.f23108a;
            this.f23113c += i9;
        }

        public final void g(int i, E e10) {
            ((AbstractList) this).modCount++;
            ListBuilder<E> listBuilder = this.f23115e;
            BuilderSubList<E> builderSubList = this.f23114d;
            if (builderSubList != null) {
                builderSubList.g(i, e10);
            } else {
                ListBuilder listBuilder2 = ListBuilder.f23107d;
                listBuilder.g(i, e10);
            }
            this.f23111a = listBuilder.f23108a;
            this.f23113c++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            h();
            int i9 = this.f23113c;
            if (i < 0 || i >= i9) {
                throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
            }
            return this.f23111a[this.f23112b + i];
        }

        public final void h() {
            if (((AbstractList) this.f23115e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            h();
            E[] eArr = this.f23111a;
            int i = this.f23113c;
            int i9 = 1;
            for (int i10 = 0; i10 < i; i10++) {
                E e10 = eArr[this.f23112b + i10];
                i9 = (i9 * 31) + (e10 != null ? e10.hashCode() : 0);
            }
            return i9;
        }

        public final void i() {
            if (this.f23115e.f23110c) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            h();
            for (int i = 0; i < this.f23113c; i++) {
                if (f.b(this.f23111a[this.f23112b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            h();
            return this.f23113c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final E k(int i) {
            E k3;
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.f23114d;
            if (builderSubList != null) {
                k3 = builderSubList.k(i);
            } else {
                ListBuilder listBuilder = ListBuilder.f23107d;
                k3 = this.f23115e.k(i);
            }
            this.f23113c--;
            return k3;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            for (int i = this.f23113c - 1; i >= 0; i--) {
                if (f.b(this.f23111a[this.f23112b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final void m(int i, int i9) {
            if (i9 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList<E> builderSubList = this.f23114d;
            if (builderSubList != null) {
                builderSubList.m(i, i9);
            } else {
                ListBuilder listBuilder = ListBuilder.f23107d;
                this.f23115e.m(i, i9);
            }
            this.f23113c -= i9;
        }

        public final int n(int i, int i9, Collection<? extends E> collection, boolean z10) {
            int n10;
            BuilderSubList<E> builderSubList = this.f23114d;
            if (builderSubList != null) {
                n10 = builderSubList.n(i, i9, collection, z10);
            } else {
                ListBuilder listBuilder = ListBuilder.f23107d;
                n10 = this.f23115e.n(i, i9, collection, z10);
            }
            if (n10 > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f23113c -= n10;
            return n10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            i();
            h();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                c(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<? extends Object> collection) {
            i();
            h();
            return n(this.f23112b, this.f23113c, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<? extends Object> collection) {
            i();
            h();
            return n(this.f23112b, this.f23113c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e10) {
            i();
            h();
            int i9 = this.f23113c;
            if (i < 0 || i >= i9) {
                throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
            }
            E[] eArr = this.f23111a;
            int i10 = this.f23112b;
            E e11 = eArr[i10 + i];
            eArr[i10 + i] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i9) {
            AbstractC0500b.a.a(i, i9, this.f23113c);
            return new BuilderSubList(this.f23111a, this.f23112b + i, i9 - i, this, this.f23115e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            h();
            int length = tArr.length;
            int i = this.f23113c;
            int i9 = this.f23112b;
            if (length < i) {
                return (T[]) Arrays.copyOfRange(this.f23111a, i9, i + i9, tArr.getClass());
            }
            i.e(this.f23111a, tArr, 0, i9, i + i9);
            int i10 = this.f23113c;
            if (i10 < tArr.length) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            h();
            return Ja.a.b(this.f23111a, this.f23112b, this.f23113c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            h();
            int i9 = this.f23113c;
            if (i < 0 || i > i9) {
                throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
            }
            return new a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e10) {
            i();
            h();
            int i9 = this.f23113c;
            if (i >= 0 && i <= i9) {
                g(this.f23112b + i, e10);
                return;
            }
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            i();
            h();
            int i9 = this.f23113c;
            if (i >= 0 && i <= i9) {
                int size = collection.size();
                f(this.f23112b + i, collection, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            h();
            E[] eArr = this.f23111a;
            int i = this.f23113c;
            int i9 = this.f23112b;
            int i10 = i + i9;
            i.i(i10, eArr.length);
            return Arrays.copyOfRange(eArr, i9, i10);
        }
    }

    /* compiled from: ListBuilder.kt */
    public static final class a<E> implements ListIterator<E>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final ListBuilder<E> f23120a;

        /* renamed from: b, reason: collision with root package name */
        public int f23121b;

        /* renamed from: c, reason: collision with root package name */
        public int f23122c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f23123d;

        public a(ListBuilder<E> listBuilder, int i) {
            this.f23120a = listBuilder;
            this.f23121b = i;
            this.f23123d = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f23120a).modCount != this.f23123d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            a();
            int i = this.f23121b;
            this.f23121b = i + 1;
            ListBuilder<E> listBuilder = this.f23120a;
            listBuilder.add(i, e10);
            this.f23122c = -1;
            this.f23123d = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f23121b < this.f23120a.f23109b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f23121b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i = this.f23121b;
            ListBuilder<E> listBuilder = this.f23120a;
            if (i >= listBuilder.f23109b) {
                throw new NoSuchElementException();
            }
            this.f23121b = i + 1;
            this.f23122c = i;
            return listBuilder.f23108a[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f23121b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i = this.f23121b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i9 = i - 1;
            this.f23121b = i9;
            this.f23122c = i9;
            return this.f23120a.f23108a[i9];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f23121b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.f23122c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            ListBuilder<E> listBuilder = this.f23120a;
            listBuilder.c(i);
            this.f23121b = this.f23122c;
            this.f23122c = -1;
            this.f23123d = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            a();
            int i = this.f23122c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f23120a.set(i, e10);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f23110c = true;
        f23107d = listBuilder;
    }

    public ListBuilder() {
        this((Object) null);
    }

    private final Object writeReplace() {
        if (this.f23110c) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // P9.AbstractC0502d
    public final int a() {
        return this.f23109b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        h();
        int i = this.f23109b;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.f23108a[i] = e10;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        h();
        int size = collection.size();
        f(this.f23109b, collection, size);
        return size > 0;
    }

    @Override // P9.AbstractC0502d
    public final E c(int i) {
        h();
        int i9 = this.f23109b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }
        return k(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        m(0, this.f23109b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!Ja.a.a(this.f23108a, 0, this.f23109b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i, Collection<? extends E> collection, int i9) {
        ((AbstractList) this).modCount++;
        i(i, i9);
        Iterator<? extends E> it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f23108a[i + i10] = it.next();
        }
    }

    public final void g(int i, E e10) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.f23108a[i] = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i9 = this.f23109b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }
        return this.f23108a[i];
    }

    public final void h() {
        if (this.f23110c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f23108a;
        int i = this.f23109b;
        int i9 = 1;
        for (int i10 = 0; i10 < i; i10++) {
            E e10 = eArr[i10];
            i9 = (i9 * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return i9;
    }

    public final void i(int i, int i9) {
        int i10 = this.f23109b + i9;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f23108a;
        if (i10 > eArr.length) {
            int length = eArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f23108a = (E[]) Arrays.copyOf(eArr, i11);
        }
        E[] eArr2 = this.f23108a;
        i.e(eArr2, eArr2, i + i9, i, this.f23109b);
        this.f23109b += i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f23109b; i++) {
            if (f.b(this.f23108a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f23109b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final E k(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f23108a;
        E e10 = eArr[i];
        i.e(eArr, eArr, i, i + 1, this.f23109b);
        E[] eArr2 = this.f23108a;
        int i9 = this.f23109b;
        eArr2[i9 - 1] = null;
        this.f23109b = i9 - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f23109b - 1; i >= 0; i--) {
            if (f.b(this.f23108a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final void m(int i, int i9) {
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f23108a;
        i.e(eArr, eArr, i, i + i9, this.f23109b);
        E[] eArr2 = this.f23108a;
        int i10 = this.f23109b;
        Ja.a.s(eArr2, i10 - i9, i10);
        this.f23109b -= i9;
    }

    public final int n(int i, int i9, Collection<? extends E> collection, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i + i10;
            if (collection.contains(this.f23108a[i12]) == z10) {
                E[] eArr = this.f23108a;
                i10++;
                eArr[i11 + i] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        E[] eArr2 = this.f23108a;
        i.e(eArr2, eArr2, i + i11, i9 + i, this.f23109b);
        E[] eArr3 = this.f23108a;
        int i14 = this.f23109b;
        Ja.a.s(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f23109b -= i13;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        h();
        return n(0, this.f23109b, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        h();
        return n(0, this.f23109b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e10) {
        h();
        int i9 = this.f23109b;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }
        E[] eArr = this.f23108a;
        E e11 = eArr[i];
        eArr[i] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i9) {
        AbstractC0500b.a.a(i, i9, this.f23109b);
        return new BuilderSubList(this.f23108a, i, i9 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f23109b;
        if (length < i) {
            return (T[]) Arrays.copyOfRange(this.f23108a, 0, i, tArr.getClass());
        }
        i.e(this.f23108a, tArr, 0, 0, i);
        int i9 = this.f23109b;
        if (i9 < tArr.length) {
            tArr[i9] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Ja.a.b(this.f23108a, 0, this.f23109b, this);
    }

    public ListBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        this.f23108a = (E[]) new Object[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i9 = this.f23109b;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        h();
        int i9 = this.f23109b;
        if (i >= 0 && i <= i9) {
            int size = collection.size();
            f(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
    }

    public /* synthetic */ ListBuilder(Object obj) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e10) {
        h();
        int i9 = this.f23109b;
        if (i >= 0 && i <= i9) {
            ((AbstractList) this).modCount++;
            i(i, 1);
            this.f23108a[i] = e10;
            return;
        }
        throw new IndexOutOfBoundsException(v.k(i, i9, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f23108a;
        int i = this.f23109b;
        i.i(i, eArr.length);
        return Arrays.copyOfRange(eArr, 0, i);
    }
}

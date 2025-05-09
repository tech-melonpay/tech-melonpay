package P9;

import P9.AbstractC0500b;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes2.dex */
public final class h<E> extends AbstractC0502d<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f3154d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f3155a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3156b = f3154d;

    /* renamed from: c, reason: collision with root package name */
    public int f3157c;

    @Override // P9.AbstractC0502d
    public final int a() {
        return this.f3157c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e10) {
        int i9 = this.f3157c;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(C.v.k(i, i9, "index: ", ", size: "));
        }
        if (i == i9) {
            addLast(e10);
            return;
        }
        if (i == 0) {
            addFirst(e10);
            return;
        }
        r();
        f(this.f3157c + 1);
        int q10 = q(this.f3155a + i);
        int i10 = this.f3157c;
        if (i < ((i10 + 1) >> 1)) {
            int length = q10 == 0 ? this.f3156b.length - 1 : q10 - 1;
            int i11 = this.f3155a;
            int length2 = i11 == 0 ? this.f3156b.length - 1 : i11 - 1;
            if (length >= i11) {
                Object[] objArr = this.f3156b;
                objArr[length2] = objArr[i11];
                i.e(objArr, objArr, i11, i11 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f3156b;
                i.e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f3156b;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.e(objArr3, objArr3, 0, 1, length + 1);
            }
            this.f3156b[length] = e10;
            this.f3155a = length2;
        } else {
            int q11 = q(i10 + this.f3155a);
            if (q10 < q11) {
                Object[] objArr4 = this.f3156b;
                i.e(objArr4, objArr4, q10 + 1, q10, q11);
            } else {
                Object[] objArr5 = this.f3156b;
                i.e(objArr5, objArr5, 1, 0, q11);
                Object[] objArr6 = this.f3156b;
                objArr6[0] = objArr6[objArr6.length - 1];
                i.e(objArr6, objArr6, q10 + 1, q10, objArr6.length - 1);
            }
            this.f3156b[q10] = e10;
        }
        this.f3157c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        int i9 = this.f3157c;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(C.v.k(i, i9, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f3157c) {
            return addAll(collection);
        }
        r();
        f(collection.size() + this.f3157c);
        int q10 = q(this.f3157c + this.f3155a);
        int q11 = q(this.f3155a + i);
        int size = collection.size();
        if (i < ((this.f3157c + 1) >> 1)) {
            int i10 = this.f3155a;
            int i11 = i10 - size;
            if (q11 < i10) {
                Object[] objArr = this.f3156b;
                i.e(objArr, objArr, i11, i10, objArr.length);
                if (size >= q11) {
                    Object[] objArr2 = this.f3156b;
                    i.e(objArr2, objArr2, objArr2.length - size, 0, q11);
                } else {
                    Object[] objArr3 = this.f3156b;
                    i.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f3156b;
                    i.e(objArr4, objArr4, 0, size, q11);
                }
            } else if (i11 >= 0) {
                Object[] objArr5 = this.f3156b;
                i.e(objArr5, objArr5, i11, i10, q11);
            } else {
                Object[] objArr6 = this.f3156b;
                i11 += objArr6.length;
                int i12 = q11 - i10;
                int length = objArr6.length - i11;
                if (length >= i12) {
                    i.e(objArr6, objArr6, i11, i10, q11);
                } else {
                    i.e(objArr6, objArr6, i11, i10, i10 + length);
                    Object[] objArr7 = this.f3156b;
                    i.e(objArr7, objArr7, 0, this.f3155a + length, q11);
                }
            }
            this.f3155a = i11;
            e(n(q11 - size), collection);
        } else {
            int i13 = q11 + size;
            if (q11 < q10) {
                int i14 = size + q10;
                Object[] objArr8 = this.f3156b;
                if (i14 <= objArr8.length) {
                    i.e(objArr8, objArr8, i13, q11, q10);
                } else if (i13 >= objArr8.length) {
                    i.e(objArr8, objArr8, i13 - objArr8.length, q11, q10);
                } else {
                    int length2 = q10 - (i14 - objArr8.length);
                    i.e(objArr8, objArr8, 0, length2, q10);
                    Object[] objArr9 = this.f3156b;
                    i.e(objArr9, objArr9, i13, q11, length2);
                }
            } else {
                Object[] objArr10 = this.f3156b;
                i.e(objArr10, objArr10, size, 0, q10);
                Object[] objArr11 = this.f3156b;
                if (i13 >= objArr11.length) {
                    i.e(objArr11, objArr11, i13 - objArr11.length, q11, objArr11.length);
                } else {
                    i.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f3156b;
                    i.e(objArr12, objArr12, i13, q11, objArr12.length - size);
                }
            }
            e(q11, collection);
        }
        return true;
    }

    public final void addFirst(E e10) {
        r();
        f(this.f3157c + 1);
        int i = this.f3155a;
        if (i == 0) {
            i = this.f3156b.length;
        }
        int i9 = i - 1;
        this.f3155a = i9;
        this.f3156b[i9] = e10;
        this.f3157c++;
    }

    public final void addLast(E e10) {
        r();
        f(a() + 1);
        this.f3156b[q(a() + this.f3155a)] = e10;
        this.f3157c = a() + 1;
    }

    @Override // P9.AbstractC0502d
    public final E c(int i) {
        int i9 = this.f3157c;
        if (i < 0 || i >= i9) {
            throw new IndexOutOfBoundsException(C.v.k(i, i9, "index: ", ", size: "));
        }
        if (i == m.p(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        r();
        int q10 = q(this.f3155a + i);
        Object[] objArr = this.f3156b;
        E e10 = (E) objArr[q10];
        if (i < (this.f3157c >> 1)) {
            int i10 = this.f3155a;
            if (q10 >= i10) {
                i.e(objArr, objArr, i10 + 1, i10, q10);
            } else {
                i.e(objArr, objArr, 1, 0, q10);
                Object[] objArr2 = this.f3156b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i11 = this.f3155a;
                i.e(objArr2, objArr2, i11 + 1, i11, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3156b;
            int i12 = this.f3155a;
            objArr3[i12] = null;
            this.f3155a = i(i12);
        } else {
            int q11 = q(m.p(this) + this.f3155a);
            if (q10 <= q11) {
                Object[] objArr4 = this.f3156b;
                i.e(objArr4, objArr4, q10, q10 + 1, q11 + 1);
            } else {
                Object[] objArr5 = this.f3156b;
                i.e(objArr5, objArr5, q10, q10 + 1, objArr5.length);
                Object[] objArr6 = this.f3156b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.e(objArr6, objArr6, 0, 1, q11 + 1);
            }
            this.f3156b[q11] = null;
        }
        this.f3157c--;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            r();
            o(this.f3155a, q(a() + this.f3155a));
        }
        this.f3155a = 0;
        this.f3157c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f3156b.length;
        while (i < length && it.hasNext()) {
            this.f3156b[i] = it.next();
            i++;
        }
        int i9 = this.f3155a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f3156b[i10] = it.next();
        }
        this.f3157c = collection.size() + a();
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3156b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f3154d) {
            if (i < 10) {
                i = 10;
            }
            this.f3156b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i9 = length + (length >> 1);
        if (i9 - i < 0) {
            i9 = i;
        }
        if (i9 - 2147483639 > 0) {
            i9 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i9];
        i.e(objArr, objArr2, 0, this.f3155a, objArr.length);
        Object[] objArr3 = this.f3156b;
        int length2 = objArr3.length;
        int i10 = this.f3155a;
        i.e(objArr3, objArr2, length2 - i10, 0, i10);
        this.f3155a = 0;
        this.f3156b = objArr2;
    }

    public final E g() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f3156b[this.f3155a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int a10 = a();
        if (i < 0 || i >= a10) {
            throw new IndexOutOfBoundsException(C.v.k(i, a10, "index: ", ", size: "));
        }
        return (E) this.f3156b[q(this.f3155a + i)];
    }

    public final E h() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f3156b[this.f3155a];
    }

    public final int i(int i) {
        if (i == this.f3156b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int q10 = q(a() + this.f3155a);
        int i9 = this.f3155a;
        if (i9 < q10) {
            while (i9 < q10) {
                if (kotlin.jvm.internal.f.b(obj, this.f3156b[i9])) {
                    i = this.f3155a;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 < q10) {
            return -1;
        }
        int length = this.f3156b.length;
        while (true) {
            if (i9 >= length) {
                for (int i10 = 0; i10 < q10; i10++) {
                    if (kotlin.jvm.internal.f.b(obj, this.f3156b[i10])) {
                        i9 = i10 + this.f3156b.length;
                        i = this.f3155a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.f.b(obj, this.f3156b[i9])) {
                i = this.f3155a;
                break;
            }
            i9++;
        }
        return i9 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final E k() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f3156b[q(m.p(this) + this.f3155a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int q10 = q(a() + this.f3155a);
        int i9 = this.f3155a;
        if (i9 < q10) {
            length = q10 - 1;
            if (i9 <= length) {
                while (!kotlin.jvm.internal.f.b(obj, this.f3156b[length])) {
                    if (length != i9) {
                        length--;
                    }
                }
                i = this.f3155a;
                return length - i;
            }
            return -1;
        }
        if (i9 > q10) {
            int i10 = q10 - 1;
            while (true) {
                if (-1 >= i10) {
                    length = this.f3156b.length - 1;
                    int i11 = this.f3155a;
                    if (i11 <= length) {
                        while (!kotlin.jvm.internal.f.b(obj, this.f3156b[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i = this.f3155a;
                    }
                } else {
                    if (kotlin.jvm.internal.f.b(obj, this.f3156b[i10])) {
                        length = i10 + this.f3156b.length;
                        i = this.f3155a;
                        break;
                    }
                    i10--;
                }
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f3156b[q(m.p(this) + this.f3155a)];
    }

    public final int n(int i) {
        return i < 0 ? i + this.f3156b.length : i;
    }

    public final void o(int i, int i9) {
        if (i < i9) {
            Arrays.fill(this.f3156b, i, i9, (Object) null);
            return;
        }
        Object[] objArr = this.f3156b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f3156b, 0, i9, (Object) null);
    }

    public final int q(int i) {
        Object[] objArr = this.f3156b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int q10;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f3156b.length != 0) {
            int q11 = q(a() + this.f3155a);
            int i = this.f3155a;
            if (i < q11) {
                q10 = i;
                while (i < q11) {
                    Object obj = this.f3156b[i];
                    if (!collection.contains(obj)) {
                        this.f3156b[q10] = obj;
                        q10++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                Arrays.fill(this.f3156b, q10, q11, (Object) null);
            } else {
                int length = this.f3156b.length;
                boolean z11 = false;
                int i9 = i;
                while (i < length) {
                    Object[] objArr = this.f3156b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.f3156b[i9] = obj2;
                        i9++;
                    } else {
                        z11 = true;
                    }
                    i++;
                }
                q10 = q(i9);
                for (int i10 = 0; i10 < q11; i10++) {
                    Object[] objArr2 = this.f3156b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!collection.contains(obj3)) {
                        this.f3156b[q10] = obj3;
                        q10 = i(q10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f3157c = n(q10 - this.f3155a);
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        Object[] objArr = this.f3156b;
        int i = this.f3155a;
        E e10 = (E) objArr[i];
        objArr[i] = null;
        this.f3155a = i(i);
        this.f3157c = a() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        int q10 = q(m.p(this) + this.f3155a);
        Object[] objArr = this.f3156b;
        E e10 = (E) objArr[q10];
        objArr[q10] = null;
        this.f3157c = a() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i9) {
        AbstractC0500b.a.a(i, i9, this.f3157c);
        int i10 = i9 - i;
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f3157c) {
            clear();
            return;
        }
        if (i10 == 1) {
            c(i);
            return;
        }
        r();
        if (i < this.f3157c - i9) {
            int q10 = q((i - 1) + this.f3155a);
            int q11 = q((i9 - 1) + this.f3155a);
            while (i > 0) {
                int i11 = q10 + 1;
                int min = Math.min(i, Math.min(i11, q11 + 1));
                Object[] objArr = this.f3156b;
                int i12 = q11 - min;
                int i13 = q10 - min;
                i.e(objArr, objArr, i12 + 1, i13 + 1, i11);
                q10 = n(i13);
                q11 = n(i12);
                i -= min;
            }
            int q12 = q(this.f3155a + i10);
            o(this.f3155a, q12);
            this.f3155a = q12;
        } else {
            int q13 = q(this.f3155a + i9);
            int q14 = q(this.f3155a + i);
            int i14 = this.f3157c;
            while (true) {
                i14 -= i9;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3156b;
                i9 = Math.min(i14, Math.min(objArr2.length - q13, objArr2.length - q14));
                Object[] objArr3 = this.f3156b;
                int i15 = q13 + i9;
                i.e(objArr3, objArr3, q14, q13, i15);
                q13 = q(i15);
                q14 = q(q14 + i9);
            }
            int q15 = q(this.f3157c + this.f3155a);
            o(n(q15 - i10), q15);
        }
        this.f3157c -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int q10;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f3156b.length != 0) {
            int q11 = q(a() + this.f3155a);
            int i = this.f3155a;
            if (i < q11) {
                q10 = i;
                while (i < q11) {
                    Object obj = this.f3156b[i];
                    if (collection.contains(obj)) {
                        this.f3156b[q10] = obj;
                        q10++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                Arrays.fill(this.f3156b, q10, q11, (Object) null);
            } else {
                int length = this.f3156b.length;
                boolean z11 = false;
                int i9 = i;
                while (i < length) {
                    Object[] objArr = this.f3156b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f3156b[i9] = obj2;
                        i9++;
                    } else {
                        z11 = true;
                    }
                    i++;
                }
                q10 = q(i9);
                for (int i10 = 0; i10 < q11; i10++) {
                    Object[] objArr2 = this.f3156b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj3)) {
                        this.f3156b[q10] = obj3;
                        q10 = i(q10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f3157c = n(q10 - this.f3155a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e10) {
        int a10 = a();
        if (i < 0 || i >= a10) {
            throw new IndexOutOfBoundsException(C.v.k(i, a10, "index: ", ", size: "));
        }
        int q10 = q(this.f3155a + i);
        Object[] objArr = this.f3156b;
        E e11 = (E) objArr[q10];
        objArr[q10] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f3157c;
        if (length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        int q10 = q(this.f3157c + this.f3155a);
        int i9 = this.f3155a;
        if (i9 < q10) {
            i.h(this.f3156b, tArr, i9, q10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f3156b;
            i.e(objArr, tArr, 0, this.f3155a, objArr.length);
            Object[] objArr2 = this.f3156b;
            i.e(objArr2, tArr, objArr2.length - this.f3155a, 0, q10);
        }
        int i10 = this.f3157c;
        if (i10 < tArr.length) {
            tArr[i10] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        r();
        f(collection.size() + a());
        e(q(a() + this.f3155a), collection);
        return true;
    }
}

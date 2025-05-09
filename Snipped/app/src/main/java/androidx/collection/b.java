package androidx.collection;

import P9.s;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet.jvm.kt */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, da.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5890a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5891b;

    /* renamed from: c, reason: collision with root package name */
    public int f5892c;

    /* compiled from: ArraySet.jvm.kt */
    public final class a extends c<E> {
        public a() {
            super(b.this.f5892c);
        }

        @Override // androidx.collection.c
        public final E a(int i) {
            return (E) b.this.f5891b[i];
        }

        @Override // androidx.collection.c
        public final void c(int i) {
            b.this.a(i);
        }
    }

    public b(int i) {
        this.f5890a = Q.a.f3175a;
        this.f5891b = Q.a.f3177c;
        if (i > 0) {
            this.f5890a = new int[i];
            this.f5891b = new Object[i];
        }
    }

    public final E a(int i) {
        int i9 = this.f5892c;
        Object[] objArr = this.f5891b;
        E e10 = (E) objArr[i];
        if (i9 <= 1) {
            clear();
        } else {
            int i10 = i9 - 1;
            int[] iArr = this.f5890a;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i < i10) {
                    int i11 = i + 1;
                    P9.i.d(i, i11, iArr, iArr, i9);
                    Object[] objArr2 = this.f5891b;
                    P9.i.e(objArr2, objArr2, i, i11, i9);
                }
                this.f5891b[i10] = null;
            } else {
                int i12 = i9 > 8 ? i9 + (i9 >> 1) : 8;
                int[] iArr2 = new int[i12];
                this.f5890a = iArr2;
                this.f5891b = new Object[i12];
                if (i > 0) {
                    P9.i.f(0, i, iArr, iArr2, 6);
                    P9.i.h(objArr, this.f5891b, 0, i, 6);
                }
                if (i < i10) {
                    int i13 = i + 1;
                    P9.i.d(i, i13, iArr, this.f5890a, i9);
                    P9.i.e(objArr, this.f5891b, i, i13, i9);
                }
            }
            if (i9 != this.f5892c) {
                throw new ConcurrentModificationException();
            }
            this.f5892c = i10;
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i;
        int b9;
        int i9 = this.f5892c;
        if (e10 == null) {
            b9 = e.b(this, null, 0);
            i = 0;
        } else {
            int hashCode = e10.hashCode();
            i = hashCode;
            b9 = e.b(this, e10, hashCode);
        }
        if (b9 >= 0) {
            return false;
        }
        int i10 = ~b9;
        int[] iArr = this.f5890a;
        if (i9 >= iArr.length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f5891b;
            int[] iArr2 = new int[i11];
            this.f5890a = iArr2;
            this.f5891b = new Object[i11];
            if (i9 != this.f5892c) {
                throw new ConcurrentModificationException();
            }
            if (!(iArr2.length == 0)) {
                P9.i.f(0, iArr.length, iArr, iArr2, 6);
                P9.i.h(objArr, this.f5891b, 0, objArr.length, 6);
            }
        }
        if (i10 < i9) {
            int[] iArr3 = this.f5890a;
            int i12 = i10 + 1;
            P9.i.d(i12, i10, iArr3, iArr3, i9);
            Object[] objArr2 = this.f5891b;
            P9.i.e(objArr2, objArr2, i12, i10, i9);
        }
        int i13 = this.f5892c;
        if (i9 == i13) {
            int[] iArr4 = this.f5890a;
            if (i10 < iArr4.length) {
                iArr4[i10] = i;
                this.f5891b[i10] = e10;
                this.f5892c = i13 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f5892c;
        int i = this.f5892c;
        int[] iArr = this.f5890a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5891b;
            int[] iArr2 = new int[size];
            this.f5890a = iArr2;
            this.f5891b = new Object[size];
            if (i > 0) {
                P9.i.f(0, i, iArr, iArr2, 6);
                P9.i.h(objArr, this.f5891b, 0, this.f5892c, 6);
            }
        }
        if (this.f5892c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f5892c != 0) {
            this.f5890a = Q.a.f3175a;
            this.f5891b = Q.a.f3177c;
            this.f5892c = 0;
        }
        if (this.f5892c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? e.b(this, null, 0) : e.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f5892c == ((Set) obj).size()) {
            try {
                int i = this.f5892c;
                for (int i9 = 0; i9 < i; i9++) {
                    if (((Set) obj).contains(this.f5891b[i9])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5890a;
        int i = this.f5892c;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5892c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b9 = obj == null ? e.b(this, null, 0) : e.b(this, obj, obj.hashCode());
        if (b9 < 0) {
            return false;
        }
        a(b9);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        boolean z10 = false;
        for (int i = this.f5892c - 1; -1 < i; i--) {
            if (!s.E(collection, this.f5891b[i])) {
                a(i);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5892c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f5891b;
        int i = this.f5892c;
        P9.i.i(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5892c * 14);
        sb2.append('{');
        int i = this.f5892c;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f5891b[i9];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int i = this.f5892c;
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        P9.i.e(this.f5891b, tArr, 0, 0, this.f5892c);
        return tArr;
    }

    public b() {
        this(0);
    }
}

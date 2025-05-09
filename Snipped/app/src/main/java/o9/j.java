package O9;

import da.InterfaceC0701a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: UIntArray.kt */
/* loaded from: classes2.dex */
public final class j implements Collection<i>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3022a;

    /* compiled from: UIntArray.kt */
    public static final class a implements Iterator<i>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f3023a;

        /* renamed from: b, reason: collision with root package name */
        public int f3024b;

        public a(int[] iArr) {
            this.f3023a = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3024b < this.f3023a.length;
        }

        @Override // java.util.Iterator
        public final i next() {
            int i = this.f3024b;
            int[] iArr = this.f3023a;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f3024b));
            }
            this.f3024b = i + 1;
            return new i(iArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        int i = ((i) obj).f3021a;
        int[] iArr = this.f3022a;
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            if (i == iArr[i9]) {
                return i9 >= 0;
            }
            i9++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r5 < 0) goto L21;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r8) {
        /*
            r7 = this;
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L35
        Ld:
            java.util.Iterator r8 = r8.iterator()
        L11:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r8.next()
            boolean r2 = r0 instanceof O9.i
            r3 = 0
            if (r2 == 0) goto L34
            O9.i r0 = (O9.i) r0
            int r0 = r0.f3021a
            int[] r2 = r7.f3022a
            int r4 = r2.length
            r5 = r3
        L28:
            if (r5 >= r4) goto L34
            r6 = r2[r5]
            if (r0 != r6) goto L31
            if (r5 < 0) goto L34
            goto L11
        L31:
            int r5 = r5 + 1
            goto L28
        L34:
            r1 = r3
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O9.j.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return kotlin.jvm.internal.f.b(this.f3022a, ((j) obj).f3022a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f3022a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3022a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<i> iterator() {
        return new a(this.f3022a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3022a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.c.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f3022a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.c.b(this, tArr);
    }
}

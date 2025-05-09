package O9;

import da.InterfaceC0701a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: UByteArray.kt */
/* loaded from: classes2.dex */
public final class h implements Collection<g>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3018a;

    /* compiled from: UByteArray.kt */
    public static final class a implements Iterator<g>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f3019a;

        /* renamed from: b, reason: collision with root package name */
        public int f3020b;

        public a(byte[] bArr) {
            this.f3019a = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3020b < this.f3019a.length;
        }

        @Override // java.util.Iterator
        public final g next() {
            int i = this.f3020b;
            byte[] bArr = this.f3019a;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f3020b));
            }
            this.f3020b = i + 1;
            return new g(bArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(g gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends g> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        byte b9 = ((g) obj).f3017a;
        byte[] bArr = this.f3018a;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (b9 == bArr[i]) {
                return i >= 0;
            }
            i++;
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
            boolean r2 = r0 instanceof O9.g
            r3 = 0
            if (r2 == 0) goto L34
            O9.g r0 = (O9.g) r0
            byte r0 = r0.f3017a
            byte[] r2 = r7.f3018a
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
        throw new UnsupportedOperationException("Method not decompiled: O9.h.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.f.b(this.f3018a, ((h) obj).f3018a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f3018a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3018a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<g> iterator() {
        return new a(this.f3018a);
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
        return this.f3018a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.c.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f3018a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.c.b(this, tArr);
    }
}

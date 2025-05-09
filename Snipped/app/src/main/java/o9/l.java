package O9;

import da.InterfaceC0701a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ULongArray.kt */
/* loaded from: classes2.dex */
public final class l implements Collection<k>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3026a;

    /* compiled from: ULongArray.kt */
    public static final class a implements Iterator<k>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f3027a;

        /* renamed from: b, reason: collision with root package name */
        public int f3028b;

        public a(long[] jArr) {
            this.f3027a = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3028b < this.f3027a.length;
        }

        @Override // java.util.Iterator
        public final k next() {
            int i = this.f3028b;
            long[] jArr = this.f3027a;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f3028b));
            }
            this.f3028b = i + 1;
            return new k(jArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        long j10 = ((k) obj).f3025a;
        long[] jArr = this.f3026a;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j10 == jArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r6 < 0) goto L19;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r10) {
        /*
            r9 = this;
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L37
        Ld:
            java.util.Iterator r10 = r10.iterator()
        L11:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r10.next()
            boolean r2 = r0 instanceof O9.k
            r3 = 0
            if (r2 == 0) goto L36
            O9.k r0 = (O9.k) r0
            long r4 = r0.f3025a
            long[] r0 = r9.f3026a
            int r2 = r0.length
            r6 = r3
        L28:
            if (r6 >= r2) goto L36
            r7 = r0[r6]
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto L33
            if (r6 < 0) goto L36
            goto L11
        L33:
            int r6 = r6 + 1
            goto L28
        L36:
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O9.l.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.f.b(this.f3026a, ((l) obj).f3026a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f3026a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3026a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<k> iterator() {
        return new a(this.f3026a);
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
        return this.f3026a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.c.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f3026a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.c.b(this, tArr);
    }
}

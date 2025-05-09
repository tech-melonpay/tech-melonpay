package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes.dex */
public final class A extends AbstractC0656c<Long> implements RandomAccess, S {

    /* renamed from: b, reason: collision with root package name */
    public long[] f10079b;

    /* renamed from: c, reason: collision with root package name */
    public int f10080c;

    static {
        new A(new long[0], 0).f10203a = false;
    }

    public A() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i9 = this.f10080c)) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10080c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        long[] jArr = this.f10079b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i9 - i);
        } else {
            long[] jArr2 = new long[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f10079b, i, jArr2, i + 1, this.f10080c - i);
            this.f10079b = jArr2;
        }
        this.f10079b[i] = longValue;
        this.f10080c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = C0673u.f10266a;
        collection.getClass();
        if (!(collection instanceof A)) {
            return super.addAll(collection);
        }
        A a10 = (A) collection;
        int i = a10.f10080c;
        if (i == 0) {
            return false;
        }
        int i9 = this.f10080c;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        long[] jArr = this.f10079b;
        if (i10 > jArr.length) {
            this.f10079b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(a10.f10079b, 0, this.f10079b, this.f10080c, a10.f10080c);
        this.f10080c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j10) {
        a();
        int i = this.f10080c;
        long[] jArr = this.f10079b;
        if (i == jArr.length) {
            long[] jArr2 = new long[androidx.camera.core.impl.utils.a.b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f10079b = jArr2;
        }
        long[] jArr3 = this.f10079b;
        int i9 = this.f10080c;
        this.f10080c = i9 + 1;
        jArr3[i9] = j10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10080c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10080c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return super.equals(obj);
        }
        A a10 = (A) obj;
        if (this.f10080c != a10.f10080c) {
            return false;
        }
        long[] jArr = a10.f10079b;
        for (int i = 0; i < this.f10080c; i++) {
            if (this.f10079b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Long.valueOf(this.f10079b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.f10080c; i9++) {
            i = (i * 31) + C0673u.b(this.f10079b[i9]);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10080c) {
            return new A(Arrays.copyOf(this.f10079b, i), this.f10080c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f10080c; i++) {
            if (obj.equals(Long.valueOf(this.f10079b[i]))) {
                long[] jArr = this.f10079b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f10080c - i) - 1);
                this.f10080c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i9) {
        a();
        if (i9 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10079b;
        System.arraycopy(jArr, i9, jArr, i, this.f10080c - i9);
        this.f10080c -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i);
        long[] jArr = this.f10079b;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10080c;
    }

    public A(long[] jArr, int i) {
        this.f10079b = jArr;
        this.f10080c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        long[] jArr = this.f10079b;
        long j10 = jArr[i];
        if (i < this.f10080c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f10080c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}

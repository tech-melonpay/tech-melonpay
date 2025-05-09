package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672t extends AbstractC0656c<Integer> implements RandomAccess, S {

    /* renamed from: b, reason: collision with root package name */
    public int[] f10264b;

    /* renamed from: c, reason: collision with root package name */
    public int f10265c;

    static {
        new C0672t(new int[0], 0).f10203a = false;
    }

    public C0672t() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i9 = this.f10265c)) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10265c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        int[] iArr = this.f10264b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i9 - i);
        } else {
            int[] iArr2 = new int[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f10264b, i, iArr2, i + 1, this.f10265c - i);
            this.f10264b = iArr2;
        }
        this.f10264b[i] = intValue;
        this.f10265c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = C0673u.f10266a;
        collection.getClass();
        if (!(collection instanceof C0672t)) {
            return super.addAll(collection);
        }
        C0672t c0672t = (C0672t) collection;
        int i = c0672t.f10265c;
        if (i == 0) {
            return false;
        }
        int i9 = this.f10265c;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        int[] iArr = this.f10264b;
        if (i10 > iArr.length) {
            this.f10264b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c0672t.f10264b, 0, this.f10264b, this.f10265c, c0672t.f10265c);
        this.f10265c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a();
        int i9 = this.f10265c;
        int[] iArr = this.f10264b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f10264b = iArr2;
        }
        int[] iArr3 = this.f10264b;
        int i10 = this.f10265c;
        this.f10265c = i10 + 1;
        iArr3[i10] = i;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10265c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10265c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0672t)) {
            return super.equals(obj);
        }
        C0672t c0672t = (C0672t) obj;
        if (this.f10265c != c0672t.f10265c) {
            return false;
        }
        int[] iArr = c0672t.f10264b;
        for (int i = 0; i < this.f10265c; i++) {
            if (this.f10264b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Integer.valueOf(this.f10264b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.f10265c; i9++) {
            i = (i * 31) + this.f10264b[i9];
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10265c) {
            return new C0672t(Arrays.copyOf(this.f10264b, i), this.f10265c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f10265c; i++) {
            if (obj.equals(Integer.valueOf(this.f10264b[i]))) {
                int[] iArr = this.f10264b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f10265c - i) - 1);
                this.f10265c--;
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
        int[] iArr = this.f10264b;
        System.arraycopy(iArr, i9, iArr, i, this.f10265c - i9);
        this.f10265c -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.f10264b;
        int i9 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10265c;
    }

    public C0672t(int[] iArr, int i) {
        this.f10264b = iArr;
        this.f10265c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.f10264b;
        int i9 = iArr[i];
        if (i < this.f10265c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f10265c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}

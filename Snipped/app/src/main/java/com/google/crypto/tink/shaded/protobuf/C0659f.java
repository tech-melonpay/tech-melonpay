package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659f extends AbstractC0656c<Boolean> implements RandomAccess, S {

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f10216b;

    /* renamed from: c, reason: collision with root package name */
    public int f10217c;

    static {
        new C0659f(new boolean[0], 0).f10203a = false;
    }

    public C0659f() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i9 = this.f10217c)) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10217c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        boolean[] zArr = this.f10216b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i9 - i);
        } else {
            boolean[] zArr2 = new boolean[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f10216b, i, zArr2, i + 1, this.f10217c - i);
            this.f10216b = zArr2;
        }
        this.f10216b[i] = booleanValue;
        this.f10217c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = C0673u.f10266a;
        collection.getClass();
        if (!(collection instanceof C0659f)) {
            return super.addAll(collection);
        }
        C0659f c0659f = (C0659f) collection;
        int i = c0659f.f10217c;
        if (i == 0) {
            return false;
        }
        int i9 = this.f10217c;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        boolean[] zArr = this.f10216b;
        if (i10 > zArr.length) {
            this.f10216b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(c0659f.f10216b, 0, this.f10216b, this.f10217c, c0659f.f10217c);
        this.f10217c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z10) {
        a();
        int i = this.f10217c;
        boolean[] zArr = this.f10216b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.camera.core.impl.utils.a.b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f10216b = zArr2;
        }
        boolean[] zArr3 = this.f10216b;
        int i9 = this.f10217c;
        this.f10217c = i9 + 1;
        zArr3[i9] = z10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10217c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10217c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0659f)) {
            return super.equals(obj);
        }
        C0659f c0659f = (C0659f) obj;
        if (this.f10217c != c0659f.f10217c) {
            return false;
        }
        boolean[] zArr = c0659f.f10216b;
        for (int i = 0; i < this.f10217c; i++) {
            if (this.f10216b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Boolean.valueOf(this.f10216b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.f10217c; i9++) {
            int i10 = i * 31;
            boolean z10 = this.f10216b[i9];
            Charset charset = C0673u.f10266a;
            i = i10 + (z10 ? 1231 : 1237);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10217c) {
            return new C0659f(Arrays.copyOf(this.f10216b, i), this.f10217c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f10217c; i++) {
            if (obj.equals(Boolean.valueOf(this.f10216b[i]))) {
                boolean[] zArr = this.f10216b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f10217c - i) - 1);
                this.f10217c--;
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
        boolean[] zArr = this.f10216b;
        System.arraycopy(zArr, i9, zArr, i, this.f10217c - i9);
        this.f10217c -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i);
        boolean[] zArr = this.f10216b;
        boolean z10 = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10217c;
    }

    public C0659f(boolean[] zArr, int i) {
        this.f10216b = zArr;
        this.f10217c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        boolean[] zArr = this.f10216b;
        boolean z10 = zArr[i];
        if (i < this.f10217c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f10217c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}

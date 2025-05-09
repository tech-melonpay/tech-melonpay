package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664k extends AbstractC0656c<Double> implements RandomAccess, S {

    /* renamed from: b, reason: collision with root package name */
    public double[] f10247b;

    /* renamed from: c, reason: collision with root package name */
    public int f10248c;

    static {
        new C0664k(new double[0], 0).f10203a = false;
    }

    public C0664k() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i9 = this.f10248c)) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10248c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        double[] dArr = this.f10247b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i9 - i);
        } else {
            double[] dArr2 = new double[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f10247b, i, dArr2, i + 1, this.f10248c - i);
            this.f10247b = dArr2;
        }
        this.f10247b[i] = doubleValue;
        this.f10248c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = C0673u.f10266a;
        collection.getClass();
        if (!(collection instanceof C0664k)) {
            return super.addAll(collection);
        }
        C0664k c0664k = (C0664k) collection;
        int i = c0664k.f10248c;
        if (i == 0) {
            return false;
        }
        int i9 = this.f10248c;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        double[] dArr = this.f10247b;
        if (i10 > dArr.length) {
            this.f10247b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(c0664k.f10247b, 0, this.f10247b, this.f10248c, c0664k.f10248c);
        this.f10248c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d10) {
        a();
        int i = this.f10248c;
        double[] dArr = this.f10247b;
        if (i == dArr.length) {
            double[] dArr2 = new double[androidx.camera.core.impl.utils.a.b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f10247b = dArr2;
        }
        double[] dArr3 = this.f10247b;
        int i9 = this.f10248c;
        this.f10248c = i9 + 1;
        dArr3[i9] = d10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10248c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10248c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0664k)) {
            return super.equals(obj);
        }
        C0664k c0664k = (C0664k) obj;
        if (this.f10248c != c0664k.f10248c) {
            return false;
        }
        double[] dArr = c0664k.f10247b;
        for (int i = 0; i < this.f10248c; i++) {
            if (Double.doubleToLongBits(this.f10247b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Double.valueOf(this.f10247b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.f10248c; i9++) {
            i = (i * 31) + C0673u.b(Double.doubleToLongBits(this.f10247b[i9]));
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10248c) {
            return new C0664k(Arrays.copyOf(this.f10247b, i), this.f10248c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f10248c; i++) {
            if (obj.equals(Double.valueOf(this.f10247b[i]))) {
                double[] dArr = this.f10247b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f10248c - i) - 1);
                this.f10248c--;
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
        double[] dArr = this.f10247b;
        System.arraycopy(dArr, i9, dArr, i, this.f10248c - i9);
        this.f10248c -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i);
        double[] dArr = this.f10247b;
        double d10 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10248c;
    }

    public C0664k(double[] dArr, int i) {
        this.f10247b = dArr;
        this.f10248c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        double[] dArr = this.f10247b;
        double d10 = dArr[i];
        if (i < this.f10248c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f10248c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}

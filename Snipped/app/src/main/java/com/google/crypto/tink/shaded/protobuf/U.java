package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
public final class U<E> extends AbstractC0656c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final U<Object> f10161d;

    /* renamed from: b, reason: collision with root package name */
    public E[] f10162b;

    /* renamed from: c, reason: collision with root package name */
    public int f10163c;

    static {
        U<Object> u6 = new U<>(new Object[0], 0);
        f10161d = u6;
        u6.f10203a = false;
    }

    public U(E[] eArr, int i) {
        this.f10162b = eArr;
        this.f10163c = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i = this.f10163c;
        E[] eArr = this.f10162b;
        if (i == eArr.length) {
            this.f10162b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10162b;
        int i9 = this.f10163c;
        this.f10163c = i9 + 1;
        eArr2[i9] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f10163c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10163c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        b(i);
        return this.f10162b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10163c) {
            return new U(Arrays.copyOf(this.f10162b, i), this.f10163c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        b(i);
        E[] eArr = this.f10162b;
        E e10 = eArr[i];
        if (i < this.f10163c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.f10163c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e10) {
        a();
        b(i);
        E[] eArr = this.f10162b;
        E e11 = eArr[i];
        eArr[i] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10163c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e10) {
        int i9;
        a();
        if (i >= 0 && i <= (i9 = this.f10163c)) {
            E[] eArr = this.f10162b;
            if (i9 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i9 - i);
            } else {
                E[] eArr2 = (E[]) new Object[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f10162b, i, eArr2, i + 1, this.f10163c - i);
                this.f10162b = eArr2;
            }
            this.f10162b[i] = e10;
            this.f10163c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
        l10.append(this.f10163c);
        throw new IndexOutOfBoundsException(l10.toString());
    }
}

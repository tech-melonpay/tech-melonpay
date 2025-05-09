package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes.dex */
public final class r extends AbstractC0656c<Float> implements RandomAccess, S {

    /* renamed from: b, reason: collision with root package name */
    public float[] f10261b;

    /* renamed from: c, reason: collision with root package name */
    public int f10262c;

    static {
        new r(new float[0], 0).f10203a = false;
    }

    public r() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i9 = this.f10262c)) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10262c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        float[] fArr = this.f10261b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i9 - i);
        } else {
            float[] fArr2 = new float[androidx.camera.core.impl.utils.a.b(i9, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f10261b, i, fArr2, i + 1, this.f10262c - i);
            this.f10261b = fArr2;
        }
        this.f10261b[i] = floatValue;
        this.f10262c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = C0673u.f10266a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i = rVar.f10262c;
        if (i == 0) {
            return false;
        }
        int i9 = this.f10262c;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        float[] fArr = this.f10261b;
        if (i10 > fArr.length) {
            this.f10261b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(rVar.f10261b, 0, this.f10261b, this.f10262c, rVar.f10262c);
        this.f10262c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f10) {
        a();
        int i = this.f10262c;
        float[] fArr = this.f10261b;
        if (i == fArr.length) {
            float[] fArr2 = new float[androidx.camera.core.impl.utils.a.b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f10261b = fArr2;
        }
        float[] fArr3 = this.f10261b;
        int i9 = this.f10262c;
        this.f10262c = i9 + 1;
        fArr3[i9] = f10;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f10262c) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Index:", i, ", Size:");
            l10.append(this.f10262c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f10262c != rVar.f10262c) {
            return false;
        }
        float[] fArr = rVar.f10261b;
        for (int i = 0; i < this.f10262c; i++) {
            if (Float.floatToIntBits(this.f10261b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Float.valueOf(this.f10261b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.f10262c; i9++) {
            i = (i * 31) + Float.floatToIntBits(this.f10261b[i9]);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        if (i >= this.f10262c) {
            return new r(Arrays.copyOf(this.f10261b, i), this.f10262c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f10262c; i++) {
            if (obj.equals(Float.valueOf(this.f10261b[i]))) {
                float[] fArr = this.f10261b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f10262c - i) - 1);
                this.f10262c--;
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
        float[] fArr = this.f10261b;
        System.arraycopy(fArr, i9, fArr, i, this.f10262c - i9);
        this.f10262c -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i);
        float[] fArr = this.f10261b;
        float f10 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10262c;
    }

    public r(float[] fArr, int i) {
        this.f10261b = fArr;
        this.f10262c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        float[] fArr = this.f10261b;
        float f10 = fArr[i];
        if (i < this.f10262c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f10262c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}

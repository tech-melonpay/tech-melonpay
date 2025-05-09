package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzll<E> extends zzii<E> implements RandomAccess {
    private static final zzll<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzll<Object> zzllVar = new zzll<>(new Object[0], 0);
        zza = zzllVar;
        zzllVar.zzb();
    }

    public zzll() {
        this(new Object[10], 0);
    }

    public static <E> zzll<E> zze() {
        return (zzll<E>) zza;
    }

    private final String zzf(int i) {
        return a.f(35, "Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final void add(int i, E e10) {
        int i9;
        zzbM();
        if (i < 0 || i > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        E[] eArr = this.zzb;
        if (i9 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i9 - i);
        } else {
            E[] eArr2 = (E[]) new Object[a.b(i9, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e10;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzbM();
        zzg(i);
        E[] eArr = this.zzb;
        E e10 = eArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final E set(int i, E e10) {
        zzbM();
        zzg(i);
        E[] eArr = this.zzb;
        E e11 = eArr[i];
        eArr[i] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final /* bridge */ /* synthetic */ zzke zzd(int i) {
        if (i >= this.zzc) {
            return new zzll(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzll(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        zzbM();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        eArr2[i9] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}

package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzkr extends zzii<Long> implements RandomAccess, zzkd, zzlj {
    private static final zzkr zza;
    private long[] zzb;
    private int zzc;

    static {
        zzkr zzkrVar = new zzkr(new long[0], 0);
        zza = zzkrVar;
        zzkrVar.zzb();
    }

    public zzkr() {
        this(new long[10], 0);
    }

    public static zzkr zzf() {
        return zza;
    }

    private final String zzh(int i) {
        return a.f(35, "Index:", i, ", Size:", this.zzc);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        zzbM();
        if (i < 0 || i > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        long[] jArr = this.zzb;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i9 - i);
        } else {
            long[] jArr2 = new long[a.b(i9, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
            this.zzb = jArr2;
        }
        this.zzb[i] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbM();
        zzkf.zze(collection);
        if (!(collection instanceof zzkr)) {
            return super.addAll(collection);
        }
        zzkr zzkrVar = (zzkr) collection;
        int i = zzkrVar.zzc;
        if (i == 0) {
            return false;
        }
        int i9 = this.zzc;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        long[] jArr = this.zzb;
        if (i10 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(zzkrVar.zzb, 0, this.zzb, this.zzc, zzkrVar.zzc);
        this.zzc = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkr)) {
            return super.equals(obj);
        }
        zzkr zzkrVar = (zzkr) obj;
        if (this.zzc != zzkrVar.zzc) {
            return false;
        }
        long[] jArr = zzkrVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            i = (i * 31) + zzkf.zzc(this.zzb[i9]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzc;
        for (int i9 = 0; i9 < i; i9++) {
            if (this.zzb[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        zzi(i);
        long[] jArr = this.zzb;
        long j10 = jArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i9) {
        zzbM();
        if (i9 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i9, jArr, i, this.zzc - i9);
        this.zzc -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbM();
        zzi(i);
        long[] jArr = this.zzb;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkd
    public final long zza(int i) {
        zzi(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzkd zzd(int i) {
        if (i >= this.zzc) {
            return new zzkr(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j10) {
        zzbM();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[a.b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        jArr3[i9] = j10;
    }

    private zzkr(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}

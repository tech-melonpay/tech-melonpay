package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzuq extends zzsj<Float> implements RandomAccess, zzvh, zzws {
    private static final zzuq zza;
    private float[] zzb;
    private int zzc;

    static {
        zzuq zzuqVar = new zzuq(new float[0], 0);
        zza = zzuqVar;
        zzuqVar.zzb();
    }

    public zzuq() {
        this(new float[10], 0);
    }

    private final String zzf(int i) {
        return a.f(35, "Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        float[] fArr = this.zzb;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i9 - i);
        } else {
            float[] fArr2 = new float[a.b(i9, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzvi.zze(collection);
        if (!(collection instanceof zzuq)) {
            return super.addAll(collection);
        }
        zzuq zzuqVar = (zzuq) collection;
        int i = zzuqVar.zzc;
        if (i == 0) {
            return false;
        }
        int i9 = this.zzc;
        if (Integer.MAX_VALUE - i9 < i) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i;
        float[] fArr = this.zzb;
        if (i10 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(zzuqVar.zzb, 0, this.zzb, this.zzc, zzuqVar.zzc);
        this.zzc = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuq)) {
            return super.equals(obj);
        }
        zzuq zzuqVar = (zzuq) obj;
        if (this.zzc != zzuqVar.zzc) {
            return false;
        }
        float[] fArr = zzuqVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzg(i);
        return Float.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i9]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.zzc;
        for (int i9 = 0; i9 < i; i9++) {
            if (this.zzb[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        float[] fArr = this.zzb;
        float f10 = fArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i9) {
        zza();
        if (i9 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i9, fArr, i, this.zzc - i9);
        this.zzc -= i9 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i);
        float[] fArr = this.zzb;
        float f10 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzvh
    public final /* bridge */ /* synthetic */ zzvh zzd(int i) {
        if (i >= this.zzc) {
            return new zzuq(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f10) {
        zza();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[a.b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        fArr3[i9] = f10;
    }

    private zzuq(float[] fArr, int i) {
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzbt extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzbt() {
        zzm(3);
    }

    public static /* synthetic */ Object zzh(zzbt zzbtVar) {
        Object obj = zzbtVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzq(Object obj) {
        if (zzo()) {
            return -1;
        }
        int zza = zzbv.zza(obj);
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzbu.zzc(obj2, zza & zzp);
        if (zzc != 0) {
            int i = ~zzp;
            int i9 = zza & i;
            do {
                int i10 = zzc - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i11 = iArr[i10];
                if ((i11 & i) == i9) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (zzam.zza(obj, objArr[i10])) {
                        return i10;
                    }
                }
                zzc = i11 & zzp;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzr(int i, int i9, int i10, int i11) {
        int i12 = i9 - 1;
        Object zzd2 = zzbu.zzd(i9);
        if (i11 != 0) {
            zzbu.zze(zzd2, i10 & i12, i11 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i13 = 0; i13 <= i; i13++) {
            int zzc = zzbu.zzc(obj, i13);
            while (zzc != 0) {
                int i14 = zzc - 1;
                int i15 = iArr[i14];
                int i16 = ((~i) & i15) | i13;
                int i17 = i16 & i12;
                int zzc2 = zzbu.zzc(zzd2, i17);
                zzbu.zze(zzd2, i17, zzc);
                iArr[i14] = ((~i12) & i16) | (zzc2 & i12);
                zzc = i15 & i;
            }
        }
        this.zze = zzd2;
        zzt(i12);
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzs(Object obj) {
        if (zzo()) {
            return zzd;
        }
        int zzp = zzp();
        Object obj2 = this.zze;
        obj2.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        int zzb = zzbu.zzb(obj, null, zzp, obj2, iArr, objArr, null);
        if (zzb == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Object obj3 = objArr2[zzb];
        zzn(zzb, zzp);
        this.zzg--;
        zzl();
        return obj3;
    }

    private final void zzt(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzo()) {
            return;
        }
        zzl();
        Map zzj = zzj();
        if (zzj != null) {
            this.zzf = zzdd.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzj.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Object[] objArr = this.zzb;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.zzg, (Object) null);
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzj = zzj();
        return zzj != null ? zzj.containsKey(obj) : zzq(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            Object[] objArr = this.zzc;
            objArr.getClass();
            if (zzam.zza(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzbn zzbnVar = new zzbn(this);
        this.zzi = zzbnVar;
        return zzbnVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.get(obj);
        }
        int zzq = zzq(obj);
        if (zzq == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[zzq];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzbq zzbqVar = new zzbq(this);
        this.zzh = zzbqVar;
        return zzbqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzo()) {
            zzaq.zzd(zzo(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzbu.zzd(max2);
            zzt(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.put(obj, obj2);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int i9 = this.zzg;
        int i10 = i9 + 1;
        int zza = zzbv.zza(obj);
        int zzp = zzp();
        int i11 = zza & zzp;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzbu.zzc(obj3, i11);
        if (zzc != 0) {
            int i12 = ~zzp;
            int i13 = zza & i12;
            int i14 = 0;
            while (true) {
                int i15 = zzc - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i12;
                if (i17 == i13 && zzam.zza(obj, objArr[i15])) {
                    Object obj4 = objArr2[i15];
                    objArr2[i15] = obj2;
                    return obj4;
                }
                int i18 = i16 & zzp;
                i14++;
                if (i18 != 0) {
                    zzc = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            Object[] objArr3 = this.zzb;
                            objArr3.getClass();
                            Object obj5 = objArr3[zze];
                            Object[] objArr4 = this.zzc;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzl();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > zzp) {
                        zzp = zzr(zzp, zzbu.zza(zzp), zza, i9);
                    } else {
                        iArr[i15] = (i10 & zzp) | i17;
                    }
                }
            }
        } else if (i10 > zzp) {
            zzp = zzr(zzp, zzbu.zza(zzp), zza, i9);
        } else {
            Object obj6 = this.zze;
            obj6.getClass();
            zzbu.zze(obj6, i11, i10);
        }
        int[] iArr2 = this.zza;
        iArr2.getClass();
        int length = iArr2.length;
        if (i10 > length && (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.zza;
            iArr3.getClass();
            this.zza = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.zzb;
            objArr5.getClass();
            this.zzb = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.zzc;
            objArr6.getClass();
            this.zzc = Arrays.copyOf(objArr6, min);
        }
        int i19 = (~zzp) & zza;
        int[] iArr4 = this.zza;
        iArr4.getClass();
        iArr4[i9] = i19;
        Object[] objArr7 = this.zzb;
        objArr7.getClass();
        objArr7[i9] = obj;
        Object[] objArr8 = this.zzc;
        objArr8.getClass();
        objArr8[i9] = obj2;
        this.zzg = i10;
        zzl();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzj = zzj();
        if (zzj != null) {
            return zzj.remove(obj);
        }
        Object zzs = zzs(obj);
        if (zzs == zzd) {
            return null;
        }
        return zzs;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzj = zzj();
        return zzj != null ? zzj.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzbs zzbsVar = new zzbs(this);
        this.zzj = zzbsVar;
        return zzbsVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i9 = i + 1;
        if (i9 < this.zzg) {
            return i9;
        }
        return -1;
    }

    public final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzl() {
        this.zzf += 32;
    }

    public final void zzm(int i) {
        this.zzf = zzdd.zza(12, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public final void zzn(int i, int i9) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size();
        int i10 = size - 1;
        if (i >= i10) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i10];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i10];
        objArr[i10] = null;
        objArr2[i10] = null;
        iArr[i] = iArr[i10];
        iArr[i10] = 0;
        int zza = zzbv.zza(obj2) & i9;
        int zzc = zzbu.zzc(obj, zza);
        if (zzc == size) {
            zzbu.zze(obj, zza, i + 1);
            return;
        }
        while (true) {
            int i11 = zzc - 1;
            int i12 = iArr[i11];
            int i13 = i12 & i9;
            if (i13 == size) {
                iArr[i11] = ((i + 1) & i9) | (i12 & (~i9));
                return;
            }
            zzc = i13;
        }
    }

    public final boolean zzo() {
        return this.zze == null;
    }

    public zzbt(int i) {
        zzm(12);
    }
}

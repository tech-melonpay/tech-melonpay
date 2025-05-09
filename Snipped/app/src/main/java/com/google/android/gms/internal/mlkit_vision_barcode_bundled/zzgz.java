package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.core.impl.utils.a;
import java.util.Arrays;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgz(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgz zzc() {
        return zza;
    }

    public static zzgz zze(zzgz zzgzVar, zzgz zzgzVar2) {
        int i = zzgzVar.zzb + zzgzVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgzVar.zzc, i);
        System.arraycopy(zzgzVar2.zzc, 0, copyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzVar.zzd, i);
        System.arraycopy(zzgzVar2.zzd, 0, copyOf2, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i, copyOf, copyOf2, true);
    }

    public static zzgz zzf() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i9 = this.zzb;
            int i10 = (i9 / 2) + i9;
            if (i10 >= i) {
                i = i10;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i = this.zzb;
        if (i == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
                    int i10 = this.zzb;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i9 = i + 527;
        int[] iArr = this.zzc;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 * 31) + i11;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + i10;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                i9 = a.z(i12 << 3, zzdj.zzz(((Long) this.zzd[i10]).longValue()), i9);
            } else if (i13 == 1) {
                ((Long) this.zzd[i10]).getClass();
                i9 = a.z(i12 << 3, 8, i9);
            } else if (i13 == 2) {
                zzdb zzdbVar = (zzdb) this.zzd[i10];
                int i14 = zzdj.zzb;
                int zzd = zzdbVar.zzd();
                i9 = a.z(i12 << 3, zzdj.zzy(zzd) + zzd, i9);
            } else if (i13 == 3) {
                int i15 = i12 << 3;
                int i16 = zzdj.zzb;
                int zza2 = ((zzgz) this.zzd[i10]).zza();
                int zzy = zzdj.zzy(i15);
                i9 = zzy + zzy + zza2 + i9;
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException(zzeo.zza());
                }
                ((Integer) this.zzd[i10]).getClass();
                i9 = a.z(i12 << 3, 4, i9);
            }
        }
        this.zze = i9;
        return i9;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzdb zzdbVar = (zzdb) this.zzd[i10];
            int i12 = zzdj.zzb;
            int zzd = zzdbVar.zzd();
            int zzy = zzdj.zzy(zzd) + zzd;
            int zzy2 = zzdj.zzy(16);
            int zzy3 = zzdj.zzy(i11);
            int zzy4 = zzdj.zzy(8);
            i9 = a.C(24, zzy, zzy2 + zzy3 + zzy4 + zzy4, i9);
        }
        this.zze = i9;
        return i9;
    }

    public final zzgz zzd(zzgz zzgzVar) {
        if (zzgzVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgzVar.zzb;
        zzm(i);
        System.arraycopy(zzgzVar.zzc, 0, this.zzc, this.zzb, zzgzVar.zzb);
        System.arraycopy(zzgzVar.zzd, 0, this.zzd, this.zzb, zzgzVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        this.zzf = false;
    }

    public final void zzi(StringBuilder sb2, int i) {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzfq.zzb(sb2, i, String.valueOf(this.zzc[i9] >>> 3), this.zzd[i9]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i9 = this.zzb;
        iArr[i9] = i;
        this.zzd[i9] = obj;
        this.zzb = i9 + 1;
    }

    public final void zzk(zzhq zzhqVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzhqVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhq zzhqVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i9 = this.zzc[i];
                Object obj = this.zzd[i];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    zzhqVar.zzt(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    zzhqVar.zzm(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    zzhqVar.zzd(i11, (zzdb) obj);
                } else if (i10 == 3) {
                    zzhqVar.zzF(i11);
                    ((zzgz) obj).zzl(zzhqVar);
                    zzhqVar.zzh(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(zzeo.zza());
                    }
                    zzhqVar.zzk(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}

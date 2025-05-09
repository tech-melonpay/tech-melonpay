package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public final class zzmc {
    private static final zzmc zza = new zzmc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmc(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmc zzc() {
        return zza;
    }

    public static zzmc zzd(zzmc zzmcVar, zzmc zzmcVar2) {
        int i = zzmcVar.zzb + zzmcVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmcVar.zzc, i);
        System.arraycopy(zzmcVar2.zzc, 0, copyOf, zzmcVar.zzb, zzmcVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmcVar.zzd, i);
        System.arraycopy(zzmcVar2.zzd, 0, copyOf2, zzmcVar.zzb, zzmcVar2.zzb);
        return new zzmc(i, copyOf, copyOf2, true);
    }

    public static zzmc zze() {
        return new zzmc(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmc)) {
            return false;
        }
        zzmc zzmcVar = (zzmc) obj;
        int i = this.zzb;
        if (i == zzmcVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmcVar.zzc;
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmcVar.zzd;
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
        int i9 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    i9 = a.v(i12 << 3, 8, i9);
                } else if (i13 == 2) {
                    zzix zzixVar = (zzix) this.zzd[i10];
                    int zzA2 = zzje.zzA(i12 << 3);
                    int zzd = zzixVar.zzd();
                    i9 = a.A(zzd, zzd, zzA2, i9);
                } else if (i13 == 3) {
                    int zzz = zzje.zzz(i12);
                    zzA = zzz + zzz;
                    zzB = ((zzmc) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzkh.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    i9 = a.v(i12 << 3, 4, i9);
                }
            } else {
                long longValue = ((Long) this.zzd[i10]).longValue();
                zzA = zzje.zzA(i12 << 3);
                zzB = zzje.zzB(longValue);
            }
            i9 = zzB + zzA + i9;
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
            int i11 = this.zzc[i10];
            zzix zzixVar = (zzix) this.zzd[i10];
            int zzA = zzje.zzA(8);
            int zzd = zzixVar.zzd();
            i9 += zzje.zzA(zzd) + zzd + zzje.zzA(24) + a.v(i11 >>> 3, zzje.zzA(16), zzA + zzA);
        }
        this.zze = i9;
        return i9;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i) {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzle.zzb(sb2, i, String.valueOf(this.zzc[i9] >>> 3), this.zzd[i9]);
        }
    }

    public final void zzh(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i9 = this.zzb;
        int[] iArr = this.zzc;
        if (i9 == iArr.length) {
            int i10 = i9 + (i9 < 4 ? 8 : i9 >> 1);
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
        int[] iArr2 = this.zzc;
        int i11 = this.zzb;
        iArr2[i11] = i;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzi(zzjf zzjfVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i9 = this.zzc[i];
                Object obj = this.zzd[i];
                int i10 = i9 >>> 3;
                int i11 = i9 & 7;
                if (i11 == 0) {
                    zzjfVar.zzt(i10, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzjfVar.zzm(i10, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzjfVar.zzd(i10, (zzix) obj);
                } else if (i11 == 3) {
                    zzjfVar.zzE(i10);
                    ((zzmc) obj).zzi(zzjfVar);
                    zzjfVar.zzh(i10);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzkh.zza());
                    }
                    zzjfVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmc() {
        this(0, new int[8], new Object[8], true);
    }
}

package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzxp {
    private static final zzxp zza = new zzxp(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzxp(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzxp zzc() {
        return zza;
    }

    public static zzxp zzd(zzxp zzxpVar, zzxp zzxpVar2) {
        int i = zzxpVar.zzb + zzxpVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzxpVar.zzc, i);
        System.arraycopy(zzxpVar2.zzc, 0, copyOf, zzxpVar.zzb, zzxpVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzxpVar.zzd, i);
        System.arraycopy(zzxpVar2.zzd, 0, copyOf2, zzxpVar.zzb, zzxpVar2.zzb);
        return new zzxp(i, copyOf, copyOf2, true);
    }

    public static zzxp zze() {
        return new zzxp(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxp)) {
            return false;
        }
        zzxp zzxpVar = (zzxp) obj;
        int i = this.zzb;
        if (i == zzxpVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzxpVar.zzc;
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzxpVar.zzd;
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
        int zzD;
        int zzE;
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
                    i9 = a.a(i12 << 3, 8, i9);
                } else if (i13 == 2) {
                    zztd zztdVar = (zztd) this.zzd[i10];
                    int zzD2 = zzto.zzD(i12 << 3);
                    int zzd = zztdVar.zzd();
                    i9 = a.w(zzd, zzd, zzD2, i9);
                } else if (i13 == 3) {
                    int zzC = zzto.zzC(i12);
                    zzD = zzC + zzC;
                    zzE = ((zzxp) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzvk.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    i9 = a.a(i12 << 3, 4, i9);
                }
            } else {
                long longValue = ((Long) this.zzd[i10]).longValue();
                zzD = zzto.zzD(i12 << 3);
                zzE = zzto.zzE(longValue);
            }
            i9 = zzE + zzD + i9;
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
            zztd zztdVar = (zztd) this.zzd[i10];
            int zzD = zzto.zzD(8);
            int zzd = zztdVar.zzd();
            i9 += zzto.zzD(zzd) + zzd + zzto.zzD(24) + a.a(i11 >>> 3, zzto.zzD(16), zzD + zzD);
        }
        this.zze = i9;
        return i9;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i) {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzwm.zzb(sb2, i, String.valueOf(this.zzc[i9] >>> 3), this.zzd[i9]);
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

    public final void zzi(zztp zztpVar) {
        for (int i = 0; i < this.zzb; i++) {
            zztpVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzj(zztp zztpVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i9 = this.zzc[i];
                Object obj = this.zzd[i];
                int i10 = i9 >>> 3;
                int i11 = i9 & 7;
                if (i11 == 0) {
                    zztpVar.zzt(i10, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zztpVar.zzm(i10, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zztpVar.zzd(i10, (zztd) obj);
                } else if (i11 == 3) {
                    zztpVar.zzF(i10);
                    ((zzxp) obj).zzj(zztpVar);
                    zztpVar.zzh(i10);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzvk.zza());
                    }
                    zztpVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzxp() {
        this(0, new int[8], new Object[8], true);
    }
}

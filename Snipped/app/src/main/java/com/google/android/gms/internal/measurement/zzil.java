package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzil {
    public static int zza(byte[] bArr, int i, zzik zzikVar) {
        int zzj = zzj(bArr, i, zzikVar);
        int i9 = zzikVar.zza;
        if (i9 < 0) {
            throw zzkh.zzd();
        }
        if (i9 > bArr.length - zzj) {
            throw zzkh.zzf();
        }
        if (i9 == 0) {
            zzikVar.zzc = zzix.zzb;
            return zzj;
        }
        zzikVar.zzc = zzix.zzl(bArr, zzj, i9);
        return zzj + i9;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzln zzlnVar, byte[] bArr, int i, int i9, int i10, zzik zzikVar) {
        zzlf zzlfVar = (zzlf) zzlnVar;
        Object zze = zzlfVar.zze();
        int zzc = zzlfVar.zzc(zze, bArr, i, i9, i10, zzikVar);
        zzlfVar.zzf(zze);
        zzikVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzln zzlnVar, byte[] bArr, int i, int i9, zzik zzikVar) {
        int i10 = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            i10 = zzk(i11, bArr, i10, zzikVar);
            i11 = zzikVar.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzkh.zzf();
        }
        Object zze = zzlnVar.zze();
        int i13 = i11 + i12;
        zzlnVar.zzh(zze, bArr, i12, i13, zzikVar);
        zzlnVar.zzf(zze);
        zzikVar.zzc = zze;
        return i13;
    }

    public static int zze(zzln<?> zzlnVar, int i, byte[] bArr, int i9, int i10, zzke<?> zzkeVar, zzik zzikVar) {
        int zzd = zzd(zzlnVar, bArr, i9, i10, zzikVar);
        zzkeVar.add(zzikVar.zzc);
        while (zzd < i10) {
            int zzj = zzj(bArr, zzd, zzikVar);
            if (i != zzikVar.zza) {
                break;
            }
            zzd = zzd(zzlnVar, bArr, zzj, i10, zzikVar);
            zzkeVar.add(zzikVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzke<?> zzkeVar, zzik zzikVar) {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int zzj = zzj(bArr, i, zzikVar);
        int i9 = zzikVar.zza + zzj;
        while (zzj < i9) {
            zzj = zzj(bArr, zzj, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        if (zzj == i9) {
            return zzj;
        }
        throw zzkh.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzik zzikVar) {
        int zzj = zzj(bArr, i, zzikVar);
        int i9 = zzikVar.zza;
        if (i9 < 0) {
            throw zzkh.zzd();
        }
        if (i9 == 0) {
            zzikVar.zzc = "";
            return zzj;
        }
        zzikVar.zzc = new String(bArr, zzj, i9, zzkf.zzb);
        return zzj + i9;
    }

    public static int zzh(byte[] bArr, int i, zzik zzikVar) {
        int zzj = zzj(bArr, i, zzikVar);
        int i9 = zzikVar.zza;
        if (i9 < 0) {
            throw zzkh.zzd();
        }
        if (i9 == 0) {
            zzikVar.zzc = "";
            return zzj;
        }
        zzikVar.zzc = zzmq.zzd(bArr, zzj, i9);
        return zzj + i9;
    }

    public static int zzi(int i, byte[] bArr, int i9, int i10, zzmc zzmcVar, zzik zzikVar) {
        if ((i >>> 3) == 0) {
            throw zzkh.zzb();
        }
        int i11 = i & 7;
        if (i11 == 0) {
            int zzm = zzm(bArr, i9, zzikVar);
            zzmcVar.zzh(i, Long.valueOf(zzikVar.zzb));
            return zzm;
        }
        if (i11 == 1) {
            zzmcVar.zzh(i, Long.valueOf(zzn(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int zzj = zzj(bArr, i9, zzikVar);
            int i12 = zzikVar.zza;
            if (i12 < 0) {
                throw zzkh.zzd();
            }
            if (i12 > bArr.length - zzj) {
                throw zzkh.zzf();
            }
            if (i12 == 0) {
                zzmcVar.zzh(i, zzix.zzb);
            } else {
                zzmcVar.zzh(i, zzix.zzl(bArr, zzj, i12));
            }
            return zzj + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzkh.zzb();
            }
            zzmcVar.zzh(i, Integer.valueOf(zzb(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i & (-8)) | 4;
        zzmc zze = zzmc.zze();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int zzj2 = zzj(bArr, i9, zzikVar);
            int i15 = zzikVar.zza;
            if (i15 == i13) {
                i14 = i15;
                i9 = zzj2;
                break;
            }
            i14 = i15;
            i9 = zzi(i15, bArr, zzj2, i10, zze, zzikVar);
        }
        if (i9 > i10 || i14 != i13) {
            throw zzkh.zze();
        }
        zzmcVar.zzh(i, zze);
        return i9;
    }

    public static int zzj(byte[] bArr, int i, zzik zzikVar) {
        int i9 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return zzk(b9, bArr, i9, zzikVar);
        }
        zzikVar.zza = b9;
        return i9;
    }

    public static int zzk(int i, byte[] bArr, int i9, zzik zzikVar) {
        int i10 = i & 127;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            zzikVar.zza = i10 | (b9 << 7);
            return i11;
        }
        int i12 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzikVar.zza = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzikVar.zza = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzikVar.zza = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                zzikVar.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int zzl(int i, byte[] bArr, int i9, int i10, zzke<?> zzkeVar, zzik zzikVar) {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int zzj = zzj(bArr, i9, zzikVar);
        zzjyVar.zzh(zzikVar.zza);
        while (zzj < i10) {
            int zzj2 = zzj(bArr, zzj, zzikVar);
            if (i != zzikVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzik zzikVar) {
        int i9 = i + 1;
        long j10 = bArr[i];
        if (j10 >= 0) {
            zzikVar.zzb = j10;
            return i9;
        }
        int i10 = i + 2;
        byte b9 = bArr[i9];
        long j11 = (j10 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b9 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i11;
            b9 = bArr[i10];
            i10 = i12;
        }
        zzikVar.zzb = j11;
        return i10;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}

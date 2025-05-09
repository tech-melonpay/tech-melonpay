package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzsm {
    public static int zza(byte[] bArr, int i, zzsl zzslVar) {
        int zzj = zzj(bArr, i, zzslVar);
        int i9 = zzslVar.zza;
        if (i9 < 0) {
            throw zzvk.zzf();
        }
        if (i9 > bArr.length - zzj) {
            throw zzvk.zzj();
        }
        if (i9 == 0) {
            zzslVar.zzc = zztd.zzb;
            return zzj;
        }
        zzslVar.zzc = zztd.zzn(bArr, zzj, i9);
        return zzj + i9;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzwx zzwxVar, byte[] bArr, int i, int i9, int i10, zzsl zzslVar) {
        zzwn zzwnVar = (zzwn) zzwxVar;
        Object zze = zzwnVar.zze();
        int zzc = zzwnVar.zzc(zze, bArr, i, i9, i10, zzslVar);
        zzwnVar.zzf(zze);
        zzslVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzwx zzwxVar, byte[] bArr, int i, int i9, zzsl zzslVar) {
        int i10 = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            i10 = zzk(i11, bArr, i10, zzslVar);
            i11 = zzslVar.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzvk.zzj();
        }
        Object zze = zzwxVar.zze();
        int i13 = i11 + i12;
        zzwxVar.zzi(zze, bArr, i12, i13, zzslVar);
        zzwxVar.zzf(zze);
        zzslVar.zzc = zze;
        return i13;
    }

    public static int zze(zzwx<?> zzwxVar, int i, byte[] bArr, int i9, int i10, zzvh<?> zzvhVar, zzsl zzslVar) {
        int zzd = zzd(zzwxVar, bArr, i9, i10, zzslVar);
        zzvhVar.add(zzslVar.zzc);
        while (zzd < i10) {
            int zzj = zzj(bArr, zzd, zzslVar);
            if (i != zzslVar.zza) {
                break;
            }
            zzd = zzd(zzwxVar, bArr, zzj, i10, zzslVar);
            zzvhVar.add(zzslVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzvh<?> zzvhVar, zzsl zzslVar) {
        zzva zzvaVar = (zzva) zzvhVar;
        int zzj = zzj(bArr, i, zzslVar);
        int i9 = zzslVar.zza + zzj;
        while (zzj < i9) {
            zzj = zzj(bArr, zzj, zzslVar);
            zzvaVar.zzh(zzslVar.zza);
        }
        if (zzj == i9) {
            return zzj;
        }
        throw zzvk.zzj();
    }

    public static int zzg(byte[] bArr, int i, zzsl zzslVar) {
        int zzj = zzj(bArr, i, zzslVar);
        int i9 = zzslVar.zza;
        if (i9 < 0) {
            throw zzvk.zzf();
        }
        if (i9 == 0) {
            zzslVar.zzc = "";
            return zzj;
        }
        zzslVar.zzc = new String(bArr, zzj, i9, zzvi.zza);
        return zzj + i9;
    }

    public static int zzh(byte[] bArr, int i, zzsl zzslVar) {
        int zzj = zzj(bArr, i, zzslVar);
        int i9 = zzslVar.zza;
        if (i9 < 0) {
            throw zzvk.zzf();
        }
        if (i9 == 0) {
            zzslVar.zzc = "";
            return zzj;
        }
        zzslVar.zzc = zzyd.zzd(bArr, zzj, i9);
        return zzj + i9;
    }

    public static int zzi(int i, byte[] bArr, int i9, int i10, zzxp zzxpVar, zzsl zzslVar) {
        if ((i >>> 3) == 0) {
            throw zzvk.zzc();
        }
        int i11 = i & 7;
        if (i11 == 0) {
            int zzm = zzm(bArr, i9, zzslVar);
            zzxpVar.zzh(i, Long.valueOf(zzslVar.zzb));
            return zzm;
        }
        if (i11 == 1) {
            zzxpVar.zzh(i, Long.valueOf(zzo(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int zzj = zzj(bArr, i9, zzslVar);
            int i12 = zzslVar.zza;
            if (i12 < 0) {
                throw zzvk.zzf();
            }
            if (i12 > bArr.length - zzj) {
                throw zzvk.zzj();
            }
            if (i12 == 0) {
                zzxpVar.zzh(i, zztd.zzb);
            } else {
                zzxpVar.zzh(i, zztd.zzn(bArr, zzj, i12));
            }
            return zzj + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzvk.zzc();
            }
            zzxpVar.zzh(i, Integer.valueOf(zzb(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i & (-8)) | 4;
        zzxp zze = zzxp.zze();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int zzj2 = zzj(bArr, i9, zzslVar);
            int i15 = zzslVar.zza;
            if (i15 == i13) {
                i14 = i15;
                i9 = zzj2;
                break;
            }
            i14 = i15;
            i9 = zzi(i15, bArr, zzj2, i10, zze, zzslVar);
        }
        if (i9 > i10 || i14 != i13) {
            throw zzvk.zzg();
        }
        zzxpVar.zzh(i, zze);
        return i9;
    }

    public static int zzj(byte[] bArr, int i, zzsl zzslVar) {
        int i9 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return zzk(b9, bArr, i9, zzslVar);
        }
        zzslVar.zza = b9;
        return i9;
    }

    public static int zzk(int i, byte[] bArr, int i9, zzsl zzslVar) {
        int i10 = i & 127;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            zzslVar.zza = i10 | (b9 << 7);
            return i11;
        }
        int i12 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzslVar.zza = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzslVar.zza = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzslVar.zza = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                zzslVar.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int zzl(int i, byte[] bArr, int i9, int i10, zzvh<?> zzvhVar, zzsl zzslVar) {
        zzva zzvaVar = (zzva) zzvhVar;
        int zzj = zzj(bArr, i9, zzslVar);
        zzvaVar.zzh(zzslVar.zza);
        while (zzj < i10) {
            int zzj2 = zzj(bArr, zzj, zzslVar);
            if (i != zzslVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzslVar);
            zzvaVar.zzh(zzslVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzsl zzslVar) {
        int i9 = i + 1;
        long j10 = bArr[i];
        if (j10 >= 0) {
            zzslVar.zzb = j10;
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
        zzslVar.zzb = j11;
        return i10;
    }

    public static int zzn(int i, byte[] bArr, int i9, int i10, zzsl zzslVar) {
        if ((i >>> 3) == 0) {
            throw zzvk.zzc();
        }
        int i11 = i & 7;
        if (i11 == 0) {
            return zzm(bArr, i9, zzslVar);
        }
        if (i11 == 1) {
            return i9 + 8;
        }
        if (i11 == 2) {
            return zzj(bArr, i9, zzslVar) + zzslVar.zza;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                return i9 + 4;
            }
            throw zzvk.zzc();
        }
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            i9 = zzj(bArr, i9, zzslVar);
            i13 = zzslVar.zza;
            if (i13 == i12) {
                break;
            }
            i9 = zzn(i13, bArr, i9, i10, zzslVar);
        }
        if (i9 > i10 || i13 != i12) {
            throw zzvk.zzg();
        }
        return i9;
    }

    public static long zzo(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}

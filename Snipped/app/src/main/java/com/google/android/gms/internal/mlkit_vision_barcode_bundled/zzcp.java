package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzcp {
    public static int zza(byte[] bArr, int i, zzco zzcoVar) {
        int zzj = zzj(bArr, i, zzcoVar);
        int i9 = zzcoVar.zza;
        if (i9 < 0) {
            throw zzeo.zzd();
        }
        if (i9 > bArr.length - zzj) {
            throw zzeo.zzg();
        }
        if (i9 == 0) {
            zzcoVar.zzc = zzdb.zzb;
            return zzj;
        }
        zzcoVar.zzc = zzdb.zzr(bArr, zzj, i9);
        return zzj + i9;
    }

    public static int zzb(byte[] bArr, int i) {
        int i9 = bArr[i] & 255;
        int i10 = bArr[i + 1] & 255;
        int i11 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i9, int i10, zzco zzcoVar) {
        Object zze = zzghVar.zze();
        int zzn = zzn(zze, zzghVar, bArr, i, i9, i10, zzcoVar);
        zzghVar.zzf(zze);
        zzcoVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i9, zzco zzcoVar) {
        Object zze = zzghVar.zze();
        int zzo = zzo(zze, zzghVar, bArr, i, i9, zzcoVar);
        zzghVar.zzf(zze);
        zzcoVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzgh zzghVar, int i, byte[] bArr, int i9, int i10, zzel zzelVar, zzco zzcoVar) {
        int zzd = zzd(zzghVar, bArr, i9, i10, zzcoVar);
        zzelVar.add(zzcoVar.zzc);
        while (zzd < i10) {
            int zzj = zzj(bArr, zzd, zzcoVar);
            if (i != zzcoVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i10, zzcoVar);
            zzelVar.add(zzcoVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzel zzelVar, zzco zzcoVar) {
        zzee zzeeVar = (zzee) zzelVar;
        int zzj = zzj(bArr, i, zzcoVar);
        int i9 = zzcoVar.zza + zzj;
        while (zzj < i9) {
            zzj = zzj(bArr, zzj, zzcoVar);
            zzeeVar.zzg(zzcoVar.zza);
        }
        if (zzj == i9) {
            return zzj;
        }
        throw zzeo.zzg();
    }

    public static int zzg(byte[] bArr, int i, zzco zzcoVar) {
        int zzj = zzj(bArr, i, zzcoVar);
        int i9 = zzcoVar.zza;
        if (i9 < 0) {
            throw zzeo.zzd();
        }
        if (i9 == 0) {
            zzcoVar.zzc = "";
            return zzj;
        }
        zzcoVar.zzc = new String(bArr, zzj, i9, zzem.zzb);
        return zzj + i9;
    }

    public static int zzh(byte[] bArr, int i, zzco zzcoVar) {
        int zzj = zzj(bArr, i, zzcoVar);
        int i9 = zzcoVar.zza;
        if (i9 < 0) {
            throw zzeo.zzd();
        }
        if (i9 == 0) {
            zzcoVar.zzc = "";
            return zzj;
        }
        int length = bArr.length;
        int i10 = zzhn.zza;
        if ((zzj | i9 | ((length - zzj) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i9)));
        }
        int i11 = zzj + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (zzj < i11) {
            byte b9 = bArr[zzj];
            if (!zzhj.zzd(b9)) {
                break;
            }
            zzj++;
            cArr[i12] = (char) b9;
            i12++;
        }
        int i13 = i12;
        while (zzj < i11) {
            int i14 = zzj + 1;
            byte b10 = bArr[zzj];
            if (zzhj.zzd(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                zzj = i14;
                while (zzj < i11) {
                    byte b11 = bArr[zzj];
                    if (zzhj.zzd(b11)) {
                        zzj++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzeo.zzc();
                }
                zzj += 2;
                zzhj.zzc(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzeo.zzc();
                }
                int i15 = zzj + 2;
                zzj += 3;
                zzhj.zzb(b10, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzeo.zzc();
                }
                byte b12 = bArr[i14];
                int i16 = zzj + 3;
                byte b13 = bArr[zzj + 2];
                zzj += 4;
                zzhj.zza(b10, b12, b13, bArr[i16], cArr, i13);
                i13 += 2;
            }
        }
        zzcoVar.zzc = new String(cArr, 0, i13);
        return i11;
    }

    public static int zzi(int i, byte[] bArr, int i9, int i10, zzgz zzgzVar, zzco zzcoVar) {
        if ((i >>> 3) == 0) {
            throw zzeo.zzb();
        }
        int i11 = i & 7;
        if (i11 == 0) {
            int zzm = zzm(bArr, i9, zzcoVar);
            zzgzVar.zzj(i, Long.valueOf(zzcoVar.zzb));
            return zzm;
        }
        if (i11 == 1) {
            zzgzVar.zzj(i, Long.valueOf(zzq(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int zzj = zzj(bArr, i9, zzcoVar);
            int i12 = zzcoVar.zza;
            if (i12 < 0) {
                throw zzeo.zzd();
            }
            if (i12 > bArr.length - zzj) {
                throw zzeo.zzg();
            }
            if (i12 == 0) {
                zzgzVar.zzj(i, zzdb.zzb);
            } else {
                zzgzVar.zzj(i, zzdb.zzr(bArr, zzj, i12));
            }
            return zzj + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw zzeo.zzb();
            }
            zzgzVar.zzj(i, Integer.valueOf(zzb(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i & (-8)) | 4;
        zzgz zzf = zzgz.zzf();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int zzj2 = zzj(bArr, i9, zzcoVar);
            int i15 = zzcoVar.zza;
            i14 = i15;
            if (i15 == i13) {
                i9 = zzj2;
                break;
            }
            int zzi = zzi(i14, bArr, zzj2, i10, zzf, zzcoVar);
            i14 = i15;
            i9 = zzi;
        }
        if (i9 > i10 || i14 != i13) {
            throw zzeo.zze();
        }
        zzgzVar.zzj(i, zzf);
        return i9;
    }

    public static int zzj(byte[] bArr, int i, zzco zzcoVar) {
        int i9 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return zzk(b9, bArr, i9, zzcoVar);
        }
        zzcoVar.zza = b9;
        return i9;
    }

    public static int zzk(int i, byte[] bArr, int i9, zzco zzcoVar) {
        byte b9 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i & 127;
        if (b9 >= 0) {
            zzcoVar.zza = i11 | (b9 << 7);
            return i10;
        }
        int i12 = i11 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzcoVar.zza = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzcoVar.zza = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzcoVar.zza = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                zzcoVar.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int zzl(int i, byte[] bArr, int i9, int i10, zzel zzelVar, zzco zzcoVar) {
        zzee zzeeVar = (zzee) zzelVar;
        int zzj = zzj(bArr, i9, zzcoVar);
        zzeeVar.zzg(zzcoVar.zza);
        while (zzj < i10) {
            int zzj2 = zzj(bArr, zzj, zzcoVar);
            if (i != zzcoVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzcoVar);
            zzeeVar.zzg(zzcoVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzco zzcoVar) {
        long j10 = bArr[i];
        int i9 = i + 1;
        if (j10 >= 0) {
            zzcoVar.zzb = j10;
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
        zzcoVar.zzb = j11;
        return i10;
    }

    public static int zzn(Object obj, zzgh zzghVar, byte[] bArr, int i, int i9, int i10, zzco zzcoVar) {
        int zzc = ((zzfr) zzghVar).zzc(obj, bArr, i, i9, i10, zzcoVar);
        zzcoVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzgh zzghVar, byte[] bArr, int i, int i9, zzco zzcoVar) {
        int i10 = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            i10 = zzk(i11, bArr, i10, zzcoVar);
            i11 = zzcoVar.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw zzeo.zzg();
        }
        int i13 = i11 + i12;
        zzghVar.zzh(obj, bArr, i12, i13, zzcoVar);
        zzcoVar.zzc = obj;
        return i13;
    }

    public static int zzp(int i, byte[] bArr, int i9, int i10, zzco zzcoVar) {
        if ((i >>> 3) == 0) {
            throw zzeo.zzb();
        }
        int i11 = i & 7;
        if (i11 == 0) {
            return zzm(bArr, i9, zzcoVar);
        }
        if (i11 == 1) {
            return i9 + 8;
        }
        if (i11 == 2) {
            return zzj(bArr, i9, zzcoVar) + zzcoVar.zza;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                return i9 + 4;
            }
            throw zzeo.zzb();
        }
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            i9 = zzj(bArr, i9, zzcoVar);
            i13 = zzcoVar.zza;
            if (i13 == i12) {
                break;
            }
            i9 = zzp(i13, bArr, i9, i10, zzcoVar);
        }
        if (i9 > i10 || i13 != i12) {
            throw zzeo.zze();
        }
        return i9;
    }

    public static long zzq(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}

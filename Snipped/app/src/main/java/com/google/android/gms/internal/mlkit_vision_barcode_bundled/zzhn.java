package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhk zzb;

    static {
        if (zzhi.zzx() && zzhi.zzy()) {
            int i = zzcn.zza;
        }
        zzb = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i9) {
        int i10 = i9 - i;
        byte b9 = bArr[i - 1];
        if (i10 == 0) {
            if (b9 > -12) {
                return -1;
            }
            return b9;
        }
        if (i10 == 1) {
            return zzi(b9, bArr[i]);
        }
        if (i10 == 2) {
            return zzj(b9, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhn.zzd(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zze(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new zzhm(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    public static int zzf(int i, byte[] bArr, int i9, int i10) {
        return zzb.zza(i, bArr, i9, i10);
    }

    public static boolean zzg(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzh(byte[] bArr, int i, int i9) {
        return zzb.zzb(bArr, i, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(int i, int i9) {
        if (i > -12 || i9 > -65) {
            return -1;
        }
        return i ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i, int i9, int i10) {
        if (i > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i ^ (i9 << 8)) ^ (i10 << 16);
    }
}

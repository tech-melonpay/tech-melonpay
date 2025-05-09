package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzyd {
    private static final zzya zza;

    static {
        if (zzxy.zzx() && zzxy.zzy()) {
            int i = zzsk.zza;
        }
        zza = new zzyb();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i9) {
        byte b9 = bArr[i - 1];
        int i10 = i9 - i;
        if (i10 != 0) {
            if (i10 == 1) {
                byte b10 = bArr[i];
                if (b9 <= -12 && b10 <= -65) {
                    return b9 ^ (b10 << 8);
                }
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                byte b11 = bArr[i];
                byte b12 = bArr[i + 1];
                if (b9 <= -12 && b11 <= -65 && b12 <= -65) {
                    return ((b11 << 8) ^ b9) ^ (b12 << 16);
                }
            }
        } else if (b9 <= -12) {
            return b9;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0100, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzyd.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
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
                                throw new zzyc(i9, length2);
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i10 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static String zzd(byte[] bArr, int i, int i9) {
        int length = bArr.length;
        if ((i | i9 | ((length - i) - i9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i9)));
        }
        int i10 = i + i9;
        char[] cArr = new char[i9];
        int i11 = 0;
        while (i < i10) {
            byte b9 = bArr[i];
            if (!zzxz.zzd(b9)) {
                break;
            }
            i++;
            cArr[i11] = (char) b9;
            i11++;
        }
        int i12 = i11;
        while (i < i10) {
            int i13 = i + 1;
            byte b10 = bArr[i];
            if (zzxz.zzd(b10)) {
                cArr[i12] = (char) b10;
                i12++;
                i = i13;
                while (i < i10) {
                    byte b11 = bArr[i];
                    if (!zzxz.zzd(b11)) {
                        break;
                    }
                    i++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
            } else if (b10 < -32) {
                if (i13 >= i10) {
                    throw zzvk.zzd();
                }
                i += 2;
                zzxz.zzc(b10, bArr[i13], cArr, i12);
                i12++;
            } else if (b10 < -16) {
                if (i13 >= i10 - 1) {
                    throw zzvk.zzd();
                }
                int i14 = i + 2;
                i += 3;
                zzxz.zzb(b10, bArr[i13], bArr[i14], cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    throw zzvk.zzd();
                }
                int i15 = i + 2;
                int i16 = i + 3;
                i += 4;
                zzxz.zza(b10, bArr[i13], bArr[i15], bArr[i16], cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i, int i9) {
        return zza.zzb(bArr, i, i9);
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.measurement.internal.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzbu {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i9;
        int i10;
        int zza = zzbv.zza(obj);
        int i11 = zza & i;
        int zzc = zzc(obj3, i11);
        if (zzc != 0) {
            int i12 = ~i;
            int i13 = zza & i12;
            int i14 = -1;
            while (true) {
                i9 = zzc - 1;
                i10 = iArr[i9];
                if ((i10 & i12) != i13 || !zzam.zza(obj, objArr[i9]) || (objArr2 != null && !zzam.zza(obj2, objArr2[i9]))) {
                    int i15 = i10 & i;
                    if (i15 == 0) {
                        break;
                    }
                    i14 = i9;
                    zzc = i15;
                }
            }
            int i16 = i10 & i;
            if (i14 == -1) {
                zze(obj3, i11, i16);
            } else {
                iArr[i14] = (i16 & i) | (iArr[i14] & i12);
            }
            return i9;
        }
        return -1;
    }

    public static int zzc(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.g(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void zze(Object obj, int i, int i9) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i9;
        } else {
            ((int[]) obj)[i] = i9;
        }
    }
}

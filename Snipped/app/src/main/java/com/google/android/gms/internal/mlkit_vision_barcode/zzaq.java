package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaq {
    public static int zza(int i, int i9, String str) {
        String zza;
        if (i >= 0 && i < i9) {
            return i;
        }
        if (i < 0) {
            zza = zzar.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException(a.g(i9, "negative size: "));
            }
            zza = zzar.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i9, String str) {
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(zze(i, i9, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzc(int i, int i9, int i10) {
        if (i < 0 || i9 < i || i9 > i10) {
            throw new IndexOutOfBoundsException((i < 0 || i > i10) ? zze(i, i10, "start index") : (i9 < 0 || i9 > i10) ? zze(i9, i10, "end index") : zzar.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i)));
        }
    }

    public static void zzd(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zze(int i, int i9, String str) {
        if (i < 0) {
            return zzar.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i9 >= 0) {
            return zzar.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(a.g(i9, "negative size: "));
    }
}

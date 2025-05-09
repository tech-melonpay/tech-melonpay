package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class zzf {
    public static int zza(int i, int i9, String str) {
        String zza;
        if (i >= 0 && i < i9) {
            return i;
        }
        if (i < 0) {
            zza = zzg.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException(a.g(i9, "negative size: "));
            }
            zza = zzg.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i9, String str) {
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(zzd(i, i9, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzc(int i, int i9, int i10) {
        if (i < 0 || i9 < i || i9 > i10) {
            throw new IndexOutOfBoundsException((i < 0 || i > i10) ? zzd(i, i10, "start index") : (i9 < 0 || i9 > i10) ? zzd(i9, i10, "end index") : zzg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i)));
        }
    }

    private static String zzd(int i, int i9, String str) {
        if (i < 0) {
            return zzg.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i9 >= 0) {
            return zzg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(a.g(i9, "negative size: "));
    }
}

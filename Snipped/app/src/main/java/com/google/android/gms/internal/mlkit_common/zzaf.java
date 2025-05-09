package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzaf {
    public static int zza(int i, int i9, String str) {
        String zza;
        if (i >= 0 && i < i9) {
            return i;
        }
        if (i < 0) {
            zza = zzag.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException(a.g(i9, "negative size: "));
            }
            zza = zzag.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i9, String str) {
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(zzf(i, i9, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i, int i9, int i10) {
        if (i < 0 || i9 < i || i9 > i10) {
            throw new IndexOutOfBoundsException((i < 0 || i > i10) ? zzf(i, i10, "start index") : (i9 < 0 || i9 > i10) ? zzf(i9, i10, "end index") : zzag.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    private static String zzf(int i, int i9, String str) {
        if (i < 0) {
            return zzag.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i9 >= 0) {
            return zzag.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(a.g(i9, "negative size: "));
    }
}

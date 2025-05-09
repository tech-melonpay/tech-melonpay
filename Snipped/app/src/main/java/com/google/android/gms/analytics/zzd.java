package com.google.android.gms.analytics;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzd {
    public static String zza(int i) {
        return zzn("&cd", i);
    }

    public static String zzb(int i) {
        return zzn("cd", i);
    }

    public static String zzc(int i) {
        return zzn("cd", i);
    }

    public static String zzd(int i) {
        return zzn("&cm", i);
    }

    public static String zze(int i) {
        return zzn("cm", i);
    }

    public static String zzf(int i) {
        return zzn("cm", i);
    }

    public static String zzg(int i) {
        return zzn("&il", i);
    }

    public static String zzh(int i) {
        return zzn("il", i);
    }

    public static String zzi(int i) {
        return zzn("pi", i);
    }

    public static String zzj(int i) {
        return zzn("&pr", i);
    }

    public static String zzk(int i) {
        return zzn("pr", i);
    }

    public static String zzl(int i) {
        return zzn("&promo", i);
    }

    public static String zzm(int i) {
        return zzn("promo", i);
    }

    private static String zzn(String str, int i) {
        if (i <= 0) {
            zzfa.zzb("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 11);
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }
}

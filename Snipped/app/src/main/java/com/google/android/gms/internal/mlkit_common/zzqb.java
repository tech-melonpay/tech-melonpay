package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzqb {
    private static zzqb zza;

    private zzqb() {
    }

    public static synchronized zzqb zza() {
        zzqb zzqbVar;
        synchronized (zzqb.class) {
            try {
                if (zza == null) {
                    zza = new zzqb();
                }
                zzqbVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzqbVar;
    }

    public static void zzb() {
        zzqa.zza();
    }
}

package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpy {
    private static zzpx zza;

    public static synchronized zzpn zza(zzph zzphVar) {
        zzpn zzpnVar;
        synchronized (zzpy.class) {
            try {
                if (zza == null) {
                    zza = new zzpx(null);
                }
                zzpnVar = (zzpn) zza.get(zzphVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzpnVar;
    }

    public static synchronized zzpn zzb(String str) {
        zzpn zza2;
        synchronized (zzpy.class) {
            zza2 = zza(zzph.zzd("common").zzd());
        }
        return zza2;
    }
}

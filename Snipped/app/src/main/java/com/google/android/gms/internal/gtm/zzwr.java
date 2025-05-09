package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwr {
    private static final zzwq zza;
    private static final zzwq zzb;

    static {
        zzwq zzwqVar = null;
        try {
            zzwqVar = (zzwq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzwqVar;
        zzb = new zzwq();
    }

    public static zzwq zza() {
        return zza;
    }

    public static zzwq zzb() {
        return zzb;
    }
}

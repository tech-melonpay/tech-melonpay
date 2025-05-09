package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwg {
    private static final zzwf zza;
    private static final zzwf zzb;

    static {
        zzwf zzwfVar = null;
        try {
            zzwfVar = (zzwf) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzwfVar;
        zzb = new zzwf();
    }

    public static zzwf zza() {
        return zza;
    }

    public static zzwf zzb() {
        return zzb;
    }
}

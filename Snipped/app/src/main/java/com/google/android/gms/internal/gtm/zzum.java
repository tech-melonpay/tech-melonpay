package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzum {
    private static final zzuk<?> zza = new zzul();
    private static final zzuk<?> zzb;

    static {
        zzuk<?> zzukVar = null;
        try {
            zzukVar = (zzuk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzukVar;
    }

    public static zzuk<?> zza() {
        zzuk<?> zzukVar = zzb;
        if (zzukVar != null) {
            return zzukVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzuk<?> zzb() {
        return zza;
    }
}

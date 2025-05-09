package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzpv implements zzpu {
    public static final zzhu<Boolean> zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zze("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzpu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpu
    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }
}

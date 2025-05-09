package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzof implements zzoe {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;
    public static final zzhu<Boolean> zzc;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzb = zzhrVar.zze("measurement.client.sessions.check_on_startup", true);
        zzc = zzhrVar.zze("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoe
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoe
    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }
}

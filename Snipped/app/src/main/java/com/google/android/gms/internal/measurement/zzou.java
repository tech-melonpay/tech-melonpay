package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzou implements zzot {
    public static final zzhu<Long> zza;
    public static final zzhu<Boolean> zzb;
    public static final zzhu<Boolean> zzc;
    public static final zzhu<Boolean> zzd;
    public static final zzhu<Long> zze;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zzc("measurement.id.lifecycle.app_in_background_parameter", 0L);
        zzb = zzhrVar.zze("measurement.lifecycle.app_backgrounded_engagement", false);
        zzc = zzhrVar.zze("measurement.lifecycle.app_backgrounded_tracking", true);
        zzd = zzhrVar.zze("measurement.lifecycle.app_in_background_parameter", false);
        zze = zzhrVar.zzc("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return zzb.zzb().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzb() {
        return zzd.zzb().booleanValue();
    }
}

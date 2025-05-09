package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzpd implements zzpc {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Double> zzb;
    public static final zzhu<Long> zzc;
    public static final zzhu<Long> zzd;
    public static final zzhu<String> zze;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.test.boolean_flag", false);
        zzb = zzhrVar.zzb("measurement.test.double_flag", -3.0d);
        zzc = zzhrVar.zzc("measurement.test.int_flag", -2L);
        zzd = zzhrVar.zzc("measurement.test.long_flag", -1L);
        zze = zzhrVar.zzd("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final double zza() {
        return zzb.zzb().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final long zzb() {
        return zzc.zzb().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final long zzc() {
        return zzd.zzb().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final String zzd() {
        return zze.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final boolean zze() {
        return zza.zzb().booleanValue();
    }
}

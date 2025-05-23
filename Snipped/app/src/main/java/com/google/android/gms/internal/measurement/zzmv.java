package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzmv implements zzmu {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;
    public static final zzhu<Boolean> zzc;
    public static final zzhu<Long> zzd;
    public static final zzhu<Boolean> zze;
    public static final zzhu<Boolean> zzf;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zze("measurement.adid_zero.app_instance_id_fix", true);
        zzb = zza2.zze("measurement.adid_zero.service", false);
        zzc = zza2.zze("measurement.adid_zero.adid_uid", false);
        zzd = zza2.zzc("measurement.id.adid_zero.service", 0L);
        zze = zza2.zze("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        zzf = zza2.zze("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzc() {
        return zzb.zzb().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzd() {
        return zzc.zzb().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zze() {
        return zze.zzb().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzf() {
        return zzf.zzb().booleanValue();
    }
}

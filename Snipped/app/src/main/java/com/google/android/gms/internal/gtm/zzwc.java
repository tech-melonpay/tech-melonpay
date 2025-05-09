package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwc implements zzwy {
    private static final zzwi zza = new zzwa();
    private final zzwi zzb;

    public zzwc() {
        zzwi zzwiVar;
        zzus zza2 = zzus.zza();
        try {
            zzwiVar = (zzwi) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzwiVar = zza;
        }
        zzwb zzwbVar = new zzwb(zza2, zzwiVar);
        zzvi.zzf(zzwbVar, "messageInfoFactory");
        this.zzb = zzwbVar;
    }

    private static boolean zzb(zzwh zzwhVar) {
        return zzwhVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.gtm.zzwy
    public final <T> zzwx<T> zza(Class<T> cls) {
        zzwz.zzG(cls);
        zzwh zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzuz.class.isAssignableFrom(cls) ? zzwo.zzc(zzwz.zzB(), zzum.zzb(), zzb.zza()) : zzwo.zzc(zzwz.zzz(), zzum.zza(), zzb.zza()) : zzuz.class.isAssignableFrom(cls) ? zzb(zzb) ? zzwn.zzl(cls, zzb, zzwr.zzb(), zzvy.zze(), zzwz.zzB(), zzum.zzb(), zzwg.zzb()) : zzwn.zzl(cls, zzb, zzwr.zzb(), zzvy.zze(), zzwz.zzB(), null, zzwg.zzb()) : zzb(zzb) ? zzwn.zzl(cls, zzb, zzwr.zza(), zzvy.zzd(), zzwz.zzz(), zzum.zza(), zzwg.zza()) : zzwn.zzl(cls, zzb, zzwr.zza(), zzvy.zzd(), zzwz.zzA(), null, zzwg.zza());
    }
}

package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzku implements zzlo {
    private static final zzla zza = new zzks();
    private final zzla zzb;

    public zzku() {
        zzla zzlaVar;
        zzjs zza2 = zzjs.zza();
        try {
            zzlaVar = (zzla) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlaVar = zza;
        }
        zzkt zzktVar = new zzkt(zza2, zzlaVar);
        zzkf.zzf(zzktVar, "messageInfoFactory");
        this.zzb = zzktVar;
    }

    private static boolean zzb(zzkz zzkzVar) {
        return zzkzVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlo
    public final <T> zzln<T> zza(Class<T> cls) {
        zzlp.zzG(cls);
        zzkz zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzjx.class.isAssignableFrom(cls) ? zzlg.zzc(zzlp.zzB(), zzjm.zzb(), zzb.zza()) : zzlg.zzc(zzlp.zzz(), zzjm.zza(), zzb.zza()) : zzjx.class.isAssignableFrom(cls) ? zzb(zzb) ? zzlf.zzk(cls, zzb, zzli.zzb(), zzkq.zzd(), zzlp.zzB(), zzjm.zzb(), zzky.zzb()) : zzlf.zzk(cls, zzb, zzli.zzb(), zzkq.zzd(), zzlp.zzB(), null, zzky.zzb()) : zzb(zzb) ? zzlf.zzk(cls, zzb, zzli.zza(), zzkq.zzc(), zzlp.zzz(), zzjm.zza(), zzky.zza()) : zzlf.zzk(cls, zzb, zzli.zza(), zzkq.zzc(), zzlp.zzA(), null, zzky.zza());
    }
}

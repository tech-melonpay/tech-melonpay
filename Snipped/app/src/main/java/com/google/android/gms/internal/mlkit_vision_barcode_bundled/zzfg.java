package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzfg implements zzgi {
    private static final zzfm zza = new zzfe();
    private final zzfm zzb;

    public zzfg() {
        zzfm zzfmVar;
        zzdw zza2 = zzdw.zza();
        try {
            zzfmVar = (zzfm) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzfmVar = zza;
        }
        zzff zzffVar = new zzff(zza2, zzfmVar);
        byte[] bArr = zzem.zzd;
        this.zzb = zzffVar;
    }

    private static boolean zzb(zzfl zzflVar) {
        return zzflVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgi
    public final zzgh zza(Class cls) {
        zzgj.zzE(cls);
        zzfl zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzed.class.isAssignableFrom(cls) ? zzfs.zzc(zzgj.zzA(), zzdr.zzb(), zzb.zza()) : zzfs.zzc(zzgj.zzy(), zzdr.zza(), zzb.zza()) : zzed.class.isAssignableFrom(cls) ? zzb(zzb) ? zzfr.zzl(cls, zzb, zzfv.zzb(), zzfc.zzd(), zzgj.zzA(), zzdr.zzb(), zzfk.zzb()) : zzfr.zzl(cls, zzb, zzfv.zzb(), zzfc.zzd(), zzgj.zzA(), null, zzfk.zzb()) : zzb(zzb) ? zzfr.zzl(cls, zzb, zzfv.zza(), zzfc.zzc(), zzgj.zzy(), zzdr.zza(), zzfk.zza()) : zzfr.zzl(cls, zzb, zzfv.zza(), zzfc.zzc(), zzgj.zzz(), null, zzfk.zza());
    }
}

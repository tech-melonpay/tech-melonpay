package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzci extends zzed implements zzfp {
    private static final zzci zza;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzci zzciVar = new zzci();
        zza = zzciVar;
        zzed.zzU(zzci.class, zzciVar);
    }

    private zzci() {
    }

    public static zzci zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final int zzd() {
        int zza2 = zzch.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzcg.zza, "zzf"});
        }
        if (i9 == 3) {
            return new zzci();
        }
        zzbw zzbwVar = null;
        if (i9 == 4) {
            return new zzce(zzbwVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

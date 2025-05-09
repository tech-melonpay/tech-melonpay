package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzcb extends zzed implements zzfp {
    private static final zzcb zza;
    private int zzd;
    private int zze;
    private zzf zzg;
    private byte zzh = 2;
    private zzel zzf = zzed.zzO();

    static {
        zzcb zzcbVar = new zzcb();
        zza = zzcbVar;
        zzed.zzU(zzcb.class, zzcbVar);
    }

    private zzcb() {
    }

    public final List zzb() {
        return this.zzf;
    }

    public final int zzc() {
        int zza2 = zzca.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", zzbz.zza, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new zzcb();
        }
        zzbw zzbwVar = null;
        if (i9 == 4) {
            return new zzbx(zzbwVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

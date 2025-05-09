package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzj extends zzed implements zzfp {
    private static final zzj zza;
    private int zzd;
    private int zzg;
    private zzv zzh;
    private zzp zzi;
    private zzkc zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private zzel zzf = zzed.zzO();
    private zzel zzl = zzed.zzO();

    static {
        zzj zzjVar = new zzj();
        zza = zzjVar;
        zzed.zzU(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", zzi.zza, "zzf", zzaj.class, "zzg", "zzh", "zzi", "zzk", "zzl", zzam.class, "zzj"});
        }
        if (i9 == 3) {
            return new zzj();
        }
        zzg zzgVar = null;
        if (i9 == 4) {
            return new zzh(zzgVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

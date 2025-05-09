package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzf extends zzed implements zzfp {
    public static final zzeb zza;
    private static final zzf zzd;
    private int zze;
    private zzkc zzj;
    private zzf zzk;
    private zzy zzl;
    private byte zzm = 2;
    private String zzf = "";
    private zzel zzg = zzed.zzO();
    private zzel zzh = zzed.zzO();
    private zzel zzi = zzed.zzO();

    static {
        zzf zzfVar = new zzf();
        zzd = zzfVar;
        zzed.zzU(zzf.class, zzfVar);
        zza = zzed.zzH(zzkc.zzf(), zzfVar, zzfVar, null, 12208774, zzho.zzk, zzf.class);
    }

    private zzf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i9 == 2) {
            return zzed.zzR(zzd, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zze", "zzg", zzj.class, "zzi", zzj.class, "zzh", zzm.class, "zzj", "zzf", "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new zzf();
        }
        zzd zzdVar = null;
        if (i9 == 4) {
            return new zze(zzdVar);
        }
        if (i9 == 5) {
            return zzd;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

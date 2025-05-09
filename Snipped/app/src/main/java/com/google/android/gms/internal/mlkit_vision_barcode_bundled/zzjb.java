package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzjb extends zzed implements zzfp {
    private static final zzjb zza;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private int zze = -1;
    private zzdb zzh = zzdb.zzb;

    static {
        zzjb zzjbVar = new zzjb();
        zza = zzjbVar;
        zzed.zzU(zzjb.class, zzjbVar);
    }

    private zzjb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzja.zza, "zzh"});
        }
        if (i9 == 3) {
            return new zzjb();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zziz(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzij extends zzed implements zzfp {
    private static final zzij zza;
    private int zzd;
    private int zze;
    private int zzf;
    private zzel zzg = zzed.zzO();
    private int zzh;

    static {
        zzij zzijVar = new zzij();
        zza = zzijVar;
        zzed.zzU(zzij.class, zzijVar);
    }

    private zzij() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", zzii.zza, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzij();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzih(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

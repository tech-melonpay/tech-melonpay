package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzif extends zzed implements zzfp {
    private static final zzif zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        zzif zzifVar = new zzif();
        zza = zzifVar;
        zzed.zzU(zzif.class, zzifVar);
    }

    private zzif() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzie.zza, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzif();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzid(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzic extends zzed implements zzfp {
    private static final zzic zza;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        zzic zzicVar = new zzic();
        zza = zzicVar;
        zzed.zzU(zzic.class, zzicVar);
    }

    private zzic() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", zzib.zza, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzic();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzia(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

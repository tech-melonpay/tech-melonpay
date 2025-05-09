package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzm extends zzed implements zzfp {
    private static final zzm zza;
    private int zzd;
    private zzel zze = zzed.zzO();
    private String zzf = "";

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzed.zzU(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i9 == 4) {
            return new zzl(zzkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

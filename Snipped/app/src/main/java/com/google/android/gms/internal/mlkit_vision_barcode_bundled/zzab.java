package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzab extends zzed implements zzfp {
    private static final zzab zza;
    private int zzd;
    private zzae zze;
    private boolean zzf;

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzed.zzU(zzab.class, zzabVar);
    }

    private zzab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzab();
        }
        zzz zzzVar = null;
        if (i9 == 4) {
            return new zzaa(zzzVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

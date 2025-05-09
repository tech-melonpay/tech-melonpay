package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzjg extends zzed implements zzfp {
    private static final zzjg zza;
    private int zzd;
    private int zze;

    static {
        zzjg zzjgVar = new zzjg();
        zza = zzjgVar;
        zzed.zzU(zzjg.class, zzjgVar);
    }

    private zzjg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new zzjg();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzjf(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

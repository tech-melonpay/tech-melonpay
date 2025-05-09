package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzjk extends zzed implements zzfp {
    private static final zzjk zza;
    private int zzd;
    private zzel zze = zzed.zzO();
    private zzjm zzf;
    private zzhv zzg;

    static {
        zzjk zzjkVar = new zzjk();
        zza = zzjkVar;
        zzed.zzU(zzjk.class, zzjkVar);
    }

    private zzjk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", zzjw.class, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new zzjk();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzjj(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

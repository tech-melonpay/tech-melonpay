package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzit extends zzed implements zzfp {
    private static final zzit zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzit zzitVar = new zzit();
        zza = zzitVar;
        zzed.zzU(zzit.class, zzitVar);
    }

    private zzit() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzit();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzis(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

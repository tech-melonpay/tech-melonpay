package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzht extends zzed implements zzfp {
    private static final zzht zza;
    private int zzd;
    private int zze;
    private zzjw zzf;
    private zzji zzg;
    private zzjk zzh;

    static {
        zzht zzhtVar = new zzht();
        zza = zzhtVar;
        zzed.zzU(zzht.class, zzhtVar);
    }

    private zzht() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", zzir.zza, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzht();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzhs(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

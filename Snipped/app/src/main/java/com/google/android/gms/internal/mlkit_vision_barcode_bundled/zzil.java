package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzil extends zzed implements zzfp {
    private static final zzil zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzil zzilVar = new zzil();
        zza = zzilVar;
        zzed.zzU(zzil.class, zzilVar);
    }

    private zzil() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzim.zza, "zzf"});
        }
        if (i9 == 3) {
            return new zzil();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzik(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

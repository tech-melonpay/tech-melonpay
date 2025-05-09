package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zziq extends zzed implements zzfp {
    private static final zziq zza;
    private int zzd;
    private int zze;
    private zzij zzh;
    private int zzj;
    private int zzk;
    private zzel zzf = zzed.zzO();
    private int zzg = -1;
    private String zzi = "";
    private zzej zzl = zzed.zzN();

    static {
        zziq zziqVar = new zziq();
        zza = zziqVar;
        zzed.zzU(zziq.class, zziqVar);
    }

    private zziq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005\b'", new Object[]{"zzd", "zze", zzim.zza, "zzf", zzil.class, "zzg", "zzh", "zzi", "zzj", zzio.zza, "zzk", zzip.zza, "zzl"});
        }
        if (i9 == 3) {
            return new zziq();
        }
        zzhr zzhrVar = null;
        if (i9 == 4) {
            return new zzin(zzhrVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

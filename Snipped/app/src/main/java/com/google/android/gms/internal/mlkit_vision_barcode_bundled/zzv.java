package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class zzv extends zzed implements zzfp {
    public static final zzeb zza;
    private static final zzv zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private zzkc zzh;
    private byte zzi = 2;

    static {
        zzv zzvVar = new zzv();
        zzd = zzvVar;
        zzed.zzU(zzv.class, zzvVar);
        zza = zzed.zzH(zzkc.zzf(), zzvVar, zzvVar, null, 13258261, zzho.zzk, zzv.class);
    }

    private zzv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return zzed.zzR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzv();
        }
        zzt zztVar = null;
        if (i9 == 4) {
            return new zzu(zztVar);
        }
        if (i9 == 5) {
            return zzd;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package G3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class a extends zzed<a, c> implements zzfp {
    private static final a zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzel zze = zzed.zzO();
    private String zzg = "";
    private zzdb zzh = zzdb.zzb;

    static {
        a aVar = new a();
        zza = aVar;
        zzed.zzU(a.class, aVar);
    }

    public static a a(byte[] bArr, zzdo zzdoVar) {
        return (a) zzed.zzK(zza, bArr, zzdoVar);
    }

    public final zzel b() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", l.class, "zzf", h.f1314b, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new a();
        }
        if (i9 == 4) {
            return new c(zza);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package Z2;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class a extends zzed<a, h> implements zzfp {
    private static final a zza;
    private int zzd;
    private g zze;
    private j zzf;

    static {
        a aVar = new a();
        zza = aVar;
        zzed.zzU(a.class, aVar);
    }

    public static h a() {
        return (h) zza.zzF();
    }

    public static /* synthetic */ void c(a aVar, g gVar) {
        gVar.getClass();
        aVar.zze = gVar;
        aVar.zzd |= 1;
    }

    public static /* synthetic */ void d(a aVar, j jVar) {
        jVar.getClass();
        aVar.zzf = jVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new a();
        }
        if (i9 == 4) {
            return new h(zza);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

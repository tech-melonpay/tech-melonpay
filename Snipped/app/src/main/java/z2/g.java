package Z2;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzht;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class g extends zzed implements zzfp {
    private static final g zza;
    private int zzd;
    private e zzj;
    private zzht zzm;
    private String zze = "";
    private zzdb zzf = zzdb.zzb;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private zzei zzk = zzed.zzL();
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        g gVar = new g();
        zza = gVar;
        zzed.zzU(g.class, gVar);
    }

    public static f a() {
        return (f) zza.zzF();
    }

    public static /* synthetic */ void c(g gVar, e eVar) {
        eVar.getClass();
        gVar.zzj = eVar;
        gVar.zzd |= 32;
    }

    public static /* synthetic */ void d(g gVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        gVar.zzd |= 2;
        gVar.zzf = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i9 == 3) {
            return new g();
        }
        if (i9 == 4) {
            return new f(zza);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

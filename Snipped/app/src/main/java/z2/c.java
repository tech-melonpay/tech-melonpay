package Z2;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class c extends zzed implements zzfp {
    private static final c zza;
    private int zzd;
    private zzei zze = zzed.zzL();
    private zzei zzf = zzed.zzL();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        c cVar = new c();
        zza = cVar;
        zzed.zzU(c.class, cVar);
    }

    public static b a() {
        return (b) zza.zzF();
    }

    public static /* synthetic */ void c(c cVar, int i) {
        cVar.zzd |= 2;
        cVar.zzh = i;
    }

    public static /* synthetic */ void d(c cVar, float f10) {
        zzei zzeiVar = cVar.zze;
        if (!zzeiVar.zzc()) {
            cVar.zze = zzed.zzM(zzeiVar);
        }
        cVar.zze.zzg(f10);
    }

    public static /* synthetic */ void e(c cVar, float f10) {
        zzei zzeiVar = cVar.zzf;
        if (!zzeiVar.zzc()) {
            cVar.zzf = zzed.zzM(zzeiVar);
        }
        cVar.zzf.zzg(f10);
    }

    public static /* synthetic */ void f(c cVar, int i) {
        cVar.zzd |= 1;
        cVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new c();
        }
        if (i9 == 4) {
            return new b(zza);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

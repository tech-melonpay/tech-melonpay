package Z2;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class j extends zzed implements zzfp {
    private static final j zza;
    private int zzd;
    private String zze = "";
    private zzdb zzf;
    private String zzg;
    private zzdb zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        j jVar = new j();
        zza = jVar;
        zzed.zzU(j.class, jVar);
    }

    public j() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzf = zzdbVar;
        this.zzg = "";
        this.zzh = zzdbVar;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static i a() {
        return (i) zza.zzF();
    }

    public static /* synthetic */ void c(j jVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        jVar.zzd |= 2;
        jVar.zzf = zzdbVar;
    }

    public static /* synthetic */ void d(j jVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        jVar.zzd |= 8;
        jVar.zzh = zzdbVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i9 == 3) {
            return new j();
        }
        if (i9 == 4) {
            return new i(zza);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

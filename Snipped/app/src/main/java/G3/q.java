package G3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class q extends zzed implements zzfp {
    private static final q zza;
    private int zzd;
    private zzcd zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private zzel zzh = zzed.zzO();
    private zzel zzi = zzed.zzO();
    private zzel zzj = zzed.zzO();
    private zzel zzk = zzed.zzO();
    private String zzl = "";

    static {
        q qVar = new q();
        zza = qVar;
        zzed.zzU(q.class, qVar);
    }

    public static q b() {
        return zza;
    }

    public final zzel c() {
        return this.zzk;
    }

    public final zzel d() {
        return this.zzi;
    }

    public final zzel e() {
        return this.zzh;
    }

    public final zzel f() {
        return this.zzj;
    }

    public final zzcd zza() {
        zzcd zzcdVar = this.zze;
        return zzcdVar == null ? zzcd.zzb() : zzcdVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzci.class, "zzi", s.class, "zzj", "zzk", zzcb.class, "zzl"});
        }
        if (i9 == 3) {
            return new q();
        }
        if (i9 == 4) {
            return new c(zza);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

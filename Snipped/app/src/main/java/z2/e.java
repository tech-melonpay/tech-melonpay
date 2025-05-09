package Z2;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class e extends zzed implements zzfp {
    private static final e zza;
    private zzel zzd = zzed.zzO();

    static {
        e eVar = new e();
        zza = eVar;
        zzed.zzU(e.class, eVar);
    }

    public static d a() {
        return (d) zza.zzF();
    }

    public static /* synthetic */ void c(e eVar, c cVar) {
        cVar.getClass();
        zzel zzelVar = eVar.zzd;
        if (!zzelVar.zzc()) {
            eVar.zzd = zzed.zzP(zzelVar);
        }
        eVar.zzd.add(cVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", c.class});
        }
        if (i9 == 3) {
            return new e();
        }
        if (i9 == 4) {
            return new d(zza);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}

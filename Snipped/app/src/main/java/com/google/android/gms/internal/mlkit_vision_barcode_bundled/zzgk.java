package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzgk extends zzgu {
    public zzgk(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgu
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                ((zzds) zzg(i).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzds) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}

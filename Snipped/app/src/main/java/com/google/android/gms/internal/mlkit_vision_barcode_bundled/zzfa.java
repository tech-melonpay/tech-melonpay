package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzfa extends zzfc {
    public /* synthetic */ zzfa(zzez zzezVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc
    public final void zza(Object obj, long j10) {
        ((zzel) zzhi.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfc
    public final void zzb(Object obj, Object obj2, long j10) {
        zzel zzelVar = (zzel) zzhi.zzf(obj, j10);
        zzel zzelVar2 = (zzel) zzhi.zzf(obj2, j10);
        int size = zzelVar.size();
        int size2 = zzelVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzelVar.zzc()) {
                zzelVar = zzelVar.zzd(size2 + size);
            }
            zzelVar.addAll(zzelVar2);
        }
        if (size > 0) {
            zzelVar2 = zzelVar;
        }
        zzhi.zzs(obj, j10, zzelVar2);
    }

    private zzfa() {
        super(null);
    }
}

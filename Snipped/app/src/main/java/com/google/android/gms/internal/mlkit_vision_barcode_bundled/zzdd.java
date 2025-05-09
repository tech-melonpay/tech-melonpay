package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzdd extends zzdf {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdd(byte[] bArr, int i, int i9, boolean z10, zzdc zzdcVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) {
        int i9 = this.zze;
        this.zze = 0;
        int i10 = this.zzc + this.zzd;
        this.zzc = i10;
        if (i10 > 0) {
            this.zzd = i10;
            this.zzc = i10 - i10;
        } else {
            this.zzd = 0;
        }
        return i9;
    }
}

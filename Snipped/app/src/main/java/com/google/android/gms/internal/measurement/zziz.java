package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zziz extends zzja {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zziz(byte[] bArr, int i, int i9, boolean z10, zziy zziyVar) {
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
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i9;
    }
}

package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zztf extends zztj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public /* synthetic */ zztf(byte[] bArr, int i, int i9, boolean z10, zzte zzteVar) {
        super(null);
        this.zzh = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzb(int i) {
        int i9 = this.zzh;
        this.zzh = 0;
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        if (i10 > 0) {
            this.zzg = i10;
            this.zzf = 0;
        } else {
            this.zzg = 0;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final zztd zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzg(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzh(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzk(int i) {
        throw null;
    }
}

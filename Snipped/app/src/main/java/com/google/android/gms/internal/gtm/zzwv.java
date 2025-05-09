package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzwv implements zzwh {
    private final zzwk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzwv(zzwk zzwkVar, String str, Object[] objArr) {
        this.zza = zzwkVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i9);
                return;
            } else {
                i |= (charAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwh
    public final zzwk zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzwh
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzwh
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

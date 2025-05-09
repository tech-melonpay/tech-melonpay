package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpq implements zzpe {
    private final zzle zza;
    private zznz zzb = new zznz();

    private zzpq(zzle zzleVar, int i) {
        this.zza = zzleVar;
        zzqb.zza();
    }

    public static zzpe zzf(zzle zzleVar) {
        return new zzpq(zzleVar, 0);
    }

    public static zzpe zzg() {
        return new zzpq(new zzle(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zza(zzld zzldVar) {
        this.zza.zzf(zzldVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zzb(zzlk zzlkVar) {
        this.zza.zzi(zzlkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zzc(zznz zznzVar) {
        this.zzb = zznzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final String zzd() {
        zzob zzf = this.zza.zzk().zzf();
        return (zzf == null || zzag.zzc(zzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final byte[] zze(int i, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzqb.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzjh.zza).ignoreNullValues(true).build().encode(this.zza.zzk()).getBytes("utf-8");
            }
            zzlg zzk = this.zza.zzk();
            zzbs zzbsVar = new zzbs();
            zzjh.zza.configure(zzbsVar);
            return zzbsVar.zza().zza(zzk);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}

package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzpb extends zzpo {
    private zzlc zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private ModelType zze;
    private zzli zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zza(zzli zzliVar) {
        if (zzliVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.zzf = zzliVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zzb(zzlc zzlcVar) {
        if (zzlcVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.zza = zzlcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zzc(int i) {
        this.zzg = i;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zzd(ModelType modelType) {
        if (modelType == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zze = modelType;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zze(boolean z10) {
        this.zzd = z10;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpo zzf(boolean z10) {
        this.zzc = z10;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzpo zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpo
    public final zzpp zzh() {
        zzlc zzlcVar;
        String str;
        ModelType modelType;
        zzli zzliVar;
        if (this.zzh == 7 && (zzlcVar = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zzliVar = this.zzf) != null) {
            return new zzpd(zzlcVar, str, this.zzc, this.zzd, modelType, zzliVar, this.zzg, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" errorCode");
        }
        if (this.zzb == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb2.append(" modelType");
        }
        if (this.zzf == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

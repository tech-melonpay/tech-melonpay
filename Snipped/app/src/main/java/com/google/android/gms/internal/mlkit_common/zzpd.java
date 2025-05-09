package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.impl.utils.a;
import com.google.mlkit.common.sdkinternal.ModelType;
import s3.b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzpd extends zzpp {
    private final zzlc zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzli zzf;
    private final int zzg;

    public /* synthetic */ zzpd(zzlc zzlcVar, String str, boolean z10, boolean z11, ModelType modelType, zzli zzliVar, int i, zzpc zzpcVar) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = modelType;
        this.zzf = zzliVar;
        this.zzg = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpp) {
            zzpp zzppVar = (zzpp) obj;
            if (this.zza.equals(zzppVar.zzc()) && this.zzb.equals(zzppVar.zze()) && this.zzc == zzppVar.zzg() && this.zzd == zzppVar.zzf() && this.zze.equals(zzppVar.zzb()) && this.zzf.equals(zzppVar.zzd()) && this.zzg == zzppVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        return (((((((((hashCode * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        boolean z10 = this.zzc;
        boolean z11 = this.zzd;
        String obj2 = this.zze.toString();
        String obj3 = this.zzf.toString();
        int i = this.zzg;
        StringBuilder p10 = b.p("RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=", str, ", shouldLogRoughDownloadTime=");
        p10.append(z10);
        p10.append(", shouldLogExactDownloadTime=");
        p10.append(z11);
        p10.append(", modelType=");
        a.u(p10, obj2, ", downloadStatus=", obj3, ", failureStatusCode=");
        return b.m(p10, i, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final zzlc zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final zzli zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpp
    public final boolean zzg() {
        return this.zzc;
    }
}

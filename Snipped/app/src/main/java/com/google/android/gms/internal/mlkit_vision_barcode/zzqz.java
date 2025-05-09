package com.google.android.gms.internal.mlkit_vision_barcode;

import s3.b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzqz extends zzrd {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzqz(String str, boolean z10, int i, zzqy zzqyVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzrd) {
            zzrd zzrdVar = (zzrd) obj;
            if (this.zza.equals(zzrdVar.zzb()) && this.zzb == zzrdVar.zzc() && this.zzc == zzrdVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z10 = this.zzb;
        int i = this.zzc;
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        return b.m(sb2, i, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrd
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrd
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrd
    public final boolean zzc() {
        return this.zzb;
    }
}

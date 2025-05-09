package com.google.android.gms.internal.mlkit_common;

import s3.b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzpa extends zzph {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzpa(String str, boolean z10, int i, zzoz zzozVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzph) {
            zzph zzphVar = (zzph) obj;
            if (this.zza.equals(zzphVar.zzb()) && this.zzb == zzphVar.zzc() && this.zzc == zzphVar.zza()) {
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

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzph
    public final boolean zzc() {
        return this.zzb;
    }
}

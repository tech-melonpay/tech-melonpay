package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzlt {
    private final zzlp zza;
    private final zzlr zzb;
    private final zzlr zzc;
    private final Boolean zzd;

    public /* synthetic */ zzlt(zzlq zzlqVar, zzls zzlsVar) {
        zzlp zzlpVar;
        zzlpVar = zzlqVar.zza;
        this.zza = zzlpVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzlt) && Objects.equal(this.zza, ((zzlt) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    @zzbo(zza = 1)
    public final zzlp zza() {
        return this.zza;
    }
}

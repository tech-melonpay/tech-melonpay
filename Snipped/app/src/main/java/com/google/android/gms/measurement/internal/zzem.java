package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzem {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzem(String str, String str2, Bundle bundle, long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j10;
    }

    public static zzem zzb(zzat zzatVar) {
        return new zzem(zzatVar.zza, zzatVar.zzc, zzatVar.zzb.zzc(), zzatVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        androidx.camera.core.impl.utils.a.u(sb2, "origin=", str, ",name=", str2);
        return androidx.camera.core.impl.utils.a.n(sb2, ",params=", obj);
    }

    public final zzat zza() {
        return new zzat(this.zza, new zzar(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}

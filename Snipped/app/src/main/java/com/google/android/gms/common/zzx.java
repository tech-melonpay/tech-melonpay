package com.google.android.gms.common;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z10, int i, int i9, String str, Throwable th) {
        this.zza = z10;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx zzd(String str, Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx zzf(int i) {
        return new zzx(true, i, 1, null, null);
    }

    public static zzx zzg(int i, int i9, String str, Throwable th) {
        return new zzx(false, i, i9, str, th);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}

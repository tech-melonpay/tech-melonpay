package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzfp implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzfs zza;
    private final String zzb;

    public zzfp(zzfs zzfsVar, String str) {
        this.zza = zzfsVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzs.zzay().zzd().zzb(this.zzb, th);
    }
}

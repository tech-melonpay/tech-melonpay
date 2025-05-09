package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzcl implements Callable<String> {
    final /* synthetic */ zzcn zza;

    public zzcl(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        return this.zza.zzc();
    }
}

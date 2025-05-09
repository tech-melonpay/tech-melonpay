package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzee;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* loaded from: classes.dex */
final class zzb implements Callable<String> {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        zzee zzeeVar;
        zzeeVar = this.zza.zzb;
        return zzeeVar.zzk();
    }
}

package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* loaded from: classes.dex */
final class zzcr extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzee zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.zzd = zzeeVar;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzd.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setCurrentScreen(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzh);
    }
}

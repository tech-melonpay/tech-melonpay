package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* loaded from: classes.dex */
final class zzcs extends zzdt {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.zza != null) {
            zzccVar2 = this.zzb.zzj;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            zzccVar = this.zzb.zzj;
            ((zzcc) Preconditions.checkNotNull(zzccVar)).clearMeasurementEnabled(this.zzh);
        }
    }
}

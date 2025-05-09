package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* loaded from: classes.dex */
final class zzdw extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ Activity zzb;
    final /* synthetic */ zzed zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzed zzedVar, Bundle bundle, Activity activity) {
        super(zzedVar.zza, true);
        this.zzc = zzedVar;
        this.zza = bundle;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        Bundle bundle;
        zzcc zzccVar;
        if (this.zza != null) {
            bundle = new Bundle();
            if (this.zza.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zza.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzccVar = this.zzc.zza.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).onActivityCreated(ObjectWrapper.wrap(this.zzb), bundle, this.zzi);
    }
}

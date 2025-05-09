package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* loaded from: classes.dex */
public final class zze implements zza {
    final Set<String> zza;
    private final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final AppMeasurementSdk zzc;
    private final zzd zzd;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set<String> set) {
        this.zza.clear();
        Set<String> set2 = this.zza;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (zzc.zzf(str) && zzc.zzg(str)) {
                String zzd = zzc.zzd(str);
                Preconditions.checkNotNull(zzd);
                hashSet.add(zzd);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}

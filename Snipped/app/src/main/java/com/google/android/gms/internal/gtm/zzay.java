package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import androidx.camera.core.impl.utils.a;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzay extends com.google.android.gms.analytics.zzj<zzay> {
    private final Map<Integer, Double> zza = new HashMap(4);

    @SuppressLint({"UseSparseArrays"})
    public zzay() {
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(a.n(new StringBuilder(valueOf.length() + 6), "metric", valueOf), entry.getValue());
        }
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(zzay zzayVar) {
        zzayVar.zza.putAll(this.zza);
    }

    public final Map<Integer, Double> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}

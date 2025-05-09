package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzg implements zzt {
    private static final Uri zza;
    private final LogPrinter zzb = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority(ImagesContract.LOCAL);
        zza = builder.build();
    }

    @Override // com.google.android.gms.analytics.zzt
    public final Uri zzb() {
        return zza;
    }

    @Override // com.google.android.gms.analytics.zzt
    public final void zze(zzh zzhVar) {
        ArrayList arrayList = new ArrayList(zzhVar.zze());
        Collections.sort(arrayList, new zzf(this));
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((zzj) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(obj);
            }
        }
        this.zzb.println(sb2.toString());
    }
}

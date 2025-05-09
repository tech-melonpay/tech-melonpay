package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzb extends zzbr implements zzt {
    private static DecimalFormat zza;
    private final zzbv zzb;
    private final String zzc;
    private final Uri zzd;

    public zzb(zzbv zzbvVar, String str) {
        super(zzbvVar);
        Preconditions.checkNotEmpty(str);
        this.zzb = zzbvVar;
        this.zzc = str;
        this.zzd = zza(str);
    }

    public static Uri zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static String zzc(double d10) {
        if (zza == null) {
            zza = new DecimalFormat("0.######");
        }
        return zza.format(d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> zzd(com.google.android.gms.analytics.zzh r12) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.zzb.zzd(com.google.android.gms.analytics.zzh):java.util.Map");
    }

    private static void zzf(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private static void zzg(Map<String, String> map, String str, boolean z10) {
        if (z10) {
            map.put(str, "1");
        }
    }

    @Override // com.google.android.gms.analytics.zzt
    public final Uri zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.analytics.zzt
    public final void zze(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkArgument(zzhVar.zzm(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzh zzhVar2 = new zzh(zzhVar);
        zzbe zzbeVar = (zzbe) zzhVar2.zzb(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zzf())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without client id");
            return;
        }
        if (this.zzb.zzc().getAppOptOut()) {
            return;
        }
        if (zzfs.zzj(0.0d, zzbeVar.zze())) {
            zzG("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
            return;
        }
        Map<String, String> zzd = zzd(zzhVar2);
        zzd.put("v", "1");
        zzd.put("_v", zzbt.zzb);
        zzd.put("tid", this.zzc);
        if (this.zzb.zzc().isDryRunEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : zzd.entrySet()) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append("=");
                sb2.append(entry.getValue());
            }
            zzN("Dry run is enabled. GoogleAnalytics would have sent", sb2.toString());
            return;
        }
        HashMap hashMap = new HashMap();
        zzfs.zzg(hashMap, "uid", zzbeVar.zzg());
        zzav zzavVar = (zzav) zzhVar.zzc(zzav.class);
        if (zzavVar != null) {
            zzfs.zzg(hashMap, "an", zzavVar.zzf());
            zzfs.zzg(hashMap, "aid", zzavVar.zzd());
            zzfs.zzg(hashMap, "av", zzavVar.zzg());
            zzfs.zzg(hashMap, "aiid", zzavVar.zze());
        }
        zzd.put("_s", String.valueOf(zzs().zza(new zzbx(0L, zzbeVar.zze(), this.zzc, !TextUtils.isEmpty(zzbeVar.zzd()), 0L, hashMap))));
        zzs().zzh(new zzex(zzz(), zzd, zzhVar.zza(), true));
    }
}

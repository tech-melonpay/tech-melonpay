package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzez {
    private long zzb;
    private final Clock zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzez(int i, long j10, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                long currentTimeMillis = this.zze.currentTimeMillis();
                double d10 = this.zza;
                if (d10 < 60.0d) {
                    double d11 = (currentTimeMillis - this.zzb) / 2000.0d;
                    if (d11 > 0.0d) {
                        d10 = Math.min(60.0d, d10 + d11);
                        this.zza = d10;
                    }
                }
                this.zzb = currentTimeMillis;
                if (d10 >= 1.0d) {
                    this.zza = d10 - 1.0d;
                    return true;
                }
                String str = this.zzd;
                StringBuilder sb2 = new StringBuilder(str.length() + 34);
                sb2.append("Excessive ");
                sb2.append(str);
                sb2.append(" detected; call ignored.");
                zzfa.zze(sb2.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public class zzk<T extends zzk> {
    protected final zzh zza;
    private final zzr zzb;
    private final List<zzi> zzc;

    @VisibleForTesting
    public zzk(zzr zzrVar, Clock clock) {
        Preconditions.checkNotNull(zzrVar);
        this.zzb = zzrVar;
        this.zzc = new ArrayList();
        zzh zzhVar = new zzh(this, clock);
        zzhVar.zzh();
        this.zza = zzhVar;
    }

    public void zze(zzh zzhVar) {
        throw null;
    }

    public final zzr zzm() {
        return this.zzb;
    }

    public final void zzn(zzh zzhVar) {
        Iterator<zzi> it = this.zzc.iterator();
        while (it.hasNext()) {
            it.next().zza();
        }
    }
}

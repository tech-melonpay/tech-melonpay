package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzfb extends zzjt<zzfc, zzfb> implements zzld {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzfb() {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzfc r0 = com.google.android.gms.internal.measurement.zzfc.zzf()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.<init>():void");
    }

    public final int zza() {
        return ((zzfc) this.zza).zzb();
    }

    public final zzfa zzb(int i) {
        return ((zzfc) this.zza).zzd(i);
    }

    public final zzfb zzc() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        ((zzfc) this.zza).zzk = zzjx.zzbA();
        return this;
    }

    public final zzfb zzd(int i, zzez zzezVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfc.zzm((zzfc) this.zza, i, zzezVar.zzaA());
        return this;
    }

    public final List<zzeh> zze() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzi());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ zzfb(com.google.android.gms.internal.measurement.zzey r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.zzfc r1 = com.google.android.gms.internal.measurement.zzfc.zzf()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfb.<init>(com.google.android.gms.internal.measurement.zzey):void");
    }
}

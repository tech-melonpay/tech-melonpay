package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzai implements zzap, zzal {
    protected final String zzd;
    protected final Map<String, zzap> zze = new HashMap();

    public zzai(String str) {
        this.zzd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.zzd;
        if (str != null) {
            return str.equals(zzaiVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzap zza(zzg zzgVar, List<zzap> list);

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbK(String str, zzg zzgVar, List<zzap> list) {
        return "toString".equals(str) ? new zzat(this.zzd) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final String zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        return this.zze.containsKey(str) ? this.zze.get(str) : zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator<zzap> zzl() {
        return zzaj.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zze.remove(str);
        } else {
            this.zze.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.zze.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzd() {
        return this;
    }
}

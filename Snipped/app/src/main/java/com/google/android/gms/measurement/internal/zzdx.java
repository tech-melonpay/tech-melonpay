package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdx<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzdu<V> zzc;
    private final V zzd;
    private final V zze;
    private final Object zzf = new Object();
    private volatile V zzg = null;
    private volatile V zzh = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzdx(String str, Object obj, Object obj2, zzdu zzduVar, zzdw zzdwVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzduVar;
    }

    public final V zza(V v10) {
        List<zzdx> list;
        synchronized (this.zzf) {
        }
        if (v10 != null) {
            return v10;
        }
        if (zzdv.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            try {
                if (zzaa.zza()) {
                    return this.zzh == null ? this.zzd : this.zzh;
                }
                try {
                    list = zzdy.zzaD;
                    for (zzdx zzdxVar : list) {
                        if (zzaa.zza()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V v11 = null;
                        try {
                            zzdu<V> zzduVar = zzdxVar.zzc;
                            if (zzduVar != null) {
                                v11 = zzduVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzdxVar.zzh = v11;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzdu<V> zzduVar2 = this.zzc;
                if (zzduVar2 == null) {
                    return this.zzd;
                }
                try {
                    return zzduVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.zzd;
                } catch (SecurityException unused4) {
                    return this.zzd;
                }
            } finally {
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}

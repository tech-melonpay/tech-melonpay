package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzip implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjo zzf;

    public zzip(zzjo zzjoVar, String str, String str2, zzp zzpVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjoVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:158), block:B:44:0x009c */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2;
        zzeb zzebVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzebVar = this.zzf.zzb;
                if (zzebVar == null) {
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzkv> zzh = zzebVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzkv zzkvVar : zzh) {
                        String str = zzkvVar.zze;
                        if (str != null) {
                            bundle.putString(zzkvVar.zzb, str);
                        } else {
                            Long l10 = zzkvVar.zzd;
                            if (l10 != null) {
                                bundle.putLong(zzkvVar.zzb, l10.longValue());
                            } else {
                                Double d10 = zzkvVar.zzg;
                                if (d10 != null) {
                                    bundle.putDouble(zzkvVar.zzb, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e10);
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                }
            } catch (RemoteException e12) {
                bundle = bundle3;
                e10 = e12;
            } catch (Throwable th) {
                th = th;
                this.zzf.zzs.zzv().zzQ(this.zze, bundle3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bundle3 = bundle2;
            this.zzf.zzs.zzv().zzQ(this.zze, bundle3);
            throw th;
        }
    }
}

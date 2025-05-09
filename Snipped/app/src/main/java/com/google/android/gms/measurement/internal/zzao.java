package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzao {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzar zzf;

    public zzao(zzfv zzfvVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzar zzarVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfvVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzel.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzarVar = new zzar(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfvVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzfvVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzfvVar.zzay().zzk().zzb("Param value can't be null", zzfvVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfvVar.zzv().zzN(bundle2, next, zzA);
                    }
                }
            }
            zzarVar = new zzar(bundle2);
        }
        this.zzf = zzarVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String zzarVar = this.zzf.toString();
        StringBuilder sb2 = new StringBuilder(zzarVar.length() + String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        androidx.camera.core.impl.utils.a.u(sb2, "Event{appId='", str, "', name='", str2);
        sb2.append("', params=");
        sb2.append(zzarVar);
        sb2.append('}');
        return sb2.toString();
    }

    public final zzao zza(zzfv zzfvVar, long j10) {
        return new zzao(zzfvVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzao(zzfv zzfvVar, String str, String str2, String str3, long j10, long j11, zzar zzarVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzarVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzfvVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzel.zzn(str2), zzel.zzn(str3));
        }
        this.zzf = zzarVar;
    }
}

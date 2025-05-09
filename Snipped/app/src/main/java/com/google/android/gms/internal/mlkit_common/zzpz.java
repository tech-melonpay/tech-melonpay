package com.google.android.gms.internal.mlkit_common;

import A3.j;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.ModelType;
import z3.AbstractC1643b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpz {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zzlk zza(AbstractC1643b abstractC1643b, j jVar, zzpp zzppVar) {
        long j10;
        ModelType zzb = zzppVar.zzb();
        abstractC1643b.getClass();
        zzlq zzlqVar = new zzlq();
        zzll zzllVar = new zzll();
        zzllVar.zzc((String) AbstractC1643b.f31275a.get(null));
        zzllVar.zzd(zzln.CLOUD);
        zzllVar.zza(zzag.zzb(null));
        int ordinal = zzb.ordinal();
        zzllVar.zzb(ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? zzlm.TYPE_UNKNOWN : zzlm.BASE_DIGITAL_INK : zzlm.CUSTOM : zzlm.BASE_TRANSLATE);
        zzlqVar.zzb(zzllVar.zzg());
        zzlt zzc = zzlqVar.zzc();
        zzlh zzlhVar = new zzlh();
        zzlhVar.zzd(zzppVar.zzc());
        zzlhVar.zzc(zzppVar.zzd());
        zzlhVar.zzb(Long.valueOf(zzppVar.zza()));
        zzlhVar.zzf(zzc);
        if (zzppVar.zzg()) {
            long b9 = jVar.b(abstractC1643b);
            if (b9 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                synchronized (jVar) {
                    j10 = jVar.c().getLong("model_first_use_time_" + AbstractC1643b.a(), 0L);
                }
                if (j10 == 0) {
                    j10 = SystemClock.elapsedRealtime();
                    synchronized (jVar) {
                        jVar.c().edit().putLong("model_first_use_time_" + AbstractC1643b.a(), j10).apply();
                    }
                }
                zzlhVar.zzg(Long.valueOf(j10 - b9));
            }
        }
        if (zzppVar.zzf()) {
            long b10 = jVar.b(abstractC1643b);
            if (b10 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzlhVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - b10));
            }
        }
        return zzlhVar.zzi();
    }
}

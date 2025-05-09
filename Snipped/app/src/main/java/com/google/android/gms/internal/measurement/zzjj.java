package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public final class zzjj {
    static final zzjj zza = new zzjj(true);
    private static volatile boolean zzb = false;
    private static volatile zzjj zzc;
    private static volatile zzjj zzd;
    private final Map<zzji, zzjv<?, ?>> zze;

    public zzjj() {
        this.zze = new HashMap();
    }

    public static zzjj zza() {
        zzjj zzjjVar = zzc;
        if (zzjjVar == null) {
            synchronized (zzjj.class) {
                try {
                    zzjjVar = zzc;
                    if (zzjjVar == null) {
                        zzjjVar = zza;
                        zzc = zzjjVar;
                    }
                } finally {
                }
            }
        }
        return zzjjVar;
    }

    public static zzjj zzb() {
        zzjj zzjjVar = zzd;
        if (zzjjVar != null) {
            return zzjjVar;
        }
        synchronized (zzjj.class) {
            try {
                zzjj zzjjVar2 = zzd;
                if (zzjjVar2 != null) {
                    return zzjjVar2;
                }
                zzjj zzb2 = zzjr.zzb(zzjj.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends zzlc> zzjv<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzjv) this.zze.get(new zzji(containingtype, i));
    }

    public zzjj(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}

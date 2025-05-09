package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public class zzuj {
    static final zzuj zza = new zzuj(true);
    private static volatile boolean zzb = false;
    private static volatile zzuj zzc;
    private static volatile zzuj zzd;
    private final Map<zzui, zzux<?, ?>> zze;

    public zzuj() {
        this.zze = new HashMap();
    }

    public static zzuj zza() {
        zzuj zzujVar = zzc;
        if (zzujVar == null) {
            synchronized (zzuj.class) {
                try {
                    zzujVar = zzc;
                    if (zzujVar == null) {
                        zzujVar = zza;
                        zzc = zzujVar;
                    }
                } finally {
                }
            }
        }
        return zzujVar;
    }

    public static zzuj zzb() {
        zzuj zzujVar = zzd;
        if (zzujVar != null) {
            return zzujVar;
        }
        synchronized (zzuj.class) {
            try {
                zzuj zzujVar2 = zzd;
                if (zzujVar2 != null) {
                    return zzujVar2;
                }
                zzuj zzb2 = zzur.zzb(zzuj.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <ContainingType extends zzwk> zzux<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzux) this.zze.get(new zzui(containingtype, i));
    }

    public zzuj(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}

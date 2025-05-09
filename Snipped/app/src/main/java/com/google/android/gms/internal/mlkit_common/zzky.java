package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public enum zzky implements zzbm {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzky(int i) {
        this.zzd = i;
    }

    public static zzky zzb(int i) {
        for (zzky zzkyVar : values()) {
            if (zzkyVar.zzd == i) {
                return zzkyVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbm
    public final int zza() {
        return this.zzd;
    }
}

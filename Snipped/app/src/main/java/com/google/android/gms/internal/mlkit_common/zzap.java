package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzap extends zzah {
    private final zzar zza;

    public zzap(zzar zzarVar, int i) {
        super(zzarVar.size(), i);
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzah
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}

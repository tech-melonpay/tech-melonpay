package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzhx<T> extends zzhz<T> {
    static final zzhx<Object> zza = new zzhx<>();

    private zzhx() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final T zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final boolean zzb() {
        return false;
    }
}

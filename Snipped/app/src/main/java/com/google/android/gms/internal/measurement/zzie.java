package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzie<T> implements Serializable, zzib {
    final T zza;

    public zzie(T t3) {
        this.zza = t3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzie)) {
            return false;
        }
        T t3 = this.zza;
        T t10 = ((zzie) obj).zza;
        return t3 == t10 || t3.equals(t10);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return b.n(new StringBuilder(obj.length() + 22), "Suppliers.ofInstance(", obj, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        return this.zza;
    }
}

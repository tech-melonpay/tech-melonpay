package com.google.android.gms.internal.common;

import com.google.android.gms.measurement.internal.a;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i9 = 0; i9 < i; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(a.g(i9, "at index "));
            }
        }
        return objArr;
    }
}

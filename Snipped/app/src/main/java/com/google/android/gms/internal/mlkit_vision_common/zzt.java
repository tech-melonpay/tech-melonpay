package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.measurement.internal.a;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i9 = 0; i9 < i; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(a.g(i9, "at index "));
            }
        }
        return objArr;
    }
}

package com.google.android.gms.internal.mlkit_common;

import androidx.camera.core.n;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzai {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(n.a("null value in entry: ", obj.toString(), "=null"));
        }
    }
}

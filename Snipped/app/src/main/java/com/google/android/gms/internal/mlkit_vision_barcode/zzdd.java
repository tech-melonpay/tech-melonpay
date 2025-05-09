package com.google.android.gms.internal.mlkit_vision_barcode;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdd extends zzde {
    public static int zza(int i, int i9, int i10) {
        return Math.min(Math.max(i, i9), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i, int i9, long j10, int i10, int i11, int i12, int i13) {
        zzmjVar.zzc(zzc(i, i9, j10, i10, i11, i12, i13), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i, int i9, long j10, int i10, int i11, int i12, int i13) {
        zzmjVar.zzc(zzc(i, i9, j10, i10, i11, i12, i13), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i, int i9, long j10, int i10, int i11, int i12, int i13) {
        return new zzmt(i, i9, i12, i10, i11, SystemClock.elapsedRealtime() - j10, i13);
    }
}

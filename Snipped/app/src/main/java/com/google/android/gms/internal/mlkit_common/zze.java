package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import j3.e;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zze extends zzs {
    @Override // com.google.android.gms.internal.mlkit_common.zzs
    public final int zza(Context context, zzr zzrVar, boolean z10) {
        return (zzrVar.zza.getAuthority().lastIndexOf(64) < 0 || e.f(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
/* loaded from: classes.dex */
final class zas {
    final /* synthetic */ BasePendingResult zaa;

    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    public final void finalize() {
        Result result;
        result = this.zaa.zaj;
        BasePendingResult.zal(result);
        super.finalize();
    }
}

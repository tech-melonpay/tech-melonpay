package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
/* loaded from: classes.dex */
public final class zal extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zae(zaa, zakVar);
        zad(1, zaa);
    }
}

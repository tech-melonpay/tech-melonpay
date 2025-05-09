package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzbp extends zzbm implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final Bundle zzd(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        Parcel zzb = zzb(1, zza);
        Bundle bundle2 = (Bundle) zzbo.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }
}

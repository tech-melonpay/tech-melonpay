package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i9) {
        if (i == 1) {
            zze(parcel.readString(), parcel.readString(), (Bundle) zzbo.zza(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    final IBinder zab;

    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private final ConnectionResult zac;

    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private final boolean zad;

    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private final boolean zae;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) boolean z11) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z10;
        this.zae = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.zac.equals(zavVar.zac) && Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zac;
    }

    public final IAccountAccessor zab() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}

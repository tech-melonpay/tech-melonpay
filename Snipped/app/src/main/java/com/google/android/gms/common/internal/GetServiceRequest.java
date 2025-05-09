package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    static final Scope[] zza = new Scope[0];
    static final Feature[] zzb = new Feature[0];

    @SafeParcelable.VersionField(id = 1)
    final int zzc;

    @SafeParcelable.Field(id = 2)
    final int zzd;

    @SafeParcelable.Field(id = 3)
    final int zze;

    @SafeParcelable.Field(id = 4)
    String zzf;

    @SafeParcelable.Field(id = 5)
    IBinder zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    Scope[] zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    Bundle zzi;

    @SafeParcelable.Field(id = 8)
    Account zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    Feature[] zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    Feature[] zzl;

    @SafeParcelable.Field(id = 12)
    final boolean zzm;

    @SafeParcelable.Field(defaultValue = "0", id = 13)
    final int zzn;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzo;

    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i9, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z10, @SafeParcelable.Param(id = 13) int i11, @SafeParcelable.Param(id = 14) boolean z11, @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i;
        this.zzd = i9;
        this.zze = i10;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i < 2) {
            this.zzj = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z10;
        this.zzn = i11;
        this.zzo = z11;
        this.zzp = str2;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public final String zza() {
        return this.zzp;
    }
}

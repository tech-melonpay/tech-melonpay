package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new zzau();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzar zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzat(zzat zzatVar, long j10) {
        Preconditions.checkNotNull(zzatVar);
        this.zza = zzatVar.zza;
        this.zzb = zzatVar.zzb;
        this.zzc = zzatVar.zzc;
        this.zzd = j10;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(a.u(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        androidx.camera.core.impl.utils.a.u(sb2, "origin=", str, ",name=", str2);
        return androidx.camera.core.impl.utils.a.n(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzau.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzat(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzar zzarVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j10) {
        this.zza = str;
        this.zzb = zzarVar;
        this.zzc = str2;
        this.zzd = j10;
    }
}

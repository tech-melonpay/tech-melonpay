package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzsd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsd> CREATOR = new zzss();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzsh zza;

    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzsi[] zzd;

    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzsf[] zze;

    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] zzf;

    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzsa[] zzg;

    @SafeParcelable.Constructor
    public zzsd(@SafeParcelable.Param(id = 1) zzsh zzshVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzsi[] zzsiVarArr, @SafeParcelable.Param(id = 5) zzsf[] zzsfVarArr, @SafeParcelable.Param(id = 6) String[] strArr, @SafeParcelable.Param(id = 7) zzsa[] zzsaVarArr) {
        this.zza = zzshVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzsiVarArr;
        this.zze = zzsfVarArr;
        this.zzf = strArr;
        this.zzg = zzsaVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzsh zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzsa[] zzd() {
        return this.zzg;
    }

    public final zzsf[] zze() {
        return this.zze;
    }

    public final zzsi[] zzf() {
        return this.zzd;
    }

    public final String[] zzg() {
        return this.zzf;
    }
}

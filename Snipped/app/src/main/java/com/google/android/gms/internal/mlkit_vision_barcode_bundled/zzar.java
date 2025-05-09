package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new zzbg();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzav zza;

    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzaw[] zzd;

    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzat[] zze;

    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] zzf;

    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzao[] zzg;

    @SafeParcelable.Constructor
    public zzar(@SafeParcelable.Param(id = 1) zzav zzavVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzaw[] zzawVarArr, @SafeParcelable.Param(id = 5) zzat[] zzatVarArr, @SafeParcelable.Param(id = 6) String[] strArr, @SafeParcelable.Param(id = 7) zzao[] zzaoVarArr) {
        this.zza = zzavVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawVarArr;
        this.zze = zzatVarArr;
        this.zzf = strArr;
        this.zzg = zzaoVarArr;
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
}

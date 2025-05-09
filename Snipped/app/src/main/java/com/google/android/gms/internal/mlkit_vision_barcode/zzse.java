package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
/* loaded from: classes.dex */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new zzst();

    @SafeParcelable.Field(getter = "getDocumentType", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getFirstName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getMiddleName", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getLastName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getGender", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getAddressStreet", id = 6)
    private final String zzf;

    @SafeParcelable.Field(getter = "getAddressCity", id = 7)
    private final String zzg;

    @SafeParcelable.Field(getter = "getAddressState", id = 8)
    private final String zzh;

    @SafeParcelable.Field(getter = "getAddressZip", id = 9)
    private final String zzi;

    @SafeParcelable.Field(getter = "getLicenseNumber", id = 10)
    private final String zzj;

    @SafeParcelable.Field(getter = "getIssueDate", id = 11)
    private final String zzk;

    @SafeParcelable.Field(getter = "getExpiryDate", id = 12)
    private final String zzl;

    @SafeParcelable.Field(getter = "getBirthDate", id = 13)
    private final String zzm;

    @SafeParcelable.Field(getter = "getIssuingCountry", id = 14)
    private final String zzn;

    @SafeParcelable.Constructor
    public zzse(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) String str6, @SafeParcelable.Param(id = 7) String str7, @SafeParcelable.Param(id = 8) String str8, @SafeParcelable.Param(id = 9) String str9, @SafeParcelable.Param(id = 10) String str10, @SafeParcelable.Param(id = 11) String str11, @SafeParcelable.Param(id = 12) String str12, @SafeParcelable.Param(id = 13) String str13, @SafeParcelable.Param(id = 14) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zzg;
    }

    public final String zzb() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzm;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzl;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzk;
    }

    public final String zzk() {
        return this.zzn;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzj;
    }

    public final String zzn() {
        return this.zzc;
    }
}

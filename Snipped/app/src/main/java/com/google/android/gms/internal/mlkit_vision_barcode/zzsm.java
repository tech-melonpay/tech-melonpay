package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes.dex */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new zzsn();

    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getDisplayValue", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getRawValue", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getRawBytes", id = 4)
    private final byte[] zzd;

    @SafeParcelable.Field(getter = "getCornerPoints", id = 5)
    private final Point[] zze;

    @SafeParcelable.Field(getter = "getValueType", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getEmailParcel", id = 7)
    private final zzsf zzg;

    @SafeParcelable.Field(getter = "getPhoneParcel", id = 8)
    private final zzsi zzh;

    @SafeParcelable.Field(getter = "getSmsParcel", id = 9)
    private final zzsj zzi;

    @SafeParcelable.Field(getter = "getWiFiParcel", id = 10)
    private final zzsl zzj;

    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", id = 11)
    private final zzsk zzk;

    @SafeParcelable.Field(getter = "getGeoPointParcel", id = 12)
    private final zzsg zzl;

    @SafeParcelable.Field(getter = "getCalendarEventParcel", id = 13)
    private final zzsc zzm;

    @SafeParcelable.Field(getter = "getContactInfoParcel", id = 14)
    private final zzsd zzn;

    @SafeParcelable.Field(getter = "getDriverLicenseParcel", id = 15)
    private final zzse zzo;

    @SafeParcelable.Constructor
    public zzsm(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Point[] pointArr, @SafeParcelable.Param(id = 6) int i9, @SafeParcelable.Param(id = 7) zzsf zzsfVar, @SafeParcelable.Param(id = 8) zzsi zzsiVar, @SafeParcelable.Param(id = 9) zzsj zzsjVar, @SafeParcelable.Param(id = 10) zzsl zzslVar, @SafeParcelable.Param(id = 11) zzsk zzskVar, @SafeParcelable.Param(id = 12) zzsg zzsgVar, @SafeParcelable.Param(id = 13) zzsc zzscVar, @SafeParcelable.Param(id = 14) zzsd zzsdVar, @SafeParcelable.Param(id = 15) zzse zzseVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i9;
        this.zzg = zzsfVar;
        this.zzh = zzsiVar;
        this.zzi = zzsjVar;
        this.zzj = zzslVar;
        this.zzk = zzskVar;
        this.zzl = zzsgVar;
        this.zzm = zzscVar;
        this.zzn = zzsdVar;
        this.zzo = zzseVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzsc zzc() {
        return this.zzm;
    }

    public final zzsd zzd() {
        return this.zzn;
    }

    public final zzse zze() {
        return this.zzo;
    }

    public final zzsf zzf() {
        return this.zzg;
    }

    public final zzsg zzg() {
        return this.zzl;
    }

    public final zzsi zzh() {
        return this.zzh;
    }

    public final zzsj zzi() {
        return this.zzi;
    }

    public final zzsk zzj() {
        return this.zzk;
    }

    public final zzsl zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}

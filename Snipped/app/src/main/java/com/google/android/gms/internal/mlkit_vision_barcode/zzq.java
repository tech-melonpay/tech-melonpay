package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(id = 2)
    public int zza;

    @SafeParcelable.Field(id = 3)
    public String zzb;

    @SafeParcelable.Field(id = 4)
    public String zzc;

    @SafeParcelable.Field(id = 5)
    public int zzd;

    @SafeParcelable.Field(id = 6)
    public Point[] zze;

    @SafeParcelable.Field(id = 7)
    public zzj zzf;

    @SafeParcelable.Field(id = 8)
    public zzm zzg;

    @SafeParcelable.Field(id = 9)
    public zzn zzh;

    @SafeParcelable.Field(id = 10)
    public zzp zzi;

    @SafeParcelable.Field(id = 11)
    public zzo zzj;

    @SafeParcelable.Field(id = 12)
    public zzk zzk;

    @SafeParcelable.Field(id = 13)
    public zzg zzl;

    @SafeParcelable.Field(id = 14)
    public zzh zzm;

    @SafeParcelable.Field(id = 15)
    public zzi zzn;

    @SafeParcelable.Field(id = 16)
    public byte[] zzo;

    @SafeParcelable.Field(id = 17)
    public boolean zzp;

    @SafeParcelable.Field(id = 18)
    public double zzq;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) int i9, @SafeParcelable.Param(id = 6) Point[] pointArr, @SafeParcelable.Param(id = 7) zzj zzjVar, @SafeParcelable.Param(id = 8) zzm zzmVar, @SafeParcelable.Param(id = 9) zzn zznVar, @SafeParcelable.Param(id = 10) zzp zzpVar, @SafeParcelable.Param(id = 11) zzo zzoVar, @SafeParcelable.Param(id = 12) zzk zzkVar, @SafeParcelable.Param(id = 13) zzg zzgVar, @SafeParcelable.Param(id = 14) zzh zzhVar, @SafeParcelable.Param(id = 15) zzi zziVar, @SafeParcelable.Param(id = 16) byte[] bArr, @SafeParcelable.Param(id = 17) boolean z10, @SafeParcelable.Param(id = 18) double d10) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i9;
        this.zze = pointArr;
        this.zzp = z10;
        this.zzq = d10;
        this.zzf = zzjVar;
        this.zzg = zzmVar;
        this.zzh = zznVar;
        this.zzi = zzpVar;
        this.zzj = zzoVar;
        this.zzk = zzkVar;
        this.zzl = zzgVar;
        this.zzm = zzhVar;
        this.zzn = zziVar;
    }
}

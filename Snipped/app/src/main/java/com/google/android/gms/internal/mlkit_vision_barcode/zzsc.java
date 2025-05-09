package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new zzsr();

    @SafeParcelable.Field(getter = "getSummary", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getDescription", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getOrganizer", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getStatus", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getStart", id = 6)
    private final zzsb zzf;

    @SafeParcelable.Field(getter = "getEnd", id = 7)
    private final zzsb zzg;

    @SafeParcelable.Constructor
    public zzsc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) zzsb zzsbVar, @SafeParcelable.Param(id = 7) zzsb zzsbVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzsbVar;
        this.zzg = zzsbVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzsb zza() {
        return this.zzg;
    }

    public final zzsb zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zza;
    }
}

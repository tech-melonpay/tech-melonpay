package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzbf();

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
    private final zzap zzf;

    @SafeParcelable.Field(getter = "getEnd", id = 7)
    private final zzap zzg;

    @SafeParcelable.Constructor
    public zzaq(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) zzap zzapVar, @SafeParcelable.Param(id = 7) zzap zzapVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzapVar;
        this.zzg = zzapVar2;
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
}

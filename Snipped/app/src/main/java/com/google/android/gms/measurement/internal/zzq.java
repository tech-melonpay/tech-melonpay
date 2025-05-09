package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzq implements Parcelable.Creator<zzp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzp createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = "";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str9 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i = 0;
        boolean z13 = false;
        long j15 = -2147483648L;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j15 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 14:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j14 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 24:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzp(str2, str3, str4, str5, j10, j11, str6, z10, z12, j15, str7, j12, j13, i, z11, z13, str8, bool, j14, arrayList, str9, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp[] newArray(int i) {
        return new zzp[i];
    }
}

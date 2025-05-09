package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f4513a;

    /* renamed from: b, reason: collision with root package name */
    public int f4514b;

    /* renamed from: c, reason: collision with root package name */
    public int f4515c;

    /* renamed from: d, reason: collision with root package name */
    public int f4516d;

    /* renamed from: e, reason: collision with root package name */
    public int f4517e;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.f4513a = parcel.readInt();
            parcelableVolumeInfo.f4515c = parcel.readInt();
            parcelableVolumeInfo.f4516d = parcel.readInt();
            parcelableVolumeInfo.f4517e = parcel.readInt();
            parcelableVolumeInfo.f4514b = parcel.readInt();
            return parcelableVolumeInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4513a);
        parcel.writeInt(this.f4515c);
        parcel.writeInt(this.f4516d);
        parcel.writeInt(this.f4517e);
        parcel.writeInt(this.f4514b);
    }
}

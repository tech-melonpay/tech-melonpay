package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f4518a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4519b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4520c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4521d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4522e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4523f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f4524g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4525h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4526j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f4527k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f4528a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f4529b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4530c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f4531d;

        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f4528a = parcel.readString();
            this.f4529b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4530c = parcel.readInt();
            this.f4531d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f4529b) + ", mIcon=" + this.f4530c + ", mExtras=" + this.f4531d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4528a);
            TextUtils.writeToParcel(this.f4529b, parcel, i);
            parcel.writeInt(this.f4530c);
            parcel.writeBundle(this.f4531d);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4518a = parcel.readInt();
        this.f4519b = parcel.readLong();
        this.f4521d = parcel.readFloat();
        this.f4525h = parcel.readLong();
        this.f4520c = parcel.readLong();
        this.f4522e = parcel.readLong();
        this.f4524g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4526j = parcel.readLong();
        this.f4527k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f4523f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f4518a + ", position=" + this.f4519b + ", buffered position=" + this.f4520c + ", speed=" + this.f4521d + ", updated=" + this.f4525h + ", actions=" + this.f4522e + ", error code=" + this.f4523f + ", error message=" + this.f4524g + ", custom actions=" + this.i + ", active item id=" + this.f4526j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4518a);
        parcel.writeLong(this.f4519b);
        parcel.writeFloat(this.f4521d);
        parcel.writeLong(this.f4525h);
        parcel.writeLong(this.f4520c);
        parcel.writeLong(this.f4522e);
        TextUtils.writeToParcel(this.f4524g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.f4526j);
        parcel.writeBundle(this.f4527k);
        parcel.writeInt(this.f4523f);
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f6621a;

    /* renamed from: b, reason: collision with root package name */
    public final List<BackStackRecordState> f6622b;

    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f6621a = arrayList;
        this.f6622b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f6621a);
        parcel.writeTypedList(this.f6622b);
    }

    public BackStackState(Parcel parcel) {
        this.f6621a = parcel.createStringArrayList();
        this.f6622b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}

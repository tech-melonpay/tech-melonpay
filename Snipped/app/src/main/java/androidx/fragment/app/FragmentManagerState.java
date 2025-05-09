package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f6783a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f6784b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f6785c;

    /* renamed from: d, reason: collision with root package name */
    public int f6786d;

    /* renamed from: e, reason: collision with root package name */
    public String f6787e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<String> f6788f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<BackStackState> f6789g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f6790h;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f6787e = null;
            fragmentManagerState.f6788f = new ArrayList<>();
            fragmentManagerState.f6789g = new ArrayList<>();
            fragmentManagerState.f6783a = parcel.createStringArrayList();
            fragmentManagerState.f6784b = parcel.createStringArrayList();
            fragmentManagerState.f6785c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.f6786d = parcel.readInt();
            fragmentManagerState.f6787e = parcel.readString();
            fragmentManagerState.f6788f = parcel.createStringArrayList();
            fragmentManagerState.f6789g = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.f6790h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f6783a);
        parcel.writeStringList(this.f6784b);
        parcel.writeTypedArray(this.f6785c, i);
        parcel.writeInt(this.f6786d);
        parcel.writeString(this.f6787e);
        parcel.writeStringList(this.f6788f);
        parcel.writeTypedList(this.f6789g);
        parcel.writeTypedList(this.f6790h);
    }
}

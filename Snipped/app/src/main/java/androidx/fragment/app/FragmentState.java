package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f6791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6792b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6794d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6795e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6796f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6797g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6798h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6799j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6800k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6801l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6802m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6803n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6804o;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f6791a = fragment.getClass().getName();
        this.f6792b = fragment.mWho;
        this.f6793c = fragment.mFromLayout;
        this.f6794d = fragment.mInDynamicContainer;
        this.f6795e = fragment.mFragmentId;
        this.f6796f = fragment.mContainerId;
        this.f6797g = fragment.mTag;
        this.f6798h = fragment.mRetainInstance;
        this.i = fragment.mRemoving;
        this.f6799j = fragment.mDetached;
        this.f6800k = fragment.mHidden;
        this.f6801l = fragment.mMaxState.ordinal();
        this.f6802m = fragment.mTargetWho;
        this.f6803n = fragment.mTargetRequestCode;
        this.f6804o = fragment.mUserVisibleHint;
    }

    public final Fragment a(k kVar, ClassLoader classLoader) {
        Fragment a10 = kVar.a(this.f6791a);
        a10.mWho = this.f6792b;
        a10.mFromLayout = this.f6793c;
        a10.mInDynamicContainer = this.f6794d;
        a10.mRestored = true;
        a10.mFragmentId = this.f6795e;
        a10.mContainerId = this.f6796f;
        a10.mTag = this.f6797g;
        a10.mRetainInstance = this.f6798h;
        a10.mRemoving = this.i;
        a10.mDetached = this.f6799j;
        a10.mHidden = this.f6800k;
        a10.mMaxState = Lifecycle.State.values()[this.f6801l];
        a10.mTargetWho = this.f6802m;
        a10.mTargetRequestCode = this.f6803n;
        a10.mUserVisibleHint = this.f6804o;
        return a10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f6791a);
        sb2.append(" (");
        sb2.append(this.f6792b);
        sb2.append(")}:");
        if (this.f6793c) {
            sb2.append(" fromLayout");
        }
        if (this.f6794d) {
            sb2.append(" dynamicContainer");
        }
        int i = this.f6796f;
        if (i != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i));
        }
        String str = this.f6797g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f6798h) {
            sb2.append(" retainInstance");
        }
        if (this.i) {
            sb2.append(" removing");
        }
        if (this.f6799j) {
            sb2.append(" detached");
        }
        if (this.f6800k) {
            sb2.append(" hidden");
        }
        String str2 = this.f6802m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f6803n);
        }
        if (this.f6804o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6791a);
        parcel.writeString(this.f6792b);
        parcel.writeInt(this.f6793c ? 1 : 0);
        parcel.writeInt(this.f6794d ? 1 : 0);
        parcel.writeInt(this.f6795e);
        parcel.writeInt(this.f6796f);
        parcel.writeString(this.f6797g);
        parcel.writeInt(this.f6798h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f6799j ? 1 : 0);
        parcel.writeInt(this.f6800k ? 1 : 0);
        parcel.writeInt(this.f6801l);
        parcel.writeString(this.f6802m);
        parcel.writeInt(this.f6803n);
        parcel.writeInt(this.f6804o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f6791a = parcel.readString();
        this.f6792b = parcel.readString();
        this.f6793c = parcel.readInt() != 0;
        this.f6794d = parcel.readInt() != 0;
        this.f6795e = parcel.readInt();
        this.f6796f = parcel.readInt();
        this.f6797g = parcel.readString();
        this.f6798h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f6799j = parcel.readInt() != 0;
        this.f6800k = parcel.readInt() != 0;
        this.f6801l = parcel.readInt();
        this.f6802m = parcel.readString();
        this.f6803n = parcel.readInt();
        this.f6804o = parcel.readInt() != 0;
    }
}

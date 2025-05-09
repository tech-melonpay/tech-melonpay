package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NavBackStackEntryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f7146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7147b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7148c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f7149d;

    /* compiled from: NavBackStackEntryState.kt */
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        this.f7146a = navBackStackEntry.f7137f;
        this.f7147b = navBackStackEntry.f7133b.f7267h;
        this.f7148c = navBackStackEntry.a();
        Bundle bundle = new Bundle();
        this.f7149d = bundle;
        navBackStackEntry.i.c(bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7146a);
        parcel.writeInt(this.f7147b);
        parcel.writeBundle(this.f7148c);
        parcel.writeBundle(this.f7149d);
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.f7146a = parcel.readString();
        this.f7147b = parcel.readInt();
        this.f7148c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f7149d = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}

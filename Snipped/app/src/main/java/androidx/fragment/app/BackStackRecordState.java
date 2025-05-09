package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6608a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f6609b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f6610c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6611d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6612e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6613f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6614g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6615h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6616j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f6617k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f6618l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f6619m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6620n;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C0527a c0527a) {
        int size = c0527a.f6919a.size();
        this.f6608a = new int[size * 6];
        if (!c0527a.f6925g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6609b = new ArrayList<>(size);
        this.f6610c = new int[size];
        this.f6611d = new int[size];
        int i = 0;
        for (int i9 = 0; i9 < size; i9++) {
            w.a aVar = c0527a.f6919a.get(i9);
            int i10 = i + 1;
            this.f6608a[i] = aVar.f6935a;
            ArrayList<String> arrayList = this.f6609b;
            Fragment fragment = aVar.f6936b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f6608a;
            iArr[i10] = aVar.f6937c ? 1 : 0;
            iArr[i + 2] = aVar.f6938d;
            iArr[i + 3] = aVar.f6939e;
            int i11 = i + 5;
            iArr[i + 4] = aVar.f6940f;
            i += 6;
            iArr[i11] = aVar.f6941g;
            this.f6610c[i9] = aVar.f6942h.ordinal();
            this.f6611d[i9] = aVar.i.ordinal();
        }
        this.f6612e = c0527a.f6924f;
        this.f6613f = c0527a.i;
        this.f6614g = c0527a.f6840t;
        this.f6615h = c0527a.f6927j;
        this.i = c0527a.f6928k;
        this.f6616j = c0527a.f6929l;
        this.f6617k = c0527a.f6930m;
        this.f6618l = c0527a.f6931n;
        this.f6619m = c0527a.f6932o;
        this.f6620n = c0527a.f6933p;
    }

    public final void a(C0527a c0527a) {
        int i = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f6608a;
            boolean z10 = true;
            if (i >= iArr.length) {
                c0527a.f6924f = this.f6612e;
                c0527a.i = this.f6613f;
                c0527a.f6925g = true;
                c0527a.f6927j = this.f6615h;
                c0527a.f6928k = this.i;
                c0527a.f6929l = this.f6616j;
                c0527a.f6930m = this.f6617k;
                c0527a.f6931n = this.f6618l;
                c0527a.f6932o = this.f6619m;
                c0527a.f6933p = this.f6620n;
                return;
            }
            w.a aVar = new w.a();
            int i10 = i + 1;
            aVar.f6935a = iArr[i];
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Instantiate " + c0527a + " op #" + i9 + " base fragment #" + iArr[i10]);
            }
            aVar.f6942h = Lifecycle.State.values()[this.f6610c[i9]];
            aVar.i = Lifecycle.State.values()[this.f6611d[i9]];
            int i11 = i + 2;
            if (iArr[i10] == 0) {
                z10 = false;
            }
            aVar.f6937c = z10;
            int i12 = iArr[i11];
            aVar.f6938d = i12;
            int i13 = iArr[i + 3];
            aVar.f6939e = i13;
            int i14 = i + 5;
            int i15 = iArr[i + 4];
            aVar.f6940f = i15;
            i += 6;
            int i16 = iArr[i14];
            aVar.f6941g = i16;
            c0527a.f6920b = i12;
            c0527a.f6921c = i13;
            c0527a.f6922d = i15;
            c0527a.f6923e = i16;
            c0527a.b(aVar);
            i9++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f6608a);
        parcel.writeStringList(this.f6609b);
        parcel.writeIntArray(this.f6610c);
        parcel.writeIntArray(this.f6611d);
        parcel.writeInt(this.f6612e);
        parcel.writeString(this.f6613f);
        parcel.writeInt(this.f6614g);
        parcel.writeInt(this.f6615h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f6616j);
        TextUtils.writeToParcel(this.f6617k, parcel, 0);
        parcel.writeStringList(this.f6618l);
        parcel.writeStringList(this.f6619m);
        parcel.writeInt(this.f6620n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6608a = parcel.createIntArray();
        this.f6609b = parcel.createStringArrayList();
        this.f6610c = parcel.createIntArray();
        this.f6611d = parcel.createIntArray();
        this.f6612e = parcel.readInt();
        this.f6613f = parcel.readString();
        this.f6614g = parcel.readInt();
        this.f6615h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f6616j = parcel.readInt();
        this.f6617k = (CharSequence) creator.createFromParcel(parcel);
        this.f6618l = parcel.createStringArrayList();
        this.f6619m = parcel.createStringArrayList();
        this.f6620n = parcel.readInt() != 0;
    }
}

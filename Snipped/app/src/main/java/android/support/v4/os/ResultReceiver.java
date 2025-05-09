package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public android.support.v4.os.a f4532a;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            android.support.v4.os.a aVar;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder readStrongBinder = parcel.readStrongBinder();
            int i = a.AbstractBinderC0056a.f4535c;
            if (readStrongBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(android.support.v4.os.a.f4534a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.os.a)) {
                    a.AbstractBinderC0056a.C0057a c0057a = new a.AbstractBinderC0056a.C0057a();
                    c0057a.f4536c = readStrongBinder;
                    aVar = c0057a;
                } else {
                    aVar = (android.support.v4.os.a) queryLocalInterface;
                }
            }
            resultReceiver.f4532a = aVar;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class b extends a.AbstractBinderC0056a {
        public b() {
            attachInterface(this, android.support.v4.os.a.f4534a);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f4532a == null) {
                    this.f4532a = new b();
                }
                parcel.writeStrongBinder(this.f4532a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}

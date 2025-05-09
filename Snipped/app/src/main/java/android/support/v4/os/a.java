package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4534a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0056a extends Binder implements a {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f4535c = 0;

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0057a implements a {

            /* renamed from: c, reason: collision with root package name */
            public IBinder f4536c;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4536c;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i9) {
            String str = a.f4534a;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i9);
            }
            int readInt = parcel.readInt();
            Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.a(readInt, (Bundle) createFromParcel);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}

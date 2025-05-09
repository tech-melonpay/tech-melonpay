package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: INotificationSideChannel.java */
/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0579a extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8272b = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0090a extends Binder implements InterfaceC0579a {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f8273c = 0;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        public static class C0091a implements InterfaceC0579a {

            /* renamed from: c, reason: collision with root package name */
            public IBinder f8274c;

            @Override // b.InterfaceC0579a
            public final void a(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0579a.f8272b);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8274c.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f8274c;
            }
        }
    }

    void a(String str, int i, String str2, Notification notification);
}

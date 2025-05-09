package u9;

import android.content.Context;
import io.sentry.InterfaceC0859q;
import io.sentry.android.core.internal.util.ConnectivityChecker;

/* compiled from: AndroidTransportGate.java */
/* loaded from: classes2.dex */
public final class k implements I9.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30437a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0859q f30438b;

    /* compiled from: AndroidTransportGate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30439a;

        static {
            int[] iArr = new int[ConnectivityChecker.Status.values().length];
            f30439a = iArr;
            try {
                iArr[ConnectivityChecker.Status.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30439a[ConnectivityChecker.Status.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30439a[ConnectivityChecker.Status.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(Context context, InterfaceC0859q interfaceC0859q) {
        this.f30437a = context;
        this.f30438b = interfaceC0859q;
    }

    @Override // I9.g
    public final boolean isConnected() {
        int i = a.f30439a[ConnectivityChecker.a(this.f30437a, this.f30438b).ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}

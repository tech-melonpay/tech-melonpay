package q;

import android.os.CancellationSignal;

/* compiled from: CancellationSignalProvider.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a f25814a = new a();

    /* renamed from: b, reason: collision with root package name */
    public CancellationSignal f25815b;

    /* renamed from: c, reason: collision with root package name */
    public t0.d f25816c;

    /* compiled from: CancellationSignalProvider.java */
    public class a {
    }

    /* compiled from: CancellationSignalProvider.java */
    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}

package y9;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;

/* compiled from: AndroidCurrentDateProvider.java */
/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1632a implements I9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1632a f31158a = new C1632a();

    public static boolean b(Context context, String str) {
        D9.b.t0(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    @Override // I9.e
    public long a() {
        return SystemClock.uptimeMillis();
    }
}

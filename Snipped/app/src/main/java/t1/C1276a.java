package t1;

import android.os.Handler;
import android.os.Looper;

/* compiled from: DefaultRunnableScheduler.java */
/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27406a;

    public C1276a(int i) {
        switch (i) {
            case 1:
                this.f27406a = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f27406a = t0.f.a(Looper.getMainLooper());
                break;
        }
    }
}

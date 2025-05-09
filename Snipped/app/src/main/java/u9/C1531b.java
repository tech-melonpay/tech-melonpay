package u9;

import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import t1.C1276a;

/* compiled from: ActivityFramesTracker.java */
/* renamed from: u9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1531b {

    /* renamed from: a, reason: collision with root package name */
    public final FrameMetricsAggregator f30388a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f30389b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f30390c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f30391d;

    /* renamed from: e, reason: collision with root package name */
    public final C1276a f30392e;

    /* compiled from: ActivityFramesTracker.java */
    /* renamed from: u9.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30393a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30394b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30395c;

        public a(int i, int i9, int i10) {
            this.f30393a = i;
            this.f30394b = i9;
            this.f30395c = i10;
        }
    }

    public C1531b(SentryAndroidOptions sentryAndroidOptions) {
        C1276a c1276a = new C1276a(1);
        this.f30388a = null;
        this.f30390c = new ConcurrentHashMap();
        this.f30391d = new WeakHashMap();
        if (z.b("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            this.f30388a = new FrameMetricsAggregator();
        }
        this.f30389b = sentryAndroidOptions;
        this.f30392e = c1276a;
    }

    public final a a() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i9;
        SparseIntArray sparseIntArray;
        if (!b() || (frameMetricsAggregator = this.f30388a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = frameMetricsAggregator.f6473a.f6477b;
        int i10 = 0;
        if (sparseIntArrayArr == null || sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i9 = 0;
        } else {
            int i11 = 0;
            i = 0;
            i9 = 0;
            while (i10 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i10);
                int valueAt = sparseIntArray.valueAt(i10);
                i11 += valueAt;
                if (keyAt > 700) {
                    i9 += valueAt;
                } else if (keyAt > 16) {
                    i += valueAt;
                }
                i10++;
            }
            i10 = i11;
        }
        return new a(i10, i, i9);
    }

    public final boolean b() {
        return this.f30388a != null && this.f30389b.isEnableFramesTracking();
    }

    public final void c(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                C1276a c1276a = this.f30392e;
                c1276a.f27406a.post(new C.y(this, runnable, str, 21));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f30389b.getLogger().h(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }
}

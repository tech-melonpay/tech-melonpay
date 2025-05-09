package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final a f6473a;

    public static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        public static HandlerThread f6474e;

        /* renamed from: f, reason: collision with root package name */
        public static Handler f6475f;

        /* renamed from: a, reason: collision with root package name */
        public final int f6476a;

        /* renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f6477b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f6478c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final WindowOnFrameMetricsAvailableListenerC0072a f6479d = new WindowOnFrameMetricsAvailableListenerC0072a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0072a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0072a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.f6476a & 1) != 0) {
                    a.a(aVar.f6477b[0], frameMetrics.getMetric(8));
                }
                if ((aVar.f6476a & 2) != 0) {
                    a.a(aVar.f6477b[1], frameMetrics.getMetric(1));
                }
                if ((aVar.f6476a & 4) != 0) {
                    a.a(aVar.f6477b[2], frameMetrics.getMetric(3));
                }
                if ((aVar.f6476a & 8) != 0) {
                    a.a(aVar.f6477b[3], frameMetrics.getMetric(4));
                }
                if ((aVar.f6476a & 16) != 0) {
                    a.a(aVar.f6477b[4], frameMetrics.getMetric(5));
                }
                if ((aVar.f6476a & 64) != 0) {
                    a.a(aVar.f6477b[6], frameMetrics.getMetric(7));
                }
                if ((aVar.f6476a & 32) != 0) {
                    a.a(aVar.f6477b[5], frameMetrics.getMetric(6));
                }
                if ((aVar.f6476a & 128) != 0) {
                    a.a(aVar.f6477b[7], frameMetrics.getMetric(0));
                }
                if ((aVar.f6476a & 256) != 0) {
                    a.a(aVar.f6477b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i) {
            this.f6476a = i;
        }

        public static void a(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    public static class b {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        this.f6473a = new a(i);
    }
}

package u9;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1530a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1531b f30386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f30387c;

    public /* synthetic */ RunnableC1530a(C1531b c1531b, Activity activity, int i) {
        this.f30385a = i;
        this.f30386b = c1531b;
        this.f30387c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f30385a) {
            case 0:
                FrameMetricsAggregator.a aVar = this.f30386b.f30388a.f6473a;
                aVar.getClass();
                if (FrameMetricsAggregator.a.f6474e == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    FrameMetricsAggregator.a.f6474e = handlerThread;
                    handlerThread.start();
                    FrameMetricsAggregator.a.f6475f = new Handler(FrameMetricsAggregator.a.f6474e.getLooper());
                }
                for (int i = 0; i <= 8; i++) {
                    SparseIntArray[] sparseIntArrayArr = aVar.f6477b;
                    if (sparseIntArrayArr[i] == null && (aVar.f6476a & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                Activity activity2 = this.f30387c;
                activity2.getWindow().addOnFrameMetricsAvailableListener(aVar.f6479d, FrameMetricsAggregator.a.f6475f);
                aVar.f6478c.add(new WeakReference<>(activity2));
                break;
            default:
                FrameMetricsAggregator.a aVar2 = this.f30386b.f30388a.f6473a;
                ArrayList<WeakReference<Activity>> arrayList = aVar2.f6478c;
                Iterator<WeakReference<Activity>> it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    activity = this.f30387c;
                    if (hasNext) {
                        WeakReference<Activity> next = it.next();
                        if (next.get() == activity) {
                            arrayList.remove(next);
                        }
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener(aVar2.f6479d);
                break;
        }
    }
}

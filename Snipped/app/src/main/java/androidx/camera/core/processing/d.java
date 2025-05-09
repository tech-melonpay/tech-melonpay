package androidx.camera.core.processing;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import t.C1257i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5398a;

    public /* synthetic */ d(int i) {
        this.f5398a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5398a) {
            case 0:
                DefaultSurfaceProcessor.lambda$executeSafely$10();
                break;
            case 1:
                int i = AlarmManagerSchedulerBroadcastReceiver.f8960a;
                break;
            default:
                int i9 = C1257i.f27243x;
                break;
        }
    }
}

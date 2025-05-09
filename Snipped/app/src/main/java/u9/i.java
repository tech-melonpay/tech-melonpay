package u9;

import android.os.SystemClock;
import android.view.FrameMetrics;
import java.util.concurrent.TimeUnit;
import y9.f;

/* compiled from: AndroidTransactionProfiler.java */
/* loaded from: classes2.dex */
public final class i implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f30414a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: b, reason: collision with root package name */
    public final long f30415b = TimeUnit.MILLISECONDS.toNanos(700);

    /* renamed from: c, reason: collision with root package name */
    public float f30416c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f30417d;

    public i(j jVar) {
        this.f30417d = jVar;
    }

    @Override // y9.f.b
    public final void a(FrameMetrics frameMetrics, float f10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        j jVar = this.f30417d;
        long j10 = elapsedRealtimeNanos - jVar.f30426j;
        long metric = frameMetrics.getMetric(8);
        boolean z10 = ((float) metric) > ((float) this.f30414a) / (f10 - 1.0f);
        float f11 = ((int) (f10 * 100.0f)) / 100.0f;
        if (metric > this.f30415b) {
            jVar.f30435s.addLast(new G9.b(Long.valueOf(j10), Long.valueOf(metric)));
        } else if (z10) {
            jVar.f30434r.addLast(new G9.b(Long.valueOf(j10), Long.valueOf(metric)));
        }
        if (f11 != this.f30416c) {
            this.f30416c = f11;
            jVar.f30433q.addLast(new G9.b(Long.valueOf(j10), Float.valueOf(f11)));
        }
    }
}

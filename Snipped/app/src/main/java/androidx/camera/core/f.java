package androidx.camera.core;

import a3.InterfaceFutureC0509a;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.C1257i;
import t.T;
import t.U;
import t.X;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5312a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f5314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5316e;

    public /* synthetic */ f(CameraX cameraX, Executor executor, long j10, CallbackToFutureAdapter.a aVar) {
        this.f5316e = cameraX;
        this.f5313b = executor;
        this.f5315d = j10;
        this.f5314c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [t.T, t.i$c] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        final long j10;
        switch (this.f5312a) {
            case 0:
                ((CameraX) this.f5316e).lambda$initAndRetryRecursively$1((Executor) this.f5313b, this.f5315d, this.f5314c);
                break;
            case 1:
                DeferrableSurfaces.lambda$surfaceListWithTimeout$1((Executor) this.f5313b, (InterfaceFutureC0509a) this.f5316e, this.f5314c, this.f5315d);
                break;
            default:
                final X x9 = (X) this.f5316e;
                CallbackToFutureAdapter.a<FocusMeteringResult> aVar = this.f5314c;
                FocusMeteringAction focusMeteringAction = (FocusMeteringAction) this.f5313b;
                long j11 = this.f5315d;
                if (!x9.f27170d) {
                    s3.b.v("Camera is not active.", aVar);
                    break;
                } else {
                    Rect f10 = x9.f27167a.f27251h.f27328e.f();
                    if (x9.f27171e != null) {
                        rational = x9.f27171e;
                    } else {
                        Rect f11 = x9.f27167a.f27251h.f27328e.f();
                        rational = new Rational(f11.width(), f11.height());
                    }
                    List<MeteringPoint> meteringPointsAf = focusMeteringAction.getMeteringPointsAf();
                    Integer num = (Integer) x9.f27167a.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                    List<MeteringRectangle> c2 = x9.c(meteringPointsAf, num == null ? 0 : num.intValue(), rational, f10, 1);
                    List<MeteringPoint> meteringPointsAe = focusMeteringAction.getMeteringPointsAe();
                    Integer num2 = (Integer) x9.f27167a.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                    List<MeteringRectangle> c10 = x9.c(meteringPointsAe, num2 == null ? 0 : num2.intValue(), rational, f10, 2);
                    List<MeteringPoint> meteringPointsAwb = focusMeteringAction.getMeteringPointsAwb();
                    Integer num3 = (Integer) x9.f27167a.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                    List<MeteringRectangle> c11 = x9.c(meteringPointsAwb, num3 == null ? 0 : num3.intValue(), rational, f10, 4);
                    if (!c2.isEmpty() || !c10.isEmpty() || !c11.isEmpty()) {
                        x9.f27167a.f27244a.f27268a.remove(x9.f27180o);
                        CallbackToFutureAdapter.a<FocusMeteringResult> aVar2 = x9.f27185t;
                        if (aVar2 != null) {
                            s3.b.v("Cancelled by another startFocusAndMetering()", aVar2);
                            x9.f27185t = null;
                        }
                        x9.f27167a.f27244a.f27268a.remove(x9.f27181p);
                        CallbackToFutureAdapter.a<Void> aVar3 = x9.f27186u;
                        if (aVar3 != null) {
                            s3.b.v("Cancelled by another startFocusAndMetering()", aVar3);
                            x9.f27186u = null;
                        }
                        ScheduledFuture<?> scheduledFuture = x9.i;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                            x9.i = null;
                        }
                        x9.f27185t = aVar;
                        MeteringRectangle[] meteringRectangleArr = X.f27166v;
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) c2.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) c10.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) c11.toArray(meteringRectangleArr);
                        T t3 = x9.f27180o;
                        C1257i c1257i = x9.f27167a;
                        c1257i.f27244a.f27268a.remove(t3);
                        ScheduledFuture<?> scheduledFuture2 = x9.i;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(true);
                            x9.i = null;
                        }
                        ScheduledFuture<?> scheduledFuture3 = x9.f27175j;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(true);
                            x9.f27175j = null;
                        }
                        x9.f27182q = meteringRectangleArr2;
                        x9.f27183r = meteringRectangleArr3;
                        x9.f27184s = meteringRectangleArr4;
                        if (meteringRectangleArr2.length > 0) {
                            x9.f27173g = true;
                            x9.f27177l = false;
                            x9.f27178m = false;
                            j10 = c1257i.j();
                            x9.e(true);
                        } else {
                            x9.f27173g = false;
                            x9.f27177l = true;
                            x9.f27178m = false;
                            j10 = c1257i.j();
                        }
                        x9.f27174h = 0;
                        final boolean z10 = c1257i.e(1) == 1;
                        ?? r42 = new C1257i.c() { // from class: t.T
                            @Override // t.C1257i.c
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                X x10 = X.this;
                                x10.getClass();
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                if (x10.f27182q.length > 0) {
                                    if (!z10 || num4 == null) {
                                        x10.f27178m = true;
                                        x10.f27177l = true;
                                    } else if (x10.f27174h.intValue() == 3) {
                                        if (num4.intValue() == 4) {
                                            x10.f27178m = true;
                                            x10.f27177l = true;
                                        } else if (num4.intValue() == 5) {
                                            x10.f27178m = false;
                                            x10.f27177l = true;
                                        }
                                    }
                                }
                                if (!x10.f27177l || !C1257i.h(totalCaptureResult, j10)) {
                                    if (x10.f27174h.equals(num4) || num4 == null) {
                                        return false;
                                    }
                                    x10.f27174h = num4;
                                    return false;
                                }
                                boolean z11 = x10.f27178m;
                                ScheduledFuture<?> scheduledFuture4 = x10.f27175j;
                                if (scheduledFuture4 != null) {
                                    scheduledFuture4.cancel(true);
                                    x10.f27175j = null;
                                }
                                CallbackToFutureAdapter.a<FocusMeteringResult> aVar4 = x10.f27185t;
                                if (aVar4 != null) {
                                    aVar4.b(FocusMeteringResult.create(z11));
                                    x10.f27185t = null;
                                }
                                return true;
                            }
                        };
                        x9.f27180o = r42;
                        c1257i.a(r42);
                        long j12 = x9.f27176k + 1;
                        x9.f27176k = j12;
                        U u6 = new U(j12, 0, x9);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        ScheduledExecutorService scheduledExecutorService = x9.f27169c;
                        x9.f27175j = scheduledExecutorService.schedule(u6, j11, timeUnit);
                        if (focusMeteringAction.isAutoCancelEnabled()) {
                            x9.i = scheduledExecutorService.schedule(new U(j12, 1, x9), focusMeteringAction.getAutoCancelDurationInMillis(), timeUnit);
                            break;
                        }
                    } else {
                        aVar.c(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f(Executor executor, InterfaceFutureC0509a interfaceFutureC0509a, CallbackToFutureAdapter.a aVar, long j10) {
        this.f5313b = executor;
        this.f5316e = interfaceFutureC0509a;
        this.f5314c = aVar;
        this.f5315d = j10;
    }

    public /* synthetic */ f(X x9, CallbackToFutureAdapter.a aVar, FocusMeteringAction focusMeteringAction, long j10) {
        this.f5316e = x9;
        this.f5314c = aVar;
        this.f5313b = focusMeteringAction;
        this.f5315d = j10;
    }
}

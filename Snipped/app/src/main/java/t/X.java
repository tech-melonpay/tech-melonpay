package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import t.C1257i;

/* compiled from: FocusMeteringControl.java */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: v, reason: collision with root package name */
    public static final MeteringRectangle[] f27166v = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final C1257i f27167a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27168b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f27169c;

    /* renamed from: f, reason: collision with root package name */
    public final x.i f27172f;
    public ScheduledFuture<?> i;

    /* renamed from: j, reason: collision with root package name */
    public ScheduledFuture<?> f27175j;

    /* renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f27182q;

    /* renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f27183r;

    /* renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f27184s;

    /* renamed from: t, reason: collision with root package name */
    public CallbackToFutureAdapter.a<FocusMeteringResult> f27185t;

    /* renamed from: u, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f27186u;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f27170d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile Rational f27171e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27173g = false;

    /* renamed from: h, reason: collision with root package name */
    public Integer f27174h = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f27176k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27177l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27178m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f27179n = 1;

    /* renamed from: o, reason: collision with root package name */
    public T f27180o = null;

    /* renamed from: p, reason: collision with root package name */
    public S f27181p = null;

    public X(C1257i c1257i, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = f27166v;
        this.f27182q = meteringRectangleArr;
        this.f27183r = meteringRectangleArr;
        this.f27184s = meteringRectangleArr;
        this.f27185t = null;
        this.f27186u = null;
        this.f27167a = c1257i;
        this.f27168b = executor;
        this.f27169c = scheduledExecutorService;
        this.f27172f = new x.i(quirks);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f27170d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.f27179n);
            MutableOptionsBundle create = MutableOptionsBundle.create();
            if (z10) {
                create.insertOption(s.a.a(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z11) {
                create.insertOption(s.a.a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
            C1257i c1257i = this.f27167a;
            c1257i.f27248e.onCameraControlCaptureRequests(Collections.singletonList(builder.build()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [t.S, t.i$c] */
    public final void b(CallbackToFutureAdapter.a<Void> aVar) {
        S s10 = this.f27181p;
        C1257i c1257i = this.f27167a;
        c1257i.f27244a.f27268a.remove(s10);
        CallbackToFutureAdapter.a<Void> aVar2 = this.f27186u;
        if (aVar2 != null) {
            s3.b.v("Cancelled by another cancelFocusAndMetering()", aVar2);
            this.f27186u = null;
        }
        c1257i.f27244a.f27268a.remove(this.f27180o);
        CallbackToFutureAdapter.a<FocusMeteringResult> aVar3 = this.f27185t;
        if (aVar3 != null) {
            s3.b.v("Cancelled by cancelFocusAndMetering()", aVar3);
            this.f27185t = null;
        }
        this.f27186u = aVar;
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.f27175j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f27175j = null;
        }
        if (this.f27182q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f27166v;
        this.f27182q = meteringRectangleArr;
        this.f27183r = meteringRectangleArr;
        this.f27184s = meteringRectangleArr;
        this.f27173g = false;
        final long j10 = c1257i.j();
        if (this.f27186u != null) {
            final int e10 = c1257i.e(this.f27179n != 3 ? 4 : 3);
            ?? r02 = new C1257i.c() { // from class: t.S
                @Override // t.C1257i.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    X x9 = X.this;
                    x9.getClass();
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != e10 || !C1257i.h(totalCaptureResult, j10)) {
                        return false;
                    }
                    CallbackToFutureAdapter.a<Void> aVar4 = x9.f27186u;
                    if (aVar4 != null) {
                        aVar4.b(null);
                        x9.f27186u = null;
                    }
                    return true;
                }
            };
            this.f27181p = r02;
            c1257i.a(r02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> c(java.util.List<androidx.camera.core.MeteringPoint> r21, int r22, android.util.Rational r23, android.graphics.Rect r24, int r25) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.X.c(java.util.List, int, android.util.Rational, android.graphics.Rect, int):java.util.List");
    }

    public final boolean d(FocusMeteringAction focusMeteringAction) {
        Rational rational;
        C1257i c1257i = this.f27167a;
        Rect f10 = c1257i.f27251h.f27328e.f();
        if (this.f27171e != null) {
            rational = this.f27171e;
        } else {
            Rect f11 = this.f27167a.f27251h.f27328e.f();
            rational = new Rational(f11.width(), f11.height());
        }
        List<MeteringPoint> meteringPointsAf = focusMeteringAction.getMeteringPointsAf();
        Integer num = (Integer) c1257i.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        List<MeteringRectangle> c2 = c(meteringPointsAf, num == null ? 0 : num.intValue(), rational, f10, 1);
        List<MeteringPoint> meteringPointsAe = focusMeteringAction.getMeteringPointsAe();
        Integer num2 = (Integer) c1257i.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        List<MeteringRectangle> c10 = c(meteringPointsAe, num2 == null ? 0 : num2.intValue(), rational, f10, 2);
        List<MeteringPoint> meteringPointsAwb = focusMeteringAction.getMeteringPointsAwb();
        Integer num3 = (Integer) c1257i.f27247d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        return (c2.isEmpty() && c10.isEmpty() && c(meteringPointsAwb, num3 == null ? 0 : num3.intValue(), rational, f10, 4).isEmpty()) ? false : true;
    }

    public final void e(boolean z10) {
        if (this.f27170d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f27179n);
            builder.setUseRepeatingSurface(true);
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(s.a.a(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z10) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                create.insertOption(s.a.a(key), Integer.valueOf(this.f27167a.d(1)));
            }
            builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
            builder.addCameraCaptureCallback(new V());
            C1257i c1257i = this.f27167a;
            c1257i.f27248e.onCameraControlCaptureRequests(Collections.singletonList(builder.build()));
        }
    }
}

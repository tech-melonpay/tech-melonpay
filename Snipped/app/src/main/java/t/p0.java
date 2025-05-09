package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C0559z;
import java.util.concurrent.Executor;
import s.a;
import t.C1257i;

/* compiled from: ZoomControl.java */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1257i f27324a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27325b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f27326c;

    /* renamed from: d, reason: collision with root package name */
    public final C0559z<ZoomState> f27327d;

    /* renamed from: e, reason: collision with root package name */
    public final b f27328e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27329f = false;

    /* compiled from: ZoomControl.java */
    public class a implements C1257i.c {
        public a() {
        }

        @Override // t.C1257i.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            p0.this.f27328e.a(totalCaptureResult);
            return false;
        }
    }

    /* compiled from: ZoomControl.java */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(float f10, CallbackToFutureAdapter.a<Void> aVar);

        float c();

        float d();

        void e(a.C0469a c0469a);

        Rect f();

        void g();
    }

    public p0(C1257i c1257i, u.n nVar, Executor executor) {
        a aVar = new a();
        this.f27324a = c1257i;
        this.f27325b = executor;
        b a10 = a(nVar);
        this.f27328e = a10;
        q0 q0Var = new q0(a10.c(), a10.d());
        this.f27326c = q0Var;
        q0Var.b(1.0f);
        this.f27327d = new C0559z<>(ImmutableZoomState.create(q0Var));
        c1257i.a(aVar);
    }

    public static b a(u.n nVar) {
        Range range;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) nVar.a(key);
            } catch (AssertionError e10) {
                Logger.w("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
                range = null;
            }
            if (range != null) {
                return new C1249a(nVar);
            }
        }
        return new K(nVar);
    }

    public final void b(CallbackToFutureAdapter.a<Void> aVar, ZoomState zoomState) {
        ZoomState create;
        if (this.f27329f) {
            c(zoomState);
            this.f27328e.b(zoomState.getZoomRatio(), aVar);
            this.f27324a.j();
        } else {
            synchronized (this.f27326c) {
                this.f27326c.b(1.0f);
                create = ImmutableZoomState.create(this.f27326c);
            }
            c(create);
            aVar.c(new CameraControl.OperationCanceledException("Camera is not active."));
        }
    }

    public final void c(ZoomState zoomState) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C0559z<ZoomState> c0559z = this.f27327d;
        if (myLooper == mainLooper) {
            c0559z.setValue(zoomState);
        } else {
            c0559z.postValue(zoomState);
        }
    }
}

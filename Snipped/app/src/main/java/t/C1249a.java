package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import s.a;
import t.p0;

/* compiled from: AndroidRZoomImpl.java */
/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249a implements p0.b {

    /* renamed from: a, reason: collision with root package name */
    public final u.n f27189a;

    /* renamed from: b, reason: collision with root package name */
    public final Range<Float> f27190b;

    /* renamed from: d, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f27192d;

    /* renamed from: c, reason: collision with root package name */
    public float f27191c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f27193e = 1.0f;

    public C1249a(u.n nVar) {
        CameraCharacteristics.Key key;
        this.f27189a = nVar;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f27190b = (Range) nVar.a(key);
    }

    @Override // t.p0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f10;
        if (this.f27192d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f10 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f10 = (Float) request.get(key);
            }
            if (f10 == null) {
                return;
            }
            if (this.f27193e == f10.floatValue()) {
                this.f27192d.b(null);
                this.f27192d = null;
            }
        }
    }

    @Override // t.p0.b
    public final void b(float f10, CallbackToFutureAdapter.a<Void> aVar) {
        this.f27191c = f10;
        CallbackToFutureAdapter.a<Void> aVar2 = this.f27192d;
        if (aVar2 != null) {
            s3.b.v("There is a new zoomRatio being set", aVar2);
        }
        this.f27193e = this.f27191c;
        this.f27192d = aVar;
    }

    @Override // t.p0.b
    public final float c() {
        return this.f27190b.getUpper().floatValue();
    }

    @Override // t.p0.b
    public final float d() {
        return this.f27190b.getLower().floatValue();
    }

    @Override // t.p0.b
    public final void e(a.C0469a c0469a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        c0469a.b(key, Float.valueOf(this.f27191c));
    }

    @Override // t.p0.b
    public final Rect f() {
        Rect rect = (Rect) this.f27189a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // t.p0.b
    public final void g() {
        this.f27191c = 1.0f;
        CallbackToFutureAdapter.a<Void> aVar = this.f27192d;
        if (aVar != null) {
            s3.b.v("Camera is not active.", aVar);
            this.f27192d = null;
        }
    }
}

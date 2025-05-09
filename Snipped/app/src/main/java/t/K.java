package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import s.a;
import t.p0;

/* compiled from: CropRegionZoomImpl.java */
/* loaded from: classes.dex */
public final class K implements p0.b {

    /* renamed from: a, reason: collision with root package name */
    public final u.n f27127a;

    /* renamed from: c, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f27129c;

    /* renamed from: b, reason: collision with root package name */
    public Rect f27128b = null;

    /* renamed from: d, reason: collision with root package name */
    public Rect f27130d = null;

    public K(u.n nVar) {
        this.f27127a = nVar;
    }

    @Override // t.p0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.f27129c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f27130d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f27129c.b(null);
            this.f27129c = null;
            this.f27130d = null;
        }
    }

    @Override // t.p0.b
    public final void b(float f10, CallbackToFutureAdapter.a<Void> aVar) {
        ((Rect) this.f27127a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float width = r0.width() / f10;
        float height = r0.height() / f10;
        float width2 = (r0.width() - width) / 2.0f;
        float height2 = (r0.height() - height) / 2.0f;
        this.f27128b = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        CallbackToFutureAdapter.a<Void> aVar2 = this.f27129c;
        if (aVar2 != null) {
            s3.b.v("There is a new zoomRatio being set", aVar2);
        }
        this.f27130d = this.f27128b;
        this.f27129c = aVar;
    }

    @Override // t.p0.b
    public final float c() {
        Float f10 = (Float) this.f27127a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // t.p0.b
    public final float d() {
        return 1.0f;
    }

    @Override // t.p0.b
    public final void e(a.C0469a c0469a) {
        Rect rect = this.f27128b;
        if (rect != null) {
            c0469a.b(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // t.p0.b
    public final Rect f() {
        Rect rect = this.f27128b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f27127a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // t.p0.b
    public final void g() {
        this.f27130d = null;
        this.f27128b = null;
        CallbackToFutureAdapter.a<Void> aVar = this.f27129c;
        if (aVar != null) {
            s3.b.v("Camera is not active.", aVar);
            this.f27129c = null;
        }
    }
}

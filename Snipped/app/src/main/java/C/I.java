package C;

import android.os.SystemClock;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class I extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f517a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SessionConfig.Builder f520d;

    public I(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.a aVar, SessionConfig.Builder builder) {
        this.f518b = atomicBoolean;
        this.f519c = aVar;
        this.f520d = builder;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        Object tag;
        super.onCaptureCompleted(cameraCaptureResult);
        if (this.f517a) {
            this.f517a = false;
            Logger.d("VideoCapture", "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.f518b;
        if (atomicBoolean.get() || (tag = cameraCaptureResult.getTagBundle().getTag("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int intValue = ((Integer) tag).intValue();
        CallbackToFutureAdapter.a aVar = this.f519c;
        if (intValue == aVar.hashCode() && aVar.b(null) && !atomicBoolean.getAndSet(true)) {
            CameraXExecutors.mainThreadExecutor().execute(new B6.d(5, this, this.f520d));
        }
    }
}

package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import z.e;

/* compiled from: Camera2ImplConfig.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final Config.Option<Integer> f26487b = Config.Option.create("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: c, reason: collision with root package name */
    public static final Config.Option<Long> f26488c = Config.Option.create("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final Config.Option<CameraDevice.StateCallback> f26489d = Config.Option.create("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: e, reason: collision with root package name */
    public static final Config.Option<CameraCaptureSession.StateCallback> f26490e = Config.Option.create("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: f, reason: collision with root package name */
    public static final Config.Option<CameraCaptureSession.CaptureCallback> f26491f = Config.Option.create("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: g, reason: collision with root package name */
    public static final Config.Option<c> f26492g = Config.Option.create("camera2.cameraEvent.callback", c.class);

    /* renamed from: h, reason: collision with root package name */
    public static final Config.Option<Object> f26493h = Config.Option.create("camera2.captureRequest.tag", Object.class);
    public static final Config.Option<String> i = Config.Option.create("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* compiled from: Camera2ImplConfig.java */
    /* renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C0469a implements ExtendableBuilder<a> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f26494a = MutableOptionsBundle.create();

        @Override // androidx.camera.core.ExtendableBuilder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a build() {
            return new a(OptionsBundle.from(this.f26494a));
        }

        public final void b(CaptureRequest.Key key, Object obj) {
            this.f26494a.insertOption(a.a(key), obj);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig getMutableConfig() {
            return this.f26494a;
        }
    }

    public static Config.Option<Object> a(CaptureRequest.Key<?> key) {
        return Config.Option.create("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}

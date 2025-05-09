package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import z.e;

/* compiled from: Camera2SessionOptionUnpacker.java */
/* renamed from: t.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271x implements SessionConfig.OptionUnpacker {

    /* renamed from: a, reason: collision with root package name */
    public static final C1271x f27391a = new C1271x();

    @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
    public final void unpack(Size size, UseCaseConfig<?> useCaseConfig, SessionConfig.Builder builder) {
        SessionConfig defaultSessionConfig = useCaseConfig.getDefaultSessionConfig(null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = SessionConfig.defaultEmptySessionConfig().getTemplateType();
        if (defaultSessionConfig != null) {
            templateType = defaultSessionConfig.getTemplateType();
            builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
            builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
            builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
            emptyBundle = defaultSessionConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        if (useCaseConfig instanceof PreviewConfig) {
            Rational rational = x.j.f30888a;
            if (((w.A) w.k.f30775a.get(w.A.class)) != null) {
                if (!x.j.f30888a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    MutableOptionsBundle create = MutableOptionsBundle.create();
                    create.insertOption(s.a.a(CaptureRequest.TONEMAP_MODE), 2);
                    builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
                }
            }
        }
        builder.setTemplateType(((Integer) useCaseConfig.retrieveOption(s.a.f26487b, Integer.valueOf(templateType))).intValue());
        builder.addDeviceStateCallback((CameraDevice.StateCallback) useCaseConfig.retrieveOption(s.a.f26489d, new C()));
        builder.addSessionStateCallback((CameraCaptureSession.StateCallback) useCaseConfig.retrieveOption(s.a.f26490e, new A()));
        builder.addCameraCaptureCallback(new G((CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(s.a.f26491f, new C1264p())));
        MutableOptionsBundle create2 = MutableOptionsBundle.create();
        Config.Option option = s.a.f26492g;
        create2.insertOption(option, (s.c) useCaseConfig.retrieveOption(option, s.c.a()));
        Config.Option option2 = s.a.i;
        create2.insertOption(option2, (String) useCaseConfig.retrieveOption(option2, null));
        Config.Option option3 = s.a.f26488c;
        Long l10 = (Long) useCaseConfig.retrieveOption(option3, -1L);
        l10.getClass();
        create2.insertOption(option3, l10);
        builder.addImplementationOptions(create2);
        builder.addImplementationOptions(e.a.b(useCaseConfig).build());
    }
}

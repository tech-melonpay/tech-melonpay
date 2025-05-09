package t;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import z.e;

/* compiled from: Camera2CaptureOptionUnpacker.java */
/* renamed from: t.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1265q implements CaptureConfig.OptionUnpacker {

    /* renamed from: a, reason: collision with root package name */
    public static final C1265q f27331a = new C1265q();

    @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        CaptureConfig defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig(null);
        Config emptyBundle = OptionsBundle.emptyBundle();
        int templateType = CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
        if (defaultCaptureConfig != null) {
            templateType = defaultCaptureConfig.getTemplateType();
            builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
            emptyBundle = defaultCaptureConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        builder.setTemplateType(((Integer) useCaseConfig.retrieveOption(s.a.f26487b, Integer.valueOf(templateType))).intValue());
        builder.addCameraCaptureCallback(new G((CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(s.a.f26491f, new C1264p())));
        builder.addImplementationOptions(e.a.b(useCaseConfig).build());
    }
}

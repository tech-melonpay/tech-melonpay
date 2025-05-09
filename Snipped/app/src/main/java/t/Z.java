package t;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;

/* compiled from: ImageCaptureOptionUnpacker.java */
/* loaded from: classes.dex */
public final class Z extends C1265q {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f27187c = new Z(new x.g());

    /* renamed from: b, reason: collision with root package name */
    public final x.g f27188b;

    public Z(x.g gVar) {
        this.f27188b = gVar;
    }

    @Override // t.C1265q, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public final void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (!(useCaseConfig instanceof ImageCaptureConfig)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
        MutableOptionsBundle create = MutableOptionsBundle.create();
        if (imageCaptureConfig.hasCaptureMode()) {
            int captureMode = imageCaptureConfig.getCaptureMode();
            this.f27188b.getClass();
            if (((w.t) w.k.f30775a.get(w.t.class)) != null) {
                if (captureMode == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    create.insertOption(s.a.a(key), Boolean.TRUE);
                } else if (captureMode == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    create.insertOption(s.a.a(key2), Boolean.FALSE);
                }
            }
        }
        builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
    }
}

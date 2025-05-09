package t;

import android.content.Context;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: Camera2UseCaseConfigFactory.java */
/* renamed from: t.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272y implements UseCaseConfigFactory {

    /* renamed from: a, reason: collision with root package name */
    public final L f27392a;

    public C1272y(Context context) {
        this.f27392a = L.b(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public final Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i9;
        MutableOptionsBundle create = MutableOptionsBundle.create();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        int[] iArr = j0.f27283a;
        int i10 = iArr[captureType.ordinal()];
        int i11 = 3;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                i9 = 3;
            }
            i9 = 1;
        } else {
            if (i == 2) {
                i9 = 5;
            }
            i9 = 1;
        }
        builder.setTemplateType(i9);
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, C1271x.f27391a);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        int i12 = iArr[captureType.ordinal()];
        if (i12 == 1) {
            i11 = i != 2 ? 2 : 5;
        } else if (i12 != 2 && i12 != 3) {
            i11 = 1;
        }
        builder2.setTemplateType(i11);
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        create.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? Z.f27187c : C1265q.f27331a);
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        L l10 = this.f27392a;
        if (captureType == captureType2) {
            create.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, l10.e());
        }
        create.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(l10.c(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            create.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.TRUE);
        }
        return OptionsBundle.from(create);
    }
}

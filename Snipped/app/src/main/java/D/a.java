package D;

import J.v;
import J.x;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.n;
import p.InterfaceC1096a;

/* compiled from: VideoCaptureConfig.java */
/* loaded from: classes.dex */
public final class a<T extends VideoOutput> implements UseCaseConfig<n<T>>, ImageOutputConfig, ThreadConfig {

    /* renamed from: b, reason: collision with root package name */
    public static final Config.Option<VideoOutput> f854b = Config.Option.create("camerax.video.VideoCapture.videoOutput", VideoOutput.class);

    /* renamed from: c, reason: collision with root package name */
    public static final Config.Option<InterfaceC1096a<v, x>> f855c = Config.Option.create("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC1096a.class);

    /* renamed from: a, reason: collision with root package name */
    public final OptionsBundle f856a;

    public a(OptionsBundle optionsBundle) {
        this.f856a = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f856a;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 34;
    }
}

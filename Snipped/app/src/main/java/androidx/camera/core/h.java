package androidx.camera.core;

import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements SessionConfig.ErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StreamSpec f5325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UseCase f5326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5327e;

    public /* synthetic */ h(UseCase useCase, String str, Object obj, StreamSpec streamSpec, int i) {
        this.f5323a = i;
        this.f5326d = useCase;
        this.f5324b = str;
        this.f5327e = obj;
        this.f5325c = streamSpec;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f5323a) {
            case 0:
                ((ImageAnalysis) this.f5326d).lambda$createPipeline$1(this.f5324b, (ImageAnalysisConfig) this.f5327e, this.f5325c, sessionConfig, sessionError);
                break;
            case 1:
                ((ImageCapture) this.f5326d).lambda$createPipeline$3(this.f5324b, (ImageCaptureConfig) this.f5327e, this.f5325c, sessionConfig, sessionError);
                break;
            default:
                ((Preview) this.f5326d).lambda$addCameraSurfaceAndErrorListener$1(this.f5324b, (PreviewConfig) this.f5327e, this.f5325c, sessionConfig, sessionError);
                break;
        }
    }
}

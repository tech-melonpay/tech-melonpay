package C;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.encoder.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements a.c.InterfaceC0066a, SurfaceRequest.TransformationInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recorder f577a;

    public /* synthetic */ t(Recorder recorder) {
        this.f577a = recorder;
    }

    @Override // androidx.camera.video.internal.encoder.a.c.InterfaceC0066a
    public void a(Surface surface) {
        this.f577a.z(surface);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        this.f577a.f5497q = transformationInfo;
    }
}

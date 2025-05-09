package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f5431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f5432c;

    public /* synthetic */ s(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.f5430a = i;
        this.f5431b = transformationInfoListener;
        this.f5432c = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5430a) {
            case 0:
                this.f5431b.onTransformationInfoUpdate(this.f5432c);
                break;
            default:
                this.f5431b.onTransformationInfoUpdate(this.f5432c);
                break;
        }
    }
}

package androidx.camera.core;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5382b;

    public /* synthetic */ l(Object obj, int i) {
        this.f5381a = i;
        this.f5382b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5381a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer) this.f5382b).analyzeCachedImage();
                break;
            case 1:
                ((Preview) this.f5382b).notifyReset();
                break;
            default:
                ((SurfaceRequest) this.f5382b).lambda$new$3();
                break;
        }
    }
}

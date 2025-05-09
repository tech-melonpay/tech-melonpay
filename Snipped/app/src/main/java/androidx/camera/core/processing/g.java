package androidx.camera.core.processing;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceEdge f5405b;

    public /* synthetic */ g(SurfaceEdge surfaceEdge, int i) {
        this.f5404a = i;
        this.f5405b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5404a) {
            case 0:
                this.f5405b.lambda$createSurfaceRequest$1();
                break;
            case 1:
                this.f5405b.disconnectWithoutCheckingClosed();
                break;
            default:
                this.f5405b.lambda$createSurfaceRequest$0();
                break;
        }
    }
}

package t;

import androidx.camera.camera2.internal.Camera2CameraImpl;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1260l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f27289b;

    public /* synthetic */ RunnableC1260l(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f27288a = i;
        this.f27289b = camera2CameraImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27288a) {
            case 0:
                this.f27289b.n();
                break;
            default:
                this.f27289b.c();
                break;
        }
    }
}

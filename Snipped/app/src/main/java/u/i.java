package u;

import android.hardware.camera2.CameraCaptureSession;
import u.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.c f30052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f30053c;

    public /* synthetic */ i(f.c cVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f30051a = i;
        this.f30052b = cVar;
        this.f30053c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30051a) {
            case 0:
                this.f30052b.f30040a.onActive(this.f30053c);
                break;
            case 1:
                this.f30052b.f30040a.onClosed(this.f30053c);
                break;
            case 2:
                d.b(this.f30052b.f30040a, this.f30053c);
                break;
            case 3:
                this.f30052b.f30040a.onConfigured(this.f30053c);
                break;
            case 4:
                this.f30052b.f30040a.onReady(this.f30053c);
                break;
            default:
                this.f30052b.f30040a.onConfigureFailed(this.f30053c);
                break;
        }
    }
}

package u;

import android.hardware.camera2.CameraDevice;
import u.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.b f30066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f30067c;

    public /* synthetic */ p(o.b bVar, CameraDevice cameraDevice, int i) {
        this.f30065a = i;
        this.f30066b = bVar;
        this.f30067c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30065a) {
            case 0:
                this.f30066b.f30063a.onClosed(this.f30067c);
                break;
            case 1:
                this.f30066b.f30063a.onDisconnected(this.f30067c);
                break;
            default:
                this.f30066b.f30063a.onOpened(this.f30067c);
                break;
        }
    }
}

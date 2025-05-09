package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import u.f;

/* compiled from: CameraCaptureSessionCompatBaseImpl.java */
/* loaded from: classes.dex */
public class k implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f30054a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30055b;

    /* compiled from: CameraCaptureSessionCompatBaseImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f30056a;

        public a(Handler handler) {
            this.f30056a = handler;
        }
    }

    public k(CameraCaptureSession cameraCaptureSession, a aVar) {
        cameraCaptureSession.getClass();
        this.f30054a = cameraCaptureSession;
        this.f30055b = aVar;
    }

    @Override // u.f.a
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f30054a.setRepeatingRequest(captureRequest, new f.b(executor, captureCallback), ((a) this.f30055b).f30056a);
    }

    @Override // u.f.a
    public int b(ArrayList arrayList, Executor executor, androidx.camera.camera2.internal.h hVar) {
        return this.f30054a.captureBurst(arrayList, new f.b(executor, hVar), ((a) this.f30055b).f30056a);
    }
}

package u;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: ApiCompat.java */
/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}

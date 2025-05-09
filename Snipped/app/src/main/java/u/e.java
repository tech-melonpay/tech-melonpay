package u;

import android.hardware.camera2.CameraManager;

/* compiled from: ApiCompat.java */
/* loaded from: classes.dex */
public final class e {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}

package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Invalid sensor rotation: "));
    }

    public static int getRelativeImageRotation(int i, int i9, boolean z10) {
        int i10 = z10 ? ((i9 - i) + 360) % 360 : (i9 + i) % 360;
        if (Logger.isDebugEnabled(TAG)) {
            StringBuilder q10 = a.q(i, i9, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            q10.append(z10);
            q10.append(", result=");
            q10.append(i10);
            Logger.d(TAG, q10.toString());
        }
        return i10;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Unsupported surface rotation: "));
    }
}

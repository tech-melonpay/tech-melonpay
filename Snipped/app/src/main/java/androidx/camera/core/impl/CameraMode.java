package androidx.camera.core.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class CameraMode {
    public static final int CONCURRENT_CAMERA = 1;
    public static final int DEFAULT = 0;
    public static final int ULTRA_HIGH_RESOLUTION_CAMERA = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private CameraMode() {
    }

    public static String toLabelString(int i) {
        return i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA";
    }
}

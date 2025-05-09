package androidx.camera.core.imagecapture;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

/* loaded from: classes.dex */
public interface ImageCaptureControl {
    void lockFlashMode();

    InterfaceFutureC0509a<Void> submitStillCaptureRequests(List<CaptureConfig> list);

    void unlockFlashMode();
}

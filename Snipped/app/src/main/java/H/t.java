package H;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;

/* compiled from: VideoQualityQuirk.java */
/* loaded from: classes.dex */
public interface t extends Quirk {
    default boolean a() {
        return false;
    }

    boolean b(CameraInfoInternal cameraInfoInternal, C.o oVar);
}

package H;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;

/* compiled from: VideoEncoderCrashQuirk.java */
/* loaded from: classes.dex */
public class r implements t {
    @Override // H.t
    public final boolean a() {
        return false;
    }

    @Override // H.t
    public final boolean b(CameraInfoInternal cameraInfoInternal, C.o oVar) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && cameraInfoInternal.getLensFacing() == 0 && oVar == C.o.f560a;
    }
}

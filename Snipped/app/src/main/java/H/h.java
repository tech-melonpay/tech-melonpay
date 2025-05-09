package H;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;

/* compiled from: ExcludeStretchedVideoQualityQuirk.java */
/* loaded from: classes.dex */
public class h implements t {
    public static boolean c() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // H.t
    public final boolean b(CameraInfoInternal cameraInfoInternal, C.o oVar) {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL) ? oVar == C.o.f562c || oVar == C.o.f563d : (d() || c()) && oVar == C.o.f562c;
    }
}

package H;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: ReportedVideoQualityNotSupportedQuirk.java */
/* loaded from: classes.dex */
public class q implements t {
    public static boolean c() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    @Override // H.t
    public final boolean a() {
        return c() || d() || e();
    }

    @Override // H.t
    public final boolean b(CameraInfoInternal cameraInfoInternal, C.o oVar) {
        if (c() || d()) {
            return oVar == C.o.f563d;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return oVar == C.o.f561b || oVar == C.o.f562c;
        }
        if (e()) {
            return cameraInfoInternal.getLensFacing() == 0 && (oVar == C.o.f562c || oVar == C.o.f561b);
        }
        return false;
    }
}

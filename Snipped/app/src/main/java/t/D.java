package t;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* compiled from: CameraSelectionOptimizer.java */
/* loaded from: classes.dex */
public final class D {
    public static String a(u.v vVar, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) vVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) vVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }
}

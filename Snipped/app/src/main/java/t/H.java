package t;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CaptureCallbackConverter.java */
/* loaded from: classes.dex */
public final class H {
    public static void a(CameraCaptureCallback cameraCaptureCallback, ArrayList arrayList) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            Iterator<CameraCaptureCallback> it = ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getCallbacks().iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList);
            }
        } else if (cameraCaptureCallback instanceof G) {
            arrayList.add(((G) cameraCaptureCallback).f27125a);
        } else {
            arrayList.add(new F(cameraCaptureCallback));
        }
    }
}

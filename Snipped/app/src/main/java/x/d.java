package x;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.Logger;
import java.nio.BufferUnderflowException;

/* compiled from: FlashAvailabilityChecker.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(c cVar) {
        Boolean bool;
        try {
            bool = (Boolean) cVar.d(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (w.k.f30775a.get(w.p.class) != null) {
                Logger.d("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                Logger.e("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            Logger.w("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}

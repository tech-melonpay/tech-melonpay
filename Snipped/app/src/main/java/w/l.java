package w;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;

/* compiled from: ExcludedSupportedSizesQuirk.java */
/* loaded from: classes.dex */
public class l implements Quirk {
    public static boolean c() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean d() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }
}

package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        try {
            Class cls = Integer.TYPE;
            sNewInstanceMethod = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e10) {
            Log.i(TAG, "Unable to initialize via reflection.", e10);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    public static ImageWriter newInstance(Surface surface, int i, int i9) {
        try {
            Object invoke = sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i9));
            invoke.getClass();
            return (ImageWriter) invoke;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e10);
        }
    }
}

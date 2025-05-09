package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    public static ImageWriter newInstance(Surface surface, int i, int i9) {
        return Build.VERSION.SDK_INT >= 29 ? ImageWriterCompatApi29Impl.newInstance(surface, i, i9) : ImageWriterCompatApi26Impl.newInstance(surface, i, i9);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    public static ImageWriter newInstance(Surface surface, int i) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i);
    }
}

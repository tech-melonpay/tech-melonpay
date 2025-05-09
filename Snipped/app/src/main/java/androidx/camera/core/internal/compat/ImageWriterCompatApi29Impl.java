package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
    }

    public static ImageWriter newInstance(Surface surface, int i, int i9) {
        return ImageWriter.newInstance(surface, i, i9);
    }
}

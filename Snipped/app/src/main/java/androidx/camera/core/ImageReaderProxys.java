package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

/* loaded from: classes.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    public static ImageReaderProxy createIsolatedReader(int i, int i9, int i10, int i11) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i9, i10, i11));
    }
}

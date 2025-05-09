package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import pa.C1124b;

/* loaded from: classes.dex */
public final class YuvToJpegConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f5441a;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5443c = 0;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f5442b = 100;

    public static class ConversionFailedException extends Exception {
    }

    public YuvToJpegConverter(Surface surface) {
        this.f5441a = surface;
    }

    public final void a(ImageProxy imageProxy) {
        C1124b.q(imageProxy.getFormat() == 35, "Input image is not expected YUV_420_888 image format");
        try {
            try {
                if (ImageProcessingUtil.convertYuvToJpegBytesIntoSurface(imageProxy, this.f5442b, this.f5443c, this.f5441a)) {
                } else {
                    throw new ConversionFailedException("Failed to process YUV -> JPEG");
                }
            } catch (Exception e10) {
                Logger.e("YuvToJpegConverter", "Failed to process YUV -> JPEG", e10);
                throw new ConversionFailedException("Failed to process YUV -> JPEG", e10);
            }
        } finally {
            imageProxy.close();
        }
    }
}

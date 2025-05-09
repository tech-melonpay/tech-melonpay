package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ImageProxyDownsampler {

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod;

        static {
            int[] iArr = new int[DownsamplingMethod.values().length];
            $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod = iArr;
            try {
                iArr[DownsamplingMethod.NEAREST_NEIGHBOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[DownsamplingMethod.AVERAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i, int i9) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i;
            this.mDownsampledHeight = i9;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i, int i9, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i, i9) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i;
                this.val$pixelStride = i9;
                this.mBuffer = ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static ForwardingImageProxy downsample(ImageProxy imageProxy, int i, int i9, DownsamplingMethod downsamplingMethod) {
        int i10;
        byte[] bArr;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i || imageProxy.getHeight() < i9) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i, i9) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        }
        if (imageProxy.getWidth() == i && imageProxy.getHeight() == i9) {
            return new ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i, i9);
        }
        int i11 = 2;
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i12 = i / 2;
        int[] iArr3 = {i, i12, i12};
        int i13 = i9 / 2;
        int[] iArr4 = {i9, i13, i13};
        ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
        int i14 = 0;
        while (i14 < 3) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i14];
            ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr2 = new byte[iArr3[i14] * iArr4[i14]];
            int i15 = AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[downsamplingMethod.ordinal()];
            if (i15 == 1) {
                i10 = 1;
                bArr = bArr2;
                resizeNearestNeighbor(buffer, iArr[i14], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i14], bArr, iArr3[i14], iArr4[i14]);
            } else if (i15 != i11) {
                i10 = 1;
                bArr = bArr2;
            } else {
                i10 = 1;
                bArr = bArr2;
                resizeAveraging(buffer, iArr[i14], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i14], bArr, iArr3[i14], iArr4[i14]);
            }
            planeProxyArr[i14] = createPlaneProxy(iArr3[i14], i10, bArr);
            i14++;
            i11 = 2;
        }
        return new ForwardingImageProxyImpl(imageProxy, planeProxyArr, i, i9);
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i, int i9, int i10, int i11, byte[] bArr, int i12, int i13) {
        float f10 = i / i12;
        float f11 = i11 / i13;
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i10];
        int[] iArr = new int[i12];
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            iArr[i15] = ((int) (i15 * f10)) * i9;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                int i16 = 0;
                while (i16 < i13) {
                    int i17 = (int) (i16 * f11);
                    int i18 = i11 - 1;
                    int min = Math.min(i17, i18) * i10;
                    int min2 = Math.min(i17 + 1, i18) * i10;
                    int i19 = i16 * i12;
                    byteBuffer.position(min);
                    byteBuffer.get(bArr2, i14, Math.min(i10, byteBuffer.remaining()));
                    byteBuffer.position(min2);
                    byteBuffer.get(bArr3, i14, Math.min(i10, byteBuffer.remaining()));
                    for (int i20 = i14; i20 < i12; i20++) {
                        int i21 = iArr[i20];
                        bArr[i19 + i20] = (byte) ((((((bArr2[i21] & 255) + (bArr2[i21 + i9] & 255)) + (bArr3[i21] & 255)) + (bArr3[i21 + i9] & 255)) / 4) & 255);
                    }
                    i16++;
                    i14 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i, int i9, int i10, int i11, byte[] bArr, int i12, int i13) {
        float f10 = i / i12;
        float f11 = i11 / i13;
        byte[] bArr2 = new byte[i10];
        int[] iArr = new int[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            iArr[i14] = ((int) (i14 * f10)) * i9;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                for (int i15 = 0; i15 < i13; i15++) {
                    int i16 = i15 * i12;
                    byteBuffer.position(Math.min((int) (i15 * f11), i11 - 1) * i10);
                    byteBuffer.get(bArr2, 0, Math.min(i10, byteBuffer.remaining()));
                    for (int i17 = 0; i17 < i12; i17++) {
                        bArr[i16 + i17] = bArr2[iArr[i17]];
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

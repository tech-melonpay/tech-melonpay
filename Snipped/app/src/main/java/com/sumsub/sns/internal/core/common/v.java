package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageProxy;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.LoggerType;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class v {

    public static final class a extends Lambda implements InterfaceC0635a<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageProxy f15194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<Integer, Integer, Bitmap> f15195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ImageProxy imageProxy, InterfaceC0650p<? super Integer, ? super Integer, Bitmap> interfaceC0650p) {
            super(0);
            this.f15194a = imageProxy;
            this.f15195b = interfaceC0650p;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            int rowStride = this.f15194a.getPlanes()[0].getRowStride() / 4;
            try {
                Bitmap invoke = this.f15195b.invoke(Integer.valueOf(rowStride), Integer.valueOf(this.f15194a.getHeight()));
                ByteBuffer buffer = this.f15194a.getPlanes()[0].getBuffer();
                buffer.rewind();
                invoke.copyPixelsFromBuffer(buffer);
                return v.b(invoke, this.f15194a.getImageInfo().getRotationDegrees(), false);
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "ImageExtensions", "Failed to copyPixelsFromBuffer. Reported width: " + this.f15194a.getWidth() + ", real width: " + rowStride, null, 4, null);
                throw th;
            }
        }
    }

    public static final Bitmap a(ImageProxy imageProxy, InterfaceC0650p<? super Integer, ? super Integer, Bitmap> interfaceC0650p) {
        a aVar = new a(imageProxy, interfaceC0650p);
        try {
            return aVar.invoke();
        } catch (OutOfMemoryError unused) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "ImageExtensions", "Caught OutOfMemoryError while converting ImageProxy to Bitmap", null, 4, null);
            s$a.f15191a.a();
            return aVar.invoke();
        }
    }

    public static final Bitmap b(Bitmap bitmap, int i, boolean z10) {
        Bitmap a10;
        if (i == 90) {
            a10 = a(bitmap, 6, z10);
        } else if (i == 180) {
            a10 = a(bitmap, 3, z10);
        } else if (i != 270) {
            a10 = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            if (z10) {
                bitmap.recycle();
            }
        } else {
            a10 = a(bitmap, 8, z10);
        }
        if (a10 != bitmap) {
            return a10;
        }
        com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).w("ImageExtensions", "creating an image copy. Rotated image is same as original", new Exception("creating an image copy. Rotated image is same as original"));
        return a10.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
    }

    public static final Bitmap a(Bitmap bitmap, int i, boolean z10) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (z10) {
                bitmap.recycle();
            }
            return createBitmap;
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a.f17535a.e("ImageExtensions", "Rotate bitmap", e10);
            return bitmap;
        }
    }

    public static final Matrix a(Matrix matrix, int i, int i9, int i10, int i11, int i12, boolean z10) {
        matrix.reset();
        if (i12 != 0) {
            if (i12 % 90 != 0) {
                Logger.w$default(com.sumsub.sns.internal.log.a.f17535a, "getTransformationMatrix", s3.b.i("Rotation of ", i12, " % 90 != 0"), null, 4, null);
            }
            matrix.postTranslate((-i) / 2.0f, (-i9) / 2.0f);
            matrix.postRotate(i12);
        }
        boolean z11 = (Math.abs(i12) + 90) % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0;
        int i13 = z11 ? i9 : i;
        if (!z11) {
            i = i9;
        }
        if (i13 != i10 || i != i11) {
            float f10 = i10;
            float f11 = i13;
            float f12 = f10 / f11;
            float f13 = i11 / i;
            if (z10) {
                float max = Math.max(f12, f13);
                matrix.postScale(max, max);
                float f14 = f11 * max;
                if (f14 > f10) {
                    matrix.postTranslate(((f14 - f10) / 2.0f) * (-1.0f), 0.0f);
                }
            } else {
                matrix.postScale(f12, f13);
            }
        }
        if (i12 != 0) {
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        return matrix;
    }
}

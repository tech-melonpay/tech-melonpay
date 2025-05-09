package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.utils.TransformUtils;
import pa.C1124b;

/* compiled from: FovUtil.java */
/* loaded from: classes.dex */
public final class Y {
    public static int a(float f10, float f11) {
        C1124b.m(f10 > 0.0f, "Focal length should be positive.");
        C1124b.m(f11 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) Math.toDegrees(Math.atan(f11 / (f10 * 2.0f)) * 2.0d);
        C1124b.n(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static int b(u.v vVar, int i) {
        int i9;
        try {
            u.z zVar = (u.z) vVar.f30074a;
            zVar.getClass();
            try {
                for (String str : zVar.f30080a.getCameraIdList()) {
                    u.n b9 = vVar.b(str);
                    Integer num = (Integer) b9.a(CameraCharacteristics.LENS_FACING);
                    C1124b.p(num, "Lens facing can not be null");
                    int intValue = num.intValue();
                    if (i != 0) {
                        i9 = 1;
                        if (i != 1) {
                            i9 = 2;
                            if (i != 2) {
                                throw new IllegalArgumentException("The given lens facing: " + i + " can not be recognized.");
                            }
                        }
                    } else {
                        i9 = 0;
                    }
                    if (intValue == i9) {
                        float[] fArr = (float[]) b9.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                        C1124b.p(fArr, "The focal lengths can not be empty.");
                        return a(fArr[0], c(b9));
                    }
                }
                throw new IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
            } catch (CameraAccessException e10) {
                throw CameraAccessExceptionCompat.a(e10);
            }
        } catch (CameraAccessExceptionCompat unused) {
            throw new IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    public static float c(u.n nVar) {
        SizeF sizeF = (SizeF) nVar.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) nVar.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) nVar.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer num = (Integer) nVar.a(CameraCharacteristics.SENSOR_ORIENTATION);
        C1124b.p(sizeF, "The sensor size can't be null.");
        C1124b.p(num, "The sensor orientation can't be null.");
        C1124b.p(rect, "The active array size can't be null.");
        C1124b.p(size, "The pixel array size can't be null.");
        Size rectToSize = TransformUtils.rectToSize(rect);
        if (TransformUtils.is90or270(num.intValue())) {
            sizeF = TransformUtils.reverseSizeF(sizeF);
            rectToSize = TransformUtils.reverseSize(rectToSize);
            size = TransformUtils.reverseSize(size);
        }
        return (sizeF.getWidth() * rectToSize.getWidth()) / size.getWidth();
    }
}

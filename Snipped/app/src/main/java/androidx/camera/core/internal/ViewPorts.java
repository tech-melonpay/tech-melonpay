package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.HashMap;
import java.util.Map;
import pa.C1124b;

/* loaded from: classes.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    public static Map<UseCase, Rect> calculateViewPortRects(Rect rect, boolean z10, Rational rational, int i, int i9, int i10, Map<UseCase, StreamSpec> map) {
        C1124b.m(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i, rational), i9, z10, i10, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((UseCase) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    private static RectF correctStartOrEnd(boolean z10, int i, RectF rectF, RectF rectF2) {
        boolean z11 = false;
        boolean z12 = i == 0 && !z10;
        boolean z13 = i == 90 && z10;
        if (z12 || z13) {
            return rectF2;
        }
        boolean z14 = i == 0 && z10;
        boolean z15 = i == 270 && !z10;
        if (z14 || z15) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z16 = i == 90 && !z10;
        boolean z17 = i == 180 && z10;
        if (z16 || z17) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z18 = i == 180 && !z10;
        if (i == 270 && z10) {
            z11 = true;
        }
        if (z18 || z11) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z10 + " rotation " + i);
    }

    private static RectF flipHorizontally(RectF rectF, float f10) {
        return new RectF(flipX(rectF.right, f10), rectF.top, flipX(rectF.left, f10), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f10) {
        return new RectF(rectF.left, flipY(rectF.bottom, f10), rectF.right, flipY(rectF.top, f10));
    }

    private static float flipX(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    private static float flipY(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(RectF rectF, Rational rational, int i, boolean z10, int i9, int i10) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i != 2) {
                throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Unexpected scale type: "));
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z10, i9), i10, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z10, int i) {
        return z10 ^ (i == 1);
    }
}

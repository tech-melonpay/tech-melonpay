package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PatternPathMotion.java */
/* renamed from: k1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941w extends AbstractC0940v {

    /* renamed from: a, reason: collision with root package name */
    public final Path f22919a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f22920b = new Matrix();

    public C0941w(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0918B.f22682j);
        try {
            String c2 = m0.i.c(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (c2 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(n0.d.d(c2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // k1.AbstractC0940v
    public final Path a(float f10, float f11, float f12, float f13) {
        float f14 = f13 - f11;
        float sqrt = (float) Math.sqrt((f14 * f14) + (r6 * r6));
        double atan2 = Math.atan2(f14, f12 - f10);
        Matrix matrix = this.f22920b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f10, f11);
        Path path = new Path();
        this.f22919a.transform(matrix, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f22920b;
        matrix.setTranslate(-f12, -f13);
        float f14 = f11 - f13;
        float sqrt = 1.0f / ((float) Math.sqrt((f14 * f14) + (r2 * r2)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f14, f10 - f12)));
        path.transform(matrix, this.f22919a);
    }
}

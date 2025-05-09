package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import pa.C1124b;

/* compiled from: PreviewTransformation.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Size f5839a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f5840b;

    /* renamed from: c, reason: collision with root package name */
    public int f5841c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f5842d;

    /* renamed from: e, reason: collision with root package name */
    public int f5843e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5844f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5845g;

    /* renamed from: h, reason: collision with root package name */
    public PreviewView.ScaleType f5846h;

    public final Matrix a(Size size, int i) {
        if (!f()) {
            return null;
        }
        Matrix matrix = new Matrix();
        c(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f5839a.getWidth(), this.f5839a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public final Size b() {
        return TransformUtils.is90or270(this.f5841c) ? new Size(this.f5840b.height(), this.f5840b.width()) : new Size(this.f5840b.width(), this.f5840b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Matrix c(android.util.Size r8, int r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.b.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        C1124b.q(f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.f5839a.getWidth(), this.f5839a.getHeight());
        return TransformUtils.getRectToRect(rectF, rectF, !this.f5845g ? this.f5841c : -CameraOrientationUtil.surfaceRotationToDegrees(this.f5843e));
    }

    public final RectF e(Size size, int i) {
        C1124b.q(f(), null);
        Matrix c2 = c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f5839a.getWidth(), this.f5839a.getHeight());
        c2.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f5840b == null || this.f5839a == null || !(!this.f5845g || this.f5843e != -1)) ? false : true;
    }
}

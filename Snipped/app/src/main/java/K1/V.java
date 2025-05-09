package k1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class V extends U {
    @Override // k1.Q
    public final float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k1.Q
    public final void b(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // k1.U, k1.Q
    public final void c(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k1.S
    public final void d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // k1.S
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k1.S
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // k1.T
    public final void g(View view, int i, int i9, int i10, int i11) {
        view.setLeftTopRightBottom(i, i9, i10, i11);
    }
}

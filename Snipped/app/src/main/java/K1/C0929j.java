package k1;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.luminary.mobile.R;
import k1.AbstractC0919C;

/* compiled from: Explode.java */
/* renamed from: k1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929j extends W {

    /* renamed from: N, reason: collision with root package name */
    public static final DecelerateInterpolator f22889N = new DecelerateInterpolator();

    /* renamed from: O, reason: collision with root package name */
    public static final AccelerateInterpolator f22890O = new AccelerateInterpolator();

    /* renamed from: M, reason: collision with root package name */
    public int[] f22891M;

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.W
    public final ObjectAnimator V(ViewGroup viewGroup, View view, L l10, L l11) {
        if (l11 == null) {
            return null;
        }
        Rect rect = (Rect) l11.f22761a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Y(viewGroup, rect, this.f22891M);
        return M.a(view, l11, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, f22889N, this);
    }

    @Override // k1.W
    public final ObjectAnimator W(ViewGroup viewGroup, View view, L l10, L l11) {
        float f10;
        float f11;
        if (l10 == null) {
            return null;
        }
        Rect rect = (Rect) l10.f22761a.get("android:explode:screenBounds");
        int i = rect.left;
        int i9 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) l10.f22762b.getTag(R.id.transition_position);
        if (iArr != null) {
            f10 = (r7 - rect.left) + translationX;
            f11 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        Y(viewGroup, rect, this.f22891M);
        return M.a(view, l10, i, i9, translationX, translationY, f10 + r0[0], f11 + r0[1], f22890O, this);
    }

    public final void Y(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        int[] iArr2 = this.f22891M;
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i9 = iArr2[1];
        AbstractC0919C.d dVar = this.f22688B;
        Rect a10 = dVar == null ? null : dVar.a();
        if (a10 == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i9;
        } else {
            centerX = a10.centerX();
            centerY = a10.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i10 = centerX - i;
        int i11 = centerY - i9;
        float max = Math.max(i10, view.getWidth() - i10);
        float max2 = Math.max(i11, view.getHeight() - i11);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    public final void Z(L l10) {
        View view = l10.f22762b;
        int[] iArr = this.f22891M;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i9 = iArr[1];
        l10.f22761a.put("android:explode:screenBounds", new Rect(i, i9, view.getWidth() + i, view.getHeight() + i9));
    }

    @Override // k1.W, k1.AbstractC0919C
    public final void g(L l10) {
        W.T(l10);
        Z(l10);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        W.T(l10);
        Z(l10);
    }
}

package L2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import u2.C1512a;

/* compiled from: MaterialBottomContainerBackHelper.java */
/* loaded from: classes.dex */
public final class g extends a<View> {

    /* renamed from: g, reason: collision with root package name */
    public final float f2482g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2483h;

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f2482g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f2483h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        V v10 = this.f2468b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new P0.a(1));
        return animatorSet;
    }

    public final void b(float f10) {
        float interpolation = this.f2467a.getInterpolation(f10);
        V v10 = this.f2468b;
        float width = v10.getWidth();
        float height = v10.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f2482g / width;
        float f12 = this.f2483h / height;
        float a10 = 1.0f - C1512a.a(0.0f, f11, interpolation);
        float a11 = 1.0f - C1512a.a(0.0f, f12, interpolation);
        v10.setScaleX(a10);
        v10.setPivotY(height);
        v10.setScaleY(a11);
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a11 != 0.0f ? a10 / a11 : 1.0f);
            }
        }
    }
}

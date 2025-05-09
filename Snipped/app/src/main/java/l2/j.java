package L2;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import u2.C1512a;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialSideContainerBackHelper.java */
/* loaded from: classes.dex */
public final class j extends a<View> {

    /* renamed from: g, reason: collision with root package name */
    public final float f2487g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2488h;
    public final float i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f2487g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f2488h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f10, boolean z10, int i) {
        float interpolation = this.f2467a.getInterpolation(f10);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        V v10 = this.f2468b;
        boolean z11 = (Gravity.getAbsoluteGravity(i, v10.getLayoutDirection()) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = v10.getWidth();
        int height = v10.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f2487g / f11;
            float f14 = this.f2488h / f11;
            float f15 = this.i / f12;
            if (z11) {
                f11 = 0.0f;
            }
            v10.setPivotX(f11);
            if (!z12) {
                f14 = -f13;
            }
            float a10 = C1512a.a(0.0f, f14, interpolation);
            float f16 = a10 + 1.0f;
            v10.setScaleX(f16);
            float a11 = 1.0f - C1512a.a(0.0f, f15, interpolation);
            v10.setScaleY(a11);
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z12 ? 1.0f - a10 : 1.0f;
                    float f18 = a11 != 0.0f ? (f16 / a11) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }
}

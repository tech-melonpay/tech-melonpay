package y2;

import M2.d;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: BottomNavigationMenuView.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: H, reason: collision with root package name */
    public final int f31109H;

    /* renamed from: I, reason: collision with root package name */
    public final int f31110I;

    /* renamed from: J, reason: collision with root package name */
    public final int f31111J;

    /* renamed from: K, reason: collision with root package name */
    public final int f31112K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f31113L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f31114M;

    public b(Context context) {
        super(context);
        this.f31114M = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f31109H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f31110I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f31111J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f31112K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // M2.d
    public final C1611a e(Context context) {
        return new C1611a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int i12 = i10 - i;
        int i13 = i11 - i9;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                if (getLayoutDirection() == 1) {
                    int i16 = i12 - i14;
                    childAt.layout(i16 - childAt.getMeasuredWidth(), 0, i16, i13);
                } else {
                    childAt.layout(i14, 0, childAt.getMeasuredWidth() + i14, i13);
                }
                i14 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        int i10;
        int i11;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f31114M;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i9);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z10 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i12 = this.f31111J;
        if (z10 && this.f31113L) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i13 = this.f31112K;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), makeMeasureSpec);
                i13 = Math.max(i13, childAt.getMeasuredWidth());
            }
            int i14 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f31110I * i14), Math.min(i13, i12));
            int i15 = size - min;
            int min2 = Math.min(i15 / (i14 != 0 ? i14 : 1), this.f31109H);
            int i16 = i15 - (i14 * min2);
            int i17 = 0;
            while (i17 < childCount) {
                if (getChildAt(i17).getVisibility() != 8) {
                    i11 = i17 == getSelectedItemPosition() ? min : min2;
                    if (i16 > 0) {
                        i11++;
                        i16--;
                    }
                } else {
                    i11 = 0;
                }
                arrayList.add(Integer.valueOf(i11));
                i17++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), i12);
            int i18 = size - (size2 * min3);
            for (int i19 = 0; i19 < childCount; i19++) {
                if (getChildAt(i19).getVisibility() == 8) {
                    i10 = 0;
                } else if (i18 > 0) {
                    i10 = min3 + 1;
                    i18--;
                } else {
                    i10 = min3;
                }
                arrayList.add(Integer.valueOf(i10));
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i21)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i20 = childAt2.getMeasuredWidth() + i20;
            }
        }
        setMeasuredDimension(i20, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f31113L = z10;
    }
}

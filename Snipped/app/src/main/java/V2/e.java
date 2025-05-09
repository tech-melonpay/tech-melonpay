package v2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.search.SearchBar;
import java.util.List;
import java.util.WeakHashMap;
import pa.C1124b;
import y0.C1596C;
import y0.E;
import y0.J;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes.dex */
public abstract class e extends f<View> {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f30551d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f30552e;

    /* renamed from: f, reason: collision with root package name */
    public int f30553f;

    /* renamed from: g, reason: collision with root package name */
    public int f30554g;

    public e() {
        this.f30551d = new Rect();
        this.f30552e = new Rect();
        this.f30553f = 0;
    }

    @Override // v2.f
    public final void c(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout d10 = d(coordinatorLayout.getDependencies(view));
        int i9 = 0;
        if (d10 == null) {
            coordinatorLayout.onLayoutChild(view, i);
            this.f30553f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = d10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((d10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.f30551d;
        rect.set(paddingLeft, bottom, width, bottom2);
        J lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i10 = fVar.f6457c;
        if (i10 == 0) {
            i10 = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        }
        int i11 = i10;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f30552e;
        Gravity.apply(i11, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f30554g != 0) {
            float e10 = e(d10);
            int i12 = this.f30554g;
            i9 = C1124b.s((int) (e10 * i12), 0, i12);
        }
        view.layout(rect2.left, rect2.top - i9, rect2.right, rect2.bottom - i9);
        this.f30553f = rect2.top - d10.getBottom();
    }

    public abstract AppBarLayout d(List list);

    public float e(View view) {
        return 1.0f;
    }

    public int f(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i9, int i10, int i11) {
        AppBarLayout d10;
        J lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (d10 = d(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size > 0) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (d10.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int f10 = f(d10) + size;
        int measuredHeight = d10.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            f10 -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i9, View.MeasureSpec.makeMeasureSpec(f10, i12 == -1 ? 1073741824 : Integer.MIN_VALUE), i11);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30551d = new Rect();
        this.f30552e = new Rect();
        this.f30553f = 0;
    }
}

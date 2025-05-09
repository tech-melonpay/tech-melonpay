package J2;

import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: FlowLayout.java */
/* loaded from: classes.dex */
public class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f2111a;

    /* renamed from: b, reason: collision with root package name */
    public int f2112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2113c;

    /* renamed from: d, reason: collision with root package name */
    public int f2114d;

    public boolean a() {
        return this.f2113c;
    }

    public int getItemSpacing() {
        return this.f2112b;
    }

    public int getLineSpacing() {
        return this.f2111a;
    }

    public int getRowCount() {
        return this.f2114d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (getChildCount() == 0) {
            this.f2114d = 0;
            return;
        }
        this.f2114d = 1;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i10 - i) - paddingLeft;
        int i15 = paddingRight;
        int i16 = paddingTop;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.getMarginStart();
                    i12 = marginLayoutParams.getMarginEnd();
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i15 + i13;
                if (!this.f2113c && measuredWidth > i14) {
                    i16 = this.f2111a + paddingTop;
                    this.f2114d++;
                    i15 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f2114d - 1));
                int i18 = i15 + i13;
                int measuredWidth2 = childAt.getMeasuredWidth() + i18;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z11) {
                    childAt.layout(i14 - measuredWidth2, i16, (i14 - i15) - i13, measuredHeight);
                } else {
                    childAt.layout(i18, i16, measuredWidth2, measuredHeight);
                }
                i15 += childAt.getMeasuredWidth() + i13 + i12 + this.f2112b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i9);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i18 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i12 <= paddingRight || a()) {
                    i13 = i18;
                } else {
                    i13 = getPaddingLeft();
                    i15 = this.f2111a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i13 + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i12 + i11 + this.f2112b + i13;
                if (i17 == getChildCount() - 1) {
                    i16 += i11;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i10 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i10 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i10) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f2112b = i;
    }

    public void setLineSpacing(int i) {
        this.f2111a = i;
    }

    public void setSingleLine(boolean z10) {
        this.f2113c = z10;
    }
}

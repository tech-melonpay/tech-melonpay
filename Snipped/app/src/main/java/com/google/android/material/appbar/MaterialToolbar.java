package com.google.android.material.appbar;

import J2.i;
import J2.j;
import T2.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f9046c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public ImageView.ScaleType f9047a0;

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f9048b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.toolbarStyle, 2132083945), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray d10 = i.d(context2, attributeSet, C1279a.f27472F, R.attr.toolbarStyle, 2132083945, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.V = d10.getBoolean(4, false);
        this.W = d10.getBoolean(3, false);
        int i = d10.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9046c0;
            if (i < scaleTypeArr.length) {
                this.f9047a0 = scaleTypeArr[i];
            }
        }
        if (d10.hasValue(0)) {
            this.f9048b0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : F2.a.a(background);
        if (valueOf != null) {
            f fVar = new f();
            fVar.o(valueOf);
            fVar.k(context2);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            fVar.n(C1596C.d.e(this));
            setBackground(fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9047a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.f;
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).w();
        }
        super.m(i);
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.x(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i, i9, i10, i11);
        int i12 = 0;
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList b9 = j.b(this, getTitle());
            boolean isEmpty = b9.isEmpty();
            j.a aVar = j.f2136a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(b9, aVar);
            ArrayList b10 = j.b(this, getSubtitle());
            TextView textView2 = b10.isEmpty() ? null : (TextView) Collections.max(b10, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i13 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i13 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i13 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    w(textView, pair);
                }
                if (this.W && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i12 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i12);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i12++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f9048b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9047a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Ja.a.w(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f9048b0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f9048b0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9047a0 != scaleType) {
            this.f9047a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i9 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i9 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i9 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i9 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i9, textView.getBottom());
    }
}

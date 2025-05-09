package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.WeakHashMap;
import t2.C1279a;
import u2.C1517f;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            int intValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            view2.setPaddingRelative(intValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    public static void a(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        extendedFloatingActionButton.getClass();
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Unknown strategy type: "));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public C1517f getExtendMotionSpec() {
        throw null;
    }

    public C1517f getHideMotionSpec() {
        throw null;
    }

    public C1517f getShowMotionSpec() {
        throw null;
    }

    public C1517f getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C1517f c1517f) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1517f.a(getContext(), i));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(C1517f c1517f) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1517f.a(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i9, int i10, int i11) {
        super.setPadding(i, i9, i10, i11);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i9, int i10, int i11) {
        super.setPaddingRelative(i, i9, i10, i11);
    }

    public void setShowMotionSpec(C1517f c1517f) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1517f.a(getContext(), i));
    }

    public void setShrinkMotionSpec(C1517f c1517f) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1517f.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public Rect f9519b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9520c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9521d;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9520c = false;
            this.f9521d = true;
        }

        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f9520c || this.f9521d) && fVar.f6460f == appBarLayout.getId()) {
                if (this.f9519b == null) {
                    this.f9519b = new Rect();
                }
                Rect rect = this.f9519b;
                J2.a.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f9521d ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f9521d ? 3 : 0);
                throw null;
            }
        }

        public final void b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f9520c || this.f9521d) && fVar.f6460f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f9521d ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, this.f9521d ? 3 : 0);
                throw null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.f6462h == 0) {
                fVar.f6462h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.f) || !(((CoordinatorLayout.f) layoutParams).f6455a instanceof BottomSheetBehavior)) {
                return false;
            }
            b(view2, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view2 = dependencies.get(i9);
                if (view2 instanceof AppBarLayout) {
                    a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f6455a instanceof BottomSheetBehavior)) {
                        b(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27497o);
            this.f9520c = obtainStyledAttributes.getBoolean(0, false);
            this.f9521d = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }
}

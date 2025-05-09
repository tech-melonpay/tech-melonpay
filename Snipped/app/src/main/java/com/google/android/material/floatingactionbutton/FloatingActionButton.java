package com.google.android.material.floatingactionbutton;

import J2.m;
import T2.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.stateful.ExtendableSavedState;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m.C1008j;
import t2.C1279a;
import u2.C1517f;
import x2.C1584a;
import x2.C1585b;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public final class FloatingActionButton extends m implements H2.a, T2.m, CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f9522b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f9523c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f9524d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f9525e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f9526f;

    /* renamed from: g, reason: collision with root package name */
    public int f9527g;

    /* renamed from: h, reason: collision with root package name */
    public int f9528h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public I2.c f9529j;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b implements S2.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {
        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        if (this.f9529j == null) {
            this.f9529j = new I2.c(this, new b());
        }
        return this.f9529j;
    }

    @Override // H2.a
    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.f9566o == null) {
            impl.f9566o = new ArrayList<>();
        }
        impl.f9566o.add(null);
    }

    public final void d(C1584a c1584a) {
        d impl = getImpl();
        if (impl.f9565n == null) {
            impl.f9565n = new ArrayList<>();
        }
        impl.f9565n.add(c1584a);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c();
        if (impl.f9567p == null) {
            impl.f9567p = new ArrayList<>();
        }
        impl.f9567p.add(cVar);
    }

    public final int f(int i) {
        int i9 = this.f9528h;
        if (i9 != 0) {
            return i9;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(C1585b c1585b, boolean z10) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar = c1585b == null ? null : new com.google.android.material.floatingactionbutton.a(this, c1585b);
        if (impl.f9568q.getVisibility() == 0) {
            if (impl.f9564m == 1) {
                return;
            }
        } else if (impl.f9564m != 2) {
            return;
        }
        Animator animator = impl.f9559g;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        FloatingActionButton floatingActionButton = impl.f9568q;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.b(z10 ? 8 : 4, z10);
            if (aVar != null) {
                aVar.f9533a.a(aVar.f9534b);
                return;
            }
            return;
        }
        C1517f c1517f = impl.i;
        AnimatorSet b9 = c1517f != null ? impl.b(c1517f, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, d.f9542A, d.f9543B);
        b9.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f9566o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b9.addListener(it.next());
            }
        }
        b9.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9522b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9523c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f9557e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f9558f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f9528h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C1517f getHideMotionSpec() {
        return getImpl().i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9526f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9526f;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f9553a;
        iVar.getClass();
        return iVar;
    }

    public C1517f getShowMotionSpec() {
        return getImpl().f9560h;
    }

    public int getSize() {
        return this.f9527g;
    }

    public int getSizeDimension() {
        return f(this.f9527g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f9524d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9525e;
    }

    public boolean getUseCompatPadding() {
        return this.i;
    }

    public final boolean h() {
        d impl = getImpl();
        if (impl.f9568q.getVisibility() == 0) {
            if (impl.f9564m != 1) {
                return false;
            }
        } else if (impl.f9564m == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        if (impl.f9568q.getVisibility() != 0) {
            if (impl.f9564m != 2) {
                return false;
            }
        } else if (impl.f9564m == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f9524d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9525e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1008j.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public final void k(C1585b.a aVar, boolean z10) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.f9568q.getVisibility() != 0) {
            if (impl.f9564m == 2) {
                return;
            }
        } else if (impl.f9564m != 1) {
            return;
        }
        Animator animator = impl.f9559g;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f9560h == null;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        FloatingActionButton floatingActionButton = impl.f9568q;
        boolean z12 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f9573v;
        if (!z12) {
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f9562k = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f9533a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f10 = z11 ? 0.4f : 0.0f;
            impl.f9562k = f10;
            impl.a(f10, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C1517f c1517f = impl.f9560h;
        AnimatorSet b9 = c1517f != null ? impl.b(c1517f, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, d.f9551y, d.f9552z);
        b9.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f9565n;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b9.addListener(it.next());
            }
        }
        b9.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof I2.c)) {
            ViewTreeObserver viewTreeObserver = impl.f9568q.getViewTreeObserver();
            if (impl.f9574w == null) {
                impl.f9574w = new I2.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f9574w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f9568q.getViewTreeObserver();
        I2.b bVar = impl.f9574w;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f9574w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i9) {
        getSizeDimension();
        getImpl().l();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f6536a);
        extendableSavedState.f9799c.get("expandableWidgetHelper").getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9522b != colorStateList) {
            this.f9522b = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9523c != mode) {
            this.f9523c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f9556d != f10) {
            impl.f9556d = f10;
            impl.j(f10, impl.f9557e, impl.f9558f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f9557e != f10) {
            impl.f9557e = f10;
            impl.j(impl.f9556d, f10, impl.f9558f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f9558f != f10) {
            impl.f9558f = f10;
            impl.j(impl.f9556d, impl.f9557e, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f9528h) {
            this.f9528h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f9554b) {
            getImpl().f9554b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C1517f c1517f) {
        getImpl().i = c1517f;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1517f.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f9562k;
            impl.f9562k = f10;
            Matrix matrix = impl.f9573v;
            impl.a(f10, matrix);
            impl.f9568q.setImageMatrix(matrix);
            if (this.f9524d != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        d impl = getImpl();
        if (impl.f9563l != i) {
            impl.f9563l = i;
            float f10 = impl.f9562k;
            impl.f9562k = f10;
            Matrix matrix = impl.f9573v;
            impl.a(f10, matrix);
            impl.f9568q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.f> arrayList = getImpl().f9567p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.f> arrayList = getImpl().f9567p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f9555c = z10;
        impl.l();
        throw null;
    }

    @Override // T2.m
    public void setShapeAppearanceModel(i iVar) {
        getImpl().f9553a = iVar;
    }

    public void setShowMotionSpec(C1517f c1517f) {
        getImpl().f9560h = c1517f;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1517f.a(getContext(), i));
    }

    public void setSize(int i) {
        this.f9528h = 0;
        if (i != this.f9527g) {
            this.f9527g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9524d != colorStateList) {
            this.f9524d = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9525e != mode) {
            this.f9525e = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.i != z10) {
            this.i = z10;
            getImpl().h();
        }
    }

    @Override // J2.m, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public Rect f9530b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9531c;

        public BaseBehavior() {
            this.f9531c = true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f9531c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f6460f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f9530b == null) {
                this.f9530b = new Rect();
            }
            Rect rect = this.f9530b;
            J2.a.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
            } else {
                floatingActionButton.k(null, false);
            }
            return true;
        }

        public final boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f9531c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f6460f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
            } else {
                floatingActionButton.k(null, false);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            floatingActionButton.getClass();
            floatingActionButton.getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.f6462h == 0) {
                fVar.f6462h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.f) || !(((CoordinatorLayout.f) layoutParams).f6455a instanceof BottomSheetBehavior)) {
                return false;
            }
            b(view2, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view2 = dependencies.get(i9);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f6455a instanceof BottomSheetBehavior) && b(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            floatingActionButton.getClass();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27498p);
            this.f9531c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9526f != colorStateList) {
            this.f9526f = colorStateList;
            getImpl().getClass();
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }
}

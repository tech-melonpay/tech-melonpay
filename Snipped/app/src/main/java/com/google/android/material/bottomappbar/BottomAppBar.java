package com.google.android.material.bottomappbar;

import L2.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u2.C1512a;
import x2.C1584a;
import x2.C1585b;
import x2.C1586c;
import x2.C1587d;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f9129k0 = 0;
    public Integer U;
    public Animator V;
    public Animator W;

    /* renamed from: a0, reason: collision with root package name */
    public int f9130a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f9131b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f9132c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f9133d0;

    /* renamed from: f0, reason: collision with root package name */
    public int f9134f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9135g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f9136h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f9137i0;

    /* renamed from: j0, reason: collision with root package name */
    public Behavior f9138j0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f9144c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9145d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9144c = parcel.readInt();
            this.f9145d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9144c);
            parcel.writeInt(this.f9145d ? 1 : 0);
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f9146a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9147b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f9148c;

        public a(ActionMenuView actionMenuView, int i, boolean z10) {
            this.f9146a = actionMenuView;
            this.f9147b = i;
            this.f9148c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f9147b;
            boolean z10 = this.f9148c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.f9146a.setTranslationX(bottomAppBar.A(r3, i, z10));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return k.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return B(this.f9130a0);
    }

    private float getFabTranslationY() {
        if (this.f9132c0 == 1) {
            return -getTopEdgeTreatment().f30928c;
        }
        return z() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private C1587d getTopEdgeTreatment() {
        throw null;
    }

    public final int A(ActionMenuView actionMenuView, int i, boolean z10) {
        int i9 = 0;
        if (this.f9134f0 != 1 && (i != 1 || !z10)) {
            return 0;
        }
        boolean c2 = J2.k.c(this);
        int measuredWidth = c2 ? getMeasuredWidth() : 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f20846a & 8388615) == 8388611) {
                measuredWidth = c2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = c2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            i9 = c2 ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i9);
    }

    public final float B(int i) {
        boolean c2 = J2.k.c(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((this.f9133d0 == -1 || z() == null) ? 0 : (r5.getMeasuredWidth() / 2) + this.f9133d0)) * (c2 ? -1 : 1);
    }

    public final boolean C() {
        View z10 = z();
        FloatingActionButton floatingActionButton = z10 instanceof FloatingActionButton ? (FloatingActionButton) z10 : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void D() {
        C1587d topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f9137i0 && C()) {
            int i = this.f9132c0;
        }
        throw null;
    }

    public final void E(ActionMenuView actionMenuView, int i, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f30928c;
    }

    public int getFabAlignmentMode() {
        return this.f9130a0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f9133d0;
    }

    public int getFabAnchorMode() {
        return this.f9132c0;
    }

    public int getFabAnimationMode() {
        return this.f9131b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f30927b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f30926a;
    }

    public boolean getHideOnScroll() {
        return this.f9135g0;
    }

    public int getMenuAlignmentMode() {
        return this.f9134f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.y(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        if (z10) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.V;
            if (animator2 != null) {
                animator2.cancel();
            }
            D();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (C()) {
            E(actionMenuView, this.f9130a0, this.f9137i0, false);
        } else {
            E(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        this.f9130a0 = savedState.f9144c;
        this.f9137i0 = savedState.f9145d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9144c = this.f9130a0;
        savedState.f9145d = this.f9137i0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            C1587d topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f30928c = f10;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i9;
        this.f9136h0 = 0;
        boolean z10 = this.f9137i0;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (isLaidOut()) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (C()) {
                i9 = i;
            } else {
                z10 = false;
                i9 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i9, z10)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    ofFloat2.addListener(new C1586c(this, actionMenuView, i9, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.W = animatorSet2;
            animatorSet2.addListener(new C1584a(this, 1));
            this.W.start();
        } else {
            int i10 = this.f9136h0;
            if (i10 != 0) {
                this.f9136h0 = 0;
                getMenu().clear();
                m(i10);
            }
        }
        if (this.f9130a0 != i && isLaidOut()) {
            Animator animator2 = this.V;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f9131b0 == 1) {
                View z11 = z();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z11 instanceof FloatingActionButton ? (FloatingActionButton) z11 : null, "translationX", B(i));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View z12 = z();
                FloatingActionButton floatingActionButton = z12 instanceof FloatingActionButton ? (FloatingActionButton) z12 : null;
                if (floatingActionButton != null && !floatingActionButton.h()) {
                    floatingActionButton.g(new C1585b(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(k.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C1512a.f30141a));
            this.V = animatorSet3;
            animatorSet3.addListener(new C1584a(this, 0));
            this.V.start();
        }
        this.f9130a0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f9133d0 == i) {
            return;
        }
        this.f9133d0 = i;
        D();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.f9132c0 = i;
        D();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.f9131b0 = i;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f30929d) {
            return;
        }
        getTopEdgeTreatment().f30929d = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f30927b = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f30926a = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f9135g0 = z10;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f9134f0 != i) {
            this.f9134f0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                E(actionMenuView, this.f9130a0, C(), false);
            }
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

    public final View z() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f9138j0 == null) {
            this.f9138j0 = new Behavior();
        }
        return this.f9138j0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: k, reason: collision with root package name */
        public final Rect f9139k;

        /* renamed from: l, reason: collision with root package name */
        public WeakReference<BottomAppBar> f9140l;

        /* renamed from: m, reason: collision with root package name */
        public int f9141m;

        /* renamed from: n, reason: collision with root package name */
        public final a f9142n;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f9140l.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f9139k.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.f9141m == 0) {
                    if (bottomAppBar.f9132c0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (J2.k.c(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i16 = BottomAppBar.f9129k0;
                bottomAppBar.D();
                throw null;
            }
        }

        public Behavior() {
            this.f9142n = new a();
            this.f9139k = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f9140l = new WeakReference<>(bottomAppBar);
            int i9 = BottomAppBar.f9129k0;
            View z10 = bottomAppBar.z();
            if (z10 != null) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                if (!z10.isLaidOut()) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
                    fVar.f6458d = 17;
                    int i10 = bottomAppBar.f9132c0;
                    if (i10 == 1) {
                        fVar.f6458d = 49;
                    }
                    if (i10 == 0) {
                        fVar.f6458d |= 80;
                    }
                    this.f9141m = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) z10.getLayoutParams())).bottomMargin;
                    if (z10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new C1584a(bottomAppBar, 2));
                        floatingActionButton.e();
                    }
                    z10.addOnLayoutChangeListener(this.f9142n);
                    bottomAppBar.D();
                    throw null;
                }
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i9) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i9);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9142n = new a();
            this.f9139k = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}

package com.google.android.material.sidesheet;

import E0.c;
import F.e;
import L2.j;
import T2.f;
import T2.i;
import U2.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.C0611b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pa.C1124b;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements L2.b {

    /* renamed from: b, reason: collision with root package name */
    public d f9708b;

    /* renamed from: c, reason: collision with root package name */
    public final f f9709c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f9710d;

    /* renamed from: e, reason: collision with root package name */
    public final i f9711e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f9712f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9713g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9714h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public E0.c f9715j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9716k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9717l;

    /* renamed from: m, reason: collision with root package name */
    public int f9718m;

    /* renamed from: n, reason: collision with root package name */
    public int f9719n;

    /* renamed from: o, reason: collision with root package name */
    public int f9720o;

    /* renamed from: p, reason: collision with root package name */
    public int f9721p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference<V> f9722q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference<View> f9723r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9724s;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f9725t;

    /* renamed from: u, reason: collision with root package name */
    public j f9726u;

    /* renamed from: v, reason: collision with root package name */
    public int f9727v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f9728w;

    /* renamed from: x, reason: collision with root package name */
    public final a f9729x;

    public class a extends c.AbstractC0013c {
        public a() {
        }

        @Override // E0.c.AbstractC0013c
        public final int a(int i, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C1124b.s(i, sideSheetBehavior.f9708b.g(), sideSheetBehavior.f9708b.f());
        }

        @Override // E0.c.AbstractC0013c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // E0.c.AbstractC0013c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f9718m + sideSheetBehavior.f9721p;
        }

        @Override // E0.c.AbstractC0013c
        public final void f(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f9714h) {
                    sideSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // E0.c.AbstractC0013c
        public final void g(View view, int i, int i9) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f9723r;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f9708b.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f9728w;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f9708b.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((U2.c) it.next()).b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (java.lang.Math.abs(r6 - r0.f9708b.d()) < java.lang.Math.abs(r6 - r0.f9708b.e())) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (r0.f9708b.l(r5) == false) goto L19;
         */
        @Override // E0.c.AbstractC0013c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                U2.d r1 = r0.f9708b
                boolean r1 = r1.k(r6)
                r2 = 3
                if (r1 == 0) goto Lc
                goto L56
            Lc:
                U2.d r1 = r0.f9708b
                boolean r1 = r1.n(r5, r6)
                r3 = 5
                if (r1 == 0) goto L27
                U2.d r1 = r0.f9708b
                boolean r6 = r1.m(r6, r7)
                if (r6 != 0) goto L25
                U2.d r6 = r0.f9708b
                boolean r6 = r6.l(r5)
                if (r6 == 0) goto L56
            L25:
                r2 = r3
                goto L56
            L27:
                r1 = 0
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 == 0) goto L39
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L39
                goto L25
            L39:
                int r6 = r5.getLeft()
                U2.d r7 = r0.f9708b
                int r7 = r7.d()
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                U2.d r1 = r0.f9708b
                int r1 = r1.e()
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L25
            L56:
                r6 = 1
                r0.startSettling(r5, r2, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // E0.c.AbstractC0013c
        public final boolean i(int i, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.i == 1 || (weakReference = sideSheetBehavior.f9722q) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.setStateInternal(5);
            WeakReference<V> weakReference = sideSheetBehavior.f9722q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.f9722q.get().requestLayout();
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f9733a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9734b;

        /* renamed from: c, reason: collision with root package name */
        public final B2.d f9735c = new B2.d(this, 13);

        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f9722q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9733a = i;
            if (this.f9734b) {
                return;
            }
            V v10 = sideSheetBehavior.f9722q.get();
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            v10.postOnAnimation(this.f9735c);
            this.f9734b = true;
        }
    }

    public SideSheetBehavior() {
        this.f9712f = new c();
        this.f9714h = true;
        this.i = 5;
        this.f9717l = 0.1f;
        this.f9724s = -1;
        this.f9728w = new LinkedHashSet();
        this.f9729x = new a();
    }

    @Override // L2.b
    public final void cancelBackProgress() {
        j jVar = this.f9726u;
        if (jVar == null) {
            return;
        }
        if (jVar.f2472f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0611b c0611b = jVar.f2472f;
        jVar.f2472f = null;
        if (c0611b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        V v10 = jVar.f2468b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(jVar.f2471e);
        animatorSet.start();
    }

    @Override // L2.b
    public final void handleBackInvoked() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f9726u;
        if (jVar == null) {
            return;
        }
        C0611b c0611b = jVar.f2472f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f2472f = null;
        int i9 = 5;
        if (c0611b == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
            return;
        }
        d dVar = this.f9708b;
        if (dVar != null && dVar.j() != 0) {
            i9 = 3;
        }
        b bVar = new b();
        WeakReference<View> weakReference = this.f9723r;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int c2 = this.f9708b.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: U2.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f9708b.o(marginLayoutParams, C1512a.c(c2, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        boolean z10 = c0611b.f8491d == 0;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        V v10 = jVar.f2468b;
        boolean z11 = (Gravity.getAbsoluteGravity(i9, v10.getLayoutDirection()) & 3) == 3;
        float scaleX = v10.getScaleX() * v10.getWidth();
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z11 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f10 = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z11) {
            f10 = -f10;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, f10);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new P0.a(1));
        ofFloat.setDuration(C1512a.c(jVar.f2469c, c0611b.f8490c, jVar.f2470d));
        ofFloat.addListener(new L2.i(jVar, z10, i9));
        ofFloat.addListener(bVar);
        ofFloat.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f9722q = null;
        this.f9715j = null;
        this.f9726u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f9722q = null;
        this.f9715j = null;
        this.f9726u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        E0.c cVar;
        VelocityTracker velocityTracker;
        if ((!v10.isShown() && C1596C.e(v10) == null) || !this.f9714h) {
            this.f9716k = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f9725t) != null) {
            velocityTracker.recycle();
            this.f9725t = null;
        }
        if (this.f9725t == null) {
            this.f9725t = VelocityTracker.obtain();
        }
        this.f9725t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f9727v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f9716k) {
            this.f9716k = false;
            return false;
        }
        return (this.f9716k || (cVar = this.f9715j) == null || !cVar.p(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i) {
        V v11;
        V v12;
        int i9;
        View findViewById;
        f fVar = this.f9709c;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int i10 = 0;
        if (this.f9722q == null) {
            this.f9722q = new WeakReference<>(v10);
            this.f9726u = new j(v10);
            if (fVar != null) {
                v10.setBackground(fVar);
                float f10 = this.f9713g;
                if (f10 == -1.0f) {
                    f10 = C1596C.d.e(v10);
                }
                fVar.n(f10);
            } else {
                ColorStateList colorStateList = this.f9710d;
                if (colorStateList != null) {
                    C1596C.d.j(v10, colorStateList);
                }
            }
            int i11 = this.i == 5 ? 4 : 0;
            if (v10.getVisibility() != i11) {
                v10.setVisibility(i11);
            }
            updateAccessibilityActions();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
            if (C1596C.e(v10) == null) {
                C1596C.p(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i12 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v10.getLayoutParams()).f6457c, i) == 3 ? 1 : 0;
        d dVar = this.f9708b;
        if (dVar == null || dVar.j() != i12) {
            i iVar = this.f9711e;
            CoordinatorLayout.f fVar2 = null;
            if (i12 == 0) {
                this.f9708b = new U2.b(this);
                if (iVar != null) {
                    WeakReference<V> weakReference = this.f9722q;
                    if (weakReference != null && (v12 = weakReference.get()) != null && (v12.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar2 = (CoordinatorLayout.f) v12.getLayoutParams();
                    }
                    if (fVar2 == null || ((ViewGroup.MarginLayoutParams) fVar2).rightMargin <= 0) {
                        i.a e10 = iVar.e();
                        e10.g(0.0f);
                        e10.e(0.0f);
                        i a10 = e10.a();
                        if (fVar != null) {
                            fVar.setShapeAppearanceModel(a10);
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalArgumentException(s3.b.i("Invalid sheet edge position value: ", i12, ". Must be 0 or 1."));
                }
                this.f9708b = new U2.a(this);
                if (iVar != null) {
                    WeakReference<V> weakReference2 = this.f9722q;
                    if (weakReference2 != null && (v11 = weakReference2.get()) != null && (v11.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar2 = (CoordinatorLayout.f) v11.getLayoutParams();
                    }
                    if (fVar2 == null || ((ViewGroup.MarginLayoutParams) fVar2).leftMargin <= 0) {
                        i.a e11 = iVar.e();
                        e11.f(0.0f);
                        e11.d(0.0f);
                        i a11 = e11.a();
                        if (fVar != null) {
                            fVar.setShapeAppearanceModel(a11);
                        }
                    }
                }
            }
        }
        if (this.f9715j == null) {
            this.f9715j = new E0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f9729x);
        }
        int h9 = this.f9708b.h(v10);
        coordinatorLayout.onLayoutChild(v10, i);
        this.f9719n = coordinatorLayout.getWidth();
        this.f9720o = this.f9708b.i(coordinatorLayout);
        this.f9718m = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f9721p = marginLayoutParams != null ? this.f9708b.a(marginLayoutParams) : 0;
        int i13 = this.i;
        if (i13 == 1 || i13 == 2) {
            i10 = h9 - this.f9708b.h(v10);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.i);
            }
            i10 = this.f9708b.e();
        }
        v10.offsetLeftAndRight(i10);
        if (this.f9723r == null && (i9 = this.f9724s) != -1 && (findViewById = coordinatorLayout.findViewById(i9)) != null) {
            this.f9723r = new WeakReference<>(findViewById);
        }
        for (U2.c cVar : this.f9728w) {
            if (cVar instanceof U2.f) {
                ((U2.f) cVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.f6536a;
        if (parcelable2 != null) {
            super.onRestoreInstanceState(coordinatorLayout, v10, parcelable2);
        }
        int i = savedState.f9730c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.f9715j.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f9725t) != null) {
            velocityTracker.recycle();
            this.f9725t = null;
        }
        if (this.f9725t == null) {
            this.f9725t = VelocityTracker.obtain();
        }
        this.f9725t.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.f9716k && shouldHandleDraggingWithHelper()) {
            float abs = Math.abs(this.f9727v - motionEvent.getX());
            E0.c cVar = this.f9715j;
            if (abs > cVar.f1018b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f9716k;
    }

    public final void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.f9722q;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
            return;
        }
        V v10 = this.f9722q.get();
        e eVar = new e(i, 2, this);
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (v10.isAttachedToWindow()) {
                v10.post(eVar);
                return;
            }
        }
        eVar.run();
    }

    public final void setStateInternal(int i) {
        V v10;
        if (this.i == i) {
            return;
        }
        this.i = i;
        WeakReference<V> weakReference = this.f9722q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        int i9 = this.i == 5 ? 4 : 0;
        if (v10.getVisibility() != i9) {
            v10.setVisibility(i9);
        }
        Iterator it = this.f9728w.iterator();
        while (it.hasNext()) {
            ((U2.c) it.next()).a();
        }
        updateAccessibilityActions();
    }

    public final boolean shouldHandleDraggingWithHelper() {
        return this.f9715j != null && (this.f9714h || this.i == 1);
    }

    @Override // L2.b
    public final void startBackProgress(C0611b c0611b) {
        j jVar = this.f9726u;
        if (jVar == null) {
            return;
        }
        jVar.f2472f = c0611b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        setStateInternal(2);
        r2.f9712f.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startSettling(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            U2.d r0 = r2.f9708b
            int r0 = r0.e()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.google.android.gms.measurement.internal.a.g(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            U2.d r0 = r2.f9708b
            int r0 = r0.d()
        L1f:
            E0.c r1 = r2.f9715j
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f1033r = r3
            r3 = -1
            r1.f1019c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f1017a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f1033r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f1033r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.setStateInternal(r3)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$c r3 = r2.f9712f
            r3.a(r4)
            goto L5a
        L57:
            r2.setStateInternal(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.startSettling(android.view.View, int, boolean):void");
    }

    public final void updateAccessibilityActions() {
        V v10;
        WeakReference<V> weakReference = this.f9722q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        C1596C.l(262144, v10);
        C1596C.i(0, v10);
        C1596C.l(PKIFailureInfo.badCertTemplate, v10);
        C1596C.i(0, v10);
        int i = 5;
        if (this.i != 5) {
            C1596C.m(v10, C1638d.a.f31226j, new J7.a(i, 2, this));
        }
        int i9 = 3;
        if (this.i != 3) {
            C1596C.m(v10, C1638d.a.f31225h, new J7.a(i9, 2, this));
        }
    }

    @Override // L2.b
    public final void updateBackProgress(C0611b c0611b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f9726u;
        if (jVar == null) {
            return;
        }
        d dVar = this.f9708b;
        int i = 5;
        if (dVar != null && dVar.j() != 0) {
            i = 3;
        }
        if (jVar.f2472f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0611b c0611b2 = jVar.f2472f;
        jVar.f2472f = c0611b;
        if (c0611b2 != null) {
            jVar.a(c0611b.f8490c, c0611b.f8491d == 0, i);
        }
        WeakReference<V> weakReference = this.f9722q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f9722q.get();
        WeakReference<View> weakReference2 = this.f9723r;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.f9708b.o(marginLayoutParams, (int) ((v10.getScaleX() * this.f9718m) + this.f9721p));
        view.requestLayout();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f9730c;

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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9730c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9730c);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f9730c = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9712f = new c();
        this.f9714h = true;
        this.i = 5;
        this.f9717l = 0.1f;
        this.f9724s = -1;
        this.f9728w = new LinkedHashSet();
        this.f9729x = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27479M);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9710d = P2.c.b(obtainStyledAttributes, context, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f9711e = i.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f9724s = resourceId;
            WeakReference<View> weakReference = this.f9723r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9723r = null;
            WeakReference<V> weakReference2 = this.f9722q;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    if (v10.isLaidOut()) {
                        v10.requestLayout();
                    }
                }
            }
        }
        i iVar = this.f9711e;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f9709c = fVar;
            fVar.k(context);
            ColorStateList colorStateList = this.f9710d;
            if (colorStateList != null) {
                this.f9709c.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f9709c.setTint(typedValue.data);
            }
        }
        this.f9713g = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f9714h = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

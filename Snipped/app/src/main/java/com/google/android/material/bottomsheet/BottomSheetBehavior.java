package com.google.android.material.bottomsheet;

import E0.c;
import J2.k;
import T2.i;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.C0611b;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pa.C1124b;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import y0.I;
import z0.C1638d;
import z0.InterfaceC1640f;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements L2.b {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = 2132083633;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    L2.g bottomContainerBackHelper;
    private final ArrayList<g> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0013c dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private T2.f materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private i shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.h stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    E0.c viewDragHelper;
    WeakReference<V> viewRef;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9155a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9156b;

        public a(View view, int i) {
            this.f9155a = view;
            this.f9156b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.startSettling(this.f9155a, this.f9156b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.setStateInternal(5);
            WeakReference<V> weakReference = bottomSheetBehavior.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.viewRef.get().requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.materialShapeDrawable != null) {
                bottomSheetBehavior.materialShapeDrawable.p(floatValue);
            }
        }
    }

    public class d implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f9160a;

        public d(boolean z10) {
            this.f9160a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        
            if (r7 != false) goto L35;
         */
        @Override // J2.k.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final y0.J a(android.view.View r12, y0.J r13, J2.k.c r14) {
            /*
                r11 = this;
                y0.J$j r0 = r13.f31013a
                r1 = 7
                n0.b r1 = r0.f(r1)
                r2 = 32
                n0.b r0 = r0.f(r2)
                int r2 = r1.f24067b
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r3, r2)
                boolean r2 = J2.k.c(r12)
                int r4 = r12.getPaddingBottom()
                int r5 = r12.getPaddingLeft()
                int r6 = r12.getPaddingRight()
                boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r3)
                if (r7 == 0) goto L38
                int r4 = r13.a()
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r4)
                int r4 = r14.f2142d
                int r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r3)
                int r4 = r4 + r7
            L38:
                boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r3)
                int r8 = r1.f24066a
                if (r7 == 0) goto L48
                if (r2 == 0) goto L45
                int r5 = r14.f2141c
                goto L47
            L45:
                int r5 = r14.f2139a
            L47:
                int r5 = r5 + r8
            L48:
                boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r3)
                int r9 = r1.f24068c
                if (r7 == 0) goto L59
                if (r2 == 0) goto L55
                int r14 = r14.f2139a
                goto L57
            L55:
                int r14 = r14.f2141c
            L57:
                int r6 = r14 + r9
            L59:
                android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r3)
                r7 = 1
                r10 = 0
                if (r2 == 0) goto L6f
                int r2 = r14.leftMargin
                if (r2 == r8) goto L6f
                r14.leftMargin = r8
                r2 = r7
                goto L70
            L6f:
                r2 = r10
            L70:
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r3)
                if (r8 == 0) goto L7d
                int r8 = r14.rightMargin
                if (r8 == r9) goto L7d
                r14.rightMargin = r9
                goto L7e
            L7d:
                r7 = r2
            L7e:
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r3)
                if (r2 == 0) goto L8d
                int r2 = r14.topMargin
                int r1 = r1.f24067b
                if (r2 == r1) goto L8d
                r14.topMargin = r1
                goto L8f
            L8d:
                if (r7 == 0) goto L92
            L8f:
                r12.setLayoutParams(r14)
            L92:
                int r14 = r12.getPaddingTop()
                r12.setPadding(r5, r14, r6, r4)
                boolean r12 = r11.f9160a
                if (r12 == 0) goto La2
                int r14 = r0.f24069d
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r3, r14)
            La2:
                boolean r14 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r3)
                if (r14 != 0) goto Laa
                if (r12 == 0) goto Lad
            Laa:
                com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r3, r10)
            Lad:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, y0.J, J2.k$c):y0.J");
        }
    }

    public class e extends c.AbstractC0013c {

        /* renamed from: a, reason: collision with root package name */
        public long f9162a;

        public e() {
        }

        @Override // E0.c.AbstractC0013c
        public final int a(int i, View view) {
            return view.getLeft();
        }

        @Override // E0.c.AbstractC0013c
        public final int b(int i, View view) {
            return C1124b.s(i, BottomSheetBehavior.this.getExpandedOffset(), d());
        }

        @Override // E0.c.AbstractC0013c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.canBeHiddenByDragging() ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
        }

        @Override // E0.c.AbstractC0013c
        public final void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.draggable) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // E0.c.AbstractC0013c
        public final void g(View view, int i, int i9) {
            BottomSheetBehavior.this.dispatchOnSlide(i9);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if (r5.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r5.parentHeight) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r10 > r5.halfExpandedOffset) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        
            if (java.lang.Math.abs(r9.getTop() - r5.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r5.halfExpandedOffset)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        
            if (java.lang.Math.abs(r10 - r5.fitToContentsOffset) < java.lang.Math.abs(r10 - r5.collapsedOffset)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
         */
        @Override // E0.c.AbstractC0013c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.h(android.view.View, float, float):void");
        }

        @Override // E0.c.AbstractC0013c
        public final boolean i(int i, View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i9 = bottomSheetBehavior.state;
            if (i9 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i9 == 3 && bottomSheetBehavior.activePointerId == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f9162a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.viewRef;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class f implements InterfaceC1640f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9164a;

        public f(int i) {
            this.f9164a = i;
        }

        @Override // z0.InterfaceC1640f
        public final boolean a(View view) {
            BottomSheetBehavior.this.setState(this.f9164a);
            return true;
        }
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public int f9166a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9167b;

        /* renamed from: c, reason: collision with root package name */
        public final a f9168c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.f9167b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                E0.c cVar = bottomSheetBehavior.viewDragHelper;
                if (cVar != null && cVar.f()) {
                    hVar.a(hVar.f9166a);
                } else if (bottomSheetBehavior.state == 2) {
                    bottomSheetBehavior.setStateInternal(hVar.f9166a);
                }
            }
        }

        public h() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9166a = i;
            if (this.f9167b) {
                return;
            }
            V v10 = bottomSheetBehavior.viewRef.get();
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            v10.postOnAnimation(this.f9168c);
            this.f9167b = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new e();
    }

    private int addAccessibilityActionForState(View view, int i, int i9) {
        int i10;
        String string = view.getResources().getString(i);
        InterfaceC1640f createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i9);
        ArrayList f10 = C1596C.f(view);
        int i11 = 0;
        while (true) {
            if (i11 >= f10.size()) {
                int i12 = -1;
                for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                    int i14 = C1596C.f30966d[i13];
                    boolean z10 = true;
                    for (int i15 = 0; i15 < f10.size(); i15++) {
                        z10 &= ((C1638d.a) f10.get(i15)).a() != i14;
                    }
                    if (z10) {
                        i12 = i14;
                    }
                }
                i10 = i12;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1638d.a) f10.get(i11)).f31229a).getLabel())) {
                    i10 = ((C1638d.a) f10.get(i11)).a();
                    break;
                }
                i11++;
            }
        }
        if (i10 != -1) {
            C1638d.a aVar = new C1638d.a(null, i10, string, createAccessibilityViewCommandForState, null);
            View.AccessibilityDelegate d10 = C1596C.d(view);
            C1597a c1597a = d10 == null ? null : d10 instanceof C1597a.C0481a ? ((C1597a.C0481a) d10).f31048a : new C1597a(d10);
            if (c1597a == null) {
                c1597a = new C1597a();
            }
            C1596C.o(view, c1597a);
            C1596C.l(aVar.a(), view);
            C1596C.f(view).add(aVar);
            C1596C.i(0, view);
        }
        return i10;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private float calculateCornerInterpolation(float f10, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f11 = radius;
            if (f11 > 0.0f && f10 > 0.0f) {
                return f11 / f10;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v10 = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v10.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float i = this.materialShapeDrawable.i();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float calculateCornerInterpolation = calculateCornerInterpolation(i, roundedCorner);
        T2.f fVar = this.materialShapeDrawable;
        float a10 = fVar.f3448a.f3471a.f3498f.a(fVar.h());
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(calculateCornerInterpolation, calculateCornerInterpolation(a10, roundedCorner2));
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f10;
        float f11;
        int i9 = this.collapsedOffset;
        if (i > i9 || i9 == getExpandedOffset()) {
            int i10 = this.collapsedOffset;
            f10 = i10 - i;
            f11 = this.parentHeight - i10;
        } else {
            int i11 = this.collapsedOffset;
            f10 = i11 - i;
            f11 = i11 - getExpandedOffset();
        }
        return f10 / f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view == null) {
            return;
        }
        C1596C.l(524288, view);
        C1596C.i(0, view);
        C1596C.l(262144, view);
        C1596C.i(0, view);
        C1596C.l(PKIFailureInfo.badCertTemplate, view);
        C1596C.i(0, view);
        int i9 = this.expandHalfwayActionIds.get(i, -1);
        if (i9 != -1) {
            C1596C.l(i9, view);
            C1596C.i(0, view);
            this.expandHalfwayActionIds.delete(i);
        }
    }

    private InterfaceC1640f createAccessibilityViewCommandForState(int i) {
        return new f(i);
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        T2.f fVar = new T2.f(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = fVar;
        fVar.k(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.o(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f6455a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i, int i9, int i10, int i11) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i9, i11);
        if (i10 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
        }
        if (size != 0) {
            i10 = Math.min(size, i10);
        }
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Invalid state to get top offset: "));
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        return this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen());
    }

    private boolean isLayouting(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (v10.isAttachedToWindow()) {
                return true;
            }
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, C1638d.a aVar, int i) {
        C1596C.m(view, aVar, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.f9151d;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.f9152e;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.f9153f;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.f9154g;
        }
    }

    private void runAfterLayout(V v10, Runnable runnable) {
        if (isLayouting(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z10) {
            k.a(view, new d(z10));
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        setStateInternal(2);
        updateDrawableForTargetState(r4, true);
        r2.stateSettlingTracker.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startSettling(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.getTopOffsetForState(r4)
            E0.c r1 = r2.viewDragHelper
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f1033r = r3
            r3 = -1
            r1.f1019c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1017a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f1033r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f1033r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.setStateInternal(r3)
            r3 = 1
            r2.updateDrawableForTargetState(r4, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$h r3 = r2.stateSettlingTracker
            r3.a(r4)
            goto L43
        L40:
            r2.setStateInternal(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.startSettling(android.view.View, int, boolean):void");
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i, boolean z10) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i == 2 || this.expandedCornersRemoved == (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
        if (!z10 || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.p(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.f3448a.f3479j, isExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z10) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
            if (!z10) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z10) {
        V v10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v10 = this.viewRef.get()) == null) {
                return;
            }
            if (z10) {
                setState(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(g gVar) {
        if (this.callbacks.contains(gVar)) {
            return;
        }
        this.callbacks.add(gVar);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @Override // L2.b
    public void cancelBackProgress() {
        L2.g gVar = this.bottomContainerBackHelper;
        if (gVar == null) {
            return;
        }
        if (gVar.f2472f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0611b c0611b = gVar.f2472f;
        gVar.f2472f = null;
        if (c0611b == null) {
            return;
        }
        AnimatorSet a10 = gVar.a();
        a10.setDuration(gVar.f2471e);
        a10.start();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        V v10 = this.viewRef.get();
        if (v10 == null || this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i9 = 0; i9 < this.callbacks.size(); i9++) {
            this.callbacks.get(i9).onSlide(v10, calculateSlideOffsetWithTop);
        }
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (C1596C.d.i(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public L2.g getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public T2.f getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // L2.b
    public void handleBackInvoked() {
        L2.g gVar = this.bottomContainerBackHelper;
        if (gVar == null) {
            return;
        }
        C0611b c0611b = gVar.f2472f;
        gVar.f2472f = null;
        if (c0611b == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
            return;
        }
        boolean z10 = this.hideable;
        int i = gVar.f2470d;
        int i9 = gVar.f2469c;
        float f10 = c0611b.f8490c;
        if (!z10) {
            AnimatorSet a10 = gVar.a();
            a10.setDuration(C1512a.c(i9, f10, i));
            a10.start();
            setState(4);
            return;
        }
        b bVar = new b();
        V v10 = gVar.f2468b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.TRANSLATION_Y, v10.getScaleY() * v10.getHeight());
        ofFloat.setInterpolator(new P0.a(1));
        ofFloat.setDuration(C1512a.c(i9, f10, i));
        ofFloat.addListener(new L2.f(gVar));
        ofFloat.addListener(bVar);
        ofFloat.start();
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i;
        E0.c cVar;
        if (!v10.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x9, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v10, x9, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.p(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.viewDragHelper.f1018b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v10);
            com.google.android.material.bottomsheet.g gVar = new com.google.android.material.bottomsheet.g(v10);
            if (Build.VERSION.SDK_INT >= 30) {
                v10.setWindowInsetsAnimationCallback(new I.d.a(gVar));
            } else {
                PathInterpolator pathInterpolator = I.c.f30987e;
                Object tag = v10.getTag(com.luminary.mobile.R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar = new I.c.a(v10, gVar);
                v10.setTag(com.luminary.mobile.R.id.tag_window_insets_animation_callback, aVar);
                if (tag == null) {
                    v10.setOnApplyWindowInsetsListener(aVar);
                }
            }
            this.viewRef = new WeakReference<>(v10);
            this.bottomContainerBackHelper = new L2.g(v10);
            Drawable drawable = this.materialShapeDrawable;
            if (drawable != null) {
                v10.setBackground(drawable);
                T2.f fVar = this.materialShapeDrawable;
                float f10 = this.elevation;
                if (f10 == -1.0f) {
                    f10 = C1596C.d.e(v10);
                }
                fVar.n(f10);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    C1596C.d.j(v10, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new E0.c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v10.getTop();
        coordinatorLayout.onLayoutChild(v10, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.childHeight = height;
        int i9 = this.parentHeight;
        int i10 = i9 - height;
        int i11 = this.insetTop;
        if (i10 < i11) {
            if (this.paddingTopSystemWindowInsets) {
                int i12 = this.maxHeight;
                if (i12 != -1) {
                    i9 = Math.min(i9, i12);
                }
                this.childHeight = i9;
            } else {
                int i13 = i9 - i11;
                int i14 = this.maxHeight;
                if (i14 != -1) {
                    i13 = Math.min(i13, i14);
                }
                this.childHeight = i13;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i15 = this.state;
        if (i15 == 3) {
            v10.offsetTopAndBottom(getExpandedOffset());
        } else if (i15 == 6) {
            v10.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i15 == 5) {
            v10.offsetTopAndBottom(this.parentHeight);
        } else if (i15 == 4) {
            v10.offsetTopAndBottom(this.collapsedOffset);
        } else if (i15 == 1 || i15 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v10));
        for (int i16 = 0; i16 < this.callbacks.size(); i16++) {
            this.callbacks.get(i16).onLayout(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i9, int[] iArr, int i10) {
        if (i10 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v10.getTop();
            int i11 = top - i9;
            if (i9 > 0) {
                if (i11 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    int i12 = -expandedOffset;
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    v10.offsetTopAndBottom(i12);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i9;
                    WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                    v10.offsetTopAndBottom(-i9);
                    setStateInternal(1);
                }
            } else if (i9 < 0 && !view.canScrollVertically(-1)) {
                if (i11 > this.collapsedOffset && !canBeHiddenByDragging()) {
                    int i13 = top - this.collapsedOffset;
                    iArr[1] = i13;
                    int i14 = -i13;
                    WeakHashMap<View, E> weakHashMap3 = C1596C.f30963a;
                    v10.offsetTopAndBottom(i14);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i9;
                    WeakHashMap<View, E> weakHashMap4 = C1596C.f30963a;
                    v10.offsetTopAndBottom(-i9);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v10.getTop());
            this.lastNestedScrollDy = i9;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v10, savedState.f6536a);
        restoreOptionalState(savedState);
        int i = savedState.f9150c;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i, int i9) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L49
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.j(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            E0.c cVar = this.viewDragHelper;
            if (abs > cVar.f1018b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(g gVar) {
        this.callbacks.remove(gVar);
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    @Deprecated
    public void setBottomSheetCallback(g gVar) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (gVar != null) {
            this.callbacks.add(gVar);
        }
    }

    public void setDraggable(boolean z10) {
        this.draggable = z10;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
        updateDrawableForTargetState(this.state, true);
    }

    public void setFitToContents(boolean z10) {
        if (this.fitToContents == z10) {
            return;
        }
        this.fitToContents = z10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.gestureInsetBottomIgnored = z10;
    }

    public void setHalfExpandedRatio(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f10;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f10) {
        this.hideFriction = f10;
    }

    public void setHideable(boolean z10) {
        if (this.hideable != z10) {
            this.hideable = z10;
            if (!z10 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z10) {
        this.hideable = z10;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setShouldRemoveExpandedCorners(boolean z10) {
        if (this.shouldRemoveExpandedCorners != z10) {
            this.shouldRemoveExpandedCorners = z10;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public void setSkipCollapsed(boolean z10) {
        this.skipCollapsed = z10;
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.hideable && i == 5) {
            Log.w(TAG, "Cannot set state: " + i);
            return;
        }
        int i9 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            V v10 = this.viewRef.get();
            runAfterLayout(v10, new a(v10, i9));
        }
    }

    public void setStateInternal(int i) {
        V v10;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i9 = 0; i9 < this.callbacks.size(); i9++) {
            this.callbacks.get(i9).onStateChanged(v10, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.updateImportantForAccessibilityOnSiblings = z10;
    }

    public boolean shouldExpandOnUpwardDrag(long j10, float f10) {
        return false;
    }

    public boolean shouldHide(View view, float f10) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f10 * this.hideFriction) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > HIDE_THRESHOLD;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // L2.b
    public void startBackProgress(C0611b c0611b) {
        L2.g gVar = this.bottomContainerBackHelper;
        if (gVar == null) {
            return;
        }
        gVar.f2472f = c0611b;
    }

    @Override // L2.b
    public void updateBackProgress(C0611b c0611b) {
        L2.g gVar = this.bottomContainerBackHelper;
        if (gVar == null) {
            return;
        }
        if (gVar.f2472f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0611b c0611b2 = gVar.f2472f;
        gVar.f2472f = c0611b;
        if (c0611b2 == null) {
            return;
        }
        gVar.b(c0611b.f8490c);
    }

    public final void setPeekHeight(int i, boolean z10) {
        if (i == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f9150c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9151d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9152e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f9153f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f9154g;

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
            this.f9150c = parcel.readInt();
            this.f9151d = parcel.readInt();
            this.f9152e = parcel.readInt() == 1;
            this.f9153f = parcel.readInt() == 1;
            this.f9154g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9150c);
            parcel.writeInt(this.f9151d);
            parcel.writeInt(this.f9152e ? 1 : 0);
            parcel.writeInt(this.f9153f ? 1 : 0);
            parcel.writeInt(this.f9154g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9150c = bottomSheetBehavior.state;
            this.f9151d = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.f9152e = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.f9153f = bottomSheetBehavior.hideable;
            this.f9154g = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, com.luminary.mobile.R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, C1638d.a.f31226j, 5);
        }
        int i9 = this.state;
        if (i9 == 3) {
            replaceAccessibilityActionForState(view, C1638d.a.i, this.fitToContents ? 4 : 6);
            return;
        }
        if (i9 == 4) {
            replaceAccessibilityActionForState(view, C1638d.a.f31225h, this.fitToContents ? 3 : 6);
        } else {
            if (i9 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, C1638d.a.i, 4);
            replaceAccessibilityActionForState(view, C1638d.a.f31225h, 3);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new e();
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27489f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = P2.c.b(obtainStyledAttributes, context, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.shapeAppearanceModelDefault = i.b(context, attributeSet, com.luminary.mobile.R.attr.bottomSheetStyle, DEF_STYLE_RES).a();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(8, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(13, false));
        setFitToContents(obtainStyledAttributes.getBoolean(6, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(12, false));
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(obtainStyledAttributes.getInt(10, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(7, HIDE_THRESHOLD));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(11, ServiceStarter.ERROR_UNKNOWN));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(17, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(18, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(19, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(20, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(14, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(15, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(16, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class g {
        public abstract void onSlide(View view, float f10);

        public abstract void onStateChanged(View view, int i);

        public void onLayout(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
    }
}

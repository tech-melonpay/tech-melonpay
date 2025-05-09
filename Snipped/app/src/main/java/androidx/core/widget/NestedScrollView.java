package androidx.core.widget;

import B0.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.C1274a;
import y0.C1596C;
import y0.C1597a;
import y0.C1600d;
import y0.C1608l;
import y0.E;
import y0.InterfaceC1601e;
import y0.InterfaceC1607k;
import y0.n;
import y0.o;
import z0.C1638d;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements n, InterfaceC1607k, ScrollingView {

    /* renamed from: B, reason: collision with root package name */
    public static final float f6504B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final a f6505C = new a();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f6506D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C1600d f6507A;

    /* renamed from: a, reason: collision with root package name */
    public final float f6508a;

    /* renamed from: b, reason: collision with root package name */
    public long f6509b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6510c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f6511d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f6512e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f6513f;

    /* renamed from: g, reason: collision with root package name */
    public int f6514g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6515h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public View f6516j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6517k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f6518l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6519m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6520n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6521o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6522p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6523q;

    /* renamed from: r, reason: collision with root package name */
    public int f6524r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f6525s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f6526t;

    /* renamed from: u, reason: collision with root package name */
    public int f6527u;

    /* renamed from: v, reason: collision with root package name */
    public int f6528v;

    /* renamed from: w, reason: collision with root package name */
    public SavedState f6529w;

    /* renamed from: x, reason: collision with root package name */
    public final o f6530x;

    /* renamed from: y, reason: collision with root package name */
    public final C1608l f6531y;

    /* renamed from: z, reason: collision with root package name */
    public float f6532z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f6533a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f6533a = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return s3.b.m(sb2, this.f6533a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6533a);
        }
    }

    public static class a extends C1597a {
        @Override // y0.C1597a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            int scrollRange;
            this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1638d.h(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c1638d.l(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1638d.b(C1638d.a.f31224g);
                c1638d.b(C1638d.a.f31227k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c1638d.b(C1638d.a.f31223f);
                c1638d.b(C1638d.a.f31228l);
            }
        }

        @Override // y0.C1597a
        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.p(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.p(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static final class b {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public class c implements InterfaceC1601e {
        public c() {
        }
    }

    public interface d {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luminary.mobile.R.attr.nestedScrollViewStyle);
        this.f6510c = new Rect();
        this.f6515h = true;
        this.i = false;
        this.f6516j = null;
        this.f6517k = false;
        this.f6520n = true;
        this.f6524r = -1;
        this.f6525s = new int[2];
        this.f6526t = new int[2];
        this.f6507A = new C1600d(getContext(), new c());
        int i = Build.VERSION.SDK_INT;
        this.f6512e = i >= 31 ? b.C0002b.a(context, attributeSet) : new EdgeEffect(context);
        this.f6513f = i >= 31 ? b.C0002b.a(context, attributeSet) : new EdgeEffect(context);
        this.f6508a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6511d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6521o = viewConfiguration.getScaledTouchSlop();
        this.f6522p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6523q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6506D, com.luminary.mobile.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f6530x = new o();
        this.f6531y = new C1608l(this);
        setNestedScrollingEnabled(true);
        C1596C.o(this, f6505C);
    }

    public static boolean g(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, view2);
    }

    public final boolean a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            n(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f6510c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            n(b(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!h(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(int i, int i9, int[] iArr, int[] iArr2, int i10) {
        return this.f6531y.c(i, i9, iArr, null, i10);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d(KeyEvent keyEvent) {
        this.f6510c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? f(33) : a(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? f(130) : a(130);
                }
                if (keyCode == 62) {
                    l(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return f(33);
                }
                if (keyCode == 93) {
                    return f(130);
                }
                if (keyCode == 122) {
                    l(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                l(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f6531y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f6531y.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i9, int[] iArr, int[] iArr2) {
        return this.f6531y.c(i, i9, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i9, int i10, int i11, int[] iArr) {
        return this.f6531y.e(i, i9, i10, i11, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f6512e;
        int i9 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f6513f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i9 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i9 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final void e(int i) {
        if (getChildCount() > 0) {
            this.f6511d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            q(2, 1);
            this.f6528v = getScrollY();
            postInvalidateOnAnimation();
            if (C1274a.c()) {
                b.a(this, Math.abs(this.f6511d.getCurrVelocity()));
            }
        }
    }

    public final boolean f(int i) {
        int childCount;
        boolean z10 = i == 130;
        int height = getHeight();
        Rect rect = this.f6510c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o oVar = this.f6530x;
        return oVar.f31086b | oVar.f31085a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f6532z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f6532z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f6532z;
    }

    public final boolean h(View view, int i, int i9) {
        Rect rect = this.f6510c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i9;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f6531y.g(0);
    }

    public final void i(int i, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f6531y.d(0, scrollY2, 0, i - scrollY2, null, i9, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6531y.f31083d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6524r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6514g = (int) motionEvent.getY(i);
            this.f6524r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f6518l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i, int i9, int i10, int i11) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i12 = i10 + i;
        if (i9 <= 0 && i9 >= 0) {
            z10 = false;
        } else {
            i9 = 0;
            z10 = true;
        }
        if (i12 <= i11) {
            if (i12 >= 0) {
                i11 = i12;
                z11 = false;
                if (z11 && !this.f6531y.g(1)) {
                    this.f6511d.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i9, i11);
                return z10 || z11;
            }
            i11 = 0;
        }
        z11 = true;
        if (z11) {
            this.f6511d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i9, i11);
        if (z10) {
            return true;
        }
    }

    public final void l(int i) {
        boolean z10 = i == 130;
        int height = getHeight();
        Rect rect = this.f6510c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i9 = rect.top;
        int i10 = height + i9;
        rect.bottom = i10;
        m(i, i9, i10);
    }

    public final boolean m(int i, int i9, int i10) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z11 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i9 < bottom && top < i10) {
                boolean z13 = i9 < top && bottom < i10;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i9 < scrollY || i10 > i11) {
            n(z11 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final int n(int i, int i9, int i10, boolean z10) {
        int i11;
        int i12;
        VelocityTracker velocityTracker;
        if (i10 == 1) {
            q(2, i10);
        }
        boolean c2 = this.f6531y.c(0, i, this.f6526t, this.f6525s, i10);
        int[] iArr = this.f6526t;
        int[] iArr2 = this.f6525s;
        if (c2) {
            i11 = i - iArr[1];
            i12 = iArr2[1];
        } else {
            i11 = i;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z12 = k(i11, 0, scrollY, scrollRange) && !this.f6531y.g(i10);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f6531y.e(0, scrollY2, 0, i11 - scrollY2, this.f6525s, i10, iArr);
        int i13 = i12 + iArr2[1];
        int i14 = i11 - iArr[1];
        int i15 = scrollY + i14;
        EdgeEffect edgeEffect = this.f6513f;
        EdgeEffect edgeEffect2 = this.f6512e;
        if (i15 < 0) {
            if (z11) {
                B0.b.b(edgeEffect2, (-i14) / getHeight(), i9 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > scrollRange && z11) {
            B0.b.b(edgeEffect, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z12 && i10 == 0 && (velocityTracker = this.f6518l) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            s(i10);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i13;
    }

    public final boolean o(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float a10 = B0.b.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f10 = this.f6508a * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = f6504B;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f10))) < a10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d2, code lost:
    
        if (r7 >= 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02be  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f6517k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i9 = this.f6524r;
                    if (i9 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i9);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i9 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f6514g) > this.f6521o && (2 & getNestedScrollAxes()) == 0) {
                                this.f6517k = true;
                                this.f6514g = y10;
                                if (this.f6518l == null) {
                                    this.f6518l = VelocityTracker.obtain();
                                }
                                this.f6518l.addMovement(motionEvent);
                                this.f6527u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.f6517k = false;
            this.f6524r = -1;
            VelocityTracker velocityTracker = this.f6518l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6518l = null;
            }
            if (this.f6511d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x9 >= childAt.getLeft() && x9 < childAt.getRight()) {
                    this.f6514g = y11;
                    this.f6524r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f6518l;
                    if (velocityTracker2 == null) {
                        this.f6518l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f6518l.addMovement(motionEvent);
                    this.f6511d.computeScrollOffset();
                    if (!r(motionEvent) && this.f6511d.isFinished()) {
                        z10 = false;
                    }
                    this.f6517k = z10;
                    q(2, 0);
                }
            }
            if (!r(motionEvent) && this.f6511d.isFinished()) {
                z10 = false;
            }
            this.f6517k = z10;
            VelocityTracker velocityTracker3 = this.f6518l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f6518l = null;
            }
        }
        return this.f6517k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int i12;
        super.onLayout(z10, i, i9, i10, i11);
        int i13 = 0;
        this.f6515h = false;
        View view = this.f6516j;
        if (view != null && g(view, this)) {
            View view2 = this.f6516j;
            Rect rect = this.f6510c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b9 = b(rect);
            if (b9 != 0) {
                scrollBy(0, b9);
            }
        }
        this.f6516j = null;
        if (!this.i) {
            if (this.f6529w != null) {
                scrollTo(getScrollX(), this.f6529w.f6533a);
                this.f6529w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i12 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i12 = 0;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i12 && scrollY >= 0) {
                i13 = paddingTop + scrollY > i12 ? i12 - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (this.f6519m && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        e((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f6531y.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr) {
        c(i, i9, iArr, null, 0);
    }

    @Override // y0.n
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
        i(i11, i12, iArr);
    }

    @Override // y0.m
    public final void onNestedScrollAccepted(View view, View view2, int i, int i9) {
        o oVar = this.f6530x;
        if (i9 == 1) {
            oVar.f31086b = i;
        } else {
            oVar.f31085a = i;
        }
        q(2, i9);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i9, boolean z10, boolean z11) {
        super.scrollTo(i, i9);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || (true ^ h(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6529w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6533a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i9, int i10, int i11) {
        super.onScrollChanged(i, i9, i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !h(findFocus, 0, i11)) {
            return;
        }
        Rect rect = this.f6510c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b9 = b(rect);
        if (b9 != 0) {
            if (this.f6520n) {
                p(0, b9, false);
            } else {
                scrollBy(0, b9);
            }
        }
    }

    @Override // y0.m
    public final boolean onStartNestedScroll(View view, View view2, int i, int i9) {
        return (i & 2) != 0;
    }

    @Override // y0.m
    public final void onStopNestedScroll(View view, int i) {
        o oVar = this.f6530x;
        if (i == 1) {
            oVar.f31086b = 0;
        } else {
            oVar.f31085a = 0;
        }
        s(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f6518l == null) {
            this.f6518l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6527u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        obtain.offsetLocation(0.0f, this.f6527u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f6513f;
            EdgeEffect edgeEffect2 = this.f6512e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f6518l;
                velocityTracker.computeCurrentVelocity(1000, this.f6523q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6524r);
                if (Math.abs(yVelocity) >= this.f6522p) {
                    if (B0.b.a(edgeEffect2) != 0.0f) {
                        if (o(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (B0.b.a(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (o(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            e(i);
                        }
                    } else {
                        int i9 = -yVelocity;
                        float f11 = i9;
                        if (!this.f6531y.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            e(i9);
                        }
                    }
                } else if (this.f6511d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6524r = -1;
                this.f6517k = false;
                VelocityTracker velocityTracker2 = this.f6518l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6518l = null;
                }
                s(0);
                this.f6512e.onRelease();
                this.f6513f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f6524r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f6524r + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i10 = this.f6514g - y10;
                    float x9 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i10 / getHeight();
                    if (B0.b.a(edgeEffect2) != 0.0f) {
                        float f12 = -B0.b.b(edgeEffect2, -height, x9);
                        if (B0.b.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (B0.b.a(edgeEffect) != 0.0f) {
                        float b9 = B0.b.b(edgeEffect, height, 1.0f - x9);
                        if (B0.b.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = b9;
                    }
                    int round = Math.round(f10 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i11 = i10 - round;
                    if (!this.f6517k && Math.abs(i11) > this.f6521o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f6517k = true;
                        i11 = i11 > 0 ? i11 - this.f6521o : i11 + this.f6521o;
                    }
                    if (this.f6517k) {
                        int n10 = n(i11, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f6514g = y10 - n10;
                        this.f6527u += n10;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f6517k && getChildCount() > 0 && this.f6511d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6524r = -1;
                this.f6517k = false;
                VelocityTracker velocityTracker3 = this.f6518l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f6518l = null;
                }
                s(0);
                this.f6512e.onRelease();
                this.f6513f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f6514g = (int) motionEvent.getY(actionIndex);
                this.f6524r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f6514g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6524r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6517k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6511d.isFinished()) {
                this.f6511d.abortAnimation();
                s(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f6514g = y11;
            this.f6524r = pointerId;
            q(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f6518l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i, int i9, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f6509b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f6511d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, u.d.DEFAULT_SWIPE_ANIMATION_DURATION);
            if (z10) {
                q(2, 1);
            } else {
                s(1);
            }
            this.f6528v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f6511d.isFinished()) {
                this.f6511d.abortAnimation();
                s(1);
            }
            scrollBy(i, i9);
        }
        this.f6509b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(int i, int i9) {
        return this.f6531y.h(2, i9);
    }

    public final boolean r(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f6512e;
        if (B0.b.a(edgeEffect) != 0.0f) {
            B0.b.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f6513f;
        if (B0.b.a(edgeEffect2) == 0.0f) {
            return z10;
        }
        B0.b.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f6515h) {
            this.f6516j = view2;
        } else {
            Rect rect = this.f6510c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b9 = b(rect);
            if (b9 != 0) {
                scrollBy(0, b9);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b9 = b(rect);
        boolean z11 = b9 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, b9);
            } else {
                p(0, b9, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f6518l) != null) {
            velocityTracker.recycle();
            this.f6518l = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6515h = true;
        super.requestLayout();
    }

    public final void s(int i) {
        this.f6531y.i(i);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i9 < 0) {
                i9 = 0;
            } else if (height + i9 > height2) {
                i9 = height2 - height;
            }
            if (i == getScrollX() && i9 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i9);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f6519m) {
            this.f6519m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1608l c1608l = this.f6531y;
        if (c1608l.f31083d) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.q(c1608l.f31082c);
        }
        c1608l.f31083d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f6520n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f6531y.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        s(0);
    }

    @Override // y0.m
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr, int i10) {
        c(i, i9, iArr, null, i10);
    }

    @Override // y0.m
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12) {
        i(i11, i12, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11) {
        i(i11, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(d dVar) {
    }
}

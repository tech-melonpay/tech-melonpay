package com.google.android.material.appbar;

import C.N;
import J2.i;
import L2.k;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k0.C0913a;
import pa.C1124b;
import t2.C1279a;
import u2.C1512a;
import v2.g;
import v2.h;
import y0.C1596C;
import y0.E;
import y0.InterfaceC1607k;
import y0.J;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f8973z = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f8974a;

    /* renamed from: b, reason: collision with root package name */
    public int f8975b;

    /* renamed from: c, reason: collision with root package name */
    public int f8976c;

    /* renamed from: d, reason: collision with root package name */
    public int f8977d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8978e;

    /* renamed from: f, reason: collision with root package name */
    public int f8979f;

    /* renamed from: g, reason: collision with root package name */
    public J f8980g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f8981h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8982j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8983k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8984l;

    /* renamed from: m, reason: collision with root package name */
    public int f8985m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<View> f8986n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8987o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f8988p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f8989q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f8990r;

    /* renamed from: s, reason: collision with root package name */
    public final long f8991s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f8992t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f8993u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f8994v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f8995w;

    /* renamed from: x, reason: collision with root package name */
    public final float f8996x;

    /* renamed from: y, reason: collision with root package name */
    public Behavior f8997y;

    public static class BaseBehavior<T extends AppBarLayout> extends v2.d<T> {

        /* renamed from: k, reason: collision with root package name */
        public int f8998k;

        /* renamed from: l, reason: collision with root package name */
        public int f8999l;

        /* renamed from: m, reason: collision with root package name */
        public ValueAnimator f9000m;

        /* renamed from: n, reason: collision with root package name */
        public SavedState f9001n;

        /* renamed from: o, reason: collision with root package name */
        public WeakReference<View> f9002o;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public boolean f9003c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f9004d;

            /* renamed from: e, reason: collision with root package name */
            public int f9005e;

            /* renamed from: f, reason: collision with root package name */
            public float f9006f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f9007g;

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
                this.f9003c = parcel.readByte() != 0;
                this.f9004d = parcel.readByte() != 0;
                this.f9005e = parcel.readInt();
                this.f9006f = parcel.readFloat();
                this.f9007g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f9003c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9004d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9005e);
                parcel.writeFloat(this.f9006f);
                parcel.writeByte(this.f9007g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View j(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f6455a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View l(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC1607k) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void p(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r0 = 1
                int r1 = java.lang.Math.abs(r9)
                int r2 = r8.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L20
                android.view.View r5 = r8.getChildAt(r4)
                int r6 = r5.getTop()
                if (r1 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r1 > r6) goto L1e
                goto L21
            L1e:
                int r4 = r4 + r0
                goto Lb
            L20:
                r5 = 0
            L21:
                if (r5 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$d r1 = (com.google.android.material.appbar.AppBarLayout.d) r1
                int r1 = r1.f9010a
                r2 = r1 & 1
                if (r2 == 0) goto L5c
                java.util.WeakHashMap<android.view.View, y0.E> r2 = y0.C1596C.f30963a
                int r2 = r5.getMinimumHeight()
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
            L48:
                r9 = r0
                goto L5d
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5c
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
                goto L48
            L5c:
                r9 = r3
            L5d:
                boolean r10 = r8.f8984l
                if (r10 == 0) goto L69
                android.view.View r9 = l(r7)
                boolean r9 = r8.h(r9)
            L69:
                boolean r9 = r8.g(r9)
                if (r11 != 0) goto L96
                if (r9 == 0) goto Lbd
                java.util.List r7 = r7.getDependents(r8)
                int r9 = r7.size()
            L79:
                if (r3 >= r9) goto Lbd
                java.lang.Object r10 = r7.get(r3)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f6455a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto L94
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f30554g
                if (r7 == 0) goto Lbd
                goto L96
            L94:
                int r3 = r3 + r0
                goto L79
            L96:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto La3
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            La3:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lb0
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lb0:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lbd
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lbd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // v2.f
        public final int b() {
            return a() + this.f8998k;
        }

        @Override // v2.d
        public final boolean d(View view) {
            WeakReference<View> weakReference = this.f9002o;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // v2.d
        public final int e(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // v2.d
        public final int f(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v2.d
        public final void g(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            o(coordinatorLayout, appBarLayout);
            if (appBarLayout.f8984l) {
                appBarLayout.g(appBarLayout.h(l(coordinatorLayout)));
            }
        }

        @Override // v2.d
        public final int h(CoordinatorLayout coordinatorLayout, View view, int i, int i9, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int b9 = b();
            int i14 = 0;
            if (i9 == 0 || b9 < i9 || b9 > i10) {
                this.f8998k = 0;
            } else {
                int s10 = C1124b.s(i, i9, i10);
                if (b9 != s10) {
                    if (appBarLayout.f8978e) {
                        int abs = Math.abs(s10);
                        int childCount = appBarLayout.getChildCount();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i15);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.f9012c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i15++;
                            } else if (interpolator != null) {
                                int i16 = dVar.f9010a;
                                if ((i16 & 1) != 0) {
                                    i12 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                                    if ((i16 & 2) != 0) {
                                        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                                        i12 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i12 = 0;
                                }
                                WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                                if (childAt.getFitsSystemWindows()) {
                                    i12 -= appBarLayout.getTopInset();
                                }
                                if (i12 > 0) {
                                    float f10 = i12;
                                    i11 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(s10);
                                }
                            }
                        }
                    }
                    i11 = s10;
                    g gVar = this.f30555b;
                    if (gVar != null) {
                        z10 = gVar.b(i11);
                    } else {
                        this.f30556c = i11;
                        z10 = false;
                    }
                    int i17 = b9 - s10;
                    this.f8998k = s10 - i11;
                    if (z10) {
                        for (int i18 = 0; i18 < appBarLayout.getChildCount(); i18 += i13) {
                            d dVar2 = (d) appBarLayout.getChildAt(i18).getLayoutParams();
                            c cVar = dVar2.f9011b;
                            if (cVar != null && (dVar2.f9010a & i13) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i18);
                                float a10 = a();
                                Rect rect = cVar.f9008a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(a10);
                                if (abs2 <= 0.0f) {
                                    float r8 = 1.0f - C1124b.r(Math.abs(abs2 / rect.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (r8 * r8)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = cVar.f9009b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    if (height >= rect2.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap<View, E> weakHashMap3 = C1596C.f30963a;
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    WeakHashMap<View, E> weakHashMap4 = C1596C.f30963a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                                i13 = 1;
                            }
                        }
                    }
                    if (!z10 && appBarLayout.f8978e) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.e(a());
                    if (s10 < b9) {
                        i13 = -1;
                    }
                    p(coordinatorLayout, appBarLayout, s10, i13, false);
                    i14 = i17;
                }
            }
            if (C1596C.d(coordinatorLayout) == null) {
                C1596C.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            }
            return i14;
        }

        public final void k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(b() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int b9 = b();
            if (b9 == i) {
                ValueAnimator valueAnimator = this.f9000m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f9000m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9000m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9000m = valueAnimator3;
                valueAnimator3.setInterpolator(C1512a.f30145e);
                this.f9000m.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f9000m.setDuration(Math.min(round, 600));
            this.f9000m.setIntValues(b9, i);
            this.f9000m.start();
        }

        public final void m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i9;
            int i10;
            if (i != 0) {
                if (i < 0) {
                    i9 = -appBarLayout.getTotalScrollRange();
                    i10 = appBarLayout.getDownNestedPreScrollRange() + i9;
                } else {
                    i9 = -appBarLayout.getUpNestedPreScrollRange();
                    i10 = 0;
                }
                int i11 = i9;
                int i12 = i10;
                if (i11 != i12) {
                    iArr[1] = h(coordinatorLayout, appBarLayout, b() - i, i11, i12);
                }
            }
            if (appBarLayout.f8984l) {
                appBarLayout.g(appBarLayout.h(view));
            }
        }

        public final SavedState n(Parcelable parcelable, T t3) {
            int a10 = a();
            int childCount = t3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t3.getChildAt(i);
                int bottom = childAt.getBottom() + a10;
                if (childAt.getTop() + a10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f6535b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = a10 == 0;
                    savedState.f9004d = z10;
                    savedState.f9003c = !z10 && (-a10) >= t3.getTotalScrollRange();
                    savedState.f9005e = i;
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    savedState.f9007g = bottom == t3.getTopInset() + childAt.getMinimumHeight();
                    savedState.f9006f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void o(CoordinatorLayout coordinatorLayout, T t3) {
            int paddingTop = t3.getPaddingTop() + t3.getTopInset();
            int b9 = b() - paddingTop;
            int childCount = t3.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t3.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if ((dVar.f9010a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i9 = -b9;
                if (top <= i9 && bottom >= i9) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t3.getChildAt(i);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i10 = dVar2.f9010a;
                if ((i10 & 17) == 17) {
                    int i11 = -childAt2.getTop();
                    int i12 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                        if (t3.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i11 -= t3.getTopInset();
                        }
                    }
                    if ((i10 & 2) == 2) {
                        WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                        i12 += childAt2.getMinimumHeight();
                    } else if ((i10 & 5) == 5) {
                        WeakHashMap<View, E> weakHashMap3 = C1596C.f30963a;
                        int minimumHeight = childAt2.getMinimumHeight() + i12;
                        if (b9 < minimumHeight) {
                            i11 = minimumHeight;
                        } else {
                            i12 = minimumHeight;
                        }
                    }
                    if ((i10 & 32) == 32) {
                        i11 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i12 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (b9 < (i12 + i11) / 2) {
                        i11 = i12;
                    }
                    k(coordinatorLayout, t3, C1124b.s(i11 + paddingTop, -t3.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // v2.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f9001n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i9 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            k(coordinatorLayout, appBarLayout, i9);
                        } else {
                            i(coordinatorLayout, appBarLayout, i9);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            k(coordinatorLayout, appBarLayout, 0);
                        } else {
                            i(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f9003c) {
                i(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f9004d) {
                i(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f9005e);
                int i10 = -childAt.getBottom();
                if (this.f9001n.f9007g) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i10;
                } else {
                    round = Math.round(childAt.getHeight() * this.f9001n.f9006f) + i10;
                }
                i(coordinatorLayout, appBarLayout, round);
            }
            appBarLayout.f8979f = 0;
            this.f9001n = null;
            int s10 = C1124b.s(a(), -appBarLayout.getTotalScrollRange(), 0);
            g gVar = this.f30555b;
            if (gVar != null) {
                gVar.b(s10);
            } else {
                this.f30556c = s10;
            }
            p(coordinatorLayout, appBarLayout, a(), 0, true);
            appBarLayout.e(a());
            if (C1596C.d(coordinatorLayout) == null) {
                C1596C.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i9, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i9, i10, i11);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i9, View.MeasureSpec.makeMeasureSpec(0, 0), i11);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i9, int[] iArr, int i10) {
            m(coordinatorLayout, (AppBarLayout) view, view2, i9, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i9, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                iArr[1] = h(coordinatorLayout, appBarLayout, b() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i11 == 0 && C1596C.d(coordinatorLayout) == null) {
                C1596C.o(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f9001n = null;
            } else {
                SavedState savedState = (SavedState) parcelable;
                this.f9001n = savedState;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.f6536a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            SavedState n10 = n(onSaveInstanceState, appBarLayout);
            return n10 == null ? onSaveInstanceState : n10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i9) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i & 2) != 0 && (appBarLayout.f8984l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f9000m) != null) {
                valueAnimator.cancel();
            }
            this.f9002o = null;
            this.f8999l = i9;
            return z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f8999l == 0 || i == 1) {
                o(coordinatorLayout, appBarLayout);
                if (appBarLayout.f8984l) {
                    appBarLayout.g(appBarLayout.h(view2));
                }
            }
            this.f9002o = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends v2.e {
        public ScrollingViewBehavior() {
        }

        @Override // v2.e
        public final AppBarLayout d(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // v2.e
        public final float e(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f6455a;
                int b9 = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).b() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + b9 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (b9 / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // v2.e
        public final int f(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int s10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f6455a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f8998k + this.f30553f;
                if (this.f30554g == 0) {
                    s10 = 0;
                } else {
                    float e10 = e(view2);
                    int i = this.f30554g;
                    s10 = C1124b.s((int) (e10 * i), 0, i);
                }
                int i9 = bottom - s10;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                view.offsetTopAndBottom(i9);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f8984l) {
                    appBarLayout.g(appBarLayout.h(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1596C.o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f30551d;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.f(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27476J);
            this.f30554g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t3, int i);
    }

    public static abstract class b {
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f9008a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f9009b = new Rect();
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f9010a;

        /* renamed from: b, reason: collision with root package name */
        public c f9011b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f9012c;
    }

    public interface e {
        void onUpdate();
    }

    public interface f extends a<AppBarLayout> {
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.appBarLayoutStyle, 2132083631), attributeSet, R.attr.appBarLayoutStyle);
        Integer num;
        this.f8975b = -1;
        this.f8976c = -1;
        this.f8977d = -1;
        this.f8979f = 0;
        this.f8990r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d10 = i.d(context3, attributeSet, h.f30561a, R.attr.appBarLayoutStyle, 2132083631, new int[0]);
        try {
            if (d10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d10.getResourceId(0, 0)));
            }
            d10.recycle();
            TypedArray d11 = i.d(context2, attributeSet, C1279a.f27484a, R.attr.appBarLayoutStyle, 2132083631, new int[0]);
            Drawable drawable = d11.getDrawable(0);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setBackground(drawable);
            final ColorStateList b9 = P2.c.b(d11, context2, 6);
            this.f8987o = b9 != null;
            final ColorStateList a10 = F2.a.a(getBackground());
            if (a10 != null) {
                final T2.f fVar = new T2.f();
                fVar.o(a10);
                if (b9 != null) {
                    Context context4 = getContext();
                    TypedValue a11 = P2.b.a(context4, R.attr.colorSurface);
                    if (a11 != null) {
                        int i = a11.resourceId;
                        num = Integer.valueOf(i != 0 ? C0913a.getColor(context4, i) : a11.data);
                    } else {
                        num = null;
                    }
                    final Integer num2 = num;
                    this.f8989q = new ValueAnimator.AnimatorUpdateListener() { // from class: v2.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num3;
                            int i9 = AppBarLayout.f8973z;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            appBarLayout.getClass();
                            int n02 = D9.b.n0(a10.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), b9.getDefaultColor());
                            ColorStateList valueOf = ColorStateList.valueOf(n02);
                            T2.f fVar2 = fVar;
                            fVar2.o(valueOf);
                            if (appBarLayout.f8994v != null && (num3 = appBarLayout.f8995w) != null && num3.equals(num2)) {
                                appBarLayout.f8994v.setTint(n02);
                            }
                            ArrayList arrayList = appBarLayout.f8990r;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                AppBarLayout.e eVar = (AppBarLayout.e) it.next();
                                if (fVar2.f3448a.f3473c != null) {
                                    eVar.onUpdate();
                                }
                            }
                        }
                    };
                    setBackground(fVar);
                } else {
                    fVar.k(context2);
                    this.f8989q = new ValueAnimator.AnimatorUpdateListener() { // from class: v2.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i9 = AppBarLayout.f8973z;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            appBarLayout.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            fVar.n(floatValue);
                            Drawable drawable2 = appBarLayout.f8994v;
                            if (drawable2 instanceof T2.f) {
                                ((T2.f) drawable2).n(floatValue);
                            }
                            Iterator it = appBarLayout.f8990r.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.e) it.next()).onUpdate();
                            }
                        }
                    };
                    setBackground(fVar);
                }
            }
            this.f8991s = k.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f8992t = k.d(context2, R.attr.motionEasingStandardInterpolator, C1512a.f30141a);
            if (d11.hasValue(4)) {
                f(d11.getBoolean(4, false), false, false);
            }
            if (d11.hasValue(3)) {
                h.a(this, d11.getDimensionPixelSize(3, 0));
            }
            if (d11.hasValue(2)) {
                setKeyboardNavigationCluster(d11.getBoolean(2, false));
            }
            if (d11.hasValue(1)) {
                setTouchscreenBlocksFocus(d11.getBoolean(1, false));
            }
            this.f8996x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f8984l = d11.getBoolean(5, false);
            this.f8985m = d11.getResourceId(7, -1);
            setStatusBarForeground(d11.getDrawable(8));
            d11.recycle();
            C1596C.d.m(this, new N(this, 25));
        } catch (Throwable th) {
            d10.recycle();
            throw th;
        }
    }

    public static d c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            d dVar = new d((LinearLayout.LayoutParams) layoutParams);
            dVar.f9010a = 1;
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar2 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.f9010a = 1;
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.f9010a = 1;
        return dVar3;
    }

    public final void a(f fVar) {
        if (this.f8981h == null) {
            this.f8981h = new ArrayList();
        }
        if (fVar == null || this.f8981h.contains(fVar)) {
            return;
        }
        this.f8981h.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f9010a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27485b);
        dVar.f9010a = obtainStyledAttributes.getInt(1, 0);
        dVar.f9011b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new c();
        if (obtainStyledAttributes.hasValue(2)) {
            dVar.f9012c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d() {
        Behavior behavior = this.f8997y;
        BaseBehavior.SavedState n10 = (behavior == null || this.f8975b == -1 || this.f8979f != 0) ? null : behavior.n(AbsSavedState.f6535b, this);
        this.f8975b = -1;
        this.f8976c = -1;
        this.f8977d = -1;
        if (n10 != null) {
            Behavior behavior2 = this.f8997y;
            if (behavior2.f9001n != null) {
                return;
            }
            behavior2.f9001n = n10;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8994v == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.f8974a);
        this.f8994v.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8994v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.f8974a = i;
        if (!willNotDraw()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f8981h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                a aVar = (a) this.f8981h.get(i9);
                if (aVar != null) {
                    aVar.a(this, i);
                }
            }
        }
    }

    public final void f(boolean z10, boolean z11, boolean z12) {
        this.f8979f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public final boolean g(boolean z10) {
        if (!(!this.i) || this.f8983k == z10) {
            return false;
        }
        this.f8983k = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof T2.f)) {
            return true;
        }
        if (this.f8987o) {
            j(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f8984l) {
            return true;
        }
        float f10 = this.f8996x;
        j(z10 ? 0.0f : f10, z10 ? f10 : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.f9010a = 1;
        return dVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f8997y = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.f8976c
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$d r7 = (com.google.android.material.appbar.AppBarLayout.d) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f9010a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, y0.E> r7 = y0.C1596C.f30963a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, y0.E> r7 = y0.C1596C.f30963a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap<android.view.View, y0.E> r9 = y0.C1596C.f30963a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.f8976c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f8977d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i11 = dVar.f9010a;
                if ((i11 & 1) == 0) {
                    break;
                }
                i10 += measuredHeight;
                if ((i11 & 2) != 0) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    i10 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.f8977d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f8985m;
    }

    public T2.f getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof T2.f) {
            return (T2.f) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f8979f;
    }

    public Drawable getStatusBarForeground() {
        return this.f8994v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        J j10 = this.f8980g;
        if (j10 != null) {
            return j10.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f8975b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = dVar.f9010a;
                if ((i11 & 1) == 0) {
                    break;
                }
                int i12 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i10;
                if (i9 == 0) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    if (childAt.getFitsSystemWindows()) {
                        i12 -= getTopInset();
                    }
                }
                i10 = i12;
                if ((i11 & 2) != 0) {
                    WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                    i10 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.f8975b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i;
        if (this.f8986n == null && (i = this.f8985m) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f8985m);
            }
            if (findViewById != null) {
                this.f8986n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f8986n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        return !childAt.getFitsSystemWindows();
    }

    public final void j(float f10, float f11) {
        ValueAnimator valueAnimator = this.f8988p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f8988p = ofFloat;
        ofFloat.setDuration(this.f8991s);
        this.f8988p.setInterpolator(this.f8992t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f8989q;
        if (animatorUpdateListener != null) {
            this.f8988p.addUpdateListener(animatorUpdateListener);
        }
        this.f8988p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.x(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f8993u == null) {
            this.f8993u = new int[4];
        }
        int[] iArr = this.f8993u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z10 = this.f8982j;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969884;
        iArr[1] = (z10 && this.f8983k) ? R.attr.state_lifted : -2130969885;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969880;
        iArr[3] = (z10 && this.f8983k) ? R.attr.state_collapsed : -2130969879;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f8986n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8986n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        boolean z11 = true;
        super.onLayout(z10, i, i9, i10, i11);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (getFitsSystemWindows() && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.f8978e = false;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i12).getLayoutParams()).f9012c != null) {
                this.f8978e = true;
                break;
            }
            i12++;
        }
        Drawable drawable = this.f8994v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.f8984l) {
            int childCount3 = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i14 = ((d) getChildAt(i13).getLayoutParams()).f9010a;
                if ((i14 & 1) == 1 && (i14 & 10) != 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (this.f8982j != z11) {
            this.f8982j = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != 1073741824) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (getFitsSystemWindows() && i()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C1124b.s(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i9));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Ja.a.w(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        f(z10, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f8984l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f8985m = -1;
        if (view != null) {
            this.f8986n = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f8986n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8986n = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f8985m = i;
        WeakReference<View> weakReference = this.f8986n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8986n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f8994v;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f8994v = mutate;
            if (mutate instanceof T2.f) {
                num = Integer.valueOf(((T2.f) mutate).f3467u);
            } else {
                ColorStateList a10 = F2.a.a(mutate);
                if (a10 != null) {
                    num = Integer.valueOf(a10.getDefaultColor());
                }
            }
            this.f8995w = num;
            Drawable drawable3 = this.f8994v;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f8994v.setState(getDrawableState());
                }
                Drawable drawable4 = this.f8994v;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f8994v.setVisible(getVisibility() == 0, false);
                this.f8994v.setCallback(this);
            }
            if (this.f8994v != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(U4.b.j(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f8994v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8994v;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.f9010a = 1;
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import m.e0;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, k {

    /* renamed from: A, reason: collision with root package name */
    public e f4915A;

    /* renamed from: p, reason: collision with root package name */
    public f f4916p;

    /* renamed from: q, reason: collision with root package name */
    public Context f4917q;

    /* renamed from: r, reason: collision with root package name */
    public int f4918r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4919s;

    /* renamed from: t, reason: collision with root package name */
    public ActionMenuPresenter f4920t;

    /* renamed from: u, reason: collision with root package name */
    public j.a f4921u;

    /* renamed from: v, reason: collision with root package name */
    public f.a f4922v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4923w;

    /* renamed from: x, reason: collision with root package name */
    public int f4924x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4925y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4926z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4927a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4928b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4929c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4930d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4931e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4932f;
    }

    public class d implements f.a {
        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        
            return true;
         */
        @Override // androidx.appcompat.view.menu.f.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(androidx.appcompat.view.menu.f r4, android.view.MenuItem r5) {
            /*
                r3 = this;
                androidx.appcompat.widget.ActionMenuView r4 = androidx.appcompat.widget.ActionMenuView.this
                androidx.appcompat.widget.ActionMenuView$e r4 = r4.f4915A
                r0 = 0
                if (r4 == 0) goto L37
                androidx.appcompat.widget.Toolbar$a r4 = (androidx.appcompat.widget.Toolbar.a) r4
                androidx.appcompat.widget.Toolbar r4 = androidx.appcompat.widget.Toolbar.this
                y0.i r1 = r4.f5051G
                java.util.concurrent.CopyOnWriteArrayList<y0.j> r1 = r1.f31078b
                java.util.Iterator r1 = r1.iterator()
            L13:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.next()
                y0.j r2 = (y0.InterfaceC1606j) r2
                boolean r2 = r2.a(r5)
                if (r2 == 0) goto L13
                goto L36
            L26:
                androidx.appcompat.widget.Toolbar$h r4 = r4.f5053I
                if (r4 == 0) goto L37
                h.n$b r4 = (h.C0787n.b) r4
                h.n r4 = h.C0787n.this
                android.view.Window$Callback r4 = r4.f20961b
                boolean r4 = r4.onMenuItemSelected(r0, r5)
                if (r4 == 0) goto L37
            L36:
                r0 = 1
            L37:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.d.a(androidx.appcompat.view.menu.f, android.view.MenuItem):boolean");
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.f4922v;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f4925y = (int) (56.0f * f10);
        this.f4926z = (int) (f10 * 4.0f);
        this.f4917q = context;
        this.f4918r = 0;
    }

    public static c l() {
        c cVar = new c(-2, -2);
        cVar.f4927a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c m(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f4927a = cVar2.f4927a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.f4916p.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.f4916p = fVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4916p == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f4916p = fVar;
            fVar.f4750e = new d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f4920t = actionMenuPresenter;
            actionMenuPresenter.f4893m = true;
            actionMenuPresenter.f4894n = true;
            j.a aVar = this.f4921u;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter.f4692e = aVar;
            this.f4916p.b(actionMenuPresenter, this.f4917q);
            ActionMenuPresenter actionMenuPresenter2 = this.f4920t;
            actionMenuPresenter2.f4695h = this;
            this.f4916p = actionMenuPresenter2.f4690c;
        }
        return this.f4916p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4920t;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f4890j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f4892l) {
            return actionMenuPresenter.f4891k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4918r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i) {
        boolean z10 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z10 = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f4920t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d(false);
            if (this.f4920t.j()) {
                this.f4920t.b();
                this.f4920t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f4920t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.f4901u;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f4809j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int width;
        int i12;
        if (!this.f4923w) {
            super.onLayout(z10, i, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i10 - i;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = e0.f23753a;
        boolean z12 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4927a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        i12 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i12 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i12 = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(i12, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    n(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int max = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f4927a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f4927a) {
                int i26 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft = com.google.android.gms.measurement.internal.a.u(measuredWidth4, ((LinearLayout.LayoutParams) cVar3).rightMargin, max, i26);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        ?? r12;
        int i17;
        int i18;
        int i19;
        f fVar;
        boolean z11 = this.f4923w;
        boolean z12 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4923w = z12;
        if (z11 != z12) {
            this.f4924x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4923w && (fVar = this.f4916p) != null && size != this.f4924x) {
            this.f4924x = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4923w || childCount <= 0) {
            for (int i20 = 0; i20 < childCount; i20++) {
                c cVar = (c) getChildAt(i20).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingBottom, -2);
        int i21 = size2 - paddingRight;
        int i22 = this.f4925y;
        int i23 = i21 / i22;
        int i24 = i21 % i22;
        if (i23 == 0) {
            setMeasuredDimension(i21, 0);
            return;
        }
        int i25 = (i24 / i23) + i22;
        int childCount2 = getChildCount();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z13 = false;
        int i29 = 0;
        int i30 = 0;
        long j10 = 0;
        while (true) {
            i10 = this.f4926z;
            if (i28 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i28);
            int i31 = size3;
            if (childAt.getVisibility() == 8) {
                i17 = i21;
                i18 = paddingBottom;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i32 = i26 + 1;
                if (z14) {
                    childAt.setPadding(i10, 0, i10, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f4932f = false;
                cVar2.f4929c = 0;
                cVar2.f4928b = 0;
                cVar2.f4930d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f4931e = z14 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i33 = cVar2.f4927a ? 1 : i23;
                c cVar3 = (c) childAt.getLayoutParams();
                i17 = i21;
                i18 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i33 <= 0 || (z15 && i33 < 2)) {
                    i19 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i33 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i19 = measuredWidth / i25;
                    if (measuredWidth % i25 != 0) {
                        i19++;
                    }
                    if (z15 && i19 < 2) {
                        i19 = 2;
                    }
                }
                cVar3.f4930d = !cVar3.f4927a && z15;
                cVar3.f4928b = i19;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i25, 1073741824), makeMeasureSpec);
                i27 = Math.max(i27, i19);
                if (cVar2.f4930d) {
                    i29++;
                }
                if (cVar2.f4927a) {
                    z13 = true;
                }
                i23 -= i19;
                i30 = Math.max(i30, childAt.getMeasuredHeight());
                if (i19 == 1) {
                    j10 |= 1 << i28;
                }
                i26 = i32;
            }
            i28++;
            size3 = i31;
            paddingBottom = i18;
            i21 = i17;
        }
        int i34 = i21;
        int i35 = size3;
        int i36 = i30;
        boolean z16 = z13 && i26 == 2;
        boolean z17 = false;
        while (i29 > 0 && i23 > 0) {
            int i37 = Integer.MAX_VALUE;
            int i38 = 0;
            int i39 = 0;
            long j11 = 0;
            while (i39 < childCount2) {
                int i40 = i36;
                c cVar4 = (c) getChildAt(i39).getLayoutParams();
                boolean z18 = z17;
                if (cVar4.f4930d) {
                    int i41 = cVar4.f4928b;
                    if (i41 < i37) {
                        j11 = 1 << i39;
                        i37 = i41;
                        i38 = 1;
                    } else if (i41 == i37) {
                        i38++;
                        j11 |= 1 << i39;
                    }
                }
                i39++;
                z17 = z18;
                i36 = i40;
            }
            i12 = i36;
            z10 = z17;
            j10 |= j11;
            if (i38 > i23) {
                i11 = mode;
                break;
            }
            int i42 = i37 + 1;
            int i43 = 0;
            while (i43 < childCount2) {
                View childAt2 = getChildAt(i43);
                c cVar5 = (c) childAt2.getLayoutParams();
                int i44 = mode;
                int i45 = childMeasureSpec;
                int i46 = childCount2;
                long j12 = 1 << i43;
                if ((j11 & j12) != 0) {
                    if (z16 && cVar5.f4931e) {
                        r12 = 1;
                        r12 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i10 + i25, 0, i10, 0);
                        }
                    } else {
                        r12 = 1;
                    }
                    cVar5.f4928b += r12;
                    cVar5.f4932f = r12;
                    i23--;
                } else if (cVar5.f4928b == i42) {
                    j10 |= j12;
                }
                i43++;
                childMeasureSpec = i45;
                mode = i44;
                childCount2 = i46;
            }
            i36 = i12;
            z17 = true;
        }
        i11 = mode;
        i12 = i36;
        z10 = z17;
        int i47 = childMeasureSpec;
        int i48 = childCount2;
        boolean z19 = !z13 && i26 == 1;
        if (i23 <= 0 || j10 == 0 || (i23 >= i26 - 1 && !z19 && i27 <= 1)) {
            i13 = i48;
        } else {
            float bitCount = Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f4931e) {
                    bitCount -= 0.5f;
                }
                int i49 = i48 - 1;
                if ((j10 & (1 << i49)) != 0 && !((c) getChildAt(i49).getLayoutParams()).f4931e) {
                    bitCount -= 0.5f;
                }
            }
            int i50 = bitCount > 0.0f ? (int) ((i23 * i25) / bitCount) : 0;
            i13 = i48;
            for (int i51 = 0; i51 < i13; i51++) {
                if ((j10 & (1 << i51)) != 0) {
                    View childAt3 = getChildAt(i51);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f4929c = i50;
                        cVar6.f4932f = true;
                        if (i51 == 0 && !cVar6.f4931e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i50) / 2;
                        }
                        z10 = true;
                    } else if (cVar6.f4927a) {
                        cVar6.f4929c = i50;
                        cVar6.f4932f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i50) / 2;
                        z10 = true;
                    } else {
                        if (i51 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i50 / 2;
                        }
                        if (i51 != i13 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i50 / 2;
                        }
                    }
                }
            }
        }
        if (z10) {
            int i52 = 0;
            while (i52 < i13) {
                View childAt4 = getChildAt(i52);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f4932f) {
                    i16 = i47;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f4928b * i25) + cVar7.f4929c, 1073741824), i16);
                } else {
                    i16 = i47;
                }
                i52++;
                i47 = i16;
            }
        }
        if (i11 != 1073741824) {
            i15 = i34;
            i14 = i12;
        } else {
            i14 = i35;
            i15 = i34;
        }
        setMeasuredDimension(i15, i14);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f4920t.f4898r = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f4915A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4920t;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f4890j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f4892l = true;
            actionMenuPresenter.f4891k = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f4919s = z10;
    }

    public void setPopupTheme(int i) {
        if (this.f4918r != i) {
            this.f4918r = i;
            if (i == 0) {
                this.f4917q = getContext();
            } else {
                this.f4917q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f4920t = actionMenuPresenter;
        actionMenuPresenter.f4695h = this;
        this.f4916p = actionMenuPresenter.f4690c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(f fVar, boolean z10) {
        }
    }
}

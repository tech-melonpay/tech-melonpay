package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.luminary.mobile.R;
import g.C0756a;
import h.AbstractC0774a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import m.C1012n;
import m.C1023z;
import m.InterfaceC0995E;
import m.P;
import m.Z;
import m.a0;
import m.c0;
import m.e0;
import y0.C1596C;
import y0.C1605i;
import y0.InterfaceC1604h;
import y0.InterfaceC1606j;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1604h {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f5045A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5046B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5047C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList<View> f5048D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList<View> f5049E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f5050F;

    /* renamed from: G, reason: collision with root package name */
    public final C1605i f5051G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList<MenuItem> f5052H;

    /* renamed from: I, reason: collision with root package name */
    public h f5053I;

    /* renamed from: J, reason: collision with root package name */
    public final a f5054J;

    /* renamed from: K, reason: collision with root package name */
    public androidx.appcompat.widget.c f5055K;

    /* renamed from: L, reason: collision with root package name */
    public ActionMenuPresenter f5056L;

    /* renamed from: M, reason: collision with root package name */
    public f f5057M;

    /* renamed from: N, reason: collision with root package name */
    public j.a f5058N;

    /* renamed from: O, reason: collision with root package name */
    public f.a f5059O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5060P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedCallback f5061Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final b T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f5062a;

    /* renamed from: b, reason: collision with root package name */
    public C1023z f5063b;

    /* renamed from: c, reason: collision with root package name */
    public C1023z f5064c;

    /* renamed from: d, reason: collision with root package name */
    public C1012n f5065d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f5066e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f5067f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f5068g;

    /* renamed from: h, reason: collision with root package name */
    public C1012n f5069h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f5070j;

    /* renamed from: k, reason: collision with root package name */
    public int f5071k;

    /* renamed from: l, reason: collision with root package name */
    public int f5072l;

    /* renamed from: m, reason: collision with root package name */
    public int f5073m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5074n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5075o;

    /* renamed from: p, reason: collision with root package name */
    public int f5076p;

    /* renamed from: q, reason: collision with root package name */
    public int f5077q;

    /* renamed from: r, reason: collision with root package name */
    public int f5078r;

    /* renamed from: s, reason: collision with root package name */
    public int f5079s;

    /* renamed from: t, reason: collision with root package name */
    public P f5080t;

    /* renamed from: u, reason: collision with root package name */
    public int f5081u;

    /* renamed from: v, reason: collision with root package name */
    public int f5082v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5083w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f5084x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f5085y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f5086z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f5087c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5088d;

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
            this.f5087c = parcel.readInt();
            this.f5088d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5087c);
            parcel.writeInt(this.f5088d ? 1 : 0);
        }
    }

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.u();
        }
    }

    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.f5059O;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.f5062a.f4920t;
            if (actionMenuPresenter == null || !actionMenuPresenter.j()) {
                Iterator<InterfaceC1606j> it = toolbar.f5051G.f31078b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            f.a aVar = toolbar.f5059O;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.f5057M;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f5094b;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new L2.d(runnable, 3);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static class g extends AbstractC0774a.C0401a {

        /* renamed from: b, reason: collision with root package name */
        public int f5096b;
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.f(getContext());
    }

    public static g h() {
        g gVar = new g(-2, -2);
        gVar.f5096b = 0;
        gVar.f20846a = 8388627;
        return gVar;
    }

    public static g i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.f5096b = 0;
            gVar2.f5096b = gVar.f5096b;
            return gVar2;
        }
        if (layoutParams instanceof AbstractC0774a.C0401a) {
            g gVar3 = new g((AbstractC0774a.C0401a) layoutParams);
            gVar3.f5096b = 0;
            return gVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g gVar4 = new g(layoutParams);
            gVar4.f5096b = 0;
            return gVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g gVar5 = new g(marginLayoutParams);
        gVar5.f5096b = 0;
        ((ViewGroup.MarginLayoutParams) gVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return gVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f5096b == 0 && t(childAt)) {
                    int i10 = gVar.f20846a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt2 = getChildAt(i11);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f5096b == 0 && t(childAt2)) {
                int i12 = gVar2.f20846a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i12, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // y0.InterfaceC1604h
    public final void addMenuProvider(InterfaceC1606j interfaceC1606j) {
        C1605i c1605i = this.f5051G;
        c1605i.f31078b.add(interfaceC1606j);
        c1605i.f31077a.run();
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g h9 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (g) layoutParams;
        h9.f5096b = 1;
        if (!z10 || this.i == null) {
            addView(view, h9);
        } else {
            view.setLayoutParams(h9);
            this.f5049E.add(view);
        }
    }

    public final void c() {
        if (this.f5069h == null) {
            C1012n c1012n = new C1012n(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f5069h = c1012n;
            c1012n.setImageDrawable(this.f5067f);
            this.f5069h.setContentDescription(this.f5068g);
            g h9 = h();
            h9.f20846a = (this.f5074n & 112) | 8388611;
            h9.f5096b = 2;
            this.f5069h.setLayoutParams(h9);
            this.f5069h.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.f5080t == null) {
            P p10 = new P();
            p10.f23686a = 0;
            p10.f23687b = 0;
            p10.f23688c = Integer.MIN_VALUE;
            p10.f23689d = Integer.MIN_VALUE;
            p10.f23690e = 0;
            p10.f23691f = 0;
            p10.f23692g = false;
            p10.f23693h = false;
            this.f5080t = p10;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f5062a;
        if (actionMenuView.f4916p == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f5057M == null) {
                this.f5057M = new f();
            }
            this.f5062a.setExpandedActionViewsExclusive(true);
            fVar.b(this.f5057M, this.f5070j);
            v();
        }
    }

    public final void f() {
        if (this.f5062a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f5062a = actionMenuView;
            actionMenuView.setPopupTheme(this.f5071k);
            this.f5062a.setOnMenuItemClickListener(this.f5054J);
            ActionMenuView actionMenuView2 = this.f5062a;
            j.a aVar = this.f5058N;
            c cVar = new c();
            actionMenuView2.f4921u = aVar;
            actionMenuView2.f4922v = cVar;
            g h9 = h();
            h9.f20846a = (this.f5074n & 112) | 8388613;
            this.f5062a.setLayoutParams(h9);
            b(this.f5062a, false);
        }
    }

    public final void g() {
        if (this.f5065d == null) {
            this.f5065d = new C1012n(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g h9 = h();
            h9.f20846a = (this.f5074n & 112) | 8388611;
            this.f5065d.setLayoutParams(h9);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1012n c1012n = this.f5069h;
        if (c1012n != null) {
            return c1012n.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1012n c1012n = this.f5069h;
        if (c1012n != null) {
            return c1012n.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P p10 = this.f5080t;
        if (p10 != null) {
            return p10.f23692g ? p10.f23686a : p10.f23687b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f5082v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P p10 = this.f5080t;
        if (p10 != null) {
            return p10.f23686a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P p10 = this.f5080t;
        if (p10 != null) {
            return p10.f23687b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P p10 = this.f5080t;
        if (p10 != null) {
            return p10.f23692g ? p10.f23687b : p10.f23686a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f5081u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f5062a;
        return (actionMenuView == null || (fVar = actionMenuView.f4916p) == null || !fVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f5082v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5081u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f5066e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f5066e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f5062a.getMenu();
    }

    public View getNavButtonView() {
        return this.f5065d;
    }

    public CharSequence getNavigationContentDescription() {
        C1012n c1012n = this.f5065d;
        if (c1012n != null) {
            return c1012n.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1012n c1012n = this.f5065d;
        if (c1012n != null) {
            return c1012n.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f5056L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f5062a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f5070j;
    }

    public int getPopupTheme() {
        return this.f5071k;
    }

    public CharSequence getSubtitle() {
        return this.f5085y;
    }

    public final TextView getSubtitleTextView() {
        return this.f5064c;
    }

    public CharSequence getTitle() {
        return this.f5084x;
    }

    public int getTitleMarginBottom() {
        return this.f5079s;
    }

    public int getTitleMarginEnd() {
        return this.f5077q;
    }

    public int getTitleMarginStart() {
        return this.f5076p;
    }

    public int getTitleMarginTop() {
        return this.f5078r;
    }

    public final TextView getTitleTextView() {
        return this.f5063b;
    }

    public InterfaceC0995E getWrapper() {
        if (this.f5055K == null) {
            this.f5055K = new androidx.appcompat.widget.c(this, true);
        }
        return this.f5055K;
    }

    public final int j(int i, View view) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i10 = gVar.f20846a & 112;
        if (i10 != 16 && i10 != 48 && i10 != 80) {
            i10 = this.f5083w & 112;
        }
        if (i10 == 48) {
            return getPaddingTop() - i9;
        }
        if (i10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i11 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i11 < i12) {
            i11 = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - i11) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                i11 = Math.max(0, i11 - (i14 - i13));
            }
        }
        return paddingTop + i11;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator<MenuItem> it = this.f5052H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC1606j> it2 = this.f5051G.f31078b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5052H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f5049E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5047C = false;
        }
        if (!this.f5047C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f5047C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5047C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3 A[LOOP:2: B:48:0x02d1->B:49:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i9) {
        char c2;
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = e0.f23753a;
        int i17 = 0;
        if (getLayoutDirection() == 1) {
            c10 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c10 = 0;
        }
        if (t(this.f5065d)) {
            s(this.f5065d, i, 0, i9, this.f5075o);
            i10 = k(this.f5065d) + this.f5065d.getMeasuredWidth();
            i11 = Math.max(0, l(this.f5065d) + this.f5065d.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f5065d.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (t(this.f5069h)) {
            s(this.f5069h, i, 0, i9, this.f5075o);
            i10 = k(this.f5069h) + this.f5069h.getMeasuredWidth();
            i11 = Math.max(i11, l(this.f5069h) + this.f5069h.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f5069h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i10);
        int max2 = Math.max(0, currentContentInsetStart - i10);
        int[] iArr = this.f5050F;
        iArr[c10] = max2;
        if (t(this.f5062a)) {
            s(this.f5062a, i, max, i9, this.f5075o);
            i13 = k(this.f5062a) + this.f5062a.getMeasuredWidth();
            i11 = Math.max(i11, l(this.f5062a) + this.f5062a.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f5062a.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i13);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i13);
        if (t(this.i)) {
            max3 += r(this.i, i, max3, i9, 0, iArr);
            i11 = Math.max(i11, l(this.i) + this.i.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.i.getMeasuredState());
        }
        if (t(this.f5066e)) {
            max3 += r(this.f5066e, i, max3, i9, 0, iArr);
            i11 = Math.max(i11, l(this.f5066e) + this.f5066e.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f5066e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((g) childAt.getLayoutParams()).f5096b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i9, 0, iArr);
                i11 = Math.max(i11, l(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i19 = this.f5078r + this.f5079s;
        int i20 = this.f5076p + this.f5077q;
        if (t(this.f5063b)) {
            r(this.f5063b, i, max3 + i20, i9, i19, iArr);
            int k3 = k(this.f5063b) + this.f5063b.getMeasuredWidth();
            i14 = l(this.f5063b) + this.f5063b.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i12, this.f5063b.getMeasuredState());
            i16 = k3;
        } else {
            i14 = 0;
            i15 = i12;
            i16 = 0;
        }
        if (t(this.f5064c)) {
            i16 = Math.max(i16, r(this.f5064c, i, max3 + i20, i9, i14 + i19, iArr));
            i14 = l(this.f5064c) + this.f5064c.getMeasuredHeight() + i14;
            i15 = View.combineMeasuredStates(i15, this.f5064c.getMeasuredState());
        }
        int max4 = Math.max(i11, i14);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i16, getSuggestedMinimumWidth()), i, (-16777216) & i15);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i9, i15 << 16);
        if (this.f5060P) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        ActionMenuView actionMenuView = this.f5062a;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.f4916p : null;
        int i = savedState.f5087c;
        if (i != 0 && this.f5057M != null && fVar != null && (findItem = fVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f5088d) {
            b bVar = this.T;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        P p10 = this.f5080t;
        boolean z10 = i == 1;
        if (z10 == p10.f23692g) {
            return;
        }
        p10.f23692g = z10;
        if (!p10.f23693h) {
            p10.f23686a = p10.f23690e;
            p10.f23687b = p10.f23691f;
            return;
        }
        if (z10) {
            int i9 = p10.f23689d;
            if (i9 == Integer.MIN_VALUE) {
                i9 = p10.f23690e;
            }
            p10.f23686a = i9;
            int i10 = p10.f23688c;
            if (i10 == Integer.MIN_VALUE) {
                i10 = p10.f23691f;
            }
            p10.f23687b = i10;
            return;
        }
        int i11 = p10.f23688c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = p10.f23690e;
        }
        p10.f23686a = i11;
        int i12 = p10.f23689d;
        if (i12 == Integer.MIN_VALUE) {
            i12 = p10.f23691f;
        }
        p10.f23687b = i12;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ActionMenuPresenter actionMenuPresenter;
        androidx.appcompat.view.menu.h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f5057M;
        if (fVar != null && (hVar = fVar.f5094b) != null) {
            savedState.f5087c = hVar.f4775a;
        }
        ActionMenuView actionMenuView = this.f5062a;
        savedState.f5088d = (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || !actionMenuPresenter.j()) ? false : true;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5046B = false;
        }
        if (!this.f5046B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f5046B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5046B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i9, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i10) + i;
        iArr[0] = Math.max(0, -i10);
        int j10 = j(i9, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j10, max + measuredWidth, view.getMeasuredHeight() + j10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int q(View view, int i, int i9, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int j10 = j(i9, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j10, max, view.getMeasuredHeight() + j10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int r(View view, int i, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i13) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // y0.InterfaceC1604h
    public final void removeMenuProvider(InterfaceC1606j interfaceC1606j) {
        C1605i c1605i = this.f5051G;
        c1605i.f31078b.remove(interfaceC1606j);
        if (((C1605i.a) c1605i.f31079c.remove(interfaceC1606j)) != null) {
            throw null;
        }
        c1605i.f31077a.run();
    }

    public final void s(View view, int i, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(U4.b.j(getContext(), i));
    }

    public void setCollapsible(boolean z10) {
        this.f5060P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5082v) {
            this.f5082v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5081u) {
            this.f5081u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(U4.b.j(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(U4.b.j(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f5065d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f5053I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f5062a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f5071k != i) {
            this.f5071k = i;
            if (i == 0) {
                this.f5070j = getContext();
            } else {
                this.f5070j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f5079s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f5077q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f5076p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f5078r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5062a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || !actionMenuPresenter.n()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.f5057M;
            boolean z10 = (fVar == null || fVar.f5094b == null || a10 == null || !isAttachedToWindow() || !this.S) ? false : true;
            if (z10 && this.R == null) {
                if (this.f5061Q == null) {
                    this.f5061Q = e.b(new a0(this, 0));
                }
                e.c(a10, this.f5061Q);
                this.R = a10;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f5061Q);
            this.R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5083w = 8388627;
        this.f5048D = new ArrayList<>();
        this.f5049E = new ArrayList<>();
        this.f5050F = new int[2];
        this.f5051G = new C1605i(new a0(this, 1));
        this.f5052H = new ArrayList<>();
        this.f5054J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = C0756a.f20751x;
        Z f10 = Z.f(context2, attributeSet, iArr, i, 0);
        C1596C.n(this, context, iArr, attributeSet, f10.f23728b, i);
        TypedArray typedArray = f10.f23728b;
        this.f5072l = typedArray.getResourceId(28, 0);
        this.f5073m = typedArray.getResourceId(19, 0);
        this.f5083w = typedArray.getInteger(0, 8388627);
        this.f5074n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f5079s = dimensionPixelOffset;
        this.f5078r = dimensionPixelOffset;
        this.f5077q = dimensionPixelOffset;
        this.f5076p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f5076p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f5077q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f5078r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f5079s = dimensionPixelOffset5;
        }
        this.f5075o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P p10 = this.f5080t;
        p10.f23693h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p10.f23690e = dimensionPixelSize;
            p10.f23686a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p10.f23691f = dimensionPixelSize2;
            p10.f23687b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p10.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f5081u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f5082v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f5067f = f10.b(4);
        this.f5068g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f5070j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable b9 = f10.b(16);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable b10 = f10.b(11);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(f10.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(f10.a(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        f10.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f20846a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20730b);
        gVar.f20846a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        gVar.f5096b = 0;
        return gVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1012n c1012n = this.f5069h;
        if (c1012n != null) {
            c1012n.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f5069h.setImageDrawable(drawable);
        } else {
            C1012n c1012n = this.f5069h;
            if (c1012n != null) {
                c1012n.setImageDrawable(this.f5067f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5066e == null) {
                this.f5066e = new AppCompatImageView(getContext());
            }
            if (!o(this.f5066e)) {
                b(this.f5066e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f5066e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f5066e);
                this.f5049E.remove(this.f5066e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f5066e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5066e == null) {
            this.f5066e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f5066e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1012n c1012n = this.f5065d;
        if (c1012n != null) {
            c1012n.setContentDescription(charSequence);
            c0.a(this.f5065d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f5065d)) {
                b(this.f5065d, true);
            }
        } else {
            C1012n c1012n = this.f5065d;
            if (c1012n != null && o(c1012n)) {
                removeView(this.f5065d);
                this.f5049E.remove(this.f5065d);
            }
        }
        C1012n c1012n2 = this.f5065d;
        if (c1012n2 != null) {
            c1012n2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1023z c1023z = this.f5064c;
            if (c1023z != null && o(c1023z)) {
                removeView(this.f5064c);
                this.f5049E.remove(this.f5064c);
            }
        } else {
            if (this.f5064c == null) {
                Context context = getContext();
                C1023z c1023z2 = new C1023z(context);
                this.f5064c = c1023z2;
                c1023z2.setSingleLine();
                this.f5064c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5073m;
                if (i != 0) {
                    this.f5064c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f5045A;
                if (colorStateList != null) {
                    this.f5064c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f5064c)) {
                b(this.f5064c, true);
            }
        }
        C1023z c1023z3 = this.f5064c;
        if (c1023z3 != null) {
            c1023z3.setText(charSequence);
        }
        this.f5085y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f5045A = colorStateList;
        C1023z c1023z = this.f5064c;
        if (c1023z != null) {
            c1023z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1023z c1023z = this.f5063b;
            if (c1023z != null && o(c1023z)) {
                removeView(this.f5063b);
                this.f5049E.remove(this.f5063b);
            }
        } else {
            if (this.f5063b == null) {
                Context context = getContext();
                C1023z c1023z2 = new C1023z(context);
                this.f5063b = c1023z2;
                c1023z2.setSingleLine();
                this.f5063b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5072l;
                if (i != 0) {
                    this.f5063b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f5086z;
                if (colorStateList != null) {
                    this.f5063b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f5063b)) {
                b(this.f5063b, true);
            }
        }
        C1023z c1023z3 = this.f5063b;
        if (c1023z3 != null) {
            c1023z3.setText(charSequence);
        }
        this.f5084x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f5086z = colorStateList;
        C1023z c1023z = this.f5063b;
        if (c1023z != null) {
            c1023z.setTextColor(colorStateList);
        }
    }

    public class f implements j {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f5093a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f5094b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void d(boolean z10) {
            if (this.f5094b != null) {
                androidx.appcompat.view.menu.f fVar = this.f5093a;
                if (fVar != null) {
                    int size = fVar.f4751f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f5093a.getItem(i) == this.f5094b) {
                            return;
                        }
                    }
                }
                g(this.f5094b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.i;
            if (callback instanceof k.b) {
                ((k.b) callback).e();
            }
            toolbar.removeView(toolbar.i);
            toolbar.removeView(toolbar.f5069h);
            toolbar.i = null;
            ArrayList<View> arrayList = toolbar.f5049E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.f5094b = null;
            toolbar.requestLayout();
            hVar.f4774C = false;
            hVar.f4787n.p(false);
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f5093a;
            if (fVar2 != null && (hVar = this.f5094b) != null) {
                fVar2.d(hVar);
            }
            this.f5093a = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable l() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f5069h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f5069h);
                }
                toolbar.addView(toolbar.f5069h);
            }
            View actionView = hVar.getActionView();
            toolbar.i = actionView;
            this.f5094b = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.i);
                }
                g h9 = Toolbar.h();
                h9.f20846a = (toolbar.f5074n & 112) | 8388611;
                h9.f5096b = 2;
                toolbar.i.setLayoutParams(h9);
                toolbar.addView(toolbar.i);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f5096b != 2 && childAt != toolbar.f5062a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f5049E.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.f4774C = true;
            hVar.f4787n.p(false);
            KeyEvent.Callback callback = toolbar.i;
            if (callback instanceof k.b) {
                ((k.b) callback).c();
            }
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }
    }
}

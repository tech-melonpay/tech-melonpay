package M2;

import J2.g;
import T2.i;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.navigation.NavigationBarPresenter;
import java.util.HashSet;
import java.util.WeakHashMap;
import k0.C0913a;
import k1.C0921b;
import u2.C1512a;
import x0.e;
import y0.C1596C;
import y0.E;
import y2.C1611a;
import z0.C1638d;

/* compiled from: NavigationBarMenuView.java */
/* loaded from: classes.dex */
public abstract class d extends ViewGroup implements k {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f2568F = {R.attr.state_checked};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2569G = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public i f2570A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2571B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2572C;

    /* renamed from: D, reason: collision with root package name */
    public NavigationBarPresenter f2573D;

    /* renamed from: E, reason: collision with root package name */
    public f f2574E;

    /* renamed from: a, reason: collision with root package name */
    public final C0921b f2575a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2576b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2577c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f2578d;

    /* renamed from: e, reason: collision with root package name */
    public int f2579e;

    /* renamed from: f, reason: collision with root package name */
    public M2.a[] f2580f;

    /* renamed from: g, reason: collision with root package name */
    public int f2581g;

    /* renamed from: h, reason: collision with root package name */
    public int f2582h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public int f2583j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2584k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f2585l;

    /* renamed from: m, reason: collision with root package name */
    public int f2586m;

    /* renamed from: n, reason: collision with root package name */
    public int f2587n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2588o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2589p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f2590q;

    /* renamed from: r, reason: collision with root package name */
    public int f2591r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray<com.google.android.material.badge.a> f2592s;

    /* renamed from: t, reason: collision with root package name */
    public int f2593t;

    /* renamed from: u, reason: collision with root package name */
    public int f2594u;

    /* renamed from: v, reason: collision with root package name */
    public int f2595v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2596w;

    /* renamed from: x, reason: collision with root package name */
    public int f2597x;

    /* renamed from: y, reason: collision with root package name */
    public int f2598y;

    /* renamed from: z, reason: collision with root package name */
    public int f2599z;

    /* compiled from: NavigationBarMenuView.java */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f2600a;

        public a(y2.b bVar) {
            this.f2600a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((M2.a) view).getItemData();
            d dVar = this.f2600a;
            if (dVar.f2574E.q(itemData, dVar.f2573D, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public d(Context context) {
        super(context);
        this.f2577c = new e(5);
        this.f2578d = new SparseArray<>(5);
        this.f2581g = 0;
        this.f2582h = 0;
        this.f2592s = new SparseArray<>(5);
        this.f2593t = -1;
        this.f2594u = -1;
        this.f2595v = -1;
        this.f2571B = false;
        this.f2585l = c();
        if (isInEditMode()) {
            this.f2575a = null;
        } else {
            C0921b c0921b = new C0921b();
            this.f2575a = c0921b;
            c0921b.X(0);
            c0921b.L(L2.k.c(getContext(), com.luminary.mobile.R.attr.motionDurationMedium4, getResources().getInteger(com.luminary.mobile.R.integer.material_motion_duration_long_1)));
            c0921b.N(L2.k.d(getContext(), com.luminary.mobile.R.attr.motionEasingStandard, C1512a.f30142b));
            c0921b.T(new g());
        }
        this.f2576b = new a((y2.b) this);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setImportantForAccessibility(1);
    }

    private M2.a getNewItem() {
        M2.a aVar = (M2.a) this.f2577c.acquire();
        return aVar == null ? e(getContext()) : aVar;
    }

    private void setBadgeIfNeeded(M2.a aVar) {
        com.google.android.material.badge.a aVar2;
        int id = aVar.getId();
        if (id == -1 || (aVar2 = this.f2592s.get(id)) == null) {
            return;
        }
        aVar.setBadge(aVar2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        removeAllViews();
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f2577c.release(aVar);
                    if (aVar.f2535F != null) {
                        ImageView imageView = aVar.f2548n;
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            com.google.android.material.badge.a aVar2 = aVar.f2535F;
                            if (aVar2 != null) {
                                if (aVar2.d() != null) {
                                    aVar2.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.f2535F = null;
                    }
                    aVar.f2554t = null;
                    aVar.f2560z = 0.0f;
                    aVar.f2536a = false;
                }
            }
        }
        if (this.f2574E.f4751f.size() == 0) {
            this.f2581g = 0;
            this.f2582h = 0;
            this.f2580f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f2574E.f4751f.size(); i++) {
            hashSet.add(Integer.valueOf(this.f2574E.getItem(i).getItemId()));
        }
        int i9 = 0;
        while (true) {
            SparseArray<com.google.android.material.badge.a> sparseArray = this.f2592s;
            if (i9 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i9);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i9++;
        }
        this.f2580f = new M2.a[this.f2574E.f4751f.size()];
        int i10 = this.f2579e;
        boolean z10 = i10 != -1 ? i10 == 0 : this.f2574E.l().size() > 3;
        for (int i11 = 0; i11 < this.f2574E.f4751f.size(); i11++) {
            this.f2573D.f9686b = true;
            this.f2574E.getItem(i11).setCheckable(true);
            this.f2573D.f9686b = false;
            M2.a newItem = getNewItem();
            this.f2580f[i11] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.f2583j);
            newItem.setTextColor(this.f2585l);
            newItem.setTextAppearanceInactive(this.f2586m);
            newItem.setTextAppearanceActive(this.f2587n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f2588o);
            newItem.setTextColor(this.f2584k);
            int i12 = this.f2593t;
            if (i12 != -1) {
                newItem.setItemPaddingTop(i12);
            }
            int i13 = this.f2594u;
            if (i13 != -1) {
                newItem.setItemPaddingBottom(i13);
            }
            int i14 = this.f2595v;
            if (i14 != -1) {
                newItem.setActiveIndicatorLabelPadding(i14);
            }
            newItem.setActiveIndicatorWidth(this.f2597x);
            newItem.setActiveIndicatorHeight(this.f2598y);
            newItem.setActiveIndicatorMarginHorizontal(this.f2599z);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f2571B);
            newItem.setActiveIndicatorEnabled(this.f2596w);
            Drawable drawable = this.f2589p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f2591r);
            }
            newItem.setItemRippleColor(this.f2590q);
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f2579e);
            h hVar = (h) this.f2574E.getItem(i11);
            newItem.d(hVar);
            newItem.setItemPosition(i11);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f2578d;
            int i15 = hVar.f4775a;
            newItem.setOnTouchListener(sparseArray2.get(i15));
            newItem.setOnClickListener(this.f2576b);
            int i16 = this.f2581g;
            if (i16 != 0 && i15 == i16) {
                this.f2582h = i11;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f2574E.f4751f.size() - 1, this.f2582h);
        this.f2582h = min;
        this.f2574E.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.f2574E = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = C0913a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.luminary.mobile.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f2569G;
        return new ColorStateList(new int[][]{iArr, f2568F, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final T2.f d() {
        if (this.f2570A == null || this.f2572C == null) {
            return null;
        }
        T2.f fVar = new T2.f(this.f2570A);
        fVar.o(this.f2572C);
        return fVar;
    }

    public abstract C1611a e(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f2595v;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f2592s;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f2572C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f2596w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f2598y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f2599z;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f2570A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f2597x;
    }

    public Drawable getItemBackground() {
        M2.a[] aVarArr = this.f2580f;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f2589p : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f2591r;
    }

    public int getItemIconSize() {
        return this.f2583j;
    }

    public int getItemPaddingBottom() {
        return this.f2594u;
    }

    public int getItemPaddingTop() {
        return this.f2593t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f2590q;
    }

    public int getItemTextAppearanceActive() {
        return this.f2587n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f2586m;
    }

    public ColorStateList getItemTextColor() {
        return this.f2584k;
    }

    public int getLabelVisibilityMode() {
        return this.f2579e;
    }

    public f getMenu() {
        return this.f2574E;
    }

    public int getSelectedItemId() {
        return this.f2581g;
    }

    public int getSelectedItemPosition() {
        return this.f2582h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1638d.e.a(1, this.f2574E.l().size(), 1, false).f31233a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f2595v = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f2572C = colorStateList;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f2596w = z10;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f2598y = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f2599z = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f2571B = z10;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f2570A = iVar;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f2597x = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f2589p = drawable;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f2591r = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f2583j = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f2594u = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f2593t = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2590q = colorStateList;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f2587n = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f2584k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f2588o = z10;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f2586m = i;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f2584k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f2584k = colorStateList;
        M2.a[] aVarArr = this.f2580f;
        if (aVarArr != null) {
            for (M2.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f2579e = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f2573D = navigationBarPresenter;
    }
}

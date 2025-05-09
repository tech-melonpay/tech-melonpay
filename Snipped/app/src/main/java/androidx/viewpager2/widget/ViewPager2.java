package androidx.viewpager2.widget;

import C.N;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.c;
import com.google.android.material.card.MaterialCardView;
import p1.C1099a;
import r1.C1148b;
import y0.C1596C;
import z0.C1638d;
import z0.InterfaceC1640f;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8012a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8013b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.viewpager2.widget.a f8014c;

    /* renamed from: d, reason: collision with root package name */
    public int f8015d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8016e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8017f;

    /* renamed from: g, reason: collision with root package name */
    public final d f8018g;

    /* renamed from: h, reason: collision with root package name */
    public int f8019h;
    public Parcelable i;

    /* renamed from: j, reason: collision with root package name */
    public final i f8020j;

    /* renamed from: k, reason: collision with root package name */
    public final h f8021k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.viewpager2.widget.c f8022l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.viewpager2.widget.a f8023m;

    /* renamed from: n, reason: collision with root package name */
    public final N f8024n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.viewpager2.widget.b f8025o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView.k f8026p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8027q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8028r;

    /* renamed from: s, reason: collision with root package name */
    public int f8029s;

    /* renamed from: t, reason: collision with root package name */
    public final f f8030t;

    public class a extends c {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.h
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f8016e = true;
            viewPager2.f8022l.f8059l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeInserted(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeMoved(int i, int i9, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeRemoved(int i, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9, Object obj) {
            onChanged();
        }
    }

    public class d extends LinearLayoutManager {
        public d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(yVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.y yVar, C1638d c1638d) {
            super.onInitializeAccessibilityNodeInfo(uVar, yVar, c1638d);
            ViewPager2.this.f8030t.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.y yVar, View view, C1638d c1638d) {
            ViewPager2 viewPager2 = ViewPager2.this;
            c1638d.j(C1638d.f.a(viewPager2.getOrientation() == 1 ? viewPager2.f8018g.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f8018g.getPosition(view) : 0, 1, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final boolean performAccessibilityAction(RecyclerView.u uVar, RecyclerView.y yVar, int i, Bundle bundle) {
            ViewPager2.this.f8030t.getClass();
            return super.performAccessibilityAction(uVar, yVar, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f8036a = new a();

        /* renamed from: b, reason: collision with root package name */
        public final b f8037b = new b();

        /* renamed from: c, reason: collision with root package name */
        public androidx.viewpager2.widget.f f8038c;

        public class a implements InterfaceC1640f {
            public a() {
            }

            @Override // z0.InterfaceC1640f
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f8028r) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        public class b implements InterfaceC1640f {
            public b() {
            }

            @Override // z0.InterfaceC1640f
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f8028r) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f8038c = new androidx.viewpager2.widget.f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
        }

        public final void b() {
            int itemCount;
            int i = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            C1596C.l(R.id.accessibilityActionPageLeft, viewPager2);
            C1596C.i(0, viewPager2);
            C1596C.l(R.id.accessibilityActionPageRight, viewPager2);
            C1596C.i(0, viewPager2);
            C1596C.l(R.id.accessibilityActionPageUp, viewPager2);
            C1596C.i(0, viewPager2);
            C1596C.l(R.id.accessibilityActionPageDown, viewPager2);
            C1596C.i(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f8028r) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f8037b;
            a aVar = this.f8036a;
            if (orientation != 0) {
                if (viewPager2.f8015d < itemCount - 1) {
                    C1596C.m(viewPager2, new C1638d.a(R.id.accessibilityActionPageDown, (String) null), aVar);
                }
                if (viewPager2.f8015d > 0) {
                    C1596C.m(viewPager2, new C1638d.a(R.id.accessibilityActionPageUp, (String) null), bVar);
                    return;
                }
                return;
            }
            boolean z10 = viewPager2.f8018g.getLayoutDirection() == 1;
            int i9 = z10 ? 16908360 : 16908361;
            if (z10) {
                i = 16908361;
            }
            if (viewPager2.f8015d < itemCount - 1) {
                C1596C.m(viewPager2, new C1638d.a(i9, (String) null), aVar);
            }
            if (viewPager2.f8015d > 0) {
                C1596C.m(viewPager2, new C1638d.a(i, (String) null), bVar);
            }
        }
    }

    public interface g {
    }

    public class h extends I {
        public h() {
        }

        @Override // androidx.recyclerview.widget.I, androidx.recyclerview.widget.M
        public final View d(RecyclerView.n nVar) {
            if (((androidx.viewpager2.widget.c) ViewPager2.this.f8024n.f535b).f8060m) {
                return null;
            }
            return super.d(nVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f8030t.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f8015d);
            accessibilityEvent.setToIndex(viewPager2.f8015d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f8028r && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f8028r && super.onTouchEvent(motionEvent);
        }
    }

    public static class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f8044a;

        /* renamed from: b, reason: collision with root package name */
        public final RecyclerView f8045b;

        public j(int i, i iVar) {
            this.f8044a = i;
            this.f8045b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8045b.smoothScrollToPosition(this.f8044a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8012a = new Rect();
        this.f8013b = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.f8014c = aVar;
        this.f8016e = false;
        this.f8017f = new a();
        this.f8019h = -1;
        this.f8026p = null;
        this.f8027q = false;
        this.f8028r = true;
        this.f8029s = -1;
        this.f8030t = new f();
        i iVar = new i(context);
        this.f8020j = iVar;
        iVar.setId(View.generateViewId());
        this.f8020j.setDescendantFocusability(131072);
        d dVar = new d(context);
        this.f8018g = dVar;
        this.f8020j.setLayoutManager(dVar);
        this.f8020j.setScrollingTouchSlop(1);
        int[] iArr = C1099a.f25586a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1596C.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f8020j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f8020j.addOnChildAttachStateChangeListener(new C1148b());
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f8022l = cVar;
            this.f8024n = new N(cVar, 23);
            h hVar = new h();
            this.f8021k = hVar;
            hVar.a(this.f8020j);
            this.f8020j.addOnScrollListener(this.f8022l);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.f8023m = aVar2;
            this.f8022l.f8049a = aVar2;
            androidx.viewpager2.widget.d dVar2 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.f8023m.f8046b.add(dVar2);
            this.f8023m.f8046b.add(eVar);
            this.f8030t.a(this.f8020j);
            this.f8023m.f8046b.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.f8018g);
            this.f8025o = bVar;
            this.f8023m.f8046b.add(bVar);
            i iVar2 = this.f8020j;
            attachViewToParent(iVar2, 0, iVar2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        RecyclerView.Adapter adapter;
        if (this.f8019h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof q1.h) {
                ((q1.h) adapter).a(parcelable);
            }
            this.i = null;
        }
        int max = Math.max(0, Math.min(this.f8019h, adapter.getItemCount() - 1));
        this.f8015d = max;
        this.f8019h = -1;
        this.f8020j.scrollToPosition(max);
        this.f8030t.b();
    }

    public final void b(int i9) {
        e eVar;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f8019h != -1) {
                this.f8019h = Math.max(i9, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i9, 0), adapter.getItemCount() - 1);
        int i10 = this.f8015d;
        if ((min == i10 && this.f8022l.f8054f == 0) || min == i10) {
            return;
        }
        double d10 = i10;
        this.f8015d = min;
        this.f8030t.b();
        androidx.viewpager2.widget.c cVar = this.f8022l;
        if (cVar.f8054f != 0) {
            cVar.c();
            c.a aVar = cVar.f8055g;
            d10 = aVar.f8061a + aVar.f8062b;
        }
        androidx.viewpager2.widget.c cVar2 = this.f8022l;
        cVar2.getClass();
        cVar2.f8053e = 2;
        cVar2.f8060m = false;
        boolean z10 = cVar2.i != min;
        cVar2.i = min;
        cVar2.a(2);
        if (z10 && (eVar = cVar2.f8049a) != null) {
            eVar.onPageSelected(min);
        }
        double d11 = min;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f8020j.smoothScrollToPosition(min);
            return;
        }
        this.f8020j.scrollToPosition(d11 > d10 ? min - 3 : min + 3);
        i iVar = this.f8020j;
        iVar.post(new j(min, iVar));
    }

    public final void c() {
        h hVar = this.f8021k;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View d10 = hVar.d(this.f8018g);
        if (d10 == null) {
            return;
        }
        int position = this.f8018g.getPosition(d10);
        if (position != this.f8015d && getScrollState() == 0) {
            this.f8023m.onPageSelected(position);
        }
        this.f8016e = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        return this.f8020j.canScrollHorizontally(i9);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i9) {
        return this.f8020j.canScrollVertically(i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i9 = ((SavedState) parcelable).f8031a;
            sparseArray.put(this.f8020j.getId(), sparseArray.get(i9));
            sparseArray.remove(i9);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f8030t.getClass();
        this.f8030t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f8020j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f8015d;
    }

    public int getItemDecorationCount() {
        return this.f8020j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f8029s;
    }

    public int getOrientation() {
        return this.f8018g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f8020j;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f8022l.f8054f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        int i10;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            i9 = 0;
            i10 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i9 = viewPager2.getAdapter().getItemCount();
            i10 = 1;
        } else {
            i10 = viewPager2.getAdapter().getItemCount();
            i9 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1638d.e.a(i9, i10, 0, false).f31233a);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.f8028r) {
            return;
        }
        if (viewPager2.f8015d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f8015d < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredWidth = this.f8020j.getMeasuredWidth();
        int measuredHeight = this.f8020j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f8012a;
        rect.left = paddingLeft;
        rect.right = (i11 - i9) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f8013b;
        Gravity.apply(MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START, measuredWidth, measuredHeight, rect, rect2);
        this.f8020j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f8016e) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        measureChild(this.f8020j, i9, i10);
        int measuredWidth = this.f8020j.getMeasuredWidth();
        int measuredHeight = this.f8020j.getMeasuredHeight();
        int measuredState = this.f8020j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i9, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f8019h = savedState.f8032b;
        this.i = savedState.f8033c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8031a = this.f8020j.getId();
        int i9 = this.f8019h;
        if (i9 == -1) {
            i9 = this.f8015d;
        }
        savedState.f8032b = i9;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            savedState.f8033c = parcelable;
        } else {
            Object adapter = this.f8020j.getAdapter();
            if (adapter instanceof q1.h) {
                savedState.f8033c = ((q1.h) adapter).b();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        this.f8030t.getClass();
        if (i9 != 8192 && i9 != 4096) {
            return super.performAccessibilityAction(i9, bundle);
        }
        f fVar = this.f8030t;
        fVar.getClass();
        if (i9 != 8192 && i9 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i9 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f8028r) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f8020j.getAdapter();
        f fVar = this.f8030t;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(fVar.f8038c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f8017f;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        this.f8020j.setAdapter(adapter);
        this.f8015d = 0;
        a();
        f fVar2 = this.f8030t;
        fVar2.b();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(fVar2.f8038c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i9) {
        if (((androidx.viewpager2.widget.c) this.f8024n.f535b).f8060m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        b(i9);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
        super.setLayoutDirection(i9);
        this.f8030t.b();
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1 && i9 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f8029s = i9;
        this.f8020j.requestLayout();
    }

    public void setOrientation(int i9) {
        this.f8018g.setOrientation(i9);
        this.f8030t.b();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.f8027q) {
                this.f8026p = this.f8020j.getItemAnimator();
                this.f8027q = true;
            }
            this.f8020j.setItemAnimator(null);
        } else if (this.f8027q) {
            this.f8020j.setItemAnimator(this.f8026p);
            this.f8026p = null;
            this.f8027q = false;
        }
        androidx.viewpager2.widget.b bVar = this.f8025o;
        if (gVar == bVar.f8048c) {
            return;
        }
        bVar.f8048c = gVar;
        if (gVar == null) {
            return;
        }
        androidx.viewpager2.widget.c cVar = this.f8022l;
        cVar.c();
        c.a aVar = cVar.f8055g;
        double d10 = aVar.f8061a + aVar.f8062b;
        int i9 = (int) d10;
        float f10 = (float) (d10 - i9);
        this.f8025o.onPageScrolled(i9, f10, Math.round(getPageSize() * f10));
    }

    public void setUserInputEnabled(boolean z10) {
        this.f8028r = z10;
        this.f8030t.b();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f8031a;

        /* renamed from: b, reason: collision with root package name */
        public int f8032b;

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f8033c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8031a);
            parcel.writeInt(this.f8032b);
            parcel.writeParcelable(this.f8033c, i);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.f8031a = parcel.readInt();
                savedState.f8032b = parcel.readInt();
                savedState.f8033c = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.f8031a = parcel.readInt();
                savedState.f8032b = parcel.readInt();
                savedState.f8033c = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    public static abstract class e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrolled(int i, float f10, int i9) {
        }
    }
}

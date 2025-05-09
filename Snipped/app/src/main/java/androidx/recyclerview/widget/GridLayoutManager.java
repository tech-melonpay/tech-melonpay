package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import z0.C1638d;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7413a;

    /* renamed from: b, reason: collision with root package name */
    public int f7414b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f7415c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f7416d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f7417e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f7418f;

    /* renamed from: g, reason: collision with root package name */
    public c f7419g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f7420h;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int getSpanIndex(int i, int i9) {
            return i % i9;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int getSpanSize(int i) {
            return 1;
        }
    }

    public static class b extends RecyclerView.o {

        /* renamed from: e, reason: collision with root package name */
        public int f7421e;

        /* renamed from: f, reason: collision with root package name */
        public int f7422f;

        public b(int i, int i9) {
            super(i, i9);
            this.f7421e = -1;
            this.f7422f = 0;
        }
    }

    public static abstract class c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i9 = 0;
            while (i9 <= size) {
                int i10 = (i9 + size) >>> 1;
                if (sparseIntArray.keyAt(i10) < i) {
                    i9 = i10 + 1;
                } else {
                    size = i10 - 1;
                }
            }
            int i11 = i9 - 1;
            if (i11 < 0 || i11 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i11);
        }

        public int getCachedSpanGroupIndex(int i, int i9) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i9);
            }
            int i10 = this.mSpanGroupIndexCache.get(i, -1);
            if (i10 != -1) {
                return i10;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i9);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i, int i9) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i9);
            }
            int i10 = this.mSpanIndexCache.get(i, -1);
            if (i10 != -1) {
                return i10;
            }
            int spanIndex = getSpanIndex(i, i9);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i, int i9) {
            int i10;
            int i11;
            int i12;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                i11 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i12 = findFirstKeyLessThan + 1;
                i10 = getSpanSize(findFirstKeyLessThan) + getCachedSpanIndex(findFirstKeyLessThan, i9);
                if (i10 == i9) {
                    i11++;
                    i10 = 0;
                }
            }
            int spanSize = getSpanSize(i);
            while (i12 < i) {
                int spanSize2 = getSpanSize(i12);
                i10 += spanSize2;
                if (i10 == i9) {
                    i11++;
                    i10 = 0;
                } else if (i10 > i9) {
                    i11++;
                    i10 = spanSize2;
                }
                i12++;
            }
            return i10 + spanSize > i9 ? i11 + 1 : i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z10;
        }

        public void setSpanIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z10;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.f7413a = false;
        this.f7414b = -1;
        this.f7417e = new SparseIntArray();
        this.f7418f = new SparseIntArray();
        this.f7419g = new a();
        this.f7420h = new Rect();
        h(RecyclerView.n.getProperties(context, attributeSet, i, i9).f7503b);
    }

    public final void a(int i) {
        int i9;
        int[] iArr = this.f7415c;
        int i10 = this.f7414b;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i10 + 1];
        }
        int i11 = 0;
        iArr[0] = 0;
        int i12 = i / i10;
        int i13 = i % i10;
        int i14 = 0;
        for (int i15 = 1; i15 <= i10; i15++) {
            i11 += i13;
            if (i11 <= 0 || i10 - i11 >= i13) {
                i9 = i12;
            } else {
                i9 = i12 + 1;
                i11 -= i10;
            }
            i14 += i9;
            iArr[i15] = i14;
        }
        this.f7415c = iArr;
    }

    public final void b() {
        View[] viewArr = this.f7416d;
        if (viewArr == null || viewArr.length != this.f7414b) {
            this.f7416d = new View[this.f7414b];
        }
    }

    public final int c(int i, int i9) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f7415c;
            return iArr[i9 + i] - iArr[i];
        }
        int[] iArr2 = this.f7415c;
        int i10 = this.f7414b;
        return iArr2[i10 - i] - iArr2[(i10 - i) - i9];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.n.c cVar2) {
        int i;
        int i9 = this.f7414b;
        for (int i10 = 0; i10 < this.f7414b && (i = cVar.f7449d) >= 0 && i < yVar.b() && i9 > 0; i10++) {
            int i11 = cVar.f7449d;
            ((t.b) cVar2).a(i11, Math.max(0, cVar.f7452g));
            i9 -= this.f7419g.getSpanSize(i11);
            cVar.f7449d += cVar.f7450e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return super.computeHorizontalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return super.computeHorizontalScrollRange(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return super.computeVerticalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        return super.computeVerticalScrollRange(yVar);
    }

    public final int d(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (!yVar.f7544g) {
            return this.f7419g.getCachedSpanGroupIndex(i, this.f7414b);
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.f7419g.getCachedSpanGroupIndex(c2, this.f7414b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int e(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (!yVar.f7544g) {
            return this.f7419g.getCachedSpanIndex(i, this.f7414b);
        }
        int i9 = this.f7418f.get(i, -1);
        if (i9 != -1) {
            return i9;
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.f7419g.getCachedSpanIndex(c2, this.f7414b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int f(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (!yVar.f7544g) {
            return this.f7419g.getSpanSize(i);
        }
        int i9 = this.f7417e.get(i, -1);
        if (i9 != -1) {
            return i9;
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.f7419g.getSpanSize(c2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i;
        int i9;
        int childCount = getChildCount();
        int i10 = 1;
        if (z11) {
            i9 = getChildCount() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = childCount;
            i9 = 0;
        }
        int b9 = yVar.b();
        ensureLayoutState();
        int k3 = this.mOrientationHelper.k();
        int g10 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i9 != i) {
            View childAt = getChildAt(i9);
            int position = getPosition(childAt);
            if (position >= 0 && position < b9 && e(position, uVar, yVar) == 0) {
                if (((RecyclerView.o) childAt.getLayoutParams()).f7506a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < g10 && this.mOrientationHelper.b(childAt) >= k3) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i9 += i10;
        }
        return view != null ? view : view2;
    }

    public final void g(View view, int i, boolean z10) {
        int i9;
        int i10;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f7507b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int c2 = c(bVar.f7421e, bVar.f7422f);
        if (this.mOrientation == 1) {
            i10 = RecyclerView.n.getChildMeasureSpec(c2, i, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i9 = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.n.getChildMeasureSpec(c2, i, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i9 = childMeasureSpec;
            i10 = childMeasureSpec2;
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z10 ? shouldReMeasureChild(view, i10, i9, oVar) : shouldMeasureChild(view, i10, i9, oVar)) {
            view.measure(i10, i9);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f7421e = -1;
        bVar.f7422f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int getColumnCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return this.f7414b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return d(yVar.b() - 1, uVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int getRowCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return this.f7414b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return d(yVar.b() - 1, uVar, yVar) + 1;
    }

    public final void h(int i) {
        if (i == this.f7414b) {
            return;
        }
        this.f7413a = true;
        if (i < 1) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Span count should be at least 1. Provided "));
        }
        this.f7414b = i;
        this.f7419g.invalidateSpanIndexCache();
        requestLayout();
    }

    public final void i() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        a(height - paddingTop);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r21.f7443b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void layoutChunk(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.y r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        super.onAnchorReady(uVar, yVar, aVar, i);
        i();
        if (yVar.b() > 0 && !yVar.f7544g) {
            boolean z10 = i == 1;
            int e10 = e(aVar.f7438b, uVar, yVar);
            if (z10) {
                while (e10 > 0) {
                    int i9 = aVar.f7438b;
                    if (i9 <= 0) {
                        break;
                    }
                    int i10 = i9 - 1;
                    aVar.f7438b = i10;
                    e10 = e(i10, uVar, yVar);
                }
            } else {
                int b9 = yVar.b() - 1;
                int i11 = aVar.f7438b;
                while (i11 < b9) {
                    int i12 = i11 + 1;
                    int e11 = e(i12, uVar, yVar);
                    if (e11 <= e10) {
                        break;
                    }
                    i11 = i12;
                    e10 = e11;
                }
                aVar.f7438b = i11;
            }
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == (r2 > r7)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.y r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.y yVar, C1638d c1638d) {
        super.onInitializeAccessibilityNodeInfo(uVar, yVar, c1638d);
        c1638d.h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.y yVar, View view, C1638d c1638d) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1638d);
            return;
        }
        b bVar = (b) layoutParams;
        int d10 = d(bVar.f7506a.getLayoutPosition(), uVar, yVar);
        if (this.mOrientation == 0) {
            c1638d.j(C1638d.f.a(bVar.f7421e, bVar.f7422f, d10, 1, false));
        } else {
            c1638d.j(C1638d.f.a(d10, 1, bVar.f7421e, bVar.f7422f, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i9) {
        this.f7419g.invalidateSpanIndexCache();
        this.f7419g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f7419g.invalidateSpanIndexCache();
        this.f7419g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i9, int i10) {
        this.f7419g.invalidateSpanIndexCache();
        this.f7419g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i9) {
        this.f7419g.invalidateSpanIndexCache();
        this.f7419g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i9, Object obj) {
        this.f7419g.invalidateSpanIndexCache();
        this.f7419g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f7544g;
        SparseIntArray sparseIntArray = this.f7418f;
        SparseIntArray sparseIntArray2 = this.f7417e;
        if (z10) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                b bVar = (b) getChildAt(i).getLayoutParams();
                int layoutPosition = bVar.f7506a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.f7422f);
                sparseIntArray.put(layoutPosition, bVar.f7421e);
            }
        }
        super.onLayoutChildren(uVar, yVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.f7413a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        i();
        b();
        return super.scrollHorizontallyBy(i, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        i();
        b();
        return super.scrollVerticallyBy(i, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void setMeasuredDimension(Rect rect, int i, int i9) {
        int chooseSize;
        int chooseSize2;
        if (this.f7415c == null) {
            super.setMeasuredDimension(rect, i, i9);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.n.chooseSize(i9, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f7415c;
            chooseSize = RecyclerView.n.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.n.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f7415c;
            chooseSize2 = RecyclerView.n.chooseSize(i9, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f7413a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f7421e = -1;
            bVar.f7422f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f7421e = -1;
        bVar2.f7422f = 0;
        return bVar2;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f7413a = false;
        this.f7414b = -1;
        this.f7417e = new SparseIntArray();
        this.f7418f = new SparseIntArray();
        this.f7419g = new a();
        this.f7420h = new Rect();
        h(i);
    }

    public GridLayoutManager(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f7413a = false;
        this.f7414b = -1;
        this.f7417e = new SparseIntArray();
        this.f7418f = new SparseIntArray();
        this.f7419g = new a();
        this.f7420h = new Rect();
        h(i);
    }
}

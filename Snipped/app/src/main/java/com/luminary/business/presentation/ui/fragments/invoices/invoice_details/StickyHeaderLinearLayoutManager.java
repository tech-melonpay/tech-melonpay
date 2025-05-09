package com.luminary.business.presentation.ui.fragments.invoices.invoice_details;

import C.v;
import O9.p;
import P9.q;
import P9.s;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import java.io.PrintStream;
import java.util.ArrayList;
import kotlin.jvm.internal.f;
import s3.b;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
/* loaded from: classes2.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public BaseEpoxyAdapter f12313a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12314b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12315c;

    /* renamed from: d, reason: collision with root package name */
    public View f12316d;

    /* renamed from: e, reason: collision with root package name */
    public int f12317e;

    /* renamed from: f, reason: collision with root package name */
    public int f12318f;

    /* renamed from: g, reason: collision with root package name */
    public int f12319g;

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Parcelable f12320a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12321b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12322c;

        /* compiled from: StickyHeaderLinearLayoutManager.kt */
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i9) {
            this.f12320a = parcelable;
            this.f12321b = i;
            this.f12322c = i9;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return f.b(this.f12320a, savedState.f12320a) && this.f12321b == savedState.f12321b && this.f12322c == savedState.f12322c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12322c) + v.b(this.f12321b, this.f12320a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState(superState=");
            sb2.append(this.f12320a);
            sb2.append(", scrollPosition=");
            sb2.append(this.f12321b);
            sb2.append(", scrollOffset=");
            return b.m(sb2, this.f12322c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f12320a, i);
            parcel.writeInt(this.f12321b);
            parcel.writeInt(this.f12322c);
        }
    }

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    public final class a extends RecyclerView.h {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onChanged() {
            ArrayList arrayList;
            System.out.println((Object) "!!!!!!!!!!! onChanged");
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            stickyHeaderLinearLayoutManager.f12314b.clear();
            BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.f12313a;
            int i = 0;
            int itemCount = baseEpoxyAdapter != null ? baseEpoxyAdapter.getItemCount() : 0;
            while (true) {
                arrayList = stickyHeaderLinearLayoutManager.f12314b;
                if (i >= itemCount) {
                    break;
                }
                BaseEpoxyAdapter baseEpoxyAdapter2 = stickyHeaderLinearLayoutManager.f12313a;
                if (baseEpoxyAdapter2 != null && baseEpoxyAdapter2.isStickyHeader(i)) {
                    arrayList.add(Integer.valueOf(i));
                }
                i++;
            }
            if (stickyHeaderLinearLayoutManager.f12316d == null || arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.f12317e))) {
                return;
            }
            stickyHeaderLinearLayoutManager.scrapStickyHeader(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9) {
            ArrayList arrayList;
            System.out.println((Object) v.k(i, i9, "!!!!!!!!!!! onItemRangeChanged: positionStart = ", " itemCount = "));
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.f12313a;
            if (baseEpoxyAdapter == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                arrayList = stickyHeaderLinearLayoutManager.f12314b;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i + i10;
                if (i11 >= 0) {
                    arrayList.remove(Integer.valueOf(i11));
                    if (baseEpoxyAdapter.isStickyHeader(i11)) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                i10++;
            }
            q.C(arrayList);
            if (stickyHeaderLinearLayoutManager.f12316d == null || arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.f12317e))) {
                return;
            }
            stickyHeaderLinearLayoutManager.scrapStickyHeader(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeInserted(int i, int i9) {
            System.out.println((Object) v.k(i, i9, "!!!!!!!!!!! onItemRangeInserted: positionStart = ", " itemCount = "));
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.f12313a;
            if (baseEpoxyAdapter == null) {
                return;
            }
            int itemCount = baseEpoxyAdapter.getItemCount();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = stickyHeaderLinearLayoutManager.f12314b;
                if (i10 >= itemCount) {
                    q.C(arrayList);
                    return;
                } else {
                    if (baseEpoxyAdapter.isStickyHeader(i10)) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                    i10++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeMoved(int i, int i9, int i10) {
            StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "!!!!!!!!!!! onItemRangeMoved: fromPosition = ", " toPosition = ", " itemCount = ");
            q10.append(i10);
            String sb2 = q10.toString();
            PrintStream printStream = System.out;
            printStream.println((Object) sb2);
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            if (stickyHeaderLinearLayoutManager.f12313a == null) {
                return;
            }
            ArrayList arrayList = stickyHeaderLinearLayoutManager.f12314b;
            arrayList.clear();
            q.C(arrayList);
            printStream.println((Object) ("!!!!!!!!!!! " + s.P(arrayList, null, null, null, null, 63)));
            if (stickyHeaderLinearLayoutManager.f12316d == null || arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.f12317e))) {
                return;
            }
            stickyHeaderLinearLayoutManager.scrapStickyHeader(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeRemoved(int i, int i9) {
            int i10;
            System.out.println((Object) v.k(i, i9, "!!!!!!!!!!! onItemRangeRemoved: positionStart = ", " itemCount = "));
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            if (stickyHeaderLinearLayoutManager.f12314b.isEmpty()) {
                return;
            }
            int i11 = i9 + i;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.f12314b;
            arrayList.clear();
            BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.f12313a;
            int itemCount = baseEpoxyAdapter != null ? baseEpoxyAdapter.getItemCount() : 0;
            for (int i12 = 0; i12 < itemCount; i12++) {
                BaseEpoxyAdapter baseEpoxyAdapter2 = stickyHeaderLinearLayoutManager.f12313a;
                if (baseEpoxyAdapter2 != null && baseEpoxyAdapter2.isStickyHeader(i12)) {
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            q.C(arrayList);
            if (stickyHeaderLinearLayoutManager.f12316d == null || i > (i10 = stickyHeaderLinearLayoutManager.f12317e) || i10 >= i11) {
                return;
            }
            stickyHeaderLinearLayoutManager.scrapStickyHeader(null);
        }
    }

    public StickyHeaderLinearLayoutManager(Context context) {
        super(context, 1, false);
        this.f12314b = new ArrayList();
        this.f12315c = new a();
        this.f12317e = -1;
        this.f12318f = -1;
    }

    public static int a(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeVerticalScrollOffset(yVar);
    }

    public static int b(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeHorizontalScrollOffset(yVar);
    }

    public static int c(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return super.scrollVerticallyBy(i, uVar, yVar);
    }

    public static PointF d(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i) {
        return super.computeScrollVectorForPosition(i);
    }

    public static int e(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return super.scrollHorizontallyBy(i, uVar, yVar);
    }

    public static int f(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeHorizontalScrollRange(yVar);
    }

    public static View g(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return super.onFocusSearchFailed(view, i, uVar, yVar);
    }

    public static int h(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeHorizontalScrollExtent(yVar);
    }

    public static int i(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeVerticalScrollRange(yVar);
    }

    public static int j(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        return super.computeVerticalScrollExtent(yVar);
    }

    public static p k(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.u uVar, RecyclerView.y yVar) {
        super.onLayoutChildren(uVar, yVar);
        return p.f3034a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(h(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(b(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(f(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF computeScrollVectorForPosition(int i) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        PointF d10 = d(this, i);
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return d10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollExtent(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(j(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(a(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(i(this, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        return valueOf.intValue();
    }

    public final int findHeaderIndex(int i) {
        ArrayList arrayList = this.f12314b;
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) / 2;
            if (((Number) arrayList.get(i10)).intValue() > i) {
                size = i10 - 1;
            } else {
                if (((Number) arrayList.get(i10)).intValue() >= i) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final int findHeaderIndexOrBefore(int i) {
        ArrayList arrayList = this.f12314b;
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) / 2;
            if (((Number) arrayList.get(i10)).intValue() <= i) {
                if (i10 < arrayList.size() - 1) {
                    i9 = i10 + 1;
                    if (((Number) arrayList.get(i9)).intValue() <= i) {
                    }
                }
                return i10;
            }
            size = i10 - 1;
        }
        return -1;
    }

    public final void measureAndLayout(View view) {
        measureChildWithMargins(view, 0, 0);
        if (getOrientation() == 1) {
            view.layout(getPaddingLeft(), 0, getWidth() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), getHeight() - getPaddingBottom());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onAdapterChanged(RecyclerView.Adapter<?> adapter, RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        setAdapter(adapter2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        setAdapter(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        View view2 = this.f12316d;
        if (view2 != null) {
            detachView(view2);
        }
        View g10 = g(this, view, i, uVar, yVar);
        View view3 = this.f12316d;
        if (view3 != null) {
            attachView(view3);
        }
        return g10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        k(this, uVar, yVar);
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        if (yVar.f7544g) {
            return;
        }
        updateStickyHeader(uVar, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f12318f = savedState.f12321b;
        this.f12319g = savedState.f12322c;
        super.onRestoreInstanceState(savedState.f12320a);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new SavedState(onSaveInstanceState, this.f12318f, this.f12319g);
        }
        return null;
    }

    public final void scrapStickyHeader(RecyclerView.u uVar) {
        View view = this.f12316d;
        if (view == null) {
            return;
        }
        this.f12316d = null;
        this.f12317e = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        BaseEpoxyAdapter baseEpoxyAdapter = this.f12313a;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.teardownStickyHeaderView(view);
        }
        stopIgnoringView(view);
        removeView(view);
        if (uVar != null) {
            uVar.j(view);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(e(this, i, uVar, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        int intValue = valueOf.intValue();
        if (intValue != 0) {
            updateStickyHeader(uVar, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void scrollToPosition(int i) {
        scrollToPositionWithOffset(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void scrollToPositionWithOffset(int i, int i9) {
        this.f12318f = -1;
        this.f12319g = Integer.MIN_VALUE;
        int findHeaderIndexOrBefore = findHeaderIndexOrBefore(i);
        if (findHeaderIndexOrBefore == -1 || findHeaderIndex(i) != -1) {
            super.scrollToPositionWithOffset(i, i9);
            return;
        }
        int i10 = i - 1;
        if (findHeaderIndex(i10) != -1) {
            super.scrollToPositionWithOffset(i10, i9);
            return;
        }
        if (this.f12316d == null || findHeaderIndexOrBefore != findHeaderIndex(this.f12317e)) {
            this.f12318f = i;
            this.f12319g = i9;
            super.scrollToPositionWithOffset(i, i9);
        } else {
            if (i9 == Integer.MIN_VALUE) {
                i9 = 0;
            }
            super.scrollToPositionWithOffset(i, this.f12316d.getHeight() + i9);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        View view = this.f12316d;
        if (view != null) {
            detachView(view);
        }
        Integer valueOf = Integer.valueOf(c(this, i, uVar, yVar));
        View view2 = this.f12316d;
        if (view2 != null) {
            attachView(view2);
        }
        int intValue = valueOf.intValue();
        if (intValue != 0) {
            updateStickyHeader(uVar, false);
        }
        return intValue;
    }

    public final void setAdapter(RecyclerView.Adapter<?> adapter) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.f12313a;
        a aVar = this.f12315c;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.unregisterAdapterDataObserver(aVar);
        }
        if (!(adapter instanceof BaseEpoxyAdapter)) {
            this.f12313a = null;
            this.f12314b.clear();
            return;
        }
        BaseEpoxyAdapter baseEpoxyAdapter2 = (BaseEpoxyAdapter) adapter;
        this.f12313a = baseEpoxyAdapter2;
        if (baseEpoxyAdapter2 != null) {
            baseEpoxyAdapter2.registerAdapterDataObserver(aVar);
        }
        aVar.onChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if ((r9.getBottom() - r9.getTranslationY()) > (getHeight() + 0.0f)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if ((r9.getTranslationY() + r9.getTop()) < 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        if ((r9.getRight() - r9.getTranslationX()) > (getWidth() + 0.0f)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if ((r9.getTranslationX() + r9.getLeft()) < 0.0f) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateStickyHeader(androidx.recyclerview.widget.RecyclerView.u r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager.updateStickyHeader(androidx.recyclerview.widget.RecyclerView$u, boolean):void");
    }
}

package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.u;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.n implements u.g, RecyclerView.x.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    H mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f7434a;

        /* renamed from: b, reason: collision with root package name */
        public int f7435b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7436c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f7434a = parcel.readInt();
                savedState.f7435b = parcel.readInt();
                savedState.f7436c = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7434a);
            parcel.writeInt(this.f7435b);
            parcel.writeInt(this.f7436c ? 1 : 0);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public H f7437a;

        /* renamed from: b, reason: collision with root package name */
        public int f7438b;

        /* renamed from: c, reason: collision with root package name */
        public int f7439c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7440d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7441e;

        public a() {
            d();
        }

        public final void a() {
            this.f7439c = this.f7440d ? this.f7437a.g() : this.f7437a.k();
        }

        public final void b(int i, View view) {
            if (this.f7440d) {
                this.f7439c = this.f7437a.m() + this.f7437a.b(view);
            } else {
                this.f7439c = this.f7437a.e(view);
            }
            this.f7438b = i;
        }

        public final void c(int i, View view) {
            int m2 = this.f7437a.m();
            if (m2 >= 0) {
                b(i, view);
                return;
            }
            this.f7438b = i;
            if (!this.f7440d) {
                int e10 = this.f7437a.e(view);
                int k3 = e10 - this.f7437a.k();
                this.f7439c = e10;
                if (k3 > 0) {
                    int g10 = (this.f7437a.g() - Math.min(0, (this.f7437a.g() - m2) - this.f7437a.b(view))) - (this.f7437a.c(view) + e10);
                    if (g10 < 0) {
                        this.f7439c -= Math.min(k3, -g10);
                        return;
                    }
                    return;
                }
                return;
            }
            int g11 = (this.f7437a.g() - m2) - this.f7437a.b(view);
            this.f7439c = this.f7437a.g() - g11;
            if (g11 > 0) {
                int c2 = this.f7439c - this.f7437a.c(view);
                int k10 = this.f7437a.k();
                int min = c2 - (Math.min(this.f7437a.e(view) - k10, 0) + k10);
                if (min < 0) {
                    this.f7439c = Math.min(g11, -min) + this.f7439c;
                }
            }
        }

        public final void d() {
            this.f7438b = -1;
            this.f7439c = Integer.MIN_VALUE;
            this.f7440d = false;
            this.f7441e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f7438b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f7439c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f7440d);
            sb2.append(", mValid=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f7441e, '}');
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7442a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7443b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7444c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7445d;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7446a;

        /* renamed from: b, reason: collision with root package name */
        public int f7447b;

        /* renamed from: c, reason: collision with root package name */
        public int f7448c;

        /* renamed from: d, reason: collision with root package name */
        public int f7449d;

        /* renamed from: e, reason: collision with root package name */
        public int f7450e;

        /* renamed from: f, reason: collision with root package name */
        public int f7451f;

        /* renamed from: g, reason: collision with root package name */
        public int f7452g;

        /* renamed from: h, reason: collision with root package name */
        public int f7453h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f7454j;

        /* renamed from: k, reason: collision with root package name */
        public List<RecyclerView.C> f7455k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7456l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f7455k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < size; i9++) {
                View view3 = this.f7455k.get(i9).itemView;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.f7506a.isRemoved() && (layoutPosition = (oVar.f7506a.getLayoutPosition() - this.f7449d) * this.f7450e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f7449d = -1;
            } else {
                this.f7449d = ((RecyclerView.o) view2.getLayoutParams()).f7506a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.u uVar) {
            List<RecyclerView.C> list = this.f7455k;
            if (list == null) {
                View e10 = uVar.e(this.f7449d);
                this.f7449d += this.f7450e;
                return e10;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.f7455k.get(i).itemView;
                RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                if (!oVar.f7506a.isRemoved() && this.f7449d == oVar.f7506a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return K.a(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return K.b(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return K.c(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int g11 = this.mOrientationHelper.g() - i;
        if (g11 <= 0) {
            return 0;
        }
        int i9 = -scrollBy(-g11, uVar, yVar);
        int i10 = i + i9;
        if (!z10 || (g10 = this.mOrientationHelper.g() - i10) <= 0) {
            return i9;
        }
        this.mOrientationHelper.p(g10);
        return g10 + i9;
    }

    private int fixLayoutStartGap(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int k3;
        int k10 = i - this.mOrientationHelper.k();
        if (k10 <= 0) {
            return 0;
        }
        int i9 = -scrollBy(k10, uVar, yVar);
        int i10 = i + i9;
        if (!z10 || (k3 = i10 - this.mOrientationHelper.k()) <= 0) {
            return i9;
        }
        this.mOrientationHelper.p(-k3);
        return i9 - k3;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i9) {
        if (!yVar.f7547k || getChildCount() == 0 || yVar.f7544g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.C> list = uVar.f7517d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C c2 = list.get(i12);
            if (!c2.isRemoved()) {
                if ((c2.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    i10 += this.mOrientationHelper.c(c2.itemView);
                } else {
                    i11 += this.mOrientationHelper.c(c2.itemView);
                }
            }
        }
        this.mLayoutState.f7455k = list;
        if (i10 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            c cVar = this.mLayoutState;
            cVar.f7453h = i10;
            cVar.f7448c = 0;
            cVar.a(null);
            fill(uVar, this.mLayoutState, yVar, false);
        }
        if (i11 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i9);
            c cVar2 = this.mLayoutState;
            cVar2.f7453h = i11;
            cVar2.f7448c = 0;
            cVar2.a(null);
            fill(uVar, this.mLayoutState, yVar, false);
        }
        this.mLayoutState.f7455k = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.u uVar, c cVar) {
        if (!cVar.f7446a || cVar.f7456l) {
            return;
        }
        int i = cVar.f7452g;
        int i9 = cVar.i;
        if (cVar.f7451f == -1) {
            recycleViewsFromEnd(uVar, i, i9);
        } else {
            recycleViewsFromStart(uVar, i, i9);
        }
    }

    private void recycleChildren(RecyclerView.u uVar, int i, int i9) {
        if (i == i9) {
            return;
        }
        if (i9 <= i) {
            while (i > i9) {
                removeAndRecycleViewAt(i, uVar);
                i--;
            }
        } else {
            for (int i10 = i9 - 1; i10 >= i; i10--) {
                removeAndRecycleViewAt(i10, uVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.u uVar, int i, int i9) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int f10 = (this.mOrientationHelper.f() - i) + i9;
        if (this.mShouldReverseLayout) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (this.mOrientationHelper.e(childAt) < f10 || this.mOrientationHelper.o(childAt) < f10) {
                    recycleChildren(uVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = childCount - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            if (this.mOrientationHelper.e(childAt2) < f10 || this.mOrientationHelper.o(childAt2) < f10) {
                recycleChildren(uVar, i11, i12);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.u uVar, int i, int i9) {
        if (i < 0) {
            return;
        }
        int i10 = i - i9;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (this.mOrientationHelper.b(childAt) > i10 || this.mOrientationHelper.n(childAt) > i10) {
                    recycleChildren(uVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = childCount - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            if (this.mOrientationHelper.b(childAt2) > i10 || this.mOrientationHelper.n(childAt2) > i10) {
                recycleChildren(uVar, i12, i13);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        View findReferenceChild;
        boolean z10 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            aVar.getClass();
            RecyclerView.o oVar = (RecyclerView.o) focusedChild.getLayoutParams();
            if (!oVar.f7506a.isRemoved() && oVar.f7506a.getLayoutPosition() >= 0 && oVar.f7506a.getLayoutPosition() < yVar.b()) {
                aVar.c(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z11 = this.mLastStackFromEnd;
        boolean z12 = this.mStackFromEnd;
        if (z11 != z12 || (findReferenceChild = findReferenceChild(uVar, yVar, aVar.f7440d, z12)) == null) {
            return false;
        }
        aVar.b(getPosition(findReferenceChild), findReferenceChild);
        if (!yVar.f7544g && supportsPredictiveItemAnimations()) {
            int e10 = this.mOrientationHelper.e(findReferenceChild);
            int b9 = this.mOrientationHelper.b(findReferenceChild);
            int k3 = this.mOrientationHelper.k();
            int g10 = this.mOrientationHelper.g();
            boolean z13 = b9 <= k3 && e10 < k3;
            if (e10 >= g10 && b9 > g10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f7440d) {
                    k3 = g10;
                }
                aVar.f7439c = k3;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.y yVar, a aVar) {
        int i;
        if (!yVar.f7544g && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < yVar.b()) {
                int i9 = this.mPendingScrollPosition;
                aVar.f7438b = i9;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.f7434a >= 0) {
                    boolean z10 = savedState.f7436c;
                    aVar.f7440d = z10;
                    if (z10) {
                        aVar.f7439c = this.mOrientationHelper.g() - this.mPendingSavedState.f7435b;
                    } else {
                        aVar.f7439c = this.mOrientationHelper.k() + this.mPendingSavedState.f7435b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z11 = this.mShouldReverseLayout;
                    aVar.f7440d = z11;
                    if (z11) {
                        aVar.f7439c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f7439c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View findViewByPosition = findViewByPosition(i9);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f7440d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.c(findViewByPosition) > this.mOrientationHelper.l()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k() < 0) {
                        aVar.f7439c = this.mOrientationHelper.k();
                        aVar.f7440d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition) < 0) {
                        aVar.f7439c = this.mOrientationHelper.g();
                        aVar.f7440d = true;
                        return true;
                    }
                    aVar.f7439c = aVar.f7440d ? this.mOrientationHelper.m() + this.mOrientationHelper.b(findViewByPosition) : this.mOrientationHelper.e(findViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (updateAnchorFromPendingData(yVar, aVar) || updateAnchorFromChildren(uVar, yVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f7438b = this.mStackFromEnd ? yVar.b() - 1 : 0;
    }

    private void updateLayoutState(int i, int i9, boolean z10, RecyclerView.y yVar) {
        int k3;
        this.mLayoutState.f7456l = resolveIsInfinite();
        this.mLayoutState.f7451f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i == 1;
        c cVar = this.mLayoutState;
        int i10 = z11 ? max2 : max;
        cVar.f7453h = i10;
        if (!z11) {
            max = max2;
        }
        cVar.i = max;
        if (z11) {
            cVar.f7453h = this.mOrientationHelper.h() + i10;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f7450e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f7449d = position + cVar3.f7450e;
            cVar3.f7447b = this.mOrientationHelper.b(childClosestToEnd);
            k3 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f7453h = this.mOrientationHelper.k() + cVar4.f7453h;
            c cVar5 = this.mLayoutState;
            cVar5.f7450e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f7449d = position2 + cVar6.f7450e;
            cVar6.f7447b = this.mOrientationHelper.e(childClosestToStart);
            k3 = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f7448c = i9;
        if (z10) {
            cVar7.f7448c = i9 - k3;
        }
        cVar7.f7452g = k3;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f7438b, aVar.f7439c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f7438b, aVar.f7439c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(yVar);
        if (this.mLayoutState.f7451f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i9, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        if (this.mOrientation != 0) {
            i = i9;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
        collectPrefetchPositionsForLayoutState(yVar, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.n.c cVar) {
        boolean z10;
        int i9;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i9 = savedState.f7434a) < 0) {
            resolveShouldLayoutReverse();
            z10 = this.mShouldReverseLayout;
            i9 = this.mPendingScrollPosition;
            if (i9 == -1) {
                i9 = z10 ? i - 1 : 0;
            }
        } else {
            z10 = savedState.f7436c;
        }
        int i10 = z10 ? -1 : 1;
        for (int i11 = 0; i11 < this.mInitialPrefetchItemCount && i9 >= 0 && i9 < i; i11++) {
            ((t.b) cVar).a(i9, 0);
            i9 += i10;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, c cVar, RecyclerView.n.c cVar2) {
        int i = cVar.f7449d;
        if (i < 0 || i >= yVar.b()) {
            return;
        }
        ((t.b) cVar2).a(i, Math.max(0, cVar.f7452g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i9 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i9, 0.0f) : new PointF(0.0f, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public c createLayoutState() {
        c cVar = new c();
        cVar.f7446a = true;
        cVar.f7453h = 0;
        cVar.i = 0;
        cVar.f7455k = null;
        return cVar;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.u uVar, c cVar, RecyclerView.y yVar, boolean z10) {
        int i;
        int i9 = cVar.f7448c;
        int i10 = cVar.f7452g;
        if (i10 != Integer.MIN_VALUE) {
            if (i9 < 0) {
                cVar.f7452g = i10 + i9;
            }
            recycleByLayoutState(uVar, cVar);
        }
        int i11 = cVar.f7448c + cVar.f7453h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f7456l && i11 <= 0) || (i = cVar.f7449d) < 0 || i >= yVar.b()) {
                break;
            }
            bVar.f7442a = 0;
            bVar.f7443b = false;
            bVar.f7444c = false;
            bVar.f7445d = false;
            layoutChunk(uVar, yVar, cVar, bVar);
            if (!bVar.f7443b) {
                int i12 = cVar.f7447b;
                int i13 = bVar.f7442a;
                cVar.f7447b = (cVar.f7451f * i13) + i12;
                if (!bVar.f7444c || cVar.f7455k != null || !yVar.f7544g) {
                    cVar.f7448c -= i13;
                    i11 -= i13;
                }
                int i14 = cVar.f7452g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    cVar.f7452g = i15;
                    int i16 = cVar.f7448c;
                    if (i16 < 0) {
                        cVar.f7452g = i15 + i16;
                    }
                    recycleByLayoutState(uVar, cVar);
                }
                if (z10 && bVar.f7445d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i9 - cVar.f7448c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z10, z11) : findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z10, z11) : findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i9) {
        int i10;
        int i11;
        ensureLayoutState();
        if (i9 <= i && i9 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.e(getChildAt(i)) < this.mOrientationHelper.k()) {
            i10 = 16644;
            i11 = 16388;
        } else {
            i10 = 4161;
            i11 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i9, i10, i11) : this.mVerticalBoundCheck.a(i, i9, i10, i11);
    }

    public View findOneVisibleChild(int i, int i9, boolean z10, boolean z11) {
        ensureLayoutState();
        int i10 = z10 ? 24579 : 320;
        int i11 = z11 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i9, i10, i11) : this.mVerticalBoundCheck.a(i, i9, i10, i11);
    }

    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i;
        int i9;
        int i10;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z11) {
            i9 = getChildCount() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = childCount;
            i9 = 0;
            i10 = 1;
        }
        int b9 = yVar.b();
        int k3 = this.mOrientationHelper.k();
        int g10 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i9 != i) {
            View childAt = getChildAt(i9);
            int position = getPosition(childAt);
            int e10 = this.mOrientationHelper.e(childAt);
            int b10 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b9) {
                if (!((RecyclerView.o) childAt.getLayoutParams()).f7506a.isRemoved()) {
                    boolean z12 = b10 <= k3 && e10 < k3;
                    boolean z13 = e10 >= g10 && b10 > g10;
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i9 += i10;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.o generateDefaultLayoutParams() {
        return new RecyclerView.o(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.y yVar) {
        if (yVar.f7538a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i9;
        int i10;
        int i11;
        int d10;
        View b9 = cVar.b(uVar);
        if (b9 == null) {
            bVar.f7443b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) b9.getLayoutParams();
        if (cVar.f7455k == null) {
            if (this.mShouldReverseLayout == (cVar.f7451f == -1)) {
                addView(b9);
            } else {
                addView(b9, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f7451f == -1)) {
                addDisappearingView(b9);
            } else {
                addDisappearingView(b9, 0);
            }
        }
        measureChildWithMargins(b9, 0, 0);
        bVar.f7442a = this.mOrientationHelper.c(b9);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                d10 = getWidth() - getPaddingRight();
                i11 = d10 - this.mOrientationHelper.d(b9);
            } else {
                i11 = getPaddingLeft();
                d10 = this.mOrientationHelper.d(b9) + i11;
            }
            if (cVar.f7451f == -1) {
                int i12 = cVar.f7447b;
                i10 = i12;
                i9 = d10;
                i = i12 - bVar.f7442a;
            } else {
                int i13 = cVar.f7447b;
                i = i13;
                i9 = d10;
                i10 = bVar.f7442a + i13;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d11 = this.mOrientationHelper.d(b9) + paddingTop;
            if (cVar.f7451f == -1) {
                int i14 = cVar.f7447b;
                i9 = i14;
                i = paddingTop;
                i10 = d11;
                i11 = i14 - bVar.f7442a;
            } else {
                int i15 = cVar.f7447b;
                i = paddingTop;
                i9 = bVar.f7442a + i15;
                i10 = d11;
                i11 = i15;
            }
        }
        layoutDecoratedWithMargins(b9, i11, i, i9, i10);
        if (oVar.f7506a.isRemoved() || oVar.f7506a.isUpdated()) {
            bVar.f7444c = true;
        }
        bVar.f7445d = b9.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(uVar);
            uVar.f7514a.clear();
            uVar.h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        int convertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, yVar);
        c cVar = this.mLayoutState;
        cVar.f7452g = Integer.MIN_VALUE;
        cVar.f7446a = false;
        fill(uVar, cVar, yVar, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return findPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (findPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        int i;
        int i9;
        int i10;
        int i11;
        int fixLayoutEndGap;
        int i12;
        View findViewByPosition;
        int e10;
        int i13;
        int i14;
        int i15 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && yVar.b() == 0) {
            removeAndRecycleAllViews(uVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i14 = savedState.f7434a) >= 0) {
            this.mPendingScrollPosition = i14;
        }
        ensureLayoutState();
        this.mLayoutState.f7446a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f7441e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.d();
            a aVar2 = this.mAnchorInfo;
            aVar2.f7440d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(uVar, yVar, aVar2);
            this.mAnchorInfo.f7441e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
        }
        c cVar = this.mLayoutState;
        cVar.f7451f = cVar.f7454j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int k3 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h9 = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (yVar.f7544g && (i12 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i12)) != null) {
            if (this.mShouldReverseLayout) {
                i13 = this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition);
                e10 = this.mPendingScrollPositionOffset;
            } else {
                e10 = this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k();
                i13 = this.mPendingScrollPositionOffset;
            }
            int i16 = i13 - e10;
            if (i16 > 0) {
                k3 += i16;
            } else {
                h9 -= i16;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f7440d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i15 = 1;
        }
        onAnchorReady(uVar, yVar, aVar3, i15);
        detachAndScrapAttachedViews(uVar);
        this.mLayoutState.f7456l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f7440d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f7453h = k3;
            fill(uVar, cVar2, yVar, false);
            c cVar3 = this.mLayoutState;
            i9 = cVar3.f7447b;
            int i17 = cVar3.f7449d;
            int i18 = cVar3.f7448c;
            if (i18 > 0) {
                h9 += i18;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f7453h = h9;
            cVar4.f7449d += cVar4.f7450e;
            fill(uVar, cVar4, yVar, false);
            c cVar5 = this.mLayoutState;
            i = cVar5.f7447b;
            int i19 = cVar5.f7448c;
            if (i19 > 0) {
                updateLayoutStateToFillStart(i17, i9);
                c cVar6 = this.mLayoutState;
                cVar6.f7453h = i19;
                fill(uVar, cVar6, yVar, false);
                i9 = this.mLayoutState.f7447b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f7453h = h9;
            fill(uVar, cVar7, yVar, false);
            c cVar8 = this.mLayoutState;
            i = cVar8.f7447b;
            int i20 = cVar8.f7449d;
            int i21 = cVar8.f7448c;
            if (i21 > 0) {
                k3 += i21;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f7453h = k3;
            cVar9.f7449d += cVar9.f7450e;
            fill(uVar, cVar9, yVar, false);
            c cVar10 = this.mLayoutState;
            int i22 = cVar10.f7447b;
            int i23 = cVar10.f7448c;
            if (i23 > 0) {
                updateLayoutStateToFillEnd(i20, i);
                c cVar11 = this.mLayoutState;
                cVar11.f7453h = i23;
                fill(uVar, cVar11, yVar, false);
                i = this.mLayoutState.f7447b;
            }
            i9 = i22;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i, uVar, yVar, true);
                i10 = i9 + fixLayoutEndGap2;
                i11 = i + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i10, uVar, yVar, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i9, uVar, yVar, true);
                i10 = i9 + fixLayoutStartGap;
                i11 = i + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i11, uVar, yVar, false);
            }
            i9 = i10 + fixLayoutEndGap;
            i = i11 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(uVar, yVar, i9, i);
        if (yVar.f7544g) {
            this.mAnchorInfo.d();
        } else {
            H h10 = this.mOrientationHelper;
            h10.f7424b = h10.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f7434a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7434a = savedState.f7434a;
            savedState2.f7435b = savedState.f7435b;
            savedState2.f7436c = savedState.f7436c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState3.f7436c = z10;
            if (z10) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState3.f7435b = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
                savedState3.f7434a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState3.f7434a = getPosition(childClosestToStart);
                savedState3.f7435b = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
            }
        } else {
            savedState3.f7434a = -1;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.u.g
    public void prepareForDrop(View view, View view2, int i, int i9) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f7446a = true;
        int i9 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i9, abs, true, yVar);
        c cVar = this.mLayoutState;
        int fill = fill(uVar, cVar, yVar, false) + cVar.f7452g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i9 * fill;
        }
        this.mOrientationHelper.p(-i);
        this.mLayoutState.f7454j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f7434a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i9) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i9;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f7434a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, uVar, yVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            H a10 = H.a(this, i);
            this.mOrientationHelper = a10;
            this.mAnchorInfo.f7437a = a10;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        A a10 = new A(recyclerView.getContext());
        a10.f7523a = i;
        startSmoothScroll(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int e10 = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int e11 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(e11 < e10);
                    throw new RuntimeException(sb2.toString());
                }
                if (e11 > e10) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i9 = 1; i9 < getChildCount(); i9++) {
            View childAt2 = getChildAt(i9);
            int position3 = getPosition(childAt2);
            int e12 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(e12 < e10);
                throw new RuntimeException(sb3.toString());
            }
            if (e12 < e10) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z10);
    }

    private void updateLayoutStateToFillEnd(int i, int i9) {
        this.mLayoutState.f7448c = this.mOrientationHelper.g() - i9;
        c cVar = this.mLayoutState;
        cVar.f7450e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f7449d = i;
        cVar.f7451f = 1;
        cVar.f7447b = i9;
        cVar.f7452g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i9) {
        this.mLayoutState.f7448c = i9 - this.mOrientationHelper.k();
        c cVar = this.mLayoutState;
        cVar.f7449d = i;
        cVar.f7450e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f7451f = -1;
        cVar.f7447b = i9;
        cVar.f7452g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i9) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i, i9);
        setOrientation(properties.f7502a);
        setReverseLayout(properties.f7504c);
        setStackFromEnd(properties.f7505d);
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, a aVar, int i) {
    }
}

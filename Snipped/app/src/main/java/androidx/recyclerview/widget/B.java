package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class B extends M {

    /* renamed from: d, reason: collision with root package name */
    public G f7408d;

    /* renamed from: e, reason: collision with root package name */
    public F f7409e;

    public static View h(RecyclerView.n nVar, H h9) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l10 = (h9.l() / 2) + h9.k();
        int i = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = nVar.getChildAt(i9);
            int abs = Math.abs(((h9.c(childAt) / 2) + h9.e(childAt)) - l10);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.M
    public final int[] b(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            H i = i(nVar);
            iArr[0] = ((i.c(view) / 2) + i.e(view)) - ((i.l() / 2) + i.k());
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            H j10 = j(nVar);
            iArr[1] = ((j10.c(view) / 2) + j10.e(view)) - ((j10.l() / 2) + j10.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.M
    public View d(RecyclerView.n nVar) {
        if (nVar.canScrollVertically()) {
            return h(nVar, j(nVar));
        }
        if (nVar.canScrollHorizontally()) {
            return h(nVar, i(nVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.M
    public final int e(RecyclerView.n nVar, int i, int i9) {
        int itemCount;
        View d10;
        int position;
        int i10;
        PointF computeScrollVectorForPosition;
        int i11;
        int i12;
        if (!(nVar instanceof RecyclerView.x.b) || (itemCount = nVar.getItemCount()) == 0 || (d10 = d(nVar)) == null || (position = nVar.getPosition(d10)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.x.b) nVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (nVar.canScrollHorizontally()) {
            i11 = g(nVar, i(nVar), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        if (nVar.canScrollVertically()) {
            i12 = g(nVar, j(nVar), 0, i9);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        if (nVar.canScrollVertically()) {
            i11 = i12;
        }
        if (i11 == 0) {
            return -1;
        }
        int i13 = position + i11;
        int i14 = i13 >= 0 ? i13 : 0;
        return i14 >= itemCount ? i10 : i14;
    }

    public final int g(RecyclerView.n nVar, H h9, int i, int i9) {
        this.f7458b.fling(0, 0, i, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f7458b.getFinalX(), this.f7458b.getFinalY()};
        int childCount = nVar.getChildCount();
        float f10 = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = nVar.getChildAt(i12);
                int position = nVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i11) {
                        view = childAt;
                        i11 = position;
                    }
                    if (position > i10) {
                        view2 = childAt;
                        i10 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(h9.b(view), h9.b(view2)) - Math.min(h9.e(view), h9.e(view2));
                if (max != 0) {
                    f10 = (max * 1.0f) / ((i10 - i11) + 1);
                }
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f10);
    }

    public final H i(RecyclerView.n nVar) {
        F f10 = this.f7409e;
        if (f10 == null || f10.f7423a != nVar) {
            this.f7409e = new F(nVar);
        }
        return this.f7409e;
    }

    public final H j(RecyclerView.n nVar) {
        G g10 = this.f7408d;
        if (g10 == null || g10.f7423a != nVar) {
            this.f7408d = new G(nVar);
        }
        return this.f7408d;
    }
}

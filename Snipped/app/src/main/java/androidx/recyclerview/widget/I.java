package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class I extends M {

    /* renamed from: d, reason: collision with root package name */
    public G f7426d;

    /* renamed from: e, reason: collision with root package name */
    public F f7427e;

    /* compiled from: PagerSnapHelper.java */
    public class a extends A {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.RecyclerView.x
        public final void c(View view, RecyclerView.x.a aVar) {
            I i = I.this;
            int[] b9 = i.b(i.f7457a.getLayoutManager(), view);
            int i9 = b9[0];
            int i10 = b9[1];
            int ceil = (int) Math.ceil(i(Math.max(Math.abs(i9), Math.abs(i10))) / 0.3356d);
            if (ceil > 0) {
                DecelerateInterpolator decelerateInterpolator = this.f7401j;
                aVar.f7531a = i9;
                aVar.f7532b = i10;
                aVar.f7533c = ceil;
                aVar.f7535e = decelerateInterpolator;
                aVar.f7536f = true;
            }
        }

        @Override // androidx.recyclerview.widget.A
        public final float h(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.A
        public final int i(int i) {
            return Math.min(100, super.i(i));
        }
    }

    public static int g(View view, H h9) {
        return ((h9.c(view) / 2) + h9.e(view)) - ((h9.l() / 2) + h9.k());
    }

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
            iArr[0] = g(view, i(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = g(view, j(nVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.M
    public final RecyclerView.x c(RecyclerView.n nVar) {
        if (nVar instanceof RecyclerView.x.b) {
            return new a(this.f7457a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.M
    @SuppressLint({"UnknownNullness"})
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
    @SuppressLint({"UnknownNullness"})
    public final int e(RecyclerView.n nVar, int i, int i9) {
        PointF computeScrollVectorForPosition;
        int itemCount = nVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        H j10 = nVar.canScrollVertically() ? j(nVar) : nVar.canScrollHorizontally() ? i(nVar) : null;
        if (j10 == null) {
            return -1;
        }
        int childCount = nVar.getChildCount();
        boolean z10 = false;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = nVar.getChildAt(i12);
            if (childAt != null) {
                int g10 = g(childAt, j10);
                if (g10 <= 0 && g10 > i11) {
                    view2 = childAt;
                    i11 = g10;
                }
                if (g10 >= 0 && g10 < i10) {
                    view = childAt;
                    i10 = g10;
                }
            }
        }
        boolean z11 = !nVar.canScrollHorizontally() ? i9 <= 0 : i <= 0;
        if (z11 && view != null) {
            return nVar.getPosition(view);
        }
        if (!z11 && view2 != null) {
            return nVar.getPosition(view2);
        }
        if (z11) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = nVar.getPosition(view);
        int itemCount2 = nVar.getItemCount();
        if ((nVar instanceof RecyclerView.x.b) && (computeScrollVectorForPosition = ((RecyclerView.x.b) nVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z10 = true;
        }
        int i13 = position + (z10 == z11 ? -1 : 1);
        if (i13 < 0 || i13 >= itemCount) {
            return -1;
        }
        return i13;
    }

    public final H i(RecyclerView.n nVar) {
        F f10 = this.f7427e;
        if (f10 == null || f10.f7423a != nVar) {
            this.f7427e = new F(nVar);
        }
        return this.f7427e;
    }

    public final H j(RecyclerView.n nVar) {
        G g10 = this.f7426d;
        if (g10 == null || g10.f7423a != nVar) {
            this.f7426d = new G(nVar);
        }
        return this.f7426d;
    }
}

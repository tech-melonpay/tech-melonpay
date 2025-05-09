package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class M extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f7457a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f7458b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7459c = new a();

    /* compiled from: SnapHelper.java */
    public class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7460a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f7460a) {
                this.f7460a = false;
                M.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            if (i == 0 && i9 == 0) {
                return;
            }
            this.f7460a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7457a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f7459c;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(aVar);
            this.f7457a.setOnFlingListener(null);
        }
        this.f7457a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f7457a.addOnScrollListener(aVar);
            this.f7457a.setOnFlingListener(this);
            this.f7458b = new Scroller(this.f7457a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public abstract int[] b(RecyclerView.n nVar, View view);

    public RecyclerView.x c(RecyclerView.n nVar) {
        if (nVar instanceof RecyclerView.x.b) {
            return new N(this, this.f7457a.getContext());
        }
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View d(RecyclerView.n nVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int e(RecyclerView.n nVar, int i, int i9);

    public final void f() {
        RecyclerView.n layoutManager;
        View d10;
        RecyclerView recyclerView = this.f7457a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d10 = d(layoutManager)) == null) {
            return;
        }
        int[] b9 = b(layoutManager, d10);
        int i = b9[0];
        if (i == 0 && b9[1] == 0) {
            return;
        }
        this.f7457a.smoothScrollBy(i, b9[1]);
    }
}

package com.futuremind.recyclerviewfastscroll;

import W1.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RecyclerViewScrollListener.java */
/* loaded from: classes.dex */
public final class a extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    public final FastScroller f8801a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8802b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f8803c = 0;

    /* compiled from: RecyclerViewScrollListener.java */
    /* renamed from: com.futuremind.recyclerviewfastscroll.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        void a();
    }

    public a(FastScroller fastScroller) {
        this.f8801a = fastScroller;
    }

    public final void a(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        FastScroller fastScroller = this.f8801a;
        if (fastScroller.c()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(computeHorizontalScrollOffset / (computeHorizontalScrollRange - computeHorizontalScrollExtent));
        Iterator it = this.f8802b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0099a) it.next()).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        FastScroller fastScroller = this.f8801a;
        if (i == 0 && this.f8803c != 0) {
            b viewProvider = fastScroller.getViewProvider();
            if (viewProvider.b() != null) {
                viewProvider.b().getClass();
            }
            if (viewProvider.a() != null) {
                viewProvider.a().getClass();
            }
        } else if (i != 0 && this.f8803c == 0) {
            b viewProvider2 = fastScroller.getViewProvider();
            if (viewProvider2.b() != null) {
                viewProvider2.b().getClass();
            }
            if (viewProvider2.a() != null) {
                viewProvider2.a().getClass();
            }
        }
        this.f8803c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
        FastScroller fastScroller = this.f8801a;
        if (fastScroller.f8790d == null || fastScroller.f8797l || fastScroller.f8788b.getChildCount() <= 0) {
            return;
        }
        a(recyclerView);
    }
}

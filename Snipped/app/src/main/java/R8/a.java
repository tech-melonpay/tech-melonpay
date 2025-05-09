package R8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;

/* compiled from: ViewPager2Attacher.kt */
/* loaded from: classes2.dex */
public final class a implements BaseDotsIndicator.a {

    /* renamed from: a, reason: collision with root package name */
    public C0042a f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f3310b;

    /* compiled from: ViewPager2Attacher.kt */
    /* renamed from: R8.a$a, reason: collision with other inner class name */
    public static final class C0042a extends ViewPager2.e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q8.c f3311b;

        public C0042a(Q8.c cVar) {
            this.f3311b = cVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void onPageScrolled(int i, float f10, int i9) {
            super.onPageScrolled(i, f10, i9);
            this.f3311b.b(i, f10);
        }
    }

    public a(ViewPager2 viewPager2) {
        this.f3310b = viewPager2;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void a(Q8.c cVar) {
        C0042a c0042a = new C0042a(cVar);
        this.f3309a = c0042a;
        this.f3310b.f8014c.f8046b.add(c0042a);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final int b() {
        return this.f3310b.getCurrentItem();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void c(int i) {
        ViewPager2 viewPager2 = this.f3310b;
        if (((androidx.viewpager2.widget.c) viewPager2.f8024n.f535b).f8060m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        viewPager2.b(i);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void d() {
        C0042a c0042a = this.f3309a;
        if (c0042a != null) {
            this.f3310b.f8014c.f8046b.remove(c0042a);
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final boolean e() {
        RecyclerView.Adapter adapter = this.f3310b.getAdapter();
        return adapter != null && adapter.getItemCount() > 0;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final int getCount() {
        RecyclerView.Adapter adapter = this.f3310b.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }
}

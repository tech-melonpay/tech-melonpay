package R8;

import androidx.viewpager.widget.ViewPager;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.ArrayList;
import o1.AbstractC1086a;

/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes2.dex */
public final class d implements BaseDotsIndicator.a {

    /* renamed from: a, reason: collision with root package name */
    public a f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager f3314b;

    public d(ViewPager viewPager) {
        this.f3314b = viewPager;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void a(Q8.c cVar) {
        a aVar = new a(cVar);
        this.f3313a = aVar;
        this.f3314b.b(aVar);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final int b() {
        return this.f3314b.getCurrentItem();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void c(int i) {
        ViewPager viewPager = this.f3314b;
        viewPager.f7992v = false;
        viewPager.v(i, 0, true, false);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final void d() {
        ArrayList arrayList;
        a aVar = this.f3313a;
        if (aVar == null || (arrayList = this.f3314b.R) == null) {
            return;
        }
        arrayList.remove(aVar);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final boolean e() {
        AbstractC1086a adapter = this.f3314b.getAdapter();
        return adapter != null && adapter.c() > 0;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.a
    public final int getCount() {
        AbstractC1086a adapter = this.f3314b.getAdapter();
        if (adapter != null) {
            return adapter.c();
        }
        return 0;
    }

    /* compiled from: ViewPagerAttacher.kt */
    public static final class a implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q8.c f3315a;

        public a(Q8.c cVar) {
            this.f3315a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i, float f10) {
            this.f3315a.b(i, f10);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i) {
        }
    }
}

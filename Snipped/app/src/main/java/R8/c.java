package R8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ca.InterfaceC0635a;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher;

/* compiled from: ViewPager2Attacher.kt */
/* loaded from: classes2.dex */
public final class c extends DotsIndicatorAttacher<ViewPager2, RecyclerView.Adapter<?>> {
    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final BaseDotsIndicator.a a(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter) {
        return new a(viewPager2);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final RecyclerView.Adapter<?> b(ViewPager2 viewPager2) {
        return viewPager2.getAdapter();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final void c(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter, InterfaceC0635a interfaceC0635a) {
        adapter.registerAdapterDataObserver(new b(interfaceC0635a));
    }
}

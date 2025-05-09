package R8;

import androidx.viewpager.widget.ViewPager;
import ca.InterfaceC0635a;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher;
import o1.AbstractC1086a;

/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes2.dex */
public final class f extends DotsIndicatorAttacher<ViewPager, AbstractC1086a> {
    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final BaseDotsIndicator.a a(ViewPager viewPager, AbstractC1086a abstractC1086a) {
        return new d(viewPager);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final AbstractC1086a b(ViewPager viewPager) {
        return viewPager.getAdapter();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public final void c(ViewPager viewPager, AbstractC1086a abstractC1086a, InterfaceC0635a interfaceC0635a) {
        abstractC1086a.f24339a.registerObserver(new e(interfaceC0635a));
    }
}

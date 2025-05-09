package com.tbuonomo.viewpagerdotsindicator.attacher;

import O9.p;
import Q8.a;
import ca.InterfaceC0635a;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;

/* compiled from: DotsIndicatorAttacher.kt */
/* loaded from: classes2.dex */
public abstract class DotsIndicatorAttacher<Attachable, Adapter> {
    public abstract BaseDotsIndicator.a a(Attachable attachable, Adapter adapter);

    public abstract Adapter b(Attachable attachable);

    public abstract void c(Attachable attachable, Adapter adapter, InterfaceC0635a<p> interfaceC0635a);

    public final void d(final BaseDotsIndicator baseDotsIndicator, Attachable attachable) {
        Adapter b9 = b(attachable);
        if (b9 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        c(attachable, b9, new InterfaceC0635a<p>() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher$setup$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final p invoke() {
                BaseDotsIndicator baseDotsIndicator2 = BaseDotsIndicator.this;
                baseDotsIndicator2.post(new a(baseDotsIndicator2, 3));
                return p.f3034a;
            }
        });
        baseDotsIndicator.setPager(a(attachable, b9));
        baseDotsIndicator.d();
    }
}

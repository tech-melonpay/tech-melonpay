package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f8064b;

    public d(ViewPager2 viewPager2) {
        this.f8064b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f8064b.c();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.f8064b;
        if (viewPager2.f8015d != i) {
            viewPager2.f8015d = i;
            viewPager2.f8030t.b();
        }
    }
}

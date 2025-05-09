package q1;

import androidx.viewpager2.widget.ViewPager2;
import q1.a;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.d f25851b;

    public d(a.d dVar) {
        this.f25851b = dVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        this.f25851b.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        this.f25851b.b(false);
    }
}

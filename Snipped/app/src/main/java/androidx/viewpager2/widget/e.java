package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class e extends ViewPager2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f8065b;

    public e(ViewPager2 viewPager2) {
        this.f8065b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.f8065b;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f8020j.requestFocus(2);
        }
    }
}

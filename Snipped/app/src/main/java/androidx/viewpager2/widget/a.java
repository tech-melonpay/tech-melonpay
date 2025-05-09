package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class a extends ViewPager2.e {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8046b = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f8046b.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrolled(int i, float f10, int i9) {
        try {
            Iterator it = this.f8046b.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageScrolled(i, f10, i9);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f8046b.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}

package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.sumsub.sns.presentation.screen.preview.photo.l;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class b extends ViewPager2.e {

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutManager f8047b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager2.g f8048c;

    public b(LinearLayoutManager linearLayoutManager) {
        this.f8047b = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrolled(int i, float f10, int i9) {
        if (this.f8048c == null) {
            return;
        }
        float f11 = -f10;
        int i10 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f8047b;
            if (i10 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i10);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException("LayoutManager returned a null child at pos " + i10 + "/" + linearLayoutManager.getChildCount() + " while transforming pages");
            }
            l lVar = (l) this.f8048c;
            com.sumsub.sns.presentation.screen.preview.photo.f.a(lVar.f20096a, lVar.f20097b, childAt, (linearLayoutManager.getPosition(childAt) - i) + f11);
            i10++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
    }
}

package B2;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f286b = carouselLayoutManager;
    }

    @Override // B2.g
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 <= f14 || rectF2.top >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
    }

    @Override // B2.g
    public final float b(RecyclerView.o oVar) {
        return ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
    }

    @Override // B2.g
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(0.0f, f12, f11, f10 - f12);
    }

    @Override // B2.g
    public final int d() {
        return this.f286b.getHeight();
    }

    @Override // B2.g
    public final int e() {
        return this.f286b.getHeight();
    }

    @Override // B2.g
    public final int f() {
        return this.f286b.getPaddingLeft();
    }

    @Override // B2.g
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f286b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // B2.g
    public final int h() {
        return 0;
    }

    @Override // B2.g
    public final int i() {
        return 0;
    }

    @Override // B2.g
    public final void j(View view, int i, int i9) {
        CarouselLayoutManager carouselLayoutManager = this.f286b;
        int paddingLeft = carouselLayoutManager.getPaddingLeft();
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f286b.layoutDecoratedWithMargins(view, paddingLeft, i, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin + paddingLeft, i9);
    }

    @Override // B2.g
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = floor;
            rectF.top = Math.min(rectF.top, floor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = ceil;
            rectF.bottom = Math.max(ceil, rectF.bottom);
        }
    }

    @Override // B2.g
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
    }
}

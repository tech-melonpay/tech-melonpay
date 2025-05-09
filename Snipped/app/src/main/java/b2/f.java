package B2;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f287b = carouselLayoutManager;
    }

    @Override // B2.g
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 <= f14 || rectF2.left >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.right = Math.max(rectF.right - f15, rectF.left);
        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
    }

    @Override // B2.g
    public final float b(RecyclerView.o oVar) {
        return ((ViewGroup.MarginLayoutParams) oVar).rightMargin + ((ViewGroup.MarginLayoutParams) oVar).leftMargin;
    }

    @Override // B2.g
    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(f13, 0.0f, f11 - f13, f10);
    }

    @Override // B2.g
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f287b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // B2.g
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f287b;
        if (carouselLayoutManager.n()) {
            return 0;
        }
        return carouselLayoutManager.getWidth();
    }

    @Override // B2.g
    public final int f() {
        return 0;
    }

    @Override // B2.g
    public final int g() {
        return this.f287b.getWidth();
    }

    @Override // B2.g
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.f287b;
        if (carouselLayoutManager.n()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // B2.g
    public final int i() {
        return this.f287b.getPaddingTop();
    }

    @Override // B2.g
    public final void j(View view, int i, int i9) {
        CarouselLayoutManager carouselLayoutManager = this.f287b;
        int paddingTop = carouselLayoutManager.getPaddingTop();
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f287b.layoutDecoratedWithMargins(view, i, paddingTop, i9, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin + paddingTop);
    }

    @Override // B2.g
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float floor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = floor;
            rectF.left = Math.min(rectF.left, floor);
        }
        if (rectF2.left >= rectF3.right) {
            float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = ceil;
            rectF.right = Math.max(ceil, rectF.right);
        }
    }

    @Override // B2.g
    public final void l(View view, Rect rect, float f10, float f11) {
        view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
    }
}

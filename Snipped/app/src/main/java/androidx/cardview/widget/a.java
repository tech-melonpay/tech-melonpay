package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public final class a implements c {
    public static d o(b bVar) {
        return (d) ((CardView.a) bVar).f5868a;
    }

    @Override // androidx.cardview.widget.c
    public final void a(b bVar, float f10) {
        d o10 = o(bVar);
        if (f10 == o10.f5870a) {
            return;
        }
        o10.f5870a = f10;
        o10.b(null);
        o10.invalidateSelf();
    }

    @Override // androidx.cardview.widget.c
    public final float b(b bVar) {
        return CardView.this.getElevation();
    }

    @Override // androidx.cardview.widget.c
    public final float c(b bVar) {
        return o(bVar).f5870a;
    }

    @Override // androidx.cardview.widget.c
    public final void d(b bVar) {
        n(bVar, o(bVar).f5874e);
    }

    @Override // androidx.cardview.widget.c
    public final void e(b bVar, float f10) {
        CardView.this.setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public final float f(b bVar) {
        return o(bVar).f5874e;
    }

    @Override // androidx.cardview.widget.c
    public final ColorStateList g(b bVar) {
        return o(bVar).f5877h;
    }

    @Override // androidx.cardview.widget.c
    public final void h(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f10 = o(bVar).f5874e;
        float f11 = o(bVar).f5870a;
        CardView cardView = CardView.this;
        int ceil = (int) Math.ceil(e.a(f10, f11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(e.b(f10, f11, cardView.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.c
    public final float i(b bVar) {
        return o(bVar).f5870a * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public final float j(b bVar) {
        return o(bVar).f5870a * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public final void k(CardView.a aVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        d dVar = new d(colorStateList, f10);
        aVar.f5868a = dVar;
        CardView cardView = CardView.this;
        cardView.setBackgroundDrawable(dVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(f11);
        n(aVar, f12);
    }

    @Override // androidx.cardview.widget.c
    public final void l(b bVar) {
        n(bVar, o(bVar).f5874e);
    }

    @Override // androidx.cardview.widget.c
    public final void m(b bVar, ColorStateList colorStateList) {
        d o10 = o(bVar);
        if (colorStateList == null) {
            o10.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        o10.f5877h = colorStateList;
        o10.f5871b.setColor(colorStateList.getColorForState(o10.getState(), o10.f5877h.getDefaultColor()));
        o10.invalidateSelf();
    }

    @Override // androidx.cardview.widget.c
    public final void n(b bVar, float f10) {
        d o10 = o(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f10 != o10.f5874e || o10.f5875f != useCompatPadding || o10.f5876g != preventCornerOverlap) {
            o10.f5874e = f10;
            o10.f5875f = useCompatPadding;
            o10.f5876g = preventCornerOverlap;
            o10.b(null);
            o10.invalidateSelf();
        }
        h(bVar);
    }
}

package A2;

import L2.k;
import T2.d;
import T2.f;
import T2.h;
import T2.i;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f35y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f36z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f37a;

    /* renamed from: c, reason: collision with root package name */
    public final f f39c;

    /* renamed from: d, reason: collision with root package name */
    public final f f40d;

    /* renamed from: e, reason: collision with root package name */
    public int f41e;

    /* renamed from: f, reason: collision with root package name */
    public int f42f;

    /* renamed from: g, reason: collision with root package name */
    public int f43g;

    /* renamed from: h, reason: collision with root package name */
    public int f44h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f45j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f46k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f47l;

    /* renamed from: m, reason: collision with root package name */
    public i f48m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f49n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f50o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f51p;

    /* renamed from: q, reason: collision with root package name */
    public f f52q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f54s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f55t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f56u;

    /* renamed from: v, reason: collision with root package name */
    public final int f57v;

    /* renamed from: w, reason: collision with root package name */
    public final int f58w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f38b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f53r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f59x = 0.0f;

    static {
        f36z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i9) {
        this.f37a = materialCardView;
        f fVar = new f(materialCardView.getContext(), attributeSet, i, i9);
        this.f39c = fVar;
        fVar.k(materialCardView.getContext());
        fVar.q();
        i.a e10 = fVar.f3448a.f3471a.e();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C1279a.f27490g, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            e10.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f40d = new f();
        h(e10.a());
        this.f56u = k.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, C1512a.f30141a);
        this.f57v = k.c(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f58w = k.c(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(Ja.a aVar, float f10) {
        if (aVar instanceof h) {
            return (float) ((1.0d - f35y) * f10);
        }
        if (aVar instanceof d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        Ja.a aVar = this.f48m.f3493a;
        f fVar = this.f39c;
        return Math.max(Math.max(b(aVar, fVar.i()), b(this.f48m.f3494b, fVar.f3448a.f3471a.f3498f.a(fVar.h()))), Math.max(b(this.f48m.f3495c, fVar.f3448a.f3471a.f3499g.a(fVar.h())), b(this.f48m.f3496d, fVar.f3448a.f3471a.f3500h.a(fVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f50o == null) {
            int[] iArr = Q2.a.f3179a;
            this.f52q = new f(this.f48m);
            this.f50o = new RippleDrawable(this.f46k, null, this.f52q);
        }
        if (this.f51p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f50o, this.f40d, this.f45j});
            this.f51p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f51p;
    }

    public final b d(Drawable drawable) {
        int i;
        int i9;
        if (this.f37a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i9 = ceil;
        } else {
            i = 0;
            i9 = 0;
        }
        return new b(drawable, i, i9, i, i9);
    }

    public final void e(int i, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f51p != null) {
            MaterialCardView materialCardView = this.f37a;
            if (materialCardView.getUseCompatPadding()) {
                i10 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i11 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i10 = 0;
                i11 = 0;
            }
            int i14 = this.f43g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i - this.f41e) - this.f42f) - i11 : this.f41e;
            int i16 = (i14 & 80) == 80 ? this.f41e : ((i9 - this.f41e) - this.f42f) - i10;
            int i17 = (i14 & 8388613) == 8388613 ? this.f41e : ((i - this.f41e) - this.f42f) - i11;
            int i18 = (i14 & 80) == 80 ? ((i9 - this.f41e) - this.f42f) - i10 : this.f41e;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (materialCardView.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f51p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(boolean z10, boolean z11) {
        Drawable drawable = this.f45j;
        if (drawable != null) {
            if (!z11) {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f59x = z10 ? 1.0f : 0.0f;
                return;
            }
            float f10 = z10 ? 1.0f : 0.0f;
            float f11 = z10 ? 1.0f - this.f59x : this.f59x;
            ValueAnimator valueAnimator = this.f55t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f55t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f59x, f10);
            this.f55t = ofFloat;
            ofFloat.addUpdateListener(new a(this, 0));
            this.f55t.setInterpolator(this.f56u);
            this.f55t.setDuration((long) ((z10 ? this.f57v : this.f58w) * f11));
            this.f55t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f45j = mutate;
            mutate.setTintList(this.f47l);
            f(this.f37a.isChecked(), false);
        } else {
            this.f45j = f36z;
        }
        LayerDrawable layerDrawable = this.f51p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f45j);
        }
    }

    public final void h(i iVar) {
        this.f48m = iVar;
        f fVar = this.f39c;
        fVar.setShapeAppearanceModel(iVar);
        fVar.f3469w = !fVar.l();
        f fVar2 = this.f40d;
        if (fVar2 != null) {
            fVar2.setShapeAppearanceModel(iVar);
        }
        f fVar3 = this.f52q;
        if (fVar3 != null) {
            fVar3.setShapeAppearanceModel(iVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f37a;
        return materialCardView.getPreventCornerOverlap() && this.f39c.l() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f37a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c2 = j() ? c() : this.f40d;
        this.i = c2;
        if (drawable != c2) {
            MaterialCardView materialCardView = this.f37a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c2);
            } else {
                materialCardView.setForeground(d(c2));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f37a;
        float f10 = 0.0f;
        float a10 = ((materialCardView.getPreventCornerOverlap() && !this.f39c.l()) || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f10 = (float) ((1.0d - f35y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a10 - f10);
        Rect rect = this.f38b;
        materialCardView.setAncestorContentPadding(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void m() {
        boolean z10 = this.f53r;
        MaterialCardView materialCardView = this.f37a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f39c));
        }
        materialCardView.setForeground(d(this.i));
    }
}

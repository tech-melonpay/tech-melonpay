package z2;

import D9.b;
import T2.f;
import T2.i;
import T2.m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialButtonHelper.java */
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f31256a;

    /* renamed from: b, reason: collision with root package name */
    public i f31257b;

    /* renamed from: c, reason: collision with root package name */
    public int f31258c;

    /* renamed from: d, reason: collision with root package name */
    public int f31259d;

    /* renamed from: e, reason: collision with root package name */
    public int f31260e;

    /* renamed from: f, reason: collision with root package name */
    public int f31261f;

    /* renamed from: g, reason: collision with root package name */
    public int f31262g;

    /* renamed from: h, reason: collision with root package name */
    public int f31263h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f31264j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f31265k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f31266l;

    /* renamed from: m, reason: collision with root package name */
    public f f31267m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31271q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f31273s;

    /* renamed from: t, reason: collision with root package name */
    public int f31274t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31268n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31269o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31270p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31272r = true;

    public C1641a(MaterialButton materialButton, i iVar) {
        this.f31256a = materialButton;
        this.f31257b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f31273s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f31273s.getNumberOfLayers() > 2 ? (m) this.f31273s.getDrawable(2) : (m) this.f31273s.getDrawable(1);
    }

    public final f b(boolean z10) {
        RippleDrawable rippleDrawable = this.f31273s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f31273s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f31257b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i, int i9) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        MaterialButton materialButton = this.f31256a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.f31260e;
        int i11 = this.f31261f;
        this.f31261f = i9;
        this.f31260e = i;
        if (!this.f31269o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i10, paddingEnd, (paddingBottom + i9) - i11);
    }

    public final void e() {
        f fVar = new f(this.f31257b);
        MaterialButton materialButton = this.f31256a;
        fVar.k(materialButton.getContext());
        fVar.setTintList(this.f31264j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            fVar.setTintMode(mode);
        }
        float f10 = this.f31263h;
        ColorStateList colorStateList = this.f31265k;
        fVar.s(f10);
        fVar.r(colorStateList);
        f fVar2 = new f(this.f31257b);
        fVar2.setTint(0);
        float f11 = this.f31263h;
        int x9 = this.f31268n ? b.x(R.attr.colorSurface, materialButton) : 0;
        fVar2.s(f11);
        fVar2.r(ColorStateList.valueOf(x9));
        f fVar3 = new f(this.f31257b);
        this.f31267m = fVar3;
        fVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(Q2.a.c(this.f31266l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f31258c, this.f31260e, this.f31259d, this.f31261f), this.f31267m);
        this.f31273s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b9 = b(false);
        if (b9 != null) {
            b9.n(this.f31274t);
            b9.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        f b9 = b(false);
        f b10 = b(true);
        if (b9 != null) {
            float f10 = this.f31263h;
            ColorStateList colorStateList = this.f31265k;
            b9.s(f10);
            b9.r(colorStateList);
            if (b10 != null) {
                float f11 = this.f31263h;
                int x9 = this.f31268n ? b.x(R.attr.colorSurface, this.f31256a) : 0;
                b10.s(f11);
                b10.r(ColorStateList.valueOf(x9));
            }
        }
    }
}

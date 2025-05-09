package com.google.android.material.progressindicator;

import J2.i;
import N2.b;
import N2.d;
import N2.f;
import N2.g;
import N2.h;
import N2.m;
import P2.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.luminary.mobile.R;
import l1.f;
import t2.C1279a;

/* loaded from: classes.dex */
public class CircularProgressIndicator extends b<g> {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083864);
        g gVar = (g) this.f2745a;
        d dVar = new d(gVar);
        Context context2 = getContext();
        m mVar = new m(context2, gVar, dVar, new f(gVar));
        Resources resources = context2.getResources();
        l1.f fVar = new l1.f();
        ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
        fVar.f23479a = resources.getDrawable(R.drawable.indeterminate_static, null);
        new f.h(fVar.f23479a.getConstantState());
        mVar.f2815n = fVar;
        setIndeterminateDrawable(mVar);
        setProgressDrawable(new h(getContext(), gVar, dVar));
    }

    @Override // N2.b
    public final g a(Context context, AttributeSet attributeSet) {
        g gVar = new g(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083864);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = C1279a.f27492j;
        i.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083864);
        i.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083864, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, 2132083864);
        gVar.f2786h = Math.max(c.c(context, obtainStyledAttributes, 11, dimensionPixelSize), gVar.f2760a * 2);
        gVar.i = c.c(context, obtainStyledAttributes, 10, dimensionPixelSize2);
        gVar.f2787j = obtainStyledAttributes.getInt(9, 0);
        obtainStyledAttributes.recycle();
        gVar.a();
        return gVar;
    }

    public int getIndicatorDirection() {
        return ((g) this.f2745a).f2787j;
    }

    public int getIndicatorInset() {
        return ((g) this.f2745a).i;
    }

    public int getIndicatorSize() {
        return ((g) this.f2745a).f2786h;
    }

    public void setIndicatorDirection(int i) {
        ((g) this.f2745a).f2787j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s10 = this.f2745a;
        if (((g) s10).i != i) {
            ((g) s10).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s10 = this.f2745a;
        if (((g) s10).f2786h != max) {
            ((g) s10).f2786h = max;
            ((g) s10).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // N2.b
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((g) this.f2745a).a();
    }
}

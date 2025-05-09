package com.google.android.material.progressindicator;

import J2.i;
import N2.b;
import N2.h;
import N2.m;
import N2.n;
import N2.p;
import N2.r;
import N2.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public class LinearProgressIndicator extends b<s> {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083876);
        s sVar = (s) this.f2745a;
        n nVar = new n(sVar);
        nVar.f2816b = 300.0f;
        Context context2 = getContext();
        setIndeterminateDrawable(new m(context2, sVar, nVar, sVar.f2841h == 0 ? new p(sVar) : new r(context2, sVar)));
        setProgressDrawable(new h(getContext(), sVar, nVar));
    }

    @Override // N2.b
    public final s a(Context context, AttributeSet attributeSet) {
        s sVar = new s(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083876);
        int[] iArr = C1279a.f27500r;
        i.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132083876);
        i.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083876, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132083876);
        sVar.f2841h = obtainStyledAttributes.getInt(0, 1);
        sVar.i = obtainStyledAttributes.getInt(1, 0);
        sVar.f2843k = Math.min(obtainStyledAttributes.getDimensionPixelSize(2, 0), sVar.f2760a);
        obtainStyledAttributes.recycle();
        sVar.a();
        sVar.f2842j = sVar.i == 1;
        return sVar;
    }

    @Override // N2.b
    public final void b(int i, boolean z10) {
        S s10 = this.f2745a;
        if (s10 != 0 && ((s) s10).f2841h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((s) this.f2745a).f2841h;
    }

    public int getIndicatorDirection() {
        return ((s) this.f2745a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((s) this.f2745a).f2843k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        S s10 = this.f2745a;
        s sVar = (s) s10;
        boolean z11 = true;
        if (((s) s10).i != 1) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if ((getLayoutDirection() != 1 || ((s) s10).i != 2) && (getLayoutDirection() != 0 || ((s) s10).i != 3)) {
                z11 = false;
            }
        }
        sVar.f2842j = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i9 - (getPaddingBottom() + getPaddingTop());
        m<s> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h<s> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        S s10 = this.f2745a;
        if (((s) s10).f2841h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((s) s10).f2841h = i;
        ((s) s10).a();
        if (i == 0) {
            m<s> indeterminateDrawable = getIndeterminateDrawable();
            p pVar = new p((s) s10);
            indeterminateDrawable.f2814m = pVar;
            pVar.f2811a = indeterminateDrawable;
        } else {
            m<s> indeterminateDrawable2 = getIndeterminateDrawable();
            r rVar = new r(getContext(), (s) s10);
            indeterminateDrawable2.f2814m = rVar;
            rVar.f2811a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // N2.b
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((s) this.f2745a).a();
    }

    public void setIndicatorDirection(int i) {
        S s10 = this.f2745a;
        ((s) s10).i = i;
        s sVar = (s) s10;
        boolean z10 = true;
        if (i != 1) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if ((getLayoutDirection() != 1 || ((s) s10).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z10 = false;
            }
        }
        sVar.f2842j = z10;
        invalidate();
    }

    @Override // N2.b
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((s) this.f2745a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        S s10 = this.f2745a;
        if (((s) s10).f2843k != i) {
            ((s) s10).f2843k = Math.min(i, ((s) s10).f2760a);
            ((s) s10).a();
            invalidate();
        }
    }
}

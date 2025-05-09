package com.tbuonomo.viewpagerdotsindicator;

import Q8.b;
import Q8.c;
import android.animation.ArgbEvaluator;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: DotsIndicator.kt */
/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DotsIndicator f20367c;

    public a(DotsIndicator dotsIndicator) {
        this.f20367c = dotsIndicator;
        this.f3204a = -1;
        this.f3205b = -1;
    }

    @Override // Q8.c
    public final int a() {
        return this.f20367c.f20345a.size();
    }

    @Override // Q8.c
    public final void c(int i, float f10, int i9) {
        DotsIndicator dotsIndicator = this.f20367c;
        ImageView imageView = dotsIndicator.f20345a.get(i);
        float f11 = 1;
        imageView.getLayoutParams().width = (int) com.google.android.gms.measurement.internal.a.d(f11, f10, (dotsIndicator.i - f11) * dotsIndicator.getDotsSize(), dotsIndicator.getDotsSize());
        imageView.requestLayout();
        ArrayList<ImageView> arrayList = dotsIndicator.f20345a;
        if (i9 >= 0 && i9 < arrayList.size()) {
            ImageView imageView2 = arrayList.get(i9);
            imageView2.getLayoutParams().width = (int) (((dotsIndicator.i - f11) * dotsIndicator.getDotsSize() * f10) + dotsIndicator.getDotsSize());
            imageView2.requestLayout();
            b bVar = (b) imageView.getBackground();
            b bVar2 = (b) imageView2.getBackground();
            if (dotsIndicator.getSelectedDotColor() != dotsIndicator.getDotsColor()) {
                ArgbEvaluator argbEvaluator = dotsIndicator.f20366m;
                int intValue = ((Integer) argbEvaluator.evaluate(f10, Integer.valueOf(dotsIndicator.getSelectedDotColor()), Integer.valueOf(dotsIndicator.getDotsColor()))).intValue();
                bVar2.setColor(((Integer) argbEvaluator.evaluate(f10, Integer.valueOf(dotsIndicator.getDotsColor()), Integer.valueOf(dotsIndicator.getSelectedDotColor()))).intValue());
                if (!dotsIndicator.f20363j || i > dotsIndicator.getPager().b()) {
                    bVar.setColor(intValue);
                } else {
                    bVar.setColor(dotsIndicator.getSelectedDotColor());
                }
            }
        }
        dotsIndicator.invalidate();
    }

    @Override // Q8.c
    public final void d(int i) {
        DotsIndicator dotsIndicator = this.f20367c;
        ImageView imageView = dotsIndicator.f20345a.get(i);
        imageView.getLayoutParams().width = (int) dotsIndicator.getDotsSize();
        imageView.requestLayout();
        dotsIndicator.c(i);
    }
}

package com.tbuonomo.viewpagerdotsindicator;

import Q8.b;
import Q8.d;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.luminary.mobile.R;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.Metadata;

/* compiled from: DotsIndicator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "", "color", "LO9/p;", "setSelectedPointColor", "(I)V", "value", "l", "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "selectedDotColor", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DotsIndicator extends BaseDotsIndicator {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20361n = 0;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f20362h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20363j;

    /* renamed from: k, reason: collision with root package name */
    public final float f20364k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int selectedDotColor;

    /* renamed from: m, reason: collision with root package name */
    public final ArgbEvaluator f20366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20366m = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f20362h = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f20362h;
        addView(linearLayout2 == null ? null : linearLayout2, -2, -2);
        this.i = 2.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f3206a);
            setSelectedDotColor(obtainStyledAttributes.getColor(8, -16711681));
            float f10 = obtainStyledAttributes.getFloat(6, 2.5f);
            this.i = f10;
            if (f10 < 1.0f) {
                Log.w("DotsIndicator", "The dotsWidthFactor can't be set under 1.0f, please set an higher value");
                this.i = 1.0f;
            }
            this.f20363j = obtainStyledAttributes.getBoolean(7, false);
            this.f20364k = obtainStyledAttributes.getDimension(3, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            for (int i = 0; i < 5; i++) {
                a(i);
            }
            d();
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void a(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.dot);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        inflate.setLayoutDirection(0);
        int dotsSize = (int) getDotsSize();
        layoutParams.height = dotsSize;
        layoutParams.width = dotsSize;
        layoutParams.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        b bVar = new b();
        bVar.setCornerRadius(getDotsCornerRadius());
        if (isInEditMode()) {
            bVar.setColor(i == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            bVar.setColor(getPager().b() == i ? this.selectedDotColor : getDotsColor());
        }
        imageView.setBackground(bVar);
        inflate.setOnClickListener(new K7.a(i, 1, this));
        int i9 = (int) (this.f20364k * 0.8f);
        inflate.setPadding(i9, inflate.getPaddingTop(), i9, inflate.getPaddingBottom());
        int i10 = (int) (this.f20364k * 2);
        inflate.setPadding(inflate.getPaddingLeft(), i10, inflate.getPaddingRight(), i10);
        imageView.setElevation(this.f20364k);
        this.f20345a.add(imageView);
        LinearLayout linearLayout = this.f20362h;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.addView(inflate);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final a b() {
        return new a(this);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void c(int i) {
        ImageView imageView = this.f20345a.get(i);
        Drawable background = imageView.getBackground();
        b bVar = background instanceof b ? (b) background : null;
        if (bVar != null) {
            if (i == getPager().b() || (this.f20363j && i < getPager().b())) {
                bVar.setColor(this.selectedDotColor);
            } else {
                bVar.setColor(getDotsColor());
            }
        }
        imageView.setBackground(bVar);
        imageView.invalidate();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void f() {
        LinearLayout linearLayout = this.f20362h;
        LinearLayout linearLayout2 = linearLayout == null ? null : linearLayout;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout2.removeViewAt(linearLayout.getChildCount() - 1);
        this.f20345a.remove(r0.size() - 1);
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.DEFAULT;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        e();
    }

    public final void setSelectedPointColor(int color) {
        setSelectedDotColor(color);
    }
}

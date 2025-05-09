package com.luminary.business.presentation.ui.views;

import J7.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.luminary.mobile.R;
import k0.C0913a;
import m.C1009k;
import s6.a0;

/* compiled from: CodeTextView.kt */
/* loaded from: classes2.dex */
public final class CodeTextView extends C1009k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f13162k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13163a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13164b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13165c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13166d;

    /* renamed from: e, reason: collision with root package name */
    public float f13167e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13168f;

    /* renamed from: g, reason: collision with root package name */
    public int f13169g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13170h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f13171j;

    public CodeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13166d = 10.0f;
        this.f13167e = 7.0f;
        this.f13168f = 8.0f;
        this.f13169g = 7;
        this.f13170h = 1.0f;
        if (attributeSet != null) {
            int i = context.obtainStyledAttributes(attributeSet, a0.f26777b).getInt(0, 6);
            this.f13169g = i;
            this.f13167e = i;
        }
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f13165c = f10;
        this.f13170h *= f10;
        Paint paint = new Paint(getPaint());
        this.i = paint;
        paint.setStrokeWidth(this.f13170h);
        this.i.setColor(C0913a.getColor(context, R.color.black));
        this.i.setAntiAlias(true);
        this.f13163a = Integer.valueOf(C0913a.getColor(context, R.color.transparent));
        C0913a.getColor(context, R.color.black);
        this.f13164b = Integer.valueOf(C0913a.getColor(context, R.color.white));
        C0913a.getColor(context, R.color.white);
        setBackgroundResource(0);
        float f11 = this.f13166d;
        float f12 = this.f13165c;
        this.f13166d = f11 * f12;
        this.f13168f *= f12;
        this.f13167e = this.f13169g;
        super.setOnClickListener(new b(this, 24));
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        int i;
        Editable editable;
        int i9;
        float f10 = 60.0f;
        float f11 = 60.0f * Resources.getSystem().getDisplayMetrics().density;
        float f12 = this.f13167e;
        if (f12 != 3.0f) {
            if (f12 != 5.0f) {
                if (f12 == 6.0f) {
                    f10 = 45.0f;
                } else if (f12 == 7.0f) {
                    f10 = 51.0f;
                }
            }
            f10 = 50.0f;
        }
        TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
        float width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        float f13 = this.f13167e;
        float f14 = (width - ((f13 - 1) * 30)) / f13;
        int paddingLeft = getPaddingLeft();
        float f15 = this.f13165c;
        float f16 = f15 * 8.0f;
        float f17 = f15 * 1.0f;
        Editable text = getText();
        int length = text.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(getText(), 0, length, fArr);
        int i10 = paddingLeft;
        int i11 = 0;
        while (i11 < this.f13167e) {
            if (getText().length() > i11) {
                this.i.setColor(this.f13164b.intValue());
                this.i.setStyle(Paint.Style.FILL);
                float f18 = i10;
                RectF rectF = new RectF(f18 + f17, getPaddingTop() + f17, (f18 + f14) - f17, (getPaddingBottom() + f11) - f17);
                canvas.drawRoundRect(rectF, f16, f16, this.i);
                this.i.setColor(C0913a.getColor(getContext(), R.color.transparent));
                this.i.setStyle(Paint.Style.STROKE);
                canvas.drawRoundRect(rectF, f16, f16, this.i);
                float f19 = 2;
                editable = text;
                i9 = 2;
                i = i11;
                canvas.drawText(text, i11, i11 + 1, ((f14 / f19) + f18) - (fArr[i11] / f19), (this.f13165c * 2.0f) + (f11 / f19) + getPaddingBottom() + this.f13168f, getPaint());
            } else {
                i = i11;
                editable = text;
                i9 = 2;
                this.i.setColor(this.f13164b.intValue());
                this.i.setStyle(Paint.Style.FILL);
                float f20 = i10;
                RectF rectF2 = new RectF(f20 + f17, getPaddingTop() + f17, (f20 + f14) - f17, (getPaddingBottom() + f11) - f17);
                canvas.drawRoundRect(rectF2, f16, f16, this.i);
                this.i.setColor(this.f13163a.intValue());
                this.i.setStyle(Paint.Style.STROKE);
                canvas.drawRoundRect(rectF2, f16, f16, this.i);
            }
            float f21 = this.f13166d;
            i10 += (int) (f21 < 0.0f ? i9 * f14 : f21 + f14);
            i11 = i + 1;
            text = editable;
        }
    }

    public final void setLength(int i) {
        this.f13169g = i;
        this.f13167e = i;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13171j = onClickListener;
    }
}

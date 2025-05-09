package X8;

import V8.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: CodeBlockSpan.java */
/* loaded from: classes2.dex */
public final class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final p f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4047b = g.f4055a;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4048c = g.f4057c;

    public c(p pVar) {
        this.f4046a = pVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z10, Layout layout) {
        int i15;
        Paint paint2 = this.f4048c;
        paint2.setStyle(Paint.Style.FILL);
        this.f4046a.getClass();
        paint2.setColor(Ha.c.F(paint.getColor(), 25));
        if (i9 > 0) {
            i15 = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            i15 = i;
        }
        Rect rect = this.f4047b;
        rect.set(i, i10, i15, i12);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.f4046a.f3758e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f4046a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f4046a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}

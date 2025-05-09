package X8;

import V8.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: HeadingSpan.java */
/* loaded from: classes2.dex */
public final class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final p f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4052b = g.f4055a;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4053c = g.f4057c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4054d;

    public f(p pVar, int i) {
        this.f4051a = pVar;
        this.f4054d = i;
    }

    public final void a(TextPaint textPaint) {
        this.f4051a.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = p.f3753h;
        int i = this.f4054d;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z10, Layout layout) {
        int i15;
        int i16 = this.f4054d;
        if ((i16 == 1 || i16 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i14) {
            Paint paint2 = this.f4053c;
            paint2.set(paint);
            p pVar = this.f4051a;
            pVar.getClass();
            paint2.setColor(Ha.c.F(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i17 = pVar.f3759f;
            if (i17 >= 0) {
                paint2.setStrokeWidth(i17);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i18 = (int) ((i12 - strokeWidth) + 0.5f);
                if (i9 > 0) {
                    i15 = canvas.getWidth();
                } else {
                    i15 = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f4052b;
                rect.set(i, i18, i15, i12);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}

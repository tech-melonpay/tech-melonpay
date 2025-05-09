package X8;

import V8.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: BulletListItemSpan.java */
/* loaded from: classes2.dex */
public final class b implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final p f4041a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4042b = g.f4057c;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f4043c = g.f4056b;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4044d = g.f4055a;

    /* renamed from: e, reason: collision with root package name */
    public final int f4045e;

    public b(p pVar, int i) {
        this.f4041a = pVar;
        this.f4045e = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z10, Layout layout) {
        Rect rect = this.f4044d;
        if (z10 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i13) {
            Paint paint2 = this.f4042b;
            paint2.set(paint);
            p pVar = this.f4041a;
            pVar.getClass();
            int i15 = pVar.f3754a;
            paint2.setColor(paint2.getColor());
            int i16 = pVar.f3756c;
            if (i16 != 0) {
                paint2.setStrokeWidth(i16);
            }
            int save = canvas.save();
            try {
                int min = Math.min(i15, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i17 = pVar.f3757d;
                if (i17 != 0 && i17 <= min) {
                    min = i17;
                }
                int i18 = (i15 - min) / 2;
                if (i9 <= 0) {
                    i -= i15;
                }
                int i19 = i + i18;
                int i20 = i19 + min;
                int descent = (i11 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                int i21 = min + descent;
                int i22 = this.f4045e;
                if (i22 == 0 || i22 == 1) {
                    RectF rectF = this.f4043c;
                    rectF.set(i19, descent, i20, i21);
                    paint2.setStyle(i22 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i19, descent, i20, i21);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.f4041a.f3754a;
    }
}

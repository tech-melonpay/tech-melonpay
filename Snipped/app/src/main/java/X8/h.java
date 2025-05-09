package X8;

import V8.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: OrderedListItemSpan.java */
/* loaded from: classes2.dex */
public final class h implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final p f4058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4059b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4060c = g.f4057c;

    /* renamed from: d, reason: collision with root package name */
    public int f4061d;

    public h(p pVar, String str) {
        this.f4058a = pVar;
        this.f4059b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z10, Layout layout) {
        int i15;
        if (z10 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i13) {
            Paint paint2 = this.f4060c;
            paint2.set(paint);
            p pVar = this.f4058a;
            pVar.getClass();
            paint2.setColor(paint2.getColor());
            int i16 = pVar.f3756c;
            if (i16 != 0) {
                paint2.setStrokeWidth(i16);
            }
            String str = this.f4059b;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i17 = pVar.f3754a;
            if (measureText > i17) {
                this.f4061d = measureText;
                i17 = measureText;
            } else {
                this.f4061d = 0;
            }
            if (i9 > 0) {
                i15 = ((i17 * i9) + i) - measureText;
            } else {
                i15 = (i17 - measureText) + (i9 * i17) + i;
            }
            canvas.drawText(str, i15, i11, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return Math.max(this.f4061d, this.f4058a.f3754a);
    }
}

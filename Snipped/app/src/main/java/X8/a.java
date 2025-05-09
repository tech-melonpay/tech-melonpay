package X8;

import V8.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: BlockQuoteSpan.java */
/* loaded from: classes2.dex */
public final class a implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4037a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4038b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4039c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4040d;

    public a(p pVar, int i) {
        this.f4037a = i;
        switch (i) {
            case 1:
                this.f4039c = g.f4055a;
                this.f4040d = g.f4057c;
                this.f4038b = pVar;
                break;
            default:
                this.f4039c = g.f4055a;
                this.f4040d = g.f4057c;
                this.f4038b = pVar;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z10, Layout layout) {
        int i15;
        switch (this.f4037a) {
            case 0:
                p pVar = this.f4038b;
                int i16 = pVar.f3755b;
                if (i16 == 0) {
                    i16 = (int) ((pVar.f3754a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f4040d;
                paint2.set(paint);
                pVar.getClass();
                int F10 = Ha.c.F(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(F10);
                int i17 = i9 * i16;
                int i18 = i + i17;
                int i19 = i17 + i18;
                int min = Math.min(i18, i19);
                int max = Math.max(i18, i19);
                Rect rect = this.f4039c;
                rect.set(min, i10, max, i12);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int t3 = com.google.android.gms.measurement.internal.a.t(i12, i10, 2, i10);
                Paint paint3 = this.f4040d;
                paint3.set(paint);
                p pVar2 = this.f4038b;
                pVar2.getClass();
                paint3.setColor(Ha.c.F(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i20 = pVar2.f3760g;
                if (i20 >= 0) {
                    paint3.setStrokeWidth(i20);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i9 > 0) {
                    i15 = canvas.getWidth();
                } else {
                    i15 = i;
                    i -= canvas.getWidth();
                }
                int i21 = t3 - strokeWidth;
                int i22 = t3 + strokeWidth;
                Rect rect2 = this.f4039c;
                rect2.set(i, i21, i15, i22);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        switch (this.f4037a) {
            case 0:
                return this.f4038b.f3754a;
            default:
                return 0;
        }
    }
}

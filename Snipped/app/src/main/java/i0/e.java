package I0;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import pa.C1124b;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class e extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final g f1710b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1709a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f1711c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f1712d = 1.0f;

    public e(g gVar) {
        C1124b.p(gVar, "rasterizer cannot be null");
        this.f1710b = gVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i9, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1709a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        g gVar = this.f1710b;
        this.f1712d = abs / (gVar.c().a(14) != 0 ? r8.f2099b.getShort(r1 + r8.f2098a) : (short) 0);
        J0.a c2 = gVar.c();
        int a10 = c2.a(14);
        if (a10 != 0) {
            c2.f2099b.getShort(a10 + c2.f2098a);
        }
        short s10 = (short) ((gVar.c().a(12) != 0 ? r5.f2099b.getShort(r7 + r5.f2098a) : (short) 0) * this.f1712d);
        this.f1711c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}

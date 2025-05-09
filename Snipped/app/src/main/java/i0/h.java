package I0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f1721e;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i9, float f10, int i10, int i11, int i12, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i9, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1721e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1721e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i10, f10 + this.f1711c, i12, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        androidx.emoji2.text.d.a().getClass();
        float f11 = i11;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        g gVar = this.f1710b;
        androidx.emoji2.text.h hVar = gVar.f1719b;
        Typeface typeface = hVar.f6593d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText(hVar.f6591b, gVar.f1718a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }
}

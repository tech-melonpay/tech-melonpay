package X8;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: EmphasisSpan.java */
/* loaded from: classes2.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4050a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4050a) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case 2:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f4050a) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case 2:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }
}

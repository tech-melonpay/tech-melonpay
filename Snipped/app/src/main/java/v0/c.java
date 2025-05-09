package v0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public final class c implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i9, Class<T> cls) {
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        s3.b.s(i, i9, cls);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i9, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        s3.b.u(obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i9, int i10) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        s3.b.r(i, i9, i10, obj);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i9) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f30522a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f30523b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30524c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30525d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i9) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = b.d(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i9);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                textDirection.build();
            }
            this.f30522a = textPaint;
            this.f30523b = textDirectionHeuristic;
            this.f30524c = i;
            this.f30525d = i9;
        }

        public final boolean a(a aVar) {
            if (this.f30524c != aVar.f30524c || this.f30525d != aVar.f30525d) {
                return false;
            }
            TextPaint textPaint = this.f30522a;
            if (textPaint.getTextSize() != aVar.f30522a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f30522a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f30523b == aVar.f30523b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f30522a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f30523b, Integer.valueOf(this.f30524c), Integer.valueOf(this.f30525d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f30522a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb2.append(", textDir=" + this.f30523b);
            sb2.append(", breakStrategy=" + this.f30524c);
            sb2.append(", hyphenationFrequency=" + this.f30525d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f30522a = textPaint;
            textDirection = params.getTextDirection();
            this.f30523b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f30524c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f30525d = hyphenationFrequency;
        }
    }
}

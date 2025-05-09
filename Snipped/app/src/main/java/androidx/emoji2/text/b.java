package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.d;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
public final class b implements d.e {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f6544b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f6545a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f6545a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

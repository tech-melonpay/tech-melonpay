package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f9610a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f9611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9612c;

    /* renamed from: d, reason: collision with root package name */
    public int f9613d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9619k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f9614e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f9615f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f9616g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f9617h = 1.0f;
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9618j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f9620l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f9610a = charSequence;
        this.f9611b = textPaint;
        this.f9612c = i;
        this.f9613d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f9610a == null) {
            this.f9610a = "";
        }
        int max = Math.max(0, this.f9612c);
        CharSequence charSequence = this.f9610a;
        int i = this.f9615f;
        TextPaint textPaint = this.f9611b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f9620l);
        }
        int min = Math.min(charSequence.length(), this.f9613d);
        this.f9613d = min;
        if (this.f9619k && this.f9615f == 1) {
            this.f9614e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f9614e);
        obtain.setIncludePad(this.f9618j);
        obtain.setTextDirection(this.f9619k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f9620l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f9615f);
        float f10 = this.f9616g;
        if (f10 != 0.0f || this.f9617h != 1.0f) {
            obtain.setLineSpacing(f10, this.f9617h);
        }
        if (this.f9615f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        return obtain.build();
    }
}

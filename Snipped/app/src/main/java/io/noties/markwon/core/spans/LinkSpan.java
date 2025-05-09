package io.noties.markwon.core.spans;

import U8.c;
import V8.p;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* loaded from: classes2.dex */
public class LinkSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    public final p f21679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21680b;

    /* renamed from: c, reason: collision with root package name */
    public final c f21681c;

    public LinkSpan(p pVar, String str, c cVar) {
        super(str);
        this.f21679a = pVar;
        this.f21680b = str;
        this.f21681c = cVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f21681c.resolve(view, this.f21680b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f21679a.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}

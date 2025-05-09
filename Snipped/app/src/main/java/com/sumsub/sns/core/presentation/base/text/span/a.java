package com.sumsub.sns.core.presentation.base.text.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* loaded from: classes2.dex */
public abstract class a extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

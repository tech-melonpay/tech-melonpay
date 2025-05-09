package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "color", "LO9/p;", "setProgressBackgroundColor", "(I)V", "setProgressBarColor", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", TextBundle.TEXT_ENTRY, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSProgressView extends ConstraintLayout {
    public SNSProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) findViewById(R$id.sns_progress_bar);
    }

    public final CharSequence getText() {
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setProgressBackgroundColor(int color) {
        View findViewById = findViewById(R$id.sns_progress_bg);
        Drawable background = findViewById != null ? findViewById.getBackground() : null;
        T2.f fVar = background instanceof T2.f ? (T2.f) background : null;
        if (fVar != null) {
            fVar.setTint(color);
        }
    }

    public final void setProgressBarColor(int color) {
        ProgressBar progressBar = getProgressBar();
        if (progressBar == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(color));
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public /* synthetic */ SNSProgressView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_ProgressViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSProgressView : i9);
    }

    public SNSProgressView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        Integer a10;
        Integer a11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSProgressView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSProgressView_sns_progressViewLayout, 0), (ViewGroup) this, true);
        int i10 = R$styleable.SNSProgressView_sns_dimColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            setBackgroundColor(i.a(obtainStyledAttributes, context, i10).getDefaultColor());
        }
        T2.f fVar = new T2.f(context, attributeSet, i, i9);
        int i11 = R$styleable.SNSProgressView_sns_progressBackgroundColor;
        if (obtainStyledAttributes.hasValue(i11)) {
            fVar.setTint(i.a(obtainStyledAttributes, context, i11).getDefaultColor());
        }
        View findViewById = findViewById(R$id.sns_progress_bg);
        if (findViewById != null) {
            findViewById.setBackground(fVar);
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        com.sumsub.sns.internal.core.theme.d a12 = aVar.a();
        if (a12 != null && (a11 = aVar.a(a12, sNSColorElement, aVar.a(this))) != null) {
            int intValue = a11.intValue();
            setBackground(new ColorDrawable(intValue));
            setProgressBackgroundColor(intValue);
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_NEUTRAL;
        com.sumsub.sns.internal.core.theme.d a13 = aVar.a();
        if (a13 == null || (a10 = aVar.a(a13, sNSColorElement2, aVar.a(this))) == null) {
            return;
        }
        setProgressBarColor(a10.intValue());
    }
}

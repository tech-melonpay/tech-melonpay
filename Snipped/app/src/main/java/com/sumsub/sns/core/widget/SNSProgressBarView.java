package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.luminary.mobile.R;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$Size;
import com.sumsub.sns.internal.core.theme.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSProgressBarView;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "LO9/p;", "onMeasure", "(II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSProgressBarView extends ProgressBar {
    public SNSProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Map<String, com.sumsub.sns.internal.core.theme.b> c2;
        com.sumsub.sns.internal.core.theme.d a10 = com.sumsub.sns.core.presentation.helper.a.f14273a.a();
        Object obj = (a10 == null || (c2 = a10.c()) == null) ? null : (com.sumsub.sns.internal.core.theme.b) c2.get(SNSMetricElement.ACTIVITY_INDICATOR_STYLE.getValue());
        b.f fVar = obj instanceof b.f ? (b.f) obj : null;
        if (fVar == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        String b9 = fVar.b();
        int dimensionPixelSize = kotlin.jvm.internal.f.b(b9, SNSThemeMetric$Size.LARGE.getValue()) ? getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_large) : kotlin.jvm.internal.f.b(b9, SNSThemeMetric$Size.SMALL.getValue()) ? getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_small) : getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_medium);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + dimensionPixelSize, getPaddingTop() + getPaddingBottom() + dimensionPixelSize);
    }

    public /* synthetic */ SNSProgressBarView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.progressBarStyle : i);
    }

    public SNSProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

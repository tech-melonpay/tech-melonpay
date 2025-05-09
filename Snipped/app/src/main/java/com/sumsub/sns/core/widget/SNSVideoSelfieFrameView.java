package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSVideoSelfieFrameView;", "Lcom/sumsub/sns/core/widget/SNSFrameView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSVideoSelfieFrameView extends SNSFrameView {
    public SNSVideoSelfieFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ SNSVideoSelfieFrameView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_FrameViewStyle : i, (i10 & 8) != 0 ? R$style.SNSVideoSelfieFrameViewStyle : i9);
    }

    public SNSVideoSelfieFrameView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Integer a10;
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a11 = aVar.a(this, SNSColorElement.CONTENT_INFO);
        int intValue = a11 != null ? a11.intValue() : context.getResources().getColor(R$color.sns_color_primary_50, context.getTheme());
        Float a12 = aVar.a(SNSMetricElement.VIEWPORT_BORDER_WIDTH);
        setStroke(a12 != null ? (int) a12.floatValue() : context.getResources().getDimensionPixelSize(R$dimen.sns_viewport_border_width), intValue);
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        com.sumsub.sns.internal.core.theme.d a13 = aVar.a();
        if (a13 == null || (a10 = aVar.a(a13, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        setFillColor(a10.intValue());
    }
}

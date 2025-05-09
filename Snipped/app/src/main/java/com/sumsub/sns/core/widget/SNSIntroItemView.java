package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSIntroItemView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public class SNSIntroItemView extends SNSStepView {
    public /* synthetic */ SNSIntroItemView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_IntroItemViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSIntroItemView : i9);
    }

    public SNSIntroItemView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9, null);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 != null) {
            Integer a11 = aVar.a(this, SNSColorElement.CONTENT_SUCCESS);
            Integer a12 = aVar.a(this, SNSColorElement.CONTENT_CRITICAL);
            Integer a13 = aVar.a(this, SNSColorElement.CONTENT_NEUTRAL);
            int[][] iArr = {new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[0]};
            if (a11 != null && a12 != null && a13 != null) {
                setTitleTextColor(new ColorStateList(iArr, new int[]{a11.intValue(), a12.intValue(), a13.intValue()}));
                setSubtitleTextColor(ColorStateList.valueOf(a13.intValue()));
            }
            Integer a14 = aVar.a(this, SNSColorElement.BACKGROUND_NEUTRAL);
            if (a14 != null) {
                setCardBackgroundColor(ColorStateList.valueOf(a14.intValue()));
            }
            Float a15 = aVar.a(a10, SNSMetricElement.CARD_CORNER_RADIUS);
            if (a15 != null) {
                setRadius(a15.floatValue());
            }
        }
    }
}

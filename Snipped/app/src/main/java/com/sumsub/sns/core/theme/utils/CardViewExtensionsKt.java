package com.sumsub.sns.core.theme.utils;

import com.google.android.material.card.MaterialCardView;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.internal.log.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/material/card/MaterialCardView;", "Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;", "style", "LO9/p;", "applyStyle", "(Lcom/google/android/material/card/MaterialCardView;Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;)V", "idensic-mobile-sdk-aar_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CardViewExtensionsKt {
    public static final void applyStyle(MaterialCardView materialCardView, SNSThemeMetric$CardStyle sNSThemeMetric$CardStyle) {
        if (sNSThemeMetric$CardStyle != SNSThemeMetric$CardStyle.BORDERED) {
            Logger.w$default(a.f17535a, "Theme", "applyStyle: " + sNSThemeMetric$CardStyle + " NOT supported", null, 4, null);
            return;
        }
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a10 = aVar.a(materialCardView, SNSColorElement.CONTENT_INFO);
        Integer a11 = aVar.a(materialCardView, SNSColorElement.CONTENT_WEAK);
        if (!materialCardView.isSelected()) {
            a10 = a11;
        }
        if (a10 != null) {
            materialCardView.setStrokeColor(a10.intValue());
        }
    }
}

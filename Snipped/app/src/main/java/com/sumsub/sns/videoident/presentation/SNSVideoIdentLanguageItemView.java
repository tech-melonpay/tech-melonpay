package com.sumsub.sns.videoident.presentation;

import android.content.Context;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.utils.CardViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSStepView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentLanguageItemView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "drawableStateChanged", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSVideoIdentLanguageItemView extends SNSStepView {
    public SNSVideoIdentLanguageItemView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        SNSMetricElement sNSMetricElement;
        super.drawableStateChanged();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 == null) {
            return;
        }
        sNSMetricElement = SNSVideoIdentLanguageItemViewKt.DEFAULT_CARD_STYLE;
        String c2 = aVar.c(a10, sNSMetricElement);
        SNSThemeMetric$CardStyle sNSThemeMetric$CardStyle = SNSThemeMetric$CardStyle.BORDERED;
        if (f.b(c2, sNSThemeMetric$CardStyle.getValue())) {
            CardViewExtensionsKt.applyStyle(this, sNSThemeMetric$CardStyle);
        }
    }

    public SNSVideoIdentLanguageItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SNSVideoIdentLanguageItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ SNSVideoIdentLanguageItemView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_VideoIdentLanguageItemViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSVideoIdentLanguageItemView : i9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SNSVideoIdentLanguageItemView(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            com.sumsub.sns.core.theme.SNSMetricElement r5 = com.sumsub.sns.videoident.presentation.SNSVideoIdentLanguageItemViewKt.access$getDEFAULT_CARD_STYLE$p()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.videoident.presentation.SNSVideoIdentLanguageItemView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}

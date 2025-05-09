package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.utils.CardViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSVideoIdentDocumentView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "drawableStateChanged", "()V", "defaultStrokeWidth", "I", "activatedStrokeWidth", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoIdentDocumentView extends SNSStepView {
    private int activatedStrokeWidth;
    private int defaultStrokeWidth;

    public /* synthetic */ SNSVideoIdentDocumentView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_VideoIdentDocumentViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSVideoIdentDocumentView : i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        SNSMetricElement sNSMetricElement;
        super.drawableStateChanged();
        setStrokeWidth(isActivated() ? this.activatedStrokeWidth : this.defaultStrokeWidth);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 == null) {
            return;
        }
        sNSMetricElement = SNSVideoIdentDocumentViewKt.DEFAULT_CARD_STYLE;
        String c2 = aVar.c(a10, sNSMetricElement);
        SNSThemeMetric$CardStyle sNSThemeMetric$CardStyle = SNSThemeMetric$CardStyle.BORDERED;
        if (kotlin.jvm.internal.f.b(c2, sNSThemeMetric$CardStyle.getValue())) {
            CardViewExtensionsKt.applyStyle(this, sNSThemeMetric$CardStyle);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SNSVideoIdentDocumentView(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            com.sumsub.sns.core.theme.SNSMetricElement r5 = com.sumsub.sns.core.widget.SNSVideoIdentDocumentViewKt.access$getDEFAULT_CARD_STYLE$p()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            int[] r0 = com.sumsub.sns.R$styleable.SNSVideoIdentDocumentView
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r0, r9, r10)
            int r8 = com.sumsub.sns.R$styleable.SNSVideoIdentDocumentView_sns_stepStrokeWidthDefault
            boolean r9 = r7.hasValue(r8)
            r10 = 0
            if (r9 == 0) goto L24
            int r8 = r7.getDimensionPixelSize(r8, r10)
            r6.defaultStrokeWidth = r8
            r6.setStrokeWidth(r8)
        L24:
            int r8 = com.sumsub.sns.R$styleable.SNSVideoIdentDocumentView_sns_stepStrokeWidthActivated
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto L32
            int r8 = r7.getDimensionPixelSize(r8, r10)
            r6.activatedStrokeWidth = r8
        L32:
            O9.p r8 = O9.p.f3034a
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.SNSVideoIdentDocumentView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}

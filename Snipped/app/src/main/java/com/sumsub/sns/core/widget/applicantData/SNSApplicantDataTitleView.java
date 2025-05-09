package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import ca.InterfaceC0646l;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.internal.core.theme.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bRF\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTitleView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/core/widget/SNSH1TextView;", "titleView", "Lcom/sumsub/sns/core/widget/SNSH1TextView;", "Lkotlin/Function1;", "", "LO9/p;", "value", "onLinkClicked", "Lca/l;", "getOnLinkClicked", "()Lca/l;", "setOnLinkClicked", "(Lca/l;)V", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataTitleView extends SNSApplicantDataBaseFieldView {
    private InterfaceC0646l<? super String, p> onLinkClicked;
    private final SNSH1TextView titleView;

    public SNSApplicantDataTitleView(Context context) {
        super(context, null, 0, 0, 14, null);
        String c2;
        removeAllViews();
        SNSH1TextView sNSH1TextView = new SNSH1TextView(context, null, 0, 0, 14, null);
        sNSH1TextView.setPadding(sNSH1TextView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium), sNSH1TextView.getPaddingRight(), sNSH1TextView.getPaddingBottom());
        sNSH1TextView.setGravity(17);
        this.titleView = sNSH1TextView;
        sNSH1TextView.setLayoutParams(new ConstraintLayout.a(-1));
        addView(sNSH1TextView);
        onInitializationFinished();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 == null || (c2 = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            return;
        }
        aVar.a(sNSH1TextView, c2);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView != null) {
            return sNSH1TextView.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public InterfaceC0646l<String, p> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView == null) {
            return;
        }
        sNSH1TextView.setText(charSequence);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnLinkClicked(InterfaceC0646l<? super String, p> interfaceC0646l) {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView != null) {
            com.sumsub.sns.core.common.b.a(sNSH1TextView, interfaceC0646l);
        }
        this.onLinkClicked = interfaceC0646l;
    }
}

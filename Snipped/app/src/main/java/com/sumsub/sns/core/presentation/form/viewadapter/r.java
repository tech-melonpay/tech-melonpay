package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSubtitleView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public final class r extends k<FormItem, SNSApplicantDataSubtitleView> {
    public r(SNSApplicantDataSubtitleView sNSApplicantDataSubtitleView) {
        super(sNSApplicantDataSubtitleView);
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataSubtitleView sNSApplicantDataSubtitleView, FormItem formItem, int i) {
        sNSApplicantDataSubtitleView.setLabel(formItem.d().x());
    }
}

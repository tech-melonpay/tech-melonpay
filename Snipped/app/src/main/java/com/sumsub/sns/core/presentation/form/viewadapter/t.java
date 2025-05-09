package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTitleView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public final class t extends k<FormItem, SNSApplicantDataTitleView> {
    public t(SNSApplicantDataTitleView sNSApplicantDataTitleView) {
        super(sNSApplicantDataTitleView);
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataTitleView sNSApplicantDataTitleView, FormItem formItem, int i) {
        sNSApplicantDataTitleView.setLabel(formItem.d().x());
    }
}

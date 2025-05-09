package com.sumsub.sns.core.presentation.form.viewadapter;

import android.content.Context;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDescriptionView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public final class g extends k<FormItem, SNSApplicantDataDescriptionView> {
    public g(SNSApplicantDataDescriptionView sNSApplicantDataDescriptionView) {
        super(sNSApplicantDataDescriptionView);
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataDescriptionView sNSApplicantDataDescriptionView, FormItem formItem, int i) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.k d10 = formItem.d();
        Context context = sNSApplicantDataDescriptionView.getContext();
        String x9 = d10.x();
        sNSApplicantDataDescriptionView.setLabel(x9 != null ? com.sumsub.sns.internal.core.common.i.a(x9, context) : null);
    }
}

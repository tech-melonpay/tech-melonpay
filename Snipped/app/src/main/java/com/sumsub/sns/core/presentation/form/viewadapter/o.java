package com.sumsub.sns.core.presentation.form.viewadapter;

import android.content.Context;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSectionView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public final class o extends k<FormItem, SNSApplicantDataSectionView> {
    public o(SNSApplicantDataSectionView sNSApplicantDataSectionView) {
        super(sNSApplicantDataSectionView);
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataSectionView sNSApplicantDataSectionView, FormItem formItem, int i) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.k d10 = formItem.d();
        Context context = sNSApplicantDataSectionView.getContext();
        String l10 = d10.l();
        sNSApplicantDataSectionView.setDescription(l10 != null ? com.sumsub.sns.internal.core.common.i.a(l10, context) : null);
    }
}

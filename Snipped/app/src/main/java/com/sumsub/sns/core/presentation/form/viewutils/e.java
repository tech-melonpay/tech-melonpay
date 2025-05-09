package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class e {
    public static final void a(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, FormItem.g gVar, String str) {
        if (sNSApplicantDataFileFieldView == null) {
            return;
        }
        if (str != null) {
            sNSApplicantDataFileFieldView.setFiles(Collections.singletonList(new SNSApplicantDataFileFieldView.Attachment(str, str, gVar.v())));
        }
        if (gVar.f() == null) {
            sNSApplicantDataFileFieldView.setFiles(EmptyList.f23104a);
        }
        sNSApplicantDataFileFieldView.setShowPickFile(sNSApplicantDataFileFieldView.getFiles().isEmpty());
    }
}

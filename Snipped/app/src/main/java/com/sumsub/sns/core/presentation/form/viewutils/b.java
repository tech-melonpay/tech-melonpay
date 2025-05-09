package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public static final void a(SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, FormItem.c cVar, String str) {
        Map<String, String> r8 = cVar.r();
        if (str == null) {
            str = "";
        }
        String str2 = r8.get(str);
        sNSApplicantDataSelectionCountryFieldView.setValue(str2 != null ? str2 : "");
    }
}

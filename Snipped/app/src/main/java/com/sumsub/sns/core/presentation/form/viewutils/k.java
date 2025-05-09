package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.internal.core.data.model.h;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k {
    public static final void a(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, String str) {
        Object obj;
        Iterator<T> it = sNSApplicantDataRadioGroupView.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.f.b(((h.e.a.C0209a) obj).c(), str)) {
                    break;
                }
            }
        }
        sNSApplicantDataRadioGroupView.setSelectedItem((h.e.a.C0209a) obj);
    }
}

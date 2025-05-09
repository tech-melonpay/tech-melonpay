package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j {
    public static final void a(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, String str) {
        Object obj;
        Iterator<T> it = sNSApplicantDataSelectionFieldView.getItems().iterator();
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
        sNSApplicantDataSelectionFieldView.setSelectedItem((h.e.a.C0209a) obj);
    }
}

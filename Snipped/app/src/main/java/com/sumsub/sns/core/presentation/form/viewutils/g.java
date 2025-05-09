package com.sumsub.sns.core.presentation.form.viewutils;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g {
    public static final void a(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, FormItem.j jVar, List<String> list) {
        h.e.a.C0209a c0209a;
        Object obj;
        List<r> r8 = jVar.d().r();
        if (r8 == null || list == null || sNSApplicantDataMutilselectFieldView == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<T> it = r8.iterator();
            while (true) {
                c0209a = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.f.b(str, ((r) obj).e())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r rVar = (r) obj;
            if (rVar != null) {
                String e10 = rVar.e();
                if (e10 == null) {
                    e10 = "";
                }
                String c2 = rVar.c();
                c0209a = new h.e.a.C0209a(e10, c2 != null ? c2 : "");
            }
            if (c0209a != null) {
                arrayList.add(c0209a);
            }
        }
        sNSApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
    }
}

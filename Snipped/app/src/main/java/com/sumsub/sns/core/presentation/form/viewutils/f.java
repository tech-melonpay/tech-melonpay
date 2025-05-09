package com.sumsub.sns.core.presentation.form.viewutils;

import P9.n;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class f {
    public static final void a(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, FormItem.i iVar, List<String> list) {
        int B10;
        if (sNSApplicantDataFileFieldView == null) {
            return;
        }
        boolean z10 = true;
        if (list != null) {
            List<String> list2 = list.isEmpty() ^ true ? list : null;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(n.u(list2, 10));
                for (String str : list2) {
                    Map<String, String> w2 = iVar.w();
                    arrayList.add(new SNSApplicantDataFileFieldView.Attachment(str, str, w2 != null ? w2.get(str) : null));
                }
                sNSApplicantDataFileFieldView.setFiles(arrayList);
            }
        }
        if (list == null) {
            sNSApplicantDataFileFieldView.setFiles(EmptyList.f23104a);
        }
        p a10 = com.sumsub.sns.internal.core.presentation.form.model.g.a(iVar.d());
        if (!(a10 instanceof p.h)) {
            if (a10 instanceof p.d) {
                B10 = U4.b.B(((p.d) a10).a().c() - sNSApplicantDataFileFieldView.getFiles().size());
            }
            sNSApplicantDataFileFieldView.setShowPickFile(z10);
        }
        B10 = U4.b.B(((p.h) a10).a() - sNSApplicantDataFileFieldView.getFiles().size());
        if (B10 <= 0) {
            z10 = false;
        }
        sNSApplicantDataFileFieldView.setShowPickFile(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView r8, com.sumsub.sns.internal.core.presentation.form.model.FormItem.i r9) {
        /*
            com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView r8 = (com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView) r8
            java.util.List r8 = r8.getFiles()
            boolean r8 = r8.isEmpty()
            r0 = 1
            r8 = r8 ^ r0
            com.sumsub.sns.internal.core.data.source.applicant.remote.k r1 = r9.d()
            com.sumsub.sns.internal.core.data.model.p r1 = com.sumsub.sns.internal.core.presentation.form.model.g.a(r1)
            r2 = 0
            if (r1 == 0) goto L45
            boolean r3 = r1 instanceof com.sumsub.sns.internal.core.data.model.p.d
            if (r3 == 0) goto L2b
            r3 = r1
            com.sumsub.sns.internal.core.data.model.p$d r3 = (com.sumsub.sns.internal.core.data.model.p.d) r3
            com.sumsub.sns.internal.core.data.source.applicant.remote.h r3 = r3.a()
            double r3 = r3.d()
            int r3 = (int) r3
            if (r3 <= 0) goto L2b
            r3 = r0
            goto L2c
        L2b:
            r3 = r2
        L2c:
            boolean r4 = r1 instanceof com.sumsub.sns.internal.core.data.model.p.j
            if (r4 == 0) goto L3e
            com.sumsub.sns.internal.core.data.model.p$j r1 = (com.sumsub.sns.internal.core.data.model.p.j) r1
            double r4 = r1.a()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L3e
            r1 = r0
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r3 != 0) goto L43
            if (r1 == 0) goto L45
        L43:
            r1 = r0
            goto L46
        L45:
            r1 = r2
        L46:
            boolean r9 = r9.j()
            if (r9 != 0) goto L52
            if (r8 == 0) goto L51
            if (r1 == 0) goto L51
            goto L52
        L51:
            r0 = r2
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.form.viewutils.f.a(com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView, com.sumsub.sns.internal.core.presentation.form.model.FormItem$i):boolean");
    }
}

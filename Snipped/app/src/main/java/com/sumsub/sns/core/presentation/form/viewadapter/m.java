package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0635a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class m extends k<FormItem.j, SNSApplicantDataMutilselectFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14242b;

    public static final class a extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.j f14244b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataMutilselectFieldView f14245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem.j jVar, SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView) {
            super(0);
            this.f14244b = jVar;
            this.f14245c = sNSApplicantDataMutilselectFieldView;
        }

        public final void a() {
            com.sumsub.sns.core.presentation.form.c d10 = m.this.d();
            if (d10 != null) {
                FormItem.j jVar = this.f14244b;
                d10.a(jVar, com.sumsub.sns.core.presentation.form.g.c(this.f14245c, jVar));
            }
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    public m(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataMutilselectFieldView);
        this.f14242b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14242b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView] */
    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, FormItem.j jVar, int i) {
        ?? r02;
        List<com.sumsub.sns.internal.core.data.source.applicant.remote.r> r8 = jVar.d().r();
        if (r8 != null) {
            r02 = new ArrayList(P9.n.u(r8, 10));
            int i9 = 0;
            for (Object obj : r8) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    P9.m.t();
                    throw null;
                }
                com.sumsub.sns.internal.core.data.source.applicant.remote.r rVar = (com.sumsub.sns.internal.core.data.source.applicant.remote.r) obj;
                String e10 = rVar.e();
                if (e10 == null) {
                    e10 = String.valueOf(i9);
                }
                String c2 = rVar.c();
                if (c2 == null) {
                    c2 = String.valueOf(i9);
                }
                r02.add(new h.e.a.C0209a(e10, c2));
                i9 = i10;
            }
        } else {
            r02 = EmptyList.f23104a;
        }
        sNSApplicantDataMutilselectFieldView.setItems(r02);
        sNSApplicantDataMutilselectFieldView.setOnSelectionChanged(new a(jVar, sNSApplicantDataMutilselectFieldView));
    }
}

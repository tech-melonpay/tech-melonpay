package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class p extends k<FormItem.n, SNSApplicantDataSelectionFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14259b;

    public static final class a extends Lambda implements InterfaceC0646l<h.e.a.C0209a, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.n f14261b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataSelectionFieldView f14262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem.n nVar, SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView) {
            super(1);
            this.f14261b = nVar;
            this.f14262c = sNSApplicantDataSelectionFieldView;
        }

        public final void a(h.e.a.C0209a c0209a) {
            com.sumsub.sns.core.presentation.form.c d10 = p.this.d();
            if (d10 != null) {
                FormItem.n nVar = this.f14261b;
                d10.b(nVar, com.sumsub.sns.core.presentation.form.g.b(this.f14262c, nVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(h.e.a.C0209a c0209a) {
            a(c0209a);
            return O9.p.f3034a;
        }
    }

    public p(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataSelectionFieldView);
        this.f14259b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14259b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView] */
    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, FormItem.n nVar, int i) {
        ?? r02;
        List<com.sumsub.sns.internal.core.data.source.applicant.remote.r> r8 = nVar.d().r();
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
        sNSApplicantDataSelectionFieldView.setItems(r02);
        sNSApplicantDataSelectionFieldView.setOnSelectedCallback(new a(nVar, sNSApplicantDataSelectionFieldView));
    }
}

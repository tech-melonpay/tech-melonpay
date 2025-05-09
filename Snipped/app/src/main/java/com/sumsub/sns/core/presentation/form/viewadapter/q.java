package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class q extends k<FormItem.m, SNSApplicantDataRadioGroupView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14263b;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataRadioGroupView f14264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.m f14265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f14266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, FormItem.m mVar, q qVar) {
            super(1);
            this.f14264a = sNSApplicantDataRadioGroupView;
            this.f14265b = mVar;
            this.f14266c = qVar;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10;
            if (!com.sumsub.sns.core.presentation.form.g.a(this.f14264a, this.f14265b) || (d10 = this.f14266c.d()) == null) {
                return;
            }
            d10.b(this.f14265b, str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public q(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataRadioGroupView);
        this.f14263b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14263b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView] */
    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, FormItem.m mVar, int i) {
        ?? r02;
        List<com.sumsub.sns.internal.core.data.source.applicant.remote.r> r8 = mVar.d().r();
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
        sNSApplicantDataRadioGroupView.setItems(r02);
        sNSApplicantDataRadioGroupView.setOnSelectionChanged(new a(sNSApplicantDataRadioGroupView, mVar, this));
    }
}

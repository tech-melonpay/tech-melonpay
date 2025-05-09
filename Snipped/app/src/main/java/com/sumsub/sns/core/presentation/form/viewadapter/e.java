package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class e extends k<FormItem.e, SNSApplicantDataDateTimeFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14215b;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.e f14217b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataDateTimeFieldView f14218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem.e eVar, SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView) {
            super(1);
            this.f14217b = eVar;
            this.f14218c = sNSApplicantDataDateTimeFieldView;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10 = e.this.d();
            if (d10 != null) {
                FormItem.e eVar = this.f14217b;
                d10.b(eVar, com.sumsub.sns.core.presentation.form.g.b(this.f14218c, eVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public e(SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataDateTimeFieldView);
        this.f14215b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14215b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView, FormItem.e eVar, int i) {
        sNSApplicantDataDateTimeFieldView.setTextChangedCallback(new a(eVar, sNSApplicantDataDateTimeFieldView));
    }
}

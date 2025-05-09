package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends k<FormItem.a, SNSApplicantDataBoolFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14201b;

    /* renamed from: com.sumsub.sns.core.presentation.form.viewadapter.a$a, reason: collision with other inner class name */
    public static final class C0166a extends Lambda implements InterfaceC0646l<Boolean, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.a f14203b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataBoolFieldView f14204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0166a(FormItem.a aVar, SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView) {
            super(1);
            this.f14203b = aVar;
            this.f14204c = sNSApplicantDataBoolFieldView;
        }

        public final void a(boolean z10) {
            com.sumsub.sns.core.presentation.form.c d10 = a.this.d();
            if (d10 != null) {
                FormItem.a aVar = this.f14203b;
                d10.b(aVar, com.sumsub.sns.core.presentation.form.g.b(this.f14204c, aVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Boolean bool) {
            a(bool.booleanValue());
            return O9.p.f3034a;
        }
    }

    public a(SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataBoolFieldView);
        this.f14201b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14201b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, FormItem.a aVar, int i) {
        sNSApplicantDataBoolFieldView.setOnCheckedChanged(new C0166a(aVar, sNSApplicantDataBoolFieldView));
    }
}

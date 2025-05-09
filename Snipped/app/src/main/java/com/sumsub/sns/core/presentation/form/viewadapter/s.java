package com.sumsub.sns.core.presentation.form.viewadapter;

import android.text.Editable;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTextAreaFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class s extends k<FormItem.q, SNSApplicantDataTextAreaFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14267b;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataTextAreaFieldView f14268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f14269b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FormItem.q f14270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, s sVar, FormItem.q qVar) {
            super(1);
            this.f14268a = sNSApplicantDataTextAreaFieldView;
            this.f14269b = sVar;
            this.f14270c = qVar;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10;
            EditText editText = this.f14268a.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            if (text != null && text.length() != 0 && (d10 = this.f14269b.d()) != null) {
                d10.c(this.f14270c);
            }
            com.sumsub.sns.core.presentation.form.c d11 = this.f14269b.d();
            if (d11 != null) {
                FormItem.q qVar = this.f14270c;
                d11.b(qVar, com.sumsub.sns.core.presentation.form.g.b(this.f14268a, qVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public s(SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataTextAreaFieldView);
        this.f14267b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14267b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataTextAreaFieldView sNSApplicantDataTextAreaFieldView, FormItem.q qVar, int i) {
        sNSApplicantDataTextAreaFieldView.setTextChangedCallback(new a(sNSApplicantDataTextAreaFieldView, this, qVar));
    }
}

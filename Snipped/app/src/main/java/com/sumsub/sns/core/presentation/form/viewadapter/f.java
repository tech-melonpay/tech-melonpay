package com.sumsub.sns.core.presentation.form.viewadapter;

import android.text.InputFilter;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f extends k<FormItem, SNSApplicantDataBaseFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14219b;

    /* renamed from: c, reason: collision with root package name */
    public FormItem f14220c;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem f14222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem formItem) {
            super(1);
            this.f14222b = formItem;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10;
            com.sumsub.sns.core.presentation.form.c d11 = f.this.d();
            if (d11 != null) {
                d11.b(this.f14222b, com.sumsub.sns.core.presentation.form.g.b(f.this.b(), this.f14222b));
            }
            if (str == null || str.length() == 0 || (d10 = f.this.d()) == null) {
                return;
            }
            d10.c(this.f14222b);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public f(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataBaseFieldView);
        this.f14219b = cVar;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, FormItem formItem, int i) {
        this.f14220c = formItem;
        com.sumsub.sns.internal.core.data.source.applicant.remote.k d10 = formItem.d();
        com.sumsub.sns.internal.core.data.model.p a10 = com.sumsub.sns.internal.core.presentation.form.model.g.a(d10);
        if (a10 instanceof p.g) {
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(((p.g) a10).a())};
            EditText editText = sNSApplicantDataBaseFieldView.getEditText();
            if (editText != null) {
                editText.setFilters(inputFilterArr);
            }
        }
        EditText editText2 = sNSApplicantDataBaseFieldView.getEditText();
        if (editText2 != null) {
            editText2.setInputType(com.sumsub.sns.internal.core.presentation.form.model.g.b(d10));
        }
        sNSApplicantDataBaseFieldView.setTextChangedCallback(new a(formItem));
        if (formItem instanceof FormItem.p) {
            EditText editText3 = sNSApplicantDataBaseFieldView.getEditText();
            SNSTextInputEditText sNSTextInputEditText = editText3 instanceof SNSTextInputEditText ? (SNSTextInputEditText) editText3 : null;
            if (sNSTextInputEditText != null) {
                sNSTextInputEditText.setMasksString(((FormItem.p) formItem).r());
            }
        }
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14219b;
    }
}

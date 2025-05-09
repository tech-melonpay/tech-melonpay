package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class d extends k<FormItem.c, SNSApplicantDataSelectionCountryFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14211b;

    public static final class a extends Lambda implements InterfaceC0646l<SNSCountryPicker.CountryItem, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.c f14213b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataSelectionCountryFieldView f14214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem.c cVar, SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView) {
            super(1);
            this.f14213b = cVar;
            this.f14214c = sNSApplicantDataSelectionCountryFieldView;
        }

        public final void a(SNSCountryPicker.CountryItem countryItem) {
            com.sumsub.sns.core.presentation.form.c d10 = d.this.d();
            if (d10 != null) {
                FormItem.c cVar = this.f14213b;
                d10.b(cVar, com.sumsub.sns.core.presentation.form.g.b(this.f14214c, cVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(SNSCountryPicker.CountryItem countryItem) {
            a(countryItem);
            return O9.p.f3034a;
        }
    }

    public d(SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataSelectionCountryFieldView);
        this.f14211b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14211b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, FormItem.c cVar, int i) {
        sNSApplicantDataSelectionCountryFieldView.setItems(SNSCountryPicker.CountryItem.INSTANCE.fromMap(cVar.r()));
        sNSApplicantDataSelectionCountryFieldView.setOnCountrySelectedCallback(new a(cVar, sNSApplicantDataSelectionCountryFieldView));
    }
}

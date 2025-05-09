package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0646l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.Calendar;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends k<FormItem.d, SNSApplicantDataCalendarFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14205b;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.d f14207b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataCalendarFieldView f14208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem.d dVar, SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView) {
            super(1);
            this.f14207b = dVar;
            this.f14208c = sNSApplicantDataCalendarFieldView;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10 = b.this.d();
            if (d10 != null) {
                FormItem.d dVar = this.f14207b;
                d10.b(dVar, com.sumsub.sns.core.presentation.form.g.b(this.f14208c, dVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public b(SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataCalendarFieldView);
        this.f14205b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14205b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView, FormItem.d dVar, int i) {
        if (dVar.q()) {
            Calendar calendar = Calendar.getInstance();
            CalendarConstraints.b bVar = new CalendarConstraints.b();
            bVar.f9378e = new DateValidatorPointBackward(calendar.getTime().getTime());
            sNSApplicantDataCalendarFieldView.setConstraints(bVar.a());
        }
        sNSApplicantDataCalendarFieldView.setTextChangedCallback(new a(dVar, sNSApplicantDataCalendarFieldView));
    }
}

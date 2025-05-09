package com.sumsub.sns.core.presentation.form.viewadapter;

import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneKitProviderKt;
import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class n extends k<FormItem.k, SNSApplicantDataPhoneFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14246b;

    /* renamed from: c, reason: collision with root package name */
    public FormItem f14247c;

    /* renamed from: d, reason: collision with root package name */
    public FormItem f14248d;

    public static final class a extends Lambda implements InterfaceC0646l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PhoneKit f14249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PhoneKit phoneKit) {
            super(1);
            this.f14249a = phoneKit;
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            String a10;
            com.sumsub.sns.internal.core.data.model.remote.c mask = this.f14249a.getMask();
            return (mask == null || (a10 = mask.a(str)) == null) ? "" : a10;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PhoneKit f14250a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PhoneKit phoneKit) {
            super(0);
            this.f14250a = phoneKit;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f14250a.isValid());
        }
    }

    public static final class c extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PhoneKit f14251a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f14252b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FormItem.k f14253c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SNSApplicantDataPhoneFieldView f14254d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PhoneKit phoneKit, n nVar, FormItem.k kVar, SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView) {
            super(1);
            this.f14251a = phoneKit;
            this.f14252b = nVar;
            this.f14253c = kVar;
            this.f14254d = sNSApplicantDataPhoneFieldView;
        }

        public final void a(String str) {
            n nVar;
            com.sumsub.sns.core.presentation.form.c d10;
            n nVar2;
            com.sumsub.sns.core.presentation.form.c d11;
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "SNSApplicantDataPhoneFieldView", s3.b.j("textChangedCallback: ", str), null, 4, null);
            SNSCountryPicker.CountryItem country = this.f14251a.getCountry();
            if (country != null && (d11 = (nVar2 = this.f14252b).d()) != null) {
                FormItem formItem = nVar2.f14247c;
                if (formItem == null) {
                    formItem = null;
                }
                d11.b(formItem, country.getCode());
            }
            com.sumsub.sns.internal.core.data.model.remote.c mask = this.f14251a.getMask();
            if (mask != null && (d10 = (nVar = this.f14252b).d()) != null) {
                FormItem formItem2 = nVar.f14248d;
                d10.b(formItem2 != null ? formItem2 : null, mask.c());
            }
            com.sumsub.sns.core.presentation.form.c d12 = this.f14252b.d();
            if (d12 != null) {
                FormItem.k kVar = this.f14253c;
                d12.b(kVar, com.sumsub.sns.core.presentation.form.g.b(this.f14254d, kVar));
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PhoneKit f14255a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f14256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PhoneKit phoneKit, n nVar) {
            super(0);
            this.f14255a = phoneKit;
            this.f14256b = nVar;
        }

        public final void a() {
            this.f14255a.detach(this.f14256b.a());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    public static final class e implements ValidationListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.k f14258b;

        public e(FormItem.k kVar) {
            this.f14258b = kVar;
        }

        @Override // com.sumsub.sns.core.widget.autocompletePhone.ValidationListener
        public void onValidate(boolean z10, boolean z11) {
            com.sumsub.sns.core.presentation.form.c d10 = n.this.d();
            if (d10 != null) {
                d10.a(this.f14258b, z10, z11);
            }
        }
    }

    public n(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataPhoneFieldView);
        this.f14246b = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14246b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView, FormItem.k kVar, int i) {
        this.f14247c = com.sumsub.sns.core.presentation.form.model.a.a(kVar);
        this.f14248d = com.sumsub.sns.core.presentation.form.model.a.b(kVar);
        Set<Map.Entry<String, String>> entrySet = kVar.t().entrySet();
        ArrayList arrayList = new ArrayList(P9.n.u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new SNSCountryPicker.CountryItem((String) entry.getKey(), (String) entry.getValue()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sNSApplicantDataPhoneFieldView.clear();
        PhoneKit phoneKit$default = PhoneKitProviderKt.getPhoneKit$default(sNSApplicantDataPhoneFieldView.getPhoneInputLayout(), kVar.t(), kVar.v(), new e(kVar), null, 16, null);
        sNSApplicantDataPhoneFieldView.setPhoneNumberPurifier(new a(phoneKit$default));
        if (!kVar.w()) {
            sNSApplicantDataPhoneFieldView.setPhoneNumberValidator(new b(phoneKit$default));
        }
        PhoneKit.attachToInput$default(phoneKit$default, sNSApplicantDataPhoneFieldView.getPhoneInputLayout(), arrayList, null, null, 8, null);
        sNSApplicantDataPhoneFieldView.setTextChangedCallback(new c(phoneKit$default, this, kVar, sNSApplicantDataPhoneFieldView));
        sNSApplicantDataPhoneFieldView.setOnClear(new d(phoneKit$default, this));
    }
}

package com.sumsub.sns.core.presentation.form.viewadapter;

import android.content.Context;
import android.text.Spanned;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDescriptionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSectionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSubtitleView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTextAreaFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTitleView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i extends com.sumsub.sns.core.presentation.base.adapter.a<FormItem, k<FormItem, SNSApplicantDataBaseFieldView>> {

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.core.presentation.form.f f14229b;

    /* renamed from: c, reason: collision with root package name */
    public c f14230c;

    public static final class a extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem f14232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FormItem formItem) {
            super(1);
            this.f14232b = formItem;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c a10 = i.this.a();
            if (a10 != null) {
                a10.c(this.f14232b, str);
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public static final class b extends q.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<FormItem> f14233a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<FormItem> f14234b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends FormItem> list, List<? extends FormItem> list2) {
            this.f14233a = list;
            this.f14234b = list2;
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areContentsTheSame(int i, int i9) {
            FormItem formItem = this.f14233a.get(i);
            FormItem formItem2 = this.f14234b.get(i9);
            return formItem.b() != null ? kotlin.jvm.internal.f.b(com.sumsub.sns.internal.core.presentation.form.model.e.a(formItem, null), com.sumsub.sns.internal.core.presentation.form.model.e.a(formItem2, null)) : kotlin.jvm.internal.f.b(formItem, formItem2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areItemsTheSame(int i, int i9) {
            FormItem formItem = this.f14233a.get(i);
            FormItem formItem2 = this.f14234b.get(i9);
            return kotlin.jvm.internal.f.b(formItem.d().p(), formItem2.d().p()) && kotlin.jvm.internal.f.b(formItem.e(), formItem2.e());
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getNewListSize() {
            return this.f14234b.size();
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getOldListSize() {
            return this.f14233a.size();
        }
    }

    public i(com.sumsub.sns.core.presentation.form.f fVar) {
        this.f14229b = fVar;
    }

    public final void a(com.sumsub.sns.core.presentation.form.c cVar) {
        this.f14230c = null;
        if (cVar != null) {
            this.f14230c = new c(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int b9;
        b9 = j.b(a(i));
        return b9;
    }

    public final com.sumsub.sns.core.presentation.form.c a() {
        c cVar = this.f14230c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.a
    public q.b a(List<? extends FormItem> list, List<? extends FormItem> list2) {
        return new b(list, list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public k<FormItem, SNSApplicantDataBaseFieldView> onCreateViewHolder(ViewGroup viewGroup, int i) {
        k<FormItem, SNSApplicantDataBaseFieldView> tVar;
        switch (i) {
            case 0:
                tVar = new t(new SNSApplicantDataTitleView(viewGroup.getContext()));
                break;
            case 1:
                tVar = new r(new SNSApplicantDataSubtitleView(viewGroup.getContext()));
                break;
            case 2:
                tVar = new g(new SNSApplicantDataDescriptionView(viewGroup.getContext()));
                break;
            case 3:
            default:
                tVar = new f(new SNSApplicantDataFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 4:
                tVar = new o(new SNSApplicantDataSectionView(viewGroup.getContext(), null, 0, 0, 14, null));
                break;
            case 5:
                tVar = new f(new SNSApplicantDataFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 6:
                tVar = new com.sumsub.sns.core.presentation.form.viewadapter.b(new SNSApplicantDataCalendarFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 7:
                tVar = new s(new SNSApplicantDataTextAreaFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 8:
                tVar = new com.sumsub.sns.core.presentation.form.viewadapter.a(new SNSApplicantDataBoolFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 9:
                tVar = new e(new SNSApplicantDataDateTimeFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 10:
                tVar = new n(new SNSApplicantDataPhoneFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 11:
                tVar = new d(new SNSApplicantDataSelectionCountryFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 12:
                tVar = new q(new SNSApplicantDataRadioGroupView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 13:
                tVar = new p(new SNSApplicantDataSelectionFieldView(viewGroup.getContext(), null, 0, 6, null), this.f14230c);
                break;
            case 14:
                tVar = new m(new SNSApplicantDataMutilselectFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 15:
                tVar = new h(new SNSApplicantDataFileFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
            case 16:
                tVar = new l(new SNSApplicantDataFileFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f14230c);
                break;
        }
        tVar.itemView.setLayoutParams(new RecyclerView.o(-1, -2));
        return tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(k<FormItem, SNSApplicantDataBaseFieldView> kVar, int i) {
        CharSequence charSequence;
        String n10;
        com.sumsub.sns.internal.core.data.model.p a10;
        List<String> r8;
        Spanned a11;
        c cVar = this.f14230c;
        if (cVar != null) {
            cVar.a(true);
        }
        FormItem a12 = a(i);
        if (a12 != null) {
            FormItem formItem = a12;
            kVar.a((k<FormItem, SNSApplicantDataBaseFieldView>) formItem, getItemCount());
            SNSApplicantDataBaseFieldView b9 = kVar.b();
            Context context = b9.getContext();
            com.sumsub.sns.internal.core.data.source.applicant.remote.k d10 = formItem.d();
            String x9 = d10.x();
            if (x9 == null || (a11 = com.sumsub.sns.internal.core.common.i.a(x9, context)) == null || (charSequence = com.sumsub.sns.core.common.b.a(a11, context, formItem.j())) == null) {
                charSequence = "";
            }
            b9.setLabel(charSequence);
            String l10 = d10.l();
            b9.setExample(l10 != null ? com.sumsub.sns.internal.core.common.i.a(l10, context) : null);
            b9.setEnabled(formItem.h());
            b9.setHint(d10.t());
            b9.setOnLinkClicked(new a(formItem));
            com.sumsub.sns.core.presentation.form.g.a(b9, formItem, this.f14229b);
            b9.setError(formItem.b());
            if ((!(formItem instanceof FormItem.p) || (r8 = ((FormItem.p) formItem).r()) == null || r8.isEmpty()) && (n10 = formItem.d().n()) != null && (a10 = com.sumsub.sns.internal.core.data.model.p.INSTANCE.a(n10)) != null) {
                com.sumsub.sns.internal.core.presentation.util.a.a(a10, b9.getEditText());
            }
            c cVar2 = this.f14230c;
            if (cVar2 == null) {
                return;
            }
            cVar2.a(false);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(k<FormItem, SNSApplicantDataBaseFieldView> kVar) {
        super.onViewRecycled(kVar);
        if (kVar != null) {
            kVar.c();
        }
    }
}

package com.sumsub.sns.core.presentation.form.viewadapter;

import android.view.View;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class h extends k<FormItem.g, SNSApplicantDataFileFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14223b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14224a;

        static {
            int[] iArr = new int[FormItem.ItemState.values().length];
            iArr[FormItem.ItemState.LOADING.ordinal()] = 1;
            f14224a = iArr;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.g f14226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FormItem.g gVar) {
            super(0);
            this.f14226b = gVar;
        }

        public final void a() {
            com.sumsub.sns.core.presentation.form.c d10 = h.this.d();
            if (d10 != null) {
                d10.a(this.f14226b);
            }
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0646l<String, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.g f14228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FormItem.g gVar) {
            super(1);
            this.f14228b = gVar;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10 = h.this.d();
            if (d10 != null) {
                d10.a(this.f14228b, str);
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public h(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataFileFieldView);
        this.f14223b = cVar;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void c() {
        View view = this.itemView;
        SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView = view instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) view : null;
        if (sNSApplicantDataFileFieldView != null) {
            sNSApplicantDataFileFieldView.cleanup();
        }
    }

    public final com.sumsub.sns.core.presentation.form.c d() {
        return this.f14223b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, FormItem.g gVar, int i) {
        sNSApplicantDataFileFieldView.setPickFileClickListener(new b(gVar));
        sNSApplicantDataFileFieldView.setDeleteFileClickListener(new c(gVar));
        String u6 = gVar.u();
        if (u6 == null) {
            u6 = "";
        }
        sNSApplicantDataFileFieldView.setPickFileLabel(u6);
        FormItem.ItemState w2 = gVar.w();
        int[] iArr = a.f14224a;
        sNSApplicantDataFileFieldView.setState(iArr[w2.ordinal()] == 1 ? SNSApplicantDataFileFieldView.State.LOADING : SNSApplicantDataFileFieldView.State.DEFAULT);
        sNSApplicantDataFileFieldView.setItemStates(Collections.singletonList(iArr[gVar.t().ordinal()] == 1 ? SNSApplicantDataFileFieldView.State.LOADING : SNSApplicantDataFileFieldView.State.DEFAULT));
    }
}

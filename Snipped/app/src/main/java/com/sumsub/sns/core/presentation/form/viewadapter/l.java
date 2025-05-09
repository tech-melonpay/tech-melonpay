package com.sumsub.sns.core.presentation.form.viewadapter;

import android.view.View;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class l extends k<FormItem.i, SNSApplicantDataFileFieldView> {

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.core.presentation.form.c f14236b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14237a;

        static {
            int[] iArr = new int[FormItem.ItemState.values().length];
            iArr[FormItem.ItemState.LOADING.ordinal()] = 1;
            f14237a = iArr;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FormItem.i f14239b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FormItem.i iVar) {
            super(0);
            this.f14239b = iVar;
        }

        public final void a() {
            com.sumsub.sns.core.presentation.form.c d10 = l.this.d();
            if (d10 != null) {
                d10.a(this.f14239b);
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
        public final /* synthetic */ FormItem.i f14241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FormItem.i iVar) {
            super(1);
            this.f14241b = iVar;
        }

        public final void a(String str) {
            com.sumsub.sns.core.presentation.form.c d10 = l.this.d();
            if (d10 != null) {
                d10.a(this.f14241b, str);
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(String str) {
            a(str);
            return O9.p.f3034a;
        }
    }

    public l(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, com.sumsub.sns.core.presentation.form.c cVar) {
        super(sNSApplicantDataFileFieldView);
        this.f14236b = cVar;
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
        return this.f14236b;
    }

    @Override // com.sumsub.sns.core.presentation.form.viewadapter.k
    public void a(SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView, FormItem.i iVar, int i) {
        sNSApplicantDataFileFieldView.setPickFileClickListener(new b(iVar));
        sNSApplicantDataFileFieldView.setDeleteFileClickListener(new c(iVar));
        CharSequence v10 = iVar.v();
        if (v10 == null) {
            v10 = "";
        }
        sNSApplicantDataFileFieldView.setPickFileLabel(v10);
        sNSApplicantDataFileFieldView.setState(a.f14237a[iVar.x().ordinal()] == 1 ? SNSApplicantDataFileFieldView.State.LOADING : SNSApplicantDataFileFieldView.State.DEFAULT);
        List<FormItem.ItemState> u6 = iVar.u();
        ArrayList arrayList = new ArrayList(P9.n.u(u6, 10));
        Iterator<T> it = u6.iterator();
        while (it.hasNext()) {
            arrayList.add(a.f14237a[((FormItem.ItemState) it.next()).ordinal()] == 1 ? SNSApplicantDataFileFieldView.State.LOADING : SNSApplicantDataFileFieldView.State.DEFAULT);
        }
        sNSApplicantDataFileFieldView.setItemStates(arrayList);
    }
}

package com.sumsub.sns.presentation.screen.questionnary;

import P9.s;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.presentation.screen.questionnary.model.d;
import com.sumsub.sns.internal.presentation.screen.questionnary.model.e;
import ia.InterfaceC0840h;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001GB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u0014\u0010\u001fR\u001b\u0010#\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\u0004\u0018\u00010$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0014\u00105\u001a\u0002028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u00107R\u0014\u0010:\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00104R \u0010?\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020<0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u0004\u0018\u00010@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\t¨\u0006H"}, d2 = {"Lcom/sumsub/sns/presentation/screen/questionnary/SNSQuestionnaireFragment;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/questionnary/model/d$d;", "Lcom/sumsub/sns/internal/presentation/screen/questionnary/model/d;", "Lcom/sumsub/sns/internal/core/presentation/form/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "a", "(Lcom/sumsub/sns/internal/presentation/screen/questionnary/model/d$d;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "currentPageNumber", "", "Lcom/sumsub/sns/internal/core/presentation/form/b$b;", "pages", "(ILjava/util/List;)V", "LO9/f;", "o", "()Lcom/sumsub/sns/internal/presentation/screen/questionnary/model/d;", "viewModel", "Landroid/widget/TextView;", "b", "Lcom/sumsub/sns/internal/core/common/z;", "getPoweredByText", "()Landroid/widget/TextView;", "poweredByText", "Landroid/view/ViewGroup;", "c", "m", "()Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "d", "l", "btContinue", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lcom/sumsub/sns/internal/core/presentation/form/b;", "()Lcom/sumsub/sns/internal/core/presentation/form/b;", "hostViewModel", "getLogTag", "logTag", "", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "Lcom/sumsub/sns/core/presentation/form/d;", "n", "()Lcom/sumsub/sns/core/presentation/form/d;", "formFragment", "k", "analyticsPageIndex", "f", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSQuestionnaireFragment extends com.sumsub.sns.core.presentation.b<d.C0345d, com.sumsub.sns.internal.presentation.screen.questionnary.model.d> implements com.sumsub.sns.internal.core.presentation.form.a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20147g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z poweredByText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z content;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z btContinue;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/presentation/screen/questionnary/SNSQuestionnaireFragment$Companion;", "", "", "idDocSetType", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/w;", "questionnaire", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;", "questionnaireSummary", "Lcom/sumsub/sns/internal/core/presentation/form/model/d;", "countriesData", "Landroidx/fragment/app/Fragment;", "newInstance", "PAYLOAD_CURRENT_PAGE_INDEX", "Ljava/lang/String;", "PAYLOAD_IS_DATA_VALID", "TAG", "<init>", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Fragment newInstance$default(Companion companion, String str, w wVar, y yVar, com.sumsub.sns.internal.core.presentation.form.model.d dVar, int i, Object obj) {
            if ((i & 2) != 0) {
                wVar = null;
            }
            if ((i & 4) != 0) {
                yVar = null;
            }
            if ((i & 8) != 0) {
                dVar = null;
            }
            return companion.newInstance(str, wVar, yVar, dVar);
        }

        public final Fragment newInstance(String idDocSetType, w questionnaire, y questionnaireSummary, com.sumsub.sns.internal.core.presentation.form.model.d countriesData) {
            SNSQuestionnaireFragment sNSQuestionnaireFragment = new SNSQuestionnaireFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IDDOCSETTYPE", idDocSetType);
            bundle.putParcelable(DocumentType.i, questionnaire);
            bundle.putParcelable("QUESTIONNAIRE_SUMMARY", questionnaireSummary);
            bundle.putParcelable("COUNTRIES_DATA", countriesData);
            sNSQuestionnaireFragment.setArguments(bundle);
            return sNSQuestionnaireFragment;
        }

        private Companion() {
        }
    }

    public static final class a extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f20152a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20152a;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20153a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20153a.invoke();
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O9.f fVar) {
            super(0);
            this.f20154a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20154a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20155a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20155a = interfaceC0635a;
            this.f20156b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20155a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20156b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<T> {
        public f() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            SNSQuestionnaireFragment sNSQuestionnaireFragment = SNSQuestionnaireFragment.this;
            return new e(sNSQuestionnaireFragment, sNSQuestionnaireFragment.getServiceLocator(), SNSQuestionnaireFragment.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SNSQuestionnaireFragment.class, "poweredByText", "getPoweredByText()Landroid/widget/TextView;", 0);
        i iVar = h.f23186a;
        f20147g = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, SNSQuestionnaireFragment.class, FirebaseAnalytics.Param.CONTENT, "getContent()Landroid/view/ViewGroup;", 0), com.google.android.gms.measurement.internal.a.o(SNSQuestionnaireFragment.class, "btContinue", "getBtContinue()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public SNSQuestionnaireFragment() {
        f fVar = new f();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new b(new a(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.questionnary.model.d.class), new c(b9), fVar, new d(null, b9));
        this.poweredByText = a0.a(this, R$id.sns_powered);
        this.content = a0.a(this, R$id.sns_content);
        this.btContinue = a0.a(this, R$id.sns_continue);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("IDDOCSETTYPE") : null;
        return string == null ? DocumentType.f15253j : string;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_questionnarie;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getLogTag() {
        return "SNSQuestionnaireFragment";
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return P9.z.o(new Pair("pageIndex", Integer.valueOf(k())));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public TextView getPoweredByText() {
        return (TextView) this.poweredByText.a(this, f20147g[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        TextView l10;
        if ((event instanceof a.d) && (l10 = l()) != null) {
            l10.setVisibility(0);
        }
        super.handleEvent(event);
    }

    public final int k() {
        return 0;
    }

    public final TextView l() {
        return (TextView) this.btContinue.a(this, f20147g[2]);
    }

    public final ViewGroup m() {
        return (ViewGroup) this.content.a(this, f20147g[1]);
    }

    public final com.sumsub.sns.core.presentation.form.d n() {
        ViewGroup m2 = m();
        if (m2 != null) {
            Fragment F10 = getChildFragmentManager().F(m2.getId());
            if (F10 instanceof com.sumsub.sns.core.presentation.form.d) {
                return (com.sumsub.sns.core.presentation.form.d) F10;
            }
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.questionnary.model.d getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.questionnary.model.d) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (kotlin.jvm.internal.f.b(finishReason, q.c.f15162b) && getViewModel().x()) {
            return false;
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        TextView l10 = l();
        if (l10 != null) {
            l10.setOnClickListener(new J7.b(this, 19));
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.a
    public com.sumsub.sns.internal.core.presentation.form.b a() {
        return getViewModel();
    }

    public static final void a(SNSQuestionnaireFragment sNSQuestionnaireFragment, View view) {
        com.sumsub.sns.core.presentation.form.d n10 = sNSQuestionnaireFragment.n();
        boolean k3 = n10 != null ? n10.k() : false;
        sNSQuestionnaireFragment.getAnalyticsDelegate().b(sNSQuestionnaireFragment.getScreen(), sNSQuestionnaireFragment.getIdDocSetType(), Control.ContinueButton, kotlin.collections.a.s(new Pair("pageIndex", Integer.valueOf(sNSQuestionnaireFragment.k())), new Pair("isDataValid", String.valueOf(k3))));
        if (k3) {
            TextView l10 = sNSQuestionnaireFragment.l();
            if (l10 != null) {
                l10.setVisibility(4);
            }
            TextView l11 = sNSQuestionnaireFragment.l();
            if (l11 != null) {
                com.sumsub.sns.internal.core.common.i.b(l11);
            }
            sNSQuestionnaireFragment.getViewModel().A();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(d.C0345d state, Bundle savedInstanceState) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "Questionnaire", "handleState: " + com.sumsub.sns.internal.core.common.i.a(state), null, 4, null);
        a(state.f(), state.h());
        TextView l10 = l();
        if (l10 != null) {
            d.C0345d.a e10 = state.e();
            com.sumsub.sns.internal.core.common.i.a(l10, e10 != null ? e10.d() : null);
        }
        TextView l11 = l();
        if (l11 == null) {
            return;
        }
        d.C0345d.a e11 = state.e();
        l11.setEnabled(e11 != null ? e11.c() : true);
    }

    public final void a(int currentPageNumber, List<b.C0241b> pages) {
        ViewGroup m2;
        List<FormItem> f10;
        b.C0241b c0241b = (b.C0241b) s.M(currentPageNumber, pages);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("showPage: ", currentPageNumber, " has ");
        l10.append((c0241b == null || (f10 = c0241b.f()) == null) ? null : Integer.valueOf(f10.size()));
        l10.append(" items");
        Logger.v$default(aVar, "Questionnaire", l10.toString(), null, 4, null);
        if (pages.isEmpty() || c0241b == null || (m2 = m()) == null || n() != null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0527a c0527a = new C0527a(childFragmentManager);
        c0527a.e(m2.getId(), com.sumsub.sns.core.presentation.form.d.INSTANCE.a("Questionnaire"), null);
        if (!c0527a.f6925g) {
            c0527a.f6926h = false;
            c0527a.f6838r.C(c0527a, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}

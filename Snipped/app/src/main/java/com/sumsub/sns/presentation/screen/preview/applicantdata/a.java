package com.sumsub.sns.presentation.screen.preview.applicantdata;

import O9.f;
import R0.a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b;
import ia.InterfaceC0840h;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import t0.C1275b;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0006R!\u0010\u001d\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u0012\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010'R\u001d\u00100\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/applicantdata/a;", "Lcom/sumsub/sns/presentation/screen/preview/a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/applicantdata/b$d;", "Lcom/sumsub/sns/internal/presentation/screen/preview/applicantdata/b;", "Lcom/sumsub/sns/internal/core/presentation/form/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/applicantdata/b$d;Landroid/os/Bundle;)V", "r", "LO9/f;", "p", "()Lcom/sumsub/sns/internal/presentation/screen/preview/applicantdata/b;", "getViewModel$annotations", "viewModel", "Landroid/widget/Button;", "b", "Lcom/sumsub/sns/internal/core/common/z;", "k", "()Landroid/widget/Button;", "btnContinue", "Landroid/widget/TextView;", "c", "n", "()Landroid/widget/TextView;", "tvTitle", "d", "m", "tvSubtitle", "Landroid/view/ViewGroup;", "e", "o", "()Landroid/view/ViewGroup;", "vgContent", "Lcom/sumsub/sns/internal/domain/c;", "f", "Lcom/sumsub/sns/internal/domain/c;", "resources", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lcom/sumsub/sns/internal/core/presentation/form/b;", "()Lcom/sumsub/sns/internal/core/presentation/form/b;", "hostViewModel", "Lcom/sumsub/sns/core/presentation/form/d;", "l", "()Lcom/sumsub/sns/core/presentation/form/d;", "formFragment", "g", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.presentation.screen.preview.a<b.d, com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b> implements com.sumsub.sns.internal.core.presentation.form.a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19921h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z btnContinue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z vgContent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.domain.c resources;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.applicantdata.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a(Document document) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19928a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19928a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19929a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19929a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f19930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f19930a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19930a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19931a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f19932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f19931a = interfaceC0635a;
            this.f19932b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19931a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19932b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<T> {
        public g() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.preview.applicantdata.c(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0);
        i iVar = h.f23186a;
        f19921h = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "vgContent", "getVgContent()Landroid/view/ViewGroup;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b.class), new d(b9), gVar, new e(null, b9));
        this.btnContinue = a0.a(this, R$id.sns_primary_button);
        this.tvTitle = a0.a(this, R$id.sns_title);
        this.tvSubtitle = a0.a(this, R$id.sns_subtitle);
        this.vgContent = a0.a(this, R$id.sns_content);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        Document document;
        DocumentType type;
        String c2;
        Bundle arguments = getArguments();
        return (arguments == null || (document = (Document) C1275b.a(arguments, Document.class, "ARGS_DOCUMENT")) == null || (type = document.getType()) == null || (c2 = type.c()) == null) ? DocumentType.f15253j : c2;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_applicant_data_document;
    }

    @Override // com.sumsub.sns.presentation.screen.preview.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        super.handleEvent(event);
        if (event instanceof b.C0291b) {
            b.C0291b c0291b = (b.C0291b) event;
            new SNSAlertDialogBuilder(requireContext()).setMessage(c0291b.c()).setPositiveButton(c0291b.d(), (DialogInterface.OnClickListener) new com.sumsub.sns.presentation.screen.preview.applicantdata.b()).create().show();
        }
    }

    public final Button k() {
        return (Button) this.btnContinue.a(this, f19921h[0]);
    }

    public final com.sumsub.sns.core.presentation.form.d l() {
        ViewGroup o10 = o();
        if (o10 != null) {
            Fragment F10 = getChildFragmentManager().F(o10.getId());
            if (F10 instanceof com.sumsub.sns.core.presentation.form.d) {
                return (com.sumsub.sns.core.presentation.form.d) F10;
            }
        }
        return null;
    }

    public final TextView m() {
        return (TextView) this.tvSubtitle.a(this, f19921h[2]);
    }

    public final TextView n() {
        return (TextView) this.tvTitle.a(this, f19921h[1]);
    }

    public final ViewGroup o() {
        return (ViewGroup) this.vgContent.a(this, f19921h[3]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Float a10;
        super.onViewCreated(view, savedInstanceState);
        Button k3 = k();
        if (k3 != null) {
            k3.setOnClickListener(new J7.b(this, 18));
        }
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, SNSMetricElement.SCREEN_HORIZONTAL_MARGIN)) == null) {
            return;
        }
        int floatValue = (int) a10.floatValue();
        com.sumsub.sns.internal.core.common.i.a(Integer.valueOf(floatValue), Integer.valueOf(floatValue), null, null, k(), n(), m());
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.applicantdata.b) this.viewModel.getValue();
    }

    public final void r() {
        ViewGroup o10 = o();
        if (o10 != null && l() == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0527a c0527a = new C0527a(childFragmentManager);
            c0527a.e(o10.getId(), com.sumsub.sns.core.presentation.form.d.INSTANCE.a("AppData"), null);
            if (c0527a.f6925g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0527a.f6926h = false;
            c0527a.f6838r.C(c0527a, true);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.a
    public com.sumsub.sns.internal.core.presentation.form.b a() {
        return getViewModel();
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        com.sumsub.sns.internal.core.common.i.b(view);
        aVar.getViewModel().D();
    }

    public static final void a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(b.d state, Bundle savedInstanceState) {
        this.resources = state.m();
        r();
        TextView n10 = n();
        if (n10 != null) {
            com.sumsub.sns.internal.core.common.i.a(n10, state.p());
        }
        TextView m2 = m();
        if (m2 != null) {
            com.sumsub.sns.internal.core.common.i.a(m2, state.o());
        }
        Button k3 = k();
        if (k3 != null) {
            com.sumsub.sns.internal.core.common.i.a(k3, state.i());
        }
        ViewGroup o10 = o();
        if (o10 == null) {
            return;
        }
        o10.setVisibility(state.n() ^ true ? 4 : 0);
    }
}

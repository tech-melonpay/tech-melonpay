package com.sumsub.sns.presentation.screen.verification;

import O9.p;
import R0.a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.presentation.base.adapter.c;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.presentation.screen.verification.b;
import com.sumsub.sns.internal.presentation.screen.verification.d;
import ia.InterfaceC0840h;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0011\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0014X\u0094D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010*\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001d\u00100\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/sumsub/sns/presentation/screen/verification/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/verification/d;", "Lcom/sumsub/sns/internal/presentation/screen/verification/b;", "<init>", "()V", "", "getLayoutId", "()I", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "LO9/p;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "Landroid/os/Bundle;", "savedInstanceState", "a", "(Lcom/sumsub/sns/internal/presentation/screen/verification/d;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Lcom/sumsub/sns/internal/presentation/screen/verification/a;", "exitDialog", "(Lcom/sumsub/sns/internal/presentation/screen/verification/a;)V", "LO9/f;", "p", "()Lcom/sumsub/sns/internal/presentation/screen/verification/b;", "viewModel", "", "b", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/TextView;", "c", "Lcom/sumsub/sns/internal/core/common/z;", "o", "()Landroid/widget/TextView;", "tvTitle", "d", "n", "tvSubtitle", "e", "m", "tvFooter", "Landroid/widget/Button;", "f", "k", "()Landroid/widget/Button;", "btnContinue", "Landroidx/recyclerview/widget/RecyclerView;", "g", "l", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/appcompat/app/b;", "h", "Landroidx/appcompat/app/b;", "exitConfirmationDialog", "i", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<com.sumsub.sns.internal.presentation.screen.verification.d, com.sumsub.sns.internal.presentation.screen.verification.b> {

    /* renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20158j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tvFooter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z btnContinue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z recycler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b exitConfirmationDialog;

    /* renamed from: com.sumsub.sns.presentation.screen.verification.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a() {
            return new a();
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, p> {
        public b() {
            super(1);
        }

        public final void a(String str) {
            a.this.getViewModel().b(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public static final class c implements c.a {
        public c() {
        }

        @Override // com.sumsub.sns.core.presentation.base.adapter.c.a
        public void a(Document document) {
            if (document != null) {
                a.this.getViewModel().a(document);
            }
        }

        @Override // com.sumsub.sns.core.presentation.base.adapter.c.a
        public void a(String str) {
            if (str != null) {
                a.this.getViewModel().a(str);
            }
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f20169a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20169a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20170a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20170a.invoke();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O9.f fVar) {
            super(0);
            this.f20171a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20171a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20172a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20172a = interfaceC0635a;
            this.f20173b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20172a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20173b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<T> {
        public i() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.verification.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        kotlin.jvm.internal.i iVar = h.f23186a;
        f20158j = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        i iVar = new i();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new e(new d(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.verification.b.class), new f(b9), iVar, new g(null, b9));
        this.idDocSetType = DocumentType.f15253j;
        this.tvTitle = a0.a(this, R$id.sns_title);
        this.tvSubtitle = a0.a(this, R$id.sns_subtitle);
        this.tvFooter = a0.a(this, R$id.sns_footer);
        this.btnContinue = a0.a(this, R$id.sns_primary_button);
        this.recycler = a0.a(this, R$id.sns_list);
    }

    public static final void b(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        k0 appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.a();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_applicant_status;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof b.C0346b) {
            com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.dialogs.bottomsheet.a.INSTANCE.a(((b.C0346b) event).b()), null, 2, null);
        } else {
            super.handleEvent(event);
        }
    }

    public final Button k() {
        return (Button) this.btnContinue.a(this, f20158j[3]);
    }

    public final RecyclerView l() {
        return (RecyclerView) this.recycler.a(this, f20158j[4]);
    }

    public final TextView m() {
        return (TextView) this.tvFooter.a(this, f20158j[2]);
    }

    public final TextView n() {
        return (TextView) this.tvSubtitle.a(this, f20158j[1]);
    }

    public final TextView o() {
        return (TextView) this.tvTitle.a(this, f20158j[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (!(finishReason instanceof q.c)) {
            return super.onFinishCalled(finishReason);
        }
        androidx.appcompat.app.b bVar = this.exitConfirmationDialog;
        if (bVar != null) {
            bVar.show();
        } else {
            com.sumsub.sns.core.presentation.b.finish$default(this, new q.d(null, 1, null), null, null, 6, null);
        }
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.verification.b getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.verification.b) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(com.sumsub.sns.internal.presentation.screen.verification.d state, Bundle savedInstanceState) {
        Button button;
        TextView o10 = o();
        final int i9 = 1;
        final int i10 = 0;
        if (o10 != null) {
            CharSequence e10 = state.e();
            com.sumsub.sns.internal.core.common.i.a(o10, e10 == null || e10.length() == 0);
            CharSequence e11 = state.e();
            o10.setText(e11 != null ? com.sumsub.sns.internal.core.common.i.a(e11, o10.getContext()) : null);
        }
        TextView n10 = n();
        if (n10 != null) {
            CharSequence d10 = state.d();
            com.sumsub.sns.internal.core.common.i.a(n10, d10 == null || d10.length() == 0);
            CharSequence d11 = state.d();
            n10.setText(d11 != null ? com.sumsub.sns.internal.core.common.i.a(d11, n10.getContext()) : null);
        }
        TextView m2 = m();
        if (m2 != null) {
            CharSequence c2 = state.c();
            com.sumsub.sns.internal.core.common.i.a(m2, c2 == null || c2.length() == 0);
            CharSequence c10 = state.c();
            m2.setText(c10 != null ? com.sumsub.sns.internal.core.common.i.a(c10, m2.getContext()) : null);
            com.sumsub.sns.core.common.b.a(m2, new b());
        }
        Button k3 = k();
        if (k3 != null) {
            CharSequence a10 = state.a();
            com.sumsub.sns.internal.core.common.i.a(k3, a10 == null || a10.length() == 0);
            k3.setText(state.a());
        }
        RecyclerView l10 = l();
        if (l10 != null) {
            com.sumsub.sns.internal.core.common.i.a(l10, state.b().isEmpty());
            if (!state.b().isEmpty()) {
                if (l10.getAdapter() == null) {
                    l10.setLayoutManager(new LinearLayoutManager(l10.getContext()));
                    l10.setAdapter(new com.sumsub.sns.core.presentation.base.adapter.c(new c()));
                }
                RecyclerView.Adapter adapter = l10.getAdapter();
                if (adapter == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ((com.sumsub.sns.core.presentation.base.adapter.c) adapter).a(state.b());
                ViewGroup.LayoutParams layoutParams = l10.getLayoutParams();
                ConstraintLayout.a aVar = layoutParams instanceof ConstraintLayout.a ? (ConstraintLayout.a) layoutParams : null;
                if (state instanceof d.C0347d) {
                    if (aVar != null) {
                        ((ViewGroup.MarginLayoutParams) aVar).height = -2;
                    }
                } else if (aVar != null) {
                    ((ViewGroup.MarginLayoutParams) aVar).height = 0;
                }
            }
        }
        this.exitConfirmationDialog = null;
        if (!(state instanceof d.e)) {
            View view = getView();
            View findViewById = view != null ? view.findViewById(R$id.sns_content) : null;
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            Button k10 = k();
            if (k10 != null) {
                k10.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.verification.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a f20176b;

                    {
                        this.f20176b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i9) {
                            case 0:
                                a.b(this.f20176b, view2);
                                break;
                            default:
                                a.a(this.f20176b, view2);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (getView() != null) {
            View view2 = getView();
            View findViewById2 = view2 != null ? view2.findViewById(R$id.sns_content) : null;
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            SNSInstructionsViewHandler instructionsViewHandler = e0.f15081a.getInstructionsViewHandler();
            View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), DocumentType.f15254k, null, IntroScene.VIDEO_IDENT.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), null) : null;
            if (onVerificationStep != null) {
                View view3 = getView();
                View findViewById3 = view3 != null ? view3.findViewById(R$id.sns_content) : null;
                ViewGroup viewGroup = findViewById3 instanceof ViewGroup ? (ViewGroup) findViewById3 : null;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
                    marginLayoutParams.setMarginStart(dimensionPixelSize);
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    p pVar = p.f3034a;
                    viewGroup.addView(onVerificationStep, marginLayoutParams);
                }
                View view4 = getView();
                if (view4 != null && (button = (Button) view4.findViewById(R$id.sns_primary_button)) != null) {
                    Object obj = ((d.e) state).f().get("actionTitle");
                    button.setText(obj instanceof String ? (String) obj : null);
                }
            } else {
                new com.sumsub.sns.core.presentation.intro.b(getServiceLocator().q(), false, 2, null).a(requireView(), ((d.e) state).f(), R$id.sns_content, R$id.sns_primary_button);
            }
        }
        Button k11 = k();
        if (k11 != null) {
            k11.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.verification.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f20176b;

                {
                    this.f20176b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i10) {
                        case 0:
                            a.b(this.f20176b, view22);
                            break;
                        default:
                            a.a(this.f20176b, view22);
                            break;
                    }
                }
            });
        }
        com.sumsub.sns.internal.presentation.screen.verification.a g10 = ((d.e) state).g();
        if (g10 != null) {
            a(g10);
        }
    }

    public static final void b(a aVar, Map map, DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
        aVar.getAnalyticsDelegate().b(Screen.VerificationExitPopup, aVar.getIdDocSetType(), Control.CancelButton, map);
    }

    public static final void b(a aVar, Map map, DialogInterface dialogInterface) {
        aVar.getAnalyticsDelegate().d(Screen.VerificationExitPopup, aVar.getIdDocSetType(), map);
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        aVar.getViewModel().q();
    }

    public final void a(com.sumsub.sns.internal.presentation.screen.verification.a exitDialog) {
        Map n10 = com.google.android.gms.measurement.internal.a.n("fromScreen", Screen.StatusScreen.getText());
        androidx.appcompat.app.b create = new SNSAlertDialogBuilder(requireContext()).setMessage(exitDialog.f()).setPositiveButton(exitDialog.e(), (DialogInterface.OnClickListener) new com.sumsub.sns.presentation.screen.verification.c(0, this, n10)).setNegativeButton(exitDialog.d(), (DialogInterface.OnClickListener) new com.sumsub.sns.presentation.screen.verification.c(1, this, n10)).setOnCancelListener((DialogInterface.OnCancelListener) new com.sumsub.sns.camera.video.presentation.c(this, 2)).setOnDismissListener((DialogInterface.OnDismissListener) new com.sumsub.sns.presentation.screen.verification.d(this, n10, 0)).create();
        create.setOnShowListener(new com.sumsub.sns.presentation.screen.verification.e(this, n10, 0));
        this.exitConfirmationDialog = create;
    }

    public static final void a(a aVar, Map map, DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
        aVar.getAnalyticsDelegate().b(Screen.VerificationExitPopup, aVar.getIdDocSetType(), Control.ConfirmButton, map);
        k0 appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.b();
        }
    }

    public static final void a(a aVar, DialogInterface dialogInterface) {
        androidx.appcompat.app.b bVar = aVar.exitConfirmationDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public static final void a(a aVar, Map map, DialogInterface dialogInterface) {
        aVar.getAnalyticsDelegate().c(Screen.VerificationExitPopup, aVar.getIdDocSetType(), map);
    }
}

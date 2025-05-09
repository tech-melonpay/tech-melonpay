package com.sumsub.sns.core.presentation.support;

import O9.f;
import R0.a;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.support.b;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSupportItemView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/sumsub/sns/core/presentation/support/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/core/presentation/support/b$b;", "Lcom/sumsub/sns/core/presentation/support/b;", "<init>", "()V", "", "getLayoutId", "()I", "state", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "a", "(Lcom/sumsub/sns/core/presentation/support/b$b;Landroid/os/Bundle;)V", "LO9/f;", "n", "()Lcom/sumsub/sns/core/presentation/support/b;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "b", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "", "c", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/TextView;", "l", "()Landroid/widget/TextView;", "tvTitle", "k", "tvSubtitle", "Landroid/view/ViewGroup;", "m", "()Landroid/view/ViewGroup;", "vgItems", "d", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<b.C0170b, com.sumsub.sns.core.presentation.support.b> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: com.sumsub.sns.core.presentation.support.a$a, reason: collision with other inner class name and from kotlin metadata */
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

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f14330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f14330a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f14330a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f14331a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f14331a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f14332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f14332a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f14332a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14333a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f14334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f14333a = interfaceC0635a;
            this.f14334b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f14333a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f14334b.getValue();
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
            return new com.sumsub.sns.core.presentation.support.c(a.this.getServiceLocator());
        }
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.core.presentation.support.b.class), new d(b9), gVar, new e(null, b9));
        this.screen = Screen.SupportScreen;
        this.idDocSetType = DocumentType.f15253j;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_bottom_sheet_support;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    public final TextView k() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.sns_subtitle);
        }
        return null;
    }

    public final TextView l() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.sns_title);
        }
        return null;
    }

    public final ViewGroup m() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.sns_list);
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.core.presentation.support.b getViewModel() {
        return (com.sumsub.sns.core.presentation.support.b) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(b.C0170b state, Bundle savedInstanceState) {
        TextView l10 = l();
        if (l10 != null) {
            i.a(l10, state.f());
        }
        TextView k3 = k();
        if (k3 != null) {
            i.a(k3, state.d());
        }
        ViewGroup m2 = m();
        if (m2 != null) {
            m2.removeAllViews();
        }
        for (b.a aVar : state.e()) {
            SNSSupportItemView sNSSupportItemView = new SNSSupportItemView(requireContext(), null, 0, 0, 14, null);
            SNSStepViewExtensionsKt.setSnsStepState(sNSSupportItemView, aVar.h());
            Drawable f10 = aVar.f();
            if (f10 == null) {
                String iconName = aVar.g().getIconName();
                f10 = iconName != null ? e0.f15081a.getIconHandler().onResolveIcon(requireContext(), iconName) : null;
            }
            sNSSupportItemView.setIconStart(f10);
            sNSSupportItemView.setTitle(aVar.j());
            sNSSupportItemView.setSubtitle(aVar.i());
            sNSSupportItemView.setOnClickListener(new B7.f(15, aVar, this));
            ViewGroup m9 = m();
            if (m9 != null) {
                m9.addView(sNSSupportItemView);
            }
        }
    }

    public static final void a(b.a aVar, a aVar2, View view) {
        if (com.sumsub.sns.core.common.b.a(aVar.g(), aVar2.requireContext())) {
            return;
        }
        Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, "SNSSupportFragment", "The SDK is not possible to resolve a click on support item (" + aVar + ')', null, 4, null);
    }
}

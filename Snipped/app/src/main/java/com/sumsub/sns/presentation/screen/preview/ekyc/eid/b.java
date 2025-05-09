package com.sumsub.sns.presentation.screen.preview.ekyc.eid;

import O9.p;
import R0.a;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel;
import ia.InterfaceC0840h;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.MessageBundle;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001a\u00107\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010>¨\u0006G"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/ekyc/eid/b;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel$e;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel;", "<init>", "()V", "", "getLayoutId", "()I", "state", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel$e;Landroid/os/Bundle;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "LO9/f;", "n", "()Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel;", "viewModel", "", "b", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/TextView;", "c", "Lcom/sumsub/sns/internal/core/common/z;", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "d", "m", "subtitle", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "e", "l", "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "pinView", "f", "k", "errorText", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "g", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "", "", "h", "Ljava/util/Map;", "analPayload", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "i", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.b<SNSEidPinViewModel.e, SNSEidPinViewModel> {

    /* renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20003j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z subtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z pinView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z errorText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Map<String, ? extends Object> analPayload;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.ekyc.eid.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a aVar) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("pin_mode", aVar);
            bVar.setArguments(bundle);
            return bVar;
        }

        public Companion() {
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.preview.ekyc.eid.SNSEidPinFragment$onViewCreated$2", f = "SNSEidPinFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20013a;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new c(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f20013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SNSPinView l10 = b.this.l();
            if (l10 != null) {
                com.sumsub.sns.internal.core.common.i.g(l10);
            }
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f20015a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20015a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20016a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20016a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20016a.invoke();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O9.f fVar) {
            super(0);
            this.f20017a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20017a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20018a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20018a = interfaceC0635a;
            this.f20019b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20018a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20019b.getValue();
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
            b bVar = b.this;
            return new SNSEidPinViewModel.d(bVar, bVar.getServiceLocator(), b.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, MessageBundle.TITLE_ENTRY, "getTitle()Landroid/widget/TextView;", 0);
        kotlin.jvm.internal.i iVar = h.f23186a;
        f20003j = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, b.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(b.class, "pinView", "getPinView()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(b.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public b() {
        i iVar = new i();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new e(new d(this)));
        this.viewModel = new H1.a(h.a(SNSEidPinViewModel.class), new f(b9), iVar, new g(null, b9));
        this.idDocSetType = DocumentType.f15255l;
        this.title = a0.a(this, R$id.sns_title);
        this.subtitle = a0.a(this, R$id.sns_subtitle);
        this.pinView = a0.a(this, R$id.sns_pin_code);
        this.errorText = a0.a(this, R$id.sns_error);
        this.screen = Screen.EidPinPad;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return SNSEidPinViewModel.a(getViewModel(), null, 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return SNSEidPinViewModel.a(getViewModel(), null, 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return SNSEidPinViewModel.a(getViewModel(), null, 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_eid_pin;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return SNSEidPinViewModel.a(getViewModel(), null, 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    public final TextView getTitle() {
        return (TextView) this.title.a(this, f20003j[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof SNSEidPinViewModel.b) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DOCUMENT_RESULT", ((SNSEidPinViewModel.b) event).b());
            bundle.putParcelable("pin_mode", getViewModel().u());
            p pVar = p.f3034a;
            com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (!(event instanceof SNSEidPinViewModel.c)) {
            super.handleEvent(event);
            return;
        }
        SNSPinView l10 = l();
        if (l10 != null) {
            l10.setError(true);
        }
        TextView k3 = k();
        if (k3 != null) {
            k3.setVisibility(0);
        }
        TextView k10 = k();
        if (k10 == null) {
            return;
        }
        k10.setText(((SNSEidPinViewModel.c) event).b());
    }

    public final TextView k() {
        return (TextView) this.errorText.a(this, f20003j[3]);
    }

    public final SNSPinView l() {
        return (SNSPinView) this.pinView.a(this, f20003j[2]);
    }

    public final TextView m() {
        return (TextView) this.subtitle.a(this, f20003j[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public SNSEidPinViewModel getViewModel() {
        return (SNSEidPinViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SNSPinView l10 = l();
        if (l10 != null) {
            l10.addTextChangedListener(new C0380b());
        }
        SNSPinView l11 = l();
        if (l11 != null) {
            l11.setPassword(true);
        }
        C0552s.a(getViewLifecycleOwner()).c(new c(null));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            com.sumsub.sns.internal.core.common.i.a(viewGroup);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(SNSEidPinViewModel.e state, Bundle savedInstanceState) {
        Editable text;
        TextView title = getTitle();
        if (title != null) {
            title.setText(state.d());
        }
        TextView m2 = m();
        if (m2 != null) {
            m2.setText(state.c());
        }
        SNSPinView l10 = l();
        if (l10 != null) {
            l10.setItemCount(state.b());
        }
        SNSPinView l11 = l();
        if (l11 != null && (text = l11.getText()) != null) {
            text.clear();
        }
        if (kotlin.jvm.internal.f.b(this.analPayload, state.a()) || !(!state.a().isEmpty())) {
            return;
        }
        Map<String, ? extends Object> map = this.analPayload;
        if (map != null) {
            getAnalyticsDelegate().c(getScreen(), getIdDocSetType(), map);
            getAnalyticsDelegate().d(getScreen(), getIdDocSetType(), state.a());
        }
        this.analPayload = state.a();
    }

    /* renamed from: com.sumsub.sns.presentation.screen.preview.ekyc.eid.b$b, reason: collision with other inner class name */
    public static final class C0380b implements TextWatcher {
        public C0380b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            if (charSequence != null) {
                b.this.getViewModel().b(charSequence.toString());
                TextView k3 = b.this.k();
                if (k3 != null) {
                    k3.setVisibility(8);
                }
                SNSPinView l10 = b.this.l();
                if (l10 == null) {
                    return;
                }
                l10.setError(false);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}

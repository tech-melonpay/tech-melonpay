package com.sumsub.sns.presentation.screen.error;

import O9.p;
import R0.a;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.presentation.screen.error.a;
import ia.InterfaceC0840h;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 V2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010$J;\u0010\u0016\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b\u0016\u0010,J\u000f\u0010-\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010.R\u001b\u00102\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u00101R\u001d\u00108\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010AR\u001d\u0010E\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010AR\u001d\u0010I\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lcom/sumsub/sns/presentation/screen/error/b;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/error/a$b;", "Lcom/sumsub/sns/internal/presentation/screen/error/a;", "<init>", "()V", "", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "state", "a", "(Lcom/sumsub/sns/internal/presentation/screen/error/a$b;Landroid/os/Bundle;)V", "reason", "", "payload", "", "delay", "finish", "(Lcom/sumsub/sns/internal/core/common/q;Ljava/lang/Object;Ljava/lang/Long;)V", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "onCancelResult", "()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "Lcom/sumsub/sns/internal/core/data/model/o;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Lcom/sumsub/sns/internal/core/data/model/o;Lcom/sumsub/sns/internal/presentation/screen/error/a$b;)V", "layout", "", "icon", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "iconState", "Lcom/sumsub/sns/internal/core/analytics/Control;", "clickControl", "(ILjava/lang/String;Lcom/sumsub/sns/internal/core/widget/SNSStepState;Lcom/sumsub/sns/internal/core/analytics/Control;)V", "l", "()Lcom/sumsub/sns/internal/core/data/model/o;", "LO9/f;", "q", "()Lcom/sumsub/sns/internal/presentation/screen/error/a;", "viewModel", "Landroid/view/ViewGroup;", "b", "Lcom/sumsub/sns/internal/core/common/z;", "n", "()Landroid/view/ViewGroup;", "stub", "Lcom/sumsub/sns/core/widget/SNSImageView;", "c", "m", "()Lcom/sumsub/sns/core/widget/SNSImageView;", "ivIcon", "Landroid/widget/TextView;", "d", "p", "()Landroid/widget/TextView;", "tvTitle", "e", "o", "tvSubTitle", "f", "k", "()Landroid/view/View;", "btn", "g", "Z", "callCancelledCallbackOnBackPress", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "h", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "i", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.b<a.b, com.sumsub.sns.internal.presentation.screen.error.a> {

    /* renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19891j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z stub;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z ivIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tvSubTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z btn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean callCancelledCallbackOnBackPress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: com.sumsub.sns.presentation.screen.error.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a(o oVar, String str) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("arg_error", oVar);
            if (str != null) {
                bundle.putString("arg_iddocsettype", str);
            }
            bVar.setArguments(bundle);
            return bVar;
        }

        public Companion() {
        }
    }

    /* renamed from: com.sumsub.sns.presentation.screen.error.b$b, reason: collision with other inner class name */
    public static final class C0375b extends Lambda implements InterfaceC0646l<String, p> {
        public C0375b() {
            super(1);
        }

        public final void a(String str) {
            b.this.getViewModel().a(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.error.SNSErrorFragment$initUi$4", f = "SNSErrorFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<a.k, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19901a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19902b;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.k kVar, T9.a<? super p> aVar) {
            return ((c) create(kVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = b.this.new c(aVar);
            cVar.f19902b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19901a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.this.updateCommonUiState((a.k) this.f19902b);
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19904a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19904a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19904a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19905a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19905a.invoke();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f19906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O9.f fVar) {
            super(0);
            this.f19906a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19906a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f19908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f19907a = interfaceC0635a;
            this.f19908b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19907a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19908b.getValue();
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
            return new com.sumsub.sns.internal.presentation.screen.error.b(bVar, bVar.getServiceLocator(), b.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, "stub", "getStub()Landroid/view/ViewGroup;", 0);
        kotlin.jvm.internal.i iVar = h.f23186a;
        f19891j = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, b.class, "ivIcon", "getIvIcon()Lcom/sumsub/sns/core/widget/SNSImageView;", 0), com.google.android.gms.measurement.internal.a.o(b.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(b.class, "tvSubTitle", "getTvSubTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(b.class, "btn", "getBtn()Landroid/view/View;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public b() {
        i iVar = new i();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new e(new d(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.error.a.class), new f(b9), iVar, new g(null, b9));
        this.stub = a0.a(this, R$id.sns_view_stub);
        this.ivIcon = a0.a(this, R$id.sns_error_icon);
        this.tvTitle = a0.a(this, R$id.sns_error_title);
        this.tvSubTitle = a0.a(this, R$id.sns_error_subtitle);
        this.btn = a0.a(this, R$id.sns_primary_button);
        this.callCancelledCallbackOnBackPress = true;
        o l10 = l();
        this.screen = l10 instanceof o.c ? Screen.OopsFatalScreen : l10 instanceof o.e ? Screen.OopsNetworkScreen : l10 instanceof o.d ? Screen.OopsActionScreen : Screen.Other;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void finish(q reason, Object payload, Long delay) {
        this.callCancelledCallbackOnBackPress = false;
        super.finish(reason, payload, delay);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_iddocsettype") : null;
        return string == null ? DocumentType.f15253j : string;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_error;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    public final View k() {
        return this.btn.a(this, f19891j[4]);
    }

    public final o l() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("arg_error") : null;
        o oVar = serializable instanceof o ? (o) serializable : null;
        return oVar == null ? new o.c(null, null, null, 7, null) : oVar;
    }

    public final SNSImageView m() {
        return (SNSImageView) this.ivIcon.a(this, f19891j[1]);
    }

    public final ViewGroup n() {
        return (ViewGroup) this.stub.a(this, f19891j[0]);
    }

    public final TextView o() {
        return (TextView) this.tvSubTitle.a(this, f19891j[3]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public SNSCompletionResult onCancelResult() {
        return new SNSCompletionResult.AbnormalTermination(l().b());
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        o l10 = l();
        if ((l10 instanceof o.e) || (l10 instanceof o.d)) {
            if (this.callCancelledCallbackOnBackPress && kotlin.jvm.internal.f.b(finishReason, q.c.f15162b)) {
                k0 appListener = getAppListener();
                if (appListener != null) {
                    appListener.b(l());
                }
            } else {
                k0 appListener2 = getAppListener();
                if (appListener2 != null) {
                    appListener2.a(l());
                }
            }
        } else if ((l10 instanceof o.c) && kotlin.jvm.internal.f.b(finishReason, q.c.f15162b)) {
            k0 appListener3 = getAppListener();
            if (appListener3 == null) {
                return false;
            }
            appListener3.a(l());
            return false;
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String str;
        super.onViewCreated(view, savedInstanceState);
        o l10 = l();
        Throwable b9 = l10.b();
        if (b9 == null || (str = b9.getMessage()) == null) {
            str = "unknown";
        }
        Pair[] pairArr = {new Pair(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(P9.z.n(1));
        kotlin.collections.a.u(linkedHashMap, pairArr);
        if ((l10.b() instanceof SNSGeneralException) && ((SNSGeneralException) l10.b()).getReason() != null) {
            linkedHashMap.put("reason", ((SNSGeneralException) l10.b()).getReason());
        }
        getAnalyticsDelegate().d(getScreen(), getIdDocSetType(), linkedHashMap);
    }

    public final TextView p() {
        return (TextView) this.tvTitle.a(this, f19891j[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.error.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.error.a) this.viewModel.getValue();
    }

    public final void a(o error, a.b state) {
        ViewGroup n10 = n();
        if ((n10 == null || n10.getChildCount() <= 0) && !kotlin.jvm.internal.f.b(state, a.b.C0287a.f17875a)) {
            if (kotlin.jvm.internal.f.b(state, a.b.c.f17879a)) {
                a(R$layout.sns_fragment_init_error, null, null, Control.CancelButton);
                return;
            }
            if (error instanceof o.d) {
                a(R$layout.sns_fragment_common_error, SNSIconHandler.SNSResultIcons.FAILURE.getImageName(), SNSStepState.REJECTED, Control.RetryButton);
                return;
            }
            if (error instanceof o.e) {
                a(R$layout.sns_fragment_network_error, SNSIconHandler.SNSResultIcons.WARNING.getImageName(), SNSStepState.PENDING, Control.RetryButton);
                return;
            }
            if (error instanceof o.c) {
                a(R$layout.sns_fragment_common_error, SNSIconHandler.SNSResultIcons.FAILURE.getImageName(), SNSStepState.REJECTED, Control.GoBackButton);
                TextView o10 = o();
                if (o10 != null) {
                    com.sumsub.sns.core.common.b.a(o10, new C0375b());
                }
            }
        }
    }

    public final void a(int layout, String icon, SNSStepState iconState, Control clickControl) {
        SNSImageView m2;
        LayoutInflater.from(requireContext()).inflate(layout, n());
        if (iconState != null && (m2 = m()) != null) {
            SNSStepViewExtensionsKt.setSnsStepState(m2, iconState);
        }
        if (icon != null) {
            Drawable onResolveIcon = e0.f15081a.getIconHandler().onResolveIcon(requireContext(), icon);
            SNSImageView m9 = m();
            if (m9 != null) {
                m9.setImageDrawable(onResolveIcon);
            }
        }
        View k3 = k();
        if (k3 != null) {
            k3.setOnClickListener(new B7.f(18, clickControl, this));
        }
        initCommonUI();
        b0.b(getViewModel().i(), getViewLifecycleOwner(), new c(null));
    }

    public static final void a(Control control, b bVar, View view) {
        if (control != null) {
            com.sumsub.sns.internal.core.analytics.c.b(bVar.getAnalyticsDelegate(), bVar.getScreen(), bVar.getIdDocSetType(), control, null, 8, null);
        }
        com.sumsub.sns.core.presentation.b.finish$default(bVar, null, null, null, 7, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(a.b state, Bundle savedInstanceState) {
        a(l(), state);
        if (state instanceof a.b.C0288b) {
            TextView p10 = p();
            if (p10 != null) {
                p10.setText(((a.b.C0288b) state).f());
            }
            TextView o10 = o();
            if (o10 != null) {
                o10.setText(((a.b.C0288b) state).e());
            }
            View k3 = k();
            TextView textView = k3 instanceof TextView ? (TextView) k3 : null;
            if (textView == null) {
                return;
            }
            textView.setText(((a.b.C0288b) state).d());
        }
    }
}

package com.sumsub.sns.presentation.screen.intro;

import O9.f;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import ia.InterfaceC0840h;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sumsub/sns/presentation/screen/intro/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/core/presentation/base/a$l;", "Lcom/sumsub/sns/internal/presentation/screen/intro/a;", "<init>", "()V", "", "getLayoutId", "()I", "state", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "handleState", "(Lcom/sumsub/sns/core/presentation/base/a$l;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Landroid/view/ViewGroup;", "a", "Lcom/sumsub/sns/internal/core/common/z;", "k", "()Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "b", "LO9/f;", "l", "()Lcom/sumsub/sns/internal/presentation/screen/intro/a;", "viewModel", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "c", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<a.l, com.sumsub.sns.internal.presentation.screen.intro.a> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19911d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z content = a0.a(this, R$id.sns_container);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: com.sumsub.sns.presentation.screen.intro.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str, String str2, String str3, boolean z10, String str4) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("sns_param_step", str);
            bundle.putString("sns_param_document_type", str3);
            bundle.putString("sns_param_scene", str2);
            bundle.putString("sns_param_country_code", str4);
            bundle.putBoolean("sns_param_cancel_on_back", z10);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19914a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19914a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19915a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19915a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f19916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f19916a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19916a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19917a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f19918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f19917a = interfaceC0635a;
            this.f19918b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19917a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19918b.getValue();
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
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.intro.b(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, FirebaseAnalytics.Param.CONTENT, "getContent()Landroid/view/ViewGroup;", 0);
        h.f23186a.getClass();
        f19911d = new InterfaceC0840h[]{propertyReference1Impl};
        INSTANCE = new Companion(null);
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.intro.a.class), new d(b9), gVar, new e(null, b9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().r();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_intro;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // com.sumsub.sns.core.presentation.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleState(com.sumsub.sns.core.presentation.base.a.l r8, android.os.Bundle r9) {
        /*
            r7 = this;
            boolean r9 = r8 instanceof com.sumsub.sns.internal.presentation.screen.intro.a.c
            if (r9 == 0) goto Lb9
            com.sumsub.sns.internal.presentation.screen.intro.a$c r8 = (com.sumsub.sns.internal.presentation.screen.intro.a.c) r8
            java.util.Map r9 = r8.c()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L12
            goto Lb9
        L12:
            com.sumsub.sns.internal.core.common.e0 r9 = com.sumsub.sns.internal.core.common.e0.f15081a
            com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler r0 = r9.getInstructionsViewHandler()
            r9 = 0
            if (r0 == 0) goto L67
            android.content.Context r1 = r7.requireContext()
            com.sumsub.sns.internal.core.presentation.intro.f r2 = r8.d()
            java.lang.String r2 = r2.c()
            com.sumsub.sns.internal.core.presentation.intro.f r3 = r8.d()
            java.lang.String r3 = r3.a()
            com.sumsub.sns.internal.core.presentation.intro.f r4 = r8.d()
            java.lang.String r4 = r4.b()
            com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler$Position r5 = com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler.Position.FULLSCREEN
            java.lang.String r5 = r5.getValue()
            com.sumsub.sns.internal.presentation.screen.intro.a r6 = r7.getViewModel()
            java.lang.String r6 = r6.p()
            android.view.View r0 = r0.onVerificationStep(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L67
            android.view.ViewGroup r1 = r7.k()
            if (r1 == 0) goto L54
            r1.removeAllViews()
        L54:
            android.view.ViewGroup r1 = r7.k()
            if (r1 == 0) goto L67
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.addView(r0, r2)
            O9.p r0 = O9.p.f3034a
            goto L68
        L67:
            r0 = r9
        L68:
            if (r0 != 0) goto L8b
            com.sumsub.sns.core.presentation.intro.b r0 = new com.sumsub.sns.core.presentation.intro.b
            com.sumsub.sns.internal.core.a r1 = r7.getServiceLocator()
            com.sumsub.sns.internal.core.data.source.extensions.a r1 = r1.q()
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3, r9)
            android.view.View r1 = r7.getView()
            if (r1 != 0) goto L80
            goto L8b
        L80:
            java.util.Map r2 = r8.c()
            int r3 = com.sumsub.sns.R$id.sns_container
            int r4 = com.sumsub.sns.R$id.sns_primary_button
            r0.a(r1, r2, r3, r4)
        L8b:
            android.view.View r0 = r7.getView()
            if (r0 == 0) goto Lb9
            int r1 = com.sumsub.sns.R$id.sns_primary_button
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto Lb9
            java.util.Map r8 = r8.c()
            java.lang.String r1 = "actionTitle"
            java.lang.Object r8 = r8.get(r1)
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto Lac
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        Lac:
            r0.setText(r9)
            J7.b r8 = new J7.b
            r9 = 17
            r8.<init>(r7, r9)
            r0.setOnClickListener(r8)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.intro.a.handleState(com.sumsub.sns.core.presentation.base.a$l, android.os.Bundle):void");
    }

    public final ViewGroup k() {
        return (ViewGroup) this.content.a(this, f19911d[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.intro.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.intro.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (!(finishReason instanceof q.c) || !getViewModel().s()) {
            return super.onFinishCalled(finishReason);
        }
        com.sumsub.sns.core.presentation.b.finish$default(this, new q.d(new SNSCompletionResult.SuccessTermination(null, 1, null)), null, null, 6, null);
        return false;
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.core.presentation.b.setResult$default(aVar, 0, new Bundle(), 1, null);
    }
}

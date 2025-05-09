package com.sumsub.sns.presentation.dialogs.bottomsheet;

import O9.p;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.bumptech.glide.load.Key;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.u;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0014X\u0094D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/sumsub/sns/presentation/dialogs/bottomsheet/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/core/presentation/base/a$l;", "Lcom/sumsub/sns/internal/presentation/dialogs/bottomsheet/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "a", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "b", "LO9/f;", "k", "()Lcom/sumsub/sns/internal/presentation/dialogs/bottomsheet/a;", "getViewModel$annotations", "viewModel", "c", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<a.l, com.sumsub.sns.internal.presentation.dialogs.bottomsheet.a> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType = DocumentType.f15253j;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: com.sumsub.sns.presentation.dialogs.bottomsheet.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_DATA", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, p> {
        public b() {
            super(1);
        }

        public final void a(String str) {
            a.this.getViewModel().a(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19667a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19667a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19668a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19668a.invoke();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f19669a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(O9.f fVar) {
            super(0);
            this.f19669a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19669a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19670a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f19671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f19670a = interfaceC0635a;
            this.f19671b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19670a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19671b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<T> {

        /* renamed from: com.sumsub.sns.presentation.dialogs.bottomsheet.a$h$a, reason: collision with other inner class name */
        public static final class C0366a implements T {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f19673a;

            public C0366a(a aVar) {
                this.f19673a = aVar;
            }

            @Override // androidx.lifecycle.T
            public <T extends Q> T create(Class<T> cls) {
                return new com.sumsub.sns.internal.presentation.dialogs.bottomsheet.a(this.f19673a.getServiceLocator().n(), this.f19673a.getServiceLocator().p());
            }
        }

        public h() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return new C0366a(a.this);
        }
    }

    public a() {
        h hVar = new h();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new d(new c(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.presentation.dialogs.bottomsheet.a.class), new e(b9), hVar, new f(null, b9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_terms_and_conditions;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.dialogs.bottomsheet.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.dialogs.bottomsheet.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Float a10;
        String string;
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R$id.sns_text);
        WebView webView = (WebView) view.findViewById(R$id.sns_webview);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R$id.sns_content);
        NestedScrollView nestedScrollView2 = (NestedScrollView) view.findViewById(R$id.sns_web_content);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ARGS_DATA")) != null) {
            if (u.a(string)) {
                nestedScrollView.setVisibility(8);
                webView.loadDataWithBaseURL(null, string, "text/html", Key.STRING_CHARSET_NAME, null);
            } else {
                nestedScrollView2.setVisibility(8);
                textView.setText(i.a(string, requireContext()));
                com.sumsub.sns.core.common.b.a(textView, new b());
            }
        }
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, SNSMetricElement.SCREEN_HORIZONTAL_MARGIN)) == null) {
            return;
        }
        int floatValue = (int) a10.floatValue();
        nestedScrollView2.setPadding(floatValue, nestedScrollView2.getPaddingTop(), floatValue, nestedScrollView2.getPaddingBottom());
    }
}

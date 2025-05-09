package com.sumsub.sns.presentation.screen.preview.ekyc;

import R0.a;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSErrorBottomSheetView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSTextButton;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.s;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.b;
import ia.InterfaceC0840h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import t0.C1275b;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0006J\u0019\u0010\"\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J+\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u000f\u0010-R\u001b\u00101\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u001d\u0010>\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u0010=R\u001d\u0010F\u001a\u0004\u0018\u00010B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u0010JR\u001d\u0010N\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00103\u001a\u0004\bM\u0010=R\u001d\u0010S\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bQ\u0010RR\u001d\u0010X\u001a\u0004\u0018\u00010T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bV\u0010WR\u001d\u0010]\u001a\u0004\u0018\u00010Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00103\u001a\u0004\b[\u0010\\R\u001d\u0010`\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bZ\u0010_R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010bR\u001d\u0010g\u001a\u0004\u0018\u00010d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00103\u001a\u0004\be\u0010fR\u001d\u0010i\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bh\u0010=R\u001d\u0010l\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u00103\u001a\u0004\bk\u0010=R\u0018\u0010o\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010qR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010uR\u0016\u0010y\u001a\u0004\u0018\u00010w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010xR \u0010~\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020{0z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0018\u0010v\u001a\u00020t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u007fR\u0017\u0010\u0082\u0001\u001a\u00020p8TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u000f\u0010\u0084\u0001R\"\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020{0z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010}R\"\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020{0z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010}R\"\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020{0z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010}R\"\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020{0z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010}¨\u0006\u008e\u0001"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/ekyc/a;", "Lcom/sumsub/sns/presentation/screen/preview/a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b;", "Lcom/sumsub/sns/internal/core/presentation/form/a;", "<init>", "()V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$d;", "viewState", "LO9/p;", "b", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$d;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$e;", "state", "prevState", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$e;Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$a;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$a;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$f;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f$f;)V", "nextViewState", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;)V", "A", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;Landroid/os/Bundle;)V", "LO9/f;", "y", "()Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b;", "viewModel", "Landroid/widget/Button;", "Lcom/sumsub/sns/internal/core/common/z;", "t", "()Landroid/widget/Button;", "primaryButton", "c", "m", "btnSkip", "Landroid/widget/TextView;", "d", "x", "()Landroid/widget/TextView;", "tvTitle", "e", "w", "tvSubtitle", "Landroid/view/ViewGroup;", "f", "o", "()Landroid/view/ViewGroup;", "formContainer", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "g", "s", "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "pinField", "h", "r", "pinError", "Lcom/sumsub/sns/core/widget/SNSTextButton;", "i", "l", "()Lcom/sumsub/sns/core/widget/SNSTextButton;", "btnResendCode", "Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", "j", "n", "()Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", "errorBottomSheet", "Landroid/webkit/WebView;", "k", "z", "()Landroid/webkit/WebView;", "webView", "Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", "()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", "bottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Landroid/widget/ImageView;", "q", "()Landroid/widget/ImageView;", "ivIcon", "v", "tvStatusTitle", "p", "u", "tvStatusComment", "Lcom/sumsub/sns/internal/domain/c;", "Lcom/sumsub/sns/internal/domain/c;", "resources", "", "Ljava/lang/String;", "analyticsCountry", "analyticsSourceId", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "analyticsScreen", "Lcom/sumsub/sns/core/presentation/form/d;", "()Lcom/sumsub/sns/core/presentation/form/d;", "formFragment", "", "", "getCommonPayload", "()Ljava/util/Map;", "commonPayload", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/b$f;)Lcom/sumsub/sns/internal/core/analytics/Screen;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lcom/sumsub/sns/internal/core/presentation/form/b;", "()Lcom/sumsub/sns/internal/core/presentation/form/b;", "hostViewModel", "getOpenPayload", "openPayload", "getAppearPayload", "appearPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.presentation.screen.preview.a<b.f, com.sumsub.sns.internal.presentation.screen.preview.ekyc.b> implements com.sumsub.sns.internal.core.presentation.form.a {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19935v;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z primaryButton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z btnSkip;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z formContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z pinField;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z pinError;

    /* renamed from: i, reason: from kotlin metadata */
    public final z btnResendCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z errorBottomSheet;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final z webView;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final z bottomSheet;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public BottomSheetBehavior<SNSBottomSheetView> bottomSheetBehavior;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final z ivIcon;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final z tvStatusTitle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final z tvStatusComment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.domain.c resources;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String analyticsCountry;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public String analyticsSourceId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Screen analyticsScreen;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.ekyc.a$a, reason: collision with other inner class name and from kotlin metadata */
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

    public static final class c extends BottomSheetBehavior.g {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View view, float f10) {
            float R = f10 >= 0.7f ? ha.h.R((1.0f - f10) - 0.05f, 0.0f, 1.0f) : 1.0f;
            ActivityC0533g activity = a.this.getActivity();
            View findViewById = activity != null ? activity.findViewById(R$id.sns_toolbar) : null;
            if (findViewById == null) {
                return;
            }
            findViewById.setAlpha(R);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View view, int i) {
            View findViewById;
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            StringBuilder sb2 = new StringBuilder("webViewSheet hidden=");
            sb2.append(i == 4);
            Logger.v$default(aVar, "EKyc", sb2.toString(), null, 4, null);
            ActivityC0533g activity = a.this.getActivity();
            if (activity == null || (findViewById = activity.findViewById(R$id.sns_toolbar)) == null) {
                return;
            }
            com.sumsub.sns.internal.core.common.i.b(findViewById, i == 4);
        }
    }

    public static final class d implements SNSPinView.OnTextCompleteListener {
        @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.OnTextCompleteListener
        public boolean onTextComplete(String str) {
            return true;
        }
    }

    public static final class e extends WebViewClient {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.f.d f19958b;

        public e(b.f.d dVar) {
            this.f19958b = dVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            BottomSheetBehavior bottomSheetBehavior = a.this.bottomSheetBehavior;
            if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
                return false;
            }
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (url == null) {
                return false;
            }
            return a.this.getViewModel().a(url, this.f19958b.c());
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f19959a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19959a;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19960a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19960a.invoke();
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f19961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(O9.f fVar) {
            super(0);
            this.f19961a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19961a.getValue()).getViewModelStore();
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f19963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f19962a = interfaceC0635a;
            this.f19963b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19962a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19963b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class k extends Lambda implements InterfaceC0635a<T> {
        public k() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) C1275b.a(arguments, Document.class, "ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new b.e(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f19935v = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "btnSkip", "getBtnSkip()Landroid/widget/Button;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "formContainer", "getFormContainer()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "pinField", "getPinField()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "pinError", "getPinError()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "btnResendCode", "getBtnResendCode()Lcom/sumsub/sns/core/widget/SNSTextButton;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "errorBottomSheet", "getErrorBottomSheet()Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "webView", "getWebView()Landroid/webkit/WebView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "bottomSheet", "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvStatusTitle", "getTvStatusTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvStatusComment", "getTvStatusComment()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        k kVar = new k();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new g(new f(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.b.class), new h(b9), kVar, new i(null, b9));
        this.primaryButton = a0.a(this, R$id.sns_primary_button);
        this.btnSkip = a0.a(this, R$id.sns_secondary_button);
        this.tvTitle = a0.a(this, R$id.sns_title);
        this.tvSubtitle = a0.a(this, R$id.sns_subtitle);
        this.formContainer = a0.a(this, R$id.sns_form_container);
        this.pinField = a0.a(this, R$id.sns_pin_code);
        this.pinError = a0.a(this, R$id.sns_pin_error);
        this.btnResendCode = a0.a(this, R$id.sns_resend_verification_code);
        this.errorBottomSheet = a0.a(this, R$id.sns_error_bottom_sheet);
        this.webView = a0.a(this, R$id.sns_webview);
        this.bottomSheet = a0.a(this, R$id.sns_web_view_bottom_sheet);
        this.ivIcon = a0.a(this, R$id.sns_status_icon);
        this.tvStatusTitle = a0.a(this, R$id.sns_status_title);
        this.tvStatusComment = a0.a(this, R$id.sns_status_comment);
        this.analyticsScreen = Screen.Other;
    }

    public static final void e(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.SkipButton, aVar.getCommonPayload());
        aVar.getViewModel().L();
    }

    public final void A() {
        getViewModel().I();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return getCommonPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return getCommonPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return getCommonPayload();
    }

    public final Map<String, Object> getCommonPayload() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.analyticsCountry;
        if (str != null) {
            linkedHashMap.put(GlobalStatePayload.Country.getText(), str);
        }
        String str2 = this.analyticsSourceId;
        if (str2 != null) {
            linkedHashMap.put("sourceId", str2);
        }
        if (this.analyticsScreen == Screen.EkycFinishScreen) {
            linkedHashMap.put("result", "failure");
        }
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        DocumentType type;
        String c2;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) C1275b.a(arguments, Document.class, "ARGS_DOCUMENT") : null;
        return (document == null || (type = document.getType()) == null || (c2 = type.c()) == null) ? DocumentType.f15253j : c2;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_ekyc;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return getCommonPayload();
    }

    @Override // com.sumsub.sns.presentation.screen.preview.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof b.d) {
            SNSErrorBottomSheetView n10 = n();
            if (n10 != null) {
                b.d dVar = (b.d) event;
                SNSErrorBottomSheetView.show$default(n10, dVar.d(), null, dVar.c(), null, null, 26, null);
                return;
            }
            return;
        }
        if (!(event instanceof b.c)) {
            super.handleEvent(event);
        } else {
            b.c cVar = (b.c) event;
            navigateTo(com.sumsub.sns.presentation.screen.preview.ekyc.eid.a.INSTANCE.a(cVar.e(), cVar.f(), cVar.d()).forResult("eid_request_key"), "SNSEidMainFragment");
        }
    }

    public final SNSBottomSheetView k() {
        return (SNSBottomSheetView) this.bottomSheet.a(this, f19935v[10]);
    }

    public final SNSTextButton l() {
        return (SNSTextButton) this.btnResendCode.a(this, f19935v[7]);
    }

    public final Button m() {
        return (Button) this.btnSkip.a(this, f19935v[1]);
    }

    public final SNSErrorBottomSheetView n() {
        return (SNSErrorBottomSheetView) this.errorBottomSheet.a(this, f19935v[8]);
    }

    public final ViewGroup o() {
        return (ViewGroup) this.formContainer.a(this, f19935v[4]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView z10 = z();
        if (z10 != null) {
            z10.destroy();
        }
        super.onDestroyView();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        SNSPinView s10 = s();
        if (s10 != null) {
            com.sumsub.sns.internal.core.common.i.b(s10);
        }
        return getViewModel().z() && super.onFinishCalled(finishReason);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SNSBottomSheetView k3 = k();
        if (k3 != null) {
            BottomSheetBehavior<SNSBottomSheetView> from = BottomSheetBehavior.from(k3);
            from.setState(4);
            from.setHideable(false);
            from.setDraggable(false);
            from.setPeekHeight(0);
            from.setFitToContents(false);
            from.setExpandedOffset(0);
            from.addBottomSheetCallback(new c());
            from.setState(4);
            this.bottomSheetBehavior = from;
        }
        SNSBottomSheetView k10 = k();
        SNSToolbarView sNSToolbarView = k10 != null ? (SNSToolbarView) k10.findViewById(R$id.sns_bottomsheet_toolbar) : null;
        if (sNSToolbarView != null) {
            sNSToolbarView.setCloseButtonDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.CLOSE.getImageName()));
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setOnCloseButtonClickListener(new com.sumsub.sns.presentation.screen.preview.ekyc.b(this, 1));
        }
        Button m2 = m();
        if (m2 != null) {
            m2.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.ekyc.b(this, 2));
        }
        SNSPinView s10 = s();
        if (s10 != null) {
            s10.addTextChangedListener(new b());
        }
        SNSPinView s11 = s();
        if (s11 == null) {
            return;
        }
        s11.setOnTextCompleteListener(new d());
    }

    @Override // com.sumsub.sns.presentation.screen.h, com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        requireActivity().getSupportFragmentManager().g0("eid_request_key", this, new com.sumsub.sns.geo.presentation.d(this, 5));
    }

    public final com.sumsub.sns.core.presentation.form.d p() {
        Fragment F10 = getChildFragmentManager().F(R$id.sns_form_container);
        if (F10 instanceof com.sumsub.sns.core.presentation.form.d) {
            return (com.sumsub.sns.core.presentation.form.d) F10;
        }
        return null;
    }

    public final ImageView q() {
        return (ImageView) this.ivIcon.a(this, f19935v[11]);
    }

    public final TextView r() {
        return (TextView) this.pinError.a(this, f19935v[6]);
    }

    public final SNSPinView s() {
        return (SNSPinView) this.pinField.a(this, f19935v[5]);
    }

    public final Button t() {
        return (Button) this.primaryButton.a(this, f19935v[0]);
    }

    public final TextView u() {
        return (TextView) this.tvStatusComment.a(this, f19935v[13]);
    }

    public final TextView v() {
        return (TextView) this.tvStatusTitle.a(this, f19935v[12]);
    }

    public final TextView w() {
        return (TextView) this.tvSubtitle.a(this, f19935v[3]);
    }

    public final TextView x() {
        return (TextView) this.tvTitle.a(this, f19935v[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.ekyc.b getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.ekyc.b) this.viewModel.getValue();
    }

    public final WebView z() {
        return (WebView) this.webView.a(this, f19935v[9]);
    }

    public static final void c(a aVar, View view) {
        aVar.getViewModel().J();
    }

    public static final void d(a aVar, View view) {
        aVar.getViewModel().G();
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.a
    public com.sumsub.sns.internal.core.presentation.form.b a() {
        return getViewModel();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void b(b.f.d viewState) {
        com.sumsub.sns.internal.core.common.i.c(k());
        View view = getView();
        if (view != null) {
            com.sumsub.sns.internal.core.common.i.b(view);
        }
        WebView z10 = z();
        if (z10 != null) {
            com.sumsub.sns.internal.core.common.i.b((View) z10, true);
        }
        WebView z11 = z();
        if (z11 != null) {
            z11.setWebViewClient(new e(viewState));
        }
        WebView z12 = z();
        WebSettings settings = z12 != null ? z12.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        String d10 = viewState.d();
        if (d10 != null) {
            WebView z13 = z();
            if (z13 != null) {
                z13.loadUrl(d10);
            }
            WebView z14 = z();
            if (z14 != null) {
                z14.getUrl();
            }
        }
        BottomSheetBehavior<SNSBottomSheetView> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setState(3);
    }

    public static final void a(a aVar, String str, Bundle bundle) {
        if (com.sumsub.sns.core.presentation.b.INSTANCE.b(bundle)) {
            String string = bundle.getString("result_token");
            if (string != null) {
                aVar.getViewModel().d(string);
                return;
            } else {
                aVar.getViewModel().H();
                com.sumsub.sns.internal.core.common.i.c(aVar.o());
                return;
            }
        }
        aVar.getViewModel().H();
        com.sumsub.sns.internal.core.common.i.c(aVar.o());
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(b.f state, b.f prevState, Bundle savedInstanceState) {
        com.sumsub.sns.core.presentation.form.d p10;
        BottomSheetBehavior<SNSBottomSheetView> bottomSheetBehavior;
        BottomSheetBehavior<SNSBottomSheetView> bottomSheetBehavior2;
        b(state);
        boolean z10 = state instanceof b.f.d;
        if (!z10 && (bottomSheetBehavior = this.bottomSheetBehavior) != null && com.sumsub.sns.core.common.a.a(bottomSheetBehavior) && (bottomSheetBehavior2 = this.bottomSheetBehavior) != null) {
            bottomSheetBehavior2.setState(4);
        }
        boolean z11 = state instanceof b.f.a;
        if (!z11 && (p10 = p()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0527a c0527a = new C0527a(childFragmentManager);
            c0527a.l(p10);
            c0527a.j();
        }
        if (state instanceof b.f.c) {
            com.sumsub.sns.internal.core.common.i.a(t(), m(), x(), w(), r(), s(), l(), z(), q(), v(), u(), k());
            View view = getView();
            if (view != null) {
                com.sumsub.sns.internal.core.common.i.b(view);
                return;
            }
            return;
        }
        if (z10) {
            a((b.f.d) state);
            return;
        }
        if (z11) {
            a((b.f.a) state);
        } else if (state instanceof b.f.e) {
            a((b.f.e) state, prevState);
        } else if (state instanceof b.f.C0298f) {
            a((b.f.C0298f) state);
        }
    }

    public static final void b(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.RetryButton, aVar.getCommonPayload());
        aVar.A();
    }

    public final void b(b.f nextViewState) {
        Screen a10 = a(nextViewState);
        if (a10 == Screen.Other) {
            return;
        }
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        Logger.v$default(aVar, "EKyc", "handleAnalyticsScreenChange: nextScreen=" + a10, null, 4, null);
        if (nextViewState instanceof b.f.a) {
            b.f.a aVar2 = (b.f.a) nextViewState;
            this.analyticsCountry = aVar2.k();
            this.analyticsSourceId = aVar2.l();
            Logger.v$default(aVar, "EKyc", "handleAnalyticsScreenChange: country=" + this.analyticsCountry + ", sourceId=" + this.analyticsSourceId, null, 4, null);
        }
        if (a10 == this.analyticsScreen) {
            return;
        }
        getAnalyticsDelegate().c(this.analyticsScreen, getIdDocSetType(), getCommonPayload());
        this.analyticsScreen = a10;
        getAnalyticsDelegate().d(this.analyticsScreen, getIdDocSetType(), getCommonPayload());
        getAnalyticsDelegate().a(this.analyticsScreen, getIdDocSetType(), getCommonPayload());
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            a.this.getViewModel().a(charSequence);
            TextView r8 = a.this.r();
            if (r8 != null) {
                r8.setText((CharSequence) null);
            }
            SNSPinView s10 = a.this.s();
            if (s10 == null) {
                return;
            }
            s10.setError(false);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    public final void a(b.f.e state, b.f prevState) {
        s r8;
        Integer b9;
        com.sumsub.sns.internal.core.common.i.a(t(), m(), x(), w(), z(), q(), v(), u(), k());
        com.sumsub.sns.internal.core.common.i.c(r(), s());
        TextView x9 = x();
        if (x9 != null) {
            com.sumsub.sns.internal.core.common.i.a(x9, state.l());
        }
        TextView w2 = w();
        if (w2 != null) {
            com.sumsub.sns.internal.core.common.i.a(w2, state.k());
        }
        if (state.i() > 0) {
            SNSTextButton l10 = l();
            if (l10 != null) {
                l10.setEnabled(false);
            }
            SNSTextButton l11 = l();
            if (l11 != null) {
                l11.setOnClickListener(null);
            }
        } else {
            SNSTextButton l12 = l();
            if (l12 != null) {
                l12.setEnabled(true);
            }
            SNSTextButton l13 = l();
            if (l13 != null) {
                l13.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.ekyc.b(this, 4));
            }
        }
        SNSTextButton l14 = l();
        if (l14 != null) {
            com.sumsub.sns.internal.core.common.i.a(l14, state.g());
        }
        if (prevState instanceof b.f.e) {
            return;
        }
        SNSPinView s10 = s();
        if (s10 != null) {
            s10.setText((CharSequence) null);
        }
        TextView r10 = r();
        if (r10 != null) {
            r10.setText(state.h());
        }
        com.sumsub.sns.internal.core.data.source.applicant.remote.e0 j10 = state.j();
        if (j10 != null && (r8 = j10.r()) != null && (b9 = r8.b()) != null) {
            int intValue = b9.intValue();
            SNSPinView s11 = s();
            if (s11 != null) {
                s11.setItemCount(intValue);
            }
        }
        SNSPinView s12 = s();
        if (s12 != null) {
            com.sumsub.sns.internal.core.common.i.g(s12);
        }
    }

    public final void a(b.f.a state) {
        this.resources = state.n();
        TextView x9 = x();
        if (x9 != null) {
            x9.setVisibility(8);
        }
        TextView w2 = w();
        if (w2 != null) {
            w2.setVisibility(8);
        }
        Button t3 = t();
        if (t3 != null) {
            com.sumsub.sns.internal.core.common.i.a(t3, state.i());
        }
        Button m2 = m();
        if (m2 != null) {
            com.sumsub.sns.internal.core.common.i.a(m2, state.j());
        }
        if (p() == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0527a c0527a = new C0527a(childFragmentManager);
            c0527a.e(R$id.sns_form_container, com.sumsub.sns.core.presentation.form.d.INSTANCE.a("EKyc"), null);
            c0527a.j();
        }
        com.sumsub.sns.internal.core.common.i.c(o());
        com.sumsub.sns.internal.core.common.i.a(r(), s(), l(), z(), q(), v(), u(), k());
        Button t10 = t();
        if (t10 != null) {
            t10.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.ekyc.b(this, 0));
        }
    }

    public static final void a(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.ContinueButton, aVar.getCommonPayload());
        aVar.A();
    }

    public final void a(b.f.d state) {
        com.sumsub.sns.internal.core.common.i.a(t(), m(), x(), w(), r(), s(), l(), q(), v(), u());
        View view = getView();
        if (view != null) {
            com.sumsub.sns.internal.core.common.i.b(view);
        }
        b(state);
    }

    public final void a(b.f.C0298f state) {
        com.sumsub.sns.internal.core.common.i.a(t(), m(), x(), w(), r(), s(), l(), k());
        View view = getView();
        if (view != null) {
            com.sumsub.sns.internal.core.common.i.b(view);
        }
        ImageView q10 = q();
        if (q10 != null) {
            com.sumsub.sns.internal.core.common.i.b((View) q10, true);
        }
        ImageView q11 = q();
        if (q11 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(q11, state.e() ? SNSStepState.REJECTED : SNSStepState.APPROVED);
        }
        ImageView q12 = q();
        if (q12 != null) {
            q12.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.a()));
        }
        TextView v10 = v();
        if (v10 != null) {
            com.sumsub.sns.internal.core.common.i.a(v10, state.d());
        }
        TextView u6 = u();
        if (u6 != null) {
            com.sumsub.sns.internal.core.common.i.a(u6, state.c());
        }
        Button t3 = t();
        if (t3 != null) {
            com.sumsub.sns.internal.core.common.i.a(t3, state.b());
        }
        Button t10 = t();
        if (t10 != null) {
            t10.setEnabled(true);
        }
        Button t11 = t();
        if (t11 != null) {
            t11.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.ekyc.b(this, 3));
        }
    }

    public final Screen a(b.f fVar) {
        if ((fVar instanceof b.f.C0297b) || (fVar instanceof b.f.a)) {
            return Screen.EkycFormScreen;
        }
        if (fVar instanceof b.f.e) {
            return Screen.EkycOtpConfirmationScreen;
        }
        if (fVar instanceof b.f.d) {
            return Screen.EkycOauthConfirmationScreen;
        }
        if (fVar instanceof b.f.C0298f) {
            Screen screen = ((b.f.C0298f) fVar).e() ? Screen.EkycFinishScreen : null;
            return screen == null ? Screen.Other : screen;
        }
        return Screen.Other;
    }
}

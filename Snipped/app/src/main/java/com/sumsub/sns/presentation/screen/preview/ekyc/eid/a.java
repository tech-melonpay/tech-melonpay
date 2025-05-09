package com.sumsub.sns.presentation.screen.preview.ekyc.eid;

import O9.p;
import R0.a;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSDotsProgressView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a;
import ia.InterfaceC0840h;
import java.util.Map;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0003¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\n\u0010\u0011J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\n\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J)\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\n\u0010\u001dJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\n\u0010\u001fJ!\u0010\n\u001a\u0004\u0018\u00010\"2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\n\u0010#J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b\n\u0010&J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020'H\u0002¢\u0006\u0004\b\n\u0010(J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020)H\u0002¢\u0006\u0004\b\n\u0010*J\u000f\u0010+\u001a\u00020 H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\tH\u0017¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\u0006J!\u00106\u001a\u00020\t2\u0006\u00103\u001a\u00020\"2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010\u0006J\u0017\u0010;\u001a\u00020\t2\u0006\u0010%\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u000104H\u0014¢\u0006\u0004\b\n\u0010=J\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010\u0006R\u001b\u0010C\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010G\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010M\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010Q\u001a\u0004\u0018\u00010N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bO\u0010PR\u001d\u0010V\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010jR\u0014\u0010o\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR \u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020q0p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020q0p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010sR \u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020q0p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010sR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020q0p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010s¨\u0006{"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/ekyc/eid/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/i$b;", "<init>", "()V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$b;", "state", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$b;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$a;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$a;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$f;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$f;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$e;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$e;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$d;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b$d;)V", "p", "", "needCan", "(Z)V", "k", "", "oldPin", "newPin", "lastPinDigit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pin", "(Ljava/lang/String;)V", "", "layout", "Landroid/view/View;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b;I)Landroid/view/View;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$k;", "event", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$k;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$l;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$l;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$j;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$j;)V", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "onResume", "onPause", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Lcom/sumsub/sns/core/presentation/base/a$j;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "(Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b;Landroid/os/Bundle;)V", "b", "d", "LO9/f;", "o", "()Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a;", "viewModel", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/view/ViewGroup;", "c", "Lcom/sumsub/sns/internal/core/common/z;", "m", "()Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "Lcom/sumsub/sns/core/widget/SNSToolbarView;", "n", "()Lcom/sumsub/sns/core/widget/SNSToolbarView;", "toolbarView", "Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", "e", "l", "()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", "bottomSheet", "f", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/b;", "currentState", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/d;", "g", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/d;", "authadaInteractor", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/i;", "h", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/i;", "nfcBroadcastReceiver", "Landroid/app/AlertDialog;", "i", "Landroid/app/AlertDialog;", "nfcStateAlertDialog", "j", "Z", "forcedFinish", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/a$a;", "analyticsWrapper", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b, com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a> implements i.b {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19968m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z content;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z toolbarView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z bottomSheet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b currentState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.d authadaInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i nfcBroadcastReceiver;

    /* renamed from: i, reason: from kotlin metadata */
    public AlertDialog nfcStateAlertDialog;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean forcedFinish;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public a.C0301a analyticsWrapper;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.ekyc.eid.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final a a(String str, String str2, String str3) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("eid_mobile_token", str);
            bundle.putString("eid_hash", str3);
            bundle.putString("eid_url", str2);
            aVar.setArguments(bundle);
            return aVar;
        }

        public final boolean a(Context context) {
            NfcManager nfcManager = (NfcManager) (context != null ? context.getSystemService("nfc") : null);
            NfcAdapter defaultAdapter = nfcManager != null ? nfcManager.getDefaultAdapter() : null;
            if (defaultAdapter != null) {
                return defaultAdapter.isEnabled();
            }
            return false;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f19980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.a aVar) {
            super(0);
            this.f19980b = aVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.ContinueButton, null, 8, null);
            a.this.getViewModel().a(this.f19980b.j());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<p> {
        public c() {
            super(0);
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.a(a.this.getAnalyticsDelegate(), Screen.EidServiceInfo, null, 2, null);
            SNSCommonBottomSheetView l10 = a.this.l();
            if (l10 != null) {
                l10.hide();
            }
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.DismissButton, null, 8, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.C0326b f19983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.C0326b c0326b) {
            super(0);
            this.f19983b = c0326b;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.InfoButton, null, 8, null);
            a.this.getViewModel().a(this.f19983b.l());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.C0326b f19985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.C0326b c0326b) {
            super(0);
            this.f19985b = c0326b;
        }

        public final void a() {
            a.this.getViewModel().a(this.f19985b.j());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<p> {
        public f() {
            super(0);
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.a(a.this.getAnalyticsDelegate(), Screen.EidPinInfo, null, 2, null);
            SNSCommonBottomSheetView l10 = a.this.l();
            if (l10 != null) {
                l10.hide();
            }
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.DismissButton, null, 8, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.d f19988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b.d dVar) {
            super(0);
            this.f19988b = dVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.InfoButton, null, 8, null);
            a.this.getViewModel().a(this.f19988b.n());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.d f19990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b.d dVar) {
            super(0);
            this.f19990b = dVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.EidProceedToIdentButton, null, 8, null);
            a.this.getViewModel().a(this.f19990b.p());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.d f19992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b.d dVar) {
            super(0);
            this.f19992b = dVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.EidChangeTransportPinButton, null, 8, null);
            a.this.getViewModel().a(this.f19992b.l());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.e f19994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b.e eVar) {
            super(0);
            this.f19994b = eVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.CancelButton, null, 8, null);
            a.this.getViewModel().a(this.f19994b.j());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class k extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.f f19996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b.f fVar) {
            super(0);
            this.f19996b = fVar;
        }

        public final void a() {
            com.sumsub.sns.internal.core.analytics.c.b(a.this.getAnalyticsDelegate(), com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(a.this.getViewModel(), null, 1, null), a.this.getIdDocSetType(), Control.ContinueButton, null, 8, null);
            a.this.getViewModel().a(this.f19996b.j());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f19997a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19997a;
        }
    }

    public static final class m extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19998a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19998a.invoke();
        }
    }

    public static final class n extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f19999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(O9.f fVar) {
            super(0);
            this.f19999a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19999a.getValue()).getViewModelStore();
        }
    }

    public static final class o extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20000a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20000a = interfaceC0635a;
            this.f20001b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20000a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20001b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class q extends Lambda implements InterfaceC0635a<T> {
        public q() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new a.m(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, FirebaseAnalytics.Param.CONTENT, "getContent()Landroid/view/ViewGroup;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f19968m = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "toolbarView", "getToolbarView()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "bottomSheet", "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        q qVar = new q();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new m(new l(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.class), new n(b9), qVar, new o(null, b9));
        this.idDocSetType = DocumentType.f15255l;
        this.content = a0.a(this, R$id.sns_content);
        this.toolbarView = a0.a(this, R$id.sns_toolbar);
        this.bottomSheet = a0.a(this, R$id.sns_eid_bottom_sheet);
        this.nfcBroadcastReceiver = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i(this);
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i.b
    public void d() {
        AlertDialog alertDialog = this.nfcStateAlertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(getViewModel(), (a.n) null, 1, (Object) null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(getViewModel(), (a.n) null, 1, (Object) null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(getViewModel(), (a.n) null, 1, (Object) null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_eid;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(getViewModel(), (a.n) null, 1, (Object) null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.b(getViewModel(), null, 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof a.o) {
            Bundle bundle = new Bundle();
            bundle.putString("result_token", ((a.o) event).b());
            p pVar = p.f3034a;
            com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (event instanceof a.f) {
            a.f fVar = (a.f) event;
            a(fVar.f(), fVar.e(), fVar.d());
            return;
        }
        if (event instanceof a.e) {
            a(((a.e) event).b());
            return;
        }
        if (event instanceof a.c) {
            k();
            return;
        }
        if (event instanceof a.g) {
            a(((a.g) event).b());
            return;
        }
        if (event instanceof a.h) {
            p();
            return;
        }
        if (event instanceof a.l) {
            a((a.l) event);
            return;
        }
        if (event instanceof a.j) {
            a((a.j) event);
            return;
        }
        if (!(event instanceof a.b)) {
            if (event instanceof a.k) {
                a((a.k) event);
                return;
            } else {
                super.handleEvent(event);
                return;
            }
        }
        if (this.authadaInteractor == null) {
            this.authadaInteractor = new com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.d(requireActivity());
        }
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.d dVar = this.authadaInteractor;
        if (dVar != null) {
            dVar.a(((a.b) event).b());
        }
    }

    public final void k() {
        com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.screen.preview.ekyc.eid.b.INSTANCE.a(a.e.f18413a).forResult("request_key_pin"), null, 2, null);
    }

    public final SNSCommonBottomSheetView l() {
        return (SNSCommonBottomSheetView) this.bottomSheet.a(this, f19968m[2]);
    }

    public final ViewGroup m() {
        return (ViewGroup) this.content.a(this, f19968m[0]);
    }

    public final SNSToolbarView n() {
        return (SNSToolbarView) this.toolbarView.a(this, f19968m[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getViewModel().E();
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.d dVar = this.authadaInteractor;
        if (dVar != null) {
            dVar.a();
        }
        this.authadaInteractor = null;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.currentState = null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(com.sumsub.sns.internal.core.common.q finishReason) {
        SNSCommonBottomSheetView l10 = l();
        if (l10 == null || l10.isHidden()) {
            if (this.forcedFinish || getViewModel().a(finishReason)) {
                return super.onFinishCalled(finishReason);
            }
            return false;
        }
        SNSCommonBottomSheetView l11 = l();
        if (l11 != null) {
            l11.hide();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Context applicationContext = requireContext().getApplicationContext();
        if (applicationContext != null) {
            applicationContext.unregisterReceiver(this.nfcBroadcastReceiver);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    @SuppressLint({"WrongConstant"})
    public void onResume() {
        super.onResume();
        C0913a.registerReceiver(requireContext().getApplicationContext(), this.nfcBroadcastReceiver, com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i.f18221b.a(), 2);
        boolean a10 = INSTANCE.a(requireContext());
        if (a10) {
            d();
        } else {
            if (a10) {
                return;
            }
            b();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getSupportFragmentManager().g0("request_key_pin", this, new com.sumsub.sns.geo.presentation.d(this, 6));
    }

    public final void p() {
        com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.screen.preview.ekyc.eid.b.INSTANCE.a(a.d.f18412a).forResult("request_key_pin"), null, 2, null);
    }

    public static final void a(a aVar, String str, Bundle bundle) {
        if (!com.sumsub.sns.core.presentation.b.INSTANCE.b(bundle)) {
            if (aVar.currentState instanceof b.d) {
                return;
            }
            aVar.getViewModel().a(q.c.f15162b);
            return;
        }
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b bVar = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b) bundle.getParcelable("DOCUMENT_RESULT");
        if (bVar == null) {
            return;
        }
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a i9 = bVar.i();
        if (i9 instanceof a.c) {
            aVar.getViewModel().a(bVar.j(), ((a.c) bVar.i()).b());
            return;
        }
        if (i9 instanceof a.C0329a) {
            aVar.getViewModel().b(bVar.j(), bVar.f());
            return;
        }
        if ((i9 instanceof a.e) || (i9 instanceof a.b)) {
            aVar.getViewModel().a(bVar.h(), bVar.j(), bVar.f(), bVar.g());
        } else if (i9 instanceof a.d) {
            aVar.getViewModel().c(bVar.j());
        }
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.i.b
    public void b() {
        getViewModel().A();
    }

    public static final void b(a aVar, DialogInterface dialogInterface, int i9) {
        aVar.forcedFinish = true;
        com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b state, Bundle savedInstanceState) {
        ViewGroup m2;
        LayoutTransition layoutTransition;
        SNSToolbarView n10 = n();
        if (n10 != null) {
            n10.setOptionButtonVisible(false);
        }
        ViewGroup m9 = m();
        if (m9 != null) {
            com.sumsub.sns.internal.core.common.i.a(m9);
        }
        if (state instanceof b.a) {
            a((b.a) state);
        } else if (state instanceof b.e) {
            if ((this.currentState instanceof b.e) && (m2 = m()) != null && (layoutTransition = m2.getLayoutTransition()) != null) {
                layoutTransition.setDuration(0L);
            }
            a((b.e) state);
        } else if (state instanceof b.f) {
            a((b.f) state);
        } else if (state instanceof b.d) {
            a((b.d) state);
        } else if (state instanceof b.C0326b) {
            a((b.C0326b) state);
        } else {
            boolean z10 = state instanceof b.c;
        }
        a.C0301a c0301a = this.analyticsWrapper;
        Screen d10 = c0301a != null ? c0301a.d() : null;
        a.C0301a a10 = state.a();
        if (d10 != (a10 != null ? a10.d() : null)) {
            a.C0301a c0301a2 = this.analyticsWrapper;
            if (c0301a2 != null) {
                Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "SNSEidMainFragment", "Screen closed " + c0301a2.d() + ' ' + c0301a2.c(), null, 4, null);
                getAnalyticsDelegate().c(c0301a2.d(), getIdDocSetType(), c0301a2.c());
                a.C0301a a11 = state.a();
                if (a11 != null) {
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMainFragment", "Screen changed " + a11.d() + ' ' + a11.c(), null, 4, null);
                    getAnalyticsDelegate().d(a11.d(), getIdDocSetType(), a11.c());
                }
            }
            this.analyticsWrapper = state.a();
        }
        this.currentState = state;
    }

    @SuppressLint({"MissingInflatedId"})
    public final void a(b.C0326b state) {
        View a10 = a(state, R$layout.sns_eid_pin_selector);
        TextView textView = a10 != null ? (TextView) a10.findViewById(R$id.sns_title) : null;
        TextView textView2 = a10 != null ? (TextView) a10.findViewById(R$id.sns_subtitle) : null;
        Button button = a10 != null ? (Button) a10.findViewById(R$id.sns_button_option) : null;
        Button button2 = a10 != null ? (Button) a10.findViewById(R$id.sns_primary_button) : null;
        Button button3 = a10 != null ? (Button) a10.findViewById(R$id.sns_secondary_button) : null;
        ImageView imageView = a10 != null ? (ImageView) a10.findViewById(R$id.sns_image) : null;
        if (imageView != null) {
            imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSEidIcons.PIN.getImageName()));
        }
        if (textView != null) {
            textView.setText(state.o());
        }
        if (textView2 != null) {
            textView2.setText(state.n());
        }
        if (button3 != null) {
            button3.setVisibility(8);
        }
        if (button != null) {
            button.setText(state.m());
            com.sumsub.sns.internal.core.common.l.a(button, new d(state));
        }
        if (button2 != null) {
            button2.setText(state.k());
            com.sumsub.sns.internal.core.common.l.a(button2, new e(state));
        }
    }

    @SuppressLint({"MissingInflatedId"})
    public final void a(b.a state) {
        View a10 = a(state, R$layout.sns_eid_info);
        TextView textView = a10 != null ? (TextView) a10.findViewById(R$id.sns_title) : null;
        TextView textView2 = a10 != null ? (TextView) a10.findViewById(R$id.sns_subtitle) : null;
        Button button = a10 != null ? (Button) a10.findViewById(R$id.sns_continue) : null;
        ImageView imageView = a10 != null ? (ImageView) a10.findViewById(R$id.sns_image) : null;
        if (textView != null) {
            com.sumsub.sns.internal.core.common.i.a(textView, state.o());
        }
        if (textView2 != null) {
            com.sumsub.sns.internal.core.common.i.a(textView2, state.n());
        }
        if (button != null) {
            button.setText(state.k());
            com.sumsub.sns.internal.core.common.l.a(button, new b(state));
        }
        if (state.l() == null) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        } else {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.l().getImageName()));
            }
        }
    }

    @SuppressLint({"MissingInflatedId"})
    public final void a(b.f state) {
        View a10 = a(state, R$layout.sns_eid_status);
        TextView textView = a10 != null ? (TextView) a10.findViewById(R$id.sns_title) : null;
        TextView textView2 = a10 != null ? (TextView) a10.findViewById(R$id.sns_subtitle) : null;
        Button button = a10 != null ? (Button) a10.findViewById(R$id.sns_button) : null;
        ImageView imageView = a10 != null ? (ImageView) a10.findViewById(R$id.sns_status) : null;
        if (state.m()) {
            if (imageView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(imageView, SNSStepState.PROCESSING);
            }
        } else if (imageView != null) {
            SNSStepViewExtensionsKt.setSnsStepState(imageView, SNSStepState.REJECTED);
        }
        String l10 = state.l();
        if (l10 != null && imageView != null) {
            imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), l10));
        }
        if (textView != null) {
            com.sumsub.sns.internal.core.common.i.a(textView, state.o());
        }
        if (textView2 != null) {
            com.sumsub.sns.internal.core.common.i.a(textView2, state.n());
        }
        if (button != null) {
            com.sumsub.sns.internal.core.common.i.a(button, state.k());
            com.sumsub.sns.internal.core.common.l.a(button, new k(state));
        }
    }

    @SuppressLint({"MissingInflatedId"})
    public final void a(b.e state) {
        View a10 = a(state, R$layout.sns_eid_scanning);
        TextView textView = a10 != null ? (TextView) a10.findViewById(R$id.sns_title) : null;
        TextView textView2 = a10 != null ? (TextView) a10.findViewById(R$id.sns_subtitle) : null;
        TextView textView3 = a10 != null ? (TextView) a10.findViewById(R$id.sns_status) : null;
        ImageView imageView = a10 != null ? (ImageView) a10.findViewById(R$id.sns_image) : null;
        SNSDotsProgressView sNSDotsProgressView = a10 != null ? (SNSDotsProgressView) a10.findViewById(R$id.sns_reading_progress) : null;
        if (!kotlin.jvm.internal.f.b(state, this.currentState)) {
            View view = getView();
            Button button = view != null ? (Button) view.findViewById(R$id.sns_button) : null;
            if (button != null) {
                button.setText(state.k());
                com.sumsub.sns.internal.core.common.l.a(button, new j(state));
            }
        }
        if (textView != null) {
            com.sumsub.sns.internal.core.common.i.a(textView, state.o());
        }
        if (textView2 != null) {
            com.sumsub.sns.internal.core.common.i.a(textView2, state.n());
        }
        if (textView3 != null) {
            com.sumsub.sns.internal.core.common.i.a(textView3, state.m());
        }
        if (imageView != null) {
            imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSEidIcons.NFC_SCAN.getImageName()));
        }
        if (state.l() == null) {
            if (sNSDotsProgressView == null) {
                return;
            }
            sNSDotsProgressView.setVisibility(8);
        } else {
            if (sNSDotsProgressView != null) {
                sNSDotsProgressView.setProgress(state.l().intValue());
            }
            if (sNSDotsProgressView == null) {
                return;
            }
            sNSDotsProgressView.setVisibility(0);
        }
    }

    @SuppressLint({"MissingInflatedId"})
    public final void a(b.d state) {
        View a10 = a(state, R$layout.sns_eid_pin_selector);
        TextView textView = a10 != null ? (TextView) a10.findViewById(R$id.sns_title) : null;
        TextView textView2 = a10 != null ? (TextView) a10.findViewById(R$id.sns_subtitle) : null;
        Button button = a10 != null ? (Button) a10.findViewById(R$id.sns_button_option) : null;
        Button button2 = a10 != null ? (Button) a10.findViewById(R$id.sns_primary_button) : null;
        Button button3 = a10 != null ? (Button) a10.findViewById(R$id.sns_secondary_button) : null;
        ImageView imageView = a10 != null ? (ImageView) a10.findViewById(R$id.sns_image) : null;
        if (textView != null) {
            textView.setText(state.s());
        }
        if (textView2 != null) {
            CharSequence r8 = state.r();
            textView2.setText(r8 != null ? com.sumsub.sns.internal.core.common.i.a(r8, requireContext()) : null);
        }
        if (button != null) {
            button.setText(state.o());
            com.sumsub.sns.internal.core.common.l.a(button, new g(state));
        }
        if (button2 != null) {
            button2.setText(state.q());
            com.sumsub.sns.internal.core.common.l.a(button2, new h(state));
        }
        if (button3 != null) {
            button3.setText(state.m());
            com.sumsub.sns.internal.core.common.l.a(button3, new i(state));
        }
        if (imageView != null) {
            imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSEidIcons.ID_CARD.getImageName()));
        }
    }

    public final void a(boolean needCan) {
        com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.screen.preview.ekyc.eid.b.INSTANCE.a(new a.c(needCan)).forResult("request_key_pin"), null, 2, null);
    }

    public final void a(String oldPin, String newPin, String lastPinDigit) {
        com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.screen.preview.ekyc.eid.b.INSTANCE.a(new a.b(oldPin, newPin, lastPinDigit)).forResult("request_key_pin"), null, 2, null);
    }

    public final void a(String pin) {
        com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.screen.preview.ekyc.eid.b.INSTANCE.a(new a.C0329a(pin)).forResult("request_key_pin"), null, 2, null);
    }

    public final View a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b state, int layout) {
        if (kotlin.jvm.internal.f.b(this.currentState, state)) {
            return m();
        }
        ViewGroup m2 = m();
        if (m2 != null) {
            m2.removeAllViews();
        }
        LayoutInflater.from(requireContext()).inflate(layout, m());
        return m();
    }

    public final void a(a.k event) {
        AlertDialog alertDialog = this.nfcStateAlertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(event.h());
        builder.setMessage(event.f());
        builder.setCancelable(false);
        final int i9 = 0;
        builder.setPositiveButton(event.g(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.ekyc.eid.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f20022b;

            {
                this.f20022b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                switch (i9) {
                    case 0:
                        a.a(this.f20022b, dialogInterface, i10);
                        break;
                    default:
                        a.b(this.f20022b, dialogInterface, i10);
                        break;
                }
            }
        });
        final int i10 = 1;
        builder.setNegativeButton(event.e(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.ekyc.eid.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f20022b;

            {
                this.f20022b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i102) {
                switch (i10) {
                    case 0:
                        a.a(this.f20022b, dialogInterface, i102);
                        break;
                    default:
                        a.b(this.f20022b, dialogInterface, i102);
                        break;
                }
            }
        });
        AlertDialog create = builder.create();
        this.nfcStateAlertDialog = create;
        if (create != null) {
            create.show();
        }
    }

    public static final void a(a aVar, DialogInterface dialogInterface, int i9) {
        Context applicationContext;
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        intent.setFlags(268435456);
        ActivityC0533g activity = aVar.getActivity();
        if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
            return;
        }
        applicationContext.startActivity(intent);
    }

    public final void a(a.l event) {
        SNSCommonBottomSheetView l10 = l();
        View inflate = l10 != null ? l10.inflate(R$layout.sns_eid_pin_bottom_sheet) : null;
        Button button = inflate != null ? (Button) inflate.findViewById(R$id.sns_button) : null;
        TextView textView = inflate != null ? (TextView) inflate.findViewById(R$id.sns_title) : null;
        TextView textView2 = inflate != null ? (TextView) inflate.findViewById(R$id.sns_text) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 != null) {
            CharSequence d10 = event.d();
            textView2.setText(d10 != null ? com.sumsub.sns.internal.core.common.i.a(d10, requireContext()) : null);
        }
        if (button != null) {
            button.setText(event.c());
        }
        if (button != null) {
            com.sumsub.sns.internal.core.common.l.a(button, new f());
        }
        SNSCommonBottomSheetView l11 = l();
        if (l11 != null) {
            l11.show();
        }
        com.sumsub.sns.internal.core.analytics.c.b(getAnalyticsDelegate(), Screen.EidPinInfo, null, 2, null);
    }

    public final void a(a.j event) {
        SNSCommonBottomSheetView l10 = l();
        View inflate = l10 != null ? l10.inflate(R$layout.sns_eid_pin_bottom_sheet) : null;
        Button button = inflate != null ? (Button) inflate.findViewById(R$id.sns_button) : null;
        TextView textView = inflate != null ? (TextView) inflate.findViewById(R$id.sns_title) : null;
        TextView textView2 = inflate != null ? (TextView) inflate.findViewById(R$id.sns_text) : null;
        if (textView != null) {
            textView.setText(event.f());
        }
        if (textView2 != null) {
            textView2.setText(event.e());
        }
        if (button != null) {
            button.setText(event.d());
        }
        if (button != null) {
            com.sumsub.sns.internal.core.common.l.a(button, new c());
        }
        SNSCommonBottomSheetView l11 = l();
        if (l11 != null) {
            l11.show();
        }
        com.sumsub.sns.internal.core.analytics.c.b(getAnalyticsDelegate(), Screen.EidServiceInfo, null, 2, null);
    }
}

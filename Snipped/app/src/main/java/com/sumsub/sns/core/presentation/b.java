package com.sumsub.sns.core.presentation;

import O9.p;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$transition;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.presentation.base.a.l;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.l0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.o;
import ia.InterfaceC0840h;
import java.util.Map;
import k1.F;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import y0.H;
import y0.L;
import y0.t;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 «\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0002¬\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0007J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J-\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0004¢\u0006\u0004\b\"\u0010\u0007J!\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0007J#\u0010,\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0011H\u0004¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u0011H\u0004¢\u0006\u0004\b.\u0010-J1\u00105\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u000207H\u0014¢\u0006\u0004\b<\u0010:J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u000207H\u0014¢\u0006\u0004\b>\u0010:J\u0019\u0010?\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0015¢\u0006\u0004\b?\u0010\u0014J\u0017\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@H\u0015¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\bD\u0010EJ+\u0010D\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010F\u001a\u0004\u0018\u00018\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\bD\u0010GJ\u000f\u0010H\u001a\u000207H\u0004¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\rH\u0004¢\u0006\u0004\bJ\u0010\u000fJ#\u0010M\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00052\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bS\u0010RJ\u0017\u0010U\u001a\u0002072\u0006\u0010T\u001a\u00020/H\u0017¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u0010\u0007J#\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010[\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020)H%¢\u0006\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010g\u001a\u0004\bk\u0010iR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010iR&\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010g\u001a\u0004\bo\u0010iR\u001a\u0010p\u001a\u0002078\u0016X\u0096D¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bp\u0010IR\u001a\u0010r\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010\u000fR\u0016\u0010u\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u0016\u0010x\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\u0016\u0010y\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R$\u0010}\u001a\u0002072\u0006\u0010|\u001a\u0002078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b}\u0010q\u001a\u0004\b}\u0010IR\u0016\u0010~\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010qR\"\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u007f8DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\"\u0010\u008b\u0001\u001a\r\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0088\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u0092\u0001\u001a\u00028\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\r8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u000fR\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007f8TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0083\u0001R\u0015\u0010\u009a\u0001\u001a\u00030\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009c\u0001\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0088\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u008a\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010¢\u0001\u001a\u0005\u0018\u00010\u009d\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/core/presentation/base/a$l;", "S", "Lcom/sumsub/sns/core/presentation/base/a;", "VM", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LO9/p;", "g", "j", "i", "h", "", "getUniqueId", "()Ljava/lang/String;", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/sumsub/sns/core/presentation/base/a$k;", "state", "updateCommonUiState", "(Lcom/sumsub/sns/core/presentation/base/a$k;)V", "initCommonUI", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroyView", "", "result", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setResult", "(ILandroid/os/Bundle;)V", "finishWithResult", "Lcom/sumsub/sns/internal/core/common/q;", "reason", "", "payload", "", "delay", "finish", "(Lcom/sumsub/sns/internal/core/common/q;Ljava/lang/Object;Ljava/lang/Long;)V", "", "hidden", "onHiddenChanged", "(Z)V", "showProgress", "updateShowProgress", "hideLogo", "updatePoweredByVisibility", "onViewModelPrepared", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "handleState", "(Lcom/sumsub/sns/core/presentation/base/a$l;Landroid/os/Bundle;)V", "prevState", "(Lcom/sumsub/sns/core/presentation/base/a$l;Lcom/sumsub/sns/core/presentation/base/a$l;Landroid/os/Bundle;)V", "isForResult", "()Z", "getFragmentRequestKey", "fragment", "tag", "navigateTo", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lcom/sumsub/sns/internal/core/data/model/o;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onHandleError", "(Lcom/sumsub/sns/internal/core/data/model/o;)V", "onErrorCancelled", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "onCancelResult", "()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "onCloseButtonClick", "requestKey", "forResult", "(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/b;", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "", "openPayload", "Ljava/util/Map;", "getOpenPayload", "()Ljava/util/Map;", "appearPayload", "getAppearPayload", "cancelPayload", "getCancelPayload", "closePayload", "getClosePayload", "isTransparentStatusBar", "Z", "logTag", "Ljava/lang/String;", "getLogTag", "statusBarColor", "I", "navigationBarColor", "sysUiVisibility", "windowFlags", "lastViewState", "Lcom/sumsub/sns/core/presentation/base/a$l;", "<set-?>", "isPrepared", "isResultSet", "Landroid/widget/TextView;", "progressTextView$delegate", "Lcom/sumsub/sns/internal/core/common/z;", "getProgressTextView", "()Landroid/widget/TextView;", "progressTextView", "Lcom/sumsub/sns/core/presentation/util/a;", "uniqueIdHolder", "Lcom/sumsub/sns/core/presentation/util/a;", "Lcom/sumsub/sns/core/presentation/a;", "e", "()Lcom/sumsub/sns/core/presentation/a;", "baseActivitySafe", "Lcom/sumsub/sns/internal/core/common/l0;", "f", "()Lcom/sumsub/sns/internal/core/common/l0;", "navigation", "getViewModel", "()Lcom/sumsub/sns/core/presentation/base/a;", "viewModel", "getIdDocSetType", "idDocSetType", "getPoweredByText", "poweredByText", "Lcom/sumsub/sns/internal/core/analytics/c;", "getAnalyticsDelegate", "()Lcom/sumsub/sns/internal/core/analytics/c;", "analyticsDelegate", "getBaseActivity", "baseActivity", "Lcom/sumsub/sns/internal/core/a;", "getServiceLocator", "()Lcom/sumsub/sns/internal/core/a;", "serviceLocator", "getServiceLocatorSafe", "serviceLocatorSafe", "Lcom/sumsub/sns/internal/core/common/SNSSession;", "getSession", "()Lcom/sumsub/sns/internal/core/common/SNSSession;", "session", "Lcom/sumsub/sns/internal/core/common/k0;", "getAppListener", "()Lcom/sumsub/sns/internal/core/common/k0;", "appListener", "Companion", "a", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class b<S extends a.l, VM extends com.sumsub.sns.core.presentation.base.a<S>> extends Fragment {
    static final /* synthetic */ InterfaceC0840h<Object>[] $$delegatedProperties;
    private static final String ARG_NAV_BAR_COLOR = "nav_bar_color";
    private static final String ARG_STATUS_BAR_COLOR = "status_bar_color";
    private static final String ARG_UI_VISIBILITY = "system_ui_visibility";
    private static final String ARG_WINDOW_FLAGS = "window_flags";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final String FRAGMENT_REQUEST_KEY = "fragment_request_key";
    public static final String FRAGMENT_RESULT_KEY = "fragment_result_key";
    private boolean isPrepared;
    private boolean isResultSet;
    private final boolean isTransparentStatusBar;
    private S lastViewState;
    private int navigationBarColor;
    private int statusBarColor;
    private int sysUiVisibility;
    private int windowFlags;
    private final Screen screen = com.sumsub.sns.core.presentation.c.f14171a.a(this);
    private final Map<String, Object> openPayload = kotlin.collections.a.p();
    private final Map<String, Object> appearPayload = kotlin.collections.a.p();
    private final Map<String, Object> cancelPayload = kotlin.collections.a.p();
    private final Map<String, Object> closePayload = kotlin.collections.a.p();
    private final String logTag = com.sumsub.sns.internal.log.c.a(this);

    /* renamed from: progressTextView$delegate, reason: from kotlin metadata */
    private final z progressTextView = a0.a(this, R$id.sns_progress_text);
    private final com.sumsub.sns.core.presentation.util.a uniqueIdHolder = new com.sumsub.sns.core.presentation.util.a();

    /* renamed from: com.sumsub.sns.core.presentation.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(Bundle bundle) {
            return bundle.getInt(b.FRAGMENT_RESULT_KEY);
        }

        public final boolean b(Bundle bundle) {
            return bundle.getInt(b.FRAGMENT_RESULT_KEY) == -1;
        }

        public Companion() {
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.BaseFragment$navigateTo$1", f = "BaseFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.core.presentation.b$b, reason: collision with other inner class name */
    public static final class C0154b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14030a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<S, VM> f14031b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f14032c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f14033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0154b(b<S, VM> bVar, Fragment fragment, String str, T9.a<? super C0154b> aVar) {
            super(2, aVar);
            this.f14031b = bVar;
            this.f14032c = fragment;
            this.f14033d = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((C0154b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new C0154b(this.f14031b, this.f14032c, this.f14033d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            if (!this.f14031b.isAdded()) {
                return p.f3034a;
            }
            l0 f10 = this.f14031b.f();
            if (f10 != null) {
                f10.a(this.f14032c, this.f14033d);
            }
            return p.f3034a;
        }
    }

    public /* synthetic */ class c extends AdaptedFunctionReference implements InterfaceC0650p<a.j, T9.a<? super p>, Object> {
        public c(Object obj) {
            super(2, obj, b.class, "handleEvent", "handleEvent(Lcom/sumsub/sns/core/presentation/base/SNSViewModel$SNSViewModelEvent;)V", 4);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.j jVar, T9.a<? super p> aVar) {
            return b.a((b) this.receiver, jVar, aVar);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.BaseFragment$onViewCreated$2", f = "BaseFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<a.k, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14034a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14035b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<S, VM> f14036c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f14037d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<S, VM> bVar, Bundle bundle, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f14036c = bVar;
            this.f14037d = bundle;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.k kVar, T9.a<? super p> aVar) {
            return ((d) create(kVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            d dVar = new d(this.f14036c, this.f14037d, aVar);
            dVar.f14035b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14034a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            a.k kVar = (a.k) this.f14035b;
            this.f14036c.updateCommonUiState(kVar);
            if (this.f14036c.getIsPrepared() != kVar.j()) {
                ((b) this.f14036c).isPrepared = kVar.j();
                this.f14036c.onViewModelPrepared(this.f14037d);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.BaseFragment$onViewModelPrepared$1", f = "BaseFragment.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<S, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14038a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14039b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<S, VM> f14040c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f14041d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b<S, VM> bVar, Bundle bundle, T9.a<? super e> aVar) {
            super(2, aVar);
            this.f14040c = bVar;
            this.f14041d = bundle;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S s10, T9.a<? super p> aVar) {
            return ((e) create(s10, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = new e(this.f14040c, this.f14041d, aVar);
            eVar.f14039b = obj;
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14038a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            a.l lVar = (a.l) this.f14039b;
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this.f14040c), "Lifecycle New state: " + lVar, null, 4, null);
            b<S, VM> bVar = this.f14040c;
            bVar.handleState(lVar, ((b) bVar).lastViewState, this.f14041d);
            ((b) this.f14040c).lastViewState = lVar;
            return p.f3034a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, "progressTextView", "getProgressTextView()Landroid/widget/TextView;", 0);
        h.f23186a.getClass();
        $$delegatedProperties = new InterfaceC0840h[]{propertyReference1Impl};
        INSTANCE = new Companion(null);
    }

    public static final /* synthetic */ Object a(b bVar, a.j jVar, T9.a aVar) {
        bVar.handleEvent(jVar);
        return p.f3034a;
    }

    public static /* synthetic */ void finish$default(b bVar, q qVar, Object obj, Long l10, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i & 1) != 0) {
            qVar = q.c.f15162b;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            l10 = null;
        }
        bVar.finish(qVar, obj, l10);
    }

    public static /* synthetic */ void finishWithResult$default(b bVar, int i, Bundle bundle, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithResult");
        }
        if ((i9 & 1) != 0) {
            i = -1;
        }
        if ((i9 & 2) != 0) {
            bundle = new Bundle();
        }
        bVar.finishWithResult(i, bundle);
    }

    public static /* synthetic */ void navigateTo$default(b bVar, Fragment fragment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        bVar.navigateTo(fragment, str);
    }

    public static /* synthetic */ void setResult$default(b bVar, int i, Bundle bundle, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResult");
        }
        if ((i9 & 1) != 0) {
            i = -1;
        }
        if ((i9 & 2) != 0) {
            bundle = new Bundle();
        }
        bVar.setResult(i, bundle);
    }

    public final a<?, ?> e() {
        ActivityC0533g activity = getActivity();
        if (activity instanceof a) {
            return (a) activity;
        }
        return null;
    }

    public final l0 f() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof l0) {
            return (l0) activity;
        }
        return null;
    }

    public void finish(q reason, Object payload, Long delay) {
        if (onFinishCalled(reason)) {
            i();
            l0 f10 = f();
            if (f10 != null) {
                f10.a(reason, delay);
            }
        }
    }

    public final void finishWithResult(int result, Bundle data) {
        setResult(result, data);
        finish$default(this, null, null, null, 7, null);
    }

    public final b<S, VM> forResult(String requestKey) {
        Bundle arguments;
        if (requestKey != null && (arguments = getArguments()) != null) {
            arguments.putString(FRAGMENT_REQUEST_KEY, requestKey);
        }
        return this;
    }

    public final void g() {
        Window window = requireActivity().getWindow();
        H.a(window, false);
        t tVar = new t(requireView());
        int i = Build.VERSION.SDK_INT;
        L.g fVar = i >= 35 ? new L.f(window, tVar) : i >= 30 ? new L.d(window, tVar) : new L.c(window, tVar);
        fVar.a(7);
        fVar.e();
    }

    public final com.sumsub.sns.internal.core.analytics.c getAnalyticsDelegate() {
        return new com.sumsub.sns.internal.core.analytics.c(getScreen(), getIdDocSetType(), getOpenPayload(), getAppearPayload(), getClosePayload(), getCancelPayload());
    }

    public final k0 getAppListener() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof k0) {
            return (k0) activity;
        }
        return null;
    }

    public Map<String, Object> getAppearPayload() {
        return this.appearPayload;
    }

    public final a<?, ?> getBaseActivity() {
        return (a) getActivity();
    }

    public Map<String, Object> getCancelPayload() {
        return this.cancelPayload;
    }

    public Map<String, Object> getClosePayload() {
        return this.closePayload;
    }

    public final String getFragmentRequestKey() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString(FRAGMENT_REQUEST_KEY)) == null) ? FRAGMENT_REQUEST_KEY : string;
    }

    public abstract String getIdDocSetType();

    public abstract int getLayoutId();

    public String getLogTag() {
        return this.logTag;
    }

    public Map<String, Object> getOpenPayload() {
        return this.openPayload;
    }

    public TextView getPoweredByText() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.sns_powered);
        }
        return null;
    }

    public final TextView getProgressTextView() {
        return (TextView) this.progressTextView.a(this, $$delegatedProperties[0]);
    }

    public Screen getScreen() {
        return this.screen;
    }

    public final com.sumsub.sns.internal.core.a getServiceLocator() {
        return getBaseActivity().f();
    }

    public final com.sumsub.sns.internal.core.a getServiceLocatorSafe() {
        a<?, ?> e10 = e();
        if (e10 != null) {
            return e10.f();
        }
        return null;
    }

    public final SNSSession getSession() {
        return getServiceLocator().E();
    }

    public final String getUniqueId() {
        return this.uniqueIdHolder.a();
    }

    public abstract VM getViewModel();

    public final void h() {
        View view = getView();
        SNSToolbarView sNSToolbarView = view != null ? (SNSToolbarView) view.findViewById(R$id.sns_toolbar) : null;
        if (sNSToolbarView != null) {
            sNSToolbarView.setOnCloseButtonClickListener(new J7.b(this, 11));
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setCloseButtonDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.CLOSE.getImageName()));
        }
    }

    public void handleEvent(a.j event) {
        if (event instanceof a.f) {
            i.a((Activity) requireActivity());
            return;
        }
        if (event instanceof a.g) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
        if (event instanceof a.d) {
            a.d dVar = (a.d) event;
            getBaseActivity().a(dVar.e(), dVar.f(), dVar.d());
            return;
        }
        if (event instanceof a.h) {
            k0 appListener = getAppListener();
            if (appListener != null) {
                appListener.a(((a.h) event).b());
                return;
            }
            return;
        }
        if (event instanceof a.p) {
            l0 f10 = f();
            if (f10 != null) {
                f10.a(com.sumsub.sns.core.presentation.support.a.INSTANCE.a(), "SNSSupportFragment");
                return;
            }
            return;
        }
        if (event instanceof a.m) {
            k0 appListener2 = getAppListener();
            if (appListener2 != null) {
                appListener2.a(((a.m) event).b());
                return;
            }
            return;
        }
        if (event instanceof a.e) {
            a.e eVar = (a.e) event;
            finish(eVar.f(), eVar.e(), eVar.d());
        } else if (event instanceof a.o) {
            updateShowProgress(((a.o) event).b());
        } else if (event instanceof a.q) {
            Toast.makeText(getActivity(), ((a.q) event).b(), 0).show();
        }
    }

    public void handleState(S state, Bundle savedInstanceState) {
    }

    public final void i() {
        if (this.isResultSet || !isForResult()) {
            return;
        }
        String fragmentRequestKey = getFragmentRequestKey();
        Bundle bundle = new Bundle();
        bundle.putInt(FRAGMENT_RESULT_KEY, 0);
        p pVar = p.f3034a;
        getParentFragmentManager().f0(fragmentRequestKey, bundle);
    }

    public final void initCommonUI() {
        TextView textView;
        TextView textView2;
        View view = getView();
        if (view == null) {
            return;
        }
        h();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 != null) {
            String c2 = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT);
            if (c2 != null && (textView2 = (TextView) view.findViewById(R$id.sns_title)) != null) {
                aVar.a(textView2, c2);
            }
            String c10 = aVar.c(a10, SNSMetricElement.SECTION_HEADER_ALIGNMENT);
            if (c10 != null && (textView = (TextView) view.findViewById(R$id.sns_subtitle)) != null) {
                aVar.a(textView, c10);
            }
            Float a11 = aVar.a(a10, SNSMetricElement.SCREEN_HORIZONTAL_MARGIN);
            if (a11 != null) {
                float floatValue = a11.floatValue();
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R$id.sns_fragment_content);
                if (viewGroup != null) {
                    int i = (int) floatValue;
                    viewGroup.setPadding(i, viewGroup.getPaddingTop(), i, viewGroup.getPaddingBottom());
                }
                Guideline guideline = (Guideline) view.findViewById(R$id.sns_guideline_start);
                if (guideline != null) {
                    guideline.setGuidelineBegin((int) floatValue);
                }
                Guideline guideline2 = (Guideline) view.findViewById(R$id.sns_guideline_end);
                if (guideline2 != null) {
                    guideline2.setGuidelineEnd((int) floatValue);
                }
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
            TextView poweredByText = getPoweredByText();
            Integer a12 = aVar.a(a10, sNSColorElement, poweredByText != null ? aVar.a(poweredByText) : false);
            if (a12 != null) {
                int intValue = a12.intValue();
                TextView poweredByText2 = getPoweredByText();
                if (poweredByText2 != null) {
                    poweredByText2.setTextColor(intValue);
                }
            }
        }
    }

    public final boolean isForResult() {
        Bundle arguments = getArguments();
        return (arguments != null ? arguments.getString(FRAGMENT_REQUEST_KEY) : null) != null;
    }

    /* renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    /* renamed from: isTransparentStatusBar, reason: from getter */
    public boolean getIsTransparentStatusBar() {
        return this.isTransparentStatusBar;
    }

    public final void j() {
        Window window = requireActivity().getWindow();
        H.a(window, true);
        t tVar = new t(requireView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new L.f(window, tVar) : i >= 30 ? new L.d(window, tVar) : new L.c(window, tVar)).f(7);
    }

    public final void navigateTo(Fragment fragment, String tag) {
        C0552s.a(this).e(new C0154b(this, fragment, tag, null));
    }

    public SNSCompletionResult onCancelResult() {
        return new SNSCompletionResult.SuccessTermination(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Window window;
        this.uniqueIdHolder.a(savedInstanceState);
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, getLogTag(), "Lifecycle " + this + ".onCreate", null, 4, null);
        }
        if (savedInstanceState != null) {
            this.statusBarColor = savedInstanceState.getInt(ARG_STATUS_BAR_COLOR);
            this.navigationBarColor = savedInstanceState.getInt(ARG_NAV_BAR_COLOR);
            this.sysUiVisibility = savedInstanceState.getInt(ARG_UI_VISIBILITY);
            this.windowFlags = savedInstanceState.getInt(ARG_WINDOW_FLAGS);
        } else {
            ActivityC0533g activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                this.statusBarColor = window.getStatusBarColor();
                this.navigationBarColor = window.getNavigationBarColor();
                this.sysUiVisibility = window.getDecorView().getSystemUiVisibility();
                this.windowFlags = window.getAttributes().flags;
            }
        }
        super.onCreate(savedInstanceState);
        F f10 = new F(requireContext());
        setEnterTransition(f10.c(R$transition.fade));
        setExitTransition(f10.c(R$transition.fade_delayed));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getAnalyticsDelegate().d();
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, getLogTag(), "closing " + getScreen().getText(), null, 4, null);
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Lifecycle " + this + ".onDestroyView", null, 4, null);
        }
        super.onDestroyView();
    }

    public final void onErrorCancelled(o error) {
        getViewModel().a(error);
    }

    public boolean onFinishCalled(q finishReason) {
        i();
        return true;
    }

    public final void onHandleError(o error) {
        getViewModel().b(error);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Lifecycle " + this + ".onHiddenChanged, hidden=" + hidden, null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, getLogTag(), "Lifecycle " + this + ".onResume", null, 4, null);
        }
        getAnalyticsDelegate().c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.uniqueIdHolder.b(outState);
        outState.putInt(ARG_STATUS_BAR_COLOR, this.statusBarColor);
        outState.putInt(ARG_NAV_BAR_COLOR, this.navigationBarColor);
        outState.putInt(ARG_UI_VISIBILITY, this.sysUiVisibility);
        outState.putInt(ARG_WINDOW_FLAGS, this.windowFlags);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, getLogTag(), "Lifecycle " + this + ".onStart", null, 4, null);
        }
        ActivityC0533g activity = getActivity();
        if (activity == null || activity.getWindow() == null || !getIsTransparentStatusBar()) {
            return;
        }
        g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, getLogTag(), "Lifecycle " + this + ".onStop", null, 4, null);
        }
        ActivityC0533g activity = getActivity();
        if (activity == null || activity.getWindow() == null || !getIsTransparentStatusBar()) {
            return;
        }
        j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Lifecycle " + this + ".onViewCreated", null, 4, null);
        }
        getAnalyticsDelegate().e();
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, getLogTag(), "opening " + getScreen().getText(), null, 4, null);
        b0.a(getViewModel().g(), getViewLifecycleOwner(), new c(this));
        b0.b(getViewModel().i(), getViewLifecycleOwner(), new d(this, savedInstanceState, null));
        initCommonUI();
    }

    public void onViewModelPrepared(Bundle savedInstanceState) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Lifecycle " + this + " onViewModelPrepared", null, 4, null);
        b0.b(FlowKt.filterNotNull(getViewModel().j()), this, new e(this, savedInstanceState, null));
    }

    public final void setResult(int result, Bundle data) {
        if (isForResult()) {
            this.isResultSet = true;
            String fragmentRequestKey = getFragmentRequestKey();
            data.putInt(FRAGMENT_RESULT_KEY, result);
            p pVar = p.f3034a;
            getParentFragmentManager().f0(fragmentRequestKey, data);
        }
    }

    public final void updateCommonUiState(a.k state) {
        updatePoweredByVisibility(state.g());
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            i.a(poweredByText, state.h());
        }
        TextView progressTextView = getProgressTextView();
        if (progressTextView != null) {
            i.a(progressTextView, state.i());
        }
    }

    public void updatePoweredByVisibility(boolean hideLogo) {
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            i.a(poweredByText, hideLogo);
        }
    }

    public void updateShowProgress(boolean showProgress) {
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.a(showProgress);
        }
    }

    public static final void a(b bVar, View view) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(bVar), "close click", null, 4, null);
        bVar.onCloseButtonClick();
        bVar.getAnalyticsDelegate().a(false);
        ActivityC0533g activity = bVar.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public void handleState(S state, S prevState, Bundle savedInstanceState) {
        handleState(state, savedInstanceState);
    }

    public void onCloseButtonClick() {
    }
}

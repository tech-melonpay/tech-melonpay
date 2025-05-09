package com.sumsub.sns.camera;

import C.v;
import O9.p;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.ActivityC0533g;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.camera.c;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.t0;
import com.sumsub.sns.internal.core.data.model.l;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import com.sumsub.sns.internal.core.presentation.helper.camera.b;
import e.AbstractC0704c;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.tls.CipherSuite;
import y0.s;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u009e\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001\u000fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0014J9\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0007J#\u0010\u001d\u001a\u00020\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u000f\u0010!J\u0019\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b*\u0010%J!\u0010\u000f\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b\u000f\u0010,J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0004H$¢\u0006\u0004\b\u000f\u0010-J\u0017\u0010/\u001a\u00020\b2\u0006\u0010 \u001a\u00020.H\u0015¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0004¢\u0006\u0004\b1\u0010\u0007J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b6\u00105J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u00103\u001a\u000207H\u0014¢\u0006\u0004\b\u000f\u00108J\u000f\u00109\u001a\u00020\bH\u0014¢\u0006\u0004\b9\u0010\u0007J#\u00106\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0094@ø\u0001\u0000¢\u0006\u0004\b6\u0010>J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\b\u000f\u0010AJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010\u0007J\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\u0007J\u000f\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010\u0007J#\u0010K\u001a\u0004\u0018\u00010\u000e2\u0006\u0010I\u001a\u00020?2\b\u0010 \u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bK\u0010LJ3\u0010\u000f\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010NH\u0004¢\u0006\u0004\b\u000f\u0010PR*\u0010V\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010T\"\u0004\b\u000f\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010XR\u0016\u0010\\\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010h\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0e\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010n\u001a\u00020i8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010pR\u0014\u0010t\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010pR\u0014\u0010w\u001a\u00020?8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR \u0010|\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010yR \u0010~\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010yR!\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010yR\"\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010yR\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010&8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u0004\u0018\u00010&8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0019\u0010\u0089\u0001\u001a\u0004\u0018\u00010&8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001a\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u0004\u0018\u00010&8$X¤\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0084\u0001R\u001a\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0090\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0090\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001R\u0019\u0010\u0099\u0001\u001a\u0004\u0018\u00010&8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0084\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009f\u0001"}, d2 = {"Lcom/sumsub/sns/camera/a;", "Lcom/sumsub/sns/internal/camera/c;", "VM", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/camera/c$b;", "Lcom/sumsub/sns/internal/core/common/t0;", "<init>", "()V", "LO9/p;", "D", "Lcom/sumsub/sns/internal/core/presentation/intro/f;", "stepInfo", "", "countryCode", "", "a", "(Lcom/sumsub/sns/internal/core/presentation/intro/f;Ljava/lang/String;)Z", "", "", "instructionsData", "(Lcom/sumsub/sns/internal/core/presentation/intro/f;Ljava/util/Map;Ljava/lang/String;)V", "", MessageBundle.TITLE_ENTRY, "brief", ErrorBundle.DETAIL_ENTRY, "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/core/presentation/intro/f;Ljava/lang/String;)V", "k", "G", "grantResults", "handlePermissionResults", "(Ljava/util/Map;)V", "Lcom/sumsub/sns/core/presentation/base/a$n;", "event", "(Lcom/sumsub/sns/core/presentation/base/a$n;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", "state", "(Lcom/sumsub/sns/internal/camera/c$b;Landroid/os/Bundle;)V", "(Lcom/sumsub/sns/internal/camera/c$b;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "H", "Ljava/io/File;", "file", "d", "(Ljava/io/File;)V", "b", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX$c;", "(Lcom/sumsub/sns/internal/core/domain/camera/CameraX$c;)V", "F", "Landroidx/camera/core/ImageProxy;", "image", "Lcom/sumsub/sns/internal/core/domain/camera/c;", "exposure", "(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/domain/camera/c;LT9/a;)Ljava/lang/Object;", "", "peekHeight", "(I)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "onStart", "onStop", "onDestroyView", "keyCode", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;", "appear", "Lkotlin/Function0;", "onEnd", "(ZLandroid/view/View;Lca/a;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "t", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "helperViewBehavior", "Landroidx/appcompat/app/b;", "Landroidx/appcompat/app/b;", "lackOfPermissionDialog", "c", "Z", "waitingForReturnFromSettings", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "cameraX", "Lcom/sumsub/sns/internal/core/presentation/helper/camera/b;", "e", "Lcom/sumsub/sns/internal/core/presentation/helper/camera/b;", "helperState", "Le/c;", "", "f", "Le/c;", "permissionLauncher", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "g", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "l", "()Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "cameraMode", "isTransparentStatusBar", "()Z", "y", "shouldShowFlash", "E", "isFrontFacingCamera", "n", "()I", "fadeAnimationDuration", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "u", "permissionsPayload", "B", "()Landroid/view/View;", "takePictureViewContainer", "z", "takePictureProgressView", "A", "takePictureView", "Lcom/sumsub/sns/core/widget/SNSToolbarView;", "C", "()Lcom/sumsub/sns/core/widget/SNSToolbarView;", "toolbar", "s", "helperView", "Landroid/widget/TextView;", "r", "()Landroid/widget/TextView;", "helperTitle", "o", "helperBrief", "p", "helperDetails", "m", "darkOverlay", "Landroidx/camera/view/PreviewView;", "v", "()Landroidx/camera/view/PreviewView;", "previewView", "h", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class a<VM extends com.sumsub.sns.internal.camera.c> extends com.sumsub.sns.core.presentation.b<c.b, VM> implements t0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public BottomSheetBehavior<View> helperViewBehavior;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b lackOfPermissionDialog;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean waitingForReturnFromSettings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public CameraX cameraX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.sumsub.sns.internal.core.presentation.helper.camera.b helperState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public AbstractC0704c<String[]> permissionLauncher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final CameraX.Mode cameraMode = CameraX.Mode.PHOTO;

    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13836a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f13837b;

        public b(View view, a aVar) {
            this.f13836a = view;
            this.f13837b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams;
            View s10 = this.f13837b.s();
            if (s10 != null) {
                dimensionPixelSize = s10.getHeight();
                int dimensionPixelSize2 = this.f13837b.getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height);
                if (dimensionPixelSize > dimensionPixelSize2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
            } else {
                dimensionPixelSize = this.f13837b.getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height);
            }
            View view = this.f13837b.getView();
            int height = view != null ? view.getHeight() : 0;
            View B10 = this.f13837b.B();
            int bottom = height - (B10 != null ? B10.getBottom() : 0);
            Integer valueOf = Integer.valueOf(bottom);
            ViewGroup.LayoutParams layoutParams2 = null;
            if (bottom <= 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
            int min = Math.min(dimensionPixelSize, intValue);
            BottomSheetBehavior<View> t3 = this.f13837b.t();
            int peekHeight = t3 != null ? t3.getPeekHeight() : 0;
            BottomSheetBehavior<View> t10 = this.f13837b.t();
            if (t10 != null) {
                t10.setPeekHeight(min, true);
            }
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", v.k(min, intValue, "adjustPickHeight: viewHeight=", " spaceUnderTakePictureButton="), null, 4, null);
            if (peekHeight != min) {
                this.f13837b.a(min);
            }
            View B11 = this.f13837b.B();
            if (B11 == null) {
                return;
            }
            View B12 = this.f13837b.B();
            if (B12 != null && (layoutParams = B12.getLayoutParams()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    BottomSheetBehavior<View> t11 = this.f13837b.t();
                    marginLayoutParams.bottomMargin = this.f13837b.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium) + (t11 != null ? t11.getPeekHeight() : 0);
                }
                layoutParams2 = layoutParams;
            }
            B11.setLayoutParams(layoutParams2);
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<VM> aVar) {
            super(0);
            this.f13839a = aVar;
        }

        public final void a() {
            View B10 = this.f13839a.B();
            if (B10 == null) {
                return;
            }
            B10.setVisibility(0);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class e extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13840a;

        public e(a<VM> aVar) {
            this.f13840a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View view, float f10) {
            View m2 = this.f13840a.m();
            if (m2 == null) {
                return;
            }
            m2.setAlpha(f10 * 0.7f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View view, int i) {
            if (i == 4) {
                View m2 = this.f13840a.m();
                if (m2 == null) {
                    return;
                }
                m2.setVisibility(8);
                return;
            }
            View m9 = this.f13840a.m();
            if (m9 == null) {
                return;
            }
            m9.setVisibility(0);
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13842a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<VM> aVar) {
            super(0);
            this.f13842a = aVar;
        }

        public final void a() {
            a.a((a) this.f13842a).x();
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class h implements com.sumsub.sns.internal.core.domain.camera.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13843a;

        @V9.d(c = "com.sumsub.sns.camera.SNSCameraFragment$onViewModelPrepared$1", f = "SNSCameraFragment.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "processFrame")
        /* renamed from: com.sumsub.sns.camera.a$h$a, reason: collision with other inner class name */
        public static final class C0146a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13844a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f13845b;

            /* renamed from: d, reason: collision with root package name */
            public int f13847d;

            public C0146a(T9.a<? super C0146a> aVar) {
                super(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13845b = obj;
                this.f13847d |= Integer.MIN_VALUE;
                return h.this.a(null, null, this);
            }
        }

        public h(a<VM> aVar) {
            this.f13843a = aVar;
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void a(CameraX.c cVar) {
            this.f13843a.a(cVar);
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void b(File file) {
            this.f13843a.b(file);
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void c() {
            this.f13843a.F();
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void a(File file) {
            a.a((a) this.f13843a).a(file);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // com.sumsub.sns.internal.core.domain.camera.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(androidx.camera.core.ImageProxy r5, com.sumsub.sns.internal.core.domain.camera.c r6, T9.a<? super O9.p> r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof com.sumsub.sns.camera.a.h.C0146a
                if (r0 == 0) goto L13
                r0 = r7
                com.sumsub.sns.camera.a$h$a r0 = (com.sumsub.sns.camera.a.h.C0146a) r0
                int r1 = r0.f13847d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13847d = r1
                goto L18
            L13:
                com.sumsub.sns.camera.a$h$a r0 = new com.sumsub.sns.camera.a$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f13845b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r2 = r0.f13847d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f13844a
                androidx.camera.core.ImageProxy r5 = (androidx.camera.core.ImageProxy) r5
                kotlin.b.b(r7)
                goto L43
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.b.b(r7)
                com.sumsub.sns.camera.a<VM extends com.sumsub.sns.internal.camera.c> r7 = r4.f13843a
                r0.f13844a = r5
                r0.f13847d = r3
                java.lang.Object r6 = r7.b(r5, r6, r0)
                if (r6 != r1) goto L43
                return r1
            L43:
                r5.close()
                O9.p r5 = O9.p.f3034a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.camera.a.h.a(androidx.camera.core.ImageProxy, com.sumsub.sns.internal.core.domain.camera.c, T9.a):java.lang.Object");
        }
    }

    public /* synthetic */ class i extends AdaptedFunctionReference implements InterfaceC0635a<p> {
        public i(Object obj) {
            super(0, obj, a.class, "finish", "finish(Lcom/sumsub/sns/internal/core/common/FinishReason;Ljava/lang/Object;Ljava/lang/Long;)V", 0);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }

        public final void a() {
            com.sumsub.sns.core.presentation.b.finish$default((a) this.receiver, null, null, null, 7, null);
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a<VM> aVar) {
            super(0);
            this.f13848a = aVar;
        }

        public final void a() {
            this.f13848a.waitingForReturnFromSettings = true;
            ActivityC0533g activity = this.f13848a.getActivity();
            if (activity != null) {
                com.sumsub.sns.internal.core.common.i.a((Activity) activity);
            }
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(a aVar, View view) {
        ((com.sumsub.sns.internal.camera.c) aVar.getViewModel()).y();
    }

    public abstract View A();

    public abstract View B();

    public abstract SNSToolbarView C();

    public final void D() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        View s10 = s();
        if (s10 != null) {
            bottomSheetBehavior = BottomSheetBehavior.from(s10);
            bottomSheetBehavior.setHideable(false);
            bottomSheetBehavior.setPeekHeight(s10.getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height));
        } else {
            bottomSheetBehavior = null;
        }
        this.helperViewBehavior = bottomSheetBehavior;
        View m2 = m();
        if (m2 != null) {
            m2.setOnClickListener(new com.sumsub.sns.camera.c(this, 2));
            m2.setAlpha(0.0f);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.helperViewBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.addBottomSheetCallback(new e(this));
        }
    }

    /* renamed from: E */
    public abstract boolean getIsFrontFacingCamera();

    public final void G() {
        AbstractC0704c<String[]> abstractC0704c;
        this.waitingForReturnFromSettings = false;
        if (C0913a.checkSelfPermission(requireContext(), "android.permission.CAMERA") != -1 || (abstractC0704c = this.permissionLauncher) == null) {
            return;
        }
        abstractC0704c.a(new String[]{"android.permission.CAMERA"});
    }

    public final void H() {
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.h();
        }
    }

    public void a(int peekHeight) {
    }

    public abstract void a(c.b state);

    public void b(File file) {
    }

    public final void d(File file) {
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.a(file);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return u();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return u();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return u();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return u();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof a.n) {
            a((a.n) event);
            return;
        }
        if (event instanceof c.a.C0174a) {
            CameraX cameraX = this.cameraX;
            if (cameraX != null) {
                cameraX.a(((c.a.C0174a) event).b());
                return;
            }
            return;
        }
        if (!(event instanceof a.e)) {
            super.handleEvent(event);
            return;
        }
        a.e eVar = (a.e) event;
        Object e10 = eVar.e();
        n nVar = e10 instanceof n ? (n) e10 : null;
        Object e11 = eVar.e();
        l lVar = e11 instanceof l ? (l) e11 : null;
        if (nVar != null && !nVar.r()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DOCUMENT_RESULT", nVar);
            p pVar = p.f3034a;
            com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (lVar == null) {
            com.sumsub.sns.core.presentation.b.finish$default(this, null, null, null, 7, null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DOCUMENT_RESULTS", lVar);
        p pVar2 = p.f3034a;
        com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle2, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handlePermissionResults(Map<String, Boolean> grantResults) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "CameraFragment", "handlePermissionResults: " + grantResults, null, 4, null);
        if (kotlin.jvm.internal.f.b(grantResults.get("android.permission.CAMERA"), Boolean.TRUE)) {
            return;
        }
        ((com.sumsub.sns.internal.camera.c) getViewModel()).w();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: isTransparentStatusBar */
    public boolean getIsTransparentStatusBar() {
        return com.sumsub.sns.internal.ff.a.f16930a.n().g();
    }

    public final void k() {
        View s10 = s();
        if (s10 != null) {
            s.a(s10, new b(s10, this));
        }
    }

    /* renamed from: l, reason: from getter */
    public CameraX.Mode getCameraMode() {
        return this.cameraMode;
    }

    public abstract View m();

    public final int n() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getInteger(R.integer.config_mediumAnimTime);
    }

    public abstract TextView o();

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new f.f(), new A0.b(this, 25));
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.helperViewBehavior = null;
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.g();
        }
        this.cameraX = null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        BottomSheetBehavior<View> bottomSheetBehavior = this.helperViewBehavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            return super.onFinishCalled(finishReason);
        }
        bottomSheetBehavior.setState(4);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.core.common.t0
    public Boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 24 && keyCode != 25) {
            return null;
        }
        ((com.sumsub.sns.internal.camera.c) getViewModel()).x();
        return Boolean.TRUE;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.waitingForReturnFromSettings) {
            G();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.b bVar = this.lackOfPermissionDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.lackOfPermissionDialog = null;
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        p pVar;
        Integer a10;
        super.onViewCreated(view, savedInstanceState);
        SNSToolbarView C10 = C();
        if (C10 != null) {
            C10.setOnCloseButtonClickListener(new com.sumsub.sns.camera.c(this, 0));
            C10.setOnOptionButtonClickListener(new com.sumsub.sns.camera.c(this, 1));
            C10.setOptionButtonDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName()));
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
            if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(C10))) == null) {
                pVar = null;
            } else {
                C10.setIconTintList(ColorStateList.valueOf(a10.intValue()));
                pVar = p.f3034a;
            }
            if (pVar == null) {
                C10.setIconTintList(ColorStateList.valueOf(C0913a.getColor(C10.getContext(), R$color.sns_camera_content)));
            }
        }
        View A10 = A();
        if (A10 != null) {
            com.sumsub.sns.internal.core.common.l.a(A10, new g(this));
            ImageView imageView = A10 instanceof ImageView ? (ImageView) A10 : null;
            if (imageView != null) {
                imageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.TAKE_PHOTO.getImageName()));
            }
        }
        D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, getLogTag(), "cameraX mode " + getCameraMode(), null, 4, null);
        CameraX cameraX = new CameraX(getCameraMode(), ((com.sumsub.sns.internal.camera.c) getViewModel()).t(), ((com.sumsub.sns.internal.camera.c) getViewModel()).v(), getIsFrontFacingCamera() ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA, new h(this));
        this.cameraX = cameraX;
        cameraX.a(getViewLifecycleOwner(), v());
        SNSToolbarView C10 = C();
        if (C10 != null) {
            C10.setOptionButtonVisible(getShouldShowFlash());
        }
        G();
    }

    public abstract TextView p();

    public abstract TextView r();

    public abstract View s();

    public final BottomSheetBehavior<View> t() {
        return this.helperViewBehavior;
    }

    public Map<String, Object> u() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.a.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(com.sumsub.sns.internal.core.common.j.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    public abstract PreviewView v();

    /* renamed from: y */
    public abstract boolean getShouldShowFlash();

    public abstract View z();

    public void a(CameraX.c file) {
    }

    public Object b(ImageProxy imageProxy, com.sumsub.sns.internal.core.domain.camera.c cVar, T9.a<? super p> aVar) {
        return a(this, imageProxy, cVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.sumsub.sns.internal.camera.c a(a aVar) {
        return (com.sumsub.sns.internal.camera.c) aVar.getViewModel();
    }

    public static final void b(a aVar, View view) {
        com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
    }

    public static final void a(a aVar, Map map) {
        aVar.handlePermissionResults(map);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(c.b state, Bundle savedInstanceState) {
        String imageName;
        boolean h9 = state.h();
        PreviewView v10 = v();
        if (v10 != null) {
            v10.setVisibility(state.j() ? 0 : 8);
        }
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.a(state.h());
        }
        SNSIconHandler iconHandler = e0.f15081a.getIconHandler();
        Context requireContext = requireContext();
        if (!h9) {
            imageName = SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName();
        } else {
            imageName = SNSIconHandler.SNSCommonIcons.TORCH_ON.getImageName();
        }
        Drawable onResolveIcon = iconHandler.onResolveIcon(requireContext, imageName);
        SNSToolbarView C10 = C();
        if (C10 != null) {
            C10.setOptionButtonDrawable(onResolveIcon);
        }
        View A10 = A();
        if (A10 != null) {
            A10.setEnabled(state.g());
        }
        View z10 = z();
        if (z10 != null) {
            z10.setVisibility(state.l() ? 0 : 8);
        }
        View B10 = B();
        if ((B10 == null || B10.getVisibility() != 0) && state.k()) {
            a(true, B(), (InterfaceC0635a<p>) new d(this));
        } else {
            View B11 = B();
            if (B11 != null) {
                B11.setVisibility(state.k() ? 0 : 8);
            }
        }
        com.sumsub.sns.internal.core.presentation.helper.camera.b i9 = state.i();
        if (!kotlin.jvm.internal.f.b(this.helperState, i9)) {
            if (i9 instanceof b.C0246b) {
                b.C0246b c0246b = (b.C0246b) i9;
                a(c0246b.f(), (Map<String, ? extends Object>) c0246b.e(), c0246b.d());
            } else if (i9 instanceof b.a) {
                b.a aVar = (b.a) i9;
                a(aVar.j(), aVar.f(), aVar.h(), aVar.i(), aVar.g());
            } else {
                boolean z11 = i9 instanceof b.c;
            }
            this.helperState = i9;
        }
        a(state);
    }

    public void F() {
    }

    public static final class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a<p> f13838a;

        public c(InterfaceC0635a<p> interfaceC0635a) {
            this.f13838a = interfaceC0635a;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0635a<p> interfaceC0635a = this.f13838a;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static final class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<VM> f13841a;

        public f(a<VM> aVar) {
            this.f13841a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View view, int i) {
            TextView p10 = this.f13841a.p();
            CharSequence text = p10 != null ? p10.getText() : null;
            if (text == null || text.length() == 0) {
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                com.sumsub.sns.internal.core.analytics.c.a(this.f13841a.getAnalyticsDelegate(), Screen.CameraScreen, null, 2, null);
                TextView o10 = this.f13841a.o();
                if (o10 != null) {
                    o10.setVisibility(0);
                }
                TextView p11 = this.f13841a.p();
                if (p11 == null) {
                    return;
                }
                p11.setVisibility(4);
                return;
            }
            com.sumsub.sns.internal.core.analytics.c.b(this.f13841a.getAnalyticsDelegate(), Screen.CameraScreen, null, 2, null);
            TextView o11 = this.f13841a.o();
            if (o11 != null) {
                o11.setVisibility(4);
            }
            TextView p12 = this.f13841a.p();
            if (p12 != null) {
                p12.setVisibility(0);
            }
            SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(SNSEvent.ShowMoreGuidance.INSTANCE);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View view, float f10) {
        }
    }

    public static /* synthetic */ Object a(a aVar, ImageProxy imageProxy, com.sumsub.sns.internal.core.domain.camera.c cVar, T9.a aVar2) {
        return p.f3034a;
    }

    public static final void a(a aVar, View view) {
        BottomSheetBehavior<View> bottomSheetBehavior = aVar.helperViewBehavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            return;
        }
        bottomSheetBehavior.setState(4);
    }

    public final boolean a(com.sumsub.sns.internal.core.presentation.intro.f stepInfo, String countryCode) {
        SNSInstructionsViewHandler instructionsViewHandler = e0.f15081a.getInstructionsViewHandler();
        View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), stepInfo.c(), stepInfo.a(), stepInfo.b(), SNSInstructionsViewHandler.Position.BOTTOMSHEET.getValue(), countryCode) : null;
        if (onVerificationStep == null) {
            return false;
        }
        View view = getView();
        View findViewById = view != null ? view.findViewById(R$id.sns_brief_details) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View view2 = getView();
        ViewGroup viewGroup = view2 != null ? (ViewGroup) view2.findViewById(R$id.sns_intro_content) : null;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (viewGroup == null) {
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        p pVar = p.f3034a;
        viewGroup.addView(onVerificationStep, marginLayoutParams);
        return true;
    }

    public final void a(com.sumsub.sns.internal.core.presentation.intro.f stepInfo, Map<String, ? extends Object> instructionsData, String countryCode) {
        View view = getView();
        View findViewById = view != null ? view.findViewById(R$id.sns_brief_details) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        if (!a(stepInfo, countryCode)) {
            int i9 = R$id.sns_intro_content;
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(i9);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            new com.sumsub.sns.core.presentation.intro.b(getServiceLocator().q(), false).a(view2, instructionsData, i9, -1);
        }
        k();
    }

    public final void a(CharSequence title, CharSequence brief, CharSequence details, com.sumsub.sns.internal.core.presentation.intro.f stepInfo, String countryCode) {
        if (s() == null) {
            return;
        }
        if (!a(stepInfo, countryCode)) {
            View view = getView();
            View findViewById = view != null ? view.findViewById(R$id.sns_brief_details) : null;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View view2 = getView();
            View findViewById2 = view2 != null ? view2.findViewById(R$id.sns_intro_content) : null;
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            TextView r8 = r();
            if (r8 != null) {
                r8.setText(title);
            }
            TextView o10 = o();
            if (o10 != null) {
                o10.setText(brief);
            }
            TextView p10 = p();
            if (p10 != null) {
                p10.setText(details);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.helperViewBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(false);
                bottomSheetBehavior.addBottomSheetCallback(new f(this));
            }
        }
        k();
    }

    public final void a(a.n event) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "CameraFragment", "showLackOfCameraPermissionsDialog:", null, 4, null);
        androidx.appcompat.app.b a10 = com.sumsub.sns.internal.core.android.c.f15027a.a(requireActivity(), event.f(), event.h(), event.g(), new i(this), new j(this));
        this.lackOfPermissionDialog = a10;
        if (a10 != null) {
            a10.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(a aVar, boolean z10, View view, InterfaceC0635a interfaceC0635a, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateAlpha");
        }
        if ((i9 & 4) != 0) {
            interfaceC0635a = null;
        }
        aVar.a(z10, view, (InterfaceC0635a<p>) interfaceC0635a);
    }

    public final void a(boolean appear, View view, InterfaceC0635a<p> onEnd) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        if (!appear) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(n());
        alphaAnimation.setAnimationListener(new c(onEnd));
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }
}

package com.sumsub.sns.camera.video.presentation;

import O9.p;
import R0.a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.CameraSelector;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.j;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import e.AbstractC0704c;
import ia.InterfaceC0840h;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u000b\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u000b\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0011\u0010!J!\u0010&\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0006J!\u0010\u000b\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b\u000b\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0006R\u001b\u00106\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u001d\u0010A\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010F\u001a\u0004\u0018\u00010B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010JR\u001d\u0010O\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010NR\u001d\u0010R\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010NR\u001d\u0010U\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010>\u001a\u0004\bT\u0010JR\u001d\u0010X\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010JR\u001d\u0010[\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010JR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010cR$\u0010g\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0018\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010fR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h0\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010jR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010jR \u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010jR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010j¨\u0006w"}, d2 = {"Lcom/sumsub/sns/camera/video/presentation/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel$d;", "Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel;", "Lcom/sumsub/sns/internal/core/domain/camera/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "colorAttr", "a", "(Landroid/content/Context;I)I", "drawableRes", "LO9/p;", "(I)V", "color", "b", "", "", "", "grantResults", "handlePermissionResults", "(Ljava/util/Map;)V", "", "permissions", "([Ljava/lang/String;)Z", "u", "t", "getLayoutId", "()I", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "onStart", "onDestroyView", "state", "(Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel$d;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "onStop", "LO9/f;", "s", "()Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Landroidx/camera/view/PreviewView;", "c", "Lcom/sumsub/sns/internal/core/common/z;", "m", "()Landroidx/camera/view/PreviewView;", "previewView", "Landroid/widget/ProgressBar;", "d", "k", "()Landroid/widget/ProgressBar;", "circleProgressView", "Landroid/widget/TextView;", "e", "o", "()Landroid/widget/TextView;", "tvCounter", "f", "n", "()Landroid/view/View;", "stopView", "g", "l", "doneView", "h", "r", "tvText", "i", "p", "tvDescription1", "j", "q", "tvDescription2", "Landroidx/appcompat/app/b;", "Landroidx/appcompat/app/b;", "lackOfCameraDialog", "Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel$State;", "Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel$State;", "lastState", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "cameraX", "Le/c;", "Le/c;", "permissionLauncher", "", "getPermissionsPayload", "()Ljava/util/Map;", "permissionsPayload", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "getOpenPayload", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<SNSVideoSelfieViewModel.d, SNSVideoSelfieViewModel> implements com.sumsub.sns.internal.core.domain.camera.a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f13990p;

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f13991s;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z previewView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z circleProgressView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tvCounter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z stopView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z doneView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z tvText;

    /* renamed from: i, reason: from kotlin metadata */
    public final z tvDescription1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z tvDescription2;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b lackOfCameraDialog;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public SNSVideoSelfieViewModel.State lastState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final CameraX cameraX;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public AbstractC0704c<String[]> permissionLauncher;

    /* renamed from: com.sumsub.sns.camera.video.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str, String str2) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", str);
            bundle.putString("EXTRA_TYPE", str2);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14005a;

        static {
            int[] iArr = new int[SNSVideoSelfieViewModel.State.values().length];
            iArr[SNSVideoSelfieViewModel.State.Countdown.ordinal()] = 1;
            iArr[SNSVideoSelfieViewModel.State.Recording.ordinal()] = 2;
            iArr[SNSVideoSelfieViewModel.State.Done.ordinal()] = 3;
            f14005a = iArr;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f14006a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14006a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f14006a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f14007a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f14007a.invoke();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f14008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(O9.f fVar) {
            super(0);
            this.f14008a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f14008a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14009a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f14010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f14009a = interfaceC0635a;
            this.f14010b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f14009a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f14010b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<T> {
        public h() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.camera.video.presentation.a(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0);
        i iVar = kotlin.jvm.internal.h.f23186a;
        f13990p = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "circleProgressView", "getCircleProgressView()Landroid/widget/ProgressBar;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvCounter", "getTvCounter()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "stopView", "getStopView()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "doneView", "getDoneView()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvText", "getTvText()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvDescription1", "getTvDescription1()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvDescription2", "getTvDescription2()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
        f13991s = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    public a() {
        h hVar = new h();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new d(new c(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(SNSVideoSelfieViewModel.class), new e(b9), hVar, new f(null, b9));
        this.screen = com.sumsub.sns.core.presentation.c.f14171a.a(this);
        this.previewView = a0.a(this, R$id.sns_camera);
        this.circleProgressView = a0.a(this, R$id.sns_video_circle_progress);
        this.tvCounter = a0.a(this, R$id.sns_counter);
        this.stopView = a0.a(this, R$id.sns_stop);
        this.doneView = a0.a(this, R$id.sns_done);
        this.tvText = a0.a(this, R$id.sns_text);
        this.tvDescription1 = a0.a(this, R$id.sns_description_1);
        this.tvDescription2 = a0.a(this, R$id.sns_description_2);
        this.cameraX = new CameraX(CameraX.Mode.VIDEO, null, null, CameraSelector.DEFAULT_FRONT_CAMERA, this, 6, null);
    }

    @Override // com.sumsub.sns.internal.core.domain.camera.a
    public void b(File file) {
        getViewModel().a(file);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_ID_DOC_SET_TYPE") : null;
        return string == null ? DocumentType.f15253j : string;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_video_selfie;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return getPermissionsPayload();
    }

    public final Map<String, Object> getPermissionsPayload() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.a.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.MICROPHONE_PERMISSION.toString(), Boolean.valueOf(j.a(context, "android.permission.RECORD_AUDIO")));
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(j.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        ProgressBar k3;
        if (event instanceof SNSVideoSelfieViewModel.b.C0184b) {
            this.cameraX.a(((SNSVideoSelfieViewModel.b.C0184b) event).b());
            return;
        }
        if (event instanceof SNSVideoSelfieViewModel.b.c) {
            this.cameraX.h();
            return;
        }
        if (event instanceof SNSVideoSelfieViewModel.b.a) {
            Bundle bundle = new Bundle();
            SNSVideoSelfieViewModel.b.a aVar = (SNSVideoSelfieViewModel.b.a) event;
            bundle.putString("EXTRA_FILE", aVar.b().c().getAbsolutePath());
            bundle.putString("EXTRA_PHRASE", aVar.b().d());
            p pVar = p.f3034a;
            com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (!(event instanceof SNSVideoSelfieViewModel.b.d.C0185b)) {
            if (!(event instanceof SNSVideoSelfieViewModel.b.d.a)) {
                super.handleEvent(event);
                return;
            }
            if (b.f14005a[((SNSVideoSelfieViewModel.b.d.a) event).a().ordinal()] == 2) {
                getViewModel().t();
                ProgressBar k10 = k();
                if (k10 == null) {
                    return;
                }
                k10.setProgress(0);
                return;
            }
            return;
        }
        SNSVideoSelfieViewModel.b.d.C0185b c0185b = (SNSVideoSelfieViewModel.b.d.C0185b) event;
        int i = b.f14005a[c0185b.a().ordinal()];
        if (i != 1) {
            if (i == 2 && (k3 = k()) != null) {
                k3.setProgress((int) (((7600 - c0185b.b()) * 100) / 7600));
                return;
            }
            return;
        }
        long b9 = ((3000 - c0185b.b()) * 100) / 3000;
        ProgressBar k11 = k();
        if (k11 != null) {
            k11.setProgress((int) b9);
        }
        TextView o10 = o();
        if (o10 == null) {
            return;
        }
        o10.setText(String.format("%d", Arrays.copyOf(new Object[]{Long.valueOf((c0185b.b() / TimeUnit.SECONDS.toMillis(1L)) + 1)}, 1)));
    }

    public final void handlePermissionResults(Map<String, Boolean> grantResults) {
        for (String str : f13991s) {
            if (!kotlin.jvm.internal.f.b(grantResults.get(str), Boolean.TRUE)) {
                u();
                return;
            }
        }
        getViewModel().u();
    }

    public final ProgressBar k() {
        return (ProgressBar) this.circleProgressView.a(this, f13990p[1]);
    }

    public final View l() {
        return this.doneView.a(this, f13990p[4]);
    }

    public final PreviewView m() {
        return (PreviewView) this.previewView.a(this, f13990p[0]);
    }

    public final View n() {
        return this.stopView.a(this, f13990p[3]);
    }

    public final TextView o() {
        return (TextView) this.tvCounter.a(this, f13990p[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.cameraX.g();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        String[] strArr = f13991s;
        if (a(strArr)) {
            getViewModel().u();
            return;
        }
        AbstractC0704c<String[]> abstractC0704c = this.permissionLauncher;
        if (abstractC0704c != null) {
            abstractC0704c.a(strArr);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.b bVar = this.lackOfCameraDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.lackOfCameraDialog = null;
        getViewModel().p();
        this.cameraX.h();
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Drawable background;
        Integer a10;
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new f.f(), new A0.b(this, 28));
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        int a12 = (a11 == null || (a10 = aVar.a(a11, SNSColorElement.CONTENT_CRITICAL, aVar.a(view))) == null) ? a(requireContext(), R$attr.sns_colorOnRejected) : a10.intValue();
        View n10 = n();
        if (n10 == null || (background = n10.getBackground()) == null) {
            return;
        }
        background.setTint(a12);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        t();
    }

    public final TextView p() {
        return (TextView) this.tvDescription1.a(this, f13990p[6]);
    }

    public final TextView q() {
        return (TextView) this.tvDescription2.a(this, f13990p[7]);
    }

    public final TextView r() {
        return (TextView) this.tvText.a(this, f13990p[5]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public SNSVideoSelfieViewModel getViewModel() {
        return (SNSVideoSelfieViewModel) this.viewModel.getValue();
    }

    public final void t() {
        this.cameraX.a(getViewLifecycleOwner(), m());
        this.cameraX.a(this.cameraX.f().e());
    }

    public final void u() {
        if (this.lackOfCameraDialog == null && getIsPrepared()) {
            SNSVideoSelfieViewModel.e d10 = getViewModel().c().d();
            final int i = 0;
            final int i9 = 1;
            androidx.appcompat.app.b create = new SNSAlertDialogBuilder(requireContext()).setMessage(d10.i()).setPositiveButton(d10.k(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.camera.video.presentation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f14013b;

                {
                    this.f14013b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (i) {
                        case 0:
                            a.b(this.f14013b, dialogInterface, i10);
                            break;
                        default:
                            a.a(this.f14013b, dialogInterface, i10);
                            break;
                    }
                }
            }).setOnCancelListener((DialogInterface.OnCancelListener) new com.sumsub.sns.camera.video.presentation.c(this, 0)).setNeutralButton(d10.j(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.camera.video.presentation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f14013b;

                {
                    this.f14013b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (i9) {
                        case 0:
                            a.b(this.f14013b, dialogInterface, i10);
                            break;
                        default:
                            a.a(this.f14013b, dialogInterface, i10);
                            break;
                    }
                }
            }).create();
            this.lackOfCameraDialog = create;
            if (create != null) {
                create.show();
            }
        }
    }

    public static final void a(a aVar, Map map) {
        aVar.handlePermissionResults(map);
    }

    public final void b(int color) {
        ProgressBar k3 = k();
        Drawable indeterminateDrawable = k3 != null ? k3.getIndeterminateDrawable() : null;
        if (indeterminateDrawable == null) {
            return;
        }
        indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
    }

    public static final void b(a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(SNSVideoSelfieViewModel.d state, Bundle savedInstanceState) {
        Drawable progressDrawable;
        TextView r8 = r();
        if (r8 != null) {
            com.sumsub.sns.internal.core.common.i.a(r8, state.d().l());
        }
        TextView p10 = p();
        if (p10 != null) {
            com.sumsub.sns.internal.core.common.i.a(p10, state.d().g());
        }
        TextView q10 = q();
        if (q10 != null) {
            com.sumsub.sns.internal.core.common.i.a(q10, state.d().h());
        }
        if (this.lastState == state.c()) {
            return;
        }
        this.lastState = state.c();
        SNSVideoSelfieViewModel.State c2 = state.c();
        int i = c2 == null ? -1 : b.f14005a[c2.ordinal()];
        if (i == 1) {
            TextView o10 = o();
            if (o10 != null) {
                o10.setVisibility(0);
            }
            View n10 = n();
            if (n10 != null) {
                n10.setVisibility(8);
            }
            View l10 = l();
            if (l10 != null) {
                l10.setVisibility(8);
            }
            a(R$drawable.circular_progress_bar_countdown);
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
            if (a10 != null) {
                SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                View view = getView();
                Integer a11 = aVar.a(a10, sNSColorElement, view != null ? aVar.a(view) : false);
                if (a11 != null) {
                    int intValue = a11.intValue();
                    ProgressBar k3 = k();
                    progressDrawable = k3 != null ? k3.getProgressDrawable() : null;
                    if (progressDrawable != null) {
                        progressDrawable.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN));
                    }
                }
            }
            b(a(requireContext(), R$attr.sns_colorOnProcessing));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ProgressBar k10 = k();
            if (k10 != null) {
                k10.setProgress(0);
            }
            TextView o11 = o();
            if (o11 != null) {
                o11.setVisibility(8);
            }
            View n11 = n();
            if (n11 != null) {
                n11.setVisibility(8);
            }
            View l11 = l();
            if (l11 == null) {
                return;
            }
            l11.setVisibility(0);
            return;
        }
        TextView o12 = o();
        if (o12 != null) {
            o12.setVisibility(8);
        }
        View n12 = n();
        if (n12 != null) {
            n12.setVisibility(0);
        }
        View l12 = l();
        if (l12 != null) {
            l12.setVisibility(8);
        }
        a(R$drawable.circular_progress_bar_recording);
        com.sumsub.sns.core.presentation.helper.a aVar2 = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a12 = aVar2.a();
        if (a12 != null) {
            SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_CRITICAL;
            View view2 = getView();
            Integer a13 = aVar2.a(a12, sNSColorElement2, view2 != null ? aVar2.a(view2) : false);
            if (a13 != null) {
                int intValue2 = a13.intValue();
                ProgressBar k11 = k();
                progressDrawable = k11 != null ? k11.getProgressDrawable() : null;
                if (progressDrawable != null) {
                    progressDrawable.setColorFilter(new PorterDuffColorFilter(intValue2, PorterDuff.Mode.SRC_IN));
                }
            }
        }
        b(a(requireContext(), R$attr.sns_colorOnRejected));
        View n13 = n();
        if (n13 != null) {
            n13.setOnClickListener(new J7.b(this, 10));
        }
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.DoneButton, null, 8, null);
        aVar.getViewModel().t();
        ProgressBar k3 = aVar.k();
        if (k3 == null) {
            return;
        }
        k3.setProgress(0);
    }

    public final int a(Context context, int colorAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{colorAttr});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final void a(int drawableRes) {
        ProgressBar k3 = k();
        if (k3 == null) {
            return;
        }
        Resources resources = getResources();
        ActivityC0533g activity = getActivity();
        Resources.Theme theme = activity != null ? activity.getTheme() : null;
        ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
        k3.setProgressDrawable(resources.getDrawable(drawableRes, theme));
    }

    public static final void a(a aVar, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
    }

    public static final void a(a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        com.sumsub.sns.internal.core.common.i.a((Activity) aVar.requireActivity());
    }

    public final boolean a(String[] permissions) {
        for (String str : permissions) {
            if (C0913a.checkSelfPermission(requireContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }
}

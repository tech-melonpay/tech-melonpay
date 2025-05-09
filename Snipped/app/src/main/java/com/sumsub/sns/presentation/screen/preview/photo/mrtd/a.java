package com.sumsub.sns.presentation.screen.preview.photo.mrtd;

import O9.f;
import O9.p;
import R0.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSDotsProgressView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b;
import ia.InterfaceC0840h;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.bouncycastle.i18n.MessageBundle;
import y0.s;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\t\u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0005R\u001b\u0010&\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001d\u00102\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001d\u00107\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010;R\u001d\u0010?\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010;R\u001d\u0010B\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010;R\u001d\u0010E\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010;R\u001d\u0010J\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\bH\u0010IR\u001d\u0010O\u001a\u0004\u0018\u00010K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\bM\u0010NR\u001d\u0010Q\u001a\u0004\u0018\u00010K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010)\u001a\u0004\bP\u0010NR\u001d\u0010T\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010)\u001a\u0004\bL\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010XR\u0014\u0010]\u001a\u00020Z8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/photo/mrtd/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b;", "<init>", "()V", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$d;", "state", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$d;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$e;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$e;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$a;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$a;)V", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$b;", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a$b;)V", "w", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "(Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a;Landroid/os/Bundle;)V", "onDestroy", "LO9/f;", "v", "()Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b;", "viewModel", "Landroid/widget/TextView;", "b", "Lcom/sumsub/sns/internal/core/common/z;", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "c", "u", "subtitle", "d", "n", "hint", "Landroidx/constraintlayout/widget/Group;", "e", "o", "()Landroidx/constraintlayout/widget/Group;", "instructions", "Landroid/widget/ImageView;", "f", "t", "()Landroid/widget/ImageView;", "status", "g", "p", "nfcIcon", "h", "q", "phone", "i", "l", "document", "Lcom/sumsub/sns/core/widget/SNSDotsProgressView;", "j", "m", "()Lcom/sumsub/sns/core/widget/SNSDotsProgressView;", "dotProgress", "Landroid/widget/Button;", "k", "r", "()Landroid/widget/Button;", "primaryButton", "s", "secondaryButton", "Landroid/widget/FrameLayout;", "()Landroid/widget/FrameLayout;", "customViewContainer", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "instructionAnimation", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/mrtd/b$a$a;", "lastState", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<b.a.AbstractC0338a, com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20099q;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z subtitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z hint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z instructions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z nfcIcon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z phone;

    /* renamed from: i, reason: from kotlin metadata */
    public final z document;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z dotProgress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final z primaryButton;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final z secondaryButton;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final z customViewContainer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Animator instructionAnimation;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public b.a.AbstractC0338a lastState;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.photo.mrtd.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_MRTDSEED", str5);
            bundle.putString("ARGS_IDDOCSETTYPE", str2);
            bundle.putString("ARGS_MRTD_DATA_FILES_TO_READ", str6);
            bundle.putString("ARGS_APPLICANT", str);
            bundle.putString("ARGS_IDDOCTYPE", str3);
            bundle.putString("ARGS_COUNTRY", str4);
            bundle.putString("ARGS_IMAGE_ID", str7);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20114a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20114a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20115a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20115a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20115a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f20116a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f20116a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20116a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20117a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f20118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f20117a = interfaceC0635a;
            this.f20118b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20117a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20118b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f20119a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f20120b;

        public g(View view, a aVar) {
            this.f20119a = view;
            this.f20120b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20120b.w();
        }
    }

    public static final class h extends Lambda implements InterfaceC0646l<IsoDep, p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f20122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f20123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(1);
            this.f20122b = str;
            this.f20123c = str2;
        }

        public final void a(IsoDep isoDep) {
            String string;
            Bundle arguments;
            String string2;
            String string3;
            Bundle arguments2 = a.this.getArguments();
            if (arguments2 == null || (string = arguments2.getString("ARGS_APPLICANT")) == null || (arguments = a.this.getArguments()) == null || (string2 = arguments.getString("ARGS_MRTDSEED")) == null) {
                return;
            }
            Bundle arguments3 = a.this.getArguments();
            String string4 = arguments3 != null ? arguments3.getString("ARGS_MRTD_DATA_FILES_TO_READ") : null;
            Bundle arguments4 = a.this.getArguments();
            if (arguments4 == null || (string3 = arguments4.getString("ARGS_IMAGE_ID")) == null) {
                return;
            }
            a.this.getViewModel().a(string, this.f20122b, this.f20123c, isoDep, string2, string4, string3);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(IsoDep isoDep) {
            a(isoDep);
            return p.f3034a;
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<T> {
        public i() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, MessageBundle.TITLE_ENTRY, "getTitle()Landroid/widget/TextView;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f20099q = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "hint", "getHint()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "instructions", "getInstructions()Landroidx/constraintlayout/widget/Group;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "status", "getStatus()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "nfcIcon", "getNfcIcon()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "phone", "getPhone()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "document", "getDocument()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "dotProgress", "getDotProgress()Lcom/sumsub/sns/core/widget/SNSDotsProgressView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "customViewContainer", "getCustomViewContainer()Landroid/widget/FrameLayout;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        i iVar = new i();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.class), new d(b9), iVar, new e(null, b9));
        this.title = a0.a(this, R$id.sns_title);
        this.subtitle = a0.a(this, R$id.sns_subtitle);
        this.hint = a0.a(this, R$id.sns_hint);
        this.instructions = a0.a(this, R$id.sns_instructions);
        this.status = a0.a(this, R$id.sns_status);
        this.nfcIcon = a0.a(this, R$id.sns_nfc_icon);
        this.phone = a0.a(this, R$id.sns_phone);
        this.document = a0.a(this, R$id.sns_document);
        this.dotProgress = a0.a(this, R$id.sns_reading_progress);
        this.primaryButton = a0.a(this, R$id.sns_primary_button);
        this.secondaryButton = a0.a(this, R$id.sns_secondary_button);
        this.customViewContainer = a0.a(this, R$id.sns_custom_view);
    }

    public static final void c(a aVar, View view) {
        k0 appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        com.sumsub.sns.core.presentation.b.finish$default(aVar, new q.b(false, 1, null), null, null, 6, null);
    }

    public static final void d(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.SkipButton, null, 8, null);
        k0 appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        com.sumsub.sns.core.presentation.b.finish$default(aVar, new q.b(false, 1, null), null, null, 6, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARGS_IDDOCSETTYPE") : null;
        return string == null ? DocumentType.f15253j : string;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_mrtd_read;
    }

    public final TextView getTitle() {
        return (TextView) this.title.a(this, f20099q[0]);
    }

    public final FrameLayout k() {
        return (FrameLayout) this.customViewContainer.a(this, f20099q[11]);
    }

    public final ImageView l() {
        return (ImageView) this.document.a(this, f20099q[7]);
    }

    public final SNSDotsProgressView m() {
        return (SNSDotsProgressView) this.dotProgress.a(this, f20099q[8]);
    }

    public final TextView n() {
        return (TextView) this.hint.a(this, f20099q[2]);
    }

    public final Group o() {
        return (Group) this.instructions.a(this, f20099q[3]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Animator animator = this.instructionAnimation;
        if (animator != null) {
            animator.cancel();
        }
        this.instructionAnimation = null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (!kotlin.jvm.internal.f.b(finishReason, q.c.f15162b)) {
            return super.onFinishCalled(finishReason);
        }
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        com.sumsub.sns.core.presentation.b.finish$default(this, new q.b(false, 1, null), null, null, 6, null);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        this.lastState = null;
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Float a10;
        super.onViewCreated(view, savedInstanceState);
        com.sumsub.sns.internal.core.analytics.c.d(getAnalyticsDelegate(), getScreen(), getIdDocSetType(), null, 4, null);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, SNSMetricElement.SCREEN_HORIZONTAL_MARGIN)) == null) {
            return;
        }
        int floatValue = (int) a10.floatValue();
        com.sumsub.sns.internal.core.common.i.a(Integer.valueOf(floatValue), Integer.valueOf(floatValue), null, null, getTitle(), u(), r(), s());
    }

    public final ImageView p() {
        return (ImageView) this.nfcIcon.a(this, f20099q[5]);
    }

    public final ImageView q() {
        return (ImageView) this.phone.a(this, f20099q[6]);
    }

    public final Button r() {
        return (Button) this.primaryButton.a(this, f20099q[9]);
    }

    public final Button s() {
        return (Button) this.secondaryButton.a(this, f20099q[10]);
    }

    public final ImageView t() {
        return (ImageView) this.status.a(this, f20099q[4]);
    }

    public final TextView u() {
        return (TextView) this.subtitle.a(this, f20099q[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b) this.viewModel.getValue();
    }

    public final void w() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q(), "translationX", 0.0f, (q() != null ? r3.getWidth() : 0) / 3.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.addUpdateListener(new A2.a(this, 3));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(q(), "translationY", 0.0f, (q() != null ? r9.getHeight() : 0) / 7.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(q(), "rotation", 0.0f, 27.0f);
        ofFloat3.setDuration(2000L);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.start();
        this.instructionAnimation = animatorSet;
    }

    public static final void b(a aVar, View view) {
        k0 appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.c();
            aVar.getAnalyticsDelegate().d();
        }
        com.sumsub.sns.core.presentation.b.finish$default(aVar, new q.b(false, 1, null), null, null, 6, null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(b.a.AbstractC0338a state, Bundle savedInstanceState) {
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        Logger.d$default(aVar, "SNSMRTDReadFragment", "MRTD screen: state=" + state, null, 4, null);
        if (kotlin.jvm.internal.f.b(this.lastState, state)) {
            Logger.d$default(aVar, "SNSMRTDReadFragment", "MRTD screen: drop duplicate state=" + state, null, 4, null);
            return;
        }
        Animator animator = this.instructionAnimation;
        if (animator != null) {
            animator.cancel();
        }
        if (!(state instanceof b.a.AbstractC0338a.c)) {
            if (state instanceof b.a.AbstractC0338a.d) {
                a((b.a.AbstractC0338a.d) state);
            } else if (state instanceof b.a.AbstractC0338a.e) {
                a((b.a.AbstractC0338a.e) state);
            } else if (state instanceof b.a.AbstractC0338a.C0339a) {
                a((b.a.AbstractC0338a.C0339a) state);
            } else if (state instanceof b.a.AbstractC0338a.C0340b) {
                a((b.a.AbstractC0338a.C0340b) state);
            }
        }
        this.lastState = state;
    }

    public static final void c(a aVar) {
        com.sumsub.sns.core.presentation.b.finish$default(aVar, new q.b(false, 1, null), null, null, 6, null);
    }

    public final void a(b.a.AbstractC0338a.d state) {
        String str;
        String imageName;
        String string;
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(0);
        }
        TextView title2 = getTitle();
        if (title2 != null) {
            title2.setText(state.j());
        }
        TextView u6 = u();
        if (u6 != null) {
            u6.setVisibility(0);
        }
        TextView u10 = u();
        if (u10 != null) {
            u10.setText(state.i());
        }
        TextView n10 = n();
        if (n10 != null) {
            n10.setVisibility(0);
        }
        TextView n11 = n();
        if (n11 != null) {
            n11.setText(state.f());
        }
        Button r8 = r();
        if (r8 != null) {
            r8.setVisibility(4);
        }
        Button s10 = s();
        if (s10 != null) {
            s10.setVisibility(com.sumsub.sns.internal.ff.a.f16930a.s().g() ? 8 : 0);
        }
        Button s11 = s();
        if (s11 != null) {
            s11.setText(state.h());
        }
        Button s12 = s();
        if (s12 != null) {
            s12.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.photo.mrtd.b(this, 1));
        }
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("ARGS_IDDOCTYPE")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("ARGS_COUNTRY")) != null) {
            str2 = string;
        }
        e0 e0Var = e0.f15081a;
        SNSInstructionsViewHandler instructionsViewHandler = e0Var.getInstructionsViewHandler();
        View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), DocumentType.f15246b, str, IntroScene.MRTD_PREPARING.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), str2) : null;
        if (onVerificationStep != null) {
            FrameLayout k3 = k();
            if (k3 != null) {
                k3.removeAllViews();
            }
            FrameLayout k10 = k();
            if (k10 != null) {
                k10.addView(onVerificationStep, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout k11 = k();
            if (k11 != null) {
                k11.setVisibility(0);
            }
            Group o10 = o();
            if (o10 != null) {
                o10.setVisibility(4);
            }
        } else {
            Bundle arguments3 = getArguments();
            String string2 = arguments3 != null ? arguments3.getString("ARGS_IDDOCTYPE") : null;
            if (kotlin.jvm.internal.f.b(string2, q.c.f15563f.b())) {
                imageName = SNSIconHandler.SNSCommonIcons.MRTD_IDCARD.getImageName();
            } else {
                imageName = kotlin.jvm.internal.f.b(string2, q.f.f15566f.b()) ? SNSIconHandler.SNSCommonIcons.MRTD_IDCARD.getImageName() : SNSIconHandler.SNSCommonIcons.MRTD_PASSPORT.getImageName();
            }
            FrameLayout k12 = k();
            if (k12 != null) {
                k12.setVisibility(4);
            }
            ImageView l10 = l();
            if (l10 != null) {
                l10.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), imageName));
            }
            ImageView q10 = q();
            if (q10 != null) {
                q10.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.MRTD_PHONE.getImageName()));
            }
            Group o11 = o();
            if (o11 != null) {
                o11.setVisibility(0);
            }
            ImageView q11 = q();
            if (q11 != null) {
                s.a(q11, new g(q11, this));
            }
        }
        ImageView t3 = t();
        if (t3 != null) {
            t3.setVisibility(4);
        }
        ImageView p10 = p();
        if (p10 != null) {
            p10.setVisibility(4);
        }
        SNSDotsProgressView m2 = m();
        if (m2 != null) {
            m2.setVisibility(4);
        }
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.a(new h(str2, str));
        }
    }

    public final void a(b.a.AbstractC0338a.e state) {
        String string;
        String string2;
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(0);
        }
        TextView title2 = getTitle();
        if (title2 != null) {
            title2.setText(state.l());
        }
        TextView u6 = u();
        if (u6 != null) {
            u6.setVisibility(0);
        }
        TextView u10 = u();
        if (u10 != null) {
            u10.setText(state.k());
        }
        TextView n10 = n();
        if (n10 != null) {
            n10.setVisibility(0);
        }
        TextView n11 = n();
        if (n11 != null) {
            n11.setText(state.g());
        }
        Button r8 = r();
        if (r8 != null) {
            r8.setVisibility(4);
        }
        Button s10 = s();
        if (s10 != null) {
            s10.setVisibility(0);
        }
        Button s11 = s();
        if (s11 != null) {
            s11.setText(state.j());
        }
        Button s12 = s();
        if (s12 != null) {
            s12.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.photo.mrtd.b(this, 0));
        }
        Group o10 = o();
        if (o10 != null) {
            o10.setVisibility(4);
        }
        ImageView t3 = t();
        if (t3 != null) {
            t3.setVisibility(4);
        }
        Bundle arguments = getArguments();
        String str = (arguments == null || (string2 = arguments.getString("ARGS_IDDOCTYPE")) == null) ? "" : string2;
        Bundle arguments2 = getArguments();
        String str2 = (arguments2 == null || (string = arguments2.getString("ARGS_COUNTRY")) == null) ? "" : string;
        e0 e0Var = e0.f15081a;
        SNSInstructionsViewHandler instructionsViewHandler = e0Var.getInstructionsViewHandler();
        View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), DocumentType.f15246b, str, IntroScene.MRTD_SCANNING.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), str2) : null;
        if (onVerificationStep != null) {
            FrameLayout k3 = k();
            if (k3 != null) {
                k3.removeAllViews();
            }
            FrameLayout k10 = k();
            if (k10 != null) {
                k10.addView(onVerificationStep, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout k11 = k();
            if (k11 != null) {
                k11.setVisibility(0);
            }
            ImageView p10 = p();
            if (p10 != null) {
                p10.setVisibility(4);
            }
            SNSDotsProgressView m2 = m();
            if (m2 == null) {
                return;
            }
            m2.setVisibility(4);
            return;
        }
        ImageView p11 = p();
        if (p11 != null) {
            p11.setVisibility(0);
        }
        ImageView p12 = p();
        if (p12 != null) {
            p12.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.NFC.getImageName()));
        }
        SNSDotsProgressView m9 = m();
        if (m9 != null) {
            m9.setVisibility(0);
        }
        SNSDotsProgressView m10 = m();
        if (m10 == null) {
            return;
        }
        m10.setProgress(state.i());
    }

    public final void a(b.a.AbstractC0338a.C0339a state) {
        String string;
        String string2;
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(4);
        }
        TextView u6 = u();
        if (u6 != null) {
            u6.setVisibility(4);
        }
        TextView n10 = n();
        if (n10 != null) {
            n10.setVisibility(0);
        }
        TextView n11 = n();
        if (n11 != null) {
            n11.setText(state.b());
        }
        Button r8 = r();
        if (r8 != null) {
            r8.setVisibility(4);
        }
        Button s10 = s();
        if (s10 != null) {
            s10.setVisibility(4);
        }
        Group o10 = o();
        if (o10 != null) {
            o10.setVisibility(4);
        }
        ImageView p10 = p();
        if (p10 != null) {
            p10.setVisibility(4);
        }
        SNSDotsProgressView m2 = m();
        if (m2 != null) {
            m2.setVisibility(4);
        }
        Bundle arguments = getArguments();
        String str = (arguments == null || (string2 = arguments.getString("ARGS_IDDOCTYPE")) == null) ? "" : string2;
        Bundle arguments2 = getArguments();
        String str2 = (arguments2 == null || (string = arguments2.getString("ARGS_COUNTRY")) == null) ? "" : string;
        e0 e0Var = e0.f15081a;
        SNSInstructionsViewHandler instructionsViewHandler = e0Var.getInstructionsViewHandler();
        View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), DocumentType.f15246b, str, IntroScene.MRTD_SCANNED.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), str2) : null;
        if (onVerificationStep != null) {
            FrameLayout k3 = k();
            if (k3 != null) {
                k3.removeAllViews();
            }
            FrameLayout k10 = k();
            if (k10 != null) {
                k10.addView(onVerificationStep, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout k11 = k();
            if (k11 != null) {
                k11.setVisibility(0);
            }
            ImageView t3 = t();
            if (t3 != null) {
                t3.setVisibility(4);
            }
        } else {
            ImageView t10 = t();
            if (t10 != null) {
                t10.setVisibility(0);
            }
            ImageView t11 = t();
            if (t11 != null) {
                SNSStepViewExtensionsKt.setSnsStepState(t11, SNSStepState.APPROVED);
            }
            ImageView t12 = t();
            if (t12 != null) {
                t12.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName()));
            }
        }
        View view = getView();
        if (view != null) {
            view.postDelayed(new RunnableC0615f(this, 7), TimeUnit.SECONDS.toMillis(2L));
        }
    }

    public final void a(b.a.AbstractC0338a.C0340b state) {
        String string;
        String string2;
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.c();
        }
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(4);
        }
        TextView u6 = u();
        if (u6 != null) {
            u6.setVisibility(4);
        }
        TextView n10 = n();
        if (n10 != null) {
            n10.setVisibility(0);
        }
        TextView n11 = n();
        if (n11 != null) {
            n11.setText(state.d());
        }
        Button r8 = r();
        if (r8 != null) {
            r8.setVisibility(0);
        }
        Button r10 = r();
        if (r10 != null) {
            r10.setText(state.e());
        }
        Button r11 = r();
        if (r11 != null) {
            r11.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.photo.mrtd.b(this, 2));
        }
        Button s10 = s();
        if (s10 != null) {
            s10.setVisibility(0);
        }
        Button s11 = s();
        if (s11 != null) {
            s11.setText(state.f());
        }
        Button s12 = s();
        if (s12 != null) {
            s12.setOnClickListener(new com.sumsub.sns.presentation.screen.preview.photo.mrtd.b(this, 3));
        }
        Group o10 = o();
        if (o10 != null) {
            o10.setVisibility(4);
        }
        ImageView p10 = p();
        if (p10 != null) {
            p10.setVisibility(4);
        }
        SNSDotsProgressView m2 = m();
        if (m2 != null) {
            m2.setVisibility(4);
        }
        ImageView t3 = t();
        if (t3 != null) {
            t3.setVisibility(0);
        }
        ImageView t10 = t();
        if (t10 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(t10, SNSStepState.REJECTED);
        }
        ImageView t11 = t();
        if (t11 != null) {
            t11.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()));
        }
        Bundle arguments = getArguments();
        String str = (arguments == null || (string2 = arguments.getString("ARGS_IDDOCTYPE")) == null) ? "" : string2;
        Bundle arguments2 = getArguments();
        String str2 = (arguments2 == null || (string = arguments2.getString("ARGS_COUNTRY")) == null) ? "" : string;
        e0 e0Var = e0.f15081a;
        SNSInstructionsViewHandler instructionsViewHandler = e0Var.getInstructionsViewHandler();
        View onVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), DocumentType.f15246b, str, IntroScene.MRTD_FAILED.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), str2) : null;
        if (onVerificationStep != null) {
            FrameLayout k3 = k();
            if (k3 != null) {
                k3.removeAllViews();
            }
            FrameLayout k10 = k();
            if (k10 != null) {
                k10.addView(onVerificationStep, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout k11 = k();
            if (k11 != null) {
                k11.setVisibility(0);
            }
            ImageView t12 = t();
            if (t12 != null) {
                t12.setVisibility(4);
            }
        } else {
            ImageView t13 = t();
            if (t13 != null) {
                t13.setVisibility(0);
            }
            ImageView t14 = t();
            if (t14 != null) {
                SNSStepViewExtensionsKt.setSnsStepState(t14, SNSStepState.REJECTED);
            }
            ImageView t15 = t();
            if (t15 != null) {
                t15.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()));
            }
        }
        if (onVerificationStep != null) {
            FrameLayout k12 = k();
            if (k12 != null) {
                k12.removeAllViews();
            }
            FrameLayout k13 = k();
            if (k13 != null) {
                k13.addView(onVerificationStep, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout k14 = k();
            if (k14 != null) {
                k14.setVisibility(0);
            }
            ImageView t16 = t();
            if (t16 == null) {
                return;
            }
            t16.setVisibility(4);
            return;
        }
        ImageView t17 = t();
        if (t17 != null) {
            t17.setVisibility(0);
        }
        ImageView t18 = t();
        if (t18 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(t18, SNSStepState.REJECTED);
        }
        ImageView t19 = t();
        if (t19 != null) {
            t19.setImageDrawable(e0Var.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()));
        }
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.RetryButton, null, 8, null);
        aVar.getViewModel().s();
    }

    public static final void a(a aVar, ValueAnimator valueAnimator) {
        ImageView q10 = aVar.q();
        if (q10 == null) {
            return;
        }
        SNSStepViewExtensionsKt.setSnsStepState(q10, ((double) valueAnimator.getAnimatedFraction()) < 0.2d ? SNSStepState.PROCESSING : SNSStepState.INIT);
    }
}

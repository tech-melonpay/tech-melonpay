package com.sumsub.sns.camera.photo.presentation.selfie;

import O9.f;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import ia.InterfaceC0840h;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u001d\u0010(\u001a\u0004\u0018\u00010$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b\u0016\u0010*R\u001d\u0010,\u001a\u0004\u0018\u00010)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\b\u0010*R\u001d\u0010.\u001a\u0004\u0018\u00010)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b\u000e\u0010*R\u001d\u0010/\u001a\u0004\u0018\u00010$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0013\u0010'R\u001d\u00102\u001a\u0004\u0018\u00010\r8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u001d\u00105\u001a\u0004\u0018\u0001038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b%\u00104R\u001a\u0010:\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020;8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b-\u0010>R\u001a\u0010A\u001a\u00020;8\u0016X\u0096D¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0011R\u0014\u0010F\u001a\u00020C8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/sumsub/sns/camera/photo/presentation/selfie/a;", "Lcom/sumsub/sns/camera/b;", "Lcom/sumsub/sns/internal/camera/photo/presentation/selfie/a;", "<init>", "()V", "", "getLayoutId", "()I", "o", "LO9/f;", "N", "()Lcom/sumsub/sns/internal/camera/photo/presentation/selfie/a;", "viewModel", "Landroid/view/View;", "p", "Lcom/sumsub/sns/internal/core/common/z;", "x", "()Landroid/view/View;", "rootView", "q", "z", "takePictureProgressView", "r", "B", "takePictureViewContainer", "s", "J", "takeGalleryView", "Lcom/sumsub/sns/core/widget/SNSToolbarView;", "t", "C", "()Lcom/sumsub/sns/core/widget/SNSToolbarView;", "toolbar", "u", "w", "progressBar", "Landroid/view/ViewGroup;", "v", "M", "()Landroid/view/ViewGroup;", "helperView", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "helperTitle", "helperBrief", "y", "helperDetails", "helperDetailsFrame", "A", "m", "darkOverlay", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "previewView", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "", "D", "Z", "()Z", "shouldShowFlash", "E", "isFrontFacingCamera", "takePictureView", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "F", "a", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.camera.b<com.sumsub.sns.internal.camera.photo.presentation.selfie.a> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f13965G;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final z darkOverlay;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final z previewView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldShowFlash;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final boolean isFrontFacingCamera;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final z rootView;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final z takePictureProgressView;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final z takePictureViewContainer;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final z takeGalleryView;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final z toolbar;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final z progressBar;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final z helperView;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final z helperTitle;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final z helperBrief;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final z helperDetails;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final z helperDetailsFrame;

    /* renamed from: com.sumsub.sns.camera.photo.presentation.selfie.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(DocumentType documentType, boolean z10) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_DOCUMENT_TYPE", documentType.c());
            bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", z10);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13983a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f13983a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f13983a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f13984a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f13984a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f13985a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f13985a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f13985a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13986a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f13987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f13986a = interfaceC0635a;
            this.f13987b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f13986a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f13987b.getValue();
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
            return new com.sumsub.sns.internal.camera.photo.presentation.selfie.b(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "rootView", "getRootView()Landroid/view/View;", 0);
        i iVar = h.f23186a;
        f13965G = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "takePictureProgressView", "getTakePictureProgressView()Landroid/view/View;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "takePictureViewContainer", "getTakePictureViewContainer()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "toolbar", "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "progressBar", "getProgressBar()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.camera.photo.presentation.selfie.a.class), new d(b9), gVar, new e(null, b9));
        int i = R$id.sns_picker_progress;
        this.rootView = a0.a(this, i);
        this.takePictureProgressView = a0.a(this, R$id.sns_primary_button_progress);
        this.takePictureViewContainer = a0.a(this, R$id.sns_primary_button);
        this.takeGalleryView = a0.a(this, R$id.sns_gallery);
        this.toolbar = a0.a(this, R$id.sns_toolbar);
        this.progressBar = a0.a(this, i);
        this.helperView = a0.a(this, R$id.sns_helper);
        this.helperTitle = a0.a(this, R$id.sns_helper_title);
        this.helperBrief = a0.a(this, R$id.sns_helper_brief);
        this.helperDetails = a0.a(this, R$id.sns_helper_details);
        this.helperDetailsFrame = a0.a(this, R$id.sns_helper_details_frame);
        this.darkOverlay = a0.a(this, R$id.sns_dark_overlay);
        this.previewView = a0.a(this, R$id.sns_camera_preview);
        this.screen = com.sumsub.sns.core.presentation.c.f14171a.a(this);
        this.isFrontFacingCamera = true;
    }

    @Override // com.sumsub.sns.camera.a
    public View A() {
        View B10 = B();
        if (B10 != null) {
            return B10.findViewById(R$id.sns_button);
        }
        return null;
    }

    @Override // com.sumsub.sns.camera.a
    public View B() {
        return this.takePictureViewContainer.a(this, f13965G[2]);
    }

    @Override // com.sumsub.sns.camera.a
    public SNSToolbarView C() {
        return (SNSToolbarView) this.toolbar.a(this, f13965G[4]);
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: E, reason: from getter */
    public boolean getIsFrontFacingCamera() {
        return this.isFrontFacingCamera;
    }

    @Override // com.sumsub.sns.camera.b
    public View J() {
        return this.takeGalleryView.a(this, f13965G[3]);
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public ViewGroup s() {
        return (ViewGroup) this.helperView.a(this, f13965G[6]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.camera.photo.presentation.selfie.a getViewModel() {
        return (com.sumsub.sns.internal.camera.photo.presentation.selfie.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().u().c();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_document_picker;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.camera.a
    public View m() {
        return this.darkOverlay.a(this, f13965G[11]);
    }

    @Override // com.sumsub.sns.camera.a
    public TextView o() {
        return (TextView) this.helperBrief.a(this, f13965G[8]);
    }

    @Override // com.sumsub.sns.camera.a
    public TextView p() {
        return (TextView) this.helperDetails.a(this, f13965G[9]);
    }

    @Override // com.sumsub.sns.camera.a
    public TextView r() {
        return (TextView) this.helperTitle.a(this, f13965G[7]);
    }

    @Override // com.sumsub.sns.camera.a
    public PreviewView v() {
        return (PreviewView) this.previewView.a(this, f13965G[12]);
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: y, reason: from getter */
    public boolean getShouldShowFlash() {
        return this.shouldShowFlash;
    }

    @Override // com.sumsub.sns.camera.a
    public View z() {
        return this.takePictureProgressView.a(this, f13965G[1]);
    }
}

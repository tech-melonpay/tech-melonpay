package com.sumsub.sns.core.presentation.screen.imageviewer;

import O9.f;
import O9.p;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.presentation.screen.imageviewer.a;
import ia.InterfaceC0840h;
import java.io.File;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0019R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\"R\u001b\u0010+\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/sumsub/sns/core/presentation/screen/imageviewer/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/core/presentation/screen/imageviewer/a$b;", "Lcom/sumsub/sns/internal/core/presentation/screen/imageviewer/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "state", "a", "(Lcom/sumsub/sns/internal/core/presentation/screen/imageviewer/a$b;Landroid/os/Bundle;)V", "onDestroyView", "rotation", "(Ljava/lang/Integer;)V", "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", "Lcom/sumsub/sns/internal/core/common/z;", "k", "()Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", "imageView", "Landroid/widget/ImageButton;", "b", "m", "()Landroid/widget/ImageButton;", "rotateCw", "c", "l", "rotateCcw", "d", "LO9/f;", "n", "()Lcom/sumsub/sns/internal/core/presentation/screen/imageviewer/a;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "e", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "f", "I", "navigationBarColor", "g", "statusBarColor", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "h", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<a.b, com.sumsub.sns.internal.core.presentation.screen.imageviewer.a> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;
    public static final /* synthetic */ InterfaceC0840h<Object>[] i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z imageView = a0.a(this, R$id.image_view);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z rotateCw = a0.a(this, R$id.sns_rotate_cw);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z rotateCcw = a0.a(this, R$id.sns_rotate_ccw);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int navigationBarColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int statusBarColor;

    /* renamed from: com.sumsub.sns.core.presentation.screen.imageviewer.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(File file, int i, String str) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("file", file);
            bundle.putInt("rotation", i);
            bundle.putString("arg_iddocsettype", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f14285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f14285a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f14285a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f14286a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f14286a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f14287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f14287a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f14287a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14288a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f14289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f14288a = interfaceC0635a;
            this.f14289b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f14288a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f14289b.getValue();
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
            return new com.sumsub.sns.internal.core.presentation.screen.imageviewer.b(aVar, aVar.getArguments(), a.this.getServiceLocator());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "imageView", "getImageView()Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", 0);
        i iVar = h.f23186a;
        i = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "rotateCw", "getRotateCw()Landroid/widget/ImageButton;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "rotateCcw", "getRotateCcw()Landroid/widget/ImageButton;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.core.presentation.screen.imageviewer.a.class), new d(b9), gVar, new e(null, b9));
        this.screen = Screen.ImageViewer;
    }

    public static final void b(a aVar, View view) {
        SNSRotationZoomableImageView k3 = aVar.k();
        if (k3 != null) {
            k3.rotateCCW();
        }
        SNSRotationZoomableImageView k10 = aVar.k();
        aVar.a(k10 != null ? Integer.valueOf(k10.getRotation()) : null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().r();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_layout_image_viewer;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    public final SNSRotationZoomableImageView k() {
        return (SNSRotationZoomableImageView) this.imageView.a(this, i[0]);
    }

    public final ImageButton l() {
        return (ImageButton) this.rotateCcw.a(this, i[2]);
    }

    public final ImageButton m() {
        return (ImageButton) this.rotateCw.a(this, i[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.core.presentation.screen.imageviewer.a getViewModel() {
        return (com.sumsub.sns.internal.core.presentation.screen.imageviewer.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Window window;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.navigationBarColor = savedInstanceState.getInt("nav_bar_color");
            this.statusBarColor = savedInstanceState.getInt("status_bar_color");
            return;
        }
        ActivityC0533g activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        this.statusBarColor = window.getStatusBarColor();
        this.navigationBarColor = window.getNavigationBarColor();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        ActivityC0533g activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(this.statusBarColor);
        window.setNavigationBarColor(this.navigationBarColor);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("nav_bar_color", this.navigationBarColor);
        outState.putInt("status_bar_color", this.statusBarColor);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundColor(this.statusBarColor);
        ImageButton m2 = m();
        if (m2 != null) {
            final int i9 = 0;
            m2.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.core.presentation.screen.imageviewer.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f14292b;

                {
                    this.f14292b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            a.a(this.f14292b, view2);
                            break;
                        default:
                            a.b(this.f14292b, view2);
                            break;
                    }
                }
            });
        }
        ImageButton l10 = l();
        if (l10 != null) {
            final int i10 = 1;
            l10.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.core.presentation.screen.imageviewer.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f14292b;

                {
                    this.f14292b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            a.a(this.f14292b, view2);
                            break;
                        default:
                            a.b(this.f14292b, view2);
                            break;
                    }
                }
            });
        }
        com.sumsub.sns.core.presentation.b.setResult$default(this, getViewModel().s(), null, 2, null);
    }

    public static final void a(a aVar, View view) {
        SNSRotationZoomableImageView k3 = aVar.k();
        if (k3 != null) {
            k3.rotateCW();
        }
        SNSRotationZoomableImageView k10 = aVar.k();
        aVar.a(k10 != null ? Integer.valueOf(k10.getRotation()) : null);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(a.b state, Bundle savedInstanceState) {
        SNSRotationZoomableImageView k3 = k();
        if (k3 != null) {
            k3.setImageBitmapWithRotation(state.d(), state.f());
        }
    }

    public final void a(Integer rotation) {
        if (rotation != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("rotation", rotation.intValue());
            bundle.putSerializable("file", getViewModel().p());
            p pVar = p.f3034a;
            com.sumsub.sns.core.presentation.b.setResult$default(this, 0, bundle, 1, null);
        }
    }
}

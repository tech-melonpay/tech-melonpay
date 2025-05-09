package com.sumsub.sns.presentation.screen.preview.selfie;

import O9.f;
import R0.a;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.camera.video.presentation.a;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.screen.preview.selfie.a;
import ia.InterfaceC0840h;
import java.io.File;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0005R!\u0010'\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b&\u0010\u0005\u001a\u0004\b$\u0010%R\u001d\u0010-\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u00105R\u001d\u0010>\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b@\u0010=R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/selfie/a;", "Lcom/sumsub/sns/presentation/screen/preview/a;", "Lcom/sumsub/sns/internal/presentation/screen/preview/selfie/a$d;", "Lcom/sumsub/sns/internal/presentation/screen/preview/selfie/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "state", "a", "(Lcom/sumsub/sns/internal/presentation/screen/preview/selfie/a$d;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "", "hideLogo", "updatePoweredByVisibility", "(Z)V", "onStop", "Ljava/io/File;", "file", "c", "(Ljava/io/File;)V", "s", "LO9/f;", "q", "()Lcom/sumsub/sns/internal/presentation/screen/preview/selfie/a;", "getViewModel$annotations", "viewModel", "Landroidx/constraintlayout/widget/Group;", "b", "Lcom/sumsub/sns/internal/core/common/z;", "m", "()Landroidx/constraintlayout/widget/Group;", "gContent", "Landroid/widget/VideoView;", "n", "()Landroid/widget/VideoView;", "playerView", "Landroid/widget/TextView;", "d", "p", "()Landroid/widget/TextView;", "tvTitle", "e", "o", "tvSubtitle", "Landroid/widget/Button;", "f", "k", "()Landroid/widget/Button;", "btnReadableVideo", "g", "l", "btnTakeAnotherVideo", "Landroid/widget/MediaController;", "h", "Landroid/widget/MediaController;", "mediaController", "i", "Ljava/io/File;", "videoFile", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "showControlsCallback", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.presentation.screen.preview.a<a.d, com.sumsub.sns.internal.presentation.screen.preview.selfie.a> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20128l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z gContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z playerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z btnReadableVideo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z btnTakeAnotherVideo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public MediaController mediaController;

    /* renamed from: i, reason: from kotlin metadata */
    public File videoFile;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Runnable showControlsCallback;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.selfie.a$a, reason: collision with other inner class name and from kotlin metadata */
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

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20138a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20138a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20139a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20139a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20139a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f20140a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f20140a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20140a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20141a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f20142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, f fVar) {
            super(0);
            this.f20141a = interfaceC0635a;
            this.f20142b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20141a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20142b.getValue();
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
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.preview.selfie.b(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0);
        i iVar = h.f23186a;
        f20128l = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "playerView", "getPlayerView()Landroid/widget/VideoView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "btnReadableVideo", "getBtnReadableVideo()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "btnTakeAnotherVideo", "getBtnTakeAnotherVideo()Landroid/widget/Button;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        g gVar = new g();
        f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.preview.selfie.a.class), new d(b9), gVar, new e(null, b9));
        this.gContent = a0.a(this, R$id.sns_content);
        this.playerView = a0.a(this, R$id.sns_player);
        this.tvTitle = a0.a(this, R$id.sns_title);
        this.tvSubtitle = a0.a(this, R$id.sns_subtitle);
        this.btnReadableVideo = a0.a(this, R$id.sns_primary_button);
        this.btnTakeAnotherVideo = a0.a(this, R$id.sns_secondary_button);
        this.showControlsCallback = new RunnableC0615f(this, 8);
    }

    public static final void b(a aVar) {
        MediaController mediaController = aVar.mediaController;
        if (mediaController != null) {
            mediaController.show(2000);
        }
    }

    public final void c(File file) {
        if (file != null) {
            s();
        }
        if (kotlin.jvm.internal.f.b(this.videoFile, file) || file == null) {
            return;
        }
        this.videoFile = file;
        VideoView n10 = n();
        if (n10 == null) {
            return;
        }
        n10.setVideoPath(file.getAbsolutePath());
        n10.requestFocus();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        DocumentType type;
        String c2;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
        Document document2 = document instanceof Document ? document : null;
        return (document2 == null || (type = document2.getType()) == null || (c2 = type.c()) == null) ? DocumentType.f15253j : c2;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_preview_selfie;
    }

    @Override // com.sumsub.sns.presentation.screen.preview.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "handleEvent: " + event, null, 4, null);
        super.handleEvent(event);
        if (event instanceof a.b) {
            a.Companion companion = com.sumsub.sns.camera.video.presentation.a.INSTANCE;
            a.b bVar = (a.b) event;
            String c2 = bVar.b().c();
            String d10 = bVar.b().d();
            if (d10 == null) {
                d10 = "";
            }
            navigateTo(companion.a(c2, d10).forResult("video_selfie"), com.sumsub.sns.internal.log.c.a(companion));
        }
    }

    public final Button k() {
        return (Button) this.btnReadableVideo.a(this, f20128l[4]);
    }

    public final Button l() {
        return (Button) this.btnTakeAnotherVideo.a(this, f20128l[5]);
    }

    public final Group m() {
        return (Group) this.gContent.a(this, f20128l[0]);
    }

    public final VideoView n() {
        return (VideoView) this.playerView.a(this, f20128l[1]);
    }

    public final TextView o() {
        return (TextView) this.tvSubtitle.a(this, f20128l[3]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getSupportFragmentManager().g0("video_selfie", this, new com.sumsub.sns.geo.presentation.d(this, 8));
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "onStop", null, 4, null);
        s();
        VideoView n10 = n();
        if (n10 != null) {
            n10.removeCallbacks(this.showControlsCallback);
        }
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button k3 = k();
        if (k3 != null) {
            final int i = 0;
            k3.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.selfie.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f20145b;

                {
                    this.f20145b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            a.a(this.f20145b, view2);
                            break;
                        default:
                            a.b(this.f20145b, view2);
                            break;
                    }
                }
            });
        }
        Button l10 = l();
        if (l10 != null) {
            final int i9 = 1;
            l10.setOnClickListener(new View.OnClickListener(this) { // from class: com.sumsub.sns.presentation.screen.preview.selfie.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f20145b;

                {
                    this.f20145b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            a.a(this.f20145b, view2);
                            break;
                        default:
                            a.b(this.f20145b, view2);
                            break;
                    }
                }
            });
        }
        VideoView n10 = n();
        if (n10 != null) {
            MediaController mediaController = new MediaController(requireContext());
            this.mediaController = mediaController;
            n10.setMediaController(mediaController);
            n10.setOnCompletionListener(new com.sumsub.sns.presentation.screen.preview.selfie.c());
            n10.setOnPreparedListener(new com.sumsub.sns.presentation.screen.preview.selfie.d());
            n10.setOnErrorListener(new com.sumsub.sns.presentation.screen.preview.selfie.e());
            n10.post(this.showControlsCallback);
        }
    }

    public final TextView p() {
        return (TextView) this.tvTitle.a(this, f20128l[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.selfie.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.selfie.a) this.viewModel.getValue();
    }

    public final void s() {
        VideoView n10 = n();
        if (n10 == null) {
            return;
        }
        if (n10.isPlaying() || this.videoFile != null) {
            com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "stopPlayback", null, 4, null);
            this.videoFile = null;
            n10.stopPlayback();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void updatePoweredByVisibility(boolean hideLogo) {
        View findViewById = requireView().findViewById(R$id.sns_powered);
        if (findViewById != null) {
            com.sumsub.sns.internal.core.common.i.a(findViewById, hideLogo);
        }
    }

    public static final void a(a aVar, String str, Bundle bundle) {
        String string = bundle.getString("EXTRA_FILE");
        aVar.getViewModel().a((string == null || string.length() == 0) ? null : new File(string), bundle.getString("EXTRA_PHRASE"));
    }

    public static final void b(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.RetakeButton, null, 8, null);
        aVar.s();
        aVar.getViewModel().y();
    }

    public static final void a(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.AcceptButton, null, 8, null);
        aVar.s();
        aVar.getViewModel().x();
    }

    public static final void b(MediaPlayer mediaPlayer) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "player prepared: " + mediaPlayer, null, 4, null);
        mediaPlayer.setLooping(true);
    }

    public static final void a(MediaPlayer mediaPlayer) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "playback completed: " + mediaPlayer, null, 4, null);
    }

    public static final boolean a(MediaPlayer mediaPlayer, int i, int i9) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "player error: " + mediaPlayer + ", what=" + i + ", extra=" + i9, null, 4, null);
        return true;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(a.d state, Bundle savedInstanceState) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "handleState: " + state, null, 4, null);
        TextView p10 = p();
        if (p10 != null) {
            com.sumsub.sns.internal.core.common.i.a(p10, state.k());
        }
        TextView o10 = o();
        if (o10 != null) {
            com.sumsub.sns.internal.core.common.i.a(o10, state.j());
        }
        Button k3 = k();
        if (k3 != null) {
            com.sumsub.sns.internal.core.common.i.a(k3, state.h());
        }
        Button l10 = l();
        if (l10 != null) {
            com.sumsub.sns.internal.core.common.i.a(l10, state.g());
        }
        Group m2 = m();
        if (m2 != null) {
            m2.setVisibility(state.i() ? 0 : 8);
        }
        updatePoweredByVisibility(getViewModel().o());
        if (!state.i() || state.l() == null) {
            s();
        }
        c(state.l());
    }
}

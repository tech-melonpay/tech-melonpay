package com.sumsub.sns.internal.core.domain.camera;

import B.g;
import C.C0487c;
import C.C0488d;
import C.C0493i;
import C.C0495k;
import C.D;
import C.o;
import C.r;
import C.v;
import C.y;
import O9.p;
import a3.InterfaceFutureC0509a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.Keep;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExposureState;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.video.Recorder;
import androidx.camera.video.c;
import androidx.camera.video.f;
import androidx.camera.video.h;
import androidx.camera.video.m;
import androidx.camera.video.n;
import androidx.camera.video.q;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0557x;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.common.e0;
import java.io.File;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import pa.C1124b;

/* loaded from: classes2.dex */
public final class CameraX {

    /* renamed from: t, reason: collision with root package name */
    public static final a f16340t = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Mode f16341a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16342b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraSelector f16343c;

    /* renamed from: d, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.camera.a f16344d;

    /* renamed from: e, reason: collision with root package name */
    public ExecutorService f16345e;

    /* renamed from: f, reason: collision with root package name */
    public CoroutineDispatcher f16346f;

    /* renamed from: g, reason: collision with root package name */
    public CoroutineScope f16347g;

    /* renamed from: h, reason: collision with root package name */
    public n<Recorder> f16348h;
    public m i;

    /* renamed from: j, reason: collision with root package name */
    public ImageCapture f16349j;

    /* renamed from: k, reason: collision with root package name */
    public ImageAnalysis f16350k;

    /* renamed from: l, reason: collision with root package name */
    public Preview f16351l;

    /* renamed from: m, reason: collision with root package name */
    public Camera f16352m;

    /* renamed from: n, reason: collision with root package name */
    public g f16353n;

    /* renamed from: o, reason: collision with root package name */
    public PreviewView.StreamState f16354o;

    /* renamed from: p, reason: collision with root package name */
    public File f16355p;

    /* renamed from: q, reason: collision with root package name */
    public PreviewView f16356q;

    /* renamed from: r, reason: collision with root package name */
    public final A<PreviewView.StreamState> f16357r;

    /* renamed from: s, reason: collision with root package name */
    public final ResolutionSelector f16358s;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "", "(Ljava/lang/String;I)V", "VIDEO", "PHOTO", "ANALYZER", "PHOTO_AND_ANALYZER", "SEAMLESS_DOC_CAPTURE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Mode {
        VIDEO,
        PHOTO,
        ANALYZER,
        PHOTO_AND_ANALYZER,
        SEAMLESS_DOC_CAPTURE
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16359a;

        /* renamed from: b, reason: collision with root package name */
        public final o f16360b;

        /* renamed from: c, reason: collision with root package name */
        public final o f16361c;

        /* renamed from: d, reason: collision with root package name */
        public final long f16362d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16363e;

        public b() {
            this(0, null, null, 0L, 0L, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16359a == bVar.f16359a && kotlin.jvm.internal.f.b(this.f16360b, bVar.f16360b) && kotlin.jvm.internal.f.b(this.f16361c, bVar.f16361c) && this.f16362d == bVar.f16362d && this.f16363e == bVar.f16363e;
        }

        public final int f() {
            return this.f16359a;
        }

        public final long g() {
            return this.f16362d;
        }

        public final o h() {
            return this.f16361c;
        }

        public int hashCode() {
            return Long.hashCode(this.f16363e) + v.e(this.f16362d, (this.f16361c.hashCode() + ((this.f16360b.hashCode() + (Integer.hashCode(this.f16359a) * 31)) * 31)) * 31, 31);
        }

        public final long i() {
            return this.f16363e;
        }

        public final o j() {
            return this.f16360b;
        }

        public String toString() {
            return "VideoParams(bitRate=" + this.f16359a + ", quality=" + this.f16360b + ", fallbackQuality=" + this.f16361c + ", durationLimitMs=" + this.f16362d + ", fileSizeLimitBytes=" + this.f16363e + ')';
        }

        public b(int i, o oVar, o oVar2, long j10, long j11) {
            this.f16359a = i;
            this.f16360b = oVar;
            this.f16361c = oVar2;
            this.f16362d = j10;
            this.f16363e = j11;
        }

        public /* synthetic */ b(int i, o oVar, o oVar2, long j10, long j11, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? o.f561b : oVar, (i9 & 4) != 0 ? o.f560a : oVar2, (i9 & 8) != 0 ? 0L : j10, (i9 & 16) == 0 ? j11 : 0L);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f16364a;

        /* renamed from: b, reason: collision with root package name */
        public final a f16365b;

        public static abstract class a {

            /* renamed from: com.sumsub.sns.internal.core.domain.camera.CameraX$c$a$a, reason: collision with other inner class name */
            public static final class C0238a extends a {

                /* renamed from: a, reason: collision with root package name */
                public final int f16366a;

                /* renamed from: b, reason: collision with root package name */
                public final Throwable f16367b;

                public C0238a(int i, Throwable th) {
                    super(null);
                    this.f16366a = i;
                    this.f16367b = th;
                }

                public final Throwable c() {
                    return this.f16367b;
                }

                public final int d() {
                    return this.f16366a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0238a)) {
                        return false;
                    }
                    C0238a c0238a = (C0238a) obj;
                    return this.f16366a == c0238a.f16366a && kotlin.jvm.internal.f.b(this.f16367b, c0238a.f16367b);
                }

                public int hashCode() {
                    int hashCode = Integer.hashCode(this.f16366a) * 31;
                    Throwable th = this.f16367b;
                    return hashCode + (th == null ? 0 : th.hashCode());
                }

                public String toString() {
                    return "Error(code=" + this.f16366a + ", cause=" + this.f16367b + ')';
                }
            }

            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                public final int f16368a;

                /* renamed from: b, reason: collision with root package name */
                public final long f16369b;

                public b(int i, long j10) {
                    super(null);
                    this.f16368a = i;
                    this.f16369b = j10;
                }

                public final int c() {
                    return this.f16368a;
                }

                public final long d() {
                    return this.f16369b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f16368a == bVar.f16368a && this.f16369b == bVar.f16369b;
                }

                public int hashCode() {
                    return Long.hashCode(this.f16369b) + (Integer.hashCode(this.f16368a) * 31);
                }

                public String toString() {
                    return "Ok(durationsSec=" + this.f16368a + ", fileSizeBytes=" + this.f16369b + ')';
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public c(File file, a aVar) {
            this.f16364a = file;
            this.f16365b = aVar;
        }

        public final File c() {
            return this.f16364a;
        }

        public final a d() {
            return this.f16365b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f16364a, cVar.f16364a) && kotlin.jvm.internal.f.b(this.f16365b, cVar.f16365b);
        }

        public int hashCode() {
            return this.f16365b.hashCode() + (this.f16364a.hashCode() * 31);
        }

        public String toString() {
            return "VideoRecordingResult(file=" + this.f16364a + ", status=" + this.f16365b + ')';
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16370a;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.PHOTO.ordinal()] = 1;
            iArr[Mode.VIDEO.ordinal()] = 2;
            iArr[Mode.ANALYZER.ordinal()] = 3;
            iArr[Mode.PHOTO_AND_ANALYZER.ordinal()] = 4;
            iArr[Mode.SEAMLESS_DOC_CAPTURE.ordinal()] = 5;
            f16370a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.domain.camera.CameraX$buildImageAnalysisUseCase$1$1$1", f = "CameraX.kt", l = {365}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16371a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageProxy f16373c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageProxy imageProxy, T9.a<? super e> aVar) {
            super(2, aVar);
            this.f16373c = imageProxy;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((e) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return CameraX.this.new e(this.f16373c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16371a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.domain.camera.a aVar = CameraX.this.f16344d;
                if (aVar != null) {
                    ImageProxy imageProxy = this.f16373c;
                    com.sumsub.sns.internal.core.domain.camera.c f10 = CameraX.this.f();
                    this.f16371a = 1;
                    if (aVar.a(imageProxy, f10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    public static final class f implements ImageCapture.OnImageSavedCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f16375b;

        public f(File file) {
            this.f16375b = file;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException imageCaptureException) {
            com.sumsub.sns.internal.core.domain.camera.b.a("CameraX", "Photo capture failed: " + imageCaptureException.getMessage(), imageCaptureException);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            com.sumsub.sns.internal.core.domain.camera.a aVar = CameraX.this.f16344d;
            if (aVar != null) {
                aVar.a(this.f16375b);
            }
        }
    }

    public CameraX(Mode mode, Size size, b bVar, CameraSelector cameraSelector, com.sumsub.sns.internal.core.domain.camera.a aVar) {
        this.f16341a = mode;
        this.f16342b = bVar;
        this.f16343c = cameraSelector;
        this.f16344d = aVar;
        this.f16357r = new U1.b(this, 4);
        this.f16358s = new ResolutionSelector.Builder().setResolutionStrategy(new ResolutionStrategy(size, 1)).setAspectRatioStrategy(new AspectRatioStrategy(1, 1)).build();
    }

    public final void b() {
        this.f16349j = new ImageCapture.Builder().setResolutionSelector(this.f16358s).build();
    }

    public final UseCaseGroup c() {
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        int i = d.f16370a[this.f16341a.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            d();
        } else if (i == 3) {
            a();
        } else if (i == 4) {
            b();
            a();
        } else if (i == 5) {
            d();
            a();
        }
        ImageCapture imageCapture = this.f16349j;
        if (imageCapture != null) {
            builder.addUseCase(imageCapture);
        }
        n<Recorder> nVar = this.f16348h;
        if (nVar != null) {
            builder.addUseCase(nVar);
        }
        ImageAnalysis imageAnalysis = this.f16350k;
        if (imageAnalysis != null) {
            builder.addUseCase(imageAnalysis);
        }
        Preview build = new Preview.Builder().setResolutionSelector(this.f16358s).build();
        PreviewView previewView = this.f16356q;
        build.setSurfaceProvider(previewView != null ? previewView.getSurfaceProvider() : null);
        builder.addUseCase(build);
        this.f16351l = build;
        return builder.build();
    }

    public final void d() {
        o j10 = this.f16342b.j();
        o h9 = this.f16342b.h();
        C0487c c0487c = C0493i.f557a;
        C0487c c0487c2 = new C0487c(h9, 1);
        C1124b.p(j10, "quality cannot be null");
        C1124b.m(o.f567h.contains(j10), "Invalid quality: " + j10);
        r rVar = new r(Collections.singletonList(j10), c0487c2);
        v vVar = Recorder.f5460h0;
        c.a a10 = androidx.camera.video.g.a();
        androidx.camera.video.r rVar2 = a10.f5586a;
        if (rVar2 == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        f.a f10 = rVar2.f();
        f10.d(rVar);
        a10.b(f10.a());
        if (this.f16342b.f() > 0) {
            com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "using " + this.f16342b.f() + " videoBitRate", null, 4, null);
            int f11 = this.f16342b.f();
            if (f11 <= 0) {
                throw new IllegalArgumentException(s3.b.i("The requested target bitrate ", f11, " is not supported. Target bitrate must be greater than 0."));
            }
            androidx.camera.video.r rVar3 = a10.f5586a;
            if (rVar3 == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            f.a f12 = rVar3.f();
            f12.c(new Range(Integer.valueOf(f11), Integer.valueOf(f11)));
            a10.b(f12.a());
        }
        Recorder recorder = new Recorder(a10.a(), vVar, vVar);
        n.c cVar = n.f5775n;
        n.b bVar = new n.b(recorder);
        UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        Config.Option<UseCaseConfigFactory.CaptureType> option = UseCaseConfig.OPTION_CAPTURE_TYPE;
        MutableOptionsBundle mutableOptionsBundle = bVar.f5791a;
        mutableOptionsBundle.insertOption(option, captureType);
        this.f16348h = new n<>(new D.a(OptionsBundle.from(mutableOptionsBundle)));
    }

    public final Context e() {
        PreviewView previewView = this.f16356q;
        if (previewView != null) {
            return previewView.getContext();
        }
        return null;
    }

    public final com.sumsub.sns.internal.core.domain.camera.c f() {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        CameraInfo cameraInfo2;
        ExposureState exposureState2;
        CameraInfo cameraInfo3;
        ExposureState exposureState3;
        Camera camera = this.f16352m;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || !exposureState.isExposureCompensationSupported()) {
            return new com.sumsub.sns.internal.core.domain.camera.c(0.0f, 0.0f, 0.0f, 7, null);
        }
        Camera camera2 = this.f16352m;
        Integer num = null;
        Range<Integer> exposureCompensationRange = (camera2 == null || (cameraInfo3 = camera2.getCameraInfo()) == null || (exposureState3 = cameraInfo3.getExposureState()) == null) ? null : exposureState3.getExposureCompensationRange();
        Integer lower = exposureCompensationRange != null ? exposureCompensationRange.getLower() : null;
        int intValue = lower == null ? 0 : lower.intValue();
        Integer upper = exposureCompensationRange != null ? exposureCompensationRange.getUpper() : null;
        int intValue2 = upper == null ? 0 : upper.intValue();
        Camera camera3 = this.f16352m;
        if (camera3 != null && (cameraInfo2 = camera3.getCameraInfo()) != null && (exposureState2 = cameraInfo2.getExposureState()) != null) {
            num = Integer.valueOf(exposureState2.getExposureCompensationIndex());
        }
        return new com.sumsub.sns.internal.core.domain.camera.c(a(num != null ? num.intValue() : 0), a(intValue), a(intValue2));
    }

    public final void g() {
        AbstractC0557x<PreviewView.StreamState> previewStreamState;
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "On destroy", null, 4, null);
        this.f16354o = null;
        ImageAnalysis imageAnalysis = this.f16350k;
        if (imageAnalysis != null) {
            imageAnalysis.clearAnalyzer();
        }
        ExecutorService executorService = this.f16345e;
        if (executorService != null) {
            executorService.shutdown();
        }
        h();
        g gVar = this.f16353n;
        if (gVar != null) {
            gVar.b();
        }
        this.f16353n = null;
        Preview preview = this.f16351l;
        if (preview != null) {
            preview.setSurfaceProvider(null);
        }
        this.f16351l = null;
        PreviewView previewView = this.f16356q;
        if (previewView != null && (previewStreamState = previewView.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.f16357r);
        }
        this.f16356q = null;
        this.f16352m = null;
        CoroutineScope coroutineScope = this.f16347g;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
    }

    public final void h() {
        if (this.i == null) {
            return;
        }
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Stop video recording", null, 4, null);
        m mVar = this.i;
        if (mVar != null) {
            mVar.close();
        }
        m mVar2 = this.i;
        if (mVar2 != null) {
            mVar2.close();
        }
        this.i = null;
    }

    public static final void a(CameraX cameraX, PreviewView.StreamState streamState) {
        com.sumsub.sns.internal.core.domain.camera.a aVar;
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Stream state changed: " + streamState, null, 4, null);
        if (cameraX.f16354o != streamState) {
            if (streamState == PreviewView.StreamState.f5828b && (aVar = cameraX.f16344d) != null) {
                aVar.c();
            }
            cameraX.f16354o = streamState;
        }
    }

    public final void a(androidx.lifecycle.r rVar, PreviewView previewView) {
        ExecutorCoroutineDispatcher executorCoroutineDispatcher;
        CallbackToFutureAdapter.c cVar;
        AbstractC0557x<PreviewView.StreamState> previewStreamState;
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "start: cameraFront=" + kotlin.jvm.internal.f.b(this.f16343c, CameraSelector.DEFAULT_FRONT_CAMERA), null, 4, null);
        if (previewView == null) {
            return;
        }
        PreviewView previewView2 = this.f16356q;
        if (previewView == previewView2) {
            com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "start: skipping", null, 4, null);
            return;
        }
        if (previewView2 != null && (previewStreamState = previewView2.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.f16357r);
        }
        this.f16356q = previewView;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f16345e = newSingleThreadExecutor;
        if (newSingleThreadExecutor == null || (executorCoroutineDispatcher = ExecutorsKt.from(newSingleThreadExecutor)) == null) {
            executorCoroutineDispatcher = null;
        } else {
            this.f16347g = CoroutineScopeKt.CoroutineScope(executorCoroutineDispatcher);
        }
        this.f16346f = executorCoroutineDispatcher;
        previewView.getPreviewStreamState().observe(rVar, this.f16357r);
        Context context = previewView.getContext();
        g gVar = g.f182g;
        context.getClass();
        g gVar2 = g.f182g;
        synchronized (gVar2.f183a) {
            try {
                cVar = gVar2.f184b;
                if (cVar == null) {
                    cVar = CallbackToFutureAdapter.a(new B.e(0, gVar2, new androidx.camera.core.CameraX(context, null)));
                    gVar2.f184b = cVar;
                }
            } finally {
            }
        }
        InterfaceFutureC0509a transform = Futures.transform(cVar, new B.d(context, 0), CameraXExecutors.directExecutor());
        transform.addListener(new y(transform, this, rVar, 16), C0913a.getMainExecutor(previewView.getContext()));
    }

    public /* synthetic */ CameraX(Mode mode, Size size, b bVar, CameraSelector cameraSelector, com.sumsub.sns.internal.core.domain.camera.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i & 2) != 0 ? new Size(1920, 1080) : size, (i & 4) != 0 ? new b(0, null, null, 0L, 0L, 31, null) : bVar, (i & 8) != 0 ? CameraSelector.DEFAULT_BACK_CAMERA : cameraSelector, (i & 16) != 0 ? null : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceFutureC0509a interfaceFutureC0509a, CameraX cameraX, androidx.lifecycle.r rVar) {
        try {
            g gVar = (g) interfaceFutureC0509a.get();
            gVar.b();
            cameraX.f16352m = gVar.a(cameraX.f16343c, cameraX.c(), rVar);
            cameraX.f16353n = gVar;
        } catch (Exception e10) {
            com.sumsub.sns.internal.core.domain.camera.a aVar = cameraX.f16344d;
            if (aVar != null) {
                aVar.onError(e10);
            }
            com.sumsub.sns.internal.core.domain.camera.b.a("CameraX", "Init camera failed", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r5 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 4
            java.lang.String r1 = "CameraX"
            java.lang.String r2 = "Take picture"
            r3 = 0
            com.sumsub.sns.internal.core.domain.camera.b.b(r1, r2, r3, r0, r3)
            androidx.camera.core.ImageCapture r0 = r4.f16349j
            if (r0 != 0) goto Le
            return
        Le:
            android.content.Context r1 = r4.e()
            if (r1 == 0) goto L18
            java.io.File r3 = r1.getCacheDir()
        L18:
            java.lang.String r1 = ".jpg"
            if (r5 == 0) goto L30
            java.lang.StringBuilder r5 = C.v.s(r5)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            r5.append(r2)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L43
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.UUID r2 = java.util.UUID.randomUUID()
            r5.append(r2)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
        L43:
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r5)
            androidx.camera.core.ImageCapture$OutputFileOptions$Builder r5 = new androidx.camera.core.ImageCapture$OutputFileOptions$Builder
            r5.<init>(r1)
            androidx.camera.core.ImageCapture$OutputFileOptions r5 = r5.build()
            android.content.Context r2 = r4.e()
            if (r2 != 0) goto L58
            return
        L58:
            java.util.concurrent.Executor r2 = k0.C0913a.getMainExecutor(r2)
            com.sumsub.sns.internal.core.domain.camera.CameraX$f r3 = new com.sumsub.sns.internal.core.domain.camera.CameraX$f
            r3.<init>(r1)
            r0.lambda$takePicture$2(r5, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.camera.CameraX.a(java.lang.String):void");
    }

    @SuppressLint({"MissingPermission"})
    public final void a(File file) {
        Context e10;
        if (e0.f15081a.isDebug() && this.i != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        n<Recorder> nVar = this.f16348h;
        if (nVar == null || (e10 = e()) == null) {
            return;
        }
        if (file == null) {
            file = new File(e10.getCacheDir(), UUID.randomUUID().toString() + ".mp4");
        }
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Take video snapshot and save to " + file.getName(), null, 4, null);
        C0488d.a aVar = new C0488d.a();
        aVar.c(0L);
        aVar.b(0L);
        aVar.f548c = file;
        if (this.f16342b.i() > 0) {
            long i = this.f16342b.i();
            C1124b.m(i >= 0, "The specified file size limit can't be negative.");
            aVar.c(i);
        }
        if (this.f16342b.g() > 0) {
            long g10 = this.f16342b.g();
            C1124b.m(g10 >= 0, "The specified duration limit can't be negative.");
            aVar.b(g10);
        }
        C0495k c0495k = new C0495k(aVar.a());
        Recorder f10 = nVar.f();
        f10.getClass();
        h hVar = new h(e10, f10, c0495k);
        if (this.f16341a != Mode.SEAMLESS_DOC_CAPTURE) {
            if (j3.e.f(hVar.f5605a, "android.permission.RECORD_AUDIO") != -1) {
                C1124b.q(((androidx.camera.video.g) Recorder.j(hVar.f5606b.f5462A)).b().c() != 0, "The Recorder this recording is associated to doesn't support audio.");
                hVar.f5610f = true;
            } else {
                throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            }
        }
        this.i = hVar.a(C0913a.getMainExecutor(e10), new androidx.camera.core.internal.a(1, this, file));
        this.f16355p = file;
    }

    public static final void a(CameraX cameraX, File file, q qVar) {
        com.sumsub.sns.internal.core.domain.camera.a aVar;
        boolean z10 = qVar instanceof q.d;
        if (z10 && (aVar = cameraX.f16344d) != null) {
            aVar.b(file);
        }
        if (z10 || (qVar instanceof q.b) || (qVar instanceof q.c) || (qVar instanceof q.a)) {
            Log.v("CameraX", file.getName() + " recording state=" + qVar);
            if (qVar instanceof q.a) {
                cameraX.a((q.a) qVar);
            }
        }
    }

    public final void a(boolean z10) {
        CameraControl cameraControl;
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Enable flash", null, 4, null);
        Camera camera = this.f16352m;
        if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
            cameraControl.enableTorch(z10);
        }
        ImageCapture imageCapture = this.f16349j;
        if (imageCapture == null) {
            return;
        }
        imageCapture.setFlashMode(z10 ? 1 : 2);
    }

    public final void a(float f10) {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        Range<Integer> exposureCompensationRange;
        CameraControl cameraControl;
        CameraInfo cameraInfo2;
        ExposureState exposureState2;
        Rational exposureCompensationStep;
        com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Set exposure " + f10, null, 4, null);
        Camera camera = this.f16352m;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || (exposureCompensationRange = exposureState.getExposureCompensationRange()) == null) {
            return;
        }
        Camera camera2 = this.f16352m;
        float floatValue = (camera2 == null || (cameraInfo2 = camera2.getCameraInfo()) == null || (exposureState2 = cameraInfo2.getExposureState()) == null || (exposureCompensationStep = exposureState2.getExposureCompensationStep()) == null) ? 1.0f : exposureCompensationStep.floatValue();
        Integer lower = exposureCompensationRange.getLower();
        int intValue = lower == null ? 0 : lower.intValue();
        Integer upper = exposureCompensationRange.getUpper();
        int max = Integer.max(Integer.min((int) (f10 / floatValue), upper != null ? upper.intValue() : 0), intValue);
        if (exposureCompensationRange.contains((Range<Integer>) Integer.valueOf(max))) {
            Camera camera3 = this.f16352m;
            if (camera3 == null || (cameraControl = camera3.getCameraControl()) == null) {
                return;
            }
            cameraControl.setExposureCompensationIndex(max);
            return;
        }
        com.sumsub.sns.internal.core.domain.camera.b.a("CameraX", "Set exposure failed, " + f10 + " is out of range " + exposureCompensationRange, null, 4, null);
    }

    public final float a(int i) {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        Rational exposureCompensationStep;
        Camera camera = this.f16352m;
        return ((camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || (exposureCompensationStep = exposureState.getExposureCompensationStep()) == null) ? 0.0f : exposureCompensationStep.floatValue()) * i;
    }

    public final void a() {
        ImageAnalysis build = new ImageAnalysis.Builder().setBackpressureStrategy(0).setTargetRotation(0).setOutputImageFormat(2).setResolutionSelector(this.f16358s).build();
        this.f16350k = build;
        ExecutorService executorService = this.f16345e;
        if (executorService == null || build == null) {
            return;
        }
        build.setAnalyzer(executorService, new com.sumsub.sns.geo.presentation.d(this, 3));
    }

    public static final void a(CameraX cameraX, ImageProxy imageProxy) {
        BuildersKt__BuildersKt.runBlocking$default(null, cameraX.new e(imageProxy, null), 1, null);
    }

    public final void a(q.a aVar) {
        c.a bVar;
        com.sumsub.sns.internal.core.domain.camera.a aVar2;
        if (aVar.f5802c != 0) {
            StringBuilder sb2 = new StringBuilder("handleVideoRecordFinalized: error=");
            int i = aVar.f5802c;
            sb2.append(i);
            com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", sb2.toString(), null, 4, null);
            Throwable th = aVar.f5803d;
            if (th != null) {
                com.sumsub.sns.internal.core.domain.camera.b.b("CameraX", "Video recording finialized with exception", th);
            }
            bVar = new c.a.C0238a(i, th);
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            D d10 = aVar.f5801b;
            bVar = new c.a.b((int) timeUnit.toSeconds(d10.c()), d10.b());
        }
        File file = this.f16355p;
        if (file != null && (aVar2 = this.f16344d) != null) {
            aVar2.a(new c(file, bVar));
        }
        this.f16355p = null;
    }
}

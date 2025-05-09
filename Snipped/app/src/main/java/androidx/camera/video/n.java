package androidx.camera.video;

import C.C0490f;
import C.C0493i;
import C.E;
import C.G;
import C.H;
import C.J;
import C.K;
import H.t;
import J.v;
import J.x;
import a3.InterfaceFutureC0509a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p.InterfaceC1096a;
import pa.C1124b;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class n<T extends VideoOutput> extends UseCase {

    /* renamed from: n, reason: collision with root package name */
    public static final c f5775n = new c();

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f5776o;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f5777p;

    /* renamed from: a, reason: collision with root package name */
    public DeferrableSurface f5778a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceEdge f5779b;

    /* renamed from: c, reason: collision with root package name */
    public StreamInfo f5780c;

    /* renamed from: d, reason: collision with root package name */
    public SessionConfig.Builder f5781d;

    /* renamed from: e, reason: collision with root package name */
    public CallbackToFutureAdapter.c f5782e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceRequest f5783f;

    /* renamed from: g, reason: collision with root package name */
    public VideoOutput.SourceState f5784g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceProcessorNode f5785h;
    public x i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f5786j;

    /* renamed from: k, reason: collision with root package name */
    public int f5787k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5788l;

    /* renamed from: m, reason: collision with root package name */
    public final a f5789m;

    /* compiled from: VideoCapture.java */
    public class a implements Observable.Observer<StreamInfo> {
        public a() {
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            Logger.w("VideoCapture", "Receive onError from StreamState observer", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onNewData(StreamInfo streamInfo) {
            StreamInfo streamInfo2 = streamInfo;
            if (streamInfo2 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            n nVar = n.this;
            if (nVar.f5784g == VideoOutput.SourceState.f5569c) {
                return;
            }
            Logger.d("VideoCapture", "Stream info update: old: " + nVar.f5780c + " new: " + streamInfo2);
            StreamInfo streamInfo3 = nVar.f5780c;
            nVar.f5780c = streamInfo2;
            StreamSpec attachedStreamSpec = nVar.getAttachedStreamSpec();
            attachedStreamSpec.getClass();
            int a10 = streamInfo3.a();
            int a11 = streamInfo2.a();
            Set<Integer> set = StreamInfo.f5544b;
            if ((!set.contains(Integer.valueOf(a10)) && !set.contains(Integer.valueOf(a11)) && a10 != a11) || (nVar.f5788l && streamInfo3.b() != null && streamInfo2.b() == null)) {
                String cameraId = nVar.getCameraId();
                D.a<T> aVar = (D.a) nVar.getCurrentConfig();
                StreamSpec attachedStreamSpec2 = nVar.getAttachedStreamSpec();
                attachedStreamSpec2.getClass();
                nVar.g(cameraId, aVar, attachedStreamSpec2);
                return;
            }
            if ((streamInfo3.a() != -1 && streamInfo2.a() == -1) || (streamInfo3.a() == -1 && streamInfo2.a() != -1)) {
                nVar.c(nVar.f5781d, streamInfo2, attachedStreamSpec);
                nVar.updateSessionConfig(nVar.f5781d.build());
                nVar.notifyReset();
            } else if (streamInfo3.c() != streamInfo2.c()) {
                nVar.c(nVar.f5781d, streamInfo2, attachedStreamSpec);
                nVar.updateSessionConfig(nVar.f5781d.build());
                nVar.notifyUpdated();
            }
        }
    }

    /* compiled from: VideoCapture.java */
    public static final class c implements ConfigProvider<D.a<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final D.a<?> f5792a;

        /* renamed from: b, reason: collision with root package name */
        public static final Range<Integer> f5793b;

        /* renamed from: c, reason: collision with root package name */
        public static final DynamicRange f5794c;

        static {
            J j10 = new J();
            K k3 = new K(0);
            f5793b = new Range<>(30, 30);
            DynamicRange dynamicRange = DynamicRange.SDR;
            f5794c = dynamicRange;
            b bVar = new b(j10);
            Config.Option<Integer> option = UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY;
            MutableOptionsBundle mutableOptionsBundle = bVar.f5791a;
            mutableOptionsBundle.insertOption(option, 5);
            mutableOptionsBundle.insertOption(D.a.f855c, k3);
            mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
            f5792a = new D.a<>(OptionsBundle.from(mutableOptionsBundle));
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public final D.a<?> getConfig() {
            return f5792a;
        }
    }

    static {
        boolean z10;
        Quirks quirks = H.f.f1368a;
        boolean z11 = quirks.get(H.p.class) != null;
        boolean z12 = quirks.get(H.o.class) != null;
        boolean z13 = quirks.get(H.j.class) != null;
        Iterator it = quirks.getAll(t.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((t) it.next()).a()) {
                z10 = true;
                break;
            }
        }
        boolean z14 = H.f.f1368a.get(H.i.class) != null;
        f5777p = z11 || z12 || z13;
        f5776o = z12 || z13 || z10 || z14;
    }

    public n(D.a<T> aVar) {
        super(aVar);
        this.f5780c = StreamInfo.f5543a;
        this.f5781d = new SessionConfig.Builder();
        this.f5782e = null;
        this.f5784g = VideoOutput.SourceState.f5569c;
        this.f5788l = false;
        this.f5789m = new a();
    }

    public static void a(HashSet hashSet, int i, int i9, Size size, x xVar) {
        if (i > size.getWidth() || i9 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, xVar.d(i).clamp(Integer.valueOf(i9)).intValue()));
        } catch (IllegalArgumentException e10) {
            Logger.w("VideoCapture", "No supportedHeights for width: " + i, e10);
        }
        try {
            hashSet.add(new Size(xVar.c(i9).clamp(Integer.valueOf(i)).intValue(), i9));
        } catch (IllegalArgumentException e11) {
            Logger.w("VideoCapture", "No supportedWidths for height: " + i9, e11);
        }
    }

    public static int b(boolean z10, int i, int i9, Range<Integer> range) {
        int i10 = i % i9;
        if (i10 != 0) {
            i = z10 ? i - i10 : i + (i9 - i10);
        }
        return range.clamp(Integer.valueOf(i)).intValue();
    }

    public final void c(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
        boolean z10 = streamInfo.a() == -1;
        boolean z11 = streamInfo.c() == StreamInfo.StreamState.f5546a;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z10) {
            if (z11) {
                builder.addSurface(this.f5778a, dynamicRange);
            } else {
                builder.addNonRepeatingSurface(this.f5778a, dynamicRange);
            }
        }
        CallbackToFutureAdapter.c cVar = this.f5782e;
        if (cVar != null && cVar.cancel(false)) {
            Logger.d("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new B.e(1, this, builder));
        this.f5782e = a10;
        Futures.addCallback(a10, new o(this, a10, z11), CameraXExecutors.mainThreadExecutor());
    }

    public final void d() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.f5778a;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.f5778a = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f5785h;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.f5785h = null;
        }
        SurfaceEdge surfaceEdge = this.f5779b;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.f5779b = null;
        }
        this.i = null;
        this.f5786j = null;
        this.f5783f = null;
        this.f5780c = StreamInfo.f5543a;
        this.f5787k = 0;
        this.f5788l = false;
    }

    @SuppressLint({"WrongConstant"})
    public final SessionConfig.Builder e(String str, final D.a<T> aVar, StreamSpec streamSpec) {
        g gVar;
        String str2;
        InterfaceC1096a interfaceC1096a;
        DynamicRange dynamicRange;
        x0.f kVar;
        Rect rect;
        Size size;
        SurfaceProcessorNode surfaceProcessorNode;
        boolean z10;
        String str3;
        Threads.checkMainThread();
        final CameraInternal camera = getCamera();
        camera.getClass();
        Size resolution = streamSpec.getResolution();
        B2.d dVar = new B2.d(this, 2);
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        if (Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            expectedFrameRateRange = c.f5793b;
        }
        InterfaceFutureC0509a<g> fetchData = f().c().fetchData();
        if (fetchData.isDone()) {
            try {
                gVar = fetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            gVar = null;
        }
        g gVar2 = gVar;
        Objects.requireNonNull(gVar2);
        E b9 = f().b(camera.getCameraInfo());
        DynamicRange dynamicRange2 = streamSpec.getDynamicRange();
        InterfaceC1096a interfaceC1096a2 = (InterfaceC1096a) aVar.retrieveOption(D.a.f855c);
        Objects.requireNonNull(interfaceC1096a2);
        x xVar = this.i;
        if (xVar != null) {
            str2 = "VideoCapture";
            dynamicRange = dynamicRange2;
        } else {
            E.e a10 = b9.a(resolution, dynamicRange2);
            I.h b10 = I.j.b(gVar2, dynamicRange2, a10);
            Timebase timebase = Timebase.UPTIME;
            r d10 = gVar2.d();
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = b10.f1687c;
            if (videoProfileProxy != null) {
                str2 = "VideoCapture";
                interfaceC1096a = interfaceC1096a2;
                dynamicRange = dynamicRange2;
                kVar = new I.l(b10.f1685a, timebase, d10, resolution, videoProfileProxy, dynamicRange2, expectedFrameRateRange);
            } else {
                str2 = "VideoCapture";
                interfaceC1096a = interfaceC1096a2;
                dynamicRange = dynamicRange2;
                kVar = new I.k(b10.f1685a, timebase, d10, resolution, dynamicRange, expectedFrameRateRange);
            }
            x xVar2 = (x) interfaceC1096a.apply((v) kVar.get());
            if (xVar2 == null) {
                Logger.w(str2, "Can't find videoEncoderInfo");
                xVar = null;
            } else {
                Size size2 = a10 != null ? new Size(a10.b().getWidth(), a10.b().getHeight()) : null;
                if (!(xVar2 instanceof L.c)) {
                    if (H.f.f1368a.get(H.k.class) == null) {
                        if (size2 != null && !xVar2.g(size2.getWidth(), size2.getHeight())) {
                            Logger.w("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size2 + " that should be valid in widths/heights = " + xVar2.f() + "/" + xVar2.h());
                        }
                    }
                    xVar = new L.c(xVar2, size2);
                    this.i = xVar;
                }
                xVar = xVar2;
                this.i = xVar;
            }
        }
        int relativeRotation = getRelativeRotation(camera, isMirroringRequired(camera));
        if (h()) {
            relativeRotation = TransformUtils.within360(relativeRotation - this.f5780c.b().getRotationDegrees());
        }
        this.f5787k = relativeRotation;
        Rect viewPortCropRect = getViewPortCropRect() != null ? getViewPortCropRect() : new Rect(0, 0, resolution.getWidth(), resolution.getHeight());
        if (xVar != null && !xVar.g(viewPortCropRect.width(), viewPortCropRect.height())) {
            Logger.d(str2, String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(viewPortCropRect), Integer.valueOf(xVar.a()), Integer.valueOf(xVar.e()), xVar.f(), xVar.h()));
            int a11 = xVar.a();
            int e11 = xVar.e();
            Range<Integer> f10 = xVar.f();
            Range<Integer> h9 = xVar.h();
            int b11 = b(true, viewPortCropRect.width(), a11, f10);
            int b12 = b(false, viewPortCropRect.width(), a11, f10);
            int b13 = b(true, viewPortCropRect.height(), e11, h9);
            int b14 = b(false, viewPortCropRect.height(), e11, h9);
            HashSet hashSet = new HashSet();
            a(hashSet, b11, b13, resolution, xVar);
            a(hashSet, b11, b14, resolution, xVar);
            a(hashSet, b12, b13, resolution, xVar);
            a(hashSet, b12, b14, resolution, xVar);
            if (hashSet.isEmpty()) {
                Logger.w(str2, "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                Logger.d(str2, "candidatesList = " + arrayList);
                Collections.sort(arrayList, new H(viewPortCropRect, 0));
                Logger.d(str2, "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == viewPortCropRect.width() && height == viewPortCropRect.height()) {
                    Logger.d(str2, "No need to adjust cropRect because crop size is valid.");
                } else {
                    C1124b.q(width % 2 == 0 && height % 2 == 0 && width <= resolution.getWidth() && height <= resolution.getHeight(), null);
                    Rect rect2 = new Rect(viewPortCropRect);
                    if (width != viewPortCropRect.width()) {
                        int max = Math.max(0, viewPortCropRect.centerX() - (width / 2));
                        rect2.left = max;
                        int i = max + width;
                        rect2.right = i;
                        if (i > resolution.getWidth()) {
                            int width2 = resolution.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != viewPortCropRect.height()) {
                        int max2 = Math.max(0, viewPortCropRect.centerY() - (height / 2));
                        rect2.top = max2;
                        int i9 = max2 + height;
                        rect2.bottom = i9;
                        if (i9 > resolution.getHeight()) {
                            int height2 = resolution.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    }
                    Logger.d(str2, "Adjust cropRect from " + TransformUtils.rectToString(viewPortCropRect) + " to " + TransformUtils.rectToString(rect2));
                    viewPortCropRect = rect2;
                }
            }
        }
        int i10 = this.f5787k;
        if (h()) {
            SurfaceRequest.TransformationInfo b15 = this.f5780c.b();
            b15.getClass();
            rect = TransformUtils.sizeToRect(TransformUtils.getRotatedSize(b15.getCropRect(), i10));
        } else {
            rect = viewPortCropRect;
        }
        this.f5786j = rect;
        if (!h() || rect.equals(viewPortCropRect)) {
            size = resolution;
        } else {
            float height3 = rect.height() / viewPortCropRect.height();
            size = new Size((int) Math.ceil(resolution.getWidth() * height3), (int) Math.ceil(resolution.getHeight() * height3));
        }
        if (h()) {
            this.f5788l = true;
        }
        Rect rect3 = this.f5786j;
        if (getEffect() != null || ((camera.getHasTransform() && f5776o) || resolution.getWidth() != rect3.width() || resolution.getHeight() != rect3.height() || ((camera.getHasTransform() && isMirroringRequired(camera)) || h()))) {
            Logger.d(str2, "Surface processing is enabled.");
            CameraInternal camera2 = getCamera();
            Objects.requireNonNull(camera2);
            surfaceProcessorNode = new SurfaceProcessorNode(camera2, getEffect() != null ? getEffect().createSurfaceProcessorInternal() : DefaultSurfaceProcessor.Factory.newInstance(dynamicRange));
        } else {
            surfaceProcessorNode = null;
        }
        this.f5785h = surfaceProcessorNode;
        final Timebase timebase2 = (surfaceProcessorNode == null && camera.getHasTransform()) ? Timebase.UPTIME : camera.getCameraInfoInternal().getTimebase();
        Logger.d(str2, "camera timebase = " + camera.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebase2);
        StreamSpec build = streamSpec.toBuilder().setResolution(size).setExpectedFrameRateRange(expectedFrameRateRange).build();
        if (this.f5779b == null) {
            str3 = null;
            z10 = true;
        } else {
            z10 = false;
            str3 = null;
        }
        C1124b.q(z10, str3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, build, getSensorToBufferTransformMatrix(), camera.getHasTransform(), this.f5786j, this.f5787k, getAppTargetRotation(), camera.getHasTransform() && isMirroringRequired(camera));
        this.f5779b = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(dVar);
        if (this.f5785h != null) {
            SurfaceProcessorNode.OutConfig of = SurfaceProcessorNode.OutConfig.of(this.f5779b);
            final SurfaceEdge surfaceEdge2 = this.f5785h.transform(SurfaceProcessorNode.In.of(this.f5779b, Collections.singletonList(of))).get(of);
            Objects.requireNonNull(surfaceEdge2);
            surfaceEdge2.addOnInvalidatedListener(new Runnable() { // from class: C.F
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.n nVar = androidx.camera.video.n.this;
                    CameraInternal camera3 = nVar.getCamera();
                    CameraInternal cameraInternal = camera;
                    if (cameraInternal == camera3) {
                        nVar.f5783f = surfaceEdge2.createSurfaceRequest(cameraInternal);
                        ((VideoOutput) aVar.retrieveOption(D.a.f854b)).a(nVar.f5783f, timebase2);
                        nVar.sendTransformationInfoIfReady();
                    }
                }
            });
            this.f5783f = surfaceEdge2.createSurfaceRequest(camera);
            DeferrableSurface deferrableSurface = this.f5779b.getDeferrableSurface();
            this.f5778a = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new B6.d(4, this, deferrableSurface), CameraXExecutors.mainThreadExecutor());
        } else {
            SurfaceRequest createSurfaceRequest = this.f5779b.createSurfaceRequest(camera);
            this.f5783f = createSurfaceRequest;
            this.f5778a = createSurfaceRequest.getDeferrableSurface();
        }
        ((VideoOutput) aVar.retrieveOption(D.a.f854b)).a(this.f5783f, timebase2);
        sendTransformationInfoIfReady();
        this.f5778a.setContainerClass(MediaCodec.class);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(aVar, streamSpec.getResolution());
        createFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        createFrom.addErrorListener(new G(this, str, aVar, streamSpec, 0));
        if (f5777p) {
            createFrom.setTemplateType(1);
        }
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    public final T f() {
        return (T) ((D.a) getCurrentConfig()).retrieveOption(D.a.f854b);
    }

    public final void g(String str, D.a<T> aVar, StreamSpec streamSpec) {
        d();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder e10 = e(str, aVar, streamSpec);
            this.f5781d = e10;
            c(e10, this.f5780c, streamSpec);
            updateSessionConfig(this.f5781d.build());
            notifyReset();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig<?> getDefaultConfig(boolean z10, UseCaseConfigFactory useCaseConfigFactory) {
        f5775n.getClass();
        D.a<?> aVar = c.f5792a;
        Config config = useCaseConfigFactory.getConfig(aVar.getCaptureType(), 1);
        if (z10) {
            config = Config.mergeConfigs(config, aVar);
        }
        if (config == null) {
            return null;
        }
        return new D.a(OptionsBundle.from(((b) getUseCaseConfigBuilder(config)).f5791a));
    }

    @Override // androidx.camera.core.UseCase
    public final Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return new b(MutableOptionsBundle.from(config));
    }

    public final boolean h() {
        return this.f5780c.b() != null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        g gVar;
        ArrayList arrayList;
        InterfaceFutureC0509a<g> fetchData = f().c().fetchData();
        if (fetchData.isDone()) {
            try {
                gVar = fetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            gVar = null;
        }
        g gVar2 = gVar;
        C1124b.m(gVar2 != null, "Unable to update target resolution by null MediaSpec.");
        DynamicRange dynamicRange = getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : c.f5794c;
        E b9 = f().b(cameraInfoInternal);
        ArrayList b10 = b9.b(dynamicRange);
        if (b10.isEmpty()) {
            Logger.w("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            r d10 = gVar2.d();
            C.r e11 = d10.e();
            e11.getClass();
            if (b10.isEmpty()) {
                Logger.w("QualitySelector", "No supported quality on the device.");
                arrayList = new ArrayList();
            } else {
                Logger.d("QualitySelector", "supportedQualities = " + b10);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<C.o> it = e11.f573a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C.o next = it.next();
                    if (next == C.o.f565f) {
                        linkedHashSet.addAll(b10);
                        break;
                    }
                    if (next == C.o.f564e) {
                        ArrayList arrayList2 = new ArrayList(b10);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (b10.contains(next)) {
                        linkedHashSet.add(next);
                    } else {
                        Logger.w("QualitySelector", "quality is not supported and will be ignored: " + next);
                    }
                }
                if (!b10.isEmpty() && !linkedHashSet.containsAll(b10)) {
                    StringBuilder sb2 = new StringBuilder("Select quality by fallbackStrategy = ");
                    C0493i c0493i = e11.f574b;
                    sb2.append(c0493i);
                    Logger.d("QualitySelector", sb2.toString());
                    if (c0493i != C0493i.f557a) {
                        C1124b.q(c0493i instanceof C0493i.a, "Currently only support type RuleStrategy");
                        C0493i.a aVar = (C0493i.a) c0493i;
                        ArrayList arrayList3 = new ArrayList(C.o.i);
                        C.o a10 = aVar.a() == C.o.f565f ? (C.o) arrayList3.get(0) : aVar.a() == C.o.f564e ? (C.o) com.google.android.gms.measurement.internal.a.f(1, arrayList3) : aVar.a();
                        int indexOf = arrayList3.indexOf(a10);
                        C1124b.q(indexOf != -1, null);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i = indexOf - 1; i >= 0; i--) {
                            C.o oVar = (C.o) arrayList3.get(i);
                            if (b10.contains(oVar)) {
                                arrayList4.add(oVar);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (int i9 = indexOf + 1; i9 < arrayList3.size(); i9++) {
                            C.o oVar2 = (C.o) arrayList3.get(i9);
                            if (b10.contains(oVar2)) {
                                arrayList5.add(oVar2);
                            }
                        }
                        Logger.d("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + a10 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                        int b11 = aVar.b();
                        if (b11 != 0) {
                            if (b11 == 1) {
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            } else if (b11 == 2) {
                                linkedHashSet.addAll(arrayList4);
                            } else if (b11 == 3) {
                                linkedHashSet.addAll(arrayList5);
                                linkedHashSet.addAll(arrayList4);
                            } else {
                                if (b11 != 4) {
                                    throw new AssertionError("Unhandled fallback strategy: " + c0493i);
                                }
                                linkedHashSet.addAll(arrayList5);
                            }
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            Logger.d("VideoCapture", "Found selectedQualities " + arrayList + " by " + e11);
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            int b12 = d10.b();
            HashMap hashMap = new HashMap();
            for (C.o oVar3 : b9.b(dynamicRange)) {
                E.e c2 = b9.c(oVar3, dynamicRange);
                Objects.requireNonNull(c2);
                EncoderProfilesProxy.VideoProfileProxy b13 = c2.b();
                hashMap.put(oVar3, new Size(b13.getWidth(), b13.getHeight()));
            }
            C.q qVar = new C.q(cameraInfoInternal.getSupportedResolutions(getImageFormat()), hashMap);
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List list = (List) qVar.f572a.get(new C0490f((C.o) it2.next(), b12));
                arrayList6.addAll(list != null ? new ArrayList(list) : new ArrayList(0));
            }
            Logger.d("VideoCapture", "Set custom ordered resolutions = " + arrayList6);
            builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList6);
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final void onStateAttached() {
        super.onStateAttached();
        C1124b.p(getAttachedStreamSpec(), "The suggested stream specification should be already updated and shouldn't be null.");
        C1124b.q(this.f5783f == null, "The surface request should be null when VideoCapture is attached.");
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        attachedStreamSpec.getClass();
        Observable<StreamInfo> d10 = f().d();
        StreamInfo streamInfo = StreamInfo.f5543a;
        InterfaceFutureC0509a<StreamInfo> fetchData = d10.fetchData();
        if (fetchData.isDone()) {
            try {
                streamInfo = fetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.f5780c = streamInfo;
        SessionConfig.Builder e11 = e(getCameraId(), (D.a) getCurrentConfig(), attachedStreamSpec);
        this.f5781d = e11;
        c(e11, this.f5780c, attachedStreamSpec);
        updateSessionConfig(this.f5781d.build());
        notifyActive();
        f().d().addObserver(CameraXExecutors.mainThreadExecutor(), this.f5789m);
        VideoOutput.SourceState sourceState = VideoOutput.SourceState.f5568b;
        if (sourceState != this.f5784g) {
            this.f5784g = sourceState;
            f().e(sourceState);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onStateDetached() {
        C1124b.q(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        VideoOutput.SourceState sourceState = VideoOutput.SourceState.f5569c;
        if (sourceState != this.f5784g) {
            this.f5784g = sourceState;
            f().e(sourceState);
        }
        f().d().removeObserver(this.f5789m);
        CallbackToFutureAdapter.c cVar = this.f5782e;
        if (cVar != null && cVar.cancel(false)) {
            Logger.d("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        d();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.f5781d.addImplementationOptions(config);
        updateSessionConfig(this.f5781d.build());
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec) {
        Logger.d("VideoCapture", "onSuggestedStreamSpecUpdated: " + streamSpec);
        List<Size> customOrderedResolutions = ((D.a) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            Logger.w("VideoCapture", "suggested resolution " + streamSpec.getResolution() + " is not in custom ordered resolutions " + customOrderedResolutions);
        }
        return streamSpec;
    }

    public final void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.f5779b;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        int relativeRotation = getRelativeRotation(camera, isMirroringRequired(camera));
        if (h()) {
            relativeRotation = TransformUtils.within360(relativeRotation - this.f5780c.b().getRotationDegrees());
        }
        this.f5787k = relativeRotation;
        surfaceEdge.updateTransformation(relativeRotation, getAppTargetRotation());
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    public final String toString() {
        return "VideoCapture:" + getName();
    }

    /* compiled from: VideoCapture.java */
    public static final class b<T extends VideoOutput> implements UseCaseConfig.Builder<n<T>, D.a<T>, b<T>>, ImageOutputConfig.Builder<b<T>>, ImageInputConfig.Builder<b<T>>, ThreadConfig.Builder<b<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f5791a;

        public b(MutableOptionsBundle mutableOptionsBundle) {
            this.f5791a = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(D.a.f854b)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(n.class)) {
                a(n.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public final void a(Class cls) {
            Config.Option<Class<?>> option = TargetConfig.OPTION_TARGET_CLASS;
            MutableOptionsBundle mutableOptionsBundle = this.f5791a;
            mutableOptionsBundle.insertOption(option, cls);
            Config.Option<String> option2 = TargetConfig.OPTION_TARGET_NAME;
            if (mutableOptionsBundle.retrieveOption(option2, null) == null) {
                mutableOptionsBundle.insertOption(option2, cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final Object build() {
            return new n(new D.a(OptionsBundle.from(this.f5791a)));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig getMutableConfig() {
            return this.f5791a;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig getUseCaseConfig() {
            return new D.a(OptionsBundle.from(this.f5791a));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public final Object setBackgroundExecutor(Executor executor) {
            this.f5791a.insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setCameraSelector(CameraSelector cameraSelector) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setCustomOrderedResolutions(List list) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setDefaultCaptureConfig(CaptureConfig captureConfig) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setDefaultResolution(Size size) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setDefaultSessionConfig(SessionConfig sessionConfig) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public final Object setDynamicRange(DynamicRange dynamicRange) {
            this.f5791a.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setHighResolutionDisabled(boolean z10) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setMaxResolution(Size size) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setMirrorMode(int i) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setResolutionSelector(ResolutionSelector resolutionSelector) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setSupportedResolutions(List list) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setSurfaceOccupancyPriority(int i) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setTargetAspectRatio(int i) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            a(cls);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final Object setTargetName(String str) {
            this.f5791a.insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setTargetResolution(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object setTargetRotation(int i) {
            this.f5791a.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        public final Object setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            this.f5791a.insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final Object setZslDisabled(boolean z10) {
            this.f5791a.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z10));
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(T r3) {
            /*
                r2 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                androidx.camera.core.impl.Config$Option<androidx.camera.video.VideoOutput> r1 = D.a.f854b
                r0.insertOption(r1, r3)
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.n.b.<init>(androidx.camera.video.VideoOutput):void");
        }
    }
}

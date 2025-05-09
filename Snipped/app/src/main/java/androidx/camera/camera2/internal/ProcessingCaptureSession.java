package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Size;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.camera2.internal.ProcessingCaptureSession.a;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import c.RunnableC0615f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p.InterfaceC1096a;
import pa.C1124b;
import t.C1262n;
import t.J;
import t.b0;
import t.d0;
import t.e0;
import z.e;

/* loaded from: classes.dex */
public final class ProcessingCaptureSession implements J {

    /* renamed from: p, reason: collision with root package name */
    public static final ArrayList f5204p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public static int f5205q = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SessionProcessor f5206a;

    /* renamed from: b, reason: collision with root package name */
    public final C1262n f5207b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5208c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f5209d;

    /* renamed from: e, reason: collision with root package name */
    public final CaptureSession f5210e;

    /* renamed from: g, reason: collision with root package name */
    public SessionConfig f5212g;

    /* renamed from: h, reason: collision with root package name */
    public g f5213h;
    public SessionConfig i;

    /* renamed from: o, reason: collision with root package name */
    public final int f5219o;

    /* renamed from: f, reason: collision with root package name */
    public List<DeferrableSurface> f5211f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public volatile List<CaptureConfig> f5215k = null;

    /* renamed from: m, reason: collision with root package name */
    public z.e f5217m = new z.e(OptionsBundle.from(MutableOptionsBundle.create()));

    /* renamed from: n, reason: collision with root package name */
    public z.e f5218n = new z.e(OptionsBundle.from(MutableOptionsBundle.create()));

    /* renamed from: j, reason: collision with root package name */
    public ProcessorState f5214j = ProcessorState.f5220a;

    /* renamed from: l, reason: collision with root package name */
    public final b f5216l = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProcessorState {

        /* renamed from: a, reason: collision with root package name */
        public static final ProcessorState f5220a;

        /* renamed from: b, reason: collision with root package name */
        public static final ProcessorState f5221b;

        /* renamed from: c, reason: collision with root package name */
        public static final ProcessorState f5222c;

        /* renamed from: d, reason: collision with root package name */
        public static final ProcessorState f5223d;

        /* renamed from: e, reason: collision with root package name */
        public static final ProcessorState f5224e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ProcessorState[] f5225f;

        static {
            ProcessorState processorState = new ProcessorState("UNINITIALIZED", 0);
            f5220a = processorState;
            ProcessorState processorState2 = new ProcessorState("SESSION_INITIALIZED", 1);
            f5221b = processorState2;
            ProcessorState processorState3 = new ProcessorState("ON_CAPTURE_SESSION_STARTED", 2);
            f5222c = processorState3;
            ProcessorState processorState4 = new ProcessorState("ON_CAPTURE_SESSION_ENDED", 3);
            f5223d = processorState4;
            ProcessorState processorState5 = new ProcessorState("DE_INITIALIZED", 4);
            f5224e = processorState5;
            f5225f = new ProcessorState[]{processorState, processorState2, processorState3, processorState4, processorState5};
        }

        public ProcessorState() {
            throw null;
        }

        public static ProcessorState valueOf(String str) {
            return (ProcessorState) Enum.valueOf(ProcessorState.class, str);
        }

        public static ProcessorState[] values() {
            return (ProcessorState[]) f5225f.clone();
        }
    }

    public class a implements FutureCallback<Void> {
        public a() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.e("ProcessingCaptureSession", "open session failed ", th);
            ProcessingCaptureSession processingCaptureSession = ProcessingCaptureSession.this;
            processingCaptureSession.close();
            processingCaptureSession.release();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    public ProcessingCaptureSession(SessionProcessor sessionProcessor, C1262n c1262n, v.b bVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f5219o = 0;
        this.f5210e = new CaptureSession(bVar);
        this.f5206a = sessionProcessor;
        this.f5207b = c1262n;
        this.f5208c = executor;
        this.f5209d = scheduledExecutorService;
        int i = f5205q;
        f5205q = i + 1;
        this.f5219o = i;
        Logger.d("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i + ")");
    }

    public static void g(List<CaptureConfig> list) {
        Iterator<CaptureConfig> it = list.iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureCallback> it2 = it.next().getCameraCaptureCallbacks().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureCancelled();
            }
        }
    }

    @Override // t.J
    public final void a() {
        Logger.d("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f5219o + ")");
        if (this.f5215k != null) {
            Iterator<CaptureConfig> it = this.f5215k.iterator();
            while (it.hasNext()) {
                Iterator<CameraCaptureCallback> it2 = it.next().getCameraCaptureCallbacks().iterator();
                while (it2.hasNext()) {
                    it2.next().onCaptureCancelled();
                }
            }
            this.f5215k = null;
        }
    }

    @Override // t.J
    public final List<CaptureConfig> c() {
        return this.f5215k != null ? this.f5215k : Collections.emptyList();
    }

    @Override // t.J
    public final void close() {
        Logger.d("ProcessingCaptureSession", "close (id=" + this.f5219o + ") state=" + this.f5214j);
        if (this.f5214j == ProcessorState.f5222c) {
            Logger.d("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f5219o + ")");
            this.f5206a.onCaptureSessionEnd();
            g gVar = this.f5213h;
            if (gVar != null) {
                gVar.f5248c = true;
            }
            this.f5214j = ProcessorState.f5223d;
        }
        this.f5210e.close();
    }

    @Override // t.J
    public final void d(List<CaptureConfig> list) {
        if (list.isEmpty()) {
            return;
        }
        Logger.d("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f5219o + ") + state =" + this.f5214j);
        int ordinal = this.f5214j.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f5215k = list;
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                Logger.d("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f5214j);
                g(list);
                return;
            }
            return;
        }
        for (CaptureConfig captureConfig : list) {
            if (captureConfig.getTemplateType() == 2) {
                e.a b9 = e.a.b(captureConfig.getImplementationOptions());
                Config implementationOptions = captureConfig.getImplementationOptions();
                Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
                if (implementationOptions.containsOption(option)) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    b9.f31214a.insertOption(s.a.a(key), (Integer) captureConfig.getImplementationOptions().retrieveOption(option));
                }
                Config implementationOptions2 = captureConfig.getImplementationOptions();
                Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
                if (implementationOptions2.containsOption(option2)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
                    b9.f31214a.insertOption(s.a.a(key2), Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
                }
                z.e build = b9.build();
                this.f5218n = build;
                h(this.f5217m, build);
                this.f5206a.startCapture(new e0(this, captureConfig));
            } else {
                Logger.d("ProcessingCaptureSession", "issueTriggerRequest");
                z.e build2 = e.a.b(captureConfig.getImplementationOptions()).build();
                Iterator<Config.Option<?>> it = build2.listOptions().iterator();
                while (it.hasNext()) {
                    CaptureRequest.Key key3 = (CaptureRequest.Key) it.next().getToken();
                    if (key3.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key3.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        this.f5206a.startTrigger(build2, new d0(this, captureConfig));
                        break;
                    }
                }
                g(Arrays.asList(captureConfig));
            }
        }
    }

    @Override // t.J
    public final void e(SessionConfig sessionConfig) {
        Logger.d("ProcessingCaptureSession", "setSessionConfig (id=" + this.f5219o + ")");
        this.f5212g = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        g gVar = this.f5213h;
        if (gVar != null) {
            gVar.f5249d = sessionConfig;
        }
        if (this.f5214j == ProcessorState.f5222c) {
            z.e build = e.a.b(sessionConfig.getImplementationOptions()).build();
            this.f5217m = build;
            h(build, this.f5218n);
            Iterator<DeferrableSurface> it = sessionConfig.getRepeatingCaptureConfig().getSurfaces().iterator();
            while (it.hasNext()) {
                if (Objects.equals(it.next().getContainerClass(), Preview.class)) {
                    this.f5206a.startRepeating(this.f5216l);
                    return;
                }
            }
            this.f5206a.stopRepeating();
        }
    }

    @Override // t.J
    public final InterfaceFutureC0509a<Void> f(final SessionConfig sessionConfig, final CameraDevice cameraDevice, final r rVar) {
        C1124b.m(this.f5214j == ProcessorState.f5220a, "Invalid state state:" + this.f5214j);
        C1124b.m(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.d("ProcessingCaptureSession", "open (id=" + this.f5219o + ")");
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.f5211f = surfaces;
        FutureChain from = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, 5000L, this.f5208c, this.f5209d));
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.m
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final InterfaceFutureC0509a apply(Object obj) {
                List list = (List) obj;
                StringBuilder sb2 = new StringBuilder("-- getSurfaces done, start init (id=");
                ProcessingCaptureSession processingCaptureSession = ProcessingCaptureSession.this;
                int i = processingCaptureSession.f5219o;
                sb2.append(i);
                sb2.append(")");
                Logger.d("ProcessingCaptureSession", sb2.toString());
                if (processingCaptureSession.f5214j == ProcessingCaptureSession.ProcessorState.f5224e) {
                    return Futures.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                OutputSurface outputSurface = null;
                boolean contains = list.contains(null);
                SessionConfig sessionConfig2 = sessionConfig;
                if (contains) {
                    return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig2.getSurfaces().get(list.indexOf(null))));
                }
                OutputSurface outputSurface2 = null;
                OutputSurface outputSurface3 = null;
                for (int i9 = 0; i9 < sessionConfig2.getSurfaces().size(); i9++) {
                    DeferrableSurface deferrableSurface = sessionConfig2.getSurfaces().get(i9);
                    if (Objects.equals(deferrableSurface.getContainerClass(), Preview.class)) {
                        outputSurface = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                    } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageCapture.class)) {
                        outputSurface2 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                    } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageAnalysis.class)) {
                        outputSurface3 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                    }
                }
                processingCaptureSession.f5214j = ProcessingCaptureSession.ProcessorState.f5221b;
                try {
                    DeferrableSurfaces.incrementAll(processingCaptureSession.f5211f);
                    Logger.w("ProcessingCaptureSession", "== initSession (id=" + i + ")");
                    try {
                        SessionConfig initSession = processingCaptureSession.f5206a.initSession(processingCaptureSession.f5207b, outputSurface, outputSurface2, outputSurface3);
                        processingCaptureSession.i = initSession;
                        initSession.getSurfaces().get(0).getTerminationFuture().addListener(new b0(processingCaptureSession, 1), CameraXExecutors.directExecutor());
                        Iterator<DeferrableSurface> it = processingCaptureSession.i.getSurfaces().iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            Executor executor = processingCaptureSession.f5208c;
                            if (!hasNext) {
                                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                                validatingBuilder.add(sessionConfig2);
                                validatingBuilder.clearSurfaces();
                                validatingBuilder.add(processingCaptureSession.i);
                                C1124b.m(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                                SessionConfig build = validatingBuilder.build();
                                CameraDevice cameraDevice2 = cameraDevice;
                                cameraDevice2.getClass();
                                InterfaceFutureC0509a<Void> f10 = processingCaptureSession.f5210e.f(build, cameraDevice2, rVar);
                                Futures.addCallback(f10, processingCaptureSession.new a(), executor);
                                return f10;
                            }
                            DeferrableSurface next = it.next();
                            ProcessingCaptureSession.f5204p.add(next);
                            next.getTerminationFuture().addListener(new RunnableC0615f(next, 19), executor);
                        }
                    } catch (Throwable th) {
                        DeferrableSurfaces.decrementAll(processingCaptureSession.f5211f);
                        throw th;
                    }
                } catch (DeferrableSurface.SurfaceClosedException e10) {
                    return Futures.immediateFailedFuture(e10);
                }
            }
        };
        Executor executor = this.f5208c;
        return from.transformAsync(asyncFunction, executor).transform(new InterfaceC1096a() { // from class: androidx.camera.camera2.internal.n
            @Override // p.InterfaceC1096a
            public final Object apply(Object obj) {
                ProcessingCaptureSession processingCaptureSession = ProcessingCaptureSession.this;
                CaptureSession captureSession = processingCaptureSession.f5210e;
                C1124b.m(processingCaptureSession.f5214j == ProcessingCaptureSession.ProcessorState.f5221b, "Invalid state state:" + processingCaptureSession.f5214j);
                List<DeferrableSurface> surfaces2 = processingCaptureSession.i.getSurfaces();
                ArrayList arrayList = new ArrayList();
                for (DeferrableSurface deferrableSurface : surfaces2) {
                    C1124b.m(deferrableSurface instanceof SessionProcessorSurface, "Surface must be SessionProcessorSurface");
                    arrayList.add((SessionProcessorSurface) deferrableSurface);
                }
                processingCaptureSession.f5213h = new g(captureSession, arrayList);
                Logger.d("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + processingCaptureSession.f5219o + ")");
                processingCaptureSession.f5206a.onCaptureSessionStart(processingCaptureSession.f5213h);
                processingCaptureSession.f5214j = ProcessingCaptureSession.ProcessorState.f5222c;
                SessionConfig sessionConfig2 = processingCaptureSession.f5212g;
                if (sessionConfig2 != null) {
                    processingCaptureSession.e(sessionConfig2);
                }
                if (processingCaptureSession.f5215k != null) {
                    processingCaptureSession.d(processingCaptureSession.f5215k);
                    processingCaptureSession.f5215k = null;
                }
                return null;
            }
        }, executor);
    }

    @Override // t.J
    public final SessionConfig getSessionConfig() {
        return this.f5212g;
    }

    public final void h(z.e eVar, z.e eVar2) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (Config.Option<?> option : eVar.listOptions()) {
            create.insertOption(option, eVar.retrieveOption(option));
        }
        for (Config.Option<?> option2 : eVar2.listOptions()) {
            create.insertOption(option2, eVar2.retrieveOption(option2));
        }
        this.f5206a.setParameters(new s.a(OptionsBundle.from(create)));
    }

    @Override // t.J
    public final InterfaceFutureC0509a release() {
        Logger.d("ProcessingCaptureSession", "release (id=" + this.f5219o + ") mProcessorState=" + this.f5214j);
        InterfaceFutureC0509a release = this.f5210e.release();
        int ordinal = this.f5214j.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            release.addListener(new b0(this, 0), CameraXExecutors.directExecutor());
        }
        this.f5214j = ProcessorState.f5224e;
        return release;
    }

    public static class b implements SessionProcessor.CaptureCallback {
        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureFailed(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureProcessStarted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureSequenceAborted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureSequenceCompleted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureStarted(int i, long j10) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public final void onCaptureCompleted(long j10, int i, Map<CaptureResult.Key, Object> map) {
        }
    }

    @Override // t.J
    public final void b(HashMap hashMap) {
    }
}

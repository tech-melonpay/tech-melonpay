package t;

import a3.InterfaceFutureC0509a;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c.RunnableC0615f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import s.a;
import t.r;
import z.C1634a;
import z.e;

/* compiled from: Camera2CameraControlImpl.java */
/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257i implements CameraControlInternal {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f27243x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f27244a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27245b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27246c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final u.n f27247d;

    /* renamed from: e, reason: collision with root package name */
    public final CameraControlInternal.ControlUpdateCallback f27248e;

    /* renamed from: f, reason: collision with root package name */
    public final SessionConfig.Builder f27249f;

    /* renamed from: g, reason: collision with root package name */
    public final X f27250g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f27251h;
    public final m0 i;

    /* renamed from: j, reason: collision with root package name */
    public final O f27252j;

    /* renamed from: k, reason: collision with root package name */
    public final s0 f27253k;

    /* renamed from: l, reason: collision with root package name */
    public final z.c f27254l;

    /* renamed from: m, reason: collision with root package name */
    public final r f27255m;

    /* renamed from: n, reason: collision with root package name */
    public int f27256n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f27257o;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f27258p;

    /* renamed from: q, reason: collision with root package name */
    public final x.a f27259q;

    /* renamed from: r, reason: collision with root package name */
    public final x.b f27260r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicLong f27261s;

    /* renamed from: t, reason: collision with root package name */
    public volatile InterfaceFutureC0509a<Void> f27262t;

    /* renamed from: u, reason: collision with root package name */
    public int f27263u;

    /* renamed from: v, reason: collision with root package name */
    public long f27264v;

    /* renamed from: w, reason: collision with root package name */
    public final a f27265w;

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: t.i$a */
    public static final class a extends CameraCaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f27266a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayMap f27267b = new ArrayMap();

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCancelled() {
            Iterator it = this.f27266a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.f27267b.get(cameraCaptureCallback)).execute(new RunnableC0615f(cameraCaptureCallback, 16));
                } catch (RejectedExecutionException e10) {
                    Logger.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            Iterator it = this.f27266a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.f27267b.get(cameraCaptureCallback)).execute(new com.sumsub.sns.camera.photo.presentation.document.c(8, cameraCaptureCallback, cameraCaptureResult));
                } catch (RejectedExecutionException e10) {
                    Logger.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            Iterator it = this.f27266a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.f27267b.get(cameraCaptureCallback)).execute(new com.sumsub.sns.camera.photo.presentation.document.c(9, cameraCaptureCallback, cameraCaptureFailure));
                } catch (RejectedExecutionException e10) {
                    Logger.e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: t.i$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f27268a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final Executor f27269b;

        public b(Executor executor) {
            this.f27269b = executor;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f27269b.execute(new com.sumsub.sns.camera.photo.presentation.document.c(10, this, totalCaptureResult));
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: t.i$c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C1257i(u.n nVar, ScheduledExecutorService scheduledExecutorService, Executor executor, Camera2CameraImpl.d dVar, Quirks quirks) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.f27249f = builder;
        this.f27256n = 0;
        this.f27257o = false;
        this.f27258p = 2;
        this.f27261s = new AtomicLong(0L);
        this.f27262t = Futures.immediateFuture(null);
        this.f27263u = 1;
        this.f27264v = 0L;
        a aVar = new a();
        this.f27265w = aVar;
        this.f27247d = nVar;
        this.f27248e = dVar;
        this.f27245b = executor;
        b bVar = new b(executor);
        this.f27244a = bVar;
        builder.setTemplateType(this.f27263u);
        builder.addRepeatingCameraCaptureCallback(new G(bVar));
        builder.addRepeatingCameraCaptureCallback(aVar);
        this.f27252j = new O(this, nVar, executor);
        this.f27250g = new X(this, scheduledExecutorService, executor, quirks);
        this.f27251h = new p0(this, nVar, executor);
        this.i = new m0(this, nVar, executor);
        this.f27253k = new s0(nVar);
        this.f27259q = new x.a(quirks);
        this.f27260r = new x.b(quirks, 0);
        this.f27254l = new z.c(this, executor);
        this.f27255m = new r(this, nVar, quirks, executor);
        executor.execute(new RunnableC1255g(this, 0));
    }

    public static boolean g(int i, int[] iArr) {
        for (int i9 : iArr) {
            if (i == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof TagBundle) && (l10 = (Long) ((TagBundle) tag).getTag("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public final void a(c cVar) {
        this.f27244a.f27268a.add(cVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
        z.c cVar = this.f27254l;
        z.e build = e.a.b(config).build();
        synchronized (cVar.f31208e) {
            try {
                for (Config.Option<?> option : build.listOptions()) {
                    cVar.f31209f.f26494a.insertOption(option, build.retrieveOption(option));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new C1634a(cVar, 0))).addListener(new androidx.camera.core.processing.d(2), CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(SessionConfig.Builder builder) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        s0 s0Var = this.f27253k;
        u.n nVar = s0Var.f27375a;
        while (true) {
            ZslRingBuffer zslRingBuffer = s0Var.f27376b;
            if (zslRingBuffer.isEmpty()) {
                break;
            } else {
                zslRingBuffer.dequeue().close();
            }
        }
        ImmediateSurface immediateSurface = s0Var.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (immediateSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = s0Var.f27381g;
            if (safeCloseImageReaderProxy != null) {
                immediateSurface.getTerminationFuture().addListener(new RunnableC0615f(safeCloseImageReaderProxy, 22), CameraXExecutors.mainThreadExecutor());
                s0Var.f27381g = null;
            }
            immediateSurface.close();
            s0Var.i = null;
        }
        ImageWriter imageWriter = s0Var.f27383j;
        if (imageWriter != null) {
            imageWriter.close();
            s0Var.f27383j = null;
        }
        if (s0Var.f27377c || s0Var.f27380f) {
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) nVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            Logger.e("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new CompareSizesByArea(true));
                    hashMap.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (!s0Var.f27379e || hashMap.isEmpty() || !hashMap.containsKey(34) || (streamConfigurationMap = (StreamConfigurationMap) nVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) == null) {
            return;
        }
        for (int i9 : validOutputFormatsForInput) {
            if (i9 == 256) {
                Size size = (Size) hashMap.get(34);
                MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
                s0Var.f27382h = metadataImageReader.getCameraCaptureCallback();
                s0Var.f27381g = new SafeCloseImageReaderProxy(metadataImageReader);
                metadataImageReader.setOnImageAvailableListener(new com.sumsub.sns.geo.presentation.d(s0Var, 26), CameraXExecutors.ioExecutor());
                ImmediateSurface immediateSurface2 = new ImmediateSurface(s0Var.f27381g.getSurface(), new Size(s0Var.f27381g.getWidth(), s0Var.f27381g.getHeight()), 34);
                s0Var.i = immediateSurface2;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = s0Var.f27381g;
                InterfaceFutureC0509a<Void> terminationFuture = immediateSurface2.getTerminationFuture();
                Objects.requireNonNull(safeCloseImageReaderProxy2);
                terminationFuture.addListener(new RunnableC0615f(safeCloseImageReaderProxy2, 22), CameraXExecutors.mainThreadExecutor());
                builder.addSurface(s0Var.i);
                builder.addCameraCaptureCallback(s0Var.f27382h);
                builder.addSessionStateCallback(new r0(s0Var));
                builder.setInputConfiguration(new InputConfiguration(s0Var.f27381g.getWidth(), s0Var.f27381g.getHeight(), s0Var.f27381g.getImageFormat()));
                return;
            }
        }
    }

    public final void b() {
        synchronized (this.f27246c) {
            try {
                int i = this.f27256n;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f27256n = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z10) {
        this.f27257o = z10;
        if (!z10) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f27263u);
            builder.setUseRepeatingSurface(true);
            MutableOptionsBundle create = MutableOptionsBundle.create();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            create.insertOption(s.a.a(key), Integer.valueOf(d(1)));
            create.insertOption(s.a.a(CaptureRequest.FLASH_MODE), 0);
            builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
            this.f27248e.onCameraControlCaptureRequests(Collections.singletonList(builder.build()));
        }
        j();
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<Void> cancelFocusAndMetering() {
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        X x9 = this.f27250g;
        x9.getClass();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new com.sumsub.sns.geo.presentation.d(x9, 24)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        z.c cVar = this.f27254l;
        synchronized (cVar.f31208e) {
            cVar.f31209f = new a.C0469a();
        }
        Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new C1634a(cVar, 1))).addListener(new androidx.camera.core.processing.d(2), CameraXExecutors.directExecutor());
    }

    public final int d(int i) {
        int[] iArr = (int[]) this.f27247d.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return g(i, iArr) ? i : g(1, iArr) ? 1 : 0;
    }

    public final int e(int i) {
        int[] iArr = (int[]) this.f27247d.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (g(i, iArr)) {
            return i;
        }
        if (g(4, iArr)) {
            return 4;
        }
        return g(1, iArr) ? 1 : 0;
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<Void> enableTorch(final boolean z10) {
        InterfaceFutureC0509a a10;
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final m0 m0Var = this.i;
        if (m0Var.f27299c) {
            m0.b(m0Var.f27298b, Integer.valueOf(z10 ? 1 : 0));
            a10 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: t.k0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
                public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                    m0 m0Var2 = m0.this;
                    m0Var2.getClass();
                    boolean z11 = z10;
                    m0Var2.f27300d.execute(new R6.c(2, m0Var2, aVar, z11));
                    return "enableTorch: " + z11;
                }
            });
        } else {
            Logger.d("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            a10 = Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        return Futures.nonCancellationPropagating(a10);
    }

    public final boolean f() {
        int i;
        synchronized (this.f27246c) {
            i = this.f27256n;
        }
        return i > 0;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final int getFlashMode() {
        return this.f27258p;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        return this.f27254l.a();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect getSensorRect() {
        Rect rect = (Rect) this.f27247d.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r2 != 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[LOOP:0: B:24:0x00de->B:26:0x00e4, LOOP_END] */
    @Override // androidx.camera.core.impl.CameraControlInternal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.SessionConfig getSessionConfig() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1257i.getSessionConfig():androidx.camera.core.impl.SessionConfig");
    }

    public final void i(boolean z10) {
        ZoomState create;
        X x9 = this.f27250g;
        if (z10 != x9.f27170d) {
            x9.f27170d = z10;
            if (!x9.f27170d) {
                x9.b(null);
            }
        }
        p0 p0Var = this.f27251h;
        if (p0Var.f27329f != z10) {
            p0Var.f27329f = z10;
            if (!z10) {
                synchronized (p0Var.f27326c) {
                    p0Var.f27326c.b(1.0f);
                    create = ImmutableZoomState.create(p0Var.f27326c);
                }
                p0Var.c(create);
                p0Var.f27328e.g();
                p0Var.f27324a.j();
            }
        }
        m0 m0Var = this.i;
        if (m0Var.f27301e != z10) {
            m0Var.f27301e = z10;
            if (!z10) {
                if (m0Var.f27303g) {
                    m0Var.f27303g = false;
                    m0Var.f27297a.c(false);
                    m0.b(m0Var.f27298b, 0);
                }
                CallbackToFutureAdapter.a<Void> aVar = m0Var.f27302f;
                if (aVar != null) {
                    s3.b.v("Camera is not active.", aVar);
                    m0Var.f27302f = null;
                }
            }
        }
        O o10 = this.f27252j;
        if (z10 != o10.f27147d) {
            o10.f27147d = z10;
            if (!z10) {
                P p10 = o10.f27145b;
                synchronized (p10.f27150a) {
                    p10.f27152c = 0;
                }
                o10.a();
            }
        }
        z.c cVar = this.f27254l;
        cVar.getClass();
        cVar.f31207d.execute(new F.b(z10, 2, cVar));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isZslDisabledByByUserCaseConfig() {
        return this.f27253k.f27377c;
    }

    public final long j() {
        this.f27264v = this.f27261s.getAndIncrement();
        this.f27248e.onCameraControlUpdateSessionConfig();
        return this.f27264v;
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<Integer> setExposureCompensationIndex(int i) {
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        O o10 = this.f27252j;
        P p10 = o10.f27145b;
        if (!p10.isExposureCompensationSupported()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> exposureCompensationRange = p10.getExposureCompensationRange();
        if (exposureCompensationRange.contains((Range<Integer>) Integer.valueOf(i))) {
            synchronized (p10.f27150a) {
                p10.f27152c = i;
            }
            return Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new J7.a(i, 8, o10)));
        }
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Requested ExposureCompensation ", i, " is not within valid range [");
        l10.append(exposureCompensationRange.getUpper());
        l10.append("..");
        l10.append(exposureCompensationRange.getLower());
        l10.append("]");
        return Futures.immediateFailedFuture(new IllegalArgumentException(l10.toString()));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i) {
        if (!f()) {
            Logger.w("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f27258p = i;
        s0 s0Var = this.f27253k;
        boolean z10 = true;
        if (this.f27258p != 1 && this.f27258p != 0) {
            z10 = false;
        }
        s0Var.f27378d = z10;
        this.f27262t = Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new com.sumsub.sns.geo.presentation.d(this, 18)));
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<Void> setLinearZoom(float f10) {
        InterfaceFutureC0509a immediateFailedFuture;
        ZoomState create;
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        p0 p0Var = this.f27251h;
        synchronized (p0Var.f27326c) {
            try {
                p0Var.f27326c.a(f10);
                create = ImmutableZoomState.create(p0Var.f27326c);
            } catch (IllegalArgumentException e10) {
                immediateFailedFuture = Futures.immediateFailedFuture(e10);
            }
        }
        p0Var.c(create);
        immediateFailedFuture = CallbackToFutureAdapter.a(new n0(p0Var, create, 1));
        return Futures.nonCancellationPropagating(immediateFailedFuture);
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<Void> setZoomRatio(float f10) {
        InterfaceFutureC0509a immediateFailedFuture;
        ZoomState create;
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        p0 p0Var = this.f27251h;
        synchronized (p0Var.f27326c) {
            try {
                p0Var.f27326c.b(f10);
                create = ImmutableZoomState.create(p0Var.f27326c);
            } catch (IllegalArgumentException e10) {
                immediateFailedFuture = Futures.immediateFailedFuture(e10);
            }
        }
        p0Var.c(create);
        immediateFailedFuture = CallbackToFutureAdapter.a(new n0(p0Var, create, 0));
        return Futures.nonCancellationPropagating(immediateFailedFuture);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setZslDisabledByUserCaseConfig(boolean z10) {
        this.f27253k.f27377c = z10;
    }

    @Override // androidx.camera.core.CameraControl
    public final InterfaceFutureC0509a<FocusMeteringResult> startFocusAndMetering(final FocusMeteringAction focusMeteringAction) {
        if (!f()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final X x9 = this.f27250g;
        x9.getClass();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: t.Q
            public final /* synthetic */ long i = 5000;

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                X x10 = X.this;
                x10.getClass();
                x10.f27168b.execute(new androidx.camera.core.f(x10, aVar, focusMeteringAction, this.i));
                return "startFocusAndMetering";
            }
        }));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final InterfaceFutureC0509a<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, final int i, final int i9) {
        if (f()) {
            final int i10 = this.f27258p;
            return FutureChain.from(Futures.nonCancellationPropagating(this.f27262t)).transformAsync(new AsyncFunction() { // from class: t.f
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final InterfaceFutureC0509a apply(Object obj) {
                    InterfaceFutureC0509a immediateFuture;
                    r rVar = C1257i.this.f27255m;
                    x.b bVar = new x.b(rVar.f27342d, 1);
                    r.c cVar = new r.c(rVar.f27345g, rVar.f27343e, rVar.f27339a, rVar.f27344f, bVar);
                    ArrayList arrayList = cVar.f27359g;
                    int i11 = i;
                    C1257i c1257i = rVar.f27339a;
                    if (i11 == 0) {
                        arrayList.add(new r.b(c1257i));
                    }
                    boolean z10 = rVar.f27341c;
                    int i12 = i10;
                    if (z10) {
                        if (rVar.f27340b.f30895a || rVar.f27345g == 3 || i9 == 1) {
                            arrayList.add(new r.f(c1257i, i12, rVar.f27343e));
                        } else {
                            arrayList.add(new r.a(c1257i, i12, bVar));
                        }
                    }
                    InterfaceFutureC0509a immediateFuture2 = Futures.immediateFuture(null);
                    boolean isEmpty = arrayList.isEmpty();
                    r.c.a aVar = cVar.f27360h;
                    Executor executor = cVar.f27354b;
                    if (!isEmpty) {
                        if (aVar.b()) {
                            r.e eVar = new r.e(0L, null);
                            cVar.f27355c.a(eVar);
                            immediateFuture = eVar.f27363b;
                        } else {
                            immediateFuture = Futures.immediateFuture(null);
                        }
                        immediateFuture2 = FutureChain.from(immediateFuture).transformAsync(new J7.a(i12, 7, cVar), executor).transformAsync(new com.sumsub.sns.geo.presentation.d(cVar, 21), executor);
                    }
                    FutureChain transformAsync = FutureChain.from(immediateFuture2).transformAsync(new D6.a(i12, cVar, list), executor);
                    Objects.requireNonNull(aVar);
                    transformAsync.addListener(new RunnableC0615f(aVar, 17), executor);
                    return Futures.nonCancellationPropagating(transformAsync);
                }
            }, this.f27245b);
        }
        Logger.w("Camera2CameraControlImp", "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }
}

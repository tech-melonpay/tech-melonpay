package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.r;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C0559z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import pa.C1124b;
import t.B;
import t.C;
import t.C1257i;
import t.C1259k;
import t.C1262n;
import t.E;
import t.J;
import t.L;
import t.RunnableC1260l;
import t.RunnableC1261m;
import t.f0;
import u.v;

/* loaded from: classes.dex */
public final class Camera2CameraImpl implements CameraInternal {

    /* renamed from: A, reason: collision with root package name */
    public final Object f5121A;

    /* renamed from: B, reason: collision with root package name */
    public SessionProcessor f5122B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5123C;

    /* renamed from: D, reason: collision with root package name */
    public final L f5124D;

    /* renamed from: E, reason: collision with root package name */
    public final v.b f5125E;

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseAttachState f5126a;

    /* renamed from: b, reason: collision with root package name */
    public final v f5127b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5128c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f5129d;

    /* renamed from: e, reason: collision with root package name */
    public volatile InternalState f5130e = InternalState.f5151a;

    /* renamed from: f, reason: collision with root package name */
    public final LiveDataObservable<CameraInternal.State> f5131f;

    /* renamed from: g, reason: collision with root package name */
    public final E f5132g;

    /* renamed from: h, reason: collision with root package name */
    public final C1257i f5133h;
    public final e i;

    /* renamed from: j, reason: collision with root package name */
    public final C1262n f5134j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f5135k;

    /* renamed from: l, reason: collision with root package name */
    public int f5136l;

    /* renamed from: m, reason: collision with root package name */
    public J f5137m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f5138n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceFutureC0509a<Void> f5139o;

    /* renamed from: p, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f5140p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f5141q;

    /* renamed from: r, reason: collision with root package name */
    public final b f5142r;

    /* renamed from: s, reason: collision with root package name */
    public final CameraCoordinator f5143s;

    /* renamed from: t, reason: collision with root package name */
    public final CameraStateRegistry f5144t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f5145u;

    /* renamed from: v, reason: collision with root package name */
    public l f5146v;

    /* renamed from: w, reason: collision with root package name */
    public final k f5147w;

    /* renamed from: x, reason: collision with root package name */
    public final r.a f5148x;

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f5149y;

    /* renamed from: z, reason: collision with root package name */
    public CameraConfig f5150z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalState {

        /* renamed from: a, reason: collision with root package name */
        public static final InternalState f5151a;

        /* renamed from: b, reason: collision with root package name */
        public static final InternalState f5152b;

        /* renamed from: c, reason: collision with root package name */
        public static final InternalState f5153c;

        /* renamed from: d, reason: collision with root package name */
        public static final InternalState f5154d;

        /* renamed from: e, reason: collision with root package name */
        public static final InternalState f5155e;

        /* renamed from: f, reason: collision with root package name */
        public static final InternalState f5156f;

        /* renamed from: g, reason: collision with root package name */
        public static final InternalState f5157g;

        /* renamed from: h, reason: collision with root package name */
        public static final InternalState f5158h;
        public static final InternalState i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ InternalState[] f5159j;

        static {
            InternalState internalState = new InternalState("INITIALIZED", 0);
            f5151a = internalState;
            InternalState internalState2 = new InternalState("PENDING_OPEN", 1);
            f5152b = internalState2;
            InternalState internalState3 = new InternalState("OPENING", 2);
            f5153c = internalState3;
            InternalState internalState4 = new InternalState("OPENED", 3);
            f5154d = internalState4;
            InternalState internalState5 = new InternalState("CONFIGURED", 4);
            f5155e = internalState5;
            InternalState internalState6 = new InternalState("CLOSING", 5);
            f5156f = internalState6;
            InternalState internalState7 = new InternalState("REOPENING", 6);
            f5157g = internalState7;
            InternalState internalState8 = new InternalState("RELEASING", 7);
            f5158h = internalState8;
            InternalState internalState9 = new InternalState("RELEASED", 8);
            i = internalState9;
            f5159j = new InternalState[]{internalState, internalState2, internalState3, internalState4, internalState5, internalState6, internalState7, internalState8, internalState9};
        }

        public InternalState() {
            throw null;
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) f5159j.clone();
        }
    }

    public class a implements FutureCallback<Void> {
        public a() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            SessionConfig sessionConfig = null;
            if (!(th instanceof DeferrableSurface.SurfaceClosedException)) {
                if (th instanceof CancellationException) {
                    Camera2CameraImpl.this.e("Unable to configure camera cancelled", null);
                    return;
                }
                InternalState internalState = Camera2CameraImpl.this.f5130e;
                InternalState internalState2 = InternalState.f5154d;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.s(internalState2, CameraState.StateError.create(4, th), true);
                }
                if (th instanceof CameraAccessException) {
                    Camera2CameraImpl.this.e("Unable to configure camera due to " + th.getMessage(), null);
                    return;
                }
                if (th instanceof TimeoutException) {
                    Logger.e("Camera2CameraImpl", "Unable to configure camera " + Camera2CameraImpl.this.f5134j.f27304a + ", timeout!");
                    return;
                }
                return;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th).getDeferrableSurface();
            Iterator<SessionConfig> it = camera2CameraImpl.f5126a.getAttachedSessionConfigs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SessionConfig next = it.next();
                if (next.getSurfaces().contains(deferrableSurface)) {
                    sessionConfig = next;
                    break;
                }
            }
            if (sessionConfig != null) {
                Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                camera2CameraImpl2.getClass();
                ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                List<SessionConfig.ErrorListener> errorListeners = sessionConfig.getErrorListeners();
                if (errorListeners.isEmpty()) {
                    return;
                }
                SessionConfig.ErrorListener errorListener = errorListeners.get(0);
                camera2CameraImpl2.e("Posting surface closed", new Throwable());
                mainThreadExecutor.execute(new com.sumsub.sns.camera.photo.presentation.document.c(11, errorListener, sessionConfig));
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Void r22) {
            if (Camera2CameraImpl.this.f5143s.getCameraOperatingMode() == 2 && Camera2CameraImpl.this.f5130e == InternalState.f5154d) {
                Camera2CameraImpl.this.r(InternalState.f5155e);
            }
        }
    }

    public final class b extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {

        /* renamed from: a, reason: collision with root package name */
        public final String f5161a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5162b = true;

        public b(String str) {
            this.f5161a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            if (this.f5161a.equals(str)) {
                this.f5162b = true;
                if (Camera2CameraImpl.this.f5130e == InternalState.f5152b) {
                    Camera2CameraImpl.this.w(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.f5161a.equals(str)) {
                this.f5162b = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public final void onOpenAvailable() {
            if (Camera2CameraImpl.this.f5130e == InternalState.f5152b) {
                Camera2CameraImpl.this.w(false);
            }
        }
    }

    public final class c implements CameraStateRegistry.OnConfigureAvailableListener {
        public c() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public final void onConfigureAvailable() {
            if (Camera2CameraImpl.this.f5130e == InternalState.f5154d) {
                Camera2CameraImpl.this.m();
            }
        }
    }

    public final class d implements CameraControlInternal.ControlUpdateCallback {
        public d() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public final void onCameraControlCaptureRequests(List<CaptureConfig> list) {
            list.getClass();
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.getClass();
            ArrayList arrayList = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                    from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                }
                if (captureConfig.getSurfaces().isEmpty() && captureConfig.isUseRepeatingSurface()) {
                    if (from.getSurfaces().isEmpty()) {
                        Iterator<SessionConfig> it = camera2CameraImpl.f5126a.getActiveAndAttachedSessionConfigs().iterator();
                        while (it.hasNext()) {
                            List<DeferrableSurface> surfaces = it.next().getRepeatingCaptureConfig().getSurfaces();
                            if (!surfaces.isEmpty()) {
                                Iterator<DeferrableSurface> it2 = surfaces.iterator();
                                while (it2.hasNext()) {
                                    from.addSurface(it2.next());
                                }
                            }
                        }
                        if (from.getSurfaces().isEmpty()) {
                            Logger.w("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                        }
                    } else {
                        Logger.w("Camera2CameraImpl", "The capture config builder already has surface inside.");
                    }
                }
                arrayList.add(from.build());
            }
            camera2CameraImpl.e("Issue capture request", null);
            camera2CameraImpl.f5137m.d(arrayList);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public final void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.x();
        }
    }

    public final class e extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f5166a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f5167b;

        /* renamed from: c, reason: collision with root package name */
        public b f5168c;

        /* renamed from: d, reason: collision with root package name */
        public ScheduledFuture<?> f5169d;

        /* renamed from: e, reason: collision with root package name */
        public final a f5170e = new a();

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public long f5172a = -1;

            public a() {
            }

            public final int a() {
                if (!e.this.c()) {
                    return 700;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f5172a == -1) {
                    this.f5172a = uptimeMillis;
                }
                long j10 = uptimeMillis - this.f5172a;
                if (j10 <= 120000) {
                    return 1000;
                }
                return j10 <= 300000 ? 2000 : 4000;
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final Executor f5174a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f5175b = false;

            public b(Executor executor) {
                this.f5174a = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5174a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.e.b bVar = Camera2CameraImpl.e.b.this;
                        if (bVar.f5175b) {
                            return;
                        }
                        C1124b.q(Camera2CameraImpl.this.f5130e == Camera2CameraImpl.InternalState.f5157g, null);
                        if (Camera2CameraImpl.e.this.c()) {
                            Camera2CameraImpl.this.v(true);
                        } else {
                            Camera2CameraImpl.this.w(true);
                        }
                    }
                });
            }
        }

        public e(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f5166a = executor;
            this.f5167b = scheduledExecutorService;
        }

        public final boolean a() {
            if (this.f5169d == null) {
                return false;
            }
            Camera2CameraImpl.this.e("Cancelling scheduled re-open: " + this.f5168c, null);
            this.f5168c.f5175b = true;
            this.f5168c = null;
            this.f5169d.cancel(false);
            this.f5169d = null;
            return true;
        }

        public final void b() {
            C1124b.q(this.f5168c == null, null);
            C1124b.q(this.f5169d == null, null);
            a aVar = this.f5170e;
            aVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f5172a == -1) {
                aVar.f5172a = uptimeMillis;
            }
            long j10 = uptimeMillis - aVar.f5172a;
            e eVar = e.this;
            long j11 = !eVar.c() ? 10000 : 1800000;
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (j10 >= j11) {
                aVar.f5172a = -1L;
                StringBuilder sb2 = new StringBuilder("Camera reopening attempted for ");
                sb2.append(eVar.c() ? 1800000 : 10000);
                sb2.append("ms without success.");
                Logger.e("Camera2CameraImpl", sb2.toString());
                camera2CameraImpl.s(InternalState.f5152b, null, false);
                return;
            }
            this.f5168c = new b(this.f5166a);
            camera2CameraImpl.e("Attempting camera re-open in " + aVar.a() + "ms: " + this.f5168c + " activeResuming = " + camera2CameraImpl.f5123C, null);
            this.f5169d = this.f5167b.schedule(this.f5168c, (long) aVar.a(), TimeUnit.MILLISECONDS);
        }

        public final boolean c() {
            int i;
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            return camera2CameraImpl.f5123C && ((i = camera2CameraImpl.f5136l) == 1 || i == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.e("CameraDevice.onClosed()", null);
            C1124b.q(Camera2CameraImpl.this.f5135k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = Camera2CameraImpl.this.f5130e.ordinal();
            if (ordinal != 5) {
                if (ordinal == 6) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    int i = camera2CameraImpl.f5136l;
                    if (i == 0) {
                        camera2CameraImpl.w(false);
                        return;
                    } else {
                        camera2CameraImpl.e("Camera closed due to error: ".concat(Camera2CameraImpl.g(i)), null);
                        b();
                        return;
                    }
                }
                if (ordinal != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.f5130e);
                }
            }
            C1124b.q(Camera2CameraImpl.this.j(), null);
            Camera2CameraImpl.this.f();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.e("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f5135k = cameraDevice;
            camera2CameraImpl.f5136l = i;
            switch (camera2CameraImpl.f5130e.ordinal()) {
                case 2:
                case 3:
                case 4:
                case 6:
                    String id = cameraDevice.getId();
                    String g10 = Camera2CameraImpl.g(i);
                    String name = Camera2CameraImpl.this.f5130e.name();
                    StringBuilder p10 = s3.b.p("CameraDevice.onError(): ", id, " failed with ", g10, " while in ");
                    p10.append(name);
                    p10.append(" state. Will attempt recovering from error.");
                    Logger.d("Camera2CameraImpl", p10.toString());
                    InternalState internalState = Camera2CameraImpl.this.f5130e;
                    InternalState internalState2 = InternalState.f5153c;
                    InternalState internalState3 = InternalState.f5157g;
                    C1124b.q(internalState == internalState2 || Camera2CameraImpl.this.f5130e == InternalState.f5154d || Camera2CameraImpl.this.f5130e == InternalState.f5155e || Camera2CameraImpl.this.f5130e == internalState3, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.f5130e);
                    int i9 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        Logger.e("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.g(i) + " closing camera.");
                        Camera2CameraImpl.this.s(InternalState.f5156f, CameraState.StateError.create(i == 3 ? 5 : 6), true);
                        Camera2CameraImpl.this.b();
                        return;
                    }
                    Logger.d("Camera2CameraImpl", s3.b.l("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", Camera2CameraImpl.g(i), "]"));
                    Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                    C1124b.q(camera2CameraImpl2.f5136l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    if (i == 1) {
                        i9 = 2;
                    } else if (i == 2) {
                        i9 = 1;
                    }
                    camera2CameraImpl2.s(internalState3, CameraState.StateError.create(i9), true);
                    camera2CameraImpl2.b();
                    return;
                case 5:
                case 7:
                    String id2 = cameraDevice.getId();
                    String g11 = Camera2CameraImpl.g(i);
                    String name2 = Camera2CameraImpl.this.f5130e.name();
                    StringBuilder p11 = s3.b.p("CameraDevice.onError(): ", id2, " failed with ", g11, " while in ");
                    p11.append(name2);
                    p11.append(" state. Will finish closing camera.");
                    Logger.e("Camera2CameraImpl", p11.toString());
                    Camera2CameraImpl.this.b();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.f5130e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.e("CameraDevice.onOpened()", null);
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f5135k = cameraDevice;
            camera2CameraImpl.f5136l = 0;
            this.f5170e.f5172a = -1L;
            int ordinal = camera2CameraImpl.f5130e.ordinal();
            if (ordinal != 2) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        if (ordinal != 7) {
                            throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.f5130e);
                        }
                    }
                }
                C1124b.q(Camera2CameraImpl.this.j(), null);
                Camera2CameraImpl.this.f5135k.close();
                Camera2CameraImpl.this.f5135k = null;
                return;
            }
            Camera2CameraImpl.this.r(InternalState.f5154d);
            CameraStateRegistry cameraStateRegistry = Camera2CameraImpl.this.f5144t;
            String id = cameraDevice.getId();
            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
            if (cameraStateRegistry.tryOpenCaptureSession(id, camera2CameraImpl2.f5143s.getPairedConcurrentCameraId(camera2CameraImpl2.f5135k.getId()))) {
                Camera2CameraImpl.this.m();
            }
        }
    }

    public static abstract class f {
        public abstract SessionConfig a();

        public abstract Size b();

        public abstract UseCaseConfig<?> c();

        public abstract String d();

        public abstract Class<?> e();
    }

    public Camera2CameraImpl(v vVar, String str, C1262n c1262n, y.a aVar, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler, L l10) {
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.f5131f = liveDataObservable;
        this.f5136l = 0;
        this.f5138n = new AtomicInteger(0);
        this.f5141q = new LinkedHashMap();
        this.f5145u = new HashSet();
        this.f5149y = new HashSet();
        this.f5150z = CameraConfigs.emptyConfig();
        this.f5121A = new Object();
        this.f5123C = false;
        this.f5127b = vVar;
        this.f5143s = aVar;
        this.f5144t = cameraStateRegistry;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.f5129d = newHandlerExecutor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.f5128c = newSequentialExecutor;
        this.i = new e(newSequentialExecutor, newHandlerExecutor);
        this.f5126a = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        E e10 = new E(cameraStateRegistry);
        this.f5132g = e10;
        k kVar = new k(newSequentialExecutor);
        this.f5147w = kVar;
        this.f5124D = l10;
        try {
            u.n b9 = vVar.b(str);
            C1257i c1257i = new C1257i(b9, newHandlerExecutor, newSequentialExecutor, new d(), c1262n.f27312j);
            this.f5133h = c1257i;
            this.f5134j = c1262n;
            c1262n.b(c1257i);
            c1262n.f27311h.b(e10.f27122b);
            this.f5125E = v.b.a(b9);
            this.f5137m = k();
            this.f5148x = new r.a(handler, kVar, c1262n.f27312j, w.k.f30775a, newSequentialExecutor, newHandlerExecutor);
            b bVar = new b(str);
            this.f5142r = bVar;
            cameraStateRegistry.registerCamera(this, newSequentialExecutor, new c(), bVar);
            vVar.f30074a.c(newSequentialExecutor, bVar);
        } catch (CameraAccessExceptionCompat e11) {
            throw C1124b.t(e11);
        }
    }

    public static String g(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String h(l lVar) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        lVar.getClass();
        sb2.append(lVar.hashCode());
        return sb2.toString();
    }

    public static String i(UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    public static ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            arrayList2.add(new androidx.camera.camera2.internal.a(i(useCase), useCase.getClass(), useCase.getSessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution()));
        }
        return arrayList2;
    }

    public final void a() {
        UseCaseAttachState useCaseAttachState = this.f5126a;
        SessionConfig build = useCaseAttachState.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.f5146v == null) {
                this.f5146v = new l(this.f5134j.f27305b, this.f5124D, new C1259k(this, 1));
            }
            l lVar = this.f5146v;
            if (lVar != null) {
                String h9 = h(lVar);
                l lVar2 = this.f5146v;
                useCaseAttachState.setUseCaseAttached(h9, lVar2.f5267b, lVar2.f5268c);
                l lVar3 = this.f5146v;
                useCaseAttachState.setUseCaseActive(h9, lVar3.f5267b, lVar3.f5268c);
                return;
            }
            return;
        }
        if (size2 == 1 && size == 1) {
            p();
            return;
        }
        if (size >= 2) {
            p();
            return;
        }
        Logger.d("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        C1257i c1257i = this.f5133h;
        synchronized (c1257i.f27246c) {
            c1257i.f27256n++;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String i = i(useCase);
            HashSet hashSet = this.f5149y;
            if (!hashSet.contains(i)) {
                hashSet.add(i);
                useCase.onStateAttached();
                useCase.onCameraControlReady();
            }
        }
        try {
            this.f5128c.execute(new com.sumsub.sns.camera.photo.presentation.document.c(14, this, new ArrayList(t(arrayList))));
        } catch (RejectedExecutionException e10) {
            e("Unable to attach use cases.", e10);
            c1257i.b();
        }
    }

    public final void b() {
        C1124b.q(this.f5130e == InternalState.f5156f || this.f5130e == InternalState.f5158h || (this.f5130e == InternalState.f5157g && this.f5136l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f5130e + " (error: " + g(this.f5136l) + ")");
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) this.f5134j.f27305b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            num.getClass();
            if (num.intValue() == 2 && this.f5136l == 0) {
                CaptureSession captureSession = new CaptureSession(this.f5125E);
                this.f5145u.add(captureSession);
                q();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                com.sumsub.sns.camera.photo.presentation.document.c cVar = new com.sumsub.sns.camera.photo.presentation.document.c(13, surface, surfaceTexture);
                SessionConfig.Builder builder = new SessionConfig.Builder();
                ImmediateSurface immediateSurface = new ImmediateSurface(surface);
                builder.addNonRepeatingSurface(immediateSurface);
                builder.setTemplateType(1);
                e("Start configAndClose.", null);
                SessionConfig build = builder.build();
                CameraDevice cameraDevice = this.f5135k;
                cameraDevice.getClass();
                captureSession.f(build, cameraDevice, this.f5148x.a()).addListener(new M.g(this, captureSession, immediateSurface, cVar, 4), this.f5128c);
                this.f5137m.a();
            }
        }
        q();
        this.f5137m.a();
    }

    public final void c() {
        e("Closing camera.", null);
        int ordinal = this.f5130e.ordinal();
        if (ordinal == 1) {
            C1124b.q(this.f5135k == null, null);
            r(InternalState.f5151a);
            return;
        }
        InternalState internalState = InternalState.f5156f;
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                r(internalState);
                b();
                return;
            } else if (ordinal != 6) {
                e("close() ignored due to being in state: " + this.f5130e, null);
                return;
            }
        }
        boolean a10 = this.i.a();
        r(internalState);
        if (a10) {
            C1124b.q(j(), null);
            f();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void close() {
        this.f5128c.execute(new RunnableC1260l(this, 1));
    }

    public final CameraDevice.StateCallback d() {
        ArrayList arrayList = new ArrayList(this.f5126a.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.f5147w.f5264f);
        arrayList.add(this.i);
        return arrayList.isEmpty() ? new C() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new B(arrayList);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(t(arrayList));
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String i = i(useCase);
            HashSet hashSet = this.f5149y;
            if (hashSet.contains(i)) {
                useCase.onStateDetached();
                hashSet.remove(i);
            }
        }
        this.f5128c.execute(new androidx.camera.camera2.internal.b(this, arrayList2, 0));
    }

    public final void e(String str, Throwable th) {
        Logger.d("Camera2CameraImpl", s3.b.k("{", toString(), "} ", str), th);
    }

    public final void f() {
        InternalState internalState = this.f5130e;
        InternalState internalState2 = InternalState.f5158h;
        InternalState internalState3 = InternalState.f5156f;
        C1124b.q(internalState == internalState2 || this.f5130e == internalState3, null);
        C1124b.q(this.f5141q.isEmpty(), null);
        this.f5135k = null;
        if (this.f5130e == internalState3) {
            r(InternalState.f5151a);
            return;
        }
        this.f5127b.f30074a.a(this.f5142r);
        r(InternalState.i);
        CallbackToFutureAdapter.a<Void> aVar = this.f5140p;
        if (aVar != null) {
            aVar.b(null);
            this.f5140p = null;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.f5133h;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.f5134j;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable<CameraInternal.State> getCameraState() {
        return this.f5131f;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        return this.f5150z;
    }

    public final boolean j() {
        return this.f5141q.isEmpty() && this.f5145u.isEmpty();
    }

    public final J k() {
        synchronized (this.f5121A) {
            try {
                if (this.f5122B == null) {
                    return new CaptureSession(this.f5125E);
                }
                return new ProcessingCaptureSession(this.f5122B, this.f5134j, this.f5125E, this.f5128c, this.f5129d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void l(boolean z10) {
        e eVar = this.i;
        if (!z10) {
            eVar.f5170e.f5172a = -1L;
        }
        eVar.a();
        e("Opening camera.", null);
        r(InternalState.f5153c);
        try {
            this.f5127b.f30074a.e(this.f5134j.f27304a, this.f5128c, d());
        } catch (CameraAccessExceptionCompat e10) {
            e("Unable to open camera due to " + e10.getMessage(), null);
            if (e10.f5238a != 10001) {
                return;
            }
            s(InternalState.f5151a, CameraState.StateError.create(7, e10), true);
        } catch (SecurityException e11) {
            e("Unable to open camera due to " + e11.getMessage(), null);
            r(InternalState.f5157g);
            eVar.b();
        }
    }

    public final void m() {
        C1124b.q(this.f5130e == InternalState.f5154d, null);
        SessionConfig.ValidatingBuilder attachedBuilder = this.f5126a.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            e("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f5144t.tryOpenCaptureSession(this.f5135k.getId(), this.f5143s.getPairedConcurrentCameraId(this.f5135k.getId()))) {
            e("Unable to create capture session in camera operating mode = " + this.f5143s.getCameraOperatingMode(), null);
            return;
        }
        HashMap hashMap = new HashMap();
        Collection<SessionConfig> attachedSessionConfigs = this.f5126a.getAttachedSessionConfigs();
        Collection<UseCaseConfig<?>> attachedUseCaseConfigs = this.f5126a.getAttachedUseCaseConfigs();
        Config.Option<Long> option = f0.f27212a;
        ArrayList arrayList = new ArrayList(attachedUseCaseConfigs);
        Iterator<SessionConfig> it = attachedSessionConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SessionConfig next = it.next();
            Config implementationOptions = next.getImplementationOptions();
            Config.Option<Long> option2 = f0.f27212a;
            if (implementationOptions.containsOption(option2) && next.getSurfaces().size() != 1) {
                Logger.e("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.getSurfaces().size())));
                break;
            }
            if (next.getImplementationOptions().containsOption(option2)) {
                int i = 0;
                for (SessionConfig sessionConfig : attachedSessionConfigs) {
                    if (((UseCaseConfig) arrayList.get(i)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                        hashMap.put(sessionConfig.getSurfaces().get(0), 1L);
                    } else if (sessionConfig.getImplementationOptions().containsOption(option2)) {
                        hashMap.put(sessionConfig.getSurfaces().get(0), (Long) sessionConfig.getImplementationOptions().retrieveOption(option2));
                    }
                    i++;
                }
            }
        }
        this.f5137m.b(hashMap);
        J j10 = this.f5137m;
        SessionConfig build = attachedBuilder.build();
        CameraDevice cameraDevice = this.f5135k;
        cameraDevice.getClass();
        Futures.addCallback(j10.f(build, cameraDevice, this.f5148x.a()), new a(), this.f5128c);
    }

    public final void n() {
        int ordinal = this.f5130e.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            v(false);
            return;
        }
        if (ordinal != 5) {
            e("open() ignored due to being in state: " + this.f5130e, null);
            return;
        }
        r(InternalState.f5157g);
        if (j() || this.f5136l != 0) {
            return;
        }
        C1124b.q(this.f5135k != null, "Camera Device should be open if session close is not complete");
        r(InternalState.f5154d);
        m();
    }

    public final InterfaceFutureC0509a o(J j10) {
        j10.close();
        InterfaceFutureC0509a release = j10.release();
        e("Releasing session in state " + this.f5130e.name(), null);
        this.f5141q.put(j10, release);
        Futures.addCallback(release, new androidx.camera.camera2.internal.e(this, j10), CameraXExecutors.directExecutor());
        return release;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(UseCase useCase) {
        useCase.getClass();
        this.f5128c.execute(new RunnableC1261m(this, i(useCase), useCase.getSessionConfig(), useCase.getCurrentConfig(), 1));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(UseCase useCase) {
        useCase.getClass();
        this.f5128c.execute(new com.sumsub.sns.camera.photo.presentation.document.c(15, this, i(useCase)));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(UseCase useCase) {
        useCase.getClass();
        this.f5128c.execute(new androidx.camera.camera2.internal.d(this, i(useCase), useCase.getSessionConfig(), useCase.getCurrentConfig()));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(UseCase useCase) {
        useCase.getClass();
        this.f5128c.execute(new RunnableC1261m(this, i(useCase), useCase.getSessionConfig(), useCase.getCurrentConfig(), 0));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void open() {
        this.f5128c.execute(new RunnableC1260l(this, 0));
    }

    public final void p() {
        if (this.f5146v != null) {
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f5146v.getClass();
            sb2.append(this.f5146v.hashCode());
            String sb3 = sb2.toString();
            UseCaseAttachState useCaseAttachState = this.f5126a;
            useCaseAttachState.setUseCaseDetached(sb3);
            StringBuilder sb4 = new StringBuilder("MeteringRepeating");
            this.f5146v.getClass();
            sb4.append(this.f5146v.hashCode());
            useCaseAttachState.setUseCaseInactive(sb4.toString());
            l lVar = this.f5146v;
            lVar.getClass();
            Logger.d("MeteringRepeating", "MeteringRepeating clear!");
            ImmediateSurface immediateSurface = lVar.f5266a;
            if (immediateSurface != null) {
                immediateSurface.close();
            }
            lVar.f5266a = null;
            this.f5146v = null;
        }
    }

    public final void q() {
        C1124b.q(this.f5137m != null, null);
        e("Resetting Capture Session", null);
        J j10 = this.f5137m;
        SessionConfig sessionConfig = j10.getSessionConfig();
        List<CaptureConfig> c2 = j10.c();
        J k3 = k();
        this.f5137m = k3;
        k3.e(sessionConfig);
        this.f5137m.d(c2);
        o(j10);
    }

    public final void r(InternalState internalState) {
        s(internalState, null, true);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final InterfaceFutureC0509a<Void> release() {
        return CallbackToFutureAdapter.a(new C1259k(this, 0));
    }

    public final void s(InternalState internalState, CameraState.StateError stateError, boolean z10) {
        CameraInternal.State state;
        CameraState create;
        e("Transitioning camera internal state: " + this.f5130e + " --> " + internalState, null);
        this.f5130e = internalState;
        switch (internalState.ordinal()) {
            case 0:
                state = CameraInternal.State.CLOSED;
                break;
            case 1:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 2:
            case 6:
                state = CameraInternal.State.OPENING;
                break;
            case 3:
                state = CameraInternal.State.OPEN;
                break;
            case 4:
                state = CameraInternal.State.CONFIGURED;
                break;
            case 5:
                state = CameraInternal.State.CLOSING;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.f5144t.markCameraState(this, state, z10);
        this.f5131f.postValue(state);
        E e10 = this.f5132g;
        e10.getClass();
        switch (E.a.f27123a[state.ordinal()]) {
            case 1:
                if (!e10.f27121a.isCameraClosing()) {
                    create = CameraState.create(CameraState.Type.PENDING_OPEN);
                    break;
                } else {
                    create = CameraState.create(CameraState.Type.OPENING);
                    break;
                }
            case 2:
                create = CameraState.create(CameraState.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                create = CameraState.create(CameraState.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                create = CameraState.create(CameraState.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                create = CameraState.create(CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.d("CameraStateMachine", "New public camera state " + create + " from " + state + " and " + stateError);
        C0559z<CameraState> c0559z = e10.f27122b;
        if (Objects.equals(c0559z.getValue(), create)) {
            return;
        }
        Logger.d("CameraStateMachine", "Publishing new public camera state " + create);
        c0559z.postValue(create);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setActiveResumingMode(final boolean z10) {
        this.f5128c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                boolean z11 = z10;
                camera2CameraImpl.f5123C = z11;
                if (z11 && camera2CameraImpl.f5130e == Camera2CameraImpl.InternalState.f5152b) {
                    camera2CameraImpl.v(false);
                }
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final void setExtendedConfig(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.emptyConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.f5150z = cameraConfig;
        synchronized (this.f5121A) {
            this.f5122B = sessionProcessor;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f5134j.f27304a);
    }

    public final void u(List list) {
        Size b9;
        boolean isEmpty = this.f5126a.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!this.f5126a.isUseCaseAttached(fVar.d())) {
                this.f5126a.setUseCaseAttached(fVar.d(), fVar.a(), fVar.c());
                arrayList.add(fVar.d());
                if (fVar.e() == Preview.class && (b9 = fVar.b()) != null) {
                    rational = new Rational(b9.getWidth(), b9.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        e("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED", null);
        if (isEmpty) {
            this.f5133h.i(true);
            C1257i c1257i = this.f5133h;
            synchronized (c1257i.f27246c) {
                c1257i.f27256n++;
            }
        }
        a();
        y();
        x();
        q();
        if (this.f5130e == InternalState.f5154d) {
            m();
        } else {
            n();
        }
        if (rational != null) {
            this.f5133h.f27250g.f27171e = rational;
        }
    }

    public final void v(boolean z10) {
        e("Attempting to force open the camera.", null);
        if (this.f5144t.tryOpenCamera(this)) {
            l(z10);
        } else {
            e("No cameras available. Waiting for available camera before opening camera.", null);
            r(InternalState.f5152b);
        }
    }

    public final void w(boolean z10) {
        e("Attempting to open the camera.", null);
        if (this.f5142r.f5162b && this.f5144t.tryOpenCamera(this)) {
            l(z10);
        } else {
            e("No cameras available. Waiting for available camera before opening camera.", null);
            r(InternalState.f5152b);
        }
    }

    public final void x() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.f5126a.getActiveAndAttachedBuilder();
        boolean isValid = activeAndAttachedBuilder.isValid();
        C1257i c1257i = this.f5133h;
        if (!isValid) {
            c1257i.f27263u = 1;
            c1257i.f27250g.f27179n = 1;
            c1257i.f27255m.f27345g = 1;
            this.f5137m.e(c1257i.getSessionConfig());
            return;
        }
        int templateType = activeAndAttachedBuilder.build().getTemplateType();
        c1257i.f27263u = templateType;
        c1257i.f27250g.f27179n = templateType;
        c1257i.f27255m.f27345g = templateType;
        activeAndAttachedBuilder.add(c1257i.getSessionConfig());
        this.f5137m.e(activeAndAttachedBuilder.build());
    }

    public final void y() {
        Iterator<UseCaseConfig<?>> it = this.f5126a.getAttachedUseCaseConfigs().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= it.next().isZslDisabled(false);
        }
        this.f5133h.setZslDisabledByUserCaseConfig(z10);
    }
}

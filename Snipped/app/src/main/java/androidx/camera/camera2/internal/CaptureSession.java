package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.s;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import pa.C1124b;
import t.C1263o;
import t.C1268u;
import t.H;
import t.I;
import t.J;
import v.f;

/* loaded from: classes.dex */
public final class CaptureSession implements J {

    /* renamed from: e, reason: collision with root package name */
    public r f5181e;

    /* renamed from: f, reason: collision with root package name */
    public o f5182f;

    /* renamed from: g, reason: collision with root package name */
    public SessionConfig f5183g;

    /* renamed from: l, reason: collision with root package name */
    public State f5187l;

    /* renamed from: m, reason: collision with root package name */
    public CallbackToFutureAdapter.c f5188m;

    /* renamed from: n, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f5189n;

    /* renamed from: r, reason: collision with root package name */
    public final v.b f5193r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5177a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5178b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a f5179c = new a();

    /* renamed from: h, reason: collision with root package name */
    public OptionsBundle f5184h = OptionsBundle.emptyBundle();
    public s.c i = s.c.a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5185j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public List<DeferrableSurface> f5186k = Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    public Map<DeferrableSurface, Long> f5190o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final x.l f5191p = new x.l();

    /* renamed from: q, reason: collision with root package name */
    public final x.n f5192q = new x.n();

    /* renamed from: d, reason: collision with root package name */
    public final c f5180d = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f5194a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f5195b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f5196c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f5197d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f5198e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f5199f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f5200g;

        /* renamed from: h, reason: collision with root package name */
        public static final State f5201h;
        public static final /* synthetic */ State[] i;

        static {
            State state = new State("UNINITIALIZED", 0);
            f5194a = state;
            State state2 = new State("INITIALIZED", 1);
            f5195b = state2;
            State state3 = new State("GET_SURFACE", 2);
            f5196c = state3;
            State state4 = new State("OPENING", 3);
            f5197d = state4;
            State state5 = new State("OPENED", 4);
            f5198e = state5;
            State state6 = new State("CLOSED", 5);
            f5199f = state6;
            State state7 = new State("RELEASING", 6);
            f5200g = state7;
            State state8 = new State("RELEASED", 7);
            f5201h = state8;
            i = new State[]{state, state2, state3, state4, state5, state6, state7, state8};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) i.clone();
        }
    }

    public class b implements FutureCallback<Void> {
        public b() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            synchronized (CaptureSession.this.f5177a) {
                try {
                    CaptureSession.this.f5181e.f5293a.stop();
                    int ordinal = CaptureSession.this.f5187l.ordinal();
                    if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th instanceof CancellationException)) {
                        Logger.w("CaptureSession", "Opening session with fail " + CaptureSession.this.f5187l, th);
                        CaptureSession.this.h();
                    }
                } finally {
                }
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    public final class c extends o.a {
        public c() {
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void m(o oVar) {
            synchronized (CaptureSession.this.f5177a) {
                try {
                    switch (CaptureSession.this.f5187l.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.f5187l);
                        case 3:
                        case 5:
                        case 6:
                            CaptureSession.this.h();
                            break;
                        case 7:
                            Logger.d("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    Logger.e("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.f5187l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void n(p pVar) {
            synchronized (CaptureSession.this.f5177a) {
                try {
                    switch (CaptureSession.this.f5187l.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.f5187l);
                        case 3:
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.f5187l = State.f5198e;
                            captureSession.f5182f = pVar;
                            if (captureSession.f5183g != null) {
                                List<s.b> allItems = captureSession.i.getAllItems();
                                ArrayList arrayList = new ArrayList();
                                Iterator<s.b> it = allItems.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next());
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((s.b) it2.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    CaptureSession captureSession2 = CaptureSession.this;
                                    captureSession2.k(captureSession2.n(arrayList2));
                                }
                            }
                            Logger.d("CaptureSession", "Attempting to send capture request onConfigured");
                            CaptureSession captureSession3 = CaptureSession.this;
                            captureSession3.l(captureSession3.f5183g);
                            CaptureSession captureSession4 = CaptureSession.this;
                            ArrayList arrayList3 = captureSession4.f5178b;
                            if (!arrayList3.isEmpty()) {
                                try {
                                    captureSession4.k(arrayList3);
                                } finally {
                                    arrayList3.clear();
                                }
                            }
                            Logger.d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f5187l);
                            break;
                        case 5:
                            CaptureSession.this.f5182f = pVar;
                            Logger.d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f5187l);
                            break;
                        case 6:
                            pVar.close();
                            Logger.d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f5187l);
                            break;
                        default:
                            Logger.d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f5187l);
                            break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void o(p pVar) {
            synchronized (CaptureSession.this.f5177a) {
                try {
                    if (CaptureSession.this.f5187l.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.f5187l);
                    }
                    Logger.d("CaptureSession", "CameraCaptureSession.onReady() " + CaptureSession.this.f5187l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.o.a
        public final void p(o oVar) {
            synchronized (CaptureSession.this.f5177a) {
                try {
                    if (CaptureSession.this.f5187l == State.f5194a) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.f5187l);
                    }
                    Logger.d("CaptureSession", "onSessionFinished()");
                    CaptureSession.this.h();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CaptureSession(v.b bVar) {
        this.f5187l = State.f5194a;
        this.f5187l = State.f5195b;
        this.f5193r = bVar;
    }

    public static C1263o g(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c1263o;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
            if (cameraCaptureCallback == null) {
                c1263o = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                H.a(cameraCaptureCallback, arrayList2);
                c1263o = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C1263o(arrayList2);
            }
            arrayList.add(c1263o);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C1263o(arrayList);
    }

    public static ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.f fVar = (v.f) it.next();
            if (!arrayList2.contains(fVar.f30493a.getSurface())) {
                arrayList2.add(fVar.f30493a.getSurface());
                arrayList3.add(fVar);
            }
        }
        return arrayList3;
    }

    public static MutableOptionsBundle m(ArrayList arrayList) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Config implementationOptions = ((CaptureConfig) it.next()).getImplementationOptions();
            for (Config.Option<?> option : implementationOptions.listOptions()) {
                Object retrieveOption = implementationOptions.retrieveOption(option, null);
                if (create.containsOption(option)) {
                    Object retrieveOption2 = create.retrieveOption(option, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        Logger.d("CaptureSession", "Detect conflicting option " + option.getId() + " : " + retrieveOption + " != " + retrieveOption2);
                    }
                } else {
                    create.insertOption(option, retrieveOption);
                }
            }
        }
        return create;
    }

    @Override // t.J
    public final void a() {
        ArrayList arrayList;
        synchronized (this.f5177a) {
            try {
                if (this.f5178b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f5178b);
                    this.f5178b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<CameraCaptureCallback> it2 = ((CaptureConfig) it.next()).getCameraCaptureCallbacks().iterator();
                while (it2.hasNext()) {
                    it2.next().onCaptureCancelled();
                }
            }
        }
    }

    @Override // t.J
    public final void b(HashMap hashMap) {
        synchronized (this.f5177a) {
            this.f5190o = hashMap;
        }
    }

    @Override // t.J
    public final List<CaptureConfig> c() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.f5177a) {
            unmodifiableList = Collections.unmodifiableList(this.f5178b);
        }
        return unmodifiableList;
    }

    @Override // t.J
    public final void close() {
        synchronized (this.f5177a) {
            int ordinal = this.f5187l.ordinal();
            if (ordinal == 0) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f5187l);
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (this.f5183g != null) {
                                List<s.b> allItems = this.i.getAllItems();
                                ArrayList arrayList = new ArrayList();
                                Iterator<s.b> it = allItems.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next());
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((s.b) it2.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    try {
                                        d(n(arrayList2));
                                    } catch (IllegalStateException e10) {
                                        Logger.e("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                    }
                                }
                            }
                        }
                    }
                    C1124b.p(this.f5181e, "The Opener shouldn't null in state:" + this.f5187l);
                    this.f5181e.f5293a.stop();
                    this.f5187l = State.f5199f;
                    this.f5183g = null;
                } else {
                    C1124b.p(this.f5181e, "The Opener shouldn't null in state:" + this.f5187l);
                    this.f5181e.f5293a.stop();
                }
            }
            this.f5187l = State.f5201h;
        }
    }

    @Override // t.J
    public final void d(List<CaptureConfig> list) {
        synchronized (this.f5177a) {
            try {
                switch (this.f5187l.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f5187l);
                    case 1:
                    case 2:
                    case 3:
                        this.f5178b.addAll(list);
                        break;
                    case 4:
                        this.f5178b.addAll(list);
                        ArrayList arrayList = this.f5178b;
                        if (!arrayList.isEmpty()) {
                            try {
                                k(arrayList);
                                arrayList.clear();
                            } catch (Throwable th) {
                                arrayList.clear();
                                throw th;
                            }
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // t.J
    public final void e(SessionConfig sessionConfig) {
        synchronized (this.f5177a) {
            try {
                switch (this.f5187l.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f5187l);
                    case 1:
                    case 2:
                    case 3:
                        this.f5183g = sessionConfig;
                        break;
                    case 4:
                        this.f5183g = sessionConfig;
                        if (sessionConfig != null) {
                            if (!this.f5185j.keySet().containsAll(sessionConfig.getSurfaces())) {
                                Logger.e("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                Logger.d("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                l(this.f5183g);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // t.J
    public final InterfaceFutureC0509a<Void> f(final SessionConfig sessionConfig, final CameraDevice cameraDevice, r rVar) {
        synchronized (this.f5177a) {
            try {
                if (this.f5187l.ordinal() != 1) {
                    Logger.e("CaptureSession", "Open not allowed in state: " + this.f5187l);
                    return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.f5187l));
                }
                this.f5187l = State.f5196c;
                ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                this.f5186k = arrayList;
                this.f5181e = rVar;
                FutureChain transformAsync = FutureChain.from(rVar.f5293a.a(arrayList)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.j
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final InterfaceFutureC0509a apply(Object obj) {
                        InterfaceFutureC0509a<Void> immediateFailedFuture;
                        CaptureSession captureSession = CaptureSession.this;
                        SessionConfig sessionConfig2 = sessionConfig;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (captureSession.f5177a) {
                            try {
                                int ordinal = captureSession.f5187l.ordinal();
                                if (ordinal != 0 && ordinal != 1) {
                                    if (ordinal == 2) {
                                        captureSession.f5185j.clear();
                                        for (int i = 0; i < list.size(); i++) {
                                            captureSession.f5185j.put(captureSession.f5186k.get(i), (Surface) list.get(i));
                                        }
                                        captureSession.f5187l = CaptureSession.State.f5197d;
                                        Logger.d("CaptureSession", "Opening capture session.");
                                        s sVar = new s(Arrays.asList(captureSession.f5180d, new s.a(sessionConfig2.getSessionStateCallbacks())));
                                        Config implementationOptions = sessionConfig2.getImplementationOptions();
                                        s.a aVar = new s.a(implementationOptions);
                                        s.c cVar = (s.c) implementationOptions.retrieveOption(s.a.f26492g, s.c.a());
                                        captureSession.i = cVar;
                                        List<s.b> allItems = cVar.getAllItems();
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator<s.b> it = allItems.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(it.next());
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            ((s.b) it2.next()).getClass();
                                        }
                                        CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig2.getRepeatingCaptureConfig());
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            from.addImplementationOptions(((CaptureConfig) it3.next()).getImplementationOptions());
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        CaptureRequest captureRequest = null;
                                        String str = (String) aVar.f31213a.retrieveOption(s.a.i, null);
                                        for (SessionConfig.OutputConfig outputConfig : sessionConfig2.getOutputConfigs()) {
                                            v.f i9 = captureSession.i(outputConfig, captureSession.f5185j, str);
                                            if (captureSession.f5190o.containsKey(outputConfig.getSurface())) {
                                                i9.f30493a.a(captureSession.f5190o.get(outputConfig.getSurface()).longValue());
                                            }
                                            arrayList4.add(i9);
                                        }
                                        ArrayList j10 = CaptureSession.j(arrayList4);
                                        p pVar = (p) captureSession.f5181e.f5293a;
                                        pVar.f5283f = sVar;
                                        v.l lVar = new v.l(j10, pVar.f5281d, new q(pVar));
                                        if (sessionConfig2.getTemplateType() == 5 && sessionConfig2.getInputConfiguration() != null) {
                                            lVar.f30502a.c(v.e.a(sessionConfig2.getInputConfiguration()));
                                        }
                                        CaptureConfig build = from.build();
                                        if (cameraDevice2 != null) {
                                            CaptureRequest.Builder createCaptureRequest = cameraDevice2.createCaptureRequest(build.getTemplateType());
                                            C1268u.a(createCaptureRequest, build.getImplementationOptions());
                                            captureRequest = createCaptureRequest.build();
                                        }
                                        if (captureRequest != null) {
                                            lVar.f30502a.h(captureRequest);
                                        }
                                        immediateFailedFuture = captureSession.f5181e.f5293a.g(cameraDevice2, lVar, captureSession.f5186k);
                                    } else if (ordinal != 4) {
                                        immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + captureSession.f5187l));
                                    }
                                }
                                immediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + captureSession.f5187l));
                            } catch (CameraAccessException e10) {
                                immediateFailedFuture = Futures.immediateFailedFuture(e10);
                            } finally {
                            }
                        }
                        return immediateFailedFuture;
                    }
                }, ((p) this.f5181e.f5293a).f5281d);
                Futures.addCallback(transformAsync, new b(), ((p) this.f5181e.f5293a).f5281d);
                return Futures.nonCancellationPropagating(transformAsync);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.J
    public final SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.f5177a) {
            sessionConfig = this.f5183g;
        }
        return sessionConfig;
    }

    public final void h() {
        State state = this.f5187l;
        State state2 = State.f5201h;
        if (state == state2) {
            Logger.d("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f5187l = state2;
        this.f5182f = null;
        CallbackToFutureAdapter.a<Void> aVar = this.f5189n;
        if (aVar != null) {
            aVar.b(null);
            this.f5189n = null;
        }
    }

    public final v.f i(SessionConfig.OutputConfig outputConfig, HashMap hashMap, String str) {
        long j10;
        Surface surface = (Surface) hashMap.get(outputConfig.getSurface());
        C1124b.p(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        v.f fVar = new v.f(outputConfig.getSurfaceGroupId(), surface);
        f.a aVar = fVar.f30493a;
        if (str != null) {
            aVar.f(str);
        } else {
            aVar.f(outputConfig.getPhysicalCameraId());
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            aVar.e();
            Iterator<DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) hashMap.get(it.next());
                C1124b.p(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                aVar.b(surface2);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            v.b bVar = this.f5193r;
            bVar.getClass();
            C1124b.q(i >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
            DynamicRangeProfiles unwrap = bVar.f30487a.unwrap();
            if (unwrap != null) {
                DynamicRange dynamicRange = outputConfig.getDynamicRange();
                Long a10 = v.a.a(dynamicRange, unwrap);
                if (a10 != null) {
                    j10 = a10.longValue();
                    aVar.c(j10);
                    return fVar;
                }
                Logger.e("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
            }
        }
        j10 = 1;
        aVar.c(j10);
        return fVar;
    }

    public final int k(ArrayList arrayList) {
        h hVar;
        ArrayList arrayList2;
        boolean z10;
        synchronized (this.f5177a) {
            try {
                if (this.f5187l != State.f5198e) {
                    Logger.d("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    hVar = new h();
                    arrayList2 = new ArrayList();
                    Logger.d("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        CaptureConfig captureConfig = (CaptureConfig) it.next();
                        if (captureConfig.getSurfaces().isEmpty()) {
                            Logger.d("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator<DeferrableSurface> it2 = captureConfig.getSurfaces().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    DeferrableSurface next = it2.next();
                                    if (!this.f5185j.containsKey(next)) {
                                        Logger.d("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (captureConfig.getTemplateType() == 2) {
                                        z10 = true;
                                    }
                                    CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                                    if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                        from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                    }
                                    SessionConfig sessionConfig = this.f5183g;
                                    if (sessionConfig != null) {
                                        from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                    }
                                    from.addImplementationOptions(this.f5184h);
                                    from.addImplementationOptions(captureConfig.getImplementationOptions());
                                    CaptureRequest b9 = C1268u.b(from.build(), this.f5182f.e(), this.f5185j);
                                    if (b9 == null) {
                                        Logger.d("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator<CameraCaptureCallback> it3 = captureConfig.getCameraCaptureCallbacks().iterator();
                                    while (it3.hasNext()) {
                                        H.a(it3.next(), arrayList3);
                                    }
                                    hVar.a(b9, arrayList3);
                                    arrayList2.add(b9);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e10) {
                    Logger.e("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    Logger.d("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f5191p.a(arrayList2, z10)) {
                    this.f5182f.stopRepeating();
                    hVar.f5255b = new i(this);
                }
                if (this.f5192q.b(arrayList2, z10)) {
                    hVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new I(this)));
                }
                return this.f5182f.h(arrayList2, hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int l(SessionConfig sessionConfig) {
        synchronized (this.f5177a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (sessionConfig == null) {
                Logger.d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f5187l != State.f5198e) {
                Logger.d("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f5182f.stopRepeating();
                } catch (CameraAccessException e10) {
                    Logger.e("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                Logger.d("CaptureSession", "Issuing request for session.");
                CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                List<s.b> allItems = this.i.getAllItems();
                ArrayList arrayList = new ArrayList();
                Iterator<s.b> it = allItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((s.b) it2.next()).getClass();
                }
                MutableOptionsBundle m2 = m(arrayList2);
                this.f5184h = m2;
                from.addImplementationOptions(m2);
                CaptureRequest b9 = C1268u.b(from.build(), this.f5182f.e(), this.f5185j);
                if (b9 == null) {
                    Logger.d("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f5182f.f(b9, g(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.f5179c));
            } catch (CameraAccessException e11) {
                Logger.e("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    public final ArrayList n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from((CaptureConfig) it.next());
            from.setTemplateType(1);
            Iterator<DeferrableSurface> it2 = this.f5183g.getRepeatingCaptureConfig().getSurfaces().iterator();
            while (it2.hasNext()) {
                from.addSurface(it2.next());
            }
            arrayList2.add(from.build());
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x001a, LOOP:0: B:15:0x002c->B:17:0x0032, LOOP_END, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x00ad, B:11:0x0012, B:13:0x0016, B:14:0x001d, B:15:0x002c, B:17:0x0032, B:19:0x003c, B:20:0x0040, B:22:0x0046, B:24:0x0050, B:26:0x0076, B:27:0x007a, B:29:0x007e, B:30:0x008b, B:31:0x008d, B:33:0x008f, B:34:0x00a9, B:35:0x00b4, B:36:0x00c7), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x001a, LOOP:1: B:20:0x0040->B:22:0x0046, LOOP_END, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x00ad, B:11:0x0012, B:13:0x0016, B:14:0x001d, B:15:0x002c, B:17:0x0032, B:19:0x003c, B:20:0x0040, B:22:0x0046, B:24:0x0050, B:26:0x0076, B:27:0x007a, B:29:0x007e, B:30:0x008b, B:31:0x008d, B:33:0x008f, B:34:0x00a9, B:35:0x00b4, B:36:0x00c7), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x00ad, B:11:0x0012, B:13:0x0016, B:14:0x001d, B:15:0x002c, B:17:0x0032, B:19:0x003c, B:20:0x0040, B:22:0x0046, B:24:0x0050, B:26:0x0076, B:27:0x007a, B:29:0x007e, B:30:0x008b, B:31:0x008d, B:33:0x008f, B:34:0x00a9, B:35:0x00b4, B:36:0x00c7), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x00ad, B:11:0x0012, B:13:0x0016, B:14:0x001d, B:15:0x002c, B:17:0x0032, B:19:0x003c, B:20:0x0040, B:22:0x0046, B:24:0x0050, B:26:0x0076, B:27:0x007a, B:29:0x007e, B:30:0x008b, B:31:0x008d, B:33:0x008f, B:34:0x00a9, B:35:0x00b4, B:36:0x00c7), top: B:3:0x0007 }] */
    @Override // t.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a3.InterfaceFutureC0509a release() {
        /*
            r4 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.Object r2 = r4.f5177a
            monitor-enter(r2)
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.f5187l     // Catch: java.lang.Throwable -> L1a
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L1a
            switch(r3) {
                case 0: goto Lb4;
                case 1: goto La9;
                case 2: goto L8f;
                case 3: goto L1d;
                case 4: goto L12;
                case 5: goto L12;
                case 6: goto L7a;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L1a
        L10:
            goto Lad
        L12:
            androidx.camera.camera2.internal.o r0 = r4.f5182f     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r0 = move-exception
            goto Lc8
        L1d:
            s.c r0 = r4.i     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = r0.getAllItems()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1a
        L2c:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L1a
            s.b r3 = (s.b) r3     // Catch: java.lang.Throwable -> L1a
            r1.add(r3)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L3c:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
        L40:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1a
            s.b r1 = (s.b) r1     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            goto L40
        L50:
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.f5200g     // Catch: java.lang.Throwable -> L1a
            r4.f5187l = r0     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.r r0 = r4.f5181e     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.f5187l     // Catch: java.lang.Throwable -> L1a
            r1.append(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            pa.C1124b.p(r0, r1)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.r r0 = r4.f5181e     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.r$b r0 = r0.f5293a     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.stop()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L7a
            r4.h()     // Catch: java.lang.Throwable -> L1a
            goto Lad
        L7a:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r0 = r4.f5188m     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L8b
            com.sumsub.sns.geo.presentation.d r0 = new com.sumsub.sns.geo.presentation.d     // Catch: java.lang.Throwable -> L1a
            r1 = 23
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1a
            androidx.concurrent.futures.CallbackToFutureAdapter$c r0 = androidx.concurrent.futures.CallbackToFutureAdapter.a(r0)     // Catch: java.lang.Throwable -> L1a
            r4.f5188m = r0     // Catch: java.lang.Throwable -> L1a
        L8b:
            androidx.concurrent.futures.CallbackToFutureAdapter$c r0 = r4.f5188m     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return r0
        L8f:
            androidx.camera.camera2.internal.r r0 = r4.f5181e     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.CaptureSession$State r1 = r4.f5187l     // Catch: java.lang.Throwable -> L1a
            r3.append(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            pa.C1124b.p(r0, r1)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.r r0 = r4.f5181e     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.r$b r0 = r0.f5293a     // Catch: java.lang.Throwable -> L1a
            r0.stop()     // Catch: java.lang.Throwable -> L1a
        La9:
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.f5201h     // Catch: java.lang.Throwable -> L1a
            r4.f5187l = r0     // Catch: java.lang.Throwable -> L1a
        Lad:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            a3.a r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            androidx.camera.camera2.internal.CaptureSession$State r0 = r4.f5187l     // Catch: java.lang.Throwable -> L1a
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        Lc8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release():a3.a");
    }

    public class a extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }
}

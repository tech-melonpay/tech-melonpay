package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.r;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c.RunnableC0615f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import pa.C1124b;
import t.h0;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes.dex */
public class p extends o.a implements o, r.b {

    /* renamed from: b, reason: collision with root package name */
    public final k f5279b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5280c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f5281d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f5282e;

    /* renamed from: f, reason: collision with root package name */
    public o.a f5283f;

    /* renamed from: g, reason: collision with root package name */
    public u.f f5284g;

    /* renamed from: h, reason: collision with root package name */
    public CallbackToFutureAdapter.c f5285h;
    public CallbackToFutureAdapter.a<Void> i;

    /* renamed from: j, reason: collision with root package name */
    public FutureChain f5286j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5278a = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List<DeferrableSurface> f5287k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5288l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5289m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5290n = false;

    /* compiled from: SynchronizedCaptureSessionBaseImpl.java */
    public class a implements FutureCallback<Void> {
        public a() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            o oVar;
            p pVar = p.this;
            pVar.s();
            k kVar = pVar.f5279b;
            Iterator it = kVar.a().iterator();
            while (it.hasNext() && (oVar = (o) it.next()) != pVar) {
                oVar.c();
            }
            synchronized (kVar.f5260b) {
                kVar.f5263e.remove(pVar);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    public p(k kVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f5279b = kVar;
        this.f5280c = handler;
        this.f5281d = executor;
        this.f5282e = scheduledExecutorService;
    }

    @Override // androidx.camera.camera2.internal.r.b
    public InterfaceFutureC0509a a(ArrayList arrayList) {
        synchronized (this.f5278a) {
            try {
                if (this.f5289m) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                FutureChain transformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(arrayList, false, 5000L, this.f5281d, this.f5282e)).transformAsync(new B.e(9, this, arrayList), this.f5281d);
                this.f5286j = transformAsync;
                return Futures.nonCancellationPropagating(transformAsync);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.o
    public final void abortCaptures() {
        C1124b.p(this.f5284g, "Need to call openCaptureSession before using this API.");
        this.f5284g.f30037a.f30054a.abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.o
    public final void c() {
        s();
    }

    @Override // androidx.camera.camera2.internal.o
    public void close() {
        C1124b.p(this.f5284g, "Need to call openCaptureSession before using this API.");
        k kVar = this.f5279b;
        synchronized (kVar.f5260b) {
            kVar.f5262d.add(this);
        }
        this.f5284g.f30037a.f30054a.close();
        this.f5281d.execute(new RunnableC0615f(this, 20));
    }

    @Override // androidx.camera.camera2.internal.o
    public final u.f d() {
        this.f5284g.getClass();
        return this.f5284g;
    }

    @Override // androidx.camera.camera2.internal.o
    public final CameraDevice e() {
        this.f5284g.getClass();
        return this.f5284g.a().getDevice();
    }

    @Override // androidx.camera.camera2.internal.o
    public int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C1124b.p(this.f5284g, "Need to call openCaptureSession before using this API.");
        return this.f5284g.f30037a.a(captureRequest, this.f5281d, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.r.b
    public InterfaceFutureC0509a<Void> g(CameraDevice cameraDevice, v.l lVar, List<DeferrableSurface> list) {
        synchronized (this.f5278a) {
            try {
                if (this.f5289m) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                k kVar = this.f5279b;
                synchronized (kVar.f5260b) {
                    kVar.f5263e.add(this);
                }
                CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new com.sumsub.sns.internal.core.domain.h(this, list, new u.o(cameraDevice, this.f5280c), lVar));
                this.f5285h = a10;
                Futures.addCallback(a10, new a(), CameraXExecutors.directExecutor());
                return Futures.nonCancellationPropagating(this.f5285h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.o
    public final int h(ArrayList arrayList, h hVar) {
        C1124b.p(this.f5284g, "Need to call openCaptureSession before using this API.");
        return this.f5284g.f30037a.b(arrayList, this.f5281d, hVar);
    }

    @Override // androidx.camera.camera2.internal.o
    public InterfaceFutureC0509a<Void> i() {
        return Futures.immediateFuture(null);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void j(p pVar) {
        Objects.requireNonNull(this.f5283f);
        this.f5283f.j(pVar);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void k(p pVar) {
        Objects.requireNonNull(this.f5283f);
        this.f5283f.k(pVar);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public void l(o oVar) {
        CallbackToFutureAdapter.c cVar;
        synchronized (this.f5278a) {
            try {
                if (this.f5288l) {
                    cVar = null;
                } else {
                    this.f5288l = true;
                    C1124b.p(this.f5285h, "Need to call openCaptureSession before using this API.");
                    cVar = this.f5285h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s();
        if (cVar != null) {
            cVar.f5933b.addListener(new h0(this, oVar, 0), CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void m(o oVar) {
        o oVar2;
        Objects.requireNonNull(this.f5283f);
        s();
        k kVar = this.f5279b;
        Iterator it = kVar.a().iterator();
        while (it.hasNext() && (oVar2 = (o) it.next()) != this) {
            oVar2.c();
        }
        synchronized (kVar.f5260b) {
            kVar.f5263e.remove(this);
        }
        this.f5283f.m(oVar);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public void n(p pVar) {
        o oVar;
        Objects.requireNonNull(this.f5283f);
        k kVar = this.f5279b;
        synchronized (kVar.f5260b) {
            kVar.f5261c.add(this);
            kVar.f5263e.remove(this);
        }
        Iterator it = kVar.a().iterator();
        while (it.hasNext() && (oVar = (o) it.next()) != this) {
            oVar.c();
        }
        this.f5283f.n(pVar);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void o(p pVar) {
        Objects.requireNonNull(this.f5283f);
        this.f5283f.o(pVar);
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void p(o oVar) {
        CallbackToFutureAdapter.c cVar;
        synchronized (this.f5278a) {
            try {
                if (this.f5290n) {
                    cVar = null;
                } else {
                    this.f5290n = true;
                    C1124b.p(this.f5285h, "Need to call openCaptureSession before using this API.");
                    cVar = this.f5285h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.f5933b.addListener(new h0(this, oVar, 1), CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.o.a
    public final void q(p pVar, Surface surface) {
        Objects.requireNonNull(this.f5283f);
        this.f5283f.q(pVar, surface);
    }

    public final void r(CameraCaptureSession cameraCaptureSession) {
        if (this.f5284g == null) {
            this.f5284g = new u.f(cameraCaptureSession, this.f5280c);
        }
    }

    public final void s() {
        synchronized (this.f5278a) {
            try {
                List<DeferrableSurface> list = this.f5287k;
                if (list != null) {
                    DeferrableSurfaces.decrementAll(list);
                    this.f5287k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.r.b
    public boolean stop() {
        boolean z10;
        boolean z11;
        try {
            synchronized (this.f5278a) {
                try {
                    if (!this.f5289m) {
                        FutureChain futureChain = this.f5286j;
                        r1 = futureChain != null ? futureChain : null;
                        this.f5289m = true;
                    }
                    synchronized (this.f5278a) {
                        z10 = this.f5285h != null;
                    }
                    z11 = !z10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z11;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.o
    public final void stopRepeating() {
        C1124b.p(this.f5284g, "Need to call openCaptureSession before using this API.");
        this.f5284g.f30037a.f30054a.stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.o
    public final p b() {
        return this;
    }
}

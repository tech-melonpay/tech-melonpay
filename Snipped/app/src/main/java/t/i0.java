package t;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import c.RunnableC0615f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: SynchronizedCaptureSessionImpl.java */
/* loaded from: classes.dex */
public final class i0 extends androidx.camera.camera2.internal.p {

    /* renamed from: o, reason: collision with root package name */
    public final Object f27270o;

    /* renamed from: p, reason: collision with root package name */
    public List<DeferrableSurface> f27271p;

    /* renamed from: q, reason: collision with root package name */
    public FutureChain f27272q;

    /* renamed from: r, reason: collision with root package name */
    public final x.f f27273r;

    /* renamed from: s, reason: collision with root package name */
    public final x.p f27274s;

    /* renamed from: t, reason: collision with root package name */
    public final x.e f27275t;

    public i0(Handler handler, androidx.camera.camera2.internal.k kVar, Quirks quirks, Quirks quirks2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(kVar, executor, scheduledExecutorService, handler);
        this.f27270o = new Object();
        this.f27273r = new x.f(quirks, quirks2);
        this.f27274s = new x.p(quirks);
        this.f27275t = new x.e(quirks2);
    }

    public static /* synthetic */ void t(i0 i0Var) {
        i0Var.v("Session call super.close()");
        super.close();
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.r.b
    public final InterfaceFutureC0509a a(ArrayList arrayList) {
        InterfaceFutureC0509a a10;
        synchronized (this.f27270o) {
            this.f27271p = arrayList;
            a10 = super.a(arrayList);
        }
        return a10;
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.o
    public final void close() {
        v("Session call close()");
        x.p pVar = this.f27274s;
        synchronized (pVar.f30897b) {
            try {
                if (pVar.f30896a && !pVar.f30900e) {
                    pVar.f30898c.cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Futures.nonCancellationPropagating(this.f27274s.f30898c).addListener(new RunnableC0615f(this, 21), this.f5281d);
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.o
    public final int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int f10;
        x.p pVar = this.f27274s;
        synchronized (pVar.f30897b) {
            try {
                if (pVar.f30896a) {
                    C1263o c1263o = new C1263o(Arrays.asList(pVar.f30901f, captureCallback));
                    pVar.f30900e = true;
                    captureCallback = c1263o;
                }
                f10 = super.f(captureRequest, captureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10;
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.r.b
    public final InterfaceFutureC0509a<Void> g(CameraDevice cameraDevice, v.l lVar, List<DeferrableSurface> list) {
        ArrayList arrayList;
        InterfaceFutureC0509a<Void> nonCancellationPropagating;
        synchronized (this.f27270o) {
            x.p pVar = this.f27274s;
            androidx.camera.camera2.internal.k kVar = this.f5279b;
            synchronized (kVar.f5260b) {
                arrayList = new ArrayList(kVar.f5262d);
            }
            com.sumsub.sns.geo.presentation.d dVar = new com.sumsub.sns.geo.presentation.d(this, 25);
            pVar.getClass();
            FutureChain a10 = x.p.a(cameraDevice, lVar, list, arrayList, dVar);
            this.f27272q = a10;
            nonCancellationPropagating = Futures.nonCancellationPropagating(a10);
        }
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.o
    public final InterfaceFutureC0509a<Void> i() {
        return Futures.nonCancellationPropagating(this.f27274s.f30898c);
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.o.a
    public final void l(androidx.camera.camera2.internal.o oVar) {
        synchronized (this.f27270o) {
            this.f27273r.a(this.f27271p);
        }
        v("onClosed()");
        super.l(oVar);
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.o.a
    public final void n(androidx.camera.camera2.internal.p pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.camera.camera2.internal.o oVar;
        androidx.camera.camera2.internal.o oVar2;
        v("Session onConfigured()");
        androidx.camera.camera2.internal.k kVar = this.f5279b;
        synchronized (kVar.f5260b) {
            arrayList = new ArrayList(kVar.f5263e);
        }
        synchronized (kVar.f5260b) {
            arrayList2 = new ArrayList(kVar.f5261c);
        }
        x.e eVar = this.f27275t;
        if (eVar.f30882a != null) {
            LinkedHashSet<androidx.camera.camera2.internal.o> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (oVar2 = (androidx.camera.camera2.internal.o) it.next()) != pVar) {
                linkedHashSet.add(oVar2);
            }
            for (androidx.camera.camera2.internal.o oVar3 : linkedHashSet) {
                oVar3.b().m(oVar3);
            }
        }
        super.n(pVar);
        if (eVar.f30882a != null) {
            LinkedHashSet<androidx.camera.camera2.internal.o> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext() && (oVar = (androidx.camera.camera2.internal.o) it2.next()) != pVar) {
                linkedHashSet2.add(oVar);
            }
            for (androidx.camera.camera2.internal.o oVar4 : linkedHashSet2) {
                oVar4.b().l(oVar4);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.p, androidx.camera.camera2.internal.r.b
    public final boolean stop() {
        boolean z10;
        boolean stop;
        synchronized (this.f27270o) {
            try {
                synchronized (this.f5278a) {
                    z10 = this.f5285h != null;
                }
                if (z10) {
                    this.f27273r.a(this.f27271p);
                } else {
                    FutureChain futureChain = this.f27272q;
                    if (futureChain != null) {
                        futureChain.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return stop;
    }

    public final void v(String str) {
        Logger.d("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}

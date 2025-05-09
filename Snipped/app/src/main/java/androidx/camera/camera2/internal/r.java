package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.i0;
import w.C1559g;
import w.C1561i;
import w.E;
import w.z;

/* compiled from: SynchronizedCaptureSessionOpener.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final b f5293a;

    /* compiled from: SynchronizedCaptureSessionOpener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f5294a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f5295b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f5296c;

        /* renamed from: d, reason: collision with root package name */
        public final k f5297d;

        /* renamed from: e, reason: collision with root package name */
        public final Quirks f5298e;

        /* renamed from: f, reason: collision with root package name */
        public final Quirks f5299f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f5300g;

        public a(Handler handler, k kVar, Quirks quirks, Quirks quirks2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f5294a = executor;
            this.f5295b = scheduledExecutorService;
            this.f5296c = handler;
            this.f5297d = kVar;
            this.f5298e = quirks;
            this.f5299f = quirks2;
            this.f5300g = quirks2.contains(E.class) || quirks.contains(z.class) || quirks.contains(C1561i.class) || new x.p(quirks).f30896a || ((C1559g) quirks2.get(C1559g.class)) != null;
        }

        public final r a() {
            p pVar;
            if (this.f5300g) {
                k kVar = this.f5297d;
                Executor executor = this.f5294a;
                pVar = new i0(this.f5296c, kVar, this.f5298e, this.f5299f, executor, this.f5295b);
            } else {
                pVar = new p(this.f5297d, this.f5294a, this.f5295b, this.f5296c);
            }
            return new r(pVar);
        }
    }

    /* compiled from: SynchronizedCaptureSessionOpener.java */
    public interface b {
        InterfaceFutureC0509a a(ArrayList arrayList);

        InterfaceFutureC0509a<Void> g(CameraDevice cameraDevice, v.l lVar, List<DeferrableSurface> list);

        boolean stop();
    }

    public r(p pVar) {
        this.f5293a = pVar;
    }
}

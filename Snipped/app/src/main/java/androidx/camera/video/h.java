package androidx.camera.video;

import C.AbstractC0497m;
import C.C0495k;
import android.content.Context;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoOutput;
import java.io.IOException;
import java.util.concurrent.Executor;
import pa.C1124b;
import x0.InterfaceC1579a;

/* compiled from: PendingRecording.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5605a;

    /* renamed from: b, reason: collision with root package name */
    public final Recorder f5606b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0497m f5607c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1579a<q> f5608d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f5609e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5610f = false;

    public h(Context context, Recorder recorder, C0495k c0495k) {
        this.f5605a = ContextUtil.getApplicationContext(context);
        this.f5606b = recorder;
        this.f5607c = c0495k;
    }

    public final m a(Executor executor, androidx.camera.core.internal.a aVar) {
        long j10;
        Object obj;
        int i;
        Object obj2;
        C1124b.p(executor, "Listener Executor can't be null.");
        this.f5609e = executor;
        this.f5608d = aVar;
        final Recorder recorder = this.f5606b;
        recorder.getClass();
        synchronized (recorder.f5487f) {
            try {
                j10 = recorder.f5493m + 1;
                recorder.f5493m = j10;
                obj = null;
                i = 0;
                switch (recorder.f5489h.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        Recorder.State state = recorder.f5489h;
                        Recorder.State state2 = Recorder.State.f5517d;
                        if (state == state2) {
                            C1124b.q(recorder.f5491k == null && recorder.f5492l == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            d dVar = new d(this.f5607c, this.f5609e, this.f5608d, this.f5610f, j10);
                            dVar.D(this.f5605a);
                            recorder.f5492l = dVar;
                            Recorder.State state3 = recorder.f5489h;
                            if (state3 == state2) {
                                recorder.A(Recorder.State.f5515b);
                                final int i9 = 0;
                                recorder.f5484c.execute(new Runnable() { // from class: C.s
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        Recorder.f fVar;
                                        int i10;
                                        Recorder.f fVar2;
                                        Throwable th;
                                        switch (i9) {
                                            case 0:
                                                Recorder recorder2 = recorder;
                                                synchronized (recorder2.f5487f) {
                                                    try {
                                                        int ordinal = recorder2.f5489h.ordinal();
                                                        boolean z11 = true;
                                                        z10 = false;
                                                        fVar = null;
                                                        if (ordinal == 1) {
                                                            z11 = false;
                                                        } else if (ordinal != 2) {
                                                            i10 = 0;
                                                            fVar2 = null;
                                                            th = fVar2;
                                                        }
                                                        if (recorder2.f5491k == null && !recorder2.Y) {
                                                            if (recorder2.W == VideoOutput.SourceState.f5569c) {
                                                                fVar2 = recorder2.f5492l;
                                                                recorder2.f5492l = null;
                                                                recorder2.v();
                                                                i10 = 4;
                                                                z10 = z11;
                                                                th = Recorder.f5459g0;
                                                            } else if (recorder2.f5464C != null) {
                                                                i10 = 0;
                                                                z10 = z11;
                                                                th = null;
                                                                fVar = recorder2.o(recorder2.f5489h);
                                                                fVar2 = null;
                                                            }
                                                        }
                                                        i10 = 0;
                                                        fVar2 = null;
                                                        z10 = z11;
                                                        th = fVar2;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (fVar != null) {
                                                    recorder2.E(fVar, z10);
                                                    return;
                                                } else {
                                                    if (fVar2 != null) {
                                                        recorder2.h(fVar2, i10, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                Recorder recorder3 = recorder;
                                                SurfaceRequest surfaceRequest = recorder3.f5502v;
                                                if (surfaceRequest == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                recorder3.f(surfaceRequest, recorder3.f5503w);
                                                return;
                                        }
                                    }
                                });
                            } else if (state3 == Recorder.State.i) {
                                recorder.A(Recorder.State.f5515b);
                                final int i10 = 1;
                                recorder.f5484c.execute(new Runnable() { // from class: C.s
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        Recorder.f fVar;
                                        int i102;
                                        Recorder.f fVar2;
                                        Throwable th;
                                        switch (i10) {
                                            case 0:
                                                Recorder recorder2 = recorder;
                                                synchronized (recorder2.f5487f) {
                                                    try {
                                                        int ordinal = recorder2.f5489h.ordinal();
                                                        boolean z11 = true;
                                                        z10 = false;
                                                        fVar = null;
                                                        if (ordinal == 1) {
                                                            z11 = false;
                                                        } else if (ordinal != 2) {
                                                            i102 = 0;
                                                            fVar2 = null;
                                                            th = fVar2;
                                                        }
                                                        if (recorder2.f5491k == null && !recorder2.Y) {
                                                            if (recorder2.W == VideoOutput.SourceState.f5569c) {
                                                                fVar2 = recorder2.f5492l;
                                                                recorder2.f5492l = null;
                                                                recorder2.v();
                                                                i102 = 4;
                                                                z10 = z11;
                                                                th = Recorder.f5459g0;
                                                            } else if (recorder2.f5464C != null) {
                                                                i102 = 0;
                                                                z10 = z11;
                                                                th = null;
                                                                fVar = recorder2.o(recorder2.f5489h);
                                                                fVar2 = null;
                                                            }
                                                        }
                                                        i102 = 0;
                                                        fVar2 = null;
                                                        z10 = z11;
                                                        th = fVar2;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (fVar != null) {
                                                    recorder2.E(fVar, z10);
                                                    return;
                                                } else {
                                                    if (fVar2 != null) {
                                                        recorder2.h(fVar2, i102, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                Recorder recorder3 = recorder;
                                                SurfaceRequest surfaceRequest = recorder3.f5502v;
                                                if (surfaceRequest == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                recorder3.f(surfaceRequest, recorder3.f5503w);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                recorder.A(Recorder.State.f5515b);
                            }
                            e = null;
                            break;
                        } catch (IOException e10) {
                            e = e10;
                            i = 5;
                            break;
                        }
                        break;
                    case 1:
                    case 2:
                        obj2 = recorder.f5492l;
                        obj2.getClass();
                        obj = obj2;
                        e = null;
                        break;
                    case 4:
                    case 5:
                        obj2 = recorder.f5491k;
                        obj = obj2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i == 0) {
            return new m(this.f5606b, j10, this.f5607c, false);
        }
        Logger.e("Recorder", "Recording was started when the Recorder had encountered error " + e);
        recorder.h(new d(this.f5607c, this.f5609e, this.f5608d, this.f5610f, j10), i, e);
        return new m(this.f5606b, j10, this.f5607c, true);
    }
}

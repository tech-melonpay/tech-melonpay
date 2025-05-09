package t;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t.C1257i;

/* compiled from: Camera2CapturePipeline.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData.AfState> f27336h = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    public static final Set<CameraCaptureMetaData.AwbState> i = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));

    /* renamed from: j, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData.AeState> f27337j;

    /* renamed from: k, reason: collision with root package name */
    public static final Set<CameraCaptureMetaData.AeState> f27338k;

    /* renamed from: a, reason: collision with root package name */
    public final C1257i f27339a;

    /* renamed from: b, reason: collision with root package name */
    public final x.o f27340b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27341c;

    /* renamed from: d, reason: collision with root package name */
    public final Quirks f27342d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f27343e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27344f;

    /* renamed from: g, reason: collision with root package name */
    public int f27345g = 1;

    /* compiled from: Camera2CapturePipeline.java */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final C1257i f27346a;

        /* renamed from: b, reason: collision with root package name */
        public final x.b f27347b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27348c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27349d = false;

        public a(C1257i c1257i, int i, x.b bVar) {
            this.f27346a = c1257i;
            this.f27348c = i;
            this.f27347b = bVar;
        }

        @Override // t.r.d
        public final InterfaceFutureC0509a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!r.b(totalCaptureResult, this.f27348c)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.d("Camera2CapturePipeline", "Trigger AE");
            this.f27349d = true;
            return FutureChain.from(CallbackToFutureAdapter.a(new com.sumsub.sns.geo.presentation.d(this, 20))).transform(new C.K(3), CameraXExecutors.directExecutor());
        }

        @Override // t.r.d
        public final boolean b() {
            return this.f27348c == 0;
        }

        @Override // t.r.d
        public final void c() {
            if (this.f27349d) {
                Logger.d("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f27346a.f27250g.a(false, true);
                this.f27347b.f30881b = false;
            }
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final C1257i f27350a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f27351b = false;

        public b(C1257i c1257i) {
            this.f27350a = c1257i;
        }

        @Override // t.r.d
        public final InterfaceFutureC0509a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            InterfaceFutureC0509a<Boolean> immediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return immediateFuture;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return immediateFuture;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                Logger.d("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d("Camera2CapturePipeline", "Trigger AF");
                    this.f27351b = true;
                    this.f27350a.f27250g.e(false);
                }
            }
            return immediateFuture;
        }

        @Override // t.r.d
        public final boolean b() {
            return true;
        }

        @Override // t.r.d
        public final void c() {
            if (this.f27351b) {
                Logger.d("Camera2CapturePipeline", "cancel TriggerAF");
                this.f27350a.f27250g.a(true, false);
            }
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    public static class c {
        public static final long i;

        /* renamed from: j, reason: collision with root package name */
        public static final long f27352j;

        /* renamed from: a, reason: collision with root package name */
        public final int f27353a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f27354b;

        /* renamed from: c, reason: collision with root package name */
        public final C1257i f27355c;

        /* renamed from: d, reason: collision with root package name */
        public final x.b f27356d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27357e;

        /* renamed from: f, reason: collision with root package name */
        public long f27358f = i;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayList f27359g = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        public final a f27360h = new a();

        /* compiled from: Camera2CapturePipeline.java */
        public class a implements d {
            public a() {
            }

            @Override // t.r.d
            public final InterfaceFutureC0509a<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c.this.f27359g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d) it.next()).a(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new C.K(4), CameraXExecutors.directExecutor());
            }

            @Override // t.r.d
            public final boolean b() {
                Iterator it = c.this.f27359g.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // t.r.d
            public final void c() {
                Iterator it = c.this.f27359g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i = timeUnit.toNanos(1L);
            f27352j = timeUnit.toNanos(5L);
        }

        public c(int i9, Executor executor, C1257i c1257i, boolean z10, x.b bVar) {
            this.f27353a = i9;
            this.f27354b = executor;
            this.f27355c = c1257i;
            this.f27357e = z10;
            this.f27356d = bVar;
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    public interface d {
        InterfaceFutureC0509a<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* compiled from: Camera2CapturePipeline.java */
    public static class e implements C1257i.c {

        /* renamed from: a, reason: collision with root package name */
        public CallbackToFutureAdapter.a<TotalCaptureResult> f27362a;

        /* renamed from: c, reason: collision with root package name */
        public final long f27364c;

        /* renamed from: d, reason: collision with root package name */
        public final a f27365d;

        /* renamed from: b, reason: collision with root package name */
        public final CallbackToFutureAdapter.c f27363b = CallbackToFutureAdapter.a(new com.sumsub.sns.geo.presentation.d(this, 22));

        /* renamed from: e, reason: collision with root package name */
        public volatile Long f27366e = null;

        /* compiled from: Camera2CapturePipeline.java */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j10, a aVar) {
            this.f27364c = j10;
            this.f27365d = aVar;
        }

        @Override // t.C1257i.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f27366e == null) {
                this.f27366e = l10;
            }
            Long l11 = this.f27366e;
            if (0 == this.f27364c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f27364c) {
                a aVar = this.f27365d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f27362a.b(totalCaptureResult);
                return true;
            }
            this.f27362a.b(null);
            Logger.d("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    public static class f implements d {

        /* renamed from: e, reason: collision with root package name */
        public static final long f27367e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f27368f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final C1257i f27369a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27370b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f27371c = false;

        /* renamed from: d, reason: collision with root package name */
        public final Executor f27372d;

        public f(C1257i c1257i, int i, Executor executor) {
            this.f27369a = c1257i;
            this.f27370b = i;
            this.f27372d = executor;
        }

        @Override // t.r.d
        public final InterfaceFutureC0509a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (r.b(totalCaptureResult, this.f27370b)) {
                if (!this.f27369a.f27257o) {
                    Logger.d("Camera2CapturePipeline", "Turn on torch");
                    this.f27371c = true;
                    return FutureChain.from(CallbackToFutureAdapter.a(new C1267t(this))).transformAsync(new C1267t(this), this.f27372d).transform(new C.K(5), CameraXExecutors.directExecutor());
                }
                Logger.d("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }

        @Override // t.r.d
        public final boolean b() {
            return this.f27370b == 0;
        }

        @Override // t.r.d
        public final void c() {
            if (this.f27371c) {
                this.f27369a.i.a(null, false);
                Logger.d("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.CONVERGED;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.UNKNOWN;
        Set<CameraCaptureMetaData.AeState> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        f27337j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(aeState2);
        copyOf.remove(aeState3);
        f27338k = Collections.unmodifiableSet(copyOf);
    }

    public r(C1257i c1257i, u.n nVar, Quirks quirks, Executor executor) {
        this.f27339a = c1257i;
        Integer num = (Integer) nVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f27344f = num != null && num.intValue() == 2;
        this.f27343e = executor;
        this.f27342d = quirks;
        this.f27340b = new x.o(quirks);
        this.f27341c = x.d.a(new com.sumsub.sns.geo.presentation.d(nVar, 19));
    }

    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        C1253e c1253e = new C1253e(totalCaptureResult);
        boolean z11 = c1253e.getAfMode() == CameraCaptureMetaData.AfMode.OFF || c1253e.getAfMode() == CameraCaptureMetaData.AfMode.UNKNOWN || f27336h.contains(c1253e.getAfState());
        boolean z12 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z13 = !z10 ? !(z12 || f27337j.contains(c1253e.getAeState())) : !(z12 || f27338k.contains(c1253e.getAeState()));
        boolean z14 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0 || i.contains(c1253e.getAwbState());
        Logger.d("Camera2CapturePipeline", "checkCaptureResult, AE=" + c1253e.getAeState() + " AF =" + c1253e.getAfState() + " AWB=" + c1253e.getAwbState());
        return z11 && z13 && z14;
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, int i9) {
        if (i9 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i9 == 1) {
            return true;
        }
        if (i9 == 2) {
            return false;
        }
        throw new AssertionError(i9);
    }
}

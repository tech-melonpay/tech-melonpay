package androidx.camera.video;

import C.A;
import C.AbstractC0485a;
import C.AbstractC0497m;
import C.B;
import C.C;
import C.C0486b;
import C.C0487c;
import C.C0489e;
import C.C0491g;
import C.C0492h;
import C.C0494j;
import C.C0496l;
import C.D;
import C.E;
import C.K;
import C.t;
import C.u;
import C.v;
import C.y;
import a3.InterfaceFutureC0509a;
import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder.b;
import androidx.camera.video.Recorder.c;
import androidx.camera.video.Recorder.d;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.c;
import androidx.camera.video.f;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.q;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
public final class Recorder implements VideoOutput {

    /* renamed from: c0, reason: collision with root package name */
    public static final Set<State> f5455c0 = Collections.unmodifiableSet(EnumSet.of(State.f5515b, State.f5516c));

    /* renamed from: d0, reason: collision with root package name */
    public static final Set<State> f5456d0 = Collections.unmodifiableSet(EnumSet.of(State.f5514a, State.f5517d, State.f5521h, State.f5520g, State.i));

    /* renamed from: e0, reason: collision with root package name */
    public static final r f5457e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final androidx.camera.video.c f5458f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final RuntimeException f5459g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final v f5460h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final Executor f5461i0;

    /* renamed from: A, reason: collision with root package name */
    public final MutableStateObservable<g> f5462A;

    /* renamed from: B, reason: collision with root package name */
    public AudioSource f5463B;

    /* renamed from: C, reason: collision with root package name */
    public EncoderImpl f5464C;

    /* renamed from: D, reason: collision with root package name */
    public A0.b f5465D;

    /* renamed from: E, reason: collision with root package name */
    public EncoderImpl f5466E;

    /* renamed from: F, reason: collision with root package name */
    public A0.b f5467F;

    /* renamed from: G, reason: collision with root package name */
    public AudioState f5468G;

    /* renamed from: H, reason: collision with root package name */
    public Uri f5469H;

    /* renamed from: I, reason: collision with root package name */
    public long f5470I;

    /* renamed from: J, reason: collision with root package name */
    public long f5471J;

    /* renamed from: K, reason: collision with root package name */
    public long f5472K;

    /* renamed from: L, reason: collision with root package name */
    public long f5473L;

    /* renamed from: M, reason: collision with root package name */
    public long f5474M;

    /* renamed from: N, reason: collision with root package name */
    public long f5475N;

    /* renamed from: O, reason: collision with root package name */
    public long f5476O;

    /* renamed from: P, reason: collision with root package name */
    public long f5477P;

    /* renamed from: Q, reason: collision with root package name */
    public int f5478Q;
    public Throwable R;
    public J.h S;
    public final ArrayRingBuffer T;
    public Throwable U;
    public boolean V;
    public VideoOutput.SourceState W;
    public ScheduledFuture<?> X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public VideoEncoderSession f5479Z;

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateObservable<StreamInfo> f5480a;

    /* renamed from: a0, reason: collision with root package name */
    public VideoEncoderSession f5481a0;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5482b;

    /* renamed from: b0, reason: collision with root package name */
    public double f5483b0;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5484c;

    /* renamed from: d, reason: collision with root package name */
    public final v f5485d;

    /* renamed from: e, reason: collision with root package name */
    public final v f5486e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5487f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5488g;

    /* renamed from: h, reason: collision with root package name */
    public State f5489h;
    public State i;

    /* renamed from: j, reason: collision with root package name */
    public int f5490j;

    /* renamed from: k, reason: collision with root package name */
    public f f5491k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.camera.video.d f5492l;

    /* renamed from: m, reason: collision with root package name */
    public long f5493m;

    /* renamed from: n, reason: collision with root package name */
    public f f5494n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5495o;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceRequest.TransformationInfo f5496p;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceRequest.TransformationInfo f5497q;

    /* renamed from: r, reason: collision with root package name */
    public E.e f5498r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f5499s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f5500t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f5501u;

    /* renamed from: v, reason: collision with root package name */
    public SurfaceRequest f5502v;

    /* renamed from: w, reason: collision with root package name */
    public Timebase f5503w;

    /* renamed from: x, reason: collision with root package name */
    public Surface f5504x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f5505y;

    /* renamed from: z, reason: collision with root package name */
    public MediaMuxer f5506z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AudioState {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioState f5507a;

        /* renamed from: b, reason: collision with root package name */
        public static final AudioState f5508b;

        /* renamed from: c, reason: collision with root package name */
        public static final AudioState f5509c;

        /* renamed from: d, reason: collision with root package name */
        public static final AudioState f5510d;

        /* renamed from: e, reason: collision with root package name */
        public static final AudioState f5511e;

        /* renamed from: f, reason: collision with root package name */
        public static final AudioState f5512f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AudioState[] f5513g;

        static {
            AudioState audioState = new AudioState("INITIALIZING", 0);
            f5507a = audioState;
            AudioState audioState2 = new AudioState("IDLING", 1);
            f5508b = audioState2;
            AudioState audioState3 = new AudioState("DISABLED", 2);
            f5509c = audioState3;
            AudioState audioState4 = new AudioState("ENABLED", 3);
            f5510d = audioState4;
            AudioState audioState5 = new AudioState("ERROR_ENCODER", 4);
            f5511e = audioState5;
            AudioState audioState6 = new AudioState("ERROR_SOURCE", 5);
            f5512f = audioState6;
            f5513g = new AudioState[]{audioState, audioState2, audioState3, audioState4, audioState5, audioState6};
        }

        public AudioState() {
            throw null;
        }

        public static AudioState valueOf(String str) {
            return (AudioState) Enum.valueOf(AudioState.class, str);
        }

        public static AudioState[] values() {
            return (AudioState[]) f5513g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f5514a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f5515b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f5516c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f5517d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f5518e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f5519f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f5520g;

        /* renamed from: h, reason: collision with root package name */
        public static final State f5521h;
        public static final State i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ State[] f5522j;

        static {
            State state = new State("CONFIGURING", 0);
            f5514a = state;
            State state2 = new State("PENDING_RECORDING", 1);
            f5515b = state2;
            State state3 = new State("PENDING_PAUSED", 2);
            f5516c = state3;
            State state4 = new State("IDLING", 3);
            f5517d = state4;
            State state5 = new State("RECORDING", 4);
            f5518e = state5;
            State state6 = new State("PAUSED", 5);
            f5519f = state6;
            State state7 = new State("STOPPING", 6);
            f5520g = state7;
            State state8 = new State("RESETTING", 7);
            f5521h = state8;
            State state9 = new State("ERROR", 8);
            i = state9;
            f5522j = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f5522j.clone();
        }
    }

    public class a implements FutureCallback<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioSource f5523a;

        public a(AudioSource audioSource) {
            this.f5523a = audioSource;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.d("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f5523a.hashCode())));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Void r22) {
            Logger.d("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f5523a.hashCode())));
        }
    }

    public class b implements J.j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CallbackToFutureAdapter.a f5524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f5525c;

        public b(CallbackToFutureAdapter.a aVar, f fVar) {
            this.f5524b = aVar;
            this.f5525c = fVar;
        }

        @Override // J.j
        public final void a(A0.b bVar) {
            Recorder.this.f5465D = bVar;
        }

        @Override // J.j
        public final void b(EncodeException encodeException) {
            this.f5524b.c(encodeException);
        }

        @Override // J.j
        public final void c() {
            this.f5524b.b(null);
        }

        @Override // J.j
        public final void d(J.i iVar) {
            boolean z10;
            Recorder recorder = Recorder.this;
            MediaMuxer mediaMuxer = recorder.f5506z;
            f fVar = this.f5525c;
            if (mediaMuxer != null) {
                try {
                    recorder.K(iVar, fVar);
                    iVar.close();
                    return;
                } catch (Throwable th) {
                    if (iVar != null) {
                        try {
                            iVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (recorder.f5495o) {
                Logger.d("Recorder", "Drop video data since recording is stopping.");
                iVar.close();
                return;
            }
            J.h hVar = recorder.S;
            if (hVar != null) {
                hVar.close();
                recorder.S = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!iVar.d()) {
                if (z10) {
                    Logger.d("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                Logger.d("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                EncoderImpl encoderImpl = recorder.f5464C;
                encoderImpl.getClass();
                encoderImpl.f5700h.execute(new J.l(encoderImpl, 2));
                iVar.close();
                return;
            }
            recorder.S = iVar;
            if (!recorder.l() || !recorder.T.isEmpty()) {
                Logger.d("Recorder", "Received video keyframe. Starting muxer...");
                recorder.C(fVar);
            } else if (z10) {
                Logger.d("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                Logger.d("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }
    }

    public class c implements AudioSource.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1579a f5527a;

        public c(i iVar) {
            this.f5527a = iVar;
        }
    }

    public class d implements J.j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CallbackToFutureAdapter.a f5529b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1579a f5530c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f5531d;

        public d(CallbackToFutureAdapter.a aVar, i iVar, f fVar) {
            this.f5529b = aVar;
            this.f5530c = iVar;
            this.f5531d = fVar;
        }

        @Override // J.j
        public final void a(A0.b bVar) {
            Recorder.this.f5467F = bVar;
        }

        @Override // J.j
        public final void b(EncodeException encodeException) {
            if (Recorder.this.U == null) {
                this.f5530c.accept(encodeException);
            }
        }

        @Override // J.j
        public final void c() {
            this.f5529b.b(null);
        }

        @Override // J.j
        public final void d(J.i iVar) {
            Recorder recorder = Recorder.this;
            if (recorder.f5468G == AudioState.f5509c) {
                iVar.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            MediaMuxer mediaMuxer = recorder.f5506z;
            f fVar = this.f5531d;
            if (mediaMuxer == null) {
                if (recorder.f5495o) {
                    Logger.d("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    recorder.T.enqueue(new J.g(iVar));
                    if (recorder.S != null) {
                        Logger.d("Recorder", "Received audio data. Starting muxer...");
                        recorder.C(fVar);
                    } else {
                        Logger.d("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                iVar.close();
                return;
            }
            try {
                recorder.J(iVar, fVar);
                iVar.close();
            } catch (Throwable th) {
                if (iVar != null) {
                    try {
                        iVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public class e implements FutureCallback<List<Void>> {
        public e() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Recorder recorder = Recorder.this;
            C1124b.q(recorder.f5494n != null, "In-progress recording shouldn't be null");
            if (recorder.f5494n.E()) {
                return;
            }
            Logger.d("Recorder", "Encodings end with error: " + th);
            recorder.g(recorder.f5506z == null ? 8 : 6, th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(List<Void> list) {
            Logger.d("Recorder", "Encodings end successfully.");
            Recorder recorder = Recorder.this;
            recorder.g(recorder.f5478Q, recorder.R);
        }
    }

    public static abstract class f implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public final CloseGuardHelper f5534a = CloseGuardHelper.create();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f5535b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<d> f5536c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<c> f5537d = new AtomicReference<>(null);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<InterfaceC1579a<Uri>> f5538e = new AtomicReference<>(new B(1));

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f5539f = new AtomicBoolean(false);

        public class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f5540a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f5541b;

            public a(androidx.camera.video.d dVar, Context context) {
                this.f5541b = dVar;
                this.f5540a = context;
            }

            @Override // androidx.camera.video.Recorder.f.c
            public final AudioSource a(F.a aVar, Executor executor) {
                return new AudioSource(aVar, executor, this.f5540a);
            }
        }

        public class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f5542a;

            public b(androidx.camera.video.d dVar) {
                this.f5542a = dVar;
            }

            @Override // androidx.camera.video.Recorder.f.c
            public final AudioSource a(F.a aVar, Executor executor) {
                return new AudioSource(aVar, executor, null);
            }
        }

        public interface c {
            AudioSource a(F.a aVar, Executor executor);
        }

        public interface d {
            MediaMuxer a(int i, u uVar);
        }

        public abstract long A();

        public abstract boolean C();

        public final void D(Context context) {
            if (this.f5535b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            androidx.camera.video.d dVar = (androidx.camera.video.d) this;
            final AbstractC0497m abstractC0497m = dVar.f5589g;
            boolean z10 = abstractC0497m instanceof C0494j;
            InterfaceC1579a interfaceC1579a = null;
            if (z10) {
                ((C0494j) abstractC0497m).getClass();
                throw null;
            }
            this.f5534a.open("finalizeRecording");
            this.f5536c.set(new d() { // from class: C.z
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                
                    if ((r1.exists() ? r1.isDirectory() : r1.mkdirs()) == false) goto L12;
                 */
                @Override // androidx.camera.video.Recorder.f.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final android.media.MediaMuxer a(int r4, C.u r5) {
                    /*
                        r3 = this;
                        android.net.Uri r0 = android.net.Uri.EMPTY
                        C.m r0 = C.AbstractC0497m.this
                        boolean r1 = r0 instanceof C.C0495k
                        if (r1 == 0) goto L53
                        C.k r0 = (C.C0495k) r0
                        C.k$a r0 = r0.f558b
                        java.io.File r0 = r0.d()
                        java.io.File r1 = r0.getParentFile()
                        if (r1 != 0) goto L17
                        goto L28
                    L17:
                        boolean r2 = r1.exists()
                        if (r2 == 0) goto L22
                        boolean r1 = r1.isDirectory()
                        goto L26
                    L22:
                        boolean r1 = r1.mkdirs()
                    L26:
                        if (r1 != 0) goto L3f
                    L28:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Failed to create folder for "
                        r1.<init>(r2)
                        java.lang.String r2 = r0.getAbsolutePath()
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        java.lang.String r2 = "Recorder"
                        androidx.camera.core.Logger.w(r2, r1)
                    L3f:
                        android.media.MediaMuxer r1 = new android.media.MediaMuxer
                        java.lang.String r2 = r0.getAbsolutePath()
                        r1.<init>(r2, r4)
                        android.net.Uri r4 = android.net.Uri.fromFile(r0)
                        java.lang.Object r5 = r5.f579b
                        androidx.camera.video.Recorder r5 = (androidx.camera.video.Recorder) r5
                        r5.f5469H = r4
                        return r1
                    L53:
                        boolean r4 = r0 instanceof C.C0494j
                        r5 = 0
                        if (r4 != 0) goto L78
                        boolean r4 = r0 instanceof C.C0496l
                        if (r4 == 0) goto L64
                        C.l r0 = (C.C0496l) r0
                        android.content.ContentValues r4 = new android.content.ContentValues
                        r0.getClass()
                        throw r5
                    L64:
                        java.lang.AssertionError r4 = new java.lang.AssertionError
                        java.lang.Class r5 = r0.getClass()
                        java.lang.String r5 = r5.getSimpleName()
                        java.lang.String r0 = "Invalid output options type: "
                        java.lang.String r5 = r0.concat(r5)
                        r4.<init>(r5)
                        throw r4
                    L78:
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: C.z.a(int, C.u):android.media.MediaMuxer");
                }
            });
            if (dVar.f5591j) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference<c> atomicReference = this.f5537d;
                if (i >= 31) {
                    atomicReference.set(new a(dVar, context));
                } else {
                    atomicReference.set(new b(dVar));
                }
            }
            if (abstractC0497m instanceof C0496l) {
                C0496l c0496l = (C0496l) abstractC0497m;
                interfaceC1579a = Build.VERSION.SDK_INT >= 29 ? new A(c0496l) : new A(c0496l, context);
            } else if (z10) {
                interfaceC1579a = new B(0);
            }
            if (interfaceC1579a != null) {
                this.f5538e.set(interfaceC1579a);
            }
        }

        public abstract boolean E();

        public final MediaMuxer G(int i, u uVar) {
            if (!this.f5535b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f5536c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i, uVar);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        public final void H(q qVar) {
            int i;
            String str;
            AbstractC0497m y10 = y();
            AbstractC0497m abstractC0497m = qVar.f5800a;
            if (!Objects.equals(abstractC0497m, y10)) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + abstractC0497m + ", Expected: " + y() + "]");
            }
            String concat = "Sending VideoRecordEvent ".concat(qVar.getClass().getSimpleName());
            if ((qVar instanceof q.a) && (i = ((q.a) qVar).f5802c) != 0) {
                StringBuilder s10 = v.s(concat);
                switch (i) {
                    case 0:
                        str = "ERROR_NONE";
                        break;
                    case 1:
                        str = "ERROR_UNKNOWN";
                        break;
                    case 2:
                        str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                        break;
                    case 3:
                        str = "ERROR_INSUFFICIENT_STORAGE";
                        break;
                    case 4:
                        str = "ERROR_SOURCE_INACTIVE";
                        break;
                    case 5:
                        str = "ERROR_INVALID_OUTPUT_OPTIONS";
                        break;
                    case 6:
                        str = "ERROR_ENCODING_FAILED";
                        break;
                    case 7:
                        str = "ERROR_RECORDER_ERROR";
                        break;
                    case 8:
                        str = "ERROR_NO_VALID_DATA";
                        break;
                    case 9:
                        str = "ERROR_DURATION_LIMIT_REACHED";
                        break;
                    case 10:
                        str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                        break;
                    default:
                        str = s3.b.i("Unknown(", i, ")");
                        break;
                }
                s10.append(" [error: " + str + "]");
                concat = s10.toString();
            }
            Logger.d("Recorder", concat);
            if (j() == null || p() == null) {
                return;
            }
            try {
                j().execute(new B6.d(3, this, qVar));
            } catch (RejectedExecutionException e10) {
                Logger.e("Recorder", "The callback executor is invalid.", e10);
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            d(Uri.EMPTY);
        }

        public final void d(Uri uri) {
            if (this.f5535b.get()) {
                i(this.f5538e.getAndSet(null), uri);
            }
        }

        public final void finalize() {
            try {
                this.f5534a.warnIfOpen();
                InterfaceC1579a<Uri> andSet = this.f5538e.getAndSet(null);
                if (andSet != null) {
                    i(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public final void i(InterfaceC1579a<Uri> interfaceC1579a, Uri uri) {
            if (interfaceC1579a != null) {
                this.f5534a.close();
                interfaceC1579a.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public abstract Executor j();

        public abstract InterfaceC1579a<q> p();

        public abstract AbstractC0497m y();
    }

    static {
        C0491g c0491g = C.o.f562c;
        C.r a10 = C.r.a(Arrays.asList(c0491g, C.o.f561b, C.o.f560a), new C0487c(c0491g, 1));
        f.a a11 = r.a();
        a11.d(a10);
        a11.b(-1);
        androidx.camera.video.f a12 = a11.a();
        f5457e0 = a12;
        c.a a13 = g.a();
        a13.f5588c = -1;
        a13.b(a12);
        f5458f0 = a13.a();
        f5459g0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f5460h0 = new v();
        f5461i0 = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
    }

    public Recorder(androidx.camera.video.c cVar, v vVar, v vVar2) {
        this.f5488g = H.f.f1368a.get(H.g.class) != null;
        this.f5489h = State.f5514a;
        this.i = null;
        this.f5490j = 0;
        this.f5491k = null;
        this.f5492l = null;
        this.f5493m = 0L;
        this.f5494n = null;
        this.f5495o = false;
        this.f5496p = null;
        this.f5497q = null;
        this.f5498r = null;
        this.f5499s = new ArrayList();
        this.f5500t = null;
        this.f5501u = null;
        this.f5504x = null;
        this.f5505y = null;
        this.f5506z = null;
        this.f5463B = null;
        this.f5464C = null;
        this.f5465D = null;
        this.f5466E = null;
        this.f5467F = null;
        this.f5468G = AudioState.f5507a;
        this.f5469H = Uri.EMPTY;
        this.f5470I = 0L;
        this.f5471J = 0L;
        this.f5472K = Long.MAX_VALUE;
        this.f5473L = Long.MAX_VALUE;
        this.f5474M = Long.MAX_VALUE;
        this.f5475N = Long.MAX_VALUE;
        this.f5476O = 0L;
        this.f5477P = 0L;
        this.f5478Q = 1;
        this.R = null;
        this.S = null;
        this.T = new ArrayRingBuffer(60);
        this.U = null;
        this.V = false;
        this.W = VideoOutput.SourceState.f5569c;
        this.X = null;
        this.Y = false;
        this.f5481a0 = null;
        this.f5483b0 = 0.0d;
        Executor ioExecutor = CameraXExecutors.ioExecutor();
        this.f5482b = ioExecutor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(ioExecutor);
        this.f5484c = newSequentialExecutor;
        c.a e10 = cVar.e();
        if (cVar.f5583a.b() == -1) {
            r rVar = e10.f5586a;
            if (rVar == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            f.a f10 = rVar.f();
            f10.b(f5457e0.b());
            e10.b(f10.a());
        }
        this.f5462A = MutableStateObservable.withInitialState(e10.a());
        int i = this.f5490j;
        StreamInfo.StreamState k3 = k(this.f5489h);
        androidx.camera.video.e eVar = StreamInfo.f5543a;
        this.f5480a = MutableStateObservable.withInitialState(new androidx.camera.video.e(i, k3, null));
        this.f5485d = vVar;
        this.f5486e = vVar2;
        this.f5479Z = new VideoEncoderSession(vVar, newSequentialExecutor, ioExecutor);
    }

    public static Object j(MutableStateObservable mutableStateObservable) {
        try {
            return mutableStateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static StreamInfo.StreamState k(State state) {
        return (state == State.f5518e || (state == State.f5520g && ((H.e) H.f.f1368a.get(H.e.class)) == null)) ? StreamInfo.StreamState.f5546a : StreamInfo.StreamState.f5547b;
    }

    public static boolean n(m mVar, f fVar) {
        return fVar != null && mVar.f5772c == fVar.A();
    }

    public static void p(androidx.camera.video.internal.encoder.a aVar) {
        if (aVar instanceof EncoderImpl) {
            EncoderImpl encoderImpl = (EncoderImpl) aVar;
            encoderImpl.getClass();
            encoderImpl.f5700h.execute(new J.l(encoderImpl, 3));
        }
    }

    public final void A(State state) {
        if (this.f5489h == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d("Recorder", "Transitioning Recorder internal state: " + this.f5489h + " --> " + state);
        Set<State> set = f5455c0;
        StreamInfo.StreamState streamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.f5489h)) {
                if (!f5456d0.contains(this.f5489h)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f5489h);
                }
                State state2 = this.f5489h;
                this.i = state2;
                streamState = k(state2);
            }
        } else if (this.i != null) {
            this.i = null;
        }
        this.f5489h = state;
        if (streamState == null) {
            streamState = k(state);
        }
        int i = this.f5490j;
        SurfaceRequest.TransformationInfo transformationInfo = this.f5496p;
        androidx.camera.video.e eVar = StreamInfo.f5543a;
        this.f5480a.setState(new androidx.camera.video.e(i, streamState, transformationInfo));
    }

    public final void B(int i) {
        if (this.f5490j == i) {
            return;
        }
        Logger.d("Recorder", "Transitioning streamId: " + this.f5490j + " --> " + i);
        this.f5490j = i;
        StreamInfo.StreamState k3 = k(this.f5489h);
        SurfaceRequest.TransformationInfo transformationInfo = this.f5496p;
        androidx.camera.video.e eVar = StreamInfo.f5543a;
        this.f5480a.setState(new androidx.camera.video.e(i, k3, transformationInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006d, B:39:0x008e, B:41:0x009f, B:45:0x00ac, B:53:0x00c9, B:54:0x00d3, B:56:0x00d7, B:57:0x00e1, B:70:0x00ed, B:59:0x011a, B:61:0x0130, B:62:0x0140, B:63:0x014c, B:65:0x0152, B:73:0x0110, B:79:0x00c0, B:85:0x0160), top: B:13:0x0020, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130 A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006d, B:39:0x008e, B:41:0x009f, B:45:0x00ac, B:53:0x00c9, B:54:0x00d3, B:56:0x00d7, B:57:0x00e1, B:70:0x00ed, B:59:0x011a, B:61:0x0130, B:62:0x0140, B:63:0x014c, B:65:0x0152, B:73:0x0110, B:79:0x00c0, B:85:0x0160), top: B:13:0x0020, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152 A[Catch: all -> 0x005d, LOOP:2: B:63:0x014c->B:65:0x0152, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:20:0x003f, B:25:0x0043, B:26:0x004b, B:28:0x0051, B:30:0x0060, B:34:0x006d, B:39:0x008e, B:41:0x009f, B:45:0x00ac, B:53:0x00c9, B:54:0x00d3, B:56:0x00d7, B:57:0x00e1, B:70:0x00ed, B:59:0x011a, B:61:0x0130, B:62:0x0140, B:63:0x014c, B:65:0x0152, B:73:0x0110, B:79:0x00c0, B:85:0x0160), top: B:13:0x0020, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(androidx.camera.video.Recorder.f r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.C(androidx.camera.video.Recorder$f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(androidx.camera.video.Recorder.f r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.D(androidx.camera.video.Recorder$f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(androidx.camera.video.Recorder.f r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.E(androidx.camera.video.Recorder$f, boolean):void");
    }

    public final void F(f fVar, long j10, int i, Throwable th) {
        if (this.f5494n != fVar || this.f5495o) {
            return;
        }
        this.f5495o = true;
        this.f5478Q = i;
        this.R = th;
        if (l()) {
            while (true) {
                ArrayRingBuffer arrayRingBuffer = this.T;
                if (arrayRingBuffer.isEmpty()) {
                    break;
                } else {
                    arrayRingBuffer.dequeue();
                }
            }
            this.f5466E.o(j10);
        }
        J.h hVar = this.S;
        if (hVar != null) {
            hVar.close();
            this.S = null;
        }
        if (this.W != VideoOutput.SourceState.f5568b) {
            this.X = CameraXExecutors.mainThreadExecutor().schedule(new B6.d(2, this, this.f5464C), 1000L, TimeUnit.MILLISECONDS);
        } else {
            p(this.f5464C);
        }
        this.f5464C.o(j10);
    }

    public final void G(final f fVar, boolean z10) {
        ArrayList arrayList = this.f5499s;
        if (!arrayList.isEmpty()) {
            InterfaceFutureC0509a allAsList = Futures.allAsList(arrayList);
            if (!allAsList.isDone()) {
                allAsList.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b(this) { // from class: C.x

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Recorder f586b;

            {
                this.f586b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.i] */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
                switch (i) {
                    case 0:
                        Recorder recorder = this.f586b;
                        recorder.f5464C.k(recorder.new b(aVar, fVar), recorder.f5484c);
                        return "videoEncodingFuture";
                    default:
                        final Recorder recorder2 = this.f586b;
                        recorder2.getClass();
                        ?? r12 = new InterfaceC1579a() { // from class: androidx.camera.video.i
                            @Override // x0.InterfaceC1579a
                            public final void accept(Object obj) {
                                Throwable th = (Throwable) obj;
                                Recorder recorder3 = Recorder.this;
                                if (recorder3.U == null) {
                                    if (th instanceof EncodeException) {
                                        recorder3.x(Recorder.AudioState.f5511e);
                                    } else {
                                        recorder3.x(Recorder.AudioState.f5512f);
                                    }
                                    recorder3.U = th;
                                    recorder3.H();
                                    aVar.b(null);
                                }
                            }
                        };
                        AudioSource audioSource = recorder2.f5463B;
                        Recorder.c cVar = recorder2.new c(r12);
                        audioSource.getClass();
                        Executor executor = recorder2.f5484c;
                        audioSource.f5616a.execute(new y(audioSource, executor, cVar, 2));
                        recorder2.f5466E.k(recorder2.new d(aVar, r12, fVar), executor);
                        return "audioEncodingFuture";
                }
            }
        }));
        if (l() && !z10) {
            final int i9 = 1;
            arrayList.add(CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b(this) { // from class: C.x

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recorder f586b;

                {
                    this.f586b = this;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.i] */
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
                public final Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
                    switch (i9) {
                        case 0:
                            Recorder recorder = this.f586b;
                            recorder.f5464C.k(recorder.new b(aVar, fVar), recorder.f5484c);
                            return "videoEncodingFuture";
                        default:
                            final Recorder recorder2 = this.f586b;
                            recorder2.getClass();
                            ?? r12 = new InterfaceC1579a() { // from class: androidx.camera.video.i
                                @Override // x0.InterfaceC1579a
                                public final void accept(Object obj) {
                                    Throwable th = (Throwable) obj;
                                    Recorder recorder3 = Recorder.this;
                                    if (recorder3.U == null) {
                                        if (th instanceof EncodeException) {
                                            recorder3.x(Recorder.AudioState.f5511e);
                                        } else {
                                            recorder3.x(Recorder.AudioState.f5512f);
                                        }
                                        recorder3.U = th;
                                        recorder3.H();
                                        aVar.b(null);
                                    }
                                }
                            };
                            AudioSource audioSource = recorder2.f5463B;
                            Recorder.c cVar = recorder2.new c(r12);
                            audioSource.getClass();
                            Executor executor = recorder2.f5484c;
                            audioSource.f5616a.execute(new y(audioSource, executor, cVar, 2));
                            recorder2.f5466E.k(recorder2.new d(aVar, r12, fVar), executor);
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(arrayList), new e(), CameraXExecutors.directExecutor());
    }

    public final void H() {
        f fVar = this.f5494n;
        if (fVar != null) {
            fVar.H(new q.e(fVar.y(), i()));
        }
    }

    public final void I(State state) {
        if (!f5455c0.contains(this.f5489h)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f5489h);
        }
        if (!f5456d0.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.i != state) {
            this.i = state;
            int i = this.f5490j;
            StreamInfo.StreamState k3 = k(state);
            SurfaceRequest.TransformationInfo transformationInfo = this.f5496p;
            androidx.camera.video.e eVar = StreamInfo.f5543a;
            this.f5480a.setState(new androidx.camera.video.e(i, k3, transformationInfo));
        }
    }

    public final void J(J.h hVar, f fVar) {
        long size = hVar.size() + this.f5470I;
        long j10 = this.f5476O;
        if (j10 != 0 && size > j10) {
            Logger.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f5476O)));
            q(fVar, 2, null);
            return;
        }
        long U = hVar.U();
        long j11 = this.f5473L;
        if (j11 == Long.MAX_VALUE) {
            this.f5473L = U;
            Logger.d("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(U), E.c.c(this.f5473L)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(U - Math.min(this.f5472K, j11));
            C1124b.q(this.f5475N != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(U - this.f5475N) + nanos;
            long j12 = this.f5477P;
            if (j12 != 0 && nanos2 > j12) {
                Logger.d("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f5477P)));
                q(fVar, 9, null);
                return;
            }
        }
        this.f5506z.writeSampleData(this.f5500t.intValue(), hVar.c(), hVar.w());
        this.f5470I = size;
        this.f5475N = U;
    }

    public final void K(J.h hVar, f fVar) {
        if (this.f5501u == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = hVar.size() + this.f5470I;
        long j10 = this.f5476O;
        long j11 = 0;
        if (j10 != 0 && size > j10) {
            Logger.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f5476O)));
            q(fVar, 2, null);
            return;
        }
        long U = hVar.U();
        long j12 = this.f5472K;
        if (j12 == Long.MAX_VALUE) {
            this.f5472K = U;
            Logger.d("Recorder", String.format("First video time: %d (%s)", Long.valueOf(U), E.c.c(this.f5472K)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(U - Math.min(j12, this.f5473L));
            C1124b.q(this.f5474M != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(U - this.f5474M) + nanos;
            long j13 = this.f5477P;
            if (j13 != 0 && nanos2 > j13) {
                Logger.d("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f5477P)));
                q(fVar, 9, null);
                return;
            }
            j11 = nanos;
        }
        this.f5506z.writeSampleData(this.f5501u.intValue(), hVar.c(), hVar.w());
        this.f5470I = size;
        this.f5471J = j11;
        this.f5474M = U;
        H();
    }

    @Override // androidx.camera.video.VideoOutput
    public final void a(SurfaceRequest surfaceRequest, Timebase timebase) {
        synchronized (this.f5487f) {
            try {
                Logger.d("Recorder", "Surface is requested in state: " + this.f5489h + ", Current surface: " + this.f5490j);
                if (this.f5489h == State.i) {
                    A(State.f5514a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5484c.execute(new y(this, surfaceRequest, timebase, 0));
    }

    @Override // androidx.camera.video.VideoOutput
    public final E b(CameraInfo cameraInfo) {
        K k3 = E.b.f991d;
        return new C((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable<g> c() {
        return this.f5462A;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable<StreamInfo> d() {
        return this.f5480a;
    }

    @Override // androidx.camera.video.VideoOutput
    public final void e(VideoOutput.SourceState sourceState) {
        this.f5484c.execute(new B6.d(1, this, sourceState));
    }

    public final void f(final SurfaceRequest surfaceRequest, final Timebase timebase) {
        C.o value;
        if (surfaceRequest.isServiced()) {
            Logger.w("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        t tVar = new t(this);
        Executor executor = this.f5484c;
        surfaceRequest.setTransformationInfoListener(executor, tVar);
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) surfaceRequest.getCamera().getCameraInfo();
        K k3 = E.b.f991d;
        C c2 = new C(cameraInfoInternal);
        C.a d10 = c2.d(dynamicRange);
        if (d10 == null) {
            value = C.o.f566g;
        } else {
            TreeMap<Size, C.o> treeMap = d10.f501b;
            Map.Entry<Size, C.o> ceilingEntry = treeMap.ceilingEntry(resolution);
            if (ceilingEntry != null) {
                value = ceilingEntry.getValue();
            } else {
                Map.Entry<Size, C.o> floorEntry = treeMap.floorEntry(resolution);
                value = floorEntry != null ? floorEntry.getValue() : C.o.f566g;
            }
        }
        Logger.d("Recorder", "Using supported quality of " + value + " for surface size " + resolution);
        if (value != C.o.f566g) {
            E.e c10 = c2.c(value, dynamicRange);
            this.f5498r = c10;
            if (c10 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        w().addListener(new Runnable() { // from class: androidx.camera.video.j
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
            
                if (r0.m() == false) goto L27;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 266
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.j.run():void");
            }
        }, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:27:0x00e4, B:29:0x00e8, B:30:0x00f0, B:33:0x0184, B:54:0x00fc, B:56:0x0100, B:58:0x0106, B:61:0x0111, B:63:0x011b, B:64:0x0127, B:65:0x013a, B:67:0x013e, B:69:0x0144, B:70:0x0152, B:72:0x0156, B:74:0x015c, B:77:0x0164, B:79:0x016e, B:81:0x0172, B:84:0x01ad, B:85:0x01b4), top: B:26:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:27:0x00e4, B:29:0x00e8, B:30:0x00f0, B:33:0x0184, B:54:0x00fc, B:56:0x0100, B:58:0x0106, B:61:0x0111, B:63:0x011b, B:64:0x0127, B:65:0x013a, B:67:0x013e, B:69:0x0144, B:70:0x0152, B:72:0x0156, B:74:0x015c, B:77:0x0164, B:79:0x016e, B:81:0x0172, B:84:0x01ad, B:85:0x01b4), top: B:26:0x00e4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, java.lang.Throwable r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.g(int, java.lang.Throwable):void");
    }

    public final void h(f fVar, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        fVar.d(uri);
        AbstractC0497m y10 = fVar.y();
        Throwable th2 = this.U;
        int i9 = AbstractC0485a.f536a;
        C0492h d10 = D.d(0L, 0L, new C0486b(1, 0.0d, th2));
        C1124b.p(uri, "OutputUri cannot be null.");
        new C0489e(uri);
        C1124b.m(i != 0, "An error type is required.");
        fVar.H(new q.a(y10, d10, i, th));
    }

    public final C0492h i() {
        int i;
        long j10 = this.f5471J;
        long j11 = this.f5470I;
        AudioState audioState = this.f5468G;
        int ordinal = audioState.ordinal();
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal == 4) {
                        i = 3;
                    } else if (ordinal != 5) {
                        throw new AssertionError("Invalid internal audio state: " + audioState);
                    }
                } else {
                    f fVar = this.f5494n;
                    if (fVar != null && fVar.f5539f.get()) {
                        i = 5;
                    } else if (!this.V) {
                        i = 0;
                    }
                }
                Throwable th = this.U;
                double d10 = this.f5483b0;
                int i9 = AbstractC0485a.f536a;
                return D.d(j10, j11, new C0486b(i, d10, th));
            }
        }
        i = 1;
        Throwable th2 = this.U;
        double d102 = this.f5483b0;
        int i92 = AbstractC0485a.f536a;
        return D.d(j10, j11, new C0486b(i, d102, th2));
    }

    public final boolean l() {
        return this.f5468G == AudioState.f5510d;
    }

    public final boolean m() {
        f fVar = this.f5494n;
        return fVar != null && fVar.E();
    }

    public final f o(State state) {
        boolean z10;
        if (state == State.f5516c) {
            z10 = true;
        } else {
            if (state != State.f5515b) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f5491k != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        androidx.camera.video.d dVar = this.f5492l;
        if (dVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f5491k = dVar;
        this.f5492l = null;
        if (z10) {
            A(State.f5519f);
        } else {
            A(State.f5518e);
        }
        return dVar;
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        a(surfaceRequest, Timebase.UPTIME);
    }

    public final void q(f fVar, int i, Exception exc) {
        boolean z10;
        if (fVar != this.f5494n) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f5487f) {
            try {
                z10 = false;
                switch (this.f5489h.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f5489h);
                    case 4:
                    case 5:
                        A(State.f5520g);
                        z10 = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (fVar != this.f5491k) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            F(fVar, -1L, i, exc);
        }
    }

    public final void r() {
        AudioSource audioSource = this.f5463B;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f5463B = null;
        Logger.d("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(CallbackToFutureAdapter.a(new A0.b(audioSource, 6)), new a(audioSource), CameraXExecutors.directExecutor());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f5487f) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f5489h.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        I(State.f5521h);
                        break;
                    case 4:
                    case 5:
                        C1124b.q(this.f5494n != null, "In-progress recording shouldn't be null when in state " + this.f5489h);
                        if (this.f5491k != this.f5494n) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!m()) {
                            A(State.f5521h);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                    case 6:
                        A(State.f5521h);
                        z11 = false;
                        break;
                    case 7:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            if (z12) {
                F(this.f5494n, -1L, 4, null);
            }
        } else if (z10) {
            u();
        } else {
            t();
        }
    }

    public final void t() {
        if (this.f5466E != null) {
            Logger.d("Recorder", "Releasing audio encoder.");
            this.f5466E.g();
            this.f5466E = null;
            this.f5467F = null;
        }
        if (this.f5463B != null) {
            r();
        }
        x(AudioState.f5507a);
        u();
    }

    public final void u() {
        SurfaceRequest surfaceRequest;
        boolean z10 = true;
        if (this.f5464C != null) {
            Logger.d("Recorder", "Releasing video encoder.");
            VideoEncoderSession videoEncoderSession = this.f5481a0;
            if (videoEncoderSession != null) {
                C1124b.q(videoEncoderSession.f5552d == this.f5464C, null);
                Logger.d("Recorder", "Releasing video encoder: " + this.f5464C);
                this.f5481a0.b();
                this.f5481a0 = null;
                this.f5464C = null;
                this.f5465D = null;
                z(null);
            } else {
                w();
            }
        }
        synchronized (this.f5487f) {
            try {
                switch (this.f5489h.ordinal()) {
                    case 1:
                    case 2:
                        I(State.f5514a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (m()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        A(State.f5514a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Y = false;
        if (!z10 || (surfaceRequest = this.f5502v) == null || surfaceRequest.isServiced()) {
            return;
        }
        f(this.f5502v, this.f5503w);
    }

    public final void v() {
        if (f5455c0.contains(this.f5489h)) {
            A(this.i);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f5489h);
        }
    }

    public final InterfaceFutureC0509a<Void> w() {
        Logger.d("Recorder", "Try to safely release video encoder: " + this.f5464C);
        VideoEncoderSession videoEncoderSession = this.f5479Z;
        videoEncoderSession.a();
        return Futures.nonCancellationPropagating(videoEncoderSession.f5557j);
    }

    public final void x(AudioState audioState) {
        Logger.d("Recorder", "Transitioning audio state: " + this.f5468G + " --> " + audioState);
        this.f5468G = audioState;
    }

    public final void y(SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.d("Recorder", "Update stream transformation info: " + transformationInfo);
        this.f5496p = transformationInfo;
        synchronized (this.f5487f) {
            MutableStateObservable<StreamInfo> mutableStateObservable = this.f5480a;
            int i = this.f5490j;
            StreamInfo.StreamState k3 = k(this.f5489h);
            androidx.camera.video.e eVar = StreamInfo.f5543a;
            mutableStateObservable.setState(new androidx.camera.video.e(i, k3, transformationInfo));
        }
    }

    public final void z(Surface surface) {
        int hashCode;
        if (this.f5504x == surface) {
            return;
        }
        this.f5504x = surface;
        synchronized (this.f5487f) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            B(hashCode);
        }
    }
}

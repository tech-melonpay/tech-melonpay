package androidx.camera.video.internal.encoder;

import C.y;
import H.g;
import J.i;
import J.j;
import J.k;
import J.l;
import J.m;
import J.o;
import J.s;
import J.t;
import J.u;
import J.v;
import J.x;
import a3.InterfaceFutureC0509a;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.a;
import androidx.camera.video.p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;

/* loaded from: classes.dex */
public final class EncoderImpl implements androidx.camera.video.internal.encoder.a {

    /* renamed from: D, reason: collision with root package name */
    public static final Range<Long> f5689D = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final String f5693a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5695c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f5696d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec f5697e;

    /* renamed from: f, reason: collision with root package name */
    public final a.b f5698f;

    /* renamed from: g, reason: collision with root package name */
    public final s f5699g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f5700h;
    public final InterfaceFutureC0509a<Void> i;

    /* renamed from: j, reason: collision with root package name */
    public final CallbackToFutureAdapter.a<Void> f5701j;

    /* renamed from: p, reason: collision with root package name */
    public final Timebase f5707p;

    /* renamed from: t, reason: collision with root package name */
    public InternalState f5711t;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5694b = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f5702k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f5703l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f5704m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f5705n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f5706o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public final D9.b f5708q = new D9.b();

    /* renamed from: r, reason: collision with root package name */
    public j f5709r = j.f2065a;

    /* renamed from: s, reason: collision with root package name */
    public Executor f5710s = CameraXExecutors.directExecutor();

    /* renamed from: u, reason: collision with root package name */
    public Range<Long> f5712u = f5689D;

    /* renamed from: v, reason: collision with root package name */
    public long f5713v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5714w = false;

    /* renamed from: x, reason: collision with root package name */
    public Long f5715x = null;

    /* renamed from: y, reason: collision with root package name */
    public ScheduledFuture f5716y = null;

    /* renamed from: z, reason: collision with root package name */
    public c f5717z = null;

    /* renamed from: A, reason: collision with root package name */
    public boolean f5690A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5691B = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5692C = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalState {

        /* renamed from: a, reason: collision with root package name */
        public static final InternalState f5718a;

        /* renamed from: b, reason: collision with root package name */
        public static final InternalState f5719b;

        /* renamed from: c, reason: collision with root package name */
        public static final InternalState f5720c;

        /* renamed from: d, reason: collision with root package name */
        public static final InternalState f5721d;

        /* renamed from: e, reason: collision with root package name */
        public static final InternalState f5722e;

        /* renamed from: f, reason: collision with root package name */
        public static final InternalState f5723f;

        /* renamed from: g, reason: collision with root package name */
        public static final InternalState f5724g;

        /* renamed from: h, reason: collision with root package name */
        public static final InternalState f5725h;
        public static final InternalState i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ InternalState[] f5726j;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            f5718a = internalState;
            InternalState internalState2 = new InternalState("STARTED", 1);
            f5719b = internalState2;
            InternalState internalState3 = new InternalState("PAUSED", 2);
            f5720c = internalState3;
            InternalState internalState4 = new InternalState("STOPPING", 3);
            f5721d = internalState4;
            InternalState internalState5 = new InternalState("PENDING_START", 4);
            f5722e = internalState5;
            InternalState internalState6 = new InternalState("PENDING_START_PAUSED", 5);
            f5723f = internalState6;
            InternalState internalState7 = new InternalState("PENDING_RELEASE", 6);
            f5724g = internalState7;
            InternalState internalState8 = new InternalState("ERROR", 7);
            f5725h = internalState8;
            InternalState internalState9 = new InternalState("RELEASED", 8);
            i = internalState9;
            f5726j = new InternalState[]{internalState, internalState2, internalState3, internalState4, internalState5, internalState6, internalState7, internalState8, internalState9};
        }

        public InternalState() {
            throw null;
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) f5726j.clone();
        }
    }

    public static class a {
        public static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    public class b implements a.InterfaceC0065a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f5727a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public BufferProvider.State f5728b = BufferProvider.State.f5614b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f5729c = new ArrayList();

        public b() {
        }

        @Override // androidx.camera.core.impl.Observable
        public final void addObserver(Executor executor, Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f5700h.execute(new y(this, observer, executor, 6));
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public final CallbackToFutureAdapter.c b() {
            return CallbackToFutureAdapter.a(new o(this, 1));
        }

        public final void c(boolean z10) {
            BufferProvider.State state = BufferProvider.State.f5614b;
            BufferProvider.State state2 = z10 ? BufferProvider.State.f5613a : state;
            if (this.f5728b == state2) {
                return;
            }
            this.f5728b = state2;
            if (state2 == state) {
                ArrayList arrayList = this.f5729c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceFutureC0509a) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f5727a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new B6.d(13, entry, state2));
                } catch (RejectedExecutionException e10) {
                    Logger.e(EncoderImpl.this.f5693a, "Unable to post to the supplied executor.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.Observable
        public final InterfaceFutureC0509a<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.a(new o(this, 0));
        }

        @Override // androidx.camera.core.impl.Observable
        public final void removeObserver(Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.f5700h.execute(new B6.d(14, this, observer));
        }
    }

    public class c extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final L.d f5731a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5732b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5733c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5734d = false;

        /* renamed from: e, reason: collision with root package name */
        public long f5735e = 0;

        /* renamed from: f, reason: collision with root package name */
        public long f5736f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5737g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5738h = false;
        public boolean i = false;

        public class a implements FutureCallback<Void> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f5740a;

            public a(i iVar) {
                this.f5740a = iVar;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                c cVar = c.this;
                EncoderImpl.this.f5705n.remove(this.f5740a);
                boolean z10 = th instanceof MediaCodec.CodecException;
                EncoderImpl encoderImpl = EncoderImpl.this;
                if (!z10) {
                    encoderImpl.c(0, th.getMessage(), th);
                    return;
                }
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                encoderImpl.getClass();
                encoderImpl.c(1, codecException.getMessage(), codecException);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Void r22) {
                EncoderImpl.this.f5705n.remove(this.f5740a);
            }
        }

        public c() {
            Timebase timebase = null;
            if (!EncoderImpl.this.f5695c) {
                this.f5731a = null;
                return;
            }
            if (H.f.f1368a.get(H.d.class) != null) {
                Logger.w(EncoderImpl.this.f5693a, "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                timebase = EncoderImpl.this.f5707p;
            }
            this.f5731a = new L.d(EncoderImpl.this.f5708q, timebase);
        }

        public final void a(i iVar, j jVar, Executor executor) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            encoderImpl.f5705n.add(iVar);
            Futures.addCallback(Futures.nonCancellationPropagating(iVar.f2062e), new a(iVar), encoderImpl.f5700h);
            try {
                executor.execute(new B6.d(19, jVar, iVar));
            } catch (RejectedExecutionException e10) {
                Logger.e(encoderImpl.f5693a, "Unable to post to the supplied executor.", e10);
                iVar.close();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            EncoderImpl.this.f5700h.execute(new B6.d(16, this, codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            EncoderImpl.this.f5700h.execute(new F.e(i, 1, this));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.f5700h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f
                /* JADX WARN: Removed duplicated region for block: B:101:0x0261 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0325  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x02fa A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0426  */
                /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1150
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.f.run():void");
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            EncoderImpl.this.f5700h.execute(new B6.d(17, this, mediaFormat));
        }
    }

    public class d implements a.c {

        /* renamed from: b, reason: collision with root package name */
        public Surface f5743b;

        /* renamed from: d, reason: collision with root package name */
        public a.c.InterfaceC0066a f5745d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f5746e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f5742a = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f5744c = new HashSet();

        public d() {
        }

        @Override // androidx.camera.video.internal.encoder.a.c
        public final void a(Executor executor, p pVar) {
            Surface surface;
            synchronized (this.f5742a) {
                this.f5745d = pVar;
                executor.getClass();
                this.f5746e = executor;
                surface = this.f5743b;
            }
            if (surface != null) {
                try {
                    executor.execute(new B6.d(20, pVar, surface));
                } catch (RejectedExecutionException e10) {
                    Logger.e(EncoderImpl.this.f5693a, "Unable to post to the supplied executor.", e10);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderImpl(Executor executor, k kVar) {
        s sVar;
        L.a aVar = new L.a();
        executor.getClass();
        kVar.getClass();
        this.f5700h = CameraXExecutors.newSequentialExecutor(executor);
        if (kVar instanceof J.a) {
            this.f5693a = "AudioEncoder";
            this.f5695c = false;
            this.f5698f = new b();
        } else {
            if (!(kVar instanceof v)) {
                throw new InvalidConfigException("Unknown encoder config type");
            }
            this.f5693a = "VideoEncoder";
            this.f5695c = true;
            this.f5698f = new d();
        }
        Timebase b9 = kVar.b();
        this.f5707p = b9;
        Logger.d(this.f5693a, "mInputTimebase = " + b9);
        MediaFormat a10 = kVar.a();
        this.f5696d = a10;
        Logger.d(this.f5693a, "mMediaFormat = " + a10);
        MediaCodec a11 = aVar.a(a10);
        this.f5697e = a11;
        Logger.i(this.f5693a, "Selected encoder: " + a11.getName());
        boolean z10 = this.f5695c;
        MediaCodecInfo codecInfo = a11.getCodecInfo();
        String mimeType = kVar.getMimeType();
        if (z10) {
            sVar = new J.y(codecInfo, mimeType);
        } else {
            J.b bVar = new J.b(codecInfo, mimeType);
            Objects.requireNonNull(bVar.f2084a.getAudioCapabilities());
            sVar = bVar;
        }
        this.f5699g = sVar;
        boolean z11 = this.f5695c;
        if (z11) {
            x xVar = (x) sVar;
            C1124b.q(z11, null);
            if (a10.containsKey("bitrate")) {
                int integer = a10.getInteger("bitrate");
                int intValue = xVar.b().clamp(Integer.valueOf(integer)).intValue();
                if (integer != intValue) {
                    a10.setInteger("bitrate", intValue);
                    Logger.d(this.f5693a, "updated bitrate from " + integer + " to " + intValue);
                }
            }
        }
        try {
            j();
            AtomicReference atomicReference = new AtomicReference();
            this.i = Futures.nonCancellationPropagating(CallbackToFutureAdapter.a(new J.f(atomicReference, 3)));
            CallbackToFutureAdapter.a<Void> aVar2 = (CallbackToFutureAdapter.a) atomicReference.get();
            aVar2.getClass();
            this.f5701j = aVar2;
            l(InternalState.f5718a);
        } catch (MediaCodec.CodecException e10) {
            throw new InvalidConfigException(e10);
        }
    }

    public final InterfaceFutureC0509a<t> a() {
        switch (this.f5711t.ordinal()) {
            case 0:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new J.f(atomicReference, 2));
                CallbackToFutureAdapter.a aVar = (CallbackToFutureAdapter.a) atomicReference.get();
                aVar.getClass();
                this.f5703l.offer(aVar);
                aVar.a(new B6.d(12, this, aVar), this.f5700h);
                d();
                return a10;
            case 7:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case 8:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f5711t);
        }
    }

    public final int b() {
        MediaFormat mediaFormat = this.f5696d;
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    public final void c(int i, String str, Throwable th) {
        switch (this.f5711t.ordinal()) {
            case 0:
                e(i, str, th);
                j();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                l(InternalState.f5725h);
                p(new m(this, i, str, th));
                break;
            case 7:
                Logger.w(this.f5693a, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }

    public final void d() {
        while (true) {
            ArrayDeque arrayDeque = this.f5703l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f5702k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            CallbackToFutureAdapter.a aVar = (CallbackToFutureAdapter.a) arrayDeque.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                u uVar = new u(this.f5697e, num.intValue());
                if (aVar.b(uVar)) {
                    this.f5704m.add(uVar);
                    Futures.nonCancellationPropagating(uVar.f2088d).addListener(new B6.d(11, this, uVar), this.f5700h);
                } else {
                    uVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                c(1, e10.getMessage(), e10);
                return;
            }
        }
    }

    public final void e(int i, String str, Throwable th) {
        j jVar;
        Executor executor;
        synchronized (this.f5694b) {
            jVar = this.f5709r;
            executor = this.f5710s;
        }
        try {
            executor.execute(new y(jVar, i, str, th));
        } catch (RejectedExecutionException e10) {
            Logger.e(this.f5693a, "Unable to post to the supplied executor.", e10);
        }
    }

    public final void f() {
        this.f5708q.getClass();
        this.f5700h.execute(new androidx.camera.video.internal.encoder.b(this, D9.b.H0(), 0));
    }

    public final void g() {
        this.f5700h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.c
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl encoderImpl = EncoderImpl.this;
                switch (encoderImpl.f5711t.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        encoderImpl.h();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        encoderImpl.l(EncoderImpl.InternalState.f5724g);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.f5711t);
                }
            }
        });
    }

    public final void h() {
        Surface surface;
        HashSet hashSet;
        if (this.f5690A) {
            this.f5697e.stop();
            this.f5690A = false;
        }
        this.f5697e.release();
        a.b bVar = this.f5698f;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            synchronized (dVar.f5742a) {
                surface = dVar.f5743b;
                dVar.f5743b = null;
                hashSet = new HashSet(dVar.f5744c);
                dVar.f5744c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        l(InternalState.i);
        this.f5701j.b(null);
    }

    public final void i() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f5697e.setParameters(bundle);
    }

    public final void j() {
        Surface surface;
        a.c.InterfaceC0066a interfaceC0066a;
        Executor executor;
        this.f5712u = f5689D;
        this.f5713v = 0L;
        this.f5706o.clear();
        this.f5702k.clear();
        Iterator it = this.f5703l.iterator();
        while (true) {
            surface = null;
            if (!it.hasNext()) {
                break;
            }
            CallbackToFutureAdapter.a aVar = (CallbackToFutureAdapter.a) it.next();
            aVar.f5931d = true;
            CallbackToFutureAdapter.c<T> cVar = aVar.f5929b;
            if (cVar != 0 && cVar.f5933b.cancel(true)) {
                aVar.f5928a = null;
                aVar.f5929b = null;
                aVar.f5930c = null;
            }
        }
        this.f5703l.clear();
        this.f5697e.reset();
        this.f5690A = false;
        this.f5691B = false;
        this.f5692C = false;
        this.f5714w = false;
        ScheduledFuture scheduledFuture = this.f5716y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f5716y = null;
        }
        c cVar2 = this.f5717z;
        if (cVar2 != null) {
            cVar2.i = true;
        }
        c cVar3 = new c();
        this.f5717z = cVar3;
        this.f5697e.setCallback(cVar3);
        this.f5697e.configure(this.f5696d, (Surface) null, (MediaCrypto) null, 1);
        a.b bVar = this.f5698f;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.getClass();
            g gVar = (g) H.f.f1368a.get(g.class);
            synchronized (dVar.f5742a) {
                try {
                    if (gVar == null) {
                        if (dVar.f5743b == null) {
                            surface = a.a();
                            dVar.f5743b = surface;
                        }
                        a.b(EncoderImpl.this.f5697e, dVar.f5743b);
                    } else {
                        Surface surface2 = dVar.f5743b;
                        if (surface2 != null) {
                            dVar.f5744c.add(surface2);
                        }
                        surface = EncoderImpl.this.f5697e.createInputSurface();
                        dVar.f5743b = surface;
                    }
                    interfaceC0066a = dVar.f5745d;
                    executor = dVar.f5746e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surface == null || interfaceC0066a == null || executor == null) {
                return;
            }
            try {
                executor.execute(new B6.d(20, interfaceC0066a, surface));
            } catch (RejectedExecutionException e10) {
                Logger.e(EncoderImpl.this.f5693a, "Unable to post to the supplied executor.", e10);
            }
        }
    }

    public final void k(j jVar, Executor executor) {
        synchronized (this.f5694b) {
            this.f5709r = jVar;
            this.f5710s = executor;
        }
    }

    public final void l(InternalState internalState) {
        if (this.f5711t == internalState) {
            return;
        }
        Logger.d(this.f5693a, "Transitioning encoder internal state: " + this.f5711t + " --> " + internalState);
        this.f5711t = internalState;
    }

    public final void m() {
        a.b bVar = this.f5698f;
        if (bVar instanceof b) {
            ((b) bVar).c(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f5704m.iterator();
            while (it.hasNext()) {
                arrayList.add(((t) it.next()).b());
            }
            Futures.successfulAsList(arrayList).addListener(new l(this, 1), this.f5700h);
            return;
        }
        if (bVar instanceof d) {
            try {
                this.f5697e.signalEndOfInputStream();
                this.f5692C = true;
            } catch (MediaCodec.CodecException e10) {
                c(1, e10.getMessage(), e10);
            }
        }
    }

    public final void n() {
        this.f5708q.getClass();
        this.f5700h.execute(new androidx.camera.video.internal.encoder.b(this, D9.b.H0(), 1));
    }

    public final void o(final long j10) {
        this.f5708q.getClass();
        final long H02 = D9.b.H0();
        this.f5700h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.d
            /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r9 = this;
                    androidx.camera.video.internal.encoder.EncoderImpl r0 = androidx.camera.video.internal.encoder.EncoderImpl.this
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r0.f5711t
                    int r1 = r1.ordinal()
                    switch(r1) {
                        case 0: goto Lb1;
                        case 1: goto L30;
                        case 2: goto L30;
                        case 3: goto Lb1;
                        case 4: goto L29;
                        case 5: goto L29;
                        case 6: goto L21;
                        case 7: goto Lb1;
                        case 8: goto L21;
                        default: goto Lb;
                    }
                Lb:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "Unknown state: "
                    r2.<init>(r3)
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r0 = r0.f5711t
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                L21:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Encoder is released"
                    r0.<init>(r1)
                    throw r0
                L29:
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.f5718a
                    r0.l(r1)
                    goto Lb1
                L30:
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = r0.f5711t
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.f5721d
                    r0.l(r2)
                    android.util.Range<java.lang.Long> r2 = r0.f5712u
                    java.lang.Comparable r2 = r2.getLower()
                    java.lang.Long r2 = (java.lang.Long) r2
                    long r3 = r2.longValue()
                    r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r5 == 0) goto La9
                    long r5 = r2
                    r7 = -1
                    int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    java.lang.String r8 = r0.f5693a
                    if (r7 != 0) goto L57
                    goto L60
                L57:
                    int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r7 >= 0) goto L62
                    java.lang.String r5 = "The expected stop time is less than the start time. Use current time as stop time."
                    androidx.camera.core.Logger.w(r8, r5)
                L60:
                    long r5 = r4
                L62:
                    int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r3 < 0) goto La1
                    java.lang.Long r3 = java.lang.Long.valueOf(r5)
                    android.util.Range r2 = android.util.Range.create(r2, r3)
                    r0.f5712u = r2
                    java.lang.String r2 = E.c.c(r5)
                    java.lang.String r3 = "Stop on "
                    java.lang.String r2 = r3.concat(r2)
                    androidx.camera.core.Logger.d(r8, r2)
                    androidx.camera.video.internal.encoder.EncoderImpl$InternalState r2 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.f5720c
                    if (r1 != r2) goto L89
                    java.lang.Long r1 = r0.f5715x
                    if (r1 == 0) goto L89
                    r0.m()
                    goto Lb1
                L89:
                    r1 = 1
                    r0.f5714w = r1
                    java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
                    J.l r2 = new J.l
                    r3 = 4
                    r2.<init>(r0, r3)
                    r3 = 1000(0x3e8, double:4.94E-321)
                    java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                    java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
                    r0.f5716y = r1
                    goto Lb1
                La1:
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "The start time should be before the stop time."
                    r0.<init>(r1)
                    throw r0
                La9:
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "There should be a \"start\" before \"stop\""
                    r0.<init>(r1)
                    throw r0
                Lb1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.d.run():void");
            }
        });
    }

    public final void p(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f5705n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(((i) it.next()).f2062e));
        }
        HashSet hashSet2 = this.f5704m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((t) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            Logger.d(this.f5693a, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        Futures.successfulAsList(arrayList).addListener(new e(this, arrayList, runnable, 0), this.f5700h);
    }
}

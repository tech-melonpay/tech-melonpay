package androidx.camera.video.internal.audio;

import J.t;
import a3.InterfaceFutureC0509a;
import android.content.Context;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;

/* loaded from: classes.dex */
public final class AudioSource {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5616a;

    /* renamed from: d, reason: collision with root package name */
    public final f f5619d;

    /* renamed from: e, reason: collision with root package name */
    public final g f5620e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5621f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f5624j;

    /* renamed from: k, reason: collision with root package name */
    public c f5625k;

    /* renamed from: l, reason: collision with root package name */
    public BufferProvider<? extends t> f5626l;

    /* renamed from: m, reason: collision with root package name */
    public b f5627m;

    /* renamed from: n, reason: collision with root package name */
    public a f5628n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5629o;

    /* renamed from: p, reason: collision with root package name */
    public long f5630p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5631q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5632r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f5633s;

    /* renamed from: t, reason: collision with root package name */
    public double f5634t;

    /* renamed from: v, reason: collision with root package name */
    public final int f5636v;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Boolean> f5617b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5618c = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public InternalState f5622g = InternalState.f5637a;

    /* renamed from: h, reason: collision with root package name */
    public BufferProvider.State f5623h = BufferProvider.State.f5614b;

    /* renamed from: u, reason: collision with root package name */
    public long f5635u = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalState {

        /* renamed from: a, reason: collision with root package name */
        public static final InternalState f5637a;

        /* renamed from: b, reason: collision with root package name */
        public static final InternalState f5638b;

        /* renamed from: c, reason: collision with root package name */
        public static final InternalState f5639c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InternalState[] f5640d;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            f5637a = internalState;
            InternalState internalState2 = new InternalState("STARTED", 1);
            f5638b = internalState2;
            InternalState internalState3 = new InternalState("RELEASED", 2);
            f5639c = internalState3;
            f5640d = new InternalState[]{internalState, internalState2, internalState3};
        }

        public InternalState() {
            throw null;
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) f5640d.clone();
        }
    }

    public class a implements Observable.Observer<BufferProvider.State> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BufferProvider f5641a;

        public a(BufferProvider bufferProvider) {
            this.f5641a = bufferProvider;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            AudioSource audioSource = AudioSource.this;
            if (audioSource.f5626l == this.f5641a) {
                Executor executor = audioSource.f5624j;
                c cVar = audioSource.f5625k;
                if (executor == null || cVar == null) {
                    return;
                }
                executor.execute(new B6.d(7, cVar, th));
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onNewData(BufferProvider.State state) {
            BufferProvider.State state2 = state;
            Objects.requireNonNull(state2);
            AudioSource audioSource = AudioSource.this;
            if (audioSource.f5626l == this.f5641a) {
                Logger.d("AudioSource", "Receive BufferProvider state change: " + audioSource.f5623h + " to " + state2);
                if (audioSource.f5623h != state2) {
                    audioSource.f5623h = state2;
                    audioSource.e();
                }
            }
        }
    }

    public class b implements FutureCallback<t> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BufferProvider f5643a;

        public b(BufferProvider bufferProvider) {
            this.f5643a = bufferProvider;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            AudioSource audioSource = AudioSource.this;
            if (audioSource.f5626l != this.f5643a) {
                return;
            }
            Logger.d("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th instanceof IllegalStateException) {
                return;
            }
            Executor executor = audioSource.f5624j;
            c cVar = audioSource.f5625k;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new B6.d(7, cVar, th));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(t tVar) {
            t tVar2 = tVar;
            AudioSource audioSource = AudioSource.this;
            if (!audioSource.i || audioSource.f5626l != this.f5643a) {
                tVar2.cancel();
                return;
            }
            boolean z10 = audioSource.f5629o;
            AudioStream audioStream = audioSource.f5620e;
            AudioStream audioStream2 = audioSource.f5619d;
            if (z10) {
                C1124b.q(audioSource.f5630p > 0, null);
                if (System.nanoTime() - audioSource.f5630p >= audioSource.f5621f) {
                    C1124b.q(audioSource.f5629o, null);
                    try {
                        audioStream2.start();
                        Logger.d("AudioSource", "Retry start AudioStream succeed");
                        audioStream.stop();
                        audioSource.f5629o = false;
                    } catch (AudioStream.AudioStreamException e10) {
                        Logger.w("AudioSource", "Retry start AudioStream failed", e10);
                        audioSource.f5630p = System.nanoTime();
                    }
                }
            }
            if (!audioSource.f5629o) {
                audioStream = audioStream2;
            }
            ByteBuffer c2 = tVar2.c();
            e read = audioStream.read(c2);
            int i = read.f5664a;
            if (i > 0) {
                if (audioSource.f5632r) {
                    byte[] bArr = audioSource.f5633s;
                    if (bArr == null || bArr.length < i) {
                        audioSource.f5633s = new byte[i];
                    }
                    int position = c2.position();
                    c2.put(audioSource.f5633s, 0, i);
                    c2.limit(c2.position()).position(position);
                }
                Executor executor = audioSource.f5624j;
                long j10 = read.f5665b;
                if (executor != null && j10 - audioSource.f5635u >= 200) {
                    audioSource.f5635u = j10;
                    c cVar = audioSource.f5625k;
                    if (audioSource.f5636v == 2) {
                        ShortBuffer asShortBuffer = c2.asShortBuffer();
                        double d10 = 0.0d;
                        while (asShortBuffer.hasRemaining()) {
                            d10 = Math.max(d10, Math.abs((int) asShortBuffer.get()));
                        }
                        audioSource.f5634t = d10 / 32767.0d;
                        if (executor != null && cVar != null) {
                            executor.execute(new B6.d(9, audioSource, cVar));
                        }
                    }
                }
                c2.limit(i + c2.position());
                tVar2.e(TimeUnit.NANOSECONDS.toMicros(j10));
                tVar2.d();
            } else {
                Logger.w("AudioSource", "Unable to read data from AudioStream.");
                tVar2.cancel();
            }
            BufferProvider<? extends t> bufferProvider = audioSource.f5626l;
            Objects.requireNonNull(bufferProvider);
            CallbackToFutureAdapter.c b9 = bufferProvider.b();
            b bVar = audioSource.f5627m;
            Objects.requireNonNull(bVar);
            Futures.addCallback(b9, bVar, audioSource.f5616a);
        }
    }

    public interface c {
    }

    public class d implements AudioStream.a {
        public d() {
        }
    }

    public AudioSource(F.a aVar, Executor executor, Context context) {
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.f5616a = newSequentialExecutor;
        this.f5621f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            f fVar = new f(new androidx.camera.video.internal.audio.d(aVar, context), aVar);
            this.f5619d = fVar;
            fVar.a(new d(), newSequentialExecutor);
            this.f5620e = new g(aVar);
            this.f5636v = aVar.a();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e10) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e10);
        }
    }

    public final void a() {
        Executor executor = this.f5624j;
        c cVar = this.f5625k;
        if (executor == null || cVar == null) {
            return;
        }
        boolean z10 = this.f5632r || this.f5629o || this.f5631q;
        if (Objects.equals(this.f5617b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new F.b(z10, 0, cVar));
    }

    public final void b(BufferProvider<? extends t> bufferProvider) {
        BufferProvider<? extends t> bufferProvider2 = this.f5626l;
        BufferProvider.State state = null;
        if (bufferProvider2 != null) {
            a aVar = this.f5628n;
            Objects.requireNonNull(aVar);
            bufferProvider2.removeObserver(aVar);
            this.f5626l = null;
            this.f5628n = null;
            this.f5627m = null;
            this.f5623h = BufferProvider.State.f5614b;
            e();
        }
        if (bufferProvider != null) {
            this.f5626l = bufferProvider;
            this.f5628n = new a(bufferProvider);
            this.f5627m = new b(bufferProvider);
            try {
                InterfaceFutureC0509a<? extends t> fetchData = bufferProvider.fetchData();
                if (fetchData.isDone()) {
                    state = (BufferProvider.State) fetchData.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (state != null) {
                this.f5623h = state;
                e();
            }
            this.f5626l.addObserver(this.f5616a, this.f5628n);
        }
    }

    public final void c(InternalState internalState) {
        Logger.d("AudioSource", "Transitioning internal state: " + this.f5622g + " --> " + internalState);
        this.f5622g = internalState;
    }

    public final void d() {
        if (this.i) {
            this.i = false;
            Logger.d("AudioSource", "stopSendingAudio");
            this.f5619d.stop();
        }
    }

    public final void e() {
        if (this.f5622g != InternalState.f5638b) {
            d();
            return;
        }
        boolean z10 = this.f5623h == BufferProvider.State.f5613a;
        boolean z11 = !z10;
        Executor executor = this.f5624j;
        c cVar = this.f5625k;
        if (executor != null && cVar != null && this.f5618c.getAndSet(z11) != z11) {
            executor.execute(new B2.d(cVar, z11));
        }
        if (!z10) {
            d();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            Logger.d("AudioSource", "startSendingAudio");
            this.f5619d.start();
            this.f5629o = false;
        } catch (AudioStream.AudioStreamException e10) {
            Logger.w("AudioSource", "Failed to start AudioStream", e10);
            this.f5629o = true;
            this.f5620e.start();
            this.f5630p = System.nanoTime();
            a();
        }
        this.i = true;
        BufferProvider<? extends t> bufferProvider = this.f5626l;
        Objects.requireNonNull(bufferProvider);
        CallbackToFutureAdapter.c b9 = bufferProvider.b();
        b bVar = this.f5627m;
        Objects.requireNonNull(bVar);
        Futures.addCallback(b9, bVar, this.f5616a);
    }
}

package androidx.camera.video.internal.audio;

import C.y;
import android.annotation.SuppressLint;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.internal.audio.AudioStream;
import com.google.firebase.messaging.ServiceStarter;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.C1124b;

/* compiled from: BufferedAudioStream.java */
/* loaded from: classes.dex */
public final class f implements AudioStream {

    /* renamed from: g, reason: collision with root package name */
    public final AudioStream f5672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5673h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5674j;

    /* renamed from: l, reason: collision with root package name */
    public int f5676l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5666a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5667b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5668c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final Executor f5669d = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());

    /* renamed from: e, reason: collision with root package name */
    public final Object f5670e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a f5671f = null;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f5675k = new AtomicBoolean(false);

    /* compiled from: BufferedAudioStream.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f5677a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5678b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f5679c;

        /* renamed from: d, reason: collision with root package name */
        public long f5680d;

        public a(ByteBuffer byteBuffer, AudioStream.b bVar, int i, int i9) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit != bVar.a()) {
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Byte buffer size is not match with packet info: ", limit, " != ");
                l10.append(bVar.a());
                throw new IllegalStateException(l10.toString());
            }
            this.f5677a = i;
            this.f5678b = i9;
            this.f5679c = byteBuffer;
            this.f5680d = bVar.b();
        }

        public final e a(ByteBuffer byteBuffer) {
            int remaining;
            long j10 = this.f5680d;
            ByteBuffer byteBuffer2 = this.f5679c;
            int position = byteBuffer2.position();
            int position2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f5680d += D9.b.r(this.f5678b, D9.b.z0(this.f5677a, remaining));
                ByteBuffer duplicate = byteBuffer2.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = byteBuffer2.remaining();
                byteBuffer.put(byteBuffer2).limit(position2 + remaining).position(position2);
            }
            byteBuffer2.position(position + remaining);
            return new e(remaining, j10);
        }
    }

    public f(d dVar, F.a aVar) {
        this.f5672g = dVar;
        int c2 = aVar.c();
        this.f5673h = c2;
        int e10 = aVar.e();
        this.i = e10;
        C1124b.m(((long) c2) > 0, "mBytesPerFrame must be greater than 0.");
        C1124b.m(((long) e10) > 0, "mSampleRate must be greater than 0.");
        this.f5674j = ServiceStarter.ERROR_UNKNOWN;
        this.f5676l = c2 * 1024;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(AudioStream.a aVar, Executor executor) {
        boolean z10 = true;
        C1124b.q(!this.f5666a.get(), "AudioStream can not be started when setCallback.");
        b();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C1124b.m(z10, "executor can't be null with non-null callback.");
        this.f5669d.execute(new y(this, aVar, executor, 3));
    }

    public final void b() {
        C1124b.q(!this.f5667b.get(), "AudioStream has been released.");
    }

    public final void c() {
        if (this.f5675k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f5676l);
            a aVar = new a(allocateDirect, this.f5672g.read(allocateDirect), this.f5673h, this.i);
            int i = this.f5674j;
            synchronized (this.f5670e) {
                try {
                    this.f5668c.offer(aVar);
                    while (this.f5668c.size() > i) {
                        this.f5668c.poll();
                        Logger.w("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f5675k.get()) {
                this.f5669d.execute(new F.d(this, 2));
            }
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"BanThreadSleep"})
    public final e read(ByteBuffer byteBuffer) {
        boolean z10;
        b();
        C1124b.q(this.f5666a.get(), "AudioStream has not been started.");
        this.f5669d.execute(new F.e(byteBuffer.remaining(), 0, this));
        e eVar = new e(0, 0L);
        do {
            synchronized (this.f5670e) {
                try {
                    a aVar = this.f5671f;
                    this.f5671f = null;
                    if (aVar == null) {
                        aVar = (a) this.f5668c.poll();
                    }
                    if (aVar != null) {
                        eVar = aVar.a(byteBuffer);
                        if (aVar.f5679c.remaining() > 0) {
                            this.f5671f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = eVar.f5664a <= 0 && this.f5666a.get() && !this.f5667b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    Logger.w("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                }
            }
        } while (z10);
        return eVar;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        if (this.f5667b.getAndSet(true)) {
            return;
        }
        this.f5669d.execute(new F.d(this, 3));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.f5666a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new F.d(this, 1), null);
        this.f5669d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException(e10);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        b();
        if (this.f5666a.getAndSet(false)) {
            this.f5669d.execute(new F.d(this, 0));
        }
    }
}

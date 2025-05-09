package androidx.camera.video.internal.audio;

import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.C1124b;

/* compiled from: SilentAudioStream.java */
/* loaded from: classes.dex */
public final class g implements AudioStream {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5681a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5682b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final int f5683c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5684d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5685e;

    /* renamed from: f, reason: collision with root package name */
    public long f5686f;

    /* renamed from: g, reason: collision with root package name */
    public AudioStream.a f5687g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f5688h;

    public g(F.a aVar) {
        this.f5683c = aVar.c();
        this.f5684d = aVar.e();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(AudioStream.a aVar, Executor executor) {
        boolean z10 = true;
        C1124b.q(!this.f5681a.get(), "AudioStream can not be started when setCallback.");
        b();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C1124b.m(z10, "executor can't be null with non-null callback.");
        this.f5687g = aVar;
        this.f5688h = executor;
    }

    public final void b() {
        C1124b.q(!this.f5682b.get(), "AudioStream has been released.");
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final e read(ByteBuffer byteBuffer) {
        b();
        C1124b.q(this.f5681a.get(), "AudioStream has not been started.");
        long remaining = byteBuffer.remaining();
        int i = this.f5683c;
        long z02 = D9.b.z0(i, remaining);
        long j10 = i;
        C1124b.m(j10 > 0, "bytesPerFrame must be greater than 0.");
        int i9 = (int) (j10 * z02);
        if (i9 <= 0) {
            return new e(0, this.f5686f);
        }
        long r8 = this.f5686f + D9.b.r(this.f5684d, z02);
        long nanoTime = r8 - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException e10) {
                Logger.w("SilentAudioStream", "Ignore interruption", e10);
            }
        }
        C1124b.q(i9 <= byteBuffer.remaining(), null);
        byte[] bArr = this.f5685e;
        if (bArr == null || bArr.length < i9) {
            this.f5685e = new byte[i9];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f5685e, 0, i9).limit(position + i9).position(position);
        e eVar = new e(i9, this.f5686f);
        this.f5686f = r8;
        return eVar;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        this.f5682b.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        b();
        if (this.f5681a.getAndSet(true)) {
            return;
        }
        this.f5686f = System.nanoTime();
        AudioStream.a aVar = this.f5687g;
        Executor executor = this.f5688h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new a(aVar, 1));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        b();
        this.f5681a.set(false);
    }
}

package androidx.camera.video.internal.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;

/* compiled from: AudioStreamImpl.java */
/* loaded from: classes.dex */
public final class d implements AudioStream {

    /* renamed from: a, reason: collision with root package name */
    public final AudioRecord f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final F.a f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5655c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5656d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f5657e = new AtomicReference<>(null);

    /* renamed from: f, reason: collision with root package name */
    public final int f5658f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5659g;

    /* renamed from: h, reason: collision with root package name */
    public AudioStream.a f5660h;
    public Executor i;

    /* renamed from: j, reason: collision with root package name */
    public long f5661j;

    /* renamed from: k, reason: collision with root package name */
    public a f5662k;

    /* compiled from: AudioStreamImpl.java */
    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                int a10 = G.b.a(audioRecordingConfiguration);
                d dVar = d.this;
                if (a10 == dVar.f5653a.getAudioSessionId()) {
                    dVar.c(G.d.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public d(F.a aVar, Context context) {
        int e10 = aVar.e();
        int d10 = aVar.d();
        int a10 = aVar.a();
        if (e10 > 0 && d10 > 0) {
            if (AudioRecord.getMinBufferSize(e10, d10 == 1 ? 16 : 12, a10) > 0) {
                this.f5654b = aVar;
                this.f5659g = aVar.c();
                int minBufferSize = AudioRecord.getMinBufferSize(aVar.e(), aVar.d() == 1 ? 16 : 12, aVar.a());
                C1124b.q(minBufferSize > 0, null);
                int i = minBufferSize * 2;
                this.f5658f = i;
                int i9 = Build.VERSION.SDK_INT;
                AudioFormat build = new AudioFormat.Builder().setSampleRate(aVar.e()).setChannelMask(aVar.d() == 1 ? 16 : 12).setEncoding(aVar.a()).build();
                AudioRecord.Builder b9 = G.a.b();
                if (i9 >= 31 && context != null) {
                    G.e.c(b9, context);
                }
                G.a.d(b9, aVar.b());
                G.a.c(b9, build);
                G.a.e(b9, i);
                AudioRecord a11 = G.a.a(b9);
                this.f5653a = a11;
                if (a11.getState() == 1) {
                    return;
                }
                a11.release();
                throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.e()), Integer.valueOf(aVar.d()), Integer.valueOf(aVar.a())));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(AudioStream.a aVar, Executor executor) {
        boolean z10 = true;
        C1124b.q(!this.f5656d.get(), "AudioStream can not be started when setCallback.");
        b();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C1124b.m(z10, "executor can't be null with non-null callback.");
        this.f5660h = aVar;
        this.i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            a aVar2 = this.f5662k;
            AudioRecord audioRecord = this.f5653a;
            if (aVar2 != null) {
                G.d.d(audioRecord, aVar2);
            }
            if (aVar == null) {
                return;
            }
            if (this.f5662k == null) {
                this.f5662k = new a();
            }
            G.d.c(audioRecord, executor, this.f5662k);
        }
    }

    public final void b() {
        C1124b.q(!this.f5655c.get(), "AudioStream has been released.");
    }

    public final void c(boolean z10) {
        Executor executor = this.i;
        AudioStream.a aVar = this.f5660h;
        if (executor == null || aVar == null || Objects.equals(this.f5657e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new b(z10, 2, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    @Override // androidx.camera.video.internal.audio.AudioStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.video.internal.audio.e read(java.nio.ByteBuffer r11) {
        /*
            r10 = this;
            r10.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f5656d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            pa.C1124b.q(r0, r1)
            android.media.AudioRecord r0 = r10.f5653a
            int r1 = r10.f5658f
            int r1 = r0.read(r11, r1)
            r2 = 0
            if (r1 <= 0) goto L6b
            r11.limit(r1)
            androidx.camera.core.impl.Quirks r11 = H.f.f1368a
            java.lang.Class<H.b> r4 = H.b.class
            androidx.camera.core.impl.Quirk r11 = r11.get(r4)
            r4 = -1
            if (r11 == 0) goto L2a
            goto L56
        L2a:
            android.media.AudioTimestamp r11 = new android.media.AudioTimestamp
            r11.<init>()
            r6 = 0
            int r0 = G.b.b(r0, r11, r6)
            if (r0 != 0) goto L4f
            F.a r0 = r10.f5654b
            int r0 = r0.e()
            long r6 = r10.f5661j
            long r8 = r11.framePosition
            long r6 = r6 - r8
            long r6 = D9.b.r(r0, r6)
            long r8 = r11.nanoTime
            long r8 = r8 + r6
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 >= 0) goto L4d
            goto L57
        L4d:
            r2 = r8
            goto L57
        L4f:
            java.lang.String r11 = "AudioStreamImpl"
            java.lang.String r0 = "Unable to get audio timestamp"
            androidx.camera.core.Logger.w(r11, r0)
        L56:
            r2 = r4
        L57:
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L5f
            long r2 = java.lang.System.nanoTime()
        L5f:
            long r4 = r10.f5661j
            long r6 = (long) r1
            int r11 = r10.f5659g
            long r6 = D9.b.z0(r11, r6)
            long r6 = r6 + r4
            r10.f5661j = r6
        L6b:
            androidx.camera.video.internal.audio.e r11 = new androidx.camera.video.internal.audio.e
            r11.<init>(r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.audio.d.read(java.nio.ByteBuffer):androidx.camera.video.internal.audio.e");
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        a aVar;
        if (this.f5655c.getAndSet(true)) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        AudioRecord audioRecord = this.f5653a;
        if (i >= 29 && (aVar = this.f5662k) != null) {
            G.d.d(audioRecord, aVar);
        }
        audioRecord.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.f5656d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        AudioRecord audioRecord = this.f5653a;
        audioRecord.startRecording();
        boolean z10 = false;
        if (audioRecord.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + audioRecord.getRecordingState());
        }
        this.f5661j = 0L;
        this.f5657e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a10 = G.d.a(audioRecord);
            z10 = a10 != null && G.d.b(a10);
        }
        c(z10);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        b();
        if (this.f5656d.getAndSet(false)) {
            AudioRecord audioRecord = this.f5653a;
            audioRecord.stop();
            if (audioRecord.getRecordingState() != 1) {
                Logger.w("AudioStreamImpl", "Failed to stop AudioRecord with state: " + audioRecord.getRecordingState());
            }
        }
    }
}

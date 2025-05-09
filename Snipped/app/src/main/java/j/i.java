package J;

import android.media.MediaCodec;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: EncodedDataImpl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f2059b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2060c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f2061d;

    /* renamed from: e, reason: collision with root package name */
    public final CallbackToFutureAdapter.c f2062e;

    /* renamed from: f, reason: collision with root package name */
    public final CallbackToFutureAdapter.a<Void> f2063f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2064g = new AtomicBoolean(false);

    public i(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f2058a = mediaCodec;
        this.f2060c = i;
        this.f2061d = mediaCodec.getOutputBuffer(i);
        this.f2059b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f2062e = CallbackToFutureAdapter.a(new f(atomicReference, 1));
        CallbackToFutureAdapter.a<Void> aVar = (CallbackToFutureAdapter.a) atomicReference.get();
        aVar.getClass();
        this.f2063f = aVar;
    }

    @Override // J.h
    public final long U() {
        return this.f2059b.presentationTimeUs;
    }

    @Override // J.h
    public final ByteBuffer c() {
        if (this.f2064g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f2059b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f2061d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        CallbackToFutureAdapter.a<Void> aVar = this.f2063f;
        if (this.f2064g.getAndSet(true)) {
            return;
        }
        try {
            this.f2058a.releaseOutputBuffer(this.f2060c, false);
            aVar.b(null);
        } catch (IllegalStateException e10) {
            aVar.c(e10);
        }
    }

    public final boolean d() {
        return (this.f2059b.flags & 1) != 0;
    }

    @Override // J.h
    public final long size() {
        return this.f2059b.size;
    }

    @Override // J.h
    public final MediaCodec.BufferInfo w() {
        return this.f2059b;
    }
}
